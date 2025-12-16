package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/search_bar/g;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/search_bar/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<zw.b, G0> f136869b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super zw.b, G0> lVar) {
        this.f136869b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.r0(new e(this));
        iVar.D70(aVar2.f136862c);
        iVar.setQuery(aVar2.f136861b);
        iVar.dI(new f(this));
        iVar.UP();
    }
}
