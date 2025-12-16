package com.avito.android.payment.form;

import A60.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AbstractC19927a;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.di.component.f;
import com.avito.android.payment.di.module.C32977d;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentGenericFormActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/form/PaymentGenericFormActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes15.dex */
public final class PaymentGenericFormActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC33009l f214340m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public M f214341n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC33003f f214342o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f214343p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC36134w1 f214344q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f214345r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final a f214346s = new a();

    /* compiled from: PaymentGenericFormActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/avito/android/payment/form/PaymentGenericFormActivity$a", "Lcom/avito/android/payment/form/E;", "Lcom/avito/android/payment/form/O;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements E, O {
        public a() {
        }

        @Override // com.avito.android.payment.form.E
        public final void E0() {
            PaymentGenericFormActivity paymentGenericFormActivity = PaymentGenericFormActivity.this;
            K2.c(paymentGenericFormActivity);
            paymentGenericFormActivity.setResult(0);
            paymentGenericFormActivity.finish();
        }

        @Override // com.avito.android.payment.form.E
        public final void F0(@Y61.k String str, @Y61.k String str2, @Y61.k ParametersTree parametersTree) {
            PaymentGenericFormActivity paymentGenericFormActivity = PaymentGenericFormActivity.this;
            InterfaceC36134w1 interfaceC36134w1 = paymentGenericFormActivity.f214344q;
            if (interfaceC36134w1 == null) {
                interfaceC36134w1 = null;
            }
            Intent intentD = interfaceC36134w1.d(str, str2, parametersTree);
            intentD.putExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER", (PaymentSessionTypeMarker) paymentGenericFormActivity.getIntent().getSerializableExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER"));
            paymentGenericFormActivity.startActivityForResult(intentD, 4);
        }

        @Override // com.avito.android.payment.form.E
        public final void G0(@Y61.k String str) {
            PaymentGenericFormActivity paymentGenericFormActivity = PaymentGenericFormActivity.this;
            K2.c(paymentGenericFormActivity);
            Intent intent = new Intent();
            intent.putExtra("payment_error_result", str);
            paymentGenericFormActivity.setResult(0, intent);
            paymentGenericFormActivity.finish();
        }

        @Override // com.avito.android.payment.form.O
        public final void a(@Y61.k PaymentStatusResult.PaymentStatus paymentStatus) {
            Intent intent = new Intent();
            intent.putExtra("payment_status_result", paymentStatus);
            PaymentGenericFormActivity paymentGenericFormActivity = PaymentGenericFormActivity.this;
            paymentGenericFormActivity.setResult(-1, intent);
            paymentGenericFormActivity.finish();
        }

        @Override // com.avito.android.payment.form.O
        public final void c(@Y61.k String str) {
            Intent intent = new Intent();
            intent.putExtra("payment_redirect_result", str);
            PaymentGenericFormActivity paymentGenericFormActivity = PaymentGenericFormActivity.this;
            paymentGenericFormActivity.setResult(-1, intent);
            paymentGenericFormActivity.finish();
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
        Kundle kundle2 = (bundle == null || (bundle3 = bundle.getBundle("presenter_state")) == null) ? null : new Kundle(bundle3);
        if (bundle != null && (bundle2 = bundle.getBundle("interactor_state")) != null) {
            kundle = new Kundle(bundle2);
        }
        Kundle kundle3 = kundle;
        String stringExtra = getIntent().getStringExtra("PaymentGenericFormActivity_session_id");
        if (stringExtra == null) {
            throw new IllegalArgumentException("itemId must not be null");
        }
        String stringExtra2 = getIntent().getStringExtra("PaymentGenericFormActivity_method_signature");
        if (stringExtra2 == null) {
            throw new IllegalArgumentException("serviceId must not ne null");
        }
        PaymentSessionTypeMarker paymentSessionTypeMarker = (PaymentSessionTypeMarker) getIntent().getSerializableExtra("EXTRA_PAYMENT_SESSION_TYPE_MARKER");
        f.a aVarA = com.avito.android.payment.di.component.a.a();
        aVarA.d(new C32977d(kundle3, kundle2, stringExtra, stringExtra2, getResources()));
        aVarA.b((com.avito.android.payment.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.payment.di.component.e.class));
        aVarA.c(paymentSessionTypeMarker);
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
        M m12 = this.f214341n;
        if (m12 == null) {
            m12 = null;
        }
        m12.a(aVar);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewK1 = K1();
        com.avito.konveyor.adapter.j jVar = this.f214343p;
        if (jVar == null) {
            jVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f214345r;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        J j12 = new J(viewK1, jVar, interfaceC28373a);
        InterfaceC33009l interfaceC33009l = this.f214340m;
        if (interfaceC33009l == null) {
            interfaceC33009l = null;
        }
        interfaceC33009l.b(j12);
        M m12 = this.f214341n;
        if (m12 == null) {
            m12 = null;
        }
        m12.c(j12);
        M m13 = this.f214341n;
        (m13 != null ? m13 : null).d(this.f214346s);
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        setResult(0);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC33009l interfaceC33009l = this.f214340m;
        if (interfaceC33009l == null) {
            interfaceC33009l = null;
        }
        interfaceC33009l.e0();
        InterfaceC33009l interfaceC33009l2 = this.f214340m;
        if (interfaceC33009l2 == null) {
            interfaceC33009l2 = null;
        }
        interfaceC33009l2.dispose();
        M m12 = this.f214341n;
        if (m12 == null) {
            m12 = null;
        }
        m12.c0();
        M m13 = this.f214341n;
        (m13 != null ? m13 : null).e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        InterfaceC33003f interfaceC33003f = this.f214342o;
        if (interfaceC33003f == null) {
            interfaceC33003f = null;
        }
        bundle.putBundle("interactor_state", new Bundle(interfaceC33003f.d0().f318647b));
        InterfaceC33009l interfaceC33009l = this.f214340m;
        bundle.putBundle("presenter_state", new Bundle((interfaceC33009l != null ? interfaceC33009l : null).d0().f318647b));
        super.onSaveInstanceState(bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        InterfaceC33009l interfaceC33009l = this.f214340m;
        if (interfaceC33009l == null) {
            interfaceC33009l = null;
        }
        interfaceC33009l.d(this.f214346s);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        InterfaceC33009l interfaceC33009l = this.f214340m;
        if (interfaceC33009l == null) {
            interfaceC33009l = null;
        }
        interfaceC33009l.c0();
        super.onStop();
    }
}
