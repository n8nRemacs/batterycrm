package org.mockito.internal.invocation;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: SerializableMethod.java */
/* loaded from: classes7.dex */
public class o implements Serializable, m {
    private static final long serialVersionUID = 6005610965006048445L;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f421669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f421670c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<?>[] f421671d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f421672e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f421673f;

    /* renamed from: g, reason: collision with root package name */
    public volatile transient Method f421674g;

    public o(Method method) {
        this.f421674g = method;
        this.f421669b = method.getDeclaringClass();
        this.f421670c = method.getName();
        this.f421671d = M71.c.a(method.getParameterTypes());
        this.f421672e = method.getReturnType();
        method.getExceptionTypes();
        this.f421673f = method.isVarArgs();
        method.getModifiers();
    }

    @Override // org.mockito.internal.invocation.m
    public final Class<?>[] a() {
        return this.f421671d;
    }

    @Override // org.mockito.internal.invocation.m
    public final boolean b() {
        return this.f421673f;
    }

    @Override // org.mockito.internal.invocation.m
    public final Method c() {
        if (this.f421674g != null) {
            return this.f421674g;
        }
        try {
            this.f421674g = this.f421669b.getDeclaredMethod(this.f421670c, this.f421671d);
            return this.f421674g;
        } catch (NoSuchMethodException e12) {
            throw new MockitoException(String.format("The method %1$s.%2$s does not exists and you should not get to this point.\nPlease report this as a defect with an example of how to reproduce it.", this.f421669b, this.f421670c), e12);
        } catch (SecurityException e13) {
            throw new MockitoException(String.format("The method %1$s.%2$s is probably private or protected and cannot be mocked.\nPlease report this as a defect with an example of how to reproduce it.", this.f421669b, this.f421670c), e13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        Class<?> cls = oVar.f421669b;
        Class<?> cls2 = this.f421669b;
        if (cls2 == null) {
            if (cls != null) {
                return false;
            }
        } else if (!cls2.equals(cls)) {
            return false;
        }
        String str = oVar.f421670c;
        String str2 = this.f421670c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!Arrays.equals(this.f421671d, oVar.f421671d)) {
            return false;
        }
        Class<?> cls3 = oVar.f421672e;
        Class<?> cls4 = this.f421672e;
        if (cls4 == null) {
            if (cls3 != null) {
                return false;
            }
        } else if (!cls4.equals(cls3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1;
    }
}
