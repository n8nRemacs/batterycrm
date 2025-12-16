package Yu;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FallbackableLinkPublic;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkContainerParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LYu/n;", "LKu/a;", "Lcom/avito/android/deep_linking/links/FallbackableLinkPublic;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n extends AbstractC14350a<FallbackableLinkPublic> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        l lVar = new l(uri);
        try {
            Type type = new m().getType();
            String queryParameter = uri.getQueryParameter("fallbacks");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        PublicDeeplink publicDeeplinkD = xVar.d((String) it.next());
                        if (publicDeeplinkD != null) {
                            arrayList.add(publicDeeplinkD);
                        }
                    }
                    return new FallbackableLinkPublic(arrayList, uri);
                }
            }
            lVar.invoke(new IllegalArgumentException("Parameter fallbacks is null!"));
            throw null;
        } catch (JsonParseException e12) {
            lVar.invoke(e12);
            throw null;
        }
    }
}
