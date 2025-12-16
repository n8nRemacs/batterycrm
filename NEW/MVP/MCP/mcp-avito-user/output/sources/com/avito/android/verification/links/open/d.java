package com.avito.android.verification.links.open;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.account.G;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: VerificationOpenLinkSyncHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/open/d;", "Lev/b;", "Lcom/avito/android/verification/links/open/VerificationOpenLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC40162b<VerificationOpenLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324323d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.verification.storage.a f324324e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final G f324325f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f324326g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.verification.links.open.a f324327h;

    /* compiled from: VerificationOpenLinkSyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/verification/links/open/d$a;", "", "<init>", "()V", "", "CODE_CHALLENGE_METHOD_S256", "Ljava/lang/String;", "KEY_CODE_CHALLENGE", "KEY_CODE_CHALLENGE_METHOD", "KEY_RESPONSE_MODE", "RESPONSE_MODE_QUERY", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public d(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.verification.storage.a aVar, @k G g12, @k InterfaceC35845m2 interfaceC35845m2, @k com.avito.android.verification.links.open.a aVar2) {
        this.f324323d = interfaceC4053a;
        this.f324324e = aVar;
        this.f324325f = g12;
        this.f324326g = interfaceC35845m2;
        this.f324327h = aVar2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        VerificationOpenLink verificationOpenLink = (VerificationOpenLink) deepLink;
        LinkedHashMap linkedHashMap = verificationOpenLink.f324320c;
        String str2 = (String) linkedHashMap.get("type");
        if (str2 == null) {
            str2 = "";
        }
        boolean zQ2 = C43066x.q(str2, "tinkoff", false);
        InterfaceC35845m2 interfaceC35845m2 = this.f324326g;
        Uri uri = verificationOpenLink.f324319b;
        a.InterfaceC4053a interfaceC4053a = this.f324323d;
        if (zQ2) {
            com.avito.android.verification.links.open.a aVar = this.f324327h;
            aVar.getClass();
            String strA = com.avito.android.verification.links.open.a.a();
            String strB = aVar.b(strA);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            String queryParameter = uri.getQueryParameter("redirect_uri");
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap2.put("redirect_uri", queryParameter);
            String queryParameter2 = uri.getQueryParameter("client_id");
            linkedHashMap2.put("client_id", queryParameter2 != null ? queryParameter2 : "");
            linkedHashMap2.put("code_verifier", strA);
            com.avito.android.verification.storage.a aVar2 = this.f324324e;
            aVar2.d(linkedHashMap2);
            aVar2.a(this.f324325f.e().getUserHashId());
            interfaceC4053a.R(interfaceC35845m2.u(uri.buildUpon().appendQueryParameter("code_challenge", strB).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("response_mode", "query").build(), (6 & 2) == 0, (6 & 4) == 0), com.avito.android.deeplink_handler.view.b.f134588l);
        } else {
            interfaceC4053a.R(interfaceC35845m2.u(uri, (6 & 2) == 0, (6 & 4) == 0), com.avito.android.deeplink_handler.view.b.f134588l);
        }
        return AbstractC14250d.c.f9171c;
    }
}
