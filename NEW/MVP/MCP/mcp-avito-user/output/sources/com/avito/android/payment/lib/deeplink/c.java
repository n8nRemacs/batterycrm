package com.avito.android.payment.lib.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PaymentSessionDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/lib/deeplink/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PaymentSessionLink;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC40161a<PaymentSessionLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f214575f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC36134w1 f214576g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f214577h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f214578i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PaymentSessionDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    @Inject
    public c(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC36134w1 interfaceC36134w1, @k a.b bVar) {
        this.f214575f = interfaceC4053a;
        this.f214576g = interfaceC36134w1;
        this.f214577h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PaymentSessionLink paymentSessionLink = (PaymentSessionLink) deepLink;
        this.f214575f.J(this.f214576g.a(paymentSessionLink.f133562b, paymentSessionLink.f133563c, paymentSessionLink.f133564d, paymentSessionLink.f133565e, paymentSessionLink.f133566f), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f214578i.b(this.f214577h.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.payment.lib.deeplink.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                InterfaceC14249c.b aVar;
                C47918a c47918a = (C47918a) obj;
                c cVar = c.this;
                if (c47918a.f437156b == -1) {
                    aVar = PaymentSessionLink.b.C4013b.f133569b;
                } else {
                    Intent intent = c47918a.f437157c;
                    aVar = new PaymentSessionLink.b.a(intent != null ? intent.getStringExtra("extra_payment_result") : null, !(intent != null ? intent.getBooleanExtra("extra_show_payment_methods", true) : true));
                }
                cVar.j(aVar);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f214578i.e();
    }
}
