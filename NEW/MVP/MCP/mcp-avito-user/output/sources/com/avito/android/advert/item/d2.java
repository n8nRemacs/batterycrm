package com.avito.android.advert.item;

import kotlin.Metadata;

/* compiled from: AdvertDetailsViewScroller.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/d2;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d2 {

    /* compiled from: AdvertDetailsViewScroller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void b(int i12, int i13, int i14, I1 i15) {
            if ((i14 & 2) != 0) {
                i13 = 0;
            }
            i15.Z(i12, i13, (i14 & 8) == 0);
        }
    }

    void d(int i12, @Y61.k String str);
}
