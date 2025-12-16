package org.mockito.internal.creation.bytebuddy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.function.IntConsumer;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.pool.TypePool;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher;
import org.mockito.internal.invocation.RealMethod;
import org.mockito.internal.util.concurrent.c;

/* compiled from: MockMethodAdvice.java */
/* loaded from: classes7.dex */
public class q extends MockMethodDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final j f421560a = new j();

    /* compiled from: MockMethodAdvice.java */
    public static class b implements AsmVisitorWrapper.d.c {

        /* renamed from: b, reason: collision with root package name */
        public final String f421561b;

        /* compiled from: MockMethodAdvice.java */
        public class a extends net.bytebuddy.jar.asm.s {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Implementation.Context f421562d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TypeDescription f421563e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ a.d f421564f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ net.bytebuddy.description.method.a f421565g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i12, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, TypeDescription typeDescription, a.d dVar, net.bytebuddy.description.method.a aVar) {
                super(i12, sVar);
                this.f421562d = context;
                this.f421563e = typeDescription;
                this.f421564f = dVar;
                this.f421565g = aVar;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void h() {
                int i12;
                int i13;
                super.h();
                net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                b bVar = b.this;
                t(bVar.f421561b);
                Implementation.Context context = this.f421562d;
                boolean zC2 = context.b().c(ClassFileVersion.f415295g);
                TypeDescription typeDescription = this.f421563e;
                if (zC2) {
                    t(net.bytebuddy.jar.asm.B.v(typeDescription.getDescriptor()));
                } else {
                    t(typeDescription.getName());
                    A(net.bytebuddy.jar.asm.B.l(Class.class), "forName", net.bytebuddy.jar.asm.B.n(net.bytebuddy.jar.asm.B.u(Class.class), net.bytebuddy.jar.asm.B.u(String.class)), 184, false);
                }
                A(net.bytebuddy.jar.asm.B.l(MockMethodDispatcher.class), "isConstructorMock", net.bytebuddy.jar.asm.B.n(net.bytebuddy.jar.asm.B.f418136f, net.bytebuddy.jar.asm.B.u(String.class), net.bytebuddy.jar.asm.B.u(Class.class)), 184, false);
                m(3);
                r(159, rVar);
                J(25, 0);
                a.d dVar = this.f421564f;
                for (TypeDescription typeDescription2 : dVar.getParameters().p2().f1()) {
                    if (typeDescription2.Q2(Boolean.TYPE) || typeDescription2.Q2(Byte.TYPE) || typeDescription2.Q2(Short.TYPE) || typeDescription2.Q2(Character.TYPE) || typeDescription2.Q2(Integer.TYPE)) {
                        m(3);
                    } else if (typeDescription2.Q2(Long.TYPE)) {
                        m(9);
                    } else if (typeDescription2.Q2(Float.TYPE)) {
                        m(11);
                    } else if (typeDescription2.Q2(Double.TYPE)) {
                        m(14);
                    } else {
                        m(1);
                    }
                }
                A(dVar.n().V(), dVar.V(), dVar.getDescriptor(), 183, false);
                t(bVar.f421561b);
                if (context.b().c(ClassFileVersion.f415295g)) {
                    t(net.bytebuddy.jar.asm.B.v(typeDescription.getDescriptor()));
                } else {
                    t(typeDescription.getName());
                    A(net.bytebuddy.jar.asm.B.l(Class.class), "forName", net.bytebuddy.jar.asm.B.n(net.bytebuddy.jar.asm.B.u(Class.class), net.bytebuddy.jar.asm.B.u(String.class)), 184, false);
                }
                J(25, 0);
                net.bytebuddy.description.method.a aVar = this.f421565g;
                t(Integer.valueOf(aVar.getParameters().size()));
                int i14 = 189;
                I(189, net.bytebuddy.jar.asm.B.l(Object.class));
                Iterator<?> it = aVar.getParameters().iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                    m(89);
                    int i16 = i15 + 1;
                    t(Integer.valueOf(i15));
                    net.bytebuddy.jar.asm.B bV2 = net.bytebuddy.jar.asm.B.v(cVar.getType().f5().getDescriptor());
                    J(bV2.q(21), cVar.getOffset());
                    if (cVar.getType().w5()) {
                        net.bytebuddy.jar.asm.B bV3 = net.bytebuddy.jar.asm.B.v(cVar.getType().f5().h3().getDescriptor());
                        i12 = 83;
                        i13 = i14;
                        A(bV3.k(), "valueOf", net.bytebuddy.jar.asm.B.n(bV3, bV2), 184, false);
                    } else {
                        i12 = 83;
                        i13 = i14;
                    }
                    m(i12);
                    i14 = i13;
                    i15 = i16;
                }
                t(Integer.valueOf(aVar.getParameters().size()));
                I(i14, net.bytebuddy.jar.asm.B.l(String.class));
                int i17 = 0;
                for (TypeDescription typeDescription3 : aVar.getParameters().p2().f1()) {
                    m(89);
                    t(Integer.valueOf(i17));
                    t(typeDescription3.getName());
                    m(83);
                    i17++;
                }
                A(net.bytebuddy.jar.asm.B.l(MockMethodDispatcher.class), "handleConstruction", net.bytebuddy.jar.asm.B.n(net.bytebuddy.jar.asm.B.u(Object.class), net.bytebuddy.jar.asm.B.u(String.class), net.bytebuddy.jar.asm.B.u(Class.class), net.bytebuddy.jar.asm.B.u(Object.class), net.bytebuddy.jar.asm.B.u(Object[].class), net.bytebuddy.jar.asm.B.u(String[].class)), 184, false);
                net.bytebuddy.description.field.b<net.bytebuddy.description.field.a> bVarP1 = typeDescription.x().P1(C44411u.y(C44411u.s()));
                I(192, typeDescription.V());
                m(89);
                net.bytebuddy.jar.asm.r rVar2 = new net.bytebuddy.jar.asm.r();
                r(198, rVar2);
                for (net.bytebuddy.description.field.a aVar2 : bVarP1) {
                    m(89);
                    j(180, typeDescription.V(), aVar2.V(), aVar2.getDescriptor());
                    J(25, 0);
                    m(aVar2.getType().p() == StackSize.DOUBLE ? 91 : 90);
                    m(87);
                    j(181, typeDescription.V(), aVar2.V(), aVar2.getDescriptor());
                }
                s(rVar2);
                ClassFileVersion classFileVersionB = context.b();
                ClassFileVersion classFileVersion = ClassFileVersion.f415296h;
                if (classFileVersionB.c(classFileVersion)) {
                    Object[] objArrC = b.c(typeDescription.V(), aVar.getParameters().p2().f1());
                    k(objArrC, 0, new Object[]{typeDescription.V()}, objArrC.length, 1);
                }
                m(87);
                m(177);
                s(rVar);
                if (context.b().c(classFileVersion)) {
                    Object[] objArrC2 = b.c(6, aVar.getParameters().p2().f1());
                    k(objArrC2, 0, new Object[0], objArrC2.length, 0);
                }
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void y(int i12, int i13) {
                int iMax = Math.max(5, this.f421564f.p());
                Iterator<?> it = this.f421565g.getParameters().iterator();
                while (it.hasNext()) {
                    iMax = Math.max(Math.max(iMax, ((net.bytebuddy.description.method.c) it.next()).getType().p().f417839b + 6), 8);
                }
                super.y(Math.max(i12, iMax), i13);
            }
        }

        public b(String str) {
            this.f421561b = str;
        }

        public static Object[] c(Object obj, net.bytebuddy.description.type.d dVar) {
            Object[] objArr = new Object[dVar.size() + 1];
            int i12 = 0;
            objArr[0] = obj;
            for (TypeDescription typeDescription : dVar) {
                i12++;
                objArr[i12] = (typeDescription.Q2(Boolean.TYPE) || typeDescription.Q2(Byte.TYPE) || typeDescription.Q2(Short.TYPE) || typeDescription.Q2(Character.TYPE) || typeDescription.Q2(Integer.TYPE)) ? 1 : typeDescription.Q2(Long.TYPE) ? 4 : typeDescription.Q2(Float.TYPE) ? 2 : typeDescription.Q2(Double.TYPE) ? 3 : typeDescription.V();
            }
            return objArr;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper.d.c
        public final net.bytebuddy.jar.asm.s a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, TypePool typePool, int i12, int i13) {
            a.d dVar;
            if (aVar.v0() && !typeDescription.Q2(Object.class)) {
                int size = Integer.MAX_VALUE;
                boolean zP02 = true;
                dVar = null;
                loop0: while (true) {
                    dVar = dVar;
                    for (a.d dVar2 : typeDescription.C3().f5().q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(new M(ModifierMatcher.Mode.PRIVATE.f418407d)))) {
                        if (dVar2.getParameters().size() >= size || (!zP02 && dVar2.p0())) {
                        }
                    }
                    size = dVar2.getParameters().size();
                    zP02 = dVar2.p0();
                }
                if (dVar != null) {
                    return new a(net.bytebuddy.utility.e.f418981b, sVar, context, typeDescription, dVar, aVar);
                }
            }
            return sVar;
        }
    }

    /* compiled from: MockMethodAdvice.java */
    public static class c {
    }

    /* compiled from: MockMethodAdvice.java */
    public static class d {
    }

    /* compiled from: MockMethodAdvice.java */
    public static class e {
    }

    /* compiled from: MockMethodAdvice.java */
    public static class f {
    }

    /* compiled from: MockMethodAdvice.java */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface g {
    }

    /* compiled from: MockMethodAdvice.java */
    public static class h implements RealMethod {

        /* renamed from: b, reason: collision with root package name */
        public final j f421567b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f421568c;

        /* renamed from: d, reason: collision with root package name */
        public final U71.c<Object> f421569d;

        /* renamed from: e, reason: collision with root package name */
        public final Object[] f421570e;

        public h(j jVar, Method method, Object obj, Object[] objArr, a aVar) {
            this.f421567b = jVar;
            this.f421568c = method;
            this.f421569d = new U71.c<>(obj);
            this.f421570e = objArr;
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            U71.c<Object> cVar = this.f421569d;
            this.f421567b.set(cVar.a());
            return q.a(cVar.a(), this.f421568c, this.f421570e);
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return true;
        }
    }

    /* compiled from: MockMethodAdvice.java */
    public static class i implements Callable<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final Object f421571b;

        public i(Object obj, a aVar) {
            this.f421571b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.f421571b;
        }
    }

    /* compiled from: MockMethodAdvice.java */
    public static class j extends ThreadLocal<Object> {
        public j() {
        }

        public final Object a(Object obj) {
            Object obj2 = get();
            set(obj);
            return obj2;
        }
    }

    /* compiled from: MockMethodAdvice.java */
    public static class k implements RealMethod {

        /* renamed from: b, reason: collision with root package name */
        public final String f421572b;

        /* renamed from: c, reason: collision with root package name */
        public final org.mockito.internal.invocation.o f421573c;

        /* renamed from: d, reason: collision with root package name */
        public final U71.c f421574d;

        /* renamed from: e, reason: collision with root package name */
        public final Object[] f421575e;

        public k(String str, Method method, Object obj, Object[] objArr, a aVar) {
            this.f421573c = new org.mockito.internal.invocation.o(method);
            this.f421572b = str;
            this.f421574d = new U71.c(obj);
            this.f421575e = objArr;
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            Method methodC = this.f421573c.c();
            U71.c cVar = this.f421574d;
            MockMethodDispatcher mockMethodDispatcher = MockMethodDispatcher.get(this.f421572b, cVar.a());
            if (!(mockMethodDispatcher instanceof q)) {
                throw new MockitoException("Unexpected dispatcher for advice-based super call");
            }
            q qVar = (q) mockMethodDispatcher;
            Object objA = qVar.f421560a.a(cVar.a());
            try {
                return q.a(cVar.a(), methodC, this.f421575e);
            } finally {
                qVar.f421560a.set(objA);
            }
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return true;
        }
    }

    /* compiled from: MockMethodAdvice.java */
    public static class l implements RealMethod {

        /* renamed from: b, reason: collision with root package name */
        public final j f421576b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f421577c;

        /* renamed from: d, reason: collision with root package name */
        public final Method f421578d;

        /* renamed from: e, reason: collision with root package name */
        public final Object[] f421579e;

        public l() {
            throw null;
        }

        public l(j jVar, Class cls, Method method, Object[] objArr, a aVar) {
            this.f421576b = jVar;
            this.f421577c = cls;
            this.f421578d = method;
            this.f421579e = objArr;
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            this.f421576b.set(this.f421577c);
            return q.a(null, this.f421578d, this.f421579e);
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return true;
        }
    }

    public q(org.mockito.internal.creation.bytebuddy.j jVar) {
        MethodGraph.Compiler.Default.b();
        new c.f();
    }

    public static Object a(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return org.mockito.internal.configuration.plugins.j.c().invoke(obj, method, objArr);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            org.mockito.internal.exceptions.stacktrace.a aVar = new org.mockito.internal.exceptions.stacktrace.a();
            Class<?> declaringClass = method.getDeclaringClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                String str = stackTraceElement.getClassName() + stackTraceElement.getLineNumber();
                int iLastIndexOf = arrayList.lastIndexOf(str);
                arrayList.add(str);
                if (iLastIndexOf > -1 && declaringClass.getName().equals(stackTraceElement.getClassName())) {
                    arrayList2.add(Integer.valueOf(iLastIndexOf));
                }
            }
            final ArrayList arrayList3 = new ArrayList(Arrays.asList(cause.getStackTrace()));
            arrayList2.stream().sorted(Comparator.reverseOrder()).mapToInt(new o()).forEach(new IntConsumer() { // from class: org.mockito.internal.creation.bytebuddy.p
                @Override // java.util.function.IntConsumer
                public final void accept(int i12) {
                    arrayList3.remove(i12);
                }
            });
            cause.setStackTrace((StackTraceElement[]) arrayList3.toArray(new StackTraceElement[0]));
            aVar.a(cause);
            throw cause;
        }
    }
}
