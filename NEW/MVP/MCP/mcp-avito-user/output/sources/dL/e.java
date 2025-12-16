package dL;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: IacPii.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-models_abstract"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    public static final String a(DeepLink deepLink) {
        try {
            return deepLink.getVersion() + deepLink.getPath();
        } catch (Exception unused) {
            return "Unknown deeplink";
        }
    }
}
