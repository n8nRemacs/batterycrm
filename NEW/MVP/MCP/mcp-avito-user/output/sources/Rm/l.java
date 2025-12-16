package rM;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_util_deeplinks.public_module.control_flow.SetExecutableArgsLink;
import com.avito.android.util.C35755b0;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SetExecutableArgsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LrM/l;", "LKu/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/SetExecutableArgsLink;", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends AbstractC14350a<SetExecutableArgsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter;
        DeepLink deepLinkB = xVar.b(Ku.i.n(uri, "run"));
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Map mapC = null;
        if (queryParameterNames != null) {
            Set<String> set = queryParameterNames;
            int iF2 = P0.f(C42745f0.q(set, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : set) {
                String str = (String) obj;
                linkedHashMap.put(obj, (L.f(str, "run") || (queryParameter = uri.getQueryParameter(str)) == null) ? null : xVar.b(queryParameter));
            }
            mapC = C35755b0.c(linkedHashMap);
        }
        if (mapC == null) {
            mapC = P0.c();
        }
        return new SetExecutableArgsLink(mapC, deepLinkB);
    }
}
