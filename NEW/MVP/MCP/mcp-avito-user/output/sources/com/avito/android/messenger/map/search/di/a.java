package com.avito.android.messenger.map.search.di;

import androidx.view.P0;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.map.search.GeoSearchFragment;
import com.avito.android.messenger.map.search.di.b;
import com.avito.android.messenger.map.search.p;
import com.avito.android.messenger.map.search.q;
import com.avito.android.messenger.map.search.w;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerGeoSearchFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerGeoSearchFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.messenger.map.search.di.b.a
        public final com.avito.android.messenger.map.search.di.b a(GeoSearchFragment geoSearchFragment, String str, GeoPoint geoPoint, GeoPoint geoPoint2, String str2, String str3, q.a aVar, com.avito.android.messenger.map.search.di.c cVar) {
            str.getClass();
            aVar.getClass();
            return new c(cVar, geoSearchFragment, str, geoPoint, geoPoint2, str2, str3, aVar, null);
        }
    }

    /* compiled from: DaggerGeoSearchFragmentComponent.java */
    public static final class c implements com.avito.android.messenger.map.search.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final GeoSearchFragment f196536a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.messenger.map.search.di.c f196537b;

        /* renamed from: c, reason: collision with root package name */
        public final l f196538c;

        /* renamed from: d, reason: collision with root package name */
        public final l f196539d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC47842z> f196540e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f196541f;

        /* renamed from: g, reason: collision with root package name */
        public final p f196542g;

        /* renamed from: h, reason: collision with root package name */
        public final l f196543h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.f f196544i;

        /* renamed from: j, reason: collision with root package name */
        public final f f196545j;

        /* renamed from: k, reason: collision with root package name */
        public final l f196546k;

        /* renamed from: l, reason: collision with root package name */
        public final l f196547l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28373a> f196548m;

        /* renamed from: n, reason: collision with root package name */
        public final w f196549n;

        /* renamed from: o, reason: collision with root package name */
        public final u<F0> f196550o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C30277e1> f196551p;

        /* renamed from: q, reason: collision with root package name */
        public final C47743i f196552q;

        /* compiled from: DaggerGeoSearchFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.map.search.di.a$c$a, reason: collision with other inner class name */
        public static final class C5779a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.search.di.c f196553a;

            public C5779a(com.avito.android.messenger.map.search.di.c cVar) {
                this.f196553a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f196553a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGeoSearchFragmentComponent.java */
        public static final class b implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.search.di.c f196554a;

            public b(com.avito.android.messenger.map.search.di.c cVar) {
                this.f196554a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196554a.d0();
            }
        }

        /* compiled from: DaggerGeoSearchFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.map.search.di.a$c$c, reason: collision with other inner class name */
        public static final class C5780c implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.search.di.c f196555a;

            public C5780c(com.avito.android.messenger.map.search.di.c cVar) {
                this.f196555a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196555a.C();
            }
        }

        /* compiled from: DaggerGeoSearchFragmentComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.search.di.c f196556a;

            public d(com.avito.android.messenger.map.search.di.c cVar) {
                this.f196556a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196556a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerGeoSearchFragmentComponent.java */
        public static final class e implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.search.di.c f196557a;

            public e(com.avito.android.messenger.map.search.di.c cVar) {
                this.f196557a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196557a.B0();
            }
        }

        public c(com.avito.android.messenger.map.search.di.c cVar, GeoSearchFragment geoSearchFragment, String str, GeoPoint geoPoint, GeoPoint geoPoint2, String str2, String str3, q.a aVar, C5778a c5778a) {
            this.f196536a = geoSearchFragment;
            this.f196537b = cVar;
            this.f196538c = l.a(str);
            this.f196539d = l.b(geoPoint2);
            l lVarB = l.b(geoPoint);
            b bVar = new b(cVar);
            this.f196540e = bVar;
            d dVar = new d(cVar);
            this.f196541f = dVar;
            this.f196542g = new p(this.f196538c, this.f196539d, lVarB, bVar, dVar);
            this.f196543h = l.a(geoSearchFragment);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f196544i = fVar;
            this.f196545j = new f(fVar, this.f196543h);
            this.f196546k = l.a(str2);
            this.f196547l = l.a(str3);
            this.f196548m = new C5779a(cVar);
            this.f196549n = new w(this.f196541f, this.f196545j, this.f196546k, this.f196547l, this.f196548m, this.f196538c, l.a(aVar), this.f196540e);
            q.b bVarA = dagger.internal.q.a(2);
            bVarA.a(com.avito.android.messenger.map.search.l.class, this.f196542g);
            bVarA.a(com.avito.android.messenger.map.search.t.class, this.f196549n);
            dagger.internal.f.a(this.f196544i, B.a(new P(bVarA.b())));
            this.f196552q = new C47743i(new e(cVar), new C5780c(cVar));
        }

        @Override // com.avito.android.messenger.map.search.di.b
        public final void a(GeoSearchFragment geoSearchFragment) throws BlueprintCollisionException {
            dagger.internal.f fVar = this.f196544i;
            N n12 = (N) fVar.get();
            int i12 = com.avito.android.messenger.map.search.di.d.f196558a;
            GeoSearchFragment geoSearchFragment2 = this.f196536a;
            geoSearchFragment.f196486n0 = (com.avito.android.messenger.map.search.q) new P0(geoSearchFragment2, n12).a(com.avito.android.messenger.map.search.t.class);
            com.avito.android.messenger.map.search.adapter.b bVar = new com.avito.android.messenger.map.search.adapter.b(new com.avito.android.messenger.map.search.adapter.c((com.avito.android.messenger.map.search.q) new P0(geoSearchFragment2, (N) fVar.get()).a(com.avito.android.messenger.map.search.t.class)));
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(bVar);
            com.avito.konveyor.a aVarA = c10493a.a();
            geoSearchFragment.f196487o0 = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
            com.avito.android.messenger.map.search.adapter.b bVar2 = new com.avito.android.messenger.map.search.adapter.b(new com.avito.android.messenger.map.search.adapter.c((com.avito.android.messenger.map.search.q) new P0(geoSearchFragment2, (N) fVar.get()).a(com.avito.android.messenger.map.search.t.class)));
            a.C10493a c10493a2 = new a.C10493a();
            c10493a2.b(bVar2);
            geoSearchFragment.f196488p0 = c10493a2.a();
            InterfaceC32572u interfaceC32572uX0 = this.f196537b.x0();
            t.c(interfaceC32572uX0);
            geoSearchFragment.f196489q0 = interfaceC32572uX0;
            geoSearchFragment.f196490r0 = this.f196552q;
        }
    }

    public static b.a a() {
        return new b();
    }
}
