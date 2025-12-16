package com.avito.android.realty_agency.inline_filters.developer_suggest.di;

import android.content.res.Resources;
import com.avito.android.realty_agency.inline_filters.developer_suggest.di.b;
import com.avito.android.realty_agency.inline_filters.developer_suggest.k;
import com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.g;
import com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.i;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import dagger.internal.e;
import dagger.internal.t;
import ni0.InterfaceC44430a;

/* compiled from: DaggerDeveloperSuggestFilterComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerDeveloperSuggestFilterComponent.java */
    public static final class b implements com.avito.android.realty_agency.inline_filters.developer_suggest.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final String f251524a;

        /* renamed from: b, reason: collision with root package name */
        public final DevelopmentSuggestV1Suggest f251525b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.realty_agency.inline_filters.developer_suggest.di.c f251526c;

        /* renamed from: d, reason: collision with root package name */
        public final Resources f251527d;

        public b(com.avito.android.realty_agency.inline_filters.developer_suggest.di.c cVar, Resources resources, String str, DevelopmentSuggestV1Suggest developmentSuggestV1Suggest, C7545a c7545a) {
            this.f251524a = str;
            this.f251525b = developmentSuggestV1Suggest;
            this.f251526c = cVar;
            this.f251527d = resources;
        }

        @Override // com.avito.android.realty_agency.inline_filters.developer_suggest.di.b
        public final void a(com.avito.android.realty_agency.inline_filters.developer_suggest.d dVar) {
            com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.e eVar = new com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.e(this.f251525b, this.f251524a);
            InterfaceC44430a interfaceC44430aP7 = this.f251526c.p7();
            t.c(interfaceC44430aP7);
            dVar.f251520G = new k(new g(new com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.c(interfaceC44430aP7), eVar, new i(), new com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.k(new com.avito.android.realty_agency.inline_filters.developer_suggest.b(this.f251527d))), null, 2, null);
        }
    }

    /* compiled from: DaggerDeveloperSuggestFilterComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.realty_agency.inline_filters.developer_suggest.di.b.a
        public final com.avito.android.realty_agency.inline_filters.developer_suggest.di.b a(com.avito.android.realty_agency.inline_filters.developer_suggest.di.c cVar, Resources resources, String str, DevelopmentSuggestV1Suggest developmentSuggestV1Suggest) {
            resources.getClass();
            return new b(cVar, resources, str, developmentSuggestV1Suggest, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
