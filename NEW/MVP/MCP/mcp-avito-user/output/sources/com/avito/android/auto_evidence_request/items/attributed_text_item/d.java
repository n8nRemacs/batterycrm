package com.avito.android.auto_evidence_request.items.attributed_text_item;

import Ce.InterfaceC13293a;
import Rh.C15041a;
import Y41.l;
import Y61.k;
import com.avito.android.auction.details.i;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AttributedTextItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_evidence_request/items/attributed_text_item/d;", "LTV0/d;", "Lcom/avito/android/auto_evidence_request/items/attributed_text_item/f;", "Lcom/avito/android/auto_evidence_request/items/attributed_text_item/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13293a, G0> f95185b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13293a, G0> lVar) {
        this.f95185b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        C15041a c15041a = new C15041a(this, 16);
        AttributedText attributedText = ((a) aVar).f95180c;
        attributedText.setOnDeepLinkClickListener(c15041a);
        attributedText.setOnUrlClickListener(new i(this, 2));
        ((f) eVar).r(attributedText);
    }
}
