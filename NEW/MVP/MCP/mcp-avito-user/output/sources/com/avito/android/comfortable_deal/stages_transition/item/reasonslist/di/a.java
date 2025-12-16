package com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di;

import Y41.l;
import com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.b;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.g;
import dagger.internal.u;
import fq.InterfaceC40463a;
import kotlin.G0;

/* compiled from: DaggerReasonsListViewComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerReasonsListViewComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.b.a
        public final com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.b a(l<? super InterfaceC40463a, G0> lVar) {
            lVar.getClass();
            return new c(lVar, null);
        }
    }

    /* compiled from: DaggerReasonsListViewComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC40463a, G0> f122914a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f122915b;

        public c() {
            throw null;
        }

        public c(l lVar, C3654a c3654a) {
            this.f122914a = lVar;
            this.f122915b = g.d(new d(new e(new com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.f(dagger.internal.l.a(lVar)))));
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.b
        public final void a(com.avito.android.comfortable_deal.stages_transition.item.reasonslist.g gVar) throws BlueprintCollisionException {
            u<com.avito.konveyor.adapter.a> uVar = this.f122915b;
            com.avito.konveyor.adapter.a aVar = uVar.get();
            com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.e eVar = new com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.e(this.f122914a);
            int i12 = com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di.c.f122916a;
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(new com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.a(eVar));
            gVar.f122921c = new j(aVar, c10493a.a());
            gVar.f122922d = uVar.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
