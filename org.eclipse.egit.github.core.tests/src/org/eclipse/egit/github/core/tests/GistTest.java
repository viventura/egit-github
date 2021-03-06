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

import static org.junit.Assert.assertTrue;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.eclipse.egit.github.core.Gist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit tests for {@link Gist}
 */
@RunWith(MockitoJUnitRunner.class)
public class GistTest {

	private static final Gson gson = new GsonBuilder().setDateFormat(
			"yyyy-MM-dd").create();

	@Test
	public void getCreatedAt_ReferenceMutableObject() {
		Gist gist = gson.fromJson("{createdAt : '2003-10-10'}", Gist.class);
		gist.getCreatedAt().setTime(0);
		assertTrue(gist.getCreatedAt().getTime() != 0);
	}

	@Test
	public void getUpdatedAt_ReferenceMutableObject() {
		Gist gist = gson.fromJson("{updatedAt : '2003-10-10'}", Gist.class);
		gist.getUpdatedAt().setTime(0);
		assertTrue(gist.getUpdatedAt().getTime() != 0);
	}

}
