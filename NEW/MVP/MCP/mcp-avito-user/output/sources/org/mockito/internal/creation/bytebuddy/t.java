package org.mockito.internal.creation.bytebuddy;

import java.util.function.Predicate;

/* compiled from: StackTraceChecker.java */
/* loaded from: classes7.dex */
class t implements Predicate<Class<?>> {
    @Override // java.util.function.Predicate
    public final boolean test(Class<?> cls) {
        Class<?> cls2 = cls;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i12 = 1;
        while (true) {
            if (i12 >= stackTrace.length - 1) {
                break;
            }
            if (!stackTrace[i12].getClassName().startsWith("org.mockito.internal.")) {
                int i13 = i12 + 1;
                if (stackTrace[i13].getMethodName().startsWith("<init>")) {
                    try {
                        if (!stackTrace[i13].getClassName().equals(cls2.getName())) {
                            if (cls2.isAssignableFrom(Class.forName(stackTrace[i13].getClassName(), false, cls2.getClassLoader()))) {
                                return true;
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
            }
            i12++;
        }
        return false;
    }
}
