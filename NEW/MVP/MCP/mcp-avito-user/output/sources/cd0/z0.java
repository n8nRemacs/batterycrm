package Cd0;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishParamClickedEvent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z0 {
    public static final LinkedHashMap a(String str, String str2, C50213a c50213a) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        kotlin.Q q12 = new kotlin.Q("form_input_field_name", str);
        if (str2 == null) {
            str2 = "";
        }
        return kotlin.collections.P0.k(linkedHashMapA, kotlin.collections.P0.g(q12, new kotlin.Q("infm_raw_params", str2)));
    }
}
