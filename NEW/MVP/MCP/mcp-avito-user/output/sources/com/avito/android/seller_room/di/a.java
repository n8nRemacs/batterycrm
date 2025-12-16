package com.avito.android.seller_room.di;

import FV0.h;
import Yq0.InterfaceC18319a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.seller_room.di.b;
import com.avito.android.seller_room.mvi.g;
import com.avito.android.seller_room.mvi.j;
import com.avito.android.seller_room.ui.SellerRoomFragment;
import com.avito.android.seller_room.ui.SellerRoomOpenParams;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerSellerRoomComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSellerRoomComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.seller_room.di.b.a
        public final com.avito.android.seller_room.di.b a(ScreenPerformanceTracker screenPerformanceTracker, SellerRoomOpenParams sellerRoomOpenParams, C31138n0 c31138n0, com.avito.android.seller_room.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(c31138n0, cVar, interfaceC39417a, screenPerformanceTracker, sellerRoomOpenParams, null);
        }
    }

    /* compiled from: DaggerSellerRoomComponent.java */
    public static final class c implements com.avito.android.seller_room.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<R0> f268115a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC18319a> f268116b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Gson> f268117c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.seller_room.mvi.e f268118d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.seller_room.mvi.c f268119e;

        /* renamed from: f, reason: collision with root package name */
        public final l f268120f;

        /* renamed from: g, reason: collision with root package name */
        public final j f268121g;

        /* renamed from: h, reason: collision with root package name */
        public final u<n.a> f268122h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Set<h>> f268123i;

        /* renamed from: j, reason: collision with root package name */
        public final C31151u0 f268124j;

        /* renamed from: k, reason: collision with root package name */
        public final u<B> f268125k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.seller_room.mvi.n f268126l;

        /* compiled from: DaggerSellerRoomComponent.java */
        /* renamed from: com.avito.android.seller_room.di.a$c$a, reason: collision with other inner class name */
        public static final class C8020a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_room.di.c f268127a;

            public C8020a(com.avito.android.seller_room.di.c cVar) {
                this.f268127a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0P5 = this.f268127a.p5();
                t.c(r0P5);
                return r0P5;
            }
        }

        /* compiled from: DaggerSellerRoomComponent.java */
        public static final class b implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_room.di.c f268128a;

            public b(com.avito.android.seller_room.di.c cVar) {
                this.f268128a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonZ5 = this.f268128a.Z5();
                t.c(gsonZ5);
                return gsonZ5;
            }
        }

        /* compiled from: DaggerSellerRoomComponent.java */
        /* renamed from: com.avito.android.seller_room.di.a$c$c, reason: collision with other inner class name */
        public static final class C8021c implements u<InterfaceC18319a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_room.di.c f268129a;

            public C8021c(com.avito.android.seller_room.di.c cVar) {
                this.f268129a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC18319a interfaceC18319aRh = this.f268129a.Rh();
                t.c(interfaceC18319aRh);
                return interfaceC18319aRh;
            }
        }

        public c(C31138n0 c31138n0, com.avito.android.seller_room.di.c cVar, cv.b bVar, ScreenPerformanceTracker screenPerformanceTracker, SellerRoomOpenParams sellerRoomOpenParams, C8019a c8019a) {
            this.f268115a = new C8020a(cVar);
            this.f268116b = new C8021c(cVar);
            this.f268117c = new b(cVar);
            com.avito.android.seller_room.e eVar = new com.avito.android.seller_room.e(l.a(sellerRoomOpenParams), this.f268115a, this.f268116b, this.f268117c);
            this.f268118d = new com.avito.android.seller_room.mvi.e(eVar);
            this.f268119e = new com.avito.android.seller_room.mvi.c(eVar);
            this.f268120f = l.a(screenPerformanceTracker);
            this.f268121g = new j(this.f268118d, this.f268119e, g.a(), com.avito.android.seller_room.mvi.l.a(), this.f268120f);
            this.f268122h = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f268123i = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f268124j = C31151u0.a(c31138n0);
            this.f268125k = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f268126l = new com.avito.android.seller_room.mvi.n(this.f268121g, this.f268122h, this.f268123i, this.f268115a, this.f268124j, this.f268125k, C31144q0.a(c31138n0));
        }

        @Override // com.avito.android.seller_room.di.b
        public final void a(SellerRoomFragment sellerRoomFragment) {
            sellerRoomFragment.f268219o0 = this.f268126l;
        }
    }

    public static b.a a() {
        return new b();
    }
}
