package org.mockito.internal.creation.bytebuddy;

import java.lang.reflect.Method;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.utility.GraalImageCode;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: ModuleHandler.java */
/* loaded from: classes7.dex */
abstract class s {

    /* compiled from: ModuleHandler.java */
    public static class b extends s {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuddy f421581a;

        /* renamed from: b, reason: collision with root package name */
        public final A f421582b;

        /* renamed from: c, reason: collision with root package name */
        public final int f421583c;

        /* renamed from: d, reason: collision with root package name */
        public final Method f421584d;

        /* renamed from: e, reason: collision with root package name */
        public final Method f421585e;

        /* renamed from: f, reason: collision with root package name */
        public final Method f421586f;

        /* renamed from: g, reason: collision with root package name */
        public final Method f421587g;

        /* renamed from: h, reason: collision with root package name */
        public final Method f421588h;

        /* renamed from: i, reason: collision with root package name */
        public final Method f421589i;

        /* renamed from: j, reason: collision with root package name */
        public final Method f421590j;

        /* renamed from: k, reason: collision with root package name */
        public final Method f421591k;

        public b(ByteBuddy byteBuddy, A a12, a aVar) throws ClassNotFoundException {
            this.f421581a = byteBuddy;
            this.f421582b = a12;
            this.f421583c = GraalImageCode.a().f418861b ? 0 : Math.abs(org.mockito.q.class.hashCode());
            Class<?> cls = Class.forName("java.lang.Module");
            this.f421584d = Class.class.getMethod("getModule", new Class[0]);
            this.f421585e = cls.getMethod("isOpen", String.class, cls);
            this.f421586f = cls.getMethod("isExported", String.class, cls);
            this.f421587g = cls.getMethod("isExported", String.class);
            this.f421588h = cls.getMethod("canRead", cls);
            this.f421589i = cls.getMethod("addExports", String.class, cls);
            this.f421590j = cls.getMethod("addReads", cls);
            this.f421591k = Class.class.getMethod("forName", String.class);
        }

        public static Object e(Object obj, Method method, Object... objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e12) {
                throw new MockitoException(Y71.l.b("Could not invoke " + method + " using reflection", "", "Mockito attempted to interact with the Java module system but an unexpected method behavior was encountered"), e12);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        
            if (r9 == r25.getClassLoader()) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (r11 != false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        
            if (r9 == null) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        
            r9 = r9.getParent();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        
            if (r9 != r25.getClassLoader()) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        
            r12 = r23.f421582b;
            r14 = r23.f421581a;
            r5 = r23.f421591k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        
            if (r11 == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        
            r3 = net.bytebuddy.implementation.MethodCall.a(r4).l(net.bytebuddy.implementation.MethodCall.a(r5).h(r25.getName()));
            r6 = net.bytebuddy.implementation.StubMethod.f417445b;
            r26 = "This is required to adjust the module graph to enable mock creation";
            r27 = "";
            r16 = java.lang.Object.class;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
        
            r6 = r14.b(java.lang.Object.class, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.f417163b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        
            r26 = "This is required to adjust the module graph to enable mock creation";
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
        
            r9 = net.bytebuddy.utility.g.a(r24.getName().hashCode());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
        
            r27 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
        
            r16 = java.lang.Object.class;
            r6 = ((net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a) r6.L("org.mockito.codegen.MockitoTypeCarrier$" + r9 + net.bytebuddy.utility.g.a(r25.getName().hashCode()))).e("mockitoType", java.lang.Class.class, net.bytebuddy.description.modifier.Visibility.PUBLIC, net.bytebuddy.description.modifier.Ownership.STATIC).p().l6(r24.getClassLoader(), r12.a(r24, r24.getClassLoader(), false)).a();
            r3 = r6.getField("mockitoType");
            r3.set(null, r25);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
        
            r9 = net.bytebuddy.implementation.MethodCall.a(r4);
            r3 = new net.bytebuddy.implementation.MethodCall(r9.f417366b, new net.bytebuddy.implementation.MethodCall.TargetHandler.c.a(new net.bytebuddy.implementation.MethodCall.TargetHandler.c.b.a(new net.bytebuddy.description.field.a.b(r3))), r9.f417368d, net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.f417402b, r9.f417370f);
            r6 = net.bytebuddy.implementation.MethodCall.a(r4).l(net.bytebuddy.implementation.MethodCall.a(r5).h(r6.getName()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x016d, code lost:
        
            r4 = net.bytebuddy.implementation.MethodCall.a(r4).l(net.bytebuddy.implementation.MethodCall.a(r5).h(r24.getName()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0185, code lost:
        
            if (r7 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0187, code lost:
        
            r6 = r6.c(net.bytebuddy.implementation.MethodCall.a(r23.f421589i).l(r4).h(r25.getPackage().getName()).g(java.util.Arrays.asList(new net.bytebuddy.implementation.MethodCall.ArgumentLoader.e.b(r3))));
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:
        
            if (r8 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
        
            r6 = r6.c(net.bytebuddy.implementation.MethodCall.a(r23.f421590j).l(r4).g(java.util.Arrays.asList(new net.bytebuddy.implementation.MethodCall.ArgumentLoader.e.b(r3))));
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01db, code lost:
        
            r14.getClass();
            java.lang.Class.forName(((net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a) r14.c(net.bytebuddy.description.type.TypeDescription.d.A0(r16), net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.f417164c).L(r24.getName() + "$MockitoModuleProbe$" + net.bytebuddy.utility.g.a(r24.getName().hashCode()) + net.bytebuddy.utility.g.a(r25.getName().hashCode()))).J(net.bytebuddy.matcher.MethodSortMatcher.Sort.f418388f.f418392c).z(r6).p().l6(r24.getClassLoader(), r12.a(r24, r24.getClassLoader(), false)).a().getName(), true, r24.getClassLoader());
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0258, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0259, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0271, code lost:
        
            throw new org.mockito.exceptions.base.MockitoException(Y71.l.b(androidx.compose.ui.graphics.colorspace.e.k(r24, "Could not force module adjustment of the module of "), r27, r26), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0272, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0273, code lost:
        
            r5 = r26;
            r4 = r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0278, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0279, code lost:
        
            r5 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x027b, code lost:
        
            r4 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x027d, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x027e, code lost:
        
            r5 = "This is required to adjust the module graph to enable mock creation";
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0293, code lost:
        
            throw new org.mockito.exceptions.base.MockitoException(Y71.l.b(androidx.compose.ui.graphics.colorspace.e.k(r24, "Could not create a carrier for making the Mockito type visible to "), r4, r5), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0077, code lost:
        
            r11 = false;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:23:0x0074). Please report as a decompilation issue!!! */
        @Override // org.mockito.internal.creation.bytebuddy.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.Class<?> r24, java.lang.Class<?> r25, boolean r26, boolean r27) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
            /*
                Method dump skipped, instructions count: 736
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.s.b.a(java.lang.Class, java.lang.Class, boolean, boolean):void");
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final Class<?> b(ClassLoader classLoader, String str) {
            Class<?> cls;
            String strSubstring = str.substring(0, str.lastIndexOf(46));
            if (classLoader == B71.a.class.getClassLoader() && B71.a.class.getPackage().getName().equals(strSubstring)) {
                return B71.a.class;
            }
            synchronized (this) {
                try {
                    int i12 = this.f421583c;
                    while (true) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strSubstring);
                        sb2.append(".");
                        sb2.append(B71.a.class.getSimpleName());
                        sb2.append("$");
                        int i13 = i12 + 1;
                        sb2.append(i12);
                        String string = sb2.toString();
                        try {
                            cls = Class.forName(string, false, classLoader);
                            if (cls.getClassLoader() != classLoader) {
                                i12 = i13;
                            }
                        } catch (ClassNotFoundException unused) {
                            return ((a.InterfaceC12009a.AbstractC12010a) this.f421581a.b(Object.class, ConstructorStrategy.Default.f417163b).L(string)).s().l6(classLoader, this.f421582b.a(B71.a.class, classLoader, false)).a();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cls;
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final boolean c(Class<?> cls) {
            if (cls.getPackage() == null) {
                return true;
            }
            return ((Boolean) e(e(cls, this.f421584d, new Object[0]), this.f421587g, cls.getPackage().getName())).booleanValue();
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final boolean d(Class cls) {
            if (cls.getPackage() == null) {
                return true;
            }
            Method method = this.f421584d;
            return ((Boolean) e(e(cls, method, new Object[0]), this.f421585e, cls.getPackage().getName(), e(m.class, method, new Object[0]))).booleanValue();
        }
    }

    public abstract void a(Class<?> cls, Class<?> cls2, boolean z12, boolean z13);

    public abstract Class<?> b(ClassLoader classLoader, String str);

    public abstract boolean c(Class<?> cls);

    public abstract boolean d(Class cls);

    /* compiled from: ModuleHandler.java */
    public static class c extends s {
        public c() {
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final Class<?> b(ClassLoader classLoader, String str) {
            return B71.a.class;
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final boolean c(Class<?> cls) {
            return true;
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final boolean d(Class cls) {
            return true;
        }

        @Override // org.mockito.internal.creation.bytebuddy.s
        public final void a(Class<?> cls, Class<?> cls2, boolean z12, boolean z13) {
        }
    }
}
