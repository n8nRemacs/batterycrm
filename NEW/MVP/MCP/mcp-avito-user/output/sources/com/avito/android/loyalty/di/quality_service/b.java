package com.avito.android.loyalty.di.quality_service;

import com.avito.android.deep_linking.links.w;
import com.avito.android.loyalty.di.quality_service.f;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerPopupBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: DaggerPopupBottomSheetComponent.java */
    /* renamed from: com.avito.android.loyalty.di.quality_service.b$b, reason: collision with other inner class name */
    public static final class C5372b implements f.a {
        public C5372b() {
        }

        @Override // com.avito.android.loyalty.di.quality_service.f.a
        public final f a(com.avito.android.cpt.pre_activation.ui.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, cVar, null);
        }
    }

    /* compiled from: DaggerPopupBottomSheetComponent.java */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f183122a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183123b = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f183124c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183125d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183126e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f183127f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f183128g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f183129h;

        public c(cv.b bVar, w wVar, a aVar) {
            this.f183122a = bVar;
            dagger.internal.l lVarA = dagger.internal.l.a(wVar);
            this.f183124c = lVarA;
            this.f183125d = dagger.internal.g.d(new com.avito.android.loyalty.ui.quality_service.items.text.b(new com.avito.android.loyalty.ui.quality_service.items.text.d(lVarA)));
            this.f183126e = dagger.internal.g.d(new com.avito.android.loyalty.ui.quality_service.items.plate.b(new com.avito.android.loyalty.ui.quality_service.items.plate.d(this.f183124c)));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f183123b);
            u<TV0.b<?, ?>> uVar = this.f183125d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f183126e);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f183127f = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f183128g = uVarH;
            this.f183129h = dagger.internal.g.d(new n(uVarH, this.f183127f));
        }

        @Override // com.avito.android.loyalty.di.quality_service.f
        public final void a(com.avito.android.loyalty.ui.quality_service.d dVar) {
            dVar.f183798F = this.f183129h.get();
            dVar.f183799G = this.f183128g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183122a.u4();
            t.c(aVarU4);
            dVar.f183800H = aVarU4;
        }
    }

    public static f.a a() {
        return new C5372b();
    }
}
