package com.avito.android.payment.processing;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentStatusLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.di.component.g;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.C35989z3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35896f0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.s0;
import u60.InterfaceC48808a;

/* compiled from: PaymentProcessingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/processing/PaymentProcessingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes15.dex */
public final class PaymentProcessingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C33028a f214775m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public r f214776n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f214777o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f214778p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public k f214779q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public C f214780r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final a f214781s = new a();

    /* compiled from: PaymentProcessingActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/payment/processing/PaymentProcessingActivity$a", "Lcom/avito/android/payment/processing/q;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements q {
        public a() {
        }

        @Override // com.avito.android.payment.processing.q
        public final void a(@Y61.k PaymentStatusResult.PaymentStatus paymentStatus) {
            Intent intent = new Intent();
            intent.putExtra("payment_status_result", paymentStatus);
            PaymentProcessingActivity paymentProcessingActivity = PaymentProcessingActivity.this;
            paymentProcessingActivity.setResult(-1, intent);
            paymentProcessingActivity.finish();
        }

        @Override // com.avito.android.payment.processing.q
        public final void b(@Y61.k String str) {
            PaymentProcessingActivity paymentProcessingActivity = PaymentProcessingActivity.this;
            com.avito.android.deep_linking.x xVar = paymentProcessingActivity.f214777o;
            if (xVar == null) {
                xVar = null;
            }
            DeepLink deepLinkB = xVar.b(str);
            if (deepLinkB instanceof PaymentStatusLink) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = paymentProcessingActivity.f214778p;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deepLinkB, null, null, 6);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("payment_redirect_result", str);
            paymentProcessingActivity.setResult(-1, intent);
            paymentProcessingActivity.finish();
        }

        @Override // com.avito.android.payment.processing.q
        public final void onError(@Y61.k String str) {
            Intent intent = new Intent();
            intent.putExtra("payment_error_result", str);
            PaymentProcessingActivity paymentProcessingActivity = PaymentProcessingActivity.this;
            paymentProcessingActivity.setResult(0, intent);
            paymentProcessingActivity.finish();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        PaymentSessionTypeMarker paymentSessionTypeMarker = (PaymentSessionTypeMarker) getIntent().getSerializableExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER");
        g.a aVarA = com.avito.android.payment.di.component.b.a();
        aVarA.b((com.avito.android.payment.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.payment.di.component.e.class));
        aVarA.a(cv.c.a(this));
        aVarA.d(this);
        aVarA.c(paymentSessionTypeMarker);
        aVarA.build().a(this);
    }

    public final void a2(Intent intent) {
        boolean zHasExtra = intent.hasExtra("PaymentProcessingActivity_order_id");
        a aVar = this.f214781s;
        if (zHasExtra) {
            String stringExtra = intent.getStringExtra("PaymentProcessingActivity_order_id");
            C c12 = this.f214780r;
            if (c12 != null) {
                c12.f214774c = null;
            }
            if (c12 != null) {
                c12.f214773b.dispose();
            }
            r rVar = this.f214776n;
            r rVar2 = rVar != null ? rVar : null;
            rVar2.getClass();
            InterfaceC48808a interfaceC48808a = rVar2.f214806a;
            InterfaceC35745a5 interfaceC35745a5 = rVar2.f214807b;
            w wVar = new w(interfaceC48808a, stringExtra, interfaceC35745a5);
            C c13 = new C(wVar, interfaceC35745a5);
            this.f214780r = c13;
            c13.f214774c = aVar;
            c13.f214773b.b(C35896f0.g(wVar.f214812a.a(B0.f406639b).j0(interfaceC35745a5.e()), new B(c13)));
            return;
        }
        String stringExtra2 = intent.getStringExtra("PaymentProcessingActivity_session_id");
        String stringExtra3 = intent.getStringExtra("PaymentProcessingActivity_method_signature");
        ParametersTree parametersTree = (ParametersTree) intent.getParcelableExtra("PaymentProcessingActivity_parameters");
        k kVar = this.f214779q;
        if (kVar != null) {
            kVar.f214804e = null;
        }
        if (kVar != null) {
            kVar.f214803d.dispose();
        }
        C33028a c33028a = this.f214775m;
        C33028a c33028a2 = c33028a != null ? c33028a : null;
        f fVar = new f(c33028a2.f214783a, stringExtra2, stringExtra3, C35989z3.a(parametersTree), c33028a2.f214786d, c33028a2.f214784b);
        z zVar = new z(c33028a2.f214783a);
        com.avito.android.deep_linking.x xVar = c33028a2.f214785c;
        InterfaceC35745a5 interfaceC35745a52 = c33028a2.f214784b;
        k kVar2 = new k(fVar, zVar, xVar, interfaceC35745a52);
        this.f214779q = kVar2;
        kVar2.f214804e = aVar;
        kVar2.f214803d.b(C35896f0.g(fVar.f214794a.a(B0.f406639b).j0(interfaceC35745a52.e()), new j(kVar2)));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.payment_processsing_dialog, (ViewGroup) null);
        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
        m mVar = new m(viewInflate);
        c5284a.getClass();
        com.avito.android.lib.util.g.a(a.C5284a.a(this, 0, R.style.Re23_Modal_Default_Window, mVar));
        setResult(0);
        a2(getIntent());
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f214779q;
        if (kVar != null) {
            kVar.f214804e = null;
        }
        if (kVar != null) {
            kVar.f214803d.dispose();
        }
        C c12 = this.f214780r;
        if (c12 != null) {
            c12.f214774c = null;
        }
        if (c12 != null) {
            c12.f214773b.dispose();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        a2(intent);
    }
}
