package com.avito.android.advert.item.reusable_amenities;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_amenities.Amenities;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AmenitiesItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/reusable_amenities/d;", "Lcom/avito/android/advert/item/reusable_amenities/c;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f78610a;

    /* compiled from: AmenitiesItemFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/reusable_amenities/d$a;", "", "<init>", "()V", "", "DEFAULT_LIMIT", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f78610a = jVar;
    }

    @Override // com.avito.android.advert.item.reusable_amenities.c
    @Y61.k
    public final AmenitiesItem a(@Y61.l Amenities amenities, @Y61.l AttributedText attributedText, @Y61.l Map<String, ? extends Object> map, @Y61.k String str) {
        return new AmenitiesItem(0L, null, null, null, this.f78610a.getSpanCount(), amenities.getShownItemsCount(), amenities.getShowAllValuesButtonText(), amenities.getCloseAllValuesButtonText(), amenities.f(), attributedText, map, str, 15, null);
    }
}
