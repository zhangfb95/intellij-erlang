/*
 * Copyright 2011-2011 Gregory Shrago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.erlang;

import com.intellij.openapi.util.IconLoader;
import com.intellij.util.PlatformIcons;

import javax.swing.*;

/**
 * @author ignatov
 */
public interface ErlangIcons {
  Icon FILE = IconLoader.getIcon("/icons/erlang-16-7-2.png");

  Icon RULE = PlatformIcons.METHOD_ICON;
  Icon EXTERNAL_RULE = PlatformIcons.ABSTRACT_METHOD_ICON;
  Icon ATTRIBUTE = PlatformIcons.FIELD_ICON;

  Icon RELATED_METHOD = IconLoader.getIcon("/gutter/implementedMethod.png");
}
