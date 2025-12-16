package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GeoSearchPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/E;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface E {

    /* compiled from: GeoSearchPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ q.a a(E e12, q.a aVar, String str, com.avito.android.mvi.b bVar, ArrayList arrayList, int i12) {
            if ((i12 & 1) != 0) {
                str = aVar.getF196608b();
            }
            if ((i12 & 2) != 0) {
                bVar = aVar.b();
            }
            List<com.avito.android.messenger.map.search.adapter.a> listC = arrayList;
            if ((i12 & 4) != 0) {
                listC = aVar.c();
            }
            return e12.b(aVar, str, bVar, listC);
        }
    }

    @Y61.k
    v b(@Y61.k q.a aVar, @Y61.k String str, @Y61.k com.avito.android.mvi.b bVar, @Y61.k List list);
}
