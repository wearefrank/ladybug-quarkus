/*
   Copyright 2022 WeAreFrank!

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.wearefrank;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;

import nl.nn.testtool.filter.View;
import nl.nn.testtool.filter.Views;
import nl.nn.testtool.storage.LogStorage;

/**
 * Demonstrate optional customization of default Ladybug {@link nl.nn.testtool.Config}
 * 
 * @author Jaco de Groot
 */
@Singleton
public class Config {
	@Inject
	LogStorage debugStorage;

	@Produces
	Views views(View view) {
		view.setName("Custom view name");
		view.setStorage(debugStorage);
		List<View> list = new ArrayList<View>();
		list.add(view);
		Views views = new Views();
		views.setViews(list);
		return views;
	}

}
