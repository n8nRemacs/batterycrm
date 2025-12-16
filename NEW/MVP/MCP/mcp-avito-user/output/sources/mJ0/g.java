package MJ0;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.user_stats.deeplink.UserStatsLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UserStatsLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMJ0/g;", "LKu/a;", "Lcom/avito/android/user_stats/deeplink/UserStatsLink;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends AbstractC14350a<UserStatsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("tabPosition");
        int i12 = queryParameter != null ? Integer.parseInt(queryParameter) : 0;
        String queryParameter2 = uri.getQueryParameter("startDate");
        long j12 = queryParameter2 != null ? Long.parseLong(queryParameter2) : 0L;
        String queryParameter3 = uri.getQueryParameter("endDate");
        long j13 = queryParameter3 != null ? Long.parseLong(queryParameter3) : 0L;
        String queryParameter4 = uri.getQueryParameter("metric");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        String queryParameter5 = uri.getQueryParameter("split");
        String str = queryParameter5 == null ? "" : queryParameter5;
        try {
            Type type = new e().getType();
            String queryParameter6 = uri.getQueryParameter("itemIDs");
            List list = (List) (queryParameter6 != null ? gson.e(queryParameter6, type) : null);
            if (list == null) {
                list = C42784z0.f406748b;
            }
            List list2 = list;
            try {
                Type type2 = new f().getType();
                String queryParameter7 = uri.getQueryParameter("spaces");
                List list3 = (List) (queryParameter7 != null ? gson.e(queryParameter7, type2) : null);
                if (list3 == null) {
                    list3 = C42784z0.f406748b;
                }
                return new UserStatsLink(i12, j12, j13, queryParameter4, str, list2, list3);
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "spaces", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        } catch (JsonParseException e13) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "itemIDs", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
        }
    }
}
