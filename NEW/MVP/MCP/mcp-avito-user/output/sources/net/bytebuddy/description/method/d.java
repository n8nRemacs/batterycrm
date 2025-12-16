package net.bytebuddy.description.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.z;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: ParameterList.java */
/* loaded from: classes8.dex */
public interface d<T extends net.bytebuddy.description.method.c> extends z<T, d<T>> {

    /* compiled from: ParameterList.java */
    public static abstract class a<S extends net.bytebuddy.description.method.c> extends z.a<S, d<S>> implements d<S> {
        @Override // net.bytebuddy.description.method.d
        public boolean U5() {
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                S next = it.next();
                if (!next.g() || !next.t()) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.bytebuddy.matcher.z.a
        public final z a(List list) {
            return new c(list);
        }

        @Override // net.bytebuddy.description.method.d
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(abstractC12113a));
            }
            return new a.InterfaceC11963a.C11964a(arrayList);
        }

        @Override // net.bytebuddy.description.method.d
        public d.f p2() {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getType());
            }
            return new d.f.c(arrayList);
        }
    }

    /* compiled from: ParameterList.java */
    public static class b<S extends net.bytebuddy.description.method.c> extends z.b<S, d<S>> implements d<S> {
        @Override // net.bytebuddy.description.method.d
        public final boolean U5() {
            return true;
        }

        @Override // net.bytebuddy.description.method.d
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new a.InterfaceC11963a.C11964a(new c.f[0]);
        }

        @Override // net.bytebuddy.description.method.d
        public final d.f p2() {
            return new d.f.b();
        }
    }

    /* compiled from: ParameterList.java */
    public static class c<S extends net.bytebuddy.description.method.c> extends a<S> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends S> f416247b;

        /* compiled from: ParameterList.java */
        public static class a extends a<c.InterfaceC11982c> {

            /* renamed from: b, reason: collision with root package name */
            public final a.d.AbstractC11975a f416248b;

            /* renamed from: c, reason: collision with root package name */
            public final List<? extends TypeDefinition> f416249c;

            public a(a.d.AbstractC11975a abstractC11975a, List list) {
                this.f416248b = abstractC11975a;
                this.f416249c = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v0 */
            /* JADX WARN: Type inference failed for: r9v1, types: [int] */
            /* JADX WARN: Type inference failed for: r9v3 */
            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                int i13 = 0;
                ?? r92 = !this.f416248b.x0(8);
                while (true) {
                    List<? extends TypeDefinition> list = this.f416249c;
                    if (i13 >= i12) {
                        return new c.e(this.f416248b, list.get(i12).P0(), Collections.emptyList(), null, null, i12, r92);
                    }
                    int i14 = r92 + list.get(i13).p().f417839b;
                    i13++;
                    r92 = i14;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416249c.size();
            }
        }

        public c(List<? extends S> list) {
            this.f416247b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416247b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416247b.size();
        }
    }

    /* compiled from: ParameterList.java */
    /* renamed from: net.bytebuddy.description.method.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC11983d<T> extends a<c.InterfaceC11982c> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f416250d;

        /* renamed from: e, reason: collision with root package name */
        public static final boolean f416251e;

        /* renamed from: b, reason: collision with root package name */
        public final Executable f416252b;

        /* renamed from: c, reason: collision with root package name */
        public final a.d.AbstractC11975a.b f416253c;

        /* compiled from: ParameterList.java */
        @JavaDispatcher.i("java.lang.reflect.Executable")
        /* renamed from: net.bytebuddy.description.method.d$d$a */
        public interface a {
            @JavaDispatcher.e
            @JavaDispatcher.i("isInstance")
            boolean a();

            @JavaDispatcher.i("getParameterCount")
            int b();

            @JavaDispatcher.i("getParameters")
            Object[] getParameters();
        }

        /* compiled from: ParameterList.java */
        /* renamed from: net.bytebuddy.description.method.d$d$b */
        public static class b extends AbstractC11983d<Constructor<?>> {
            public b() {
                throw null;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [net.bytebuddy.description.method.a$d$a$b, net.bytebuddy.description.method.c$b$f] */
            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return new c.b.a((Constructor) this.f416252b, i12, this.f416253c);
            }
        }

        /* compiled from: ParameterList.java */
        /* renamed from: net.bytebuddy.description.method.d$d$c */
        public static class c extends a<c.InterfaceC11982c> {

            /* renamed from: b, reason: collision with root package name */
            public final Constructor<?> f416254b;

            /* renamed from: c, reason: collision with root package name */
            public final Class<?>[] f416255c;

            /* renamed from: d, reason: collision with root package name */
            public final a.b f416256d;

            public c(Constructor constructor, a.b bVar) {
                this.f416254b = constructor;
                this.f416255c = constructor.getParameterTypes();
                this.f416256d = bVar;
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return new c.b.C11979b(this.f416254b, i12, this.f416255c, this.f416256d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416255c.length;
            }
        }

        /* compiled from: ParameterList.java */
        /* renamed from: net.bytebuddy.description.method.d$d$d, reason: collision with other inner class name */
        public static class C11984d extends a<c.InterfaceC11982c> {

            /* renamed from: b, reason: collision with root package name */
            public final Method f416257b;

            /* renamed from: c, reason: collision with root package name */
            public final Class<?>[] f416258c;

            /* renamed from: d, reason: collision with root package name */
            public final a.c f416259d;

            public C11984d(Method method, a.c cVar) {
                this.f416257b = method;
                this.f416258c = method.getParameterTypes();
                this.f416259d = cVar;
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return new c.b.C11980c(this.f416257b, i12, this.f416258c, this.f416259d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416258c.length;
            }
        }

        /* compiled from: ParameterList.java */
        /* renamed from: net.bytebuddy.description.method.d$d$e */
        public static class e extends AbstractC11983d<Method> {
            /* JADX WARN: Type inference failed for: r2v0, types: [net.bytebuddy.description.method.a$d$a$b, net.bytebuddy.description.method.c$b$f] */
            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return new c.b.d((Method) this.f416252b, i12, this.f416253c);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.description.method.d.AbstractC11983d.f416251e = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.method.d.AbstractC11983d.f416251e = r0
            L19:
                java.lang.Class<net.bytebuddy.description.method.d$d$a> r0 = net.bytebuddy.description.method.d.AbstractC11983d.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.description.method.d.AbstractC11983d.f416251e
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.description.method.d$d$a r0 = (net.bytebuddy.description.method.d.AbstractC11983d.a) r0
                net.bytebuddy.description.method.d.AbstractC11983d.f416250d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.method.d.AbstractC11983d.<clinit>():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC11983d(Executable executable, c.b.f fVar) {
            this.f416252b = executable;
            this.f416253c = (a.d.AbstractC11975a.b) fVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return f416250d.b();
        }
    }

    /* compiled from: ParameterList.java */
    public static class e extends a<c.InterfaceC11982c> {

        /* renamed from: b, reason: collision with root package name */
        public final a.d.AbstractC11975a f416260b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends c.f> f416261c;

        public e(a.d.AbstractC11975a abstractC11975a, List list) {
            this.f416260b = abstractC11975a;
            this.f416261c = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [int] */
        /* JADX WARN: Type inference failed for: r10v3 */
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            boolean z12 = !this.f416260b.x0(8);
            List<? extends c.f> list = this.f416261c;
            Iterator<? extends c.f> it = list.subList(0, i12).iterator();
            ?? r102 = z12;
            while (it.hasNext()) {
                r102 += it.next().f416238a.p().f417839b;
            }
            c.f fVar = list.get(i12);
            return new c.e(this.f416260b, fVar.f416238a, new a.c(fVar.f416239b), fVar.f416240c, fVar.f416241d, i12, r102);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416261c.size();
        }
    }

    /* compiled from: ParameterList.java */
    public static class f extends a<c.d> {

        /* renamed from: b, reason: collision with root package name */
        public final a.i f416262b;

        /* renamed from: c, reason: collision with root package name */
        public final d f416263c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416264d;

        public f(a.i iVar, d dVar, TypeDescription.Generic.Visitor visitor) {
            this.f416262b = iVar;
            this.f416263c = dVar;
            this.f416264d = visitor;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new c.g(this.f416262b, (net.bytebuddy.description.method.c) this.f416263c.get(i12), this.f416264d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416263c.size();
        }
    }

    boolean U5();

    a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a);

    d.f p2();
}
