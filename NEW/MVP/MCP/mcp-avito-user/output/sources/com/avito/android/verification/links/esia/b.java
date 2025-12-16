package com.avito.android.verification.links.esia;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.avito.android.verification.links.esia.apptoapp.VerificationEsiaFinishResult;
import com.avito.android.verification.links.esia.m;
import com.avito.android.verification.verification_webview.VerificationWebViewResult;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import ev.AbstractC40161a;
import hD.C40806a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: VerificationEsiaLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/esia/b;", "Lev/a;", "Lcom/avito/android/verification/links/esia/VerificationEsiaLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<VerificationEsiaLink> {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f324232u = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f324233f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f324234g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.b f324235h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.open.a f324236i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.g f324237j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.i f324238k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final vM0.f f324239l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324240m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final j f324241n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.esia.apptoapp.b f324242o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C40806a f324243p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.storage.a f324244q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f324245r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f324246s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f324247t = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationEsiaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/verification/links/esia/b$a;", "", "<init>", "()V", "", "CODE_CHALLENGE_METHOD_S256", "Ljava/lang/String;", "ESIA_FINISH_PATH", "KEY_CODE", "KEY_CODE_CHALLENGE", "KEY_CODE_CHALLENGE_METHOD", "KEY_CODE_VERIFIER", "KEY_STATE", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationEsiaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.verification.links.esia.b$b, reason: collision with other inner class name */
    public static final class C10038b<T> implements r {
        public C10038b() {
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
    public b(@Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.verification.b bVar2, @Y61.k com.avito.android.verification.links.open.a aVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k vM0.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k j jVar, @Y61.k com.avito.android.verification.links.esia.apptoapp.b bVar3, @Y61.k C40806a c40806a, @Y61.k com.avito.android.verification.storage.a aVar3, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f324233f = bVar;
        this.f324234g = interfaceC4053a;
        this.f324235h = bVar2;
        this.f324236i = aVar;
        this.f324237j = gVar;
        this.f324238k = iVar;
        this.f324239l = fVar;
        this.f324240m = aVar2;
        this.f324241n = jVar;
        this.f324242o = bVar3;
        this.f324243p = c40806a;
        this.f324244q = aVar3;
        this.f324245r = interfaceC35745a5;
        this.f324246s = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r13, com.avito.android.deep_linking.links.DeepLink r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.esia.b.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f324247t.b(this.f324233f.Q().N(new C10038b()).t0(new l41.g() { // from class: com.avito.android.verification.links.esia.b.c
            @Override // l41.g
            public final void accept(Object obj) {
                VerificationEsiaFinishResult verificationEsiaFinishResult;
                VerificationWebViewResult verificationWebViewResult;
                Map mapC;
                final int i12 = 1;
                C47918a c47918a = (C47918a) obj;
                int i13 = b.f324232u;
                final b bVar = b.this;
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    verificationEsiaFinishResult = (VerificationEsiaFinishResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationEsiaAuthResult", VerificationEsiaFinishResult.class) : intent.getParcelableExtra("verificationEsiaAuthResult"));
                } else {
                    verificationEsiaFinishResult = null;
                }
                io.reactivex.rxjava3.disposables.c cVar = bVar.f324247t;
                InterfaceC35745a5 interfaceC35745a5 = bVar.f324245r;
                j jVar = bVar.f324241n;
                a.g gVar = bVar.f324237j;
                com.avito.android.verification.storage.a aVar = bVar.f324244q;
                if (verificationEsiaFinishResult != null) {
                    if (!(verificationEsiaFinishResult instanceof VerificationEsiaFinishResult.Success)) {
                        if (verificationEsiaFinishResult instanceof VerificationEsiaFinishResult.Failed) {
                            bVar.k("app2app error", verificationEsiaFinishResult);
                            return;
                        } else {
                            if (verificationEsiaFinishResult instanceof VerificationEsiaFinishResult.Canceled) {
                                bVar.k(PaymentStateKt.PAYMENT_STATE_CANCELED, verificationEsiaFinishResult);
                                return;
                            }
                            return;
                        }
                    }
                    TokenParameters tokenParameters = ((VerificationEsiaFinishResult.Success) verificationEsiaFinishResult).f324229b;
                    Map mapG = P0.g(new Q("code", tokenParameters.f339699b), new Q(VoiceInfo.STATE, tokenParameters.f339700c));
                    VerificationEsiaLink verificationEsiaLinkC = bVar.c();
                    mapC = verificationEsiaLinkC != null ? verificationEsiaLinkC.f324218b : null;
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    LinkedHashMap linkedHashMapK = P0.k(mapG, mapC);
                    String strJ = aVar.j();
                    LinkedHashMap linkedHashMapK2 = P0.k(linkedHashMapK, Collections.singletonMap("code_verifier", strJ != null ? strJ : ""));
                    gVar.g(bVar.d(), true);
                    cVar.b(new C42017o(g1.a(jVar.f324271b.r(linkedHashMapK2)).z(jVar.f324270a.a()).r(com.avito.android.verification.links.esia.c.f324250b).s(interfaceC35745a5.e()), new InterfaceC43543a() { // from class: com.avito.android.verification.links.esia.a
                        @Override // l41.InterfaceC43543a
                        public final void run() {
                            b bVar2 = bVar;
                            switch (i12) {
                                case 0:
                                    int i14 = b.f324232u;
                                    bVar2.f324237j.g(bVar2.d(), false);
                                    break;
                                default:
                                    int i15 = b.f324232u;
                                    bVar2.f324237j.g(bVar2.d(), false);
                                    break;
                            }
                        }
                    }).x(new d(bVar), new e(bVar)));
                    return;
                }
                if (intent != null) {
                    verificationWebViewResult = (VerificationWebViewResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationWebViewResult", VerificationWebViewResult.class) : intent.getParcelableExtra("verificationWebViewResult"));
                } else {
                    verificationWebViewResult = null;
                }
                if (!(verificationWebViewResult instanceof VerificationWebViewResult.Success)) {
                    if (verificationWebViewResult instanceof VerificationWebViewResult.Error) {
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(bVar.f324239l.getF323381a());
                        f.c.f125255c.getClass();
                        a.i.C4057a.d(bVar.f324238k, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
                        bVar.j(new m.a("webview error"));
                        return;
                    }
                    if (c47918a.f437156b == 0) {
                        bVar.j(new m.a(PaymentStateKt.PAYMENT_STATE_CANCELED));
                        return;
                    } else {
                        bVar.j(new m.a("result is null"));
                        return;
                    }
                }
                Map<String, String> map = ((VerificationWebViewResult.Success) verificationWebViewResult).f325843b;
                VerificationEsiaLink verificationEsiaLinkC2 = bVar.c();
                mapC = verificationEsiaLinkC2 != null ? verificationEsiaLinkC2.f324218b : null;
                if (mapC == null) {
                    mapC = P0.c();
                }
                LinkedHashMap linkedHashMapK3 = P0.k(map, mapC);
                String strJ2 = aVar.j();
                LinkedHashMap linkedHashMapK4 = P0.k(linkedHashMapK3, Collections.singletonMap("code_verifier", strJ2 != null ? strJ2 : ""));
                gVar.g(bVar.d(), true);
                final int i14 = 0;
                cVar.b(new C42017o(g1.a(jVar.f324271b.r(linkedHashMapK4)).z(jVar.f324270a.a()).r(f.f324253b).s(interfaceC35745a5.e()), new InterfaceC43543a() { // from class: com.avito.android.verification.links.esia.a
                    @Override // l41.InterfaceC43543a
                    public final void run() {
                        b bVar2 = bVar;
                        switch (i14) {
                            case 0:
                                int i142 = b.f324232u;
                                bVar2.f324237j.g(bVar2.d(), false);
                                break;
                            default:
                                int i15 = b.f324232u;
                                bVar2.f324237j.g(bVar2.d(), false);
                                break;
                        }
                    }
                }).x(new g(bVar), new h(bVar)));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324247t.e();
        this.f324244q.h(null);
    }

    public final void k(String str, VerificationEsiaFinishResult verificationEsiaFinishResult) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(this.f324239l.getF323381a());
        f.c.f125255c.getClass();
        a.i.C4057a.d(this.f324238k, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        j(new m.a(str));
        this.f324246s.c(new com.avito.android.social.esia.a("verification", verificationEsiaFinishResult.toString()));
    }
}
