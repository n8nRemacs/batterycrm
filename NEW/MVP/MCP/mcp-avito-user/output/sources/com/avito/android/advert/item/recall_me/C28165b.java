package com.avito.android.advert.item.recall_me;

import Ai0.C13040a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.RecallMeParams;
import com.avito.android.remote.model.RecallMeRequest;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecallMeAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/recall_me/b;", "Lcom/avito/android/advert/item/recall_me/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.recall_me.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28165b implements InterfaceC28164a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f78471a;

    @Inject
    public C28165b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f78471a = interfaceC28373a;
    }

    @Override // com.avito.android.advert.item.recall_me.InterfaceC28164a
    public final void a(@Y61.k AdvertDetails advertDetails) {
        this.f78471a.c(new C13040a(advertDetails.getId()));
    }

    @Override // com.avito.android.advert.item.recall_me.InterfaceC28164a
    public final void b(@Y61.k AdvertDetails advertDetails) {
        RecallMeParams recallParams;
        RecallMeRequest recallMeRequest = advertDetails.getRecallMeRequest();
        if (recallMeRequest == null || (recallParams = recallMeRequest.getRecallParams()) == null || recallParams.isButtonWasShown()) {
            return;
        }
        this.f78471a.c(new D(advertDetails.getId()));
        RecallMeRequest recallMeRequest2 = advertDetails.getRecallMeRequest();
        RecallMeParams recallParams2 = recallMeRequest2 != null ? recallMeRequest2.getRecallParams() : null;
        if (recallParams2 == null) {
            return;
        }
        recallParams2.setButtonWasShown(true);
    }
}
