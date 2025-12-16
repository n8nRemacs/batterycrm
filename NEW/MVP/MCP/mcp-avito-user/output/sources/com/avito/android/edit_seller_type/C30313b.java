package com.avito.android.edit_seller_type;

import com.avito.android.edit_seller_type.mvi.entity.c;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.edit_seller_type.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30313b extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.a f146708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.edit_seller_type.mvi.entity.a, G0> f146709m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30313b(c.a aVar, Y41.l<? super com.avito.android.edit_seller_type.mvi.entity.a, G0> lVar) {
        super(1);
        this.f146708l = aVar;
        this.f146709m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        c.a aVar2 = this.f146708l;
        Y41.l<com.avito.android.edit_seller_type.mvi.entity.a, G0> lVar = this.f146709m;
        SE0.a aVar3 = new SE0.a(21, lVar);
        AttributedText attributedText = aVar2.f146806b;
        attributedText.setOnDeepLinkClickListener(aVar3);
        attributedText.setOnUrlClickListener(new com.avito.android.btob_business_trip.screens.selectItemScreen.t(1, lVar));
        return G0.f406611a;
    }
}
