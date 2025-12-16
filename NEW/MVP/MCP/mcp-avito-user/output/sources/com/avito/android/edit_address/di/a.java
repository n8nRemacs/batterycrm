package com.avito.android.edit_address.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_address.EditAddressMviFragment;
import com.avito.android.edit_address.adapter.schedule.f;
import com.avito.android.edit_address.di.b;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_address.h;
import com.avito.android.edit_address.mvi.i;
import com.avito.android.edit_address.mvi.n;
import com.avito.android.edit_address.t;
import com.avito.android.profile_settings_extended.P;
import com.avito.android.profile_settings_extended.S;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.common.collect.H1;
import com.google.gson.Gson;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerEditAddressComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEditAddressComponent.java */
    public static final class b implements com.avito.android.edit_address.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f145824a;

        /* renamed from: b, reason: collision with root package name */
        public final l f145825b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.edit_address.mvi.d f145826c;

        /* renamed from: d, reason: collision with root package name */
        public final u<D0> f145827d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Gson> f145828e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f145829f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.edit_address.e> f145830g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.edit_address.mvi.b f145831h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC35863o4> f145832i;

        /* renamed from: j, reason: collision with root package name */
        public final u<P> f145833j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_extended.adapter.geo.a> f145834k;

        /* renamed from: l, reason: collision with root package name */
        public final n f145835l;

        /* renamed from: m, reason: collision with root package name */
        public final t f145836m;

        /* renamed from: n, reason: collision with root package name */
        public final u<f> f145837n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.edit_address.adapter.location.d> f145838o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.edit_address.adapter.add_schedule.d> f145839p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f145840q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f145841r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f145842s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f145843t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f145844u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f145845v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f145846w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC28481c> f145847x;

        /* renamed from: y, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f145848y;

        /* compiled from: DaggerEditAddressComponent.java */
        /* renamed from: com.avito.android.edit_address.di.a$b$a, reason: collision with other inner class name */
        public static final class C4239a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f145849a;

            public C4239a(InterfaceC29970g interfaceC29970g) {
                this.f145849a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f145849a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditAddressComponent.java */
        /* renamed from: com.avito.android.edit_address.di.a$b$b, reason: collision with other inner class name */
        public static final class C4240b implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f145850a;

            public C4240b(InterfaceC29970g interfaceC29970g) {
                this.f145850a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f145850a.b7();
                dagger.internal.t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerEditAddressComponent.java */
        public static final class c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f145851a;

            public c(InterfaceC29970g interfaceC29970g) {
                this.f145851a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f145851a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerEditAddressComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f145852a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f145852a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f145852a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerEditAddressComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f145853a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f145853a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f145853a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC29970g interfaceC29970g, Fragment fragment, String str, ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress, Resources resources, Boolean bool, C28478k c28478k, C4238a c4238a) {
            this.f145824a = l.a(str);
            this.f145825b = l.b(extendedProfilesSettingsAddress);
            this.f145826c = new com.avito.android.edit_address.mvi.d(this.f145824a, this.f145825b, l.a(bool));
            u<com.avito.android.edit_address.e> uVarD = g.d(new h(new C4240b(interfaceC29970g), new c(interfaceC29970g), new C4239a(interfaceC29970g)));
            this.f145830g = uVarD;
            this.f145831h = new com.avito.android.edit_address.mvi.b(this.f145825b, uVarD);
            this.f145832i = new d(interfaceC29970g);
            u<P> uVarD2 = g.d(new S(l.a(resources)));
            this.f145833j = uVarD2;
            u<com.avito.android.profile_settings_extended.adapter.geo.a> uVarD3 = g.d(new com.avito.android.profile_settings_extended.adapter.geo.d(uVarD2, this.f145832i));
            this.f145834k = uVarD3;
            this.f145835l = new n(uVarD3, this.f145832i);
            this.f145836m = new t(new com.avito.android.edit_address.mvi.g(this.f145826c, this.f145831h, i.a(), this.f145835l));
            this.f145837n = g.d(com.avito.android.edit_address.adapter.schedule.h.a());
            this.f145838o = g.d(com.avito.android.edit_address.adapter.location.h.a());
            this.f145839p = g.d(com.avito.android.edit_address.adapter.add_schedule.g.a());
            this.f145840q = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f145841r = g.d(new com.avito.android.edit_address.adapter.schedule.c(this.f145837n));
            this.f145842s = g.d(new com.avito.android.edit_address.adapter.location.c(this.f145838o));
            this.f145843t = g.d(new com.avito.android.edit_address.adapter.add_schedule.c(this.f145839p));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f145840q);
            u<TV0.b<?, ?>> uVar = this.f145841r;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f145842s);
            list.add(this.f145843t);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f145844u = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f145845v = uVarH;
            this.f145846w = g.d(new com.avito.android.edit_address.di.d(uVarH, this.f145844u));
            this.f145847x = new e(interfaceC29970g);
            this.f145848y = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f145847x);
        }

        @Override // com.avito.android.edit_address.di.b
        public final void a(EditAddressMviFragment editAddressMviFragment) {
            editAddressMviFragment.f145751n0 = this.f145836m;
            editAddressMviFragment.f145753p0 = H1.K(this.f145837n.get(), this.f145838o.get(), this.f145839p.get());
            editAddressMviFragment.f145754q0 = this.f145846w.get();
            editAddressMviFragment.f145755r0 = this.f145848y.get();
        }
    }

    /* compiled from: DaggerEditAddressComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.edit_address.di.b.a
        public final com.avito.android.edit_address.di.b a(EditAddressMviFragment editAddressMviFragment, String str, ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress, Resources resources, boolean z12, C28478k c28478k, InterfaceC29970g interfaceC29970g) {
            str.getClass();
            return new b(interfaceC29970g, editAddressMviFragment, str, extendedProfilesSettingsAddress, resources, Boolean.valueOf(z12), c28478k, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
