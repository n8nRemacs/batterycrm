package com.avito.android.guests_selector.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.guests_selector.GuestsSelectorDialogFragment;
import com.avito.android.guests_selector.GuestsSelectorOpenParams;
import com.avito.android.guests_selector.di.b;
import com.avito.android.guests_selector.mvi.m;
import com.avito.android.guests_selector.mvi.o;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import gI.InterfaceC40585a;
import java.util.List;
import kotlin.G0;

/* compiled from: DaggerGuestsSelectorComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGuestsSelectorComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.guests_selector.di.b.a
        public final com.avito.android.guests_selector.di.b a(r rVar, GuestsSelectorOpenParams guestsSelectorOpenParams, Y41.l<? super InterfaceC40585a, G0> lVar, l lVar2) {
            guestsSelectorOpenParams.getClass();
            return new c(lVar2, rVar, guestsSelectorOpenParams, lVar, null);
        }
    }

    /* compiled from: DaggerGuestsSelectorComponent.java */
    public static final class c implements com.avito.android.guests_selector.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.guests_selector.mvi.e f161412a;

        /* renamed from: b, reason: collision with root package name */
        public final u<m> f161413b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.guests_selector.mvi.l f161414c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f161415d;

        /* renamed from: e, reason: collision with root package name */
        public final u<C28478k> f161416e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f161417f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.guests_selector.r f161418g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f161419h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f161420i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f161421j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f161422k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f161423l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f161424m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f161425n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f161426o;

        /* compiled from: DaggerGuestsSelectorComponent.java */
        /* renamed from: com.avito.android.guests_selector.di.a$c$a, reason: collision with other inner class name */
        public static final class C4730a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f161427a;

            public C4730a(l lVar) {
                this.f161427a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f161427a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(l lVar, r rVar, GuestsSelectorOpenParams guestsSelectorOpenParams, Y41.l lVar2, C4729a c4729a) {
            this.f161412a = new com.avito.android.guests_selector.mvi.e(dagger.internal.l.a(guestsSelectorOpenParams));
            u<m> uVarD = dagger.internal.g.d(new o(com.avito.android.guests_selector.converter.b.a()));
            this.f161413b = uVarD;
            this.f161414c = new com.avito.android.guests_selector.mvi.l(uVarD);
            this.f161415d = new C4730a(lVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new j(dagger.internal.l.a(rVar)));
            this.f161416e = uVarD2;
            this.f161417f = dagger.internal.g.d(new k(uVarD2, this.f161415d));
            this.f161418g = new com.avito.android.guests_selector.r(new com.avito.android.guests_selector.mvi.h(this.f161412a, com.avito.android.guests_selector.mvi.c.a(), com.avito.android.guests_selector.mvi.j.a(), this.f161414c, this.f161417f));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar2);
            this.f161419h = lVarA;
            this.f161420i = dagger.internal.g.d(new com.avito.android.guests_selector.items.adults_stepper.b(new com.avito.android.guests_selector.items.adults_stepper.e(lVarA)));
            this.f161421j = dagger.internal.g.d(new com.avito.android.guests_selector.items.children_add_button.b(new com.avito.android.guests_selector.items.children_add_button.e(this.f161419h)));
            this.f161422k = dagger.internal.g.d(new com.avito.android.guests_selector.items.child.b(new com.avito.android.guests_selector.items.child.e(this.f161419h)));
            this.f161423l = dagger.internal.g.d(new com.avito.android.guests_selector.items.swither.b(new com.avito.android.guests_selector.items.swither.e(this.f161419h)));
            A.b bVarA = A.a(4, 0);
            u<TV0.b<?, ?>> uVar = this.f161420i;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f161421j);
            list.add(this.f161422k);
            list.add(this.f161423l);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new g(bVarA.b()));
            this.f161424m = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new f(uVarD3));
            this.f161425n = uVarD4;
            this.f161426o = dagger.internal.g.d(new h(uVarD4, this.f161424m, com.avito.android.guests_selector.items.b.a()));
        }

        @Override // com.avito.android.guests_selector.di.b
        public final void a(GuestsSelectorDialogFragment guestsSelectorDialogFragment) {
            guestsSelectorDialogFragment.f161342h0 = this.f161418g;
            guestsSelectorDialogFragment.f161344j0 = this.f161417f.get();
            guestsSelectorDialogFragment.f161345k0 = this.f161426o.get();
            guestsSelectorDialogFragment.f161346l0 = new com.avito.android.guests_selector.j(this.f161424m.get());
        }
    }

    public static b.a a() {
        return new b();
    }
}
