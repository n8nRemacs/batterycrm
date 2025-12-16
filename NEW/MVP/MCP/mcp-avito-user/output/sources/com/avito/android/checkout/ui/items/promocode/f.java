package com.avito.android.checkout.ui.items.promocode;

import com.avito.android.checkout.data.CheckoutPromoCodeState;
import com.avito.android.checkout.ui.items.promocode.CheckoutPromoCodeItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckoutPromoCodeItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckoutPromoCodeState f118459l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CheckoutPromoCodeItem.Button f118460m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f118461n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CheckoutPromoCodeState checkoutPromoCodeState, CheckoutPromoCodeItem.Button button, h hVar) {
        super(0);
        this.f118459l = checkoutPromoCodeState;
        this.f118460m = button;
        this.f118461n = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        DeepLink deepLink2;
        CheckoutPromoCodeState checkoutPromoCodeState = CheckoutPromoCodeState.f118139c;
        CheckoutPromoCodeState checkoutPromoCodeState2 = this.f118459l;
        CheckoutPromoCodeItem.Button button = this.f118460m;
        h hVar = this.f118461n;
        if (checkoutPromoCodeState2 != checkoutPromoCodeState || (deepLink2 = button.f118448c) == null) {
            String str = hVar.f118466d;
            if (str != null && str.length() != 0 && (deepLink = button.f118448c) != null) {
                hVar.f118465c.invoke(deepLink, hVar.f118466d);
            }
        } else {
            hVar.f118465c.invoke(deepLink2, null);
        }
        return G0.f406611a;
    }
}
