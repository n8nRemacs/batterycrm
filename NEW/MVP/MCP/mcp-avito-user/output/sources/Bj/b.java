package bJ;

import Y61.k;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LbJ/b;", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "value", "valueDark", "valueName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTheme", "()Ljava/lang/String;", "a", "b", "c", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @k
    private final String theme;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    @com.google.gson.annotations.c("valueDark")
    @k
    private final String valueDark;

    @com.google.gson.annotations.c("valueName")
    @k
    private final String valueName;

    public b(@k String str, @k String str2, @k String str3, @k String str4) {
        this.theme = str;
        this.value = str2;
        this.valueDark = str3;
        this.valueName = str4;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getValueDark() {
        return this.valueDark;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValueName() {
        return this.valueName;
    }
}
