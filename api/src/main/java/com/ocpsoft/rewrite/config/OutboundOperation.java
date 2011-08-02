/*
 * Copyright 2011 <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ocpsoft.rewrite.config;

import com.ocpsoft.rewrite.event.OutboundRewrite;
import com.ocpsoft.rewrite.event.Rewrite;

/**
 * An operation that is only performed if the current {@link Rewrite} event is an {@link OutboundRewrite} event.
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public abstract class OutboundOperation extends OperationBuilder
{

   @Override
   public final void perform(final Rewrite event)
   {
      if (event instanceof OutboundRewrite)
      {
         performOutbound((OutboundRewrite) event);
      }
   }

   /**
    * Perform the operation.
    */
   public abstract void performOutbound(OutboundRewrite event);

}
