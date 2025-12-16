package xf;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaLandingLink;
import com.avito.android.autoteka.deeplinks.LandingDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.util.UtmParams;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: AutotekaLandingDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxf/c;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaLandingLink;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xf.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49935c extends AbstractC14350a<AutotekaLandingLink> {

    /* compiled from: AutotekaLandingDeepLinkParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxf/c$a;", "", "<init>", "()V", "", "KEY_FROM_BLOCK", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xf.c$a */
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

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        UtmParams.f318750c.getClass();
        UtmParams utmParamsA = UtmParams.a.a(uri);
        String queryParameter = uri.getQueryParameter("fromBlock");
        return new AutotekaLandingLink(new LandingDetails(queryParameter != null ? C43066x.y0(queryParameter) : null, utmParamsA));
    }
}
