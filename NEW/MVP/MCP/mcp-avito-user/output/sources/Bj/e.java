package bJ;

import Y61.l;
import com.avito.android.hotel_public.generated.api.api_2_hotel_by_item_id_get_offer_get.InstallmentEntryPointPart;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LbJ/e;", "", "Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart;", "leftPart", "rightPart", "", "textPartsSpacing", "<init>", "(Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart;Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart;Ljava/lang/Long;)V", "Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart;", "a", "()Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart;", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    @com.google.gson.annotations.c("leftPart")
    @l
    private final InstallmentEntryPointPart leftPart;

    @com.google.gson.annotations.c("rightPart")
    @l
    private final InstallmentEntryPointPart rightPart;

    @com.google.gson.annotations.c("textPartsSpacing")
    @l
    private final Long textPartsSpacing;

    public e(@l InstallmentEntryPointPart installmentEntryPointPart, @l InstallmentEntryPointPart installmentEntryPointPart2, @l Long l12) {
        this.leftPart = installmentEntryPointPart;
        this.rightPart = installmentEntryPointPart2;
        this.textPartsSpacing = l12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final InstallmentEntryPointPart getLeftPart() {
        return this.leftPart;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final InstallmentEntryPointPart getRightPart() {
        return this.rightPart;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getTextPartsSpacing() {
        return this.textPartsSpacing;
    }
}
