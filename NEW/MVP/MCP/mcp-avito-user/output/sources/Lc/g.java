package lC;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FakeDoorDialogLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlC/g;", "LKu/a;", "Lcom/avito/android/deep_linking/links/FakeDoorDialogLink;", "<init>", "()V", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends AbstractC14350a<FakeDoorDialogLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        String queryParameter = uri.getQueryParameter("title");
        String strP = i.p(uri, "type");
        d dVar = new d(uri);
        try {
            Type type = new e().getType();
            String queryParameter2 = uri.getQueryParameter("stages");
            if (queryParameter2 != null && (list = (List) gson.e(queryParameter2, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    try {
                        Type type2 = new f().getType();
                        String queryParameter3 = uri.getQueryParameter("analyticsParams");
                        return new FakeDoorDialogLink(strP, queryParameter, list, (Map) (queryParameter3 != null ? gson.e(queryParameter3, type2) : null));
                    } catch (JsonParseException e12) {
                        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "analyticsParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
                    }
                }
            }
            dVar.invoke(new IllegalArgumentException("Parameter stages is null!"));
            throw null;
        } catch (JsonParseException e13) {
            dVar.invoke(e13);
            throw null;
        }
    }
}
