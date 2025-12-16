package org.mockito.internal.creation.bytebuddy;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.pool.TypePool;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher;
import org.mockito.internal.creation.bytebuddy.q;
import org.mockito.internal.util.concurrent.WeakConcurrentSet;

/* compiled from: InlineBytecodeGenerator.java */
@K71.e
/* loaded from: classes7.dex */
public class h implements InterfaceC44924c, ClassFileTransformer {

    /* renamed from: i, reason: collision with root package name */
    public static final HashSet f421530i = new HashSet(Arrays.asList(Class.class, Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, String.class));

    /* renamed from: b, reason: collision with root package name */
    public final Instrumentation f421531b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakConcurrentSet<Class<?>> f421532c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakConcurrentSet<Class<?>> f421533d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC44924c f421534e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f421535f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f421536g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f421537h;

    public h(Instrumentation instrumentation, j jVar) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Method method2;
        Method method3;
        String property = System.getProperty("org.mockito.inline.preload");
        String[] strArrSplit = (property == null ? "java.lang.WeakPairMap,java.lang.WeakPairMap$Pair,java.lang.WeakPairMap$Pair$Weak" : property).split(",");
        int length = strArrSplit.length;
        int i12 = 0;
        while (true) {
            method = null;
            if (i12 >= length) {
                break;
            }
            try {
                Class.forName(strArrSplit[i12], false, null);
            } catch (ClassNotFoundException unused) {
            }
            i12++;
        }
        this.f421531b = instrumentation;
        new ByteBuddy();
        C44411u.t().a(C44411u.y(C44411u.j())).d(C44411u.m());
        this.f421532c = new WeakConcurrentSet<>();
        this.f421533d = new WeakConcurrentSet<>();
        String strB = net.bytebuddy.utility.g.b();
        this.f421534e = new C(new y(net.bytebuddy.implementation.d.a().b(c.b.AbstractC12100b.a.d(q.g.class, strB)).a(q.e.class), C44411u.g().d(C44411u.q()).d(C44411u.u())), false);
        new AsmVisitorWrapper.d().f(C44411u.v().a(C44411u.y(C44411u.i().d(C44411u.p()).d(C44411u.n()).d(C44411u.m()))).a(C44411u.y(C44411u.l(C44411u.w("java.")).a(C44411u.r())).a(C44411u.y(InterfaceC44924c.b(true)))), Advice.h().a(q.g.class, strB).c(q.class)).f(C44411u.s().a(C44411u.y(InterfaceC44924c.b(true))), Advice.h().a(q.g.class, strB).c(q.f.class)).d(C44411u.a(), new q.b(strB)).f(C44411u.p(), Advice.h().a(q.g.class, strB).c(q.d.class)).f(C44411u.n(), Advice.h().a(q.g.class, strB).c(q.c.class));
        try {
            Method method4 = Class.class.getMethod("getModule", new Class[0]);
            method3 = method4.getReturnType().getMethod("canRead", method4.getReturnType());
            method = method4;
            method2 = Instrumentation.class.getMethod("redefineModule", method4.getReturnType(), Set.class, Map.class, Map.class, Set.class, Map.class);
        } catch (Exception unused2) {
            method2 = null;
            method3 = null;
        }
        this.f421535f = method;
        this.f421536g = method3;
        this.f421537h = method2;
        MockMethodDispatcher.set(strB, new q(jVar));
        instrumentation.addTransformer(this, true);
    }

    public static void e(Class<?> cls) {
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
        } catch (ExceptionInInitializerError e12) {
            throw new MockitoException("Cannot instrument " + cls + " because it or one of its supertypes could not be initialized", e12.getException());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r6.f421555b.stream().anyMatch(new org.mockito.internal.creation.bytebuddy.g(r2)) == false) goto L25;
     */
    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44924c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Class<? extends T> a(org.mockito.internal.creation.bytebuddy.n<T> r6) {
        /*
            r5 = this;
            java.util.Set<java.lang.Class<?>> r0 = r6.f421555b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            org.mockito.mock.SerializableMode r0 = r6.f421556c
            org.mockito.mock.SerializableMode r1 = org.mockito.mock.SerializableMode.f421782b
            if (r0 != r1) goto L1d
            java.lang.Class<T> r0 = r6.f421554a
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L67
            java.lang.Class<T> r1 = r6.f421554a
            boolean r1 = r1.isArray()
            if (r1 != 0) goto L67
            java.lang.Class<T> r1 = r6.f421554a
            boolean r2 = r1.isPrimitive()
            if (r2 != 0) goto L67
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isFinal(r2)
            if (r2 != 0) goto L54
            org.mockito.internal.creation.bytebuddy.D r2 = org.mockito.internal.creation.bytebuddy.D.f421525b
            boolean r3 = r2.a(r1)
            if (r3 != 0) goto L54
            java.util.Set<java.lang.Class<?>> r3 = r6.f421555b
            java.util.stream.Stream r3 = r3.stream()
            org.mockito.internal.creation.bytebuddy.g r4 = new org.mockito.internal.creation.bytebuddy.g
            r4.<init>()
            boolean r2 = r3.anyMatch(r4)
            if (r2 != 0) goto L54
            goto L67
        L54:
            org.mockito.exceptions.base.MockitoException r6 = new org.mockito.exceptions.base.MockitoException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported settings with this type '"
            r0.<init>(r2)
            java.lang.String r2 = "'"
            java.lang.String r0 = com.akita.compose.theme.re23.style.C0.f(r1, r0, r2)
            r6.<init>(r0)
            throw r6
        L67:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.Class<T> r2 = r6.f421554a
            r1.add(r2)
            java.util.Set<java.lang.Class<?>> r2 = r6.f421555b
            r1.addAll(r2)
            monitor-enter(r5)
            r5.f(r1)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L86
            org.mockito.internal.creation.bytebuddy.c r0 = r5.f421534e
            org.mockito.internal.creation.bytebuddy.C r0 = (org.mockito.internal.creation.bytebuddy.C) r0
            java.lang.Class r6 = r0.a(r6)
            goto L88
        L86:
            java.lang.Class<T> r6 = r6.f421554a
        L88:
            return r6
        L89:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L89
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.h.a(org.mockito.internal.creation.bytebuddy.n):java.lang.Class");
    }

    public final void c(HashSet hashSet, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (this.f421532c.a(cls)) {
                if (!this.f421533d.b(cls)) {
                    e(cls);
                    hashSet.add(cls);
                }
                c(hashSet, cls.getInterfaces());
            }
        }
    }

    public final void d(HashSet hashSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f421537h == null) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        try {
            Object objInvoke = this.f421535f.invoke(Class.forName("org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher", false, null), new Object[0]);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object objInvoke2 = this.f421535f.invoke((Class) it.next(), new Object[0]);
                if (!hashSet2.contains(objInvoke2) && !((Boolean) this.f421536g.invoke(objInvoke2, objInvoke)).booleanValue()) {
                    hashSet2.add(objInvoke2);
                }
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                this.f421537h.invoke(this.f421531b, it2.next(), Collections.singleton(objInvoke), Collections.emptyMap(), Collections.emptyMap(), Collections.emptySet(), Collections.emptyMap());
            }
        } catch (Exception e12) {
            throw new IllegalStateException(Y71.l.b("Could not adjust module graph to make the mock instance dispatcher visible to some classes", "", "At least one of those modules: " + hashSet2 + " is not reading the unnamed module of the bootstrap loader", "Without such a read edge, the classes that are redefined to become mocks cannot access the mock dispatcher.", "To circumvent this, Mockito attempted to add a read edge to this module what failed for an unexpected reason"), e12);
        }
    }

    public final void f(HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Class superclass = (Class) it.next();
                do {
                    if (this.f421532c.a(superclass)) {
                        if (!this.f421533d.b(superclass)) {
                            e(superclass);
                            hashSet2.add(superclass);
                        }
                        c(hashSet2, superclass.getInterfaces());
                    }
                    superclass = superclass.getSuperclass();
                } while (superclass != null);
            }
            if (hashSet2.isEmpty()) {
                return;
            }
            try {
                d(hashSet2);
                this.f421531b.retransformClasses((Class[]) hashSet2.toArray(new Class[hashSet2.size()]));
            } catch (Exception e12) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    this.f421532c.b(cls);
                    this.f421533d.b(cls);
                }
                throw new MockitoException("Could not modify all classes " + hashSet2, e12);
            }
        } catch (Throwable th2) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                Class cls2 = (Class) it3.next();
                this.f421532c.b(cls2);
                this.f421533d.b(cls2);
            }
            throw th2;
        }
    }

    /* compiled from: InlineBytecodeGenerator.java */
    public static class b extends AsmVisitorWrapper.a {

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f421538b;

        /* compiled from: InlineBytecodeGenerator.java */
        /* renamed from: org.mockito.internal.creation.bytebuddy.h$b$b, reason: collision with other inner class name */
        public static class C12229b extends net.bytebuddy.jar.asm.f {

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription f421539d;

            public C12229b(net.bytebuddy.jar.asm.f fVar, TypeDescription typeDescription, a aVar) {
                super(net.bytebuddy.utility.e.f418981b, fVar);
                this.f421539d = typeDescription;
            }

            @Override // net.bytebuddy.jar.asm.f
            public final net.bytebuddy.jar.asm.s i(int i12, String str, String str2, String str3, String[] strArr) {
                net.bytebuddy.jar.asm.s sVarI = super.i(i12, str, str2, str3, strArr);
                net.bytebuddy.description.method.b bVarP1 = this.f421539d.q().P1((str.equals("<init>") ? MethodSortMatcher.Sort.f418387e.f418392c : C44411u.x(str)).a(C44411u.d(str2)));
                if (bVarP1.size() != 1 || !((net.bytebuddy.description.method.a) bVarP1.M2()).getParameters().U5()) {
                    return sVarI;
                }
                Iterator<?> it = ((net.bytebuddy.description.method.a) bVarP1.M2()).getParameters().iterator();
                while (it.hasNext()) {
                    net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                    sVarI.C(cVar.getModifiers(), cVar.getName());
                }
                return new a(net.bytebuddy.utility.e.f418981b, sVarI);
            }
        }

        public b() {
            throw null;
        }

        public b(Class cls, a aVar) {
            this.f421538b = cls;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final net.bytebuddy.jar.asm.f b(TypeDescription typeDescription, net.bytebuddy.jar.asm.f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
            return context.b().c(ClassFileVersion.f415298j) ? new C12229b(fVar, new TypeDescription.d(this.f421538b), null) : fVar;
        }

        /* compiled from: InlineBytecodeGenerator.java */
        public static class a extends net.bytebuddy.jar.asm.s {
            @Override // net.bytebuddy.jar.asm.s
            public final void C(int i12, String str) {
            }
        }
    }
}
