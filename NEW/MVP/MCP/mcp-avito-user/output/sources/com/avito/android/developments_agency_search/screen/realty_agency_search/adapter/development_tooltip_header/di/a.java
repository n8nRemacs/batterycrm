package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di;

import android.view.View;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.p;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.c;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.t1;

/* compiled from: DaggerDevelopmentTooltipHeaderComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerDevelopmentTooltipHeaderComponent.java */
    public static final class b implements com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final View f138353a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.b f138354b;

        /* renamed from: c, reason: collision with root package name */
        public final h f138355c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f138356d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f138357e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f138358f;

        public b() {
            throw null;
        }

        public b(com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.b bVar, View view, com.jakewharton.rxrelay3.c cVar, C4174a c4174a) {
            this.f138353a = view;
            this.f138354b = bVar;
            this.f138355c = new h(new i(l.a(cVar)));
            this.f138356d = B.a(com.avito.android.konveyor_adapter_module.d.a());
            A.b bVarA = A.a(1, 1);
            bVarA.f393937a.add(this.f138355c);
            bVarA.f393938b.add(this.f138356d);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f138357e = uVarK;
            this.f138358f = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
        }

        @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.c
        public final void a(com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i iVar) {
            com.avito.konveyor.adapter.a aVar = this.f138358f.get();
            com.avito.konveyor.a aVar2 = this.f138357e.get();
            d dVar = d.f138359a;
            dVar.getClass();
            View viewFindViewById = this.f138353a.findViewById(R.id.gallery);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            iVar.f138370e = new p(viewFindViewById, aVar, aVar2, null, false, Integer.valueOf(y6.b(3)), null, false, 192, null);
            R0 r0C = this.f138354b.c();
            t.c(r0C);
            dVar.getClass();
            iVar.f138371f = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r0C.b()));
        }
    }

    /* compiled from: DaggerDevelopmentTooltipHeaderComponent.java */
    public static final class c implements c.a {
        public c() {
        }

        @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.c.a
        public final com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.c a(com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.b bVar, View view, com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar) {
            view.getClass();
            return new b(bVar, view, cVar, null);
        }
    }

    public static c.a a() {
        return new c();
    }
}
