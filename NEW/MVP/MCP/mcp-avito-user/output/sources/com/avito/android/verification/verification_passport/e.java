package com.avito.android.verification.verification_passport;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationSumsubLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import vM0.InterfaceC49236c;

/* compiled from: VerificationCyberityLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_passport/e;", "Lev/a;", "Lcom/avito/android/deep_linking/links/VerificationSumsubLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC40161a<VerificationSumsubLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325694f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f325695g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f325696h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49236c f325697i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f325698j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f325699k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationCyberityLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(e.this);
        }
    }

    /* compiled from: VerificationCyberityLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r8) {
            /*
                r7 = this;
                rv.a r8 = (rv.C47918a) r8
                android.content.Intent r0 = r8.f437157c
                int r8 = r8.f437156b
                r1 = -1
                r2 = 0
                r3 = 1
                if (r8 != r1) goto L19
                if (r0 == 0) goto L14
                java.lang.String r8 = "result_success"
                boolean r8 = r0.getBooleanExtra(r8, r3)
                goto L15
            L14:
                r8 = r3
            L15:
                if (r8 == 0) goto L19
                r8 = r3
                goto L1a
            L19:
                r8 = r2
            L1a:
                r4 = 0
                if (r0 == 0) goto L24
                java.lang.String r5 = "result_message"
                java.lang.String r0 = r0.getStringExtra(r5)
                goto L25
            L24:
                r0 = r4
            L25:
                if (r0 != 0) goto L29
                java.lang.String r0 = ""
            L29:
                if (r8 == 0) goto L2e
                com.avito.android.deep_linking.links.VerificationSumsubLink$a$a$d r5 = com.avito.android.deep_linking.links.VerificationSumsubLink.a.InterfaceC4019a.d.f133854b
                goto L41
            L2e:
                int r5 = r0.length()
                if (r5 <= 0) goto L36
                r5 = r3
                goto L37
            L36:
                r5 = r2
            L37:
                if (r5 == 0) goto L3f
                com.avito.android.deep_linking.links.VerificationSumsubLink$a$a$c r5 = new com.avito.android.deep_linking.links.VerificationSumsubLink$a$a$c
                r5.<init>()
                goto L41
            L3f:
                com.avito.android.deep_linking.links.VerificationSumsubLink$a$a$b r5 = com.avito.android.deep_linking.links.VerificationSumsubLink.a.InterfaceC4019a.b.f133853b
            L41:
                int r6 = r0.length()
                if (r6 <= 0) goto L48
                r2 = r3
            L48:
                com.avito.android.verification.verification_passport.e r3 = com.avito.android.verification.verification_passport.e.this
                if (r2 == 0) goto L51
                com.avito.android.deeplink_handler.view.a$i r2 = r3.f325698j
                r2.z1(r0)
            L51:
                if (r8 == 0) goto L7c
                com.avito.android.deep_linking.links.DeepLink r8 = r3.c()
                com.avito.android.deep_linking.links.VerificationSumsubLink r8 = (com.avito.android.deep_linking.links.VerificationSumsubLink) r8
                if (r8 == 0) goto L6c
                com.avito.android.deep_linking.links.DeepLink r8 = r8.f133851f
                if (r8 == 0) goto L6c
                com.avito.android.deep_linking.links.VerificationSumsubLink$a$a$a r0 = com.avito.android.deep_linking.links.VerificationSumsubLink.a.InterfaceC4019a.C4020a.f133852b
                com.avito.android.deep_linking.links.DeepLink[] r8 = new com.avito.android.deep_linking.links.DeepLink[]{r8}
                com.avito.android.deeplink_handler.handler.composite.a r2 = r3.f325694f
                r3.i(r0, r2, r8)
                kotlin.G0 r4 = kotlin.G0.f406611a
            L6c:
                if (r4 != 0) goto L7f
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                com.avito.android.deeplink_handler.view.a$a r0 = r3.f325696h
                r0.X(r1, r8)
                r3.j(r5)
                goto L7f
            L7c:
                r3.j(r5)
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_passport.e.b.accept(java.lang.Object):void");
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC49236c interfaceC49236c, @Y61.k a.i iVar) {
        this.f325694f = aVar;
        this.f325695g = bVar;
        this.f325696h = interfaceC4053a;
        this.f325697i = interfaceC49236c;
        this.f325698j = iVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f325696h.J(this.f325697i.d((VerificationSumsubLink) deepLink), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f325699k.b(this.f325695g.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f325699k.e();
    }
}
