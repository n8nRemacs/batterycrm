package com.avito.android.payment.form.status;

import A60.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AbstractC19927a;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentGenericFormLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deep_linking.links.PaymentStatusFormLink;
import com.avito.android.deep_linking.links.PaymentStatusLink;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.di.C29972i;
import com.avito.android.payment.di.component.h;
import com.avito.android.payment.di.module.F;
import com.avito.android.payment.form.O;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentStatusFormActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/form/status/PaymentStatusFormActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes15.dex */
public final class PaymentStatusFormActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public j f214398m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public B f214399n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public e f214400o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f214401p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f214402q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f214403r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.wallet.page.c f214404s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public InterfaceC36134w1 f214405t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f214406u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final a f214407v = new a();

    /* compiled from: PaymentStatusFormActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/avito/android/payment/form/status/PaymentStatusFormActivity$a", "Lcom/avito/android/payment/form/status/p;", "Lcom/avito/android/payment/form/O;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements p, O {
        public a() {
        }

        @Override // com.avito.android.payment.form.O
        public final void a(@Y61.k PaymentStatusResult.PaymentStatus paymentStatus) {
            Intent intent = new Intent();
            intent.putExtra("payment_status_result", paymentStatus);
            PaymentStatusFormActivity paymentStatusFormActivity = PaymentStatusFormActivity.this;
            paymentStatusFormActivity.setResult(-1, intent);
            paymentStatusFormActivity.finish();
        }

        @Override // com.avito.android.payment.form.status.p
        public final void b(@Y61.k Uri uri) {
            PaymentStatusFormActivity paymentStatusFormActivity = PaymentStatusFormActivity.this;
            com.avito.android.deep_linking.x xVar = paymentStatusFormActivity.f214403r;
            Intent intentB = null;
            if (xVar == null) {
                xVar = null;
            }
            DeepLink deepLinkE = xVar.e(uri);
            if (deepLinkE instanceof TopUpFormLink) {
                com.avito.android.wallet.page.c cVar = paymentStatusFormActivity.f214404s;
                intentB = (cVar != null ? cVar : null).b(((TopUpFormLink) deepLinkE).f133742b);
            } else if (deepLinkE instanceof PaymentGenericFormLink) {
                InterfaceC36134w1 interfaceC36134w1 = paymentStatusFormActivity.f214405t;
                PaymentGenericFormLink paymentGenericFormLink = (PaymentGenericFormLink) deepLinkE;
                intentB = (interfaceC36134w1 != null ? interfaceC36134w1 : null).f(paymentGenericFormLink.f133553b, paymentGenericFormLink.f133554c);
            } else if (deepLinkE instanceof PaymentStatusFormLink) {
                InterfaceC36134w1 interfaceC36134w12 = paymentStatusFormActivity.f214405t;
                intentB = (interfaceC36134w12 != null ? interfaceC36134w12 : null).h(((PaymentStatusFormLink) deepLinkE).f133570b);
            } else if (deepLinkE instanceof PaymentSessionLink) {
                InterfaceC36134w1 interfaceC36134w13 = paymentStatusFormActivity.f214405t;
                PaymentSessionLink paymentSessionLink = (PaymentSessionLink) deepLinkE;
                intentB = (interfaceC36134w13 != null ? interfaceC36134w13 : null).a(paymentSessionLink.f133562b, paymentSessionLink.f133563c, paymentSessionLink.f133564d, null, null);
            } else if (deepLinkE instanceof PaymentStatusLink) {
                InterfaceC36134w1 interfaceC36134w14 = paymentStatusFormActivity.f214405t;
                intentB = (interfaceC36134w14 != null ? interfaceC36134w14 : null).b(((PaymentStatusLink) deepLinkE).f133571b);
            }
            if (intentB != null) {
                intentB.putExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER", (PaymentSessionTypeMarker) paymentStatusFormActivity.getIntent().getSerializableExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER"));
                paymentStatusFormActivity.startActivityForResult(intentB, 4);
            }
        }

        @Override // com.avito.android.payment.form.O
        public final void c(@Y61.k String str) {
            Intent intent = new Intent();
            intent.putExtra("payment_redirect_result", str);
            PaymentStatusFormActivity paymentStatusFormActivity = PaymentStatusFormActivity.this;
            paymentStatusFormActivity.setResult(-1, intent);
            paymentStatusFormActivity.finish();
        }

        @Override // com.avito.android.payment.form.status.p
        public final void o8() {
            PaymentStatusFormActivity paymentStatusFormActivity = PaymentStatusFormActivity.this;
            paymentStatusFormActivity.setResult(0);
            paymentStatusFormActivity.finish();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.payment_generic_form;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        Kundle kundle = null;
        Kundle kundle2 = (bundle == null || (bundle3 = bundle.getBundle("interactor_state")) == null) ? null : new Kundle(bundle3);
        if (bundle != null && (bundle2 = bundle.getBundle("processing_presenter_state")) != null) {
            kundle = new Kundle(bundle2);
        }
        String stringExtra = getIntent().getStringExtra("PaymentStatusFormActivity_order_id");
        if (stringExtra == null) {
            throw new IllegalArgumentException("orderId must not be null");
        }
        h.a aVarA = com.avito.android.payment.di.component.c.a();
        aVarA.c(new F(kundle2, kundle, stringExtra));
        aVarA.b((com.avito.android.payment.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.payment.di.component.e.class));
        aVarA.a(this);
        aVarA.build().a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        A60.b aVar;
        A60.b c0008b;
        if (i12 != 4) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        if (intent == null) {
            aVar = new b.a();
        } else {
            if (intent.hasExtra("payment_status_result")) {
                c0008b = new b.c((PaymentStatusResult.PaymentStatus) intent.getParcelableExtra("payment_status_result"));
            } else if (intent.hasExtra("payment_redirect_result")) {
                c0008b = new b.d(intent.getStringExtra("payment_redirect_result"));
            } else if (intent.hasExtra("payment_error_result")) {
                c0008b = new b.C0008b(intent.getStringExtra("payment_error_result"));
            } else {
                aVar = new b.a();
            }
            aVar = c0008b;
        }
        B b12 = this.f214399n;
        if (b12 == null) {
            b12 = null;
        }
        b12.a(aVar);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewK1 = K1();
        com.avito.konveyor.adapter.j jVar = this.f214401p;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f214402q;
        if (aVar == null) {
            aVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f214406u;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        y yVar = new y(viewK1, jVar, aVar, interfaceC28373a);
        j jVar2 = this.f214398m;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.c(yVar);
        B b12 = this.f214399n;
        if (b12 == null) {
            b12 = null;
        }
        b12.c(yVar);
        B b13 = this.f214399n;
        if (b13 == null) {
            b13 = null;
        }
        b13.b(yVar);
        B b14 = this.f214399n;
        (b14 != null ? b14 : null).d(this.f214407v);
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        setResult(0);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        j jVar = this.f214398m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.e0();
        j jVar2 = this.f214398m;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.dispose();
        B b12 = this.f214399n;
        if (b12 == null) {
            b12 = null;
        }
        b12.c0();
        B b13 = this.f214399n;
        (b13 != null ? b13 : null).e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        e eVar = this.f214400o;
        if (eVar == null) {
            eVar = null;
        }
        bundle.putBundle("interactor_state", new Bundle(eVar.d0().f318647b));
        B b12 = this.f214399n;
        bundle.putBundle("processing_presenter_state", new Bundle((b12 != null ? b12 : null).d0().f318647b));
        super.onSaveInstanceState(bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        j jVar = this.f214398m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.b(this.f214407v);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        j jVar = this.f214398m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.c0();
        super.onStop();
    }
}
