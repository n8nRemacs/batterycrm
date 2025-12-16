package com.avito.android.verification.links.sber_finish;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.avito.android.verification.links.sber_finish.b;
import com.avito.android.verification.links.sber_finish.k;
import d31.C39499e;
import e.InterfaceC39835a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.net.SocketException;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import sberid.sdk.app_token.domain.models.models.TypeAuth;
import sberid.sdk.global.models.StandName;
import sberid.sdk.init.a;
import vb1.C49297b;
import xb1.C49922a;

/* compiled from: VerificationSberFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/sber_finish/c;", "Lev/a;", "Lcom/avito/android/verification/links/sber_finish/VerificationSberFinishLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends AbstractC40161a<VerificationSberFinishLink> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f324445p = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f324446f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h f324447g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f324448h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f324449i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324450j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.i f324451k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f324452l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final vM0.f f324453m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.sber_id.a f324454n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f324455o = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationSberFinishLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/sber_finish/c$a;", "", "<init>", "()V", "", "SBER_BUSINESS_TYPE", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k h hVar, @Y61.k a.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.i iVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k vM0.f fVar, @Y61.k com.avito.android.verification.links.sber_id.a aVar2) {
        this.f324446f = interfaceC28373a;
        this.f324447g = hVar;
        this.f324448h = gVar;
        this.f324449i = interfaceC35745a5;
        this.f324450j = aVar;
        this.f324451k = iVar;
        this.f324452l = interfaceC4053a;
        this.f324453m = fVar;
        this.f324454n = aVar2;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, kotlin.C] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) throws SocketException {
        InterfaceC28373a interfaceC28373a;
        String str2;
        Object aVar;
        N41.f fVar;
        Uri data;
        Uri data2;
        Uri data3;
        VerificationSberFinishLink verificationSberFinishLink = (VerificationSberFinishLink) deepLink;
        h hVar = this.f324447g;
        String userHashId = hVar.f324472d.e().getUserHashId();
        com.avito.android.verification.storage.a aVar2 = hVar.f324471c;
        boolean zF2 = L.f(userHashId, aVar2.b());
        InterfaceC28373a interfaceC28373a2 = this.f324446f;
        vM0.f fVar2 = this.f324453m;
        if (!zF2) {
            PrintableText f323387g = fVar2.getF323387g();
            f.c.f125255c.getClass();
            a.i.C4057a.d(this.f324451k, f323387g, null, null, f.c.a.b(), 0, null, null, null, 2030);
            interfaceC28373a2.c(new com.avito.android.verification.links.sber_finish.a(verificationSberFinishLink.toString(), aVar2.e(), "Wrong user hash"));
            j(new k.a("Wrong user hash"));
            return;
        }
        boolean zF3 = L.f(aVar2.e().get("type"), "sber_business");
        Intent intent = verificationSberFinishLink.f324439b;
        String queryParameter = "invalid_state";
        if (zF3) {
            C49297b c49297b = this.f324454n.f324486a;
            if (c49297b == null) {
                aVar = new b.a("sber business is null");
            } else {
                String queryParameter2 = (intent == null || (data3 = intent.getData()) == null) ? null : data3.getQueryParameter(VoiceInfo.STATE);
                if (queryParameter2 != null && queryParameter2.equals(c49297b.f440878e)) {
                    Uri data4 = intent.getData();
                    queryParameter = data4 != null ? data4.getQueryParameter("error") : null;
                }
                String queryParameter3 = (intent == null || (data2 = intent.getData()) == null) ? null : data2.getQueryParameter("code");
                String queryParameter4 = (intent == null || (data = intent.getData()) == null) ? null : data.getQueryParameter("nonce");
                aVar = queryParameter3 != null ? new b.C10041b(queryParameter3, queryParameter4, null, 4, null) : new b.a(new C49922a(queryParameter3, queryParameter4, queryParameter).toString());
            }
            interfaceC28373a = interfaceC28373a2;
        } else {
            a.d.f437775a.getClass();
            Ob1.a aVar3 = a.d.f437776b;
            if (aVar3 == null) {
                Ob1.a aVar4 = new Ob1.a(StandName.f437764e);
                InterfaceC39835a interfaceC39835a = (InterfaceC39835a) a.d.f437778d.getValue();
                str2 = "invalid_state";
                int i12 = d31.h.f393656a[4];
                if (i12 == 1) {
                    fVar = N41.c.f11190b;
                } else if (i12 == 2) {
                    fVar = N41.e.f11192b;
                } else if (i12 == 3) {
                    fVar = N41.c.f11190b;
                } else if (i12 == 4) {
                    fVar = N41.e.f11192b;
                } else {
                    if (i12 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = N41.d.f11191b;
                }
                e.h hVar2 = (e.h) interfaceC39835a;
                hVar2.getClass();
                interfaceC28373a = interfaceC28373a2;
                C43259k.d((T) ((D31.g) hVar2.f394228a).f2880a.getValue(), null, null, new e.e(hVar2, fVar, null), 3);
                a.d.f437776b = aVar4;
                aVar3 = aVar4;
            } else {
                interfaceC28373a = interfaceC28373a2;
                str2 = "invalid_state";
            }
            Pb1.b bVar = new Pb1.b(null, null, null, null, null, null, 63, null);
            Uri data5 = intent.getData();
            if (data5 != null) {
                String queryParameter5 = data5.getQueryParameter(VoiceInfo.STATE);
                Boolean boolValueOf = Boolean.valueOf((intent.getData() == null || intent.getData().getQueryParameter("code") == null || !C43066x.C(aVar3.f12418a, queryParameter5, false)) ? false : true);
                bVar.f13155a = boolValueOf;
                boolean zEquals = boolValueOf.equals(Boolean.TRUE);
                ?? r14 = aVar3.f12423f;
                if (zEquals) {
                    bVar.f13156b = queryParameter5;
                    bVar.f13157c = aVar3.f12419b;
                    bVar.f13158d = data5.getQueryParameter("code");
                    ?? r72 = aVar3.f12421d;
                    Eb1.d dVar = (Eb1.d) r72.getValue();
                    if (!dVar.a()) {
                        ((B81.k) dVar.f4105d.f443396a).d();
                    }
                    ((C39499e) r14.getValue()).b(null);
                    String queryParameter6 = data5.getQueryParameter("app_token");
                    if (queryParameter6 != null) {
                        Eb1.d dVar2 = (Eb1.d) r72.getValue();
                        TypeAuth typeAuth = aVar3.f12420c;
                        if (!dVar2.a()) {
                            yc1.i iVar = dVar2.f4102a;
                            C43259k.d((T) ((D31.g) iVar.f443395b).f2880a.getValue(), null, null, new yc1.h(queryParameter6, typeAuth, iVar, null), 3);
                        }
                    }
                } else {
                    bVar.f13159e = !L.f(data5.getQueryParameter("error"), "null") ? data5.getQueryParameter("error") : C43066x.C(aVar3.f12418a, data5.getQueryParameter(VoiceInfo.STATE), false) ? str2 : "internal_error";
                    bVar.f13160f = data5.getQueryParameter("error_code");
                    C39499e c39499e = (C39499e) r14.getValue();
                    String str3 = bVar.f13160f;
                    String strConcat = str3 != null ? str3.concat("_") : null;
                    c39499e.b(strConcat + bVar.f13159e);
                }
                aVar3.f12418a = null;
                aVar3.f12419b = null;
            }
            aVar = L.f(bVar.f13155a, Boolean.FALSE) ? new b.a(bVar.toString()) : new b.C10041b(bVar.f13158d, bVar.f13157c, bVar.f13156b);
        }
        if (!(aVar instanceof b.C10041b)) {
            PrintableText f323387g2 = fVar2.getF323387g();
            f.c.f125255c.getClass();
            a.i.C4057a.d(this.f324451k, f323387g2, null, null, f.c.a.b(), 0, null, null, null, 2030);
            interfaceC28373a.c(new com.avito.android.verification.links.sber_finish.a(verificationSberFinishLink.toString(), aVar2.e(), aVar.toString()));
            j(new k.a(aVar.toString()));
            return;
        }
        b.C10041b c10041b = (b.C10041b) aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVar2.e());
        String str4 = c10041b.f324442a;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("authCode", str4);
        String str5 = c10041b.f324444c;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put(VoiceInfo.STATE, str5);
        String str6 = c10041b.f324443b;
        linkedHashMap.put("nonce", str6 != null ? str6 : "");
        this.f324455o.b(new C42017o(g1.a(hVar.f324470b.k(linkedHashMap)).z(hVar.f324469a.a()).r(d.f324456b).s(this.f324449i.e()), new C31684n(this, 28)).x(new e(this), new f(this, verificationSberFinishLink)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324455o.e();
    }
}
