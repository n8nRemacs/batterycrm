package org.mockito.internal.creation.proxy;

import Y71.j;
import Y71.l;
import e81.h;
import h81.InterfaceC40782a;
import i81.InterfaceC41246f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicReference;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.proxy.b;
import org.mockito.internal.invocation.RealMethod;
import org.mockito.internal.invocation.m;
import org.mockito.internal.invocation.o;
import org.mockito.internal.progress.f;

/* compiled from: ProxyMockMaker.java */
/* loaded from: classes7.dex */
public class c implements InterfaceC41246f {

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f421627b = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public final e f421628a;

    /* compiled from: ProxyMockMaker.java */
    public class a implements InterfaceC41246f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f421629a;

        public a(Class cls) {
            this.f421629a = cls;
        }

        @Override // i81.InterfaceC41246f.c
        public final boolean a() {
            Class cls = this.f421629a;
            return cls.isInterface() || cls == Object.class;
        }

        @Override // i81.InterfaceC41246f.c
        public final String b() {
            return a() ? "" : "non-interface";
        }
    }

    /* compiled from: ProxyMockMaker.java */
    public static class b extends ClassLoader {

        /* renamed from: a, reason: collision with root package name */
        public final ClassLoader f421630a;

        /* renamed from: b, reason: collision with root package name */
        public final ClassLoader f421631b;

        public b(ClassLoader classLoader, ClassLoader classLoader2, a aVar) {
            super(null);
            this.f421630a = classLoader;
            this.f421631b = classLoader2;
        }

        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str) {
            try {
                return this.f421630a.loadClass(str);
            } catch (ClassNotFoundException unused) {
                return this.f421631b.loadClass(str);
            }
        }
    }

    /* compiled from: ProxyMockMaker.java */
    /* renamed from: org.mockito.internal.creation.proxy.c$c, reason: collision with other inner class name */
    public class C12232c implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference<h<?>> f421632a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC40782a<?> f421633b;

        public C12232c() {
            throw null;
        }

        public C12232c(h hVar, InterfaceC40782a interfaceC40782a, a aVar) {
            this.f421632a = new AtomicReference<>(hVar);
            this.f421633b = interfaceC40782a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            int i12;
            if (objArr == null) {
                objArr = c.f421627b;
            }
            Object[] objArr2 = objArr;
            if (method.getDeclaringClass() == Object.class) {
                String name = method.getName();
                name.getClass();
                switch (name) {
                    case "toString":
                        break;
                    case "equals":
                        return Boolean.valueOf(obj == objArr2[0]);
                    case "hashCode":
                        return Integer.valueOf(System.identityHashCode(obj));
                    default:
                        throw new MockitoException(l.b("Unexpected overridable method of Object class found", "", "The method " + method + " was not expected to be declared. Either your JVM build offers non-official API or the current functionality is not supported", j.a()));
                }
            }
            RealMethod realMethodA = Modifier.isAbstract(method.getModifiers()) ? RealMethod.IsIllegal.f421649b : c.this.f421628a.a(obj, method, objArr2);
            h<?> hVar = this.f421632a.get();
            InterfaceC40782a<?> interfaceC40782a = this.f421633b;
            P71.d dVar = new P71.d();
            U71.c cVar = new U71.c(obj);
            m oVar = interfaceC40782a.b() ? new o(method) : new M71.a(method);
            synchronized (f.class) {
                i12 = f.f421700a;
                f.f421700a = 1 + i12;
            }
            return hVar.N0(new org.mockito.internal.invocation.e(cVar, oVar, objArr2, realMethodA, dVar, i12));
        }
    }

    public c() {
        e dVar;
        try {
            try {
                try {
                    dVar = new org.mockito.internal.creation.proxy.a();
                } catch (Throwable unused) {
                    dVar = new d();
                }
            } catch (Throwable unused2) {
                dVar = new b.C12231b();
            }
        } catch (Throwable unused3) {
            dVar = new org.mockito.internal.creation.proxy.b();
        }
        this.f421628a = dVar;
    }

    public static ClassLoader b(ClassLoader classLoader, Class<?> cls) {
        if (classLoader == null) {
            return cls.getClassLoader();
        }
        ClassLoader classLoader2 = cls.getClassLoader();
        if (classLoader2 == null || classLoader == classLoader2) {
            return classLoader;
        }
        while (classLoader2 != null) {
            if (classLoader2 == classLoader) {
                return cls.getClassLoader();
            }
            classLoader2 = classLoader2.getParent();
        }
        for (ClassLoader parent = classLoader; parent != null; parent = parent.getParent()) {
            if (parent == cls.getClassLoader()) {
                return classLoader;
            }
        }
        return new b(classLoader, cls.getClassLoader(), null);
    }

    @Override // i81.InterfaceC41246f
    public final InterfaceC41246f.c a(Class<?> cls) {
        return new a(cls);
    }

    @Override // i81.InterfaceC41246f
    public final Object d(N71.a aVar, h hVar) {
        int i12 = 1;
        int i13 = aVar.f11211b == Object.class ? 1 : 0;
        Class[] clsArr = new Class[aVar.f11212c.size() + (i13 ^ 1)];
        if (i13 == 0) {
            clsArr[0] = aVar.f11211b;
        } else {
            i12 = 0;
        }
        ClassLoader classLoader = aVar.f11211b.getClassLoader();
        for (Class cls : aVar.f11212c) {
            clsArr[i12] = cls;
            classLoader = b(classLoader, cls);
            i12++;
        }
        return Proxy.newProxyInstance(b(classLoader, c.class), clsArr, new C12232c(hVar, aVar, null));
    }

    @Override // i81.InterfaceC41246f
    public final h e(Object obj) throws IllegalArgumentException {
        if (!Proxy.isProxyClass(obj.getClass())) {
            return null;
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
        if (invocationHandler instanceof C12232c) {
            return ((C12232c) invocationHandler).f421632a.get();
        }
        return null;
    }
}
