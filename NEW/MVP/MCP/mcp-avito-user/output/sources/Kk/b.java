package KK;

import Y61.k;
import android.net.Uri;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiMapStringString;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35837l2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ToImageUI.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    @k
    public static final IacPiiImage a(@k IacPiiMapStringString iacPiiMapStringString) {
        Set<Map.Entry<String, String>> setEntrySet = iacPiiMapStringString.getValue().entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(C35837l2.b((String) entry.getKey()), Uri.parse((String) entry.getValue()));
        }
        return new IacPiiImage(new Image(C35755b0.b(linkedHashMap)));
    }
}
