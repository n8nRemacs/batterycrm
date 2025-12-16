package com.avito.android.serp.adapter.rich_snippets.job;

import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertRichJobItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {
    @Y61.l
    public static final ArrayList a(@Y61.k List list) {
        List<String> colors;
        GeoReference geoReference = (GeoReference) C42745f0.G(list);
        if (geoReference == null || (colors = geoReference.getColors()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = colors.iterator();
        while (it.hasNext()) {
            Integer numA = C35787f0.a((String) it.next());
            if (numA != null) {
                arrayList.add(numA);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Color(((Number) it2.next()).intValue()));
        }
        return arrayList2;
    }
}
