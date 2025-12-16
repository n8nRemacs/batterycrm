package com.avito.android.payment.lib.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.LegacyPaymentSessionLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: LegacyPaymentSessionDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/lib/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<LegacyPaymentSessionLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f214566f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC36134w1 f214567g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f214568h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f214569i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: LegacyPaymentSessionDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.lib.deeplink.a$a, reason: collision with other inner class name */
    public static final class C6434a<T> implements r {
        public C6434a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC36134w1 interfaceC36134w1, @k a.b bVar) {
        this.f214566f = interfaceC4053a;
        this.f214567g = interfaceC36134w1;
        this.f214568h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        LegacyPaymentSessionLink legacyPaymentSessionLink = (LegacyPaymentSessionLink) deepLink;
        List listSingletonList = Collections.singletonList(legacyPaymentSessionLink.f133423c);
        this.f214566f.J(this.f214567g.e(legacyPaymentSessionLink.f133422b, legacyPaymentSessionLink.f133424d, listSingletonList), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f214569i.b(this.f214568h.Q().N(new C6434a()).t0(new l41.g() { // from class: com.avito.android.payment.lib.deeplink.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                InterfaceC14249c.b aVar;
                C47918a c47918a = (C47918a) obj;
                a aVar2 = a.this;
                if (c47918a.f437156b == -1) {
                    aVar = PaymentSessionLink.b.C4013b.f133569b;
                } else {
                    Intent intent = c47918a.f437157c;
                    aVar = new PaymentSessionLink.b.a(intent != null ? intent.getStringExtra("extra_payment_result") : null, false, 2, null);
                }
                aVar2.j(aVar);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f214569i.e();
    }
}
