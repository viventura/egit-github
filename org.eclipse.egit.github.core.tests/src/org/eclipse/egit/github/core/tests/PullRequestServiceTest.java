/*******************************************************************************
 *  Copyright (c) 2011 Christian Trutz
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Christian Trutz - initial API and implementation
 *******************************************************************************/
package org.eclipse.egit.github.core.tests;

import static org.mockito.Mockito.when;

import java.io.IOException;

import org.eclipse.egit.github.core.SearchRepository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.PullRequestService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Tests for {@link PullRequestService}
 */
@RunWith(MockitoJUnitRunner.class)
public class PullRequestServiceTest {

	@Mock
	private GitHubClient gitHubClient;

	@Mock
	private SearchRepository repository;

	private PullRequestService pullRequestService;

	@Before
	public void before() {
		pullRequestService = new PullRequestService(gitHubClient);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructor_NullArgument() {
		new PullRequestService(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getPullRequest_NullRepository() throws IOException {
		pullRequestService.getPullRequest(null, 3);
	}

	@Test
	@Ignore
	public void getPullRequest_OK() throws IOException {
		// the OK unit test is not possible with Mockito, but with JMockit
	}

	@Test(expected = IllegalArgumentException.class)
	public void getPullRequests_NullRepository() throws IOException {
		pullRequestService.getPullRequests(null, "not null");
	}

	@Test(expected = IllegalArgumentException.class)
	public void getPullRequests_NullState() throws IOException {
		pullRequestService.getPullRequests(repository, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getPullRequests_NullRepositoryId() throws IOException {
		when(repository.getId()).thenReturn(null);
		pullRequestService.getPullRequests(repository, "test_state");
	}

	@Test
	@Ignore
	public void getPullRequests_OK() throws IOException {
		// the OK unit test is not possible with Mockito, but with JMockit
	}
}
