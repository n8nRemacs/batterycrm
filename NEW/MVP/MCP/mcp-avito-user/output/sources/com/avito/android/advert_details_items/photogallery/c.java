package com.avito.android.advert_details_items.photogallery;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGalleryListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/c;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c {

    /* compiled from: AdvertDetailsGalleryListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(c cVar, int i12, Long l12, Boolean bool, int i13) {
            Boolean bool2 = Boolean.TRUE;
            if ((i13 & 4) != 0) {
                bool2 = null;
            }
            if ((i13 & 8) != 0) {
                bool = null;
            }
            cVar.C(i12, l12, bool2, bool);
        }
    }

    void C(int i12, @Y61.l Long l12, @Y61.l Boolean bool, @Y61.l Boolean bool2);

    void D1(@Y61.k DeepLink deepLink);

    void a0();

    void r1();

    void z(int i12, long j12);
}
