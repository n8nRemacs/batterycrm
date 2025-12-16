package Nz;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Jz.InterfaceC14264a;
import Mz.InterfaceC14545a;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.esia_webview.EsiaWebViewDeeplink;
import ev.AbstractC40162b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: EsiaWebViewDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LNz/a;", "Lev/b;", "Lcom/avito/android/esia_webview/EsiaWebViewDeeplink;", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14631a extends AbstractC40162b<EsiaWebViewDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f11884d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC14545a f11885e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC14264a f11886f;

    @Inject
    public C14631a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC14545a interfaceC14545a, @k InterfaceC14264a interfaceC14264a) {
        this.f11884d = interfaceC4053a;
        this.f11885e = interfaceC14545a;
        this.f11886f = interfaceC14264a;
    }

    public static String d(String str, String str2, String str3) throws UnsupportedEncodingException {
        try {
            return URLEncoder.encode("ru.avito://1/gigger/kyc/esia/webview?authUrl=" + URLEncoder.encode(str, "UTF8") + "&trigger=" + URLEncoder.encode(str2, "UTF8") + "&resultDeeplink=" + URLEncoder.encode(str3, "UTF8"), "UTF8");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) throws UnsupportedEncodingException {
        Intent intentA;
        EsiaWebViewDeeplink esiaWebViewDeeplink = (EsiaWebViewDeeplink) deepLink;
        String str2 = esiaWebViewDeeplink.f148169b;
        boolean zQ2 = C43066x.q(str2, "use_sdk=true", false);
        String str3 = esiaWebViewDeeplink.f148170c;
        String str4 = esiaWebViewDeeplink.f148171d;
        if (zQ2) {
            intentA = this.f11886f.a(str2, str4, d(str2, str3, str4));
        } else {
            intentA = this.f11885e.a(str2, str3, str4, d(str2, str3, str4));
        }
        this.f11884d.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
