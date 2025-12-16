package com.avito.android.saved_searches.model;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/model/a;", "", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SavedSearchData.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.saved_searches.model.a$a, reason: collision with other inner class name */
    public static final class C7757a {
        @l
        public static Q<String, List<String>> a(@k a aVar) {
            Object value = aVar.getValue();
            if (value == null) {
                return null;
            }
            if (!(value instanceof List)) {
                return new Q<>(aVar.getId(), Collections.singletonList(String.valueOf(aVar.getValue())));
            }
            String id2 = aVar.getId();
            List list = (List) aVar.getValue();
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next()));
            }
            return new Q<>(id2, arrayList);
        }
    }

    @k
    String getId();

    @l
    Object getValue();
}
