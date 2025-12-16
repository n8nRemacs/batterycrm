package T80;

import T80.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    public static DeepLink a(DeepLink deepLink, AttributedText attributedText) {
        a.C1052a c1052a = a.C1052a.f15431a;
        for (Attribute attribute : attributedText.getAttributes()) {
            if (attribute instanceof DeepLinkAttribute) {
                DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) attribute;
                DeepLink deepLink2 = deepLinkAttribute.getDeepLink();
                c1052a.getClass();
                if (L.f(deepLink2.getUri(), deepLink.getUri())) {
                    return deepLinkAttribute.getDeepLink();
                }
            }
        }
        return null;
    }
}
