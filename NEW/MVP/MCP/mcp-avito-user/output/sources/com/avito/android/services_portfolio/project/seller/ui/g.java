package com.avito.android.services_portfolio.project.seller.ui;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f280318l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280319m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AttributedText attributedText, com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(1);
        this.f280318l = attributedText;
        this.f280319m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        AttributedText attributedText = this.f280318l;
        com.avito.android.util.text.j.a(aVar, attributedText, null);
        attributedText.setOnDeepLinkClickListener(new X50.b(this.f280319m, 1));
        return G0.f406611a;
    }
}
