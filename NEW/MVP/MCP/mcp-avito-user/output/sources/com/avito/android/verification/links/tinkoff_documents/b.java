package com.avito.android.verification.links.tinkoff_documents;

import Y61.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.account.W;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.verification.links.tinkoff_documents.e;
import ev.AbstractC40161a;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationTinkoffDocumentsAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_documents/b;", "Lev/a;", "Lcom/avito/android/verification/links/tinkoff_documents/VerificationTinkoffDocumentsLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<VerificationTinkoffDocumentsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f324533f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324534g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324535h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final W f324536i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.verification.storage.a f324537j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final f f324538k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final vM0.f f324539l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final a.i f324540m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final InterfaceC28373a f324541n;

    @Inject
    public b(@k Context context, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.InterfaceC4053a interfaceC4053a, @k W w12, @k com.avito.android.verification.storage.a aVar2, @k f fVar, @k vM0.f fVar2, @k a.i iVar, @k InterfaceC28373a interfaceC28373a) {
        this.f324533f = context;
        this.f324534g = aVar;
        this.f324535h = interfaceC4053a;
        this.f324536i = w12;
        this.f324537j = aVar2;
        this.f324538k = fVar;
        this.f324539l = fVar2;
        this.f324540m = iVar;
        this.f324541n = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        VerificationTinkoffDocumentsLink verificationTinkoffDocumentsLink = (VerificationTinkoffDocumentsLink) deepLink;
        Uri uri = verificationTinkoffDocumentsLink.f324529d;
        String string = uri.toString();
        f fVar = this.f324538k;
        fVar.getClass();
        ru.tinkoff.core.tinkoffId.g gVar = new ru.tinkoff.core.tinkoffId.g(this.f324533f, verificationTinkoffDocumentsLink.f324528c, string);
        fVar.f324554a = gVar;
        boolean zD2 = gVar.d();
        LinkedHashMap linkedHashMap = verificationTinkoffDocumentsLink.f324527b;
        if (zD2) {
            com.avito.android.verification.storage.a aVar = this.f324537j;
            aVar.d(linkedHashMap);
            ProfileInfo profileInfoA = this.f324536i.a();
            aVar.a(profileInfoA != null ? profileInfoA.getUserHashId() : null);
            this.f324535h.R(gVar.b(uri), new a(this, verificationTinkoffDocumentsLink));
            j(e.b.f324552b);
            return;
        }
        DeepLink deepLink2 = verificationTinkoffDocumentsLink.f324530e;
        if (deepLink2 != null) {
            i(e.c.f324553b, this.f324534g, deepLink2);
            return;
        }
        PrintableText f323385e = this.f324539l.getF323385e();
        f.c.f125255c.getClass();
        a.i.C4057a.d(this.f324540m, f323385e, null, null, f.c.a.b(), 0, null, null, null, 2030);
        this.f324541n.c(new com.avito.android.verification.links.tinkoff_finish.a(verificationTinkoffDocumentsLink.toString(), linkedHashMap, "fallback is null"));
        j(e.a.f324551b);
    }
}
