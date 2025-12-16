package Zi0;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.registration_self_employment_redirect_screen.SelfEmploymentRedirectDeeplink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SelfEmploymentRedirectDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LZi0/e;", "LKu/a;", "Lcom/avito/android/registration_self_employment_redirect_screen/SelfEmploymentRedirectDeeplink;", "<init>", "()V", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends AbstractC14350a<SelfEmploymentRedirectDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new SelfEmploymentRedirectDeeplink();
    }
}
