package com.avito.android.evidence_request.details.params.disclaimer;

import Y61.k;
import com.avito.android.blueprints.publish.infomation.item.DisclaimerItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DisclaimerItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/params/disclaimer/d;", "Lcom/avito/android/evidence_request/details/params/disclaimer/c;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f148551b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f148552c;

    @Inject
    public d() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f148551b = cVar;
        this.f148552c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 5);
        AttributedText attributedText = ((DisclaimerItem) aVar).f106317c;
        attributedText.setOnDeepLinkClickListener(cVar);
        ((com.avito.android.blueprints.publish.infomation.item.e) eVar).r(attributedText);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f148552c;
    }
}
