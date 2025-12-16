package eJ;

import kotlin.Metadata;

/* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LeJ/l;", "", "LeJ/m;", "leftPart", "rightPart", "", "textPartsSpacing", "<init>", "(LeJ/m;LeJ/m;Ljava/lang/Long;)V", "LeJ/m;", "a", "()LeJ/m;", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l {

    @com.google.gson.annotations.c("leftPart")
    @Y61.l
    private final m leftPart;

    @com.google.gson.annotations.c("rightPart")
    @Y61.l
    private final m rightPart;

    @com.google.gson.annotations.c("textPartsSpacing")
    @Y61.l
    private final Long textPartsSpacing;

    public l(@Y61.l m mVar, @Y61.l m mVar2, @Y61.l Long l12) {
        this.leftPart = mVar;
        this.rightPart = mVar2;
        this.textPartsSpacing = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final m getLeftPart() {
        return this.leftPart;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final m getRightPart() {
        return this.rightPart;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Long getTextPartsSpacing() {
        return this.textPartsSpacing;
    }
}
