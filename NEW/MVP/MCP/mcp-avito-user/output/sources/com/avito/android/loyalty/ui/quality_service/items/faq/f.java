package com.avito.android.loyalty.ui.quality_service.items.faq;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import mX.InterfaceC44026a;

/* compiled from: FaqItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/faq/f;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service/items/faq/h;", "Lcom/avito/android/loyalty/ui/quality_service/items/faq/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f183860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC44026a f183861c;

    @Inject
    public f(@k w wVar, @k InterfaceC44026a interfaceC44026a) {
        this.f183860b = wVar;
        this.f183861c = interfaceC44026a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.B80(aVar2);
        d dVar = new d(aVar2, hVar, this);
        hVar.f183865b.setOnClickListener(new com.avito.android.lib.design.list_item.a(18, dVar));
        hVar.f183867d.setOnClickListener(new com.avito.android.lib.design.list_item.a(19, dVar));
        hVar.f183868e = new e(aVar2, hVar);
        AttributedText attributedText = aVar2.f183849d;
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(this.f183860b);
    }
}
