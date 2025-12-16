package com.avito.android.verification.list_items.verification_status;

import Y61.k;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationStatusItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/list_items/verification_status/f;", "LTV0/d;", "Lcom/avito/android/verification/list_items/verification_status/h;", "Lcom/avito/android/verification/list_items/verification_status/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f324877b;

    @Inject
    public f(@k w wVar) {
        this.f324877b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.dQ(aVar2);
        AttributedText attributedText = aVar2.f324866e;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f324877b);
        }
        hVar.c(new e(aVar2, this));
    }
}
