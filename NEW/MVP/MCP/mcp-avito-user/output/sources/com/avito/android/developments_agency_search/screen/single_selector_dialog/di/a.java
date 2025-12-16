package com.avito.android.developments_agency_search.screen.single_selector_dialog.di;

import Y41.l;
import com.avito.android.developments_agency_search.adapter.checkable_item.g;
import com.avito.android.developments_agency_search.screen.single_selector_dialog.di.b;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.u;
import java.util.Set;
import kotlin.G0;

/* compiled from: DaggerSingleSelectorBottomSheetDialogComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerSingleSelectorBottomSheetDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.developments_agency_search.screen.single_selector_dialog.di.b.a
        public final com.avito.android.developments_agency_search.screen.single_selector_dialog.di.b a(l<? super String, G0> lVar) {
            return new c(lVar, null);
        }
    }

    /* compiled from: DaggerSingleSelectorBottomSheetDialogComponent.java */
    public static final class c implements com.avito.android.developments_agency_search.screen.single_selector_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f139054a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.adapter.checkable_item.c f139055b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f139056c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f139057d;

        public c() {
            throw null;
        }

        public c(l lVar, C4190a c4190a) {
            this.f139054a = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f139055b = new com.avito.android.developments_agency_search.adapter.checkable_item.c(new g(dagger.internal.l.a(lVar)));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f139054a);
            bVarA.f393937a.add(this.f139055b);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f139056c = uVarK;
            this.f139057d = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
        }

        @Override // com.avito.android.developments_agency_search.screen.single_selector_dialog.di.b
        public final void a(com.avito.android.developments_agency_search.screen.single_selector_dialog.b bVar) {
            com.avito.konveyor.adapter.a aVar = this.f139057d.get();
            com.avito.konveyor.a aVar2 = this.f139056c.get();
            com.avito.android.developments_agency_search.screen.single_selector_dialog.di.c.f139058a.getClass();
            bVar.f139051H = new j(aVar, aVar2);
            bVar.f139052I = this.f139057d.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
