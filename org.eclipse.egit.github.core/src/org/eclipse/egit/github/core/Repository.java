/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import org.eclipse.egit.github.core.client.IGitHubConstants;
import org.eclipse.egit.github.core.util.DateUtils;

/**
 * Repository model class
 */
public class Repository implements IRepositoryIdProvider {

	/**
	 * Create SSH URL used for repository remote configs
	 * 
	 * @param repository
	 * @return URL
	 */
	public static String createRemoteSshUrl(Repository repository) {
		return createRemoteSshUrl(repository, IGitHubConstants.HOST_DEFAULT);
	}

	/**
	 * Create SSH URL used for repository remote configs
	 * 
	 * @param repository
	 * @param host
	 * @return URL
	 */
	public static String createRemoteSshUrl(Repository repository, String host) {
		return "git@" + host + ":" + repository.getOwner().getLogin() + "/"
				+ repository.getName() + IGitHubConstants.SUFFIX_GIT;
	}

	/**
	 * Create HTTPS URL used for repository remote configs
	 * 
	 * @param repository
	 * @param user
	 * @return URL
	 */
	public static String createRemoteHttpsUrl(Repository repository, String user) {
		return createRemoteHttpsUrl(repository, IGitHubConstants.HOST_DEFAULT,
				user);
	}

	/**
	 * Create HTTPS URL used for repository remote configs
	 * 
	 * @param repository
	 * @param host
	 * @param user
	 * @return URL
	 */
	public static String createRemoteHttpsUrl(Repository repository,
			String host, String user) {
		return "https://" + user + "@" + host + "/" + repository.getOwner()
				+ "/" + repository.getName() + IGitHubConstants.SUFFIX_GIT;
	}

	/**
	 * Create read-only URL used for repository remote configs
	 * 
	 * @param repository
	 * @return URL
	 */
	public static String createRemoteReadOnlyUrl(Repository repository) {
		return createRemoteReadOnlyUrl(repository,
				IGitHubConstants.HOST_DEFAULT);
	}

	/**
	 * Create read-only URL used for repository remote configs
	 * 
	 * @param repository
	 * @param host
	 * @return URL
	 */
	public static String createRemoteReadOnlyUrl(Repository repository,
			String host) {
		return "git://" + host + "/" + repository.getOwner() + "/"
				+ repository.getName() + IGitHubConstants.SUFFIX_GIT;
	}

	private boolean fork;

	private boolean hasDownloads;

	private boolean hasIssues;

	private boolean hasWiki;

	@SerializedName("private")
	private boolean isPrivate;

	private Date createdAt;

	private Date pushedAt;

	private int forks;

	private int openIssues;

	private int size;

	private int watchers;

	private Repository parent;

	private Repository source;

	private String cloneUrl;

	private String description;

	private String gitUrl;

	private String htmlUrl;

	private String language;

	private String masterBranch;

	private String name;

	private String sshUrl;

	private String svnUrl;

	private String url;

	private User owner;

	/**
	 * @return fork
	 */
	public boolean isFork() {
		return fork;
	}

	/**
	 * @param fork
	 * @return this repository
	 */
	public Repository setFork(boolean fork) {
		this.fork = fork;
		return this;
	}

	/**
	 * @return hasDownloads
	 */
	public boolean isHasDownloads() {
		return hasDownloads;
	}

	/**
	 * @param hasDownloads
	 * @return this repository
	 */
	public Repository setHasDownloads(boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
		return this;
	}

	/**
	 * @return hasIssues
	 */
	public boolean isHasIssues() {
		return hasIssues;
	}

	/**
	 * @param hasIssues
	 * @return this repository
	 */
	public Repository setHasIssues(boolean hasIssues) {
		this.hasIssues = hasIssues;
		return this;
	}

	/**
	 * @return hasWiki
	 */
	public boolean isHasWiki() {
		return hasWiki;
	}

	/**
	 * @param hasWiki
	 * @return this repository
	 */
	public Repository setHasWiki(boolean hasWiki) {
		this.hasWiki = hasWiki;
		return this;
	}

	/**
	 * @return isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}

	/**
	 * @param isPrivate
	 * @return this repository
	 */
	public Repository setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
		return this;
	}

	/**
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return DateUtils.clone(createdAt);
	}

	/**
	 * @param createdAt
	 * @return this rdateepository
	 */
	public Repository setCreatedAt(Date createdAt) {
		this.createdAt = DateUtils.clone(createdAt);
		return this;
	}

	/**
	 * @return pushedAt
	 */
	public Date getPushedAt() {
		return DateUtils.clone(pushedAt);
	}

	/**
	 * @param pushedAt
	 * @return this repository
	 */
	public Repository setPushedAt(Date pushedAt) {
		this.pushedAt = DateUtils.clone(pushedAt);
		return this;
	}

	/**
	 * @return forks
	 */
	public int getForks() {
		return forks;
	}

	/**
	 * @param forks
	 * @return this repository
	 */
	public Repository setForks(int forks) {
		this.forks = forks;
		return this;
	}

	/**
	 * @return openIssues
	 */
	public int getOpenIssues() {
		return openIssues;
	}

	/**
	 * @param openIssues
	 * @return this repository
	 */
	public Repository setOpenIssues(int openIssues) {
		this.openIssues = openIssues;
		return this;
	}

	/**
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 * @return this repository
	 */
	public Repository setSize(int size) {
		this.size = size;
		return this;
	}

	/**
	 * @return watchers
	 */
	public int getWatchers() {
		return watchers;
	}

	/**
	 * @param watchers
	 * @return this repository
	 */
	public Repository setWatchers(int watchers) {
		this.watchers = watchers;
		return this;
	}

	/**
	 * @return parent
	 */
	public Repository getParent() {
		return parent;
	}

	/**
	 * @param parent
	 * @return this repository
	 */
	public Repository setParent(Repository parent) {
		this.parent = parent;
		return this;
	}

	/**
	 * @return source
	 */
	public Repository getSource() {
		return source;
	}

	/**
	 * @param source
	 * @return this repository
	 */
	public Repository setSource(Repository source) {
		this.source = source;
		return this;
	}

	/**
	 * @return cloneUrl
	 */
	public String getCloneUrl() {
		return cloneUrl;
	}

	/**
	 * @param cloneUrl
	 * @return this repository
	 */
	public Repository setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
		return this;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 * @return this repository
	 */
	public Repository setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * @return gitUrl
	 */
	public String getGitUrl() {
		return gitUrl;
	}

	/**
	 * @param gitUrl
	 * @return this repository
	 */
	public Repository setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
		return this;
	}

	/**
	 * @return htmlUrl
	 */
	public String getHtmlUrl() {
		return htmlUrl;
	}

	/**
	 * @param htmlUrl
	 * @return this repository
	 */
	public Repository setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	/**
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 * @return this repository
	 */
	public Repository setLanguage(String language) {
		this.language = language;
		return this;
	}

	/**
	 * @return masterBranch
	 */
	public String getMasterBranch() {
		return masterBranch;
	}

	/**
	 * @param masterBranch
	 * @return this repository
	 */
	public Repository setMasterBranch(String masterBranch) {
		this.masterBranch = masterBranch;
		return this;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return this repository
	 */
	public Repository setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return sshUrl
	 */
	public String getSshUrl() {
		return sshUrl;
	}

	/**
	 * @param sshUrl
	 * @return this repository
	 */
	public Repository setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
		return this;
	}

	/**
	 * @return svnUrl
	 */
	public String getSvnUrl() {
		return svnUrl;
	}

	/**
	 * @param svnUrl
	 * @return this repository
	 */
	public Repository setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this repository
	 */
	public Repository setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return owner
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 * @return this repository
	 */
	public Repository setOwner(User owner) {
		this.owner = owner;
		return this;
	}

	/**
	 * Generate id for this repository
	 * 
	 * @see IRepositoryIdProvider#generateId()
	 */
	public String generateId() {
		final User owner = this.owner;
		final String name = this.name;
		if (owner == null || name == null || name.length() == 0)
			return null;
		final String login = owner.getLogin();
		if (login == null || login.length() == 0)
			return null;
		return login + "/" + name;
	}
}
