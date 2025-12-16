package org.mockito.internal.exceptions.stacktrace;

/* compiled from: DefaultStackTraceCleaner.java */
/* loaded from: classes7.dex */
public class b implements F71.a {
    @Override // F71.a
    public final boolean a(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        if (className.startsWith("org.mockito.internal.runners.") || className.startsWith("org.mockito.runners.") || className.startsWith("org.mockito.junit.") || stackTraceElement.getClassName().startsWith("org.mockito.internal.junit.JUnitRule")) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        return (className2.contains("$$EnhancerByMockitoWithCGLIB$$") || className2.contains("$MockitoMock$") || stackTraceElement.getClassName().startsWith("org.mockito.")) ? false : true;
    }
}
