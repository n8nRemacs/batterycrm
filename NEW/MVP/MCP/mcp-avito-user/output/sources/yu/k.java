package Yu;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FallbackableLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DeeplinkContainerParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LYu/k;", "LKu/a;", "Lcom/avito/android/deep_linking/links/FallbackableLink;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends AbstractC14350a<FallbackableLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        g gVar = new g(uri);
        try {
            Type type = new h().getType();
            String queryParameter = uri.getQueryParameter("fallbacks");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<String> list2 = list;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                    for (String str : list2) {
                        DeepLink deepLinkD = xVar.d(str);
                        if (deepLinkD == null) {
                            deepLinkD = xVar.b(str);
                        }
                        arrayList.add(deepLinkD);
                    }
                    return new FallbackableLink(arrayList, uri);
                }
            }
            gVar.invoke(new IllegalArgumentException("Parameter fallbacks is null!"));
            throw null;
        } catch (JsonParseException e12) {
            gVar.invoke(e12);
            throw null;
        }
    }
}
