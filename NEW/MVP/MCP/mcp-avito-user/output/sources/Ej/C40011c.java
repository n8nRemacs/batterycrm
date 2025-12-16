package eJ;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LeJ/c;", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "value", "valueDark", "valueName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTheme", "()Ljava/lang/String;", "a", "b", "c", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eJ.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40011c {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.k
    private final String theme;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    @com.google.gson.annotations.c("valueDark")
    @Y61.k
    private final String valueDark;

    @com.google.gson.annotations.c("valueName")
    @Y61.k
    private final String valueName;

    public C40011c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.theme = str;
        this.value = str2;
        this.valueDark = str3;
        this.valueName = str4;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getValueDark() {
        return this.valueDark;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getValueName() {
        return this.valueName;
    }
}
