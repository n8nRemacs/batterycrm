package com.avito.android.messenger.map.viewing.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.P0;
import com.avito.android.U0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import com.avito.android.location.find.p;
import com.avito.android.location.find.x;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.map.viewing.A;
import com.avito.android.messenger.map.viewing.PlatformMapFragment;
import com.avito.android.messenger.map.viewing.di.b;
import com.avito.android.messenger.map.viewing.w;
import com.avito.android.messenger.map.viewing.y;
import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.G;
import com.avito.android.permissions.r;
import com.avito.android.permissions.z;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import lW.C43692b;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerPlatformMapFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPlatformMapFragmentComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.messenger.map.viewing.di.c f196812a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f196813b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f196814c;

        /* renamed from: d, reason: collision with root package name */
        public PlatformMapFragment f196815d;

        /* renamed from: e, reason: collision with root package name */
        public ActivityC22955m f196816e;

        /* renamed from: f, reason: collision with root package name */
        public FragmentManager f196817f;

        /* renamed from: g, reason: collision with root package name */
        public GeoMarker[] f196818g;

        /* renamed from: h, reason: collision with root package name */
        public MarkersRequest f196819h;

        public b() {
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f196813b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a b(Resources resources) {
            this.f196814c = resources;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final com.avito.android.messenger.map.viewing.di.b build() {
            t.a(com.avito.android.messenger.map.viewing.di.c.class, this.f196812a);
            t.a(cv.b.class, this.f196813b);
            t.a(Resources.class, this.f196814c);
            t.a(Fragment.class, this.f196815d);
            t.a(Activity.class, this.f196816e);
            t.a(FragmentManager.class, this.f196817f);
            t.a(GeoMarker[].class, this.f196818g);
            return new c(this.f196812a, this.f196813b, this.f196814c, this.f196815d, this.f196816e, this.f196817f, this.f196818g, this.f196819h, null);
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a c(MarkersRequest markersRequest) {
            this.f196819h = markersRequest;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a d(ActivityC22955m activityC22955m) {
            this.f196816e = activityC22955m;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a e(FragmentManager fragmentManager) {
            this.f196817f = fragmentManager;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a f(GeoMarker[] geoMarkerArr) {
            this.f196818g = geoMarkerArr;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a g(com.avito.android.messenger.map.viewing.di.c cVar) {
            this.f196812a = cVar;
            return this;
        }

        @Override // com.avito.android.messenger.map.viewing.di.b.a
        public final b.a h(PlatformMapFragment platformMapFragment) {
            this.f196815d = platformMapFragment;
            return this;
        }
    }

    /* compiled from: DaggerPlatformMapFragmentComponent.java */
    public static final class c implements com.avito.android.messenger.map.viewing.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.messenger.map.viewing.di.c f196820a;

        /* renamed from: b, reason: collision with root package name */
        public final Fragment f196821b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f196822c;

        /* renamed from: d, reason: collision with root package name */
        public final l f196823d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC47842z> f196824e;

        /* renamed from: f, reason: collision with root package name */
        public final w f196825f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f196826g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35741a1> f196827h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f196828i;

        /* renamed from: j, reason: collision with root package name */
        public final j f196829j;

        /* renamed from: k, reason: collision with root package name */
        public final u<N> f196830k;

        /* compiled from: DaggerPlatformMapFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.map.viewing.di.a$c$a, reason: collision with other inner class name */
        public static final class C5791a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.viewing.di.c f196831a;

            public C5791a(com.avito.android.messenger.map.viewing.di.c cVar) {
                this.f196831a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f196831a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerPlatformMapFragmentComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f196832a;

            public b(cv.b bVar) {
                this.f196832a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f196832a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPlatformMapFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.map.viewing.di.a$c$c, reason: collision with other inner class name */
        public static final class C5792c implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.viewing.di.c f196833a;

            public C5792c(com.avito.android.messenger.map.viewing.di.c cVar) {
                this.f196833a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f196833a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerPlatformMapFragmentComponent.java */
        public static final class d implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.viewing.di.c f196834a;

            public d(com.avito.android.messenger.map.viewing.di.c cVar) {
                this.f196834a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f196834a.d0();
            }
        }

        /* compiled from: DaggerPlatformMapFragmentComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.map.viewing.di.c f196835a;

            public e(com.avito.android.messenger.map.viewing.di.c cVar) {
                this.f196835a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f196835a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.messenger.map.viewing.di.c cVar, cv.b bVar, Resources resources, Fragment fragment, Activity activity, FragmentManager fragmentManager, GeoMarker[] geoMarkerArr, MarkersRequest markersRequest, C5790a c5790a) {
            this.f196820a = cVar;
            this.f196821b = fragment;
            this.f196822c = new e(cVar);
            this.f196823d = l.a(geoMarkerArr);
            this.f196824e = new d(cVar);
            this.f196825f = new w(this.f196823d, l.b(markersRequest), this.f196824e);
            this.f196826g = new C5791a(cVar);
            this.f196827h = new C5792c(cVar);
            this.f196829j = new j(this.f196822c, this.f196825f, this.f196826g, this.f196827h, l.a(resources), new b(bVar));
            q.b bVarA = q.a(1);
            bVarA.a(A.class, this.f196829j);
            this.f196830k = B.a(new P(bVarA.b()));
        }

        @Override // com.avito.android.messenger.map.viewing.di.b
        public final void a(PlatformMapFragment platformMapFragment) {
            this.f196830k.get();
            platformMapFragment.getClass();
            com.avito.android.messenger.map.viewing.di.c cVar = this.f196820a;
            platformMapFragment.f196795o0 = cVar.h();
            N n12 = this.f196830k.get();
            com.avito.android.messenger.map.viewing.di.d dVar = com.avito.android.messenger.map.viewing.di.d.f196836a;
            dVar.getClass();
            platformMapFragment.f196796p0 = (y) new P0(this.f196821b, n12).a(A.class);
            U0 u0X0 = cVar.X0();
            dVar.getClass();
            platformMapFragment.f196797q0 = u0X0.v().invoke().booleanValue() ? new YandexAvitoMapAttachHelper(false, 1, null) : new GoogleAvitoMapAttachHelper();
            G gN2 = cVar.N();
            z zVarA = cVar.A();
            t.c(zVarA);
            r rVar = new r(gN2, zVarA);
            dVar.getClass();
            platformMapFragment.f196798r0 = new C33035e(rVar);
            com.avito.android.geo.j jVarC0 = cVar.c0();
            t.c(jVarC0);
            dVar.getClass();
            com.avito.android.location.find.c cVar2 = new com.avito.android.location.find.c(jVarC0);
            dVar.getClass();
            com.avito.android.location.find.e eVar = new com.avito.android.location.find.e(cVar2);
            com.avito.android.geo.j jVarC02 = cVar.c0();
            t.c(jVarC02);
            platformMapFragment.f196799s0 = new p(eVar, new x(new com.avito.android.location.find.u(jVarC02)));
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            com.avito.android.server_time.f fVarL = cVar.l();
            t.c(fVarL);
            platformMapFragment.f196800t0 = new C43692b(interfaceC28373aA, fVarL);
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            platformMapFragment.f196801u0 = interfaceC35745a5D;
            InterfaceC32572u interfaceC32572uX0 = cVar.x0();
            t.c(interfaceC32572uX0);
            platformMapFragment.f196802v0 = interfaceC32572uX0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
