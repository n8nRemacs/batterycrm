package com.avito.android.edit_seller_type;

import com.avito.android.edit_seller_type.mvi.entity.c;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class q extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.edit_seller_type.mvi.entity.c f146862l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.edit_seller_type.mvi.entity.a, G0> f146863m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.avito.android.edit_seller_type.mvi.entity.c cVar, Y41.l<? super com.avito.android.edit_seller_type.mvi.entity.a, G0> lVar) {
        super(1);
        this.f146862l = cVar;
        this.f146863m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        AttributedText attributedText = ((c.g) this.f146862l).f146826c;
        Y41.l<com.avito.android.edit_seller_type.mvi.entity.a, G0> lVar = this.f146863m;
        attributedText.setOnDeepLinkClickListener(new SE0.a(22, lVar));
        attributedText.setOnUrlClickListener(new com.avito.android.btob_business_trip.screens.selectItemScreen.t(2, lVar));
        return G0.f406611a;
    }
}
