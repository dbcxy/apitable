/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.apitable.interfaces.notification;

import com.apitable.interfaces.notification.facade.DefaultMailFacadeImpl;
import com.apitable.interfaces.notification.facade.MailFacade;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Notification Context Config.
 *
 * @author Chambers
 */
@Configuration(proxyBeanMethods = false)
public class NotificationContextConfig {

  /**
   * Inject Default Mail Facade.
   *
   * @return MailFacade
   */
  @Bean
  @ConditionalOnMissingBean
  public MailFacade defaultMailFacadeImpl() {
    return new DefaultMailFacadeImpl();
  }
}
