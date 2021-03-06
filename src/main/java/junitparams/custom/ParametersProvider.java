package junitparams.custom;

import org.junit.runners.model.FrameworkMethod;

import java.lang.annotation.Annotation;

/**
 * An interface for custom parameters providers. To be used with {@link CustomParameters} annotation.
 * Must have a default no-args constructor.
 *
 * @param <A> type of annotation mentioning this provider
 */
public interface ParametersProvider<A extends Annotation> {

    /**
     * Initializes this provider - you can read your custom annotation config here.
     *
     * @param parametersAnnotation parameters annotation on test method
     * @param frameworkMethod test method
     */
    void initialize(A parametersAnnotation, FrameworkMethod frameworkMethod);

    /**
     * Actual parameters generation
     *
     * @return parameters for test method calls
     */
    Object[] getParameters();
}
