package org.mockito.internal.creation.proxy;

import Y71.j;
import Y71.l;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.RealMethod;
import org.mockito.internal.invocation.o;

/* compiled from: InvokeDefaultProxy.java */
/* loaded from: classes7.dex */
class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Method f421618a = InvocationHandler.class.getMethod("invokeDefault", Object.class, Method.class, Object[].class);

    /* compiled from: InvokeDefaultProxy.java */
    public class b implements RealMethod, Serializable {
        private static final long serialVersionUID = -1;

        /* renamed from: b, reason: collision with root package name */
        public final Object f421619b;

        /* renamed from: c, reason: collision with root package name */
        public final o f421620c;

        /* renamed from: d, reason: collision with root package name */
        public final Object[] f421621d;

        public b(Object obj, Method method, Object[] objArr, C12230a c12230a) {
            this.f421619b = obj;
            this.f421620c = new o(method);
            this.f421621d = objArr;
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() throws Throwable {
            o oVar = this.f421620c;
            try {
                return a.this.f421618a.invoke(null, this.f421619b, oVar.c(), this.f421621d);
            } catch (IllegalAccessException e12) {
                e = e12;
                throw new MockitoException(l.b("Failed to access default method or invoked method with illegal arguments", "", "Method " + oVar.c() + " could not be delegated, this is not supposed to happen", j.a()), e);
            } catch (IllegalArgumentException e13) {
                e = e13;
                throw new MockitoException(l.b("Failed to access default method or invoked method with illegal arguments", "", "Method " + oVar.c() + " could not be delegated, this is not supposed to happen", j.a()), e);
            } catch (InvocationTargetException e14) {
                throw e14.getTargetException();
            }
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return true;
        }
    }

    @Override // org.mockito.internal.creation.proxy.e
    public final RealMethod a(Object obj, Method method, Object[] objArr) {
        return new b(obj, method, objArr, null);
    }
}
