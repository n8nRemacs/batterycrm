package com.google.firebase.components;

import aZ0.InterfaceC19845a;
import j.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes13.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f360725a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<u<? super T>> f360726b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<n> f360727c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360728d;

    /* renamed from: e, reason: collision with root package name */
    public final int f360729e;

    /* renamed from: f, reason: collision with root package name */
    public final f<T> f360730f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f360731g;

    public static <T> C10697b<T> a(u<T> uVar) {
        return new C10697b<>(uVar, new u[0], (a) null);
    }

    public static <T> C10697b<T> b(Class<T> cls) {
        return new C10697b<>(cls, new Class[0], (a) null);
    }

    @SafeVarargs
    public static <T> b<T> c(T t12, Class<T> cls, Class<? super T>... clsArr) {
        C10697b c10697b = new C10697b(cls, clsArr, (a) null);
        c10697b.f360737f = new com.avito.android.publish.details.seller_protection.b(t12);
        return c10697b.b();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f360726b.toArray()) + ">{" + this.f360728d + ", type=" + this.f360729e + ", deps=" + Arrays.toString(this.f360727c.toArray()) + "}";
    }

    public b(@P String str, Set<u<? super T>> set, Set<n> set2, int i12, int i13, f<T> fVar, Set<Class<?>> set3) {
        this.f360725a = str;
        this.f360726b = Collections.unmodifiableSet(set);
        this.f360727c = Collections.unmodifiableSet(set2);
        this.f360728d = i12;
        this.f360729e = i13;
        this.f360730f = fVar;
        this.f360731g = Collections.unmodifiableSet(set3);
    }

    /* compiled from: Component.java */
    /* renamed from: com.google.firebase.components.b$b, reason: collision with other inner class name */
    public static class C10697b<T> {

        /* renamed from: a, reason: collision with root package name */
        public String f360732a;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f360733b;

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f360734c;

        /* renamed from: d, reason: collision with root package name */
        public int f360735d;

        /* renamed from: e, reason: collision with root package name */
        public int f360736e;

        /* renamed from: f, reason: collision with root package name */
        public f<T> f360737f;

        /* renamed from: g, reason: collision with root package name */
        public final HashSet f360738g;

        @SafeVarargs
        public C10697b() {
            throw null;
        }

        public C10697b(Class cls, Class[] clsArr, a aVar) {
            this.f360732a = null;
            HashSet hashSet = new HashSet();
            this.f360733b = hashSet;
            this.f360734c = new HashSet();
            this.f360735d = 0;
            this.f360736e = 0;
            this.f360738g = new HashSet();
            t.a(cls, "Null interface");
            hashSet.add(u.a(cls));
            for (Class cls2 : clsArr) {
                t.a(cls2, "Null interface");
                this.f360733b.add(u.a(cls2));
            }
        }

        @InterfaceC19845a
        public final void a(n nVar) {
            if (this.f360733b.contains(nVar.f360769a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f360734c.add(nVar);
        }

        public final b<T> b() {
            if (this.f360737f != null) {
                return new b<>(this.f360732a, new HashSet(this.f360733b), new HashSet(this.f360734c), this.f360735d, this.f360736e, this.f360737f, this.f360738g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        @InterfaceC19845a
        public final void c(f fVar) {
            t.a(fVar, "Null factory");
            this.f360737f = fVar;
        }

        @InterfaceC19845a
        public final void d(int i12) {
            if (!(this.f360735d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f360735d = i12;
        }

        public C10697b(u uVar, u[] uVarArr, a aVar) {
            this.f360732a = null;
            HashSet hashSet = new HashSet();
            this.f360733b = hashSet;
            this.f360734c = new HashSet();
            this.f360735d = 0;
            this.f360736e = 0;
            this.f360738g = new HashSet();
            t.a(uVar, "Null interface");
            hashSet.add(uVar);
            for (u uVar2 : uVarArr) {
                t.a(uVar2, "Null interface");
            }
            Collections.addAll(this.f360733b, uVarArr);
        }
    }
}
