package PH0;

import Y61.l;
import com.avito.android.R;
import com.avito.android.remote.model.PromoBlockIconType;
import com.avito.android.user_advert.advert.items.safe_deal_services.a;
import kotlin.Metadata;

/* compiled from: PromoBlockIconTypeConverter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-advert_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: PromoBlockIconTypeConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PH0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0838a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12948a;

        static {
            int[] iArr = new int[PromoBlockIconType.values().length];
            try {
                iArr[PromoBlockIconType.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoBlockIconType.DELIVERY_COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoBlockIconType.SAFE_PAYMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoBlockIconType.DELIVERY_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoBlockIconType.ARROW_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PromoBlockIconType.DELIVERY_OUTLINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PromoBlockIconType.WALLET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f12948a = iArr;
        }
    }

    @l
    public static final com.avito.android.user_advert.advert.items.safe_deal_services.a a(@l PromoBlockIconType promoBlockIconType) {
        switch (promoBlockIconType == null ? -1 : C0838a.f12948a[promoBlockIconType.ordinal()]) {
            case 1:
                return new a.b(R.drawable.ic_delivery_24_gray);
            case 2:
                return new a.b(R.drawable.ic_courier_24_gray);
            case 3:
                return new a.b(R.drawable.ic_card_24_gray);
            case 4:
                return new a.b(R.drawable.ic_delivery_unavailable_24_gray);
            case 5:
                return new a.b(R.drawable.ic_arrow_right_24_gray);
            case 6:
                return new a.C9501a();
            case 7:
                return new a.b(R.drawable.ic_delivery_wallet_24);
            default:
                return null;
        }
    }
}
