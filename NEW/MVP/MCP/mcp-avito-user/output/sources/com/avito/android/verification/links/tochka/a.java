package com.avito.android.verification.links.tochka;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.R0;
import com.avito.android.verification.links.tochka.h;
import com.avito.android.verification.verification_webview.VerificationWebViewArgs;
import com.avito.android.verification.verification_webview.VerificationWebViewResult;
import ev.AbstractC40161a;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: VerificationTochkaLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/tochka/a;", "Lev/a;", "Lcom/avito/android/verification/links/tochka/VerificationTochkaLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40161a<VerificationTochkaLink> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f324643q = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f324644f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324645g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.verification.b f324646h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f324647i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f324648j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final vM0.f f324649k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324650l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final e f324651m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final R0 f324652n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final C43238h f324653o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f324654p = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationTochkaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/tochka/a$a;", "", "<init>", "()V", "", "TOCHKA_FINISH_PATH", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.tochka.a$a, reason: collision with other inner class name */
    public static final class C10043a {
        public /* synthetic */ C10043a(C42822w c42822w) {
            this();
        }

        public C10043a() {
        }
    }

    /* compiled from: VerificationTochkaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    static {
        new C10043a(null);
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.verification.b bVar2, @k a.g gVar, @k a.i iVar, @k vM0.f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k e eVar, @k R0 r02) {
        this.f324644f = bVar;
        this.f324645g = interfaceC4053a;
        this.f324646h = bVar2;
        this.f324647i = gVar;
        this.f324648j = iVar;
        this.f324649k = fVar;
        this.f324650l = aVar;
        this.f324651m = eVar;
        this.f324652n = r02;
        this.f324653o = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f324645g.J(this.f324646h.j(new VerificationWebViewArgs(((VerificationTochkaLink) deepLink).f324641b.buildUpon().build().toString(), "/verificationView/tochkaFinish", null, 4, null)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f324654p.b(this.f324644f.Q().N(new b()).t0(new l41.g() { // from class: com.avito.android.verification.links.tochka.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                VerificationWebViewResult verificationWebViewResult;
                C47918a c47918a = (C47918a) obj;
                int i12 = a.f324643q;
                a aVar = a.this;
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    verificationWebViewResult = (VerificationWebViewResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationWebViewResult", VerificationWebViewResult.class) : intent.getParcelableExtra("verificationWebViewResult"));
                } else {
                    verificationWebViewResult = null;
                }
                if (verificationWebViewResult instanceof VerificationWebViewResult.Success) {
                    Map<String, String> map = ((VerificationWebViewResult.Success) verificationWebViewResult).f325843b;
                    VerificationTochkaLink verificationTochkaLinkC = aVar.c();
                    Map mapC = verificationTochkaLinkC != null ? verificationTochkaLinkC.f324642c : null;
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    LinkedHashMap linkedHashMapK = P0.k(map, mapC);
                    aVar.f324647i.g(aVar.d(), true);
                    C43259k.d(aVar.f324653o, null, null, new com.avito.android.verification.links.tochka.b(aVar, linkedHashMapK, null), 3);
                    return;
                }
                if (verificationWebViewResult instanceof VerificationWebViewResult.Error) {
                    PrintableText f323386f = aVar.f324649k.getF323386f();
                    f.c.f125255c.getClass();
                    a.i.C4057a.d(aVar.f324648j, f323386f, null, null, f.c.a.b(), 0, null, null, null, 2030);
                    aVar.j(new h.a("webview error"));
                    return;
                }
                if (c47918a.f437156b == 0) {
                    aVar.j(new h.a(PaymentStateKt.PAYMENT_STATE_CANCELED));
                } else {
                    aVar.j(new h.a("result is null"));
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324654p.e();
        U.b(this.f324653o, null);
    }
}
