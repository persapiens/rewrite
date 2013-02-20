package org.ocpsoft.rewrite.param;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.ocpsoft.rewrite.bind.Binding;
import org.ocpsoft.rewrite.context.EvaluationContext;
import org.ocpsoft.rewrite.event.Rewrite;

/**
 * 
 * A {@link Parameterized} regular expression {@link Pattern}.
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public interface ParameterizedPatternBuilder extends ParameterizedPattern
{
   /**
    * Return the {@link ParameterizedPatternParser} corresponding to the pattern with which this
    * {@link ParameterizedPatternBuilder} was constructed.
    */
   ParameterizedPatternParser getParser();

   /**
    * Use this expression to build a {@link String} from the given pattern. Extract needed values from registered
    * {@link Binding} instances and applies the supplied {@link Transform} for them.
    */
   String build(Rewrite event, EvaluationContext context, Transform<String> transform);

   /**
    * Use this expression to build a {@link String} from given values.
    */
   String build(Map<String, Object> parameters);

   /**
    * Use this expression's pattern to build a {@link String} from the given values. Enforces that the number of values
    * passed must equal the number of expression parameters. Does not apply any configured {@link Transform} instances.
    */
   String build(List<Object> values);
}
