package one.me.deeplink;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/deeplink/MissedRequiredQueryParamsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "deep-link_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MissedRequiredQueryParamsException extends RuntimeException {
    public MissedRequiredQueryParamsException(Uri uri, Map map, LinkedHashSet linkedHashSet) {
        super("Query params for " + uri.toString() + " not contains all required params! queryParams=" + map + ", requiredParams=" + linkedHashSet);
    }
}
