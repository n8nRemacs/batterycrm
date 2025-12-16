package com.avito.android.loyalty.di.quality_service;

import com.avito.android.deep_linking.links.w;
import com.avito.android.loyalty.di.quality_service.d;
import com.avito.android.loyalty.ui.quality_service.EffectDetailsActivity;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerEffectDetailsComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerEffectDetailsComponent.java */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f183114a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183115b = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f183116c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183117d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183118e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f183119f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f183120g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f183121h;

        public b(cv.b bVar, w wVar, C5371a c5371a) {
            this.f183114a = bVar;
            dagger.internal.l lVarA = dagger.internal.l.a(wVar);
            this.f183116c = lVarA;
            this.f183117d = dagger.internal.g.d(new com.avito.android.loyalty.ui.quality_service.items.text.b(new com.avito.android.loyalty.ui.quality_service.items.text.d(lVarA)));
            this.f183118e = dagger.internal.g.d(new com.avito.android.loyalty.ui.quality_service.items.plate.b(new com.avito.android.loyalty.ui.quality_service.items.plate.d(this.f183116c)));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f183115b);
            u<TV0.b<?, ?>> uVar = this.f183117d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f183118e);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f183119f = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f183120g = uVarH;
            this.f183121h = dagger.internal.g.d(new n(uVarH, this.f183119f));
        }

        @Override // com.avito.android.loyalty.di.quality_service.d
        public final void a(EffectDetailsActivity effectDetailsActivity) {
            effectDetailsActivity.f183767m = this.f183121h.get();
            effectDetailsActivity.f183768n = this.f183120g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183114a.u4();
            t.c(aVarU4);
            effectDetailsActivity.f183769o = aVarU4;
        }
    }

    /* compiled from: DaggerEffectDetailsComponent.java */
    public static final class c implements d.a {
        public c() {
        }

        @Override // com.avito.android.loyalty.di.quality_service.d.a
        public final d a(com.avito.android.cpt.pre_activation.ui.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(interfaceC39417a, cVar, null);
        }
    }

    public static d.a a() {
        return new c();
    }
}
