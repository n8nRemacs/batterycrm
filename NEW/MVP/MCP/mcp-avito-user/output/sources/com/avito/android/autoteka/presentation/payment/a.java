package com.avito.android.autoteka.presentation.payment;

import Nf.InterfaceC14568a;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AutotekaPaymentActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentActivity f97407b;

    public a(AutotekaPaymentActivity autotekaPaymentActivity) {
        this.f97407b = autotekaPaymentActivity;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AutotekaPaymentActivity.a aVar = AutotekaPaymentActivity.f97386y;
        this.f97407b.b2().accept(new InterfaceC14568a.b((DeepLink) obj));
    }
}
