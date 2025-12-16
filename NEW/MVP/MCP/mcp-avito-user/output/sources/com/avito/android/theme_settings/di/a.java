package com.avito.android.theme_settings.di;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.theme_settings.ThemeSettingsFragment;
import com.avito.android.theme_settings.di.b;
import com.avito.android.theme_settings.di.f;
import com.google.common.collect.H1;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import nE0.C44244c;
import nE0.InterfaceC44242a;

/* compiled from: DaggerThemeSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerThemeSettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.theme_settings.di.b.a
        public final com.avito.android.theme_settings.di.b a(ThemeSettingsFragment themeSettingsFragment, Context context, com.avito.android.theme_settings.di.c cVar) {
            return new c(cVar, themeSettingsFragment, context, null);
        }
    }

    /* compiled from: DaggerThemeSettingsComponent.java */
    public static final class c implements com.avito.android.theme_settings.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f301308a = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.theme_settings.item.theme_checkmark.d> f301309b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301310c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.theme_settings.item.switcher.d> f301311d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301312e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f301313f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f301314g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f301315h;

        /* renamed from: i, reason: collision with root package name */
        public final l f301316i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.lib.util.darkTheme.a> f301317j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC44242a> f301318k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.theme_settings.viewmodel.b> f301319l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28373a> f301320m;

        /* renamed from: n, reason: collision with root package name */
        public final u<P0.c> f301321n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.theme_settings.viewmodel.e> f301322o;

        /* renamed from: p, reason: collision with root package name */
        public final u<h1> f301323p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Y0> f301324q;

        /* renamed from: r, reason: collision with root package name */
        public final u<GridLayoutManager.c> f301325r;

        /* compiled from: DaggerThemeSettingsComponent.java */
        /* renamed from: com.avito.android.theme_settings.di.a$c$a, reason: collision with other inner class name */
        public static final class C9220a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.theme_settings.di.c f301326a;

            public C9220a(com.avito.android.theme_settings.di.c cVar) {
                this.f301326a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f301326a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerThemeSettingsComponent.java */
        public static final class b implements u<com.avito.android.lib.util.darkTheme.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.theme_settings.di.c f301327a;

            public b(com.avito.android.theme_settings.di.c cVar) {
                this.f301327a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.lib.util.darkTheme.a aVarB6 = this.f301327a.b6();
                t.c(aVarB6);
                return aVarB6;
            }
        }

        public c(com.avito.android.theme_settings.di.c cVar, Fragment fragment, Context context, C9219a c9219a) {
            u<com.avito.android.theme_settings.item.theme_checkmark.d> uVarD = dagger.internal.g.d(com.avito.android.theme_settings.item.theme_checkmark.g.a());
            this.f301309b = uVarD;
            this.f301310c = dagger.internal.g.d(new com.avito.android.theme_settings.item.theme_checkmark.c(uVarD));
            u<com.avito.android.theme_settings.item.switcher.d> uVarD2 = dagger.internal.g.d(com.avito.android.theme_settings.item.switcher.g.a());
            this.f301311d = uVarD2;
            this.f301312e = dagger.internal.g.d(new com.avito.android.theme_settings.item.switcher.c(uVarD2));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f301308a);
            u<TV0.b<?, ?>> uVar = this.f301310c;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f301312e);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f301313f = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f301314g = uVarH;
            this.f301315h = dagger.internal.g.d(new g(uVarH, this.f301313f));
            this.f301316i = l.a(fragment);
            this.f301317j = new b(cVar);
            u<InterfaceC44242a> uVarD3 = dagger.internal.g.d(new C44244c(l.a(context)));
            this.f301318k = uVarD3;
            u<com.avito.android.theme_settings.viewmodel.b> uVarD4 = dagger.internal.g.d(new com.avito.android.theme_settings.viewmodel.d(uVarD3));
            this.f301319l = uVarD4;
            u<P0.c> uVarD5 = dagger.internal.g.d(new com.avito.android.theme_settings.viewmodel.g(uVarD4, this.f301317j, this.f301318k, new C9220a(cVar)));
            this.f301321n = uVarD5;
            this.f301322o = dagger.internal.g.d(new j(this.f301316i, uVarD5));
            u<h1> uVarD6 = dagger.internal.g.d(f.a.f301329a);
            this.f301323p = uVarD6;
            u<Y0> uVarD7 = dagger.internal.g.d(new i(uVarD6));
            this.f301324q = uVarD7;
            this.f301325r = dagger.internal.g.d(new h(uVarD7));
        }

        @Override // com.avito.android.theme_settings.di.b
        public final void a(ThemeSettingsFragment themeSettingsFragment) {
            themeSettingsFragment.f301290f0 = this.f301315h.get();
            themeSettingsFragment.f301291g0 = this.f301314g.get();
            themeSettingsFragment.f301292h0 = this.f301322o.get();
            themeSettingsFragment.f301293i0 = H1.I(this.f301309b.get(), this.f301311d.get());
            themeSettingsFragment.f301294j0 = this.f301323p.get();
            themeSettingsFragment.f301295k0 = this.f301325r.get();
            themeSettingsFragment.f301296l0 = this.f301324q.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
