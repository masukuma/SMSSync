/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package org.addhen.smssync.domain;

import org.addhen.smssync.BaseRobolectricTestCase;
import org.addhen.smssync.domain.entity.HttpNameValuePair;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
public class HttpNameValuePairTest extends BaseRobolectricTestCase {

    private HttpNameValuePair mHttpNameValuePair;

    @Before
    public void setUp() {
        mHttpNameValuePair = DomainEntityFixture.getHttpNameValuePair();
    }

    @Test
    public void shouldSetFilterEntity() {
        assertThat(mHttpNameValuePair).isNotNull();
        assertThat(mHttpNameValuePair.getName()).isEqualTo(
                DomainEntityFixture.getHttpNameValuePair().getName());
        assertThat(mHttpNameValuePair.getValue())
                .isEqualTo(DomainEntityFixture.getHttpNameValuePair().getValue());
    }
}
