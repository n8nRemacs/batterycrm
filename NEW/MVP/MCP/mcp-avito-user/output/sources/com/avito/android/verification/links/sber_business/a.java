package com.avito.android.verification.links.sber_business;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.avito.android.verification.links.sber_business.k;
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

/* compiled from: SberBusinessLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/sber_business/a;", "Lev/a;", "Lcom/avito/android/verification/links/sber_business/SberBusinessLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40161a<SberBusinessLink> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f324407o = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f324408f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.b f324409g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f324410h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f324411i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f324412j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f324413k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final h f324414l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324415m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f324416n = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SberBusinessLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/links/sber_business/a$a;", "", "<init>", "()V", "", "REASON", "Ljava/lang/String;", "SBER_FINISH_PATH", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.sber_business.a$a, reason: collision with other inner class name */
    public static final class C10040a {
        public /* synthetic */ C10040a(C42822w c42822w) {
            this();
        }

        public C10040a() {
        }
    }

    /* compiled from: SberBusinessLinkAsyncHandler.kt */
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
        new C10040a(null);
    }

    @Inject
    public a(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.verification.b bVar, @Y61.k a.b bVar2, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h hVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f324408f = interfaceC4053a;
        this.f324409g = bVar;
        this.f324410h = bVar2;
        this.f324411i = gVar;
        this.f324412j = iVar;
        this.f324413k = interfaceC35745a5;
        this.f324414l = hVar;
        this.f324415m = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f324408f.J(this.f324409g.j(new VerificationWebViewArgs(((SberBusinessLink) deepLink).f324406c, "/verificationView/sberFinish", null, 4, null)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f324416n.b(this.f324410h.Q().N(new b()).t0(new l41.g() { // from class: com.avito.android.verification.links.sber_business.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                VerificationWebViewResult verificationWebViewResult;
                Map mapC;
                int i12 = a.f324407o;
                a aVar = a.this;
                Intent intent = ((C47918a) obj).f437157c;
                if (intent != null) {
                    verificationWebViewResult = (VerificationWebViewResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationWebViewResult", VerificationWebViewResult.class) : intent.getParcelableExtra("verificationWebViewResult"));
                } else {
                    verificationWebViewResult = null;
                }
                boolean z12 = verificationWebViewResult instanceof VerificationWebViewResult.Success;
                h hVar = aVar.f324414l;
                if (z12) {
                    Map<String, String> map = ((VerificationWebViewResult.Success) verificationWebViewResult).f325843b;
                    SberBusinessLink sberBusinessLinkC = aVar.c();
                    mapC = sberBusinessLinkC != null ? sberBusinessLinkC.f324405b : null;
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    LinkedHashMap linkedHashMapK = P0.k(map, mapC);
                    aVar.f324411i.g(aVar.d(), true);
                    aVar.f324416n.b(new C42017o(g1.a(hVar.f324433b.k(linkedHashMapK)).z(hVar.f324432a.a()).r(com.avito.android.verification.links.sber_business.b.f324419b).s(aVar.f324413k.e()), new C31684n(aVar, 27)).x(new com.avito.android.verification.links.sber_business.c(aVar), new d(aVar)));
                    return;
                }
                if (verificationWebViewResult instanceof VerificationWebViewResult.Closed) {
                    SberBusinessLink sberBusinessLinkC2 = aVar.c();
                    mapC = sberBusinessLinkC2 != null ? sberBusinessLinkC2.f324405b : null;
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    hVar.f324433b.n(P0.k(mapC, Collections.singletonMap("reason", ((VerificationWebViewResult.Closed) verificationWebViewResult).f325841b.toString()))).z(hVar.f324432a.a()).x(f.f324430b, g.f324431b);
                    aVar.j(new k.a("closed by user"));
                    return;
                }
                SberBusinessLink sberBusinessLinkC3 = aVar.c();
                mapC = sberBusinessLinkC3 != null ? sberBusinessLinkC3.f324405b : null;
                if (mapC == null) {
                    mapC = P0.c();
                }
                hVar.f324433b.n(P0.k(mapC, Collections.singletonMap("reason", "result is null"))).z(hVar.f324432a.a()).x(f.f324430b, g.f324431b);
                aVar.j(new k.a("result is null"));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324416n.e();
    }
}
