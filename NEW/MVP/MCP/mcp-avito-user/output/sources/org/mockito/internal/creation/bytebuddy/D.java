package org.mockito.internal.creation.bytebuddy;

import java.lang.reflect.Method;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: TypeSupport.java */
/* loaded from: classes7.dex */
class D {

    /* renamed from: b, reason: collision with root package name */
    public static final D f421525b;

    /* renamed from: a, reason: collision with root package name */
    public final Method f421526a;

    static {
        Method method;
        try {
            method = Class.class.getMethod("isSealed", new Class[0]);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        f421525b = new D(method);
    }

    public D(Method method) {
        this.f421526a = method;
    }

    public final boolean a(Class<?> cls) {
        Method method = this.f421526a;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(cls, new Object[0])).booleanValue();
        } catch (Throwable th2) {
            throw new MockitoException("Failed to check if type is sealed using handle " + method, th2);
        }
    }
}
