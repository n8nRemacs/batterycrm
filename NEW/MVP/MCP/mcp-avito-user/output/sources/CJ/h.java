package cJ;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LcJ/h;", "", "LcJ/i;", "button", "", "price", "", "rentConditions", "<init>", "(LcJ/i;Ljava/lang/String;Ljava/util/List;)V", "LcJ/i;", "getButton", "()LcJ/i;", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "Ljava/util/List;", "getRentConditions", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final i button;

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final String price;

    @com.google.gson.annotations.c("rentConditions")
    @Y61.l
    private final List<String> rentConditions;

    public h(@Y61.l i iVar, @Y61.l String str, @Y61.l List<String> list) {
        this.button = iVar;
        this.price = str;
        this.rentConditions = list;
    }
}
