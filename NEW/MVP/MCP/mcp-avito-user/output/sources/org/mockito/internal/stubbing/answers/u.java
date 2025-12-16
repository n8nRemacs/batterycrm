package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: InvocationInfo.java */
/* loaded from: classes7.dex */
public class u implements org.mockito.internal.invocation.a {

    /* renamed from: b, reason: collision with root package name */
    public final Method f421707b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC39968b f421708c;

    public u(InterfaceC39968b interfaceC39968b) {
        this.f421707b = interfaceC39968b.getMethod();
        this.f421708c = interfaceC39968b;
    }

    public final boolean d(Class<?> cls, final Throwable th2) {
        ArrayList arrayList = new ArrayList(Arrays.asList(cls.getInterfaces()));
        if (cls.getSuperclass() != null) {
            arrayList.add(cls.getSuperclass());
        }
        final int i12 = 0;
        if (arrayList.stream().anyMatch(new Predicate(this) { // from class: org.mockito.internal.stubbing.answers.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f421705b;

            {
                this.f421705b = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i12) {
                    case 0:
                        Throwable th3 = th2;
                        Class cls2 = (Class) obj;
                        Method method = this.f421705b.f421707b;
                        try {
                            Class<?>[] exceptionTypes = cls2.getMethod(method.getName(), method.getParameterTypes()).getExceptionTypes();
                            Class<?> cls3 = th3.getClass();
                            for (Class<?> cls4 : exceptionTypes) {
                                if (cls4.isAssignableFrom(cls3)) {
                                    return true;
                                }
                            }
                            return false;
                        } catch (NoSuchMethodException unused) {
                            return false;
                        }
                    default:
                        return this.f421705b.d((Class) obj, th2);
                }
            }
        })) {
            return true;
        }
        final int i13 = 1;
        return arrayList.stream().anyMatch(new Predicate(this) { // from class: org.mockito.internal.stubbing.answers.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f421705b;

            {
                this.f421705b = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i13) {
                    case 0:
                        Throwable th3 = th2;
                        Class cls2 = (Class) obj;
                        Method method = this.f421705b.f421707b;
                        try {
                            Class<?>[] exceptionTypes = cls2.getMethod(method.getName(), method.getParameterTypes()).getExceptionTypes();
                            Class<?> cls3 = th3.getClass();
                            for (Class<?> cls4 : exceptionTypes) {
                                if (cls4.isAssignableFrom(cls3)) {
                                    return true;
                                }
                            }
                            return false;
                        } catch (NoSuchMethodException unused) {
                            return false;
                        }
                    default:
                        return this.f421705b.d((Class) obj, th2);
                }
            }
        });
    }

    public final boolean e(Class<?> cls) {
        Method method = this.f421707b;
        return (method.getReturnType().isPrimitive() || cls.isPrimitive()) ? Y71.k.a(cls) == Y71.k.a(method.getReturnType()) : method.getReturnType().isAssignableFrom(cls);
    }

    public final boolean f() {
        Class<?> clsF = org.mockito.internal.util.reflection.f.d(Y71.h.a(this.f421708c.v3()).j0().d()).j(this.f421707b).f();
        return clsF == Void.TYPE || clsF == Void.class;
    }
}
