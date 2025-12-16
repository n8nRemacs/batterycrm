package hu.akarnokd.rxjava3.debug;

import java.util.HashSet;

/* loaded from: classes8.dex */
public final class RxJavaAssemblyException extends RuntimeException {
    private static final long serialVersionUID = -6757520270386306081L;

    /* renamed from: b, reason: collision with root package name */
    public final String f397810b;

    public RxJavaAssemblyException() {
        StringBuilder sb2 = new StringBuilder("RxJavaAssemblyException: assembled");
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getLineNumber() != 1) {
                String className = stackTraceElement.getClassName();
                if (!className.contains("java.lang.Thread") && !className.contains("junit.runner") && !className.contains("org.junit.internal") && !className.contains("junit4.runner") && !className.contains("java.lang.reflect") && !className.contains("sun.reflect") && !className.contains(".RxJavaAssemblyException") && !className.contains("OnAssembly") && !className.contains("RxJavaAssemblyTracking") && !className.contains("RxJavaPlugins")) {
                    sb2.append(System.lineSeparator());
                    sb2.append("\tat ");
                    sb2.append(stackTraceElement);
                }
            }
        }
        this.f397810b = sb2.toString();
    }

    public final void a(Throwable th2) {
        HashSet hashSet = new HashSet();
        while (th2.getCause() != null) {
            if (!hashSet.add(th2)) {
                return;
            } else {
                th2 = th2.getCause();
            }
        }
        try {
            th2.initCause(this);
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f397810b;
    }
}
