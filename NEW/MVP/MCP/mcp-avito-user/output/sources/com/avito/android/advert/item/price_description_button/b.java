package com.avito.android.advert.item.price_description_button;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.AdvertDetailsPriceDescriptionButton;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceDescriptionButtonConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/price_description_button/b;", "Lcom/avito/android/advert/item/price_description_button/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.price_description_button.a {

    /* compiled from: AdvertDetailsPriceDescriptionButtonConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78238a;

        static {
            int[] iArr = new int[AdvertDetailsPriceDescriptionButton.IconType.values().length];
            try {
                iArr[AdvertDetailsPriceDescriptionButton.IconType.BUYER_BONUSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f78238a = iArr;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.advert.item.price_description_button.a
    @l
    public final Integer a(@l AdvertDetailsPriceDescriptionButton.IconType iconType) {
        if ((iconType == null ? -1 : a.f78238a[iconType.ordinal()]) == 1) {
            return Integer.valueOf(R.attr.ic_buyerBonuses24);
        }
        return null;
    }
}
