package com.avito.android.payment.webview.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w60.C49450a;
import z60.C50379a;

/* compiled from: WebPaymentMviActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebPaymentMviActivity f214856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WebPaymentMviActivity webPaymentMviActivity) {
        super(0);
        this.f214856l = webPaymentMviActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        WebPaymentMviActivity webPaymentMviActivity = this.f214856l;
        InterfaceC28373a interfaceC28373a = webPaymentMviActivity.f214831n;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        E e12 = webPaymentMviActivity.f214837t;
        interfaceC28373a.c(new C49450a((e12 != null ? e12 : null).a(), webPaymentMviActivity.a2().f214821c, webPaymentMviActivity.a2().f214824f, C50379a.a(webPaymentMviActivity.a2().f214820b)));
        return G0.f406611a;
    }
}
