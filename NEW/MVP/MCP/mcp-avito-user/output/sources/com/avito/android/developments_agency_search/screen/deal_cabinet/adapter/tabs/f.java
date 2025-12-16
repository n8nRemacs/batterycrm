package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TabsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/f;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/h;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.d<h, b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<zw.b, G0> f136893b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super zw.b, G0> lVar) {
        this.f136893b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        b bVar = (b) aVar;
        hVar.P0(bVar.f136887c.ordinal(), bVar.f136886b);
        hVar.KZ();
        hVar.N1(new e(this));
    }
}
