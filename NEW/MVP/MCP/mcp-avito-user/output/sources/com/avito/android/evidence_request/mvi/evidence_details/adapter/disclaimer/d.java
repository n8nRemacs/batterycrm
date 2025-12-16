package com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer;

import Xz.InterfaceC17066a;
import Y41.l;
import Y61.k;
import com.avito.android.blueprints.publish.infomation.item.DisclaimerItem;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DisclaimerItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/disclaimer/d;", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/disclaimer/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC17066a, G0> f148767b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC17066a, G0> lVar) {
        this.f148767b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 6);
        AttributedText attributedText = ((DisclaimerItem) aVar).f106317c;
        attributedText.setOnDeepLinkClickListener(cVar);
        ((com.avito.android.blueprints.publish.infomation.item.e) eVar).r(attributedText);
    }
}
