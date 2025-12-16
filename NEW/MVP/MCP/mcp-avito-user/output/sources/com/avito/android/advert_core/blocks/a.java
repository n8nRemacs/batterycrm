package com.avito.android.advert_core.blocks;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetailsBlock;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBlockFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/blocks/a;", "", "b", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertDetailsBlockFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.blocks.a$a, reason: collision with other inner class name */
    public static final class C2462a {
        @l
        public static List<PersistableSpannedItem> a(@k a aVar, @k b bVar) {
            List<PersistableSpannedItem> listA;
            if (!aVar.c(bVar) || (listA = aVar.a(bVar)) == null) {
                return null;
            }
            List<PersistableSpannedItem> list = listA;
            return list.isEmpty() ? null : list;
        }
    }

    /* compiled from: AdvertDetailsBlockFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/blocks/a$b;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertDetailsWithMeta f83013a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdvertDetailsStyle f83014b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AdvertDetailsBlock f83015c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f83016d;

        public b(@k AdvertDetailsWithMeta advertDetailsWithMeta, @k AdvertDetailsStyle advertDetailsStyle, @k AdvertDetailsBlock advertDetailsBlock, @k List<AdvertDetailsBlockItem> list) {
            this.f83013a = advertDetailsWithMeta;
            this.f83014b = advertDetailsStyle;
            this.f83015c = advertDetailsBlock;
            this.f83016d = list;
        }
    }

    @l
    List<PersistableSpannedItem> a(@k b bVar);

    @l
    List<PersistableSpannedItem> b(@k b bVar);

    boolean c(@k b bVar);
}
