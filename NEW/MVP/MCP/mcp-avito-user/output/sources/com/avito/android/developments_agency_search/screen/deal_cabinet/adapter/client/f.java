package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ClientItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/client/f;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/client/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<zw.b, G0> f136794b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super zw.b, G0> lVar) {
        this.f136794b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        GetClientListResponse.PendingClient pendingClient = aVar2.f136786b;
        hVar.i6(pendingClient.getAvatar(), pendingClient.getName());
        hVar.F1(pendingClient.getName());
        hVar.b5(pendingClient.getPhone());
        hVar.z1(pendingClient.getMedia().getImage());
        hVar.JI(pendingClient.getState().getTitle());
        hVar.Xs(pendingClient.getState().getColors().getTitle());
        hVar.vf(pendingClient.getState().getProgress() / 100.0f, pendingClient.getState().getColors().getProgress());
        hVar.sG(pendingClient.getState().getText());
        hVar.pH(pendingClient.getState().getColors().getText());
        hVar.Za(pendingClient.getPreferences());
        hVar.a(new e(this, aVar2));
    }
}
