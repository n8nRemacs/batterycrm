package com.avito.android.extended_profile_serp.adapter.search_correction;

import Y41.l;
import Y61.k;
import bB.InterfaceC25487a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchCorrectionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/search_correction/e;", "Lcom/avito/android/extended_profile_serp/adapter/search_correction/c;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC25487a, G0> f152622b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC25487a, G0> lVar) {
        this.f152622b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SearchCorrectionItem searchCorrectionItem = (SearchCorrectionItem) aVar;
        gVar.b(searchCorrectionItem.f152613d);
        gVar.Z3(searchCorrectionItem.f152614e, new d(searchCorrectionItem, this));
    }
}
