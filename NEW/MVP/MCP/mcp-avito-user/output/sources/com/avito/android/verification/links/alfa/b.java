package com.avito.android.verification.links.alfa;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.avito.android.verification.links.alfa.j;
import com.avito.android.verification.verification_webview.VerificationWebViewArgs;
import com.avito.android.verification.verification_webview.VerificationWebViewResult;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: VerificationAlfaLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/alfa/b;", "Lev/a;", "Lcom/avito/android/verification/links/alfa/VerificationAlfaLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<VerificationAlfaLink> {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f324148s = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC28373a f324149f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f324150g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324151h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.verification.b f324152i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.verification.links.open.a f324153j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.g f324154k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.i f324155l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final vM0.f f324156m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324157n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final g f324158o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f324159p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f324160q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: r, reason: collision with root package name */
    @k
    public String f324161r = "";

    /* compiled from: VerificationAlfaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/verification/links/alfa/b$a;", "", "<init>", "()V", "", "ALFA_FINISH_PATH", "Ljava/lang/String;", "CODE_CHALLENGE_METHOD_S256", "KEY_CODE_CHALLENGE", "KEY_CODE_CHALLENGE_METHOD", "KEY_CODE_VERIFIER", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationAlfaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.verification.links.alfa.b$b, reason: collision with other inner class name */
    public static final class C10035b<T> implements r {
        public C10035b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.verification.b bVar2, @k com.avito.android.verification.links.open.a aVar, @k a.g gVar, @k a.i iVar, @k vM0.f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k g gVar2, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f324149f = interfaceC28373a;
        this.f324150g = bVar;
        this.f324151h = interfaceC4053a;
        this.f324152i = bVar2;
        this.f324153j = aVar;
        this.f324154k = gVar;
        this.f324155l = iVar;
        this.f324156m = fVar;
        this.f324157n = aVar2;
        this.f324158o = gVar2;
        this.f324159p = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        VerificationAlfaLink verificationAlfaLink = (VerificationAlfaLink) deepLink;
        com.avito.android.verification.links.open.a aVar = this.f324153j;
        aVar.getClass();
        String strA = com.avito.android.verification.links.open.a.a();
        this.f324161r = strA;
        this.f324151h.J(this.f324152i.j(new VerificationWebViewArgs(verificationAlfaLink.f324146c.buildUpon().appendQueryParameter("code_challenge", aVar.b(strA)).appendQueryParameter("code_challenge_method", "S256").build().toString(), "/verificationView/alfaFinish", verificationAlfaLink.f324145b)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f324160q.b(this.f324150g.Q().N(new C10035b()).t0(new l41.g() { // from class: com.avito.android.verification.links.alfa.b.c
            @Override // l41.g
            public final void accept(Object obj) {
                VerificationWebViewResult verificationWebViewResult;
                Map mapC;
                C47918a c47918a = (C47918a) obj;
                int i12 = b.f324148s;
                b bVar = b.this;
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    verificationWebViewResult = (VerificationWebViewResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationWebViewResult", VerificationWebViewResult.class) : intent.getParcelableExtra("verificationWebViewResult"));
                } else {
                    verificationWebViewResult = null;
                }
                if (verificationWebViewResult instanceof VerificationWebViewResult.Success) {
                    Map<String, String> map = ((VerificationWebViewResult.Success) verificationWebViewResult).f325843b;
                    VerificationAlfaLink verificationAlfaLinkC = bVar.c();
                    Map mapC2 = verificationAlfaLinkC != null ? verificationAlfaLinkC.f324145b : null;
                    if (mapC2 == null) {
                        mapC2 = P0.c();
                    }
                    LinkedHashMap linkedHashMapK = P0.k(P0.k(map, mapC2), Collections.singletonMap("code_verifier", bVar.f324161r));
                    bVar.f324154k.g(bVar.d(), true);
                    g gVar = bVar.f324158o;
                    bVar.f324160q.b(new C42017o(g1.a(gVar.f324179b.p(linkedHashMapK)).z(gVar.f324178a.a()).r(com.avito.android.verification.links.alfa.c.f324164b).s(bVar.f324159p.e()), new C31684n(bVar, 22)).x(new d(bVar), new e(bVar)));
                    return;
                }
                if (!(verificationWebViewResult instanceof VerificationWebViewResult.Error)) {
                    if (c47918a.f437156b == 0) {
                        bVar.j(new j.a(PaymentStateKt.PAYMENT_STATE_CANCELED));
                        return;
                    } else {
                        bVar.j(new j.a("result is null"));
                        return;
                    }
                }
                String strValueOf = String.valueOf(bVar.c());
                VerificationAlfaLink verificationAlfaLinkC2 = bVar.c();
                if (verificationAlfaLinkC2 == null || (mapC = verificationAlfaLinkC2.f324145b) == null) {
                    mapC = P0.c();
                }
                bVar.f324149f.c(new com.avito.android.verification.links.alfa.a(strValueOf, mapC, "something went wrong"));
                PrintableText f323382b = bVar.f324156m.getF323382b();
                f.c.f125255c.getClass();
                a.i.C4057a.d(bVar.f324155l, f323382b, null, null, f.c.a.b(), 0, null, null, null, 2030);
                bVar.j(new j.a("webview error"));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324160q.e();
    }
}
