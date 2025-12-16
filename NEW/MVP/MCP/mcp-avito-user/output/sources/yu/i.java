package Yu;

import android.net.Uri;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkContainerParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_deeplink-handler_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {
    public static final ArrayList a(String str, Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        e eVar = new e(uri, str);
        try {
            Type type = new f().getType();
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xVar.b((String) it.next()));
                    }
                    return arrayList;
                }
            }
            eVar.invoke(new IllegalArgumentException("Parameter " + str + " is null!"));
            throw null;
        } catch (JsonParseException e12) {
            eVar.invoke(e12);
            throw null;
        }
    }
}
