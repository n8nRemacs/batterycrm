package com.avito.android.payment.deeplink;

import A60.a;
import A60.b;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentGenericFormLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PaymentGenericFormDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/deeplink/o;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PaymentGenericFormLink;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o extends AbstractC40161a<PaymentGenericFormLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f214025f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f214026g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f214027h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214028i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PaymentGenericFormDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(o.this);
        }
    }

    @Inject
    public o(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k a.b bVar) {
        this.f214025f = interfaceC4053a;
        this.f214026g = interfaceC36134w1;
        this.f214027h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PaymentGenericFormLink paymentGenericFormLink = (PaymentGenericFormLink) deepLink;
        Intent intentF = this.f214026g.f(paymentGenericFormLink.f133553b, paymentGenericFormLink.f133554c);
        intentF.putExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER", bundle != null ? bundle.getSerializable("EXTRA_PAYMENT_SESSION_TYPE_MARKER") : null);
        this.f214025f.J(intentF, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f214028i.b(this.f214027h.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.payment.deeplink.o.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47918a c47918a = (C47918a) obj;
                o oVar = o.this;
                if (c47918a.f437156b == -1) {
                    Intent intent = c47918a.f437157c;
                    PaymentStatusResult.PaymentStatus paymentStatus = intent != null ? (PaymentStatusResult.PaymentStatus) intent.getParcelableExtra("payment_status_result") : null;
                    String stringExtra = intent != null ? intent.getStringExtra("payment_redirect_result") : null;
                    String stringExtra2 = intent != null ? intent.getStringExtra("payment_error_result") : null;
                    oVar.j(new a.C0007a(intent == null ? new b.a() : paymentStatus != null ? new b.c(paymentStatus) : stringExtra != null ? new b.d(stringExtra) : stringExtra2 != null ? new b.C0008b(stringExtra2) : new b.a()));
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f214028i.e();
    }
}
