package com.avito.android.autoteka.deeplinks.payment;

import android.content.Intent;
import com.avito.android.autoteka.deeplinks.AutotekaPaymentLink;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: AutotekaPaymentDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentLink f96277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f96278m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutotekaPaymentLink autotekaPaymentLink, b bVar) {
        super(0);
        this.f96277l = autotekaPaymentLink;
        this.f96278m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AutotekaPaymentActivity.a aVar = AutotekaPaymentActivity.f97386y;
        PaymentDetails paymentDetails = this.f96277l.f96221b;
        b bVar = this.f96278m;
        aVar.getClass();
        Intent intent = new Intent(bVar.f96279f, (Class<?>) AutotekaPaymentActivity.class);
        intent.putExtra("ProductDetails", paymentDetails);
        intent.addFlags(603979776);
        bVar.f96280g.J(intent, C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
