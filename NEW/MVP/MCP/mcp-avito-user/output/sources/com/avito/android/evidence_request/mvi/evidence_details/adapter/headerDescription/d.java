package com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription;

import Xz.InterfaceC17066a;
import Y41.l;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HeaderDescriptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/headerDescription/d;", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/headerDescription/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC17066a, G0> f148808b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC17066a, G0> lVar) {
        this.f148808b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        HeaderDescriptionItem headerDescriptionItem = (HeaderDescriptionItem) aVar;
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 7);
        AttributedText attributedText = headerDescriptionItem.f148803d;
        attributedText.setOnDeepLinkClickListener(cVar);
        fVar.b(headerDescriptionItem.f148802c);
        fVar.q(attributedText);
    }
}
