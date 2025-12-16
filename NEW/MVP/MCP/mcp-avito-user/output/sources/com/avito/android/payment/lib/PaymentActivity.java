package com.avito.android.payment.lib;

import A60.b;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.view.C23038g0;
import arrow.core.C23678f0;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.v2.page.BeduinV2DeepLink;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentGenericLink;
import com.avito.android.deep_linking.links.PaymentRedirectLink;
import com.avito.android.deep_linking.links.SBOLPaymentLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.payment.lib.C33021f;
import com.avito.android.payment.lib.PaymentSessionType;
import com.avito.android.payment.lib.di.c;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.jakewharton.rxbinding4.view.C37722i;
import cv.InterfaceC39417a;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import io.reactivex.rxjava3.internal.operators.observable.P1;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u60.InterfaceC48808a;

/* compiled from: PaymentActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/lib/PaymentActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes15.dex */
public final class PaymentActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f214533x = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public t f214534m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f214535n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f214536o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC36134w1 f214537p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f214538q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.ui.universal.h f214539r;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public C33021f f214541t;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f214540s = C42727D.c(new e());

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f214542u = C42727D.c(new f());

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Object f214543v = C42727D.b(LazyThreadSafetyMode.f406616d, new a());

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214544w = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<String, ? extends Object>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends Object> invoke() {
            int i12 = PaymentActivity.f214533x;
            PaymentSessionType paymentSessionType = (PaymentSessionType) PaymentActivity.this.f214540s.getValue();
            PaymentSessionType.Services services = paymentSessionType instanceof PaymentSessionType.Services ? (PaymentSessionType.Services) paymentSessionType : null;
            if (services != null) {
                return services.f214561g;
            }
            return null;
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<DeepLink, G0> {
        public final void f(@Y61.k DeepLink deepLink) {
            PaymentActivity paymentActivity = (PaymentActivity) this.receiver;
            int i12 = PaymentActivity.f214533x;
            paymentActivity.getClass();
            if (deepLink instanceof SBOLPaymentLink) {
                InterfaceC36134w1 interfaceC36134w1 = paymentActivity.f214537p;
                if (interfaceC36134w1 == null) {
                    interfaceC36134w1 = null;
                }
                Intent intentC = interfaceC36134w1.c(((SBOLPaymentLink) deepLink).f133641b);
                try {
                    C35974x2.d(intentC);
                    paymentActivity.startActivityForResult(intentC, 8);
                    return;
                } catch (Exception unused) {
                    t tVar = paymentActivity.f214534m;
                    (tVar != null ? tVar : null).f214727o0.accept(G0.f406611a);
                    return;
                }
            }
            if (deepLink instanceof PaymentGenericLink) {
                t tVar2 = paymentActivity.f214534m;
                t tVar3 = tVar2 != null ? tVar2 : null;
                PaymentGenericLink paymentGenericLink = (PaymentGenericLink) deepLink;
                C33020e c33020e = tVar3.f214698L;
                c33020e.getClass();
                PaymentSessionType paymentSessionType = tVar3.f214700N;
                boolean z12 = paymentSessionType instanceof PaymentSessionType.Services;
                String str = paymentGenericLink.f133556c;
                String str2 = paymentGenericLink.f133555b;
                String str3 = paymentGenericLink.f133557d;
                InterfaceC48808a interfaceC48808a = c33020e.f214653a;
                if (!z12 && !(paymentSessionType instanceof PaymentSessionType.Wallet) && !(paymentSessionType instanceof PaymentSessionType.CPA)) {
                    throw new NoWhenBranchMatchedException();
                }
                io.reactivex.rxjava3.core.z<TypedResult<PaymentGenericResult>> zVarB = interfaceC48808a.b(str2, str, Collections.singletonMap("paymentToken", str3));
                L0 l0M0 = zVarB.d0(v.f214764b).r0(P2.c.f318721a).m0(new w(tVar3));
                InterfaceC35745a5 interfaceC35745a5 = tVar3.f214695E;
                P1 p1I0 = l0M0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).I0(tVar3.f214715c0.d0(x.f214766b), u.f214763b);
                y yVar = new y(tVar3, str);
                final V2 v22 = V2.f318762a;
                tVar3.f214705S.b(p1I0.v0(yVar, new l41.g() { // from class: com.avito.android.payment.lib.z
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                return;
            }
            if (deepLink instanceof BeduinUniversalPageLink) {
                com.avito.android.beduin.ui.universal.h hVar = paymentActivity.f214539r;
                com.avito.android.beduin.ui.universal.h hVar2 = hVar != null ? hVar : null;
                BeduinUniversalPageLink beduinUniversalPageLink = (BeduinUniversalPageLink) deepLink;
                BottomSheetContentPaddings bottomSheetContentPaddings = beduinUniversalPageLink.f133044h;
                paymentActivity.startActivityForResult(hVar2.a(beduinUniversalPageLink.f133038b, beduinUniversalPageLink.f133041e, beduinUniversalPageLink.f133039c, beduinUniversalPageLink.f133040d, beduinUniversalPageLink.f133042f, beduinUniversalPageLink.f133043g, bottomSheetContentPaddings != null ? bottomSheetContentPaddings.f133059b : null), 16);
                return;
            }
            if (deepLink instanceof PaymentRedirectLink) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = paymentActivity.f214538q;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deepLink, null, null, 6);
                paymentActivity.setResult(((PaymentRedirectLink) deepLink).f133559c ? -1 : 0);
                paymentActivity.finish();
                return;
            }
            if (deepLink instanceof BeduinV2DeepLink) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = paymentActivity.f214538q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink, null, null, 6);
                paymentActivity.finish();
                return;
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar3 = paymentActivity.f214538q;
            com.avito.android.deeplink_handler.handler.composite.a aVar4 = aVar3 != null ? aVar3 : null;
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_PAYMENT_SESSION_TYPE_MARKER", ((PaymentSessionType) paymentActivity.f214540s.getValue()).f214555b);
            G0 g02 = G0.f406611a;
            aVar4.r6(bundle, deepLink, "4");
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            f(deepLink);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<String, G0> {
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            PaymentActivity paymentActivity = (PaymentActivity) this.receiver;
            int i12 = PaymentActivity.f214533x;
            InterfaceC36134w1 interfaceC36134w1 = paymentActivity.f214537p;
            if (interfaceC36134w1 == null) {
                interfaceC36134w1 = null;
            }
            paymentActivity.startActivityForResult(interfaceC36134w1.j(str2, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : (Map) paymentActivity.f214543v.getValue()), 2);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<PaymentResult, G0> {
        @Override // Y41.l
        public final G0 invoke(PaymentResult paymentResult) {
            PaymentResult paymentResult2 = paymentResult;
            PaymentActivity paymentActivity = (PaymentActivity) this.receiver;
            int i12 = PaymentActivity.f214533x;
            paymentActivity.getClass();
            int i13 = (paymentResult2 == PaymentResult.f214550d || paymentResult2 == PaymentResult.f214549c) ? -1 : 0;
            Intent intent = new Intent();
            intent.putExtra("extra_payment_result", paymentResult2.f214554b);
            intent.putExtra("extra_show_payment_methods", ((String) paymentActivity.f214542u.getValue()) == null);
            paymentActivity.setResult(i13, intent);
            if (!paymentActivity.isFinishing()) {
                paymentActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/payment/lib/PaymentSessionType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<PaymentSessionType> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final PaymentSessionType invoke() {
            return (PaymentSessionType) PaymentActivity.this.getIntent().getParcelableExtra("EXTRA_PAYMENT_SESSION_TYPE");
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<String> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            int i12 = PaymentActivity.f214533x;
            PaymentSessionType paymentSessionType = (PaymentSessionType) PaymentActivity.this.f214540s.getValue();
            PaymentSessionType.Services services = paymentSessionType instanceof PaymentSessionType.Services ? (PaymentSessionType.Services) paymentSessionType : null;
            if (services != null) {
                return services.f214560f;
            }
            return null;
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Integer, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            t tVar = PaymentActivity.this.f214534m;
            if (tVar == null) {
                tVar = null;
            }
            tVar.f214718f0.accept(Integer.valueOf(iIntValue));
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        c.a aVarA = com.avito.android.payment.lib.di.a.a();
        com.avito.android.payment.lib.di.b bVar = (com.avito.android.payment.lib.di.b) C29972i.a(C29972i.b(this), com.avito.android.payment.lib.di.b.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        int i12 = com.avito.android.payment.lib.di.d.f214619a;
        aVarA.a(bVar, interfaceC39417aA, this, (PaymentSessionType) this.f214540s.getValue(), new C23678f0(new g()), ((String) this.f214542u.getValue()) == null).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        DeepLink deepLink;
        A60.b aVar;
        A60.b c0008b;
        String stringExtra;
        if (i12 == 2) {
            if (intent != null && (deepLink = (DeepLink) intent.getParcelableExtra("web_payment_final_deeplink_extra")) != null) {
                t tVar = this.f214534m;
                (tVar != null ? tVar : null).f214710X.setValue(deepLink);
            }
            if (i13 != 0 || ((String) this.f214542u.getValue()) == null) {
                return;
            }
            finish();
            return;
        }
        if (i12 == 4) {
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
            t tVar2 = this.f214534m;
            (tVar2 != null ? tVar2 : null).f214724l0.accept(aVar);
            return;
        }
        if (i12 != 8) {
            if (i12 != 16) {
                super.onActivityResult(i12, i13, intent);
                return;
            } else {
                finish();
                return;
            }
        }
        if (i13 == -1) {
            if (intent != null) {
                ComponentName componentName = com.avito.android.payment.n.f214770a;
                stringExtra = intent.getStringExtra("ru.sberbank.mobile.extra.EXTRA_RESULT");
            } else {
                stringExtra = null;
            }
            t tVar3 = this.f214534m;
            t tVar4 = tVar3 != null ? tVar3 : null;
            ComponentName componentName2 = com.avito.android.payment.n.f214770a;
            tVar4.f214726n0.accept(Boolean.valueOf(L.f(stringExtra, "SUCCESS")));
        }
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment);
        View viewFindViewById = findViewById(android.R.id.content);
        com.avito.konveyor.adapter.a aVar = this.f214535n;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f214536o;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        b bVar = new b(1, this, PaymentActivity.class, "onDeepLink", "onDeepLink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
        c cVar = new c(1, this, PaymentActivity.class, "onUriRedirect", "onUriRedirect(Ljava/lang/String;)V", 0);
        d dVar = new d(1, this, PaymentActivity.class, "onClosePaymentScreen", "onClosePaymentScreen(Lcom/avito/android/payment/lib/PaymentResult;)V", 0);
        C33021f c33021f = new C33021f(viewFindViewById, aVar2, jVar2, bVar, cVar, dVar);
        this.f214541t = c33021f;
        t tVar = this.f214534m;
        if (tVar == null) {
            tVar = null;
        }
        tVar.f214711Y.observe(this, new C33021f.b(cVar));
        tVar.f214714b0.observe(this, new C33021f.b(new h(1, c33021f, C33021f.class, "handleDialogState", "handleDialogState(Lcom/avito/android/payment/ModalState;)V", 0)));
        tVar.f214710X.observe(this, new C33021f.b(bVar));
        tVar.f214707U.observe(this, new C33021f.b(new i(1, c33021f, C33021f.class, "handleViewState", "handleViewState(Lcom/avito/android/payment/lib/ViewState;)V", 0)));
        tVar.f214712Z.observe(this, new C33021f.b(dVar));
        C23038g0 c23038g0 = tVar.f214709W;
        Button button = c33021f.f214665l;
        c23038g0.observe(this, new C33021f.b(new j(1, button, Button.class, "setText", "setText(Ljava/lang/CharSequence;)V", 0)));
        tVar.f214721i0.observe(this, new C33021f.b(new k(1, button, Button.class, "setEnabled", "setEnabled(Z)V", 0)));
        tVar.f214723k0.observe(this, new C33021f.b(new l(c33021f)));
        tVar.f214719g0.observe(this, new C33021f.b(new m(c33021f)));
        io.reactivex.rxjava3.disposables.d dVarT0 = C37722i.a(c33021f.f214668o).t0(new n(tVar));
        io.reactivex.rxjava3.disposables.c cVar2 = c33021f.f214660g;
        cVar2.b(dVarT0);
        cVar2.b(C37722i.a(c33021f.f214666m).t0(new o(tVar)));
        cVar2.b(C37722i.a(button).I0(c33021f.f214671r, C33022g.f214682b).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new p(tVar)));
        cVar2.b(c33021f.f214672s.t0(new q(tVar)));
        InterfaceC42726C interfaceC42726C = this.f214542u;
        if (((String) interfaceC42726C.getValue()) == null) {
            t tVar2 = this.f214534m;
            if (tVar2 == null) {
                tVar2 = null;
            }
            tVar2.le(bundle == null);
            return;
        }
        C33021f c33021f2 = this.f214541t;
        if (c33021f2 != null) {
            D6.w(c33021f2.f214654a);
        }
        String str = (String) interfaceC42726C.getValue();
        if (str != null) {
            InterfaceC36134w1 interfaceC36134w1 = this.f214537p;
            startActivityForResult((interfaceC36134w1 != null ? interfaceC36134w1 : null).j(str, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : (Map) this.f214543v.getValue()), 2);
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C33021f c33021f = this.f214541t;
        if (c33021f != null) {
            c33021f.f214660g.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f214538q;
        if (aVar == null) {
            aVar = null;
        }
        this.f214544w.b(aVar.d9().t0(new C33017b(this)));
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f214544w.e();
    }
}
