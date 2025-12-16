package com.avito.android.payment.webview.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import x60.InterfaceC49775a;

/* compiled from: WebPaymentMviActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebPaymentMviActivity f214925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebPaymentMviActivity webPaymentMviActivity) {
        super(1);
        this.f214925l = webPaymentMviActivity;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        int i12 = WebPaymentMviActivity.f214826D;
        this.f214925l.b2().accept(new InterfaceC49775a.b(str));
        return G0.f406611a;
    }
}
