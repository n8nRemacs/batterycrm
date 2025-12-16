package Cd0;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import yc.C50213a;

/* compiled from: PublishInputsValidationErrorEvent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class v0 {
    public static final LinkedHashMap a(C50213a c50213a, String str, List list, String str2, String str3) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        kotlin.Q q12 = new kotlin.Q("err", "400");
        kotlin.Q q13 = new kotlin.Q("errorsDetailed", str);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        kotlin.Q q14 = new kotlin.Q("categories", list);
        if (str2 == null) {
            str2 = "";
        }
        kotlin.Q q15 = new kotlin.Q("infm_raw_params", str2);
        if (str3 == null) {
            str3 = "";
        }
        return kotlin.collections.P0.k(linkedHashMapA, kotlin.collections.P0.g(q12, q13, q14, q15, new kotlin.Q("item_add_screen", str3)));
    }
}
