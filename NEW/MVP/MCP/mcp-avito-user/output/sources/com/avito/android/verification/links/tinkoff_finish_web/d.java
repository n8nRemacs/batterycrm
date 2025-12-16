package com.avito.android.verification.links.tinkoff_finish_web;

import Y61.k;
import android.os.Bundle;
import android.util.Base64;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.verification.links.tinkoff_finish_web.j;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.text.C43047d;

/* compiled from: VerificationTinkoffFinishWebLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_finish_web/d;", "Lev/a;", "Lcom/avito/android/verification/links/tinkoff_finish_web/VerificationTinkoffFinishWebLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC40161a<VerificationTinkoffFinishWebLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f324606f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f324607g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f324608h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324609i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f324610j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324611k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final vM0.f f324612l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC28373a f324613m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f324614n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Map<String, String> f324615o;

    @Inject
    public d(@k f fVar, @k a.g gVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.i iVar, @k a.InterfaceC4053a interfaceC4053a, @k vM0.f fVar2, @k InterfaceC28373a interfaceC28373a) {
        this.f324606f = fVar;
        this.f324607g = gVar;
        this.f324608h = interfaceC35745a5;
        this.f324609i = aVar;
        this.f324610j = iVar;
        this.f324611k = interfaceC4053a;
        this.f324612l = fVar2;
        this.f324613m = interfaceC28373a;
        this.f324615o = fVar.f324627d.c();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        VerificationTinkoffFinishWebLink verificationTinkoffFinishWebLink = (VerificationTinkoffFinishWebLink) deepLink;
        f fVar = this.f324606f;
        String userHashId = fVar.f324628e.e().getUserHashId();
        com.avito.android.verification.storage.a aVar = fVar.f324627d;
        boolean zF2 = L.f(userHashId, aVar.k());
        com.avito.android.verification.links.tinkoff_documents.f fVar2 = fVar.f324629f;
        vM0.f fVar3 = this.f324612l;
        if (!zF2) {
            aVar.d(P0.c());
            aVar.a(null);
            fVar2.f324554a = null;
            PrintableText f323384d = fVar3.getF323384d();
            f.c.f125255c.getClass();
            a.i.C4057a.d(this.f324610j, f323384d, null, null, f.c.a.b(), 0, null, null, null, 2030);
            k(verificationTinkoffFinishWebLink, "Неправильный юзер хэш");
            j(new j.a("Wrong user hash"));
            return;
        }
        ?? r32 = verificationTinkoffFinishWebLink.f324601c;
        if (!r32.containsKey("code")) {
            aVar.d(P0.c());
            aVar.a(null);
            fVar2.f324554a = null;
            PrintableText f323384d2 = fVar3.getF323384d();
            f.c.f125255c.getClass();
            a.i.C4057a.d(this.f324610j, f323384d2, null, null, f.c.a.b(), 0, null, null, null, 2030);
            k(verificationTinkoffFinishWebLink, "WEB cancelled or error");
            j(new j.a("WEB cancelled or error"));
            return;
        }
        String str2 = (String) r32.get("code");
        String str3 = str2 == null ? "" : str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVar.c());
        String str4 = (String) linkedHashMap.remove("client_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) linkedHashMap.remove("redirect_uri");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) linkedHashMap.remove("code_verifier");
        String str8 = str7 == null ? "" : str7;
        Charset charset = C43047d.f410589b;
        this.f324614n.b(new C42017o(fVar.f324626c.a("Basic ".concat(new String(Base64.encode(str4.getBytes(charset), 2), charset)), "authorization_code", str3, str6, str8).n(new g(fVar, linkedHashMap)).z(fVar.f324624a.a()).s(this.f324608h.e()).j(new a(this)), new com.avito.android.verification.links.tinkoff_finish.g(this, 1)).x(new b(this), new c(this, verificationTinkoffFinishWebLink)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324614n.e();
    }

    public final void k(VerificationTinkoffFinishWebLink verificationTinkoffFinishWebLink, String str) {
        this.f324613m.c(new com.avito.android.verification.links.tinkoff_finish.a(verificationTinkoffFinishWebLink.f324600b.toString(), this.f324615o, str));
    }
}
