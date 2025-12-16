package com.avito.android.advert.item.services_title;

import Rh.C15041a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesTitleItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/services_title/d;", "Lcom/avito/android/advert/item/services_title/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f80021b;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f80021b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AttributedText attributedText = ((ServicesTitleItem) aVar).f80016g;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new C15041a(this, 7));
        }
        fVar.e(attributedText);
    }
}
