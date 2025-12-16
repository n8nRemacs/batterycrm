package kotlin.reflect.jvm.internal.impl.utils;

import Y61.k;
import kotlin.jvm.internal.L;

/* compiled from: exceptionUtils.kt */
/* loaded from: classes8.dex */
public final class d {
    public static final boolean a(@k Throwable th2) {
        Class<?> superclass = th2.getClass();
        while (!L.f(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }
}
