package org.mockito.internal.creation.proxy;

import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.mockito.internal.invocation.RealMethod;

/* compiled from: MethodHandleProxy.java */
@K71.e
/* loaded from: classes7.dex */
class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final MethodHandles.Lookup f421623a = MethodHandles.lookup();

    /* compiled from: MethodHandleProxy.java */
    @K71.e
    /* renamed from: org.mockito.internal.creation.proxy.b$b, reason: collision with other inner class name */
    public static class C12231b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Constructor<MethodHandles.Lookup> f421624a;

        public C12231b() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            try {
                Class.forName("java.lang.Module");
                throw new RuntimeException("Must not be used when modules are available");
            } catch (ClassNotFoundException unused) {
                Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class);
                this.f421624a = declaredConstructor;
                declaredConstructor.setAccessible(true);
            }
        }

        @Override // org.mockito.internal.creation.proxy.e
        public final RealMethod a(Object obj, Method method, Object[] objArr) {
            try {
                return new c(this.f421624a.newInstance(method.getDeclaringClass()).in(method.getDeclaringClass()).unreflectSpecial(method, method.getDeclaringClass()).bindTo(obj), objArr, null);
            } catch (Throwable unused) {
                return RealMethod.IsIllegal.f421649b;
            }
        }
    }

    /* compiled from: MethodHandleProxy.java */
    @K71.e
    public static class c implements RealMethod, Serializable {
        private static final long serialVersionUID = -1;

        /* renamed from: b, reason: collision with root package name */
        public final MethodHandle f421625b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f421626c;

        public c(MethodHandle methodHandle, Object[] objArr, a aVar) {
            this.f421625b = methodHandle;
            this.f421626c = objArr;
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            return this.f421625b.invokeWithArguments(this.f421626c);
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return true;
        }
    }

    @Override // org.mockito.internal.creation.proxy.e
    public final RealMethod a(Object obj, Method method, Object[] objArr) {
        try {
            return new c(this.f421623a.findSpecial(method.getDeclaringClass(), method.getName(), MethodType.methodType(method.getReturnType(), method.getParameterTypes()), method.getDeclaringClass()).bindTo(obj), objArr, null);
        } catch (Throwable unused) {
            return RealMethod.IsIllegal.f421649b;
        }
    }
}
