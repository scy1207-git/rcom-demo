package com.tester.testng.retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


import com.tester.testng.retry.Retry;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
/**
 * Created by leosong on 15-12-15.
 */
public class RetryListener implements IAnnotationTransformer{

    @Override
    public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod)
    {
        IRetryAnalyzer retry = testannotation.getRetryAnalyzer();
        if (retry == null)
        {
            testannotation.setRetryAnalyzer(Retry.class);
        }

    }
}
