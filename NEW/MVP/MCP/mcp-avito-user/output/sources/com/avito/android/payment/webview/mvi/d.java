package com.avito.android.payment.webview.mvi;

import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import x60.InterfaceC49775a;

/* compiled from: WebPaymentMviActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebPaymentMviActivity f214917b;

    public d(WebPaymentMviActivity webPaymentMviActivity) {
        this.f214917b = webPaymentMviActivity;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = WebPaymentMviActivity.f214826D;
        this.f214917b.b2().accept(new InterfaceC49775a.c((PowerWebViewStateChangeEvent) obj));
    }
}
