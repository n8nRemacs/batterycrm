package org.mockito.internal.invocation;

import java.lang.reflect.Method;

/* compiled from: TypeSafeMatching.java */
/* loaded from: classes7.dex */
public class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f421676a = new q();

    @Override // org.mockito.internal.invocation.b
    public final boolean a(org.mockito.d dVar, Object obj) throws SecurityException {
        boolean zIsInstance;
        if (obj != null) {
            for (Method method : dVar.getClass().getMethods()) {
                if ((method.getParameterTypes().length == 1 && !method.isBridge()) ? "matches".equals(method.getName()) : false) {
                    zIsInstance = method.getParameterTypes()[0].isInstance(obj);
                }
            }
            throw new NoSuchMethodError("Method 'matches(T)' not found in ArgumentMatcher: " + dVar + " !\r\n Please file a bug with this stack trace at: https://github.com/mockito/mockito/issues/new ");
        }
        zIsInstance = true;
        return zIsInstance && dVar.b(obj);
    }
}
