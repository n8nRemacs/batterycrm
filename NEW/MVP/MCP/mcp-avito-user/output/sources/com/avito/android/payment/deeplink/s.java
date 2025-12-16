package com.avito.android.payment.deeplink;

import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentSessionCpaLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PaymentSessionCpaDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/deeplink/s;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PaymentSessionCpaLink;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s extends AbstractC40161a<PaymentSessionCpaLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f214036f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f214037g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f214038h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214039i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PaymentSessionCpaDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(s.this);
        }
    }

    @Inject
    public s(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k a.b bVar) {
        this.f214036f = interfaceC4053a;
        this.f214037g = interfaceC36134w1;
        this.f214038h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f214036f.J(this.f214037g.g(((PaymentSessionCpaLink) deepLink).f133560b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f214039i.b(this.f214038h.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.payment.deeplink.s.b
            @Override // l41.g
            public final void accept(Object obj) {
                s sVar = s.this;
                if (((C47918a) obj).f437156b == -1) {
                    sVar.j(PaymentSessionCpaLink.b.a.f133561b);
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f214039i.e();
    }
}
