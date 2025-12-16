package com.avito.android.loyalty.di.badge_details;

import com.avito.android.deep_linking.links.w;
import com.avito.android.loyalty.di.badge_details.a;
import com.avito.android.loyalty.ui.items.attributed_text.f;
import com.avito.android.loyalty.ui.items.collapse.g;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerBadgeDetailsBottomSheetComponent.java */
@e
/* loaded from: classes14.dex */
public final class d {

    /* compiled from: DaggerBadgeDetailsBottomSheetComponent.java */
    public static final class b implements com.avito.android.loyalty.di.badge_details.a {

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.attributed_text.c f182987b;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.collapse.c f182990e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f182991f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f182992g;

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f182986a = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.image.c f182988c = new com.avito.android.loyalty.ui.items.image.c(com.avito.android.loyalty.ui.items.image.e.a());

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.spacer.c f182989d = new com.avito.android.loyalty.ui.items.spacer.c(com.avito.android.loyalty.ui.items.spacer.e.a());

        public b(com.avito.android.loyalty.ui.items.collapse.d dVar, w wVar, a aVar) {
            this.f182987b = new com.avito.android.loyalty.ui.items.attributed_text.c(new f(l.a(wVar)));
            this.f182990e = new com.avito.android.loyalty.ui.items.collapse.c(new g(l.a(dVar)));
            A.b bVarA = A.a(4, 1);
            bVarA.f393938b.add(this.f182986a);
            com.avito.android.loyalty.ui.items.attributed_text.c cVar = this.f182987b;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar);
            list.add(this.f182988c);
            list.add(this.f182989d);
            list.add(this.f182990e);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f182991f = uVarK;
            this.f182992g = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
        }

        @Override // com.avito.android.loyalty.di.badge_details.a
        public final void a(com.avito.android.loyalty.ui.badge_details.c cVar) {
            com.avito.konveyor.adapter.a aVar = this.f182992g.get();
            com.avito.konveyor.a aVar2 = this.f182991f.get();
            com.avito.android.loyalty.di.badge_details.b.f182985a.getClass();
            cVar.f183253G = new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
        }
    }

    /* compiled from: DaggerBadgeDetailsBottomSheetComponent.java */
    public static final class c implements a.InterfaceC5361a {
        public c() {
        }

        @Override // com.avito.android.loyalty.di.badge_details.a.InterfaceC5361a
        public final com.avito.android.loyalty.di.badge_details.a a(com.avito.android.loyalty.ui.items.collapse.d dVar, w wVar) {
            return new b(dVar, wVar, null);
        }
    }

    public static a.InterfaceC5361a a() {
        return new c();
    }
}
