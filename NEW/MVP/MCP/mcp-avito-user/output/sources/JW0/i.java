package jw0;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljw0/i;", "", "", "actionType", "Ljw0/l;", "clickstream", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "", "toPageId", "<init>", "(Ljava/lang/String;Ljw0/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljw0/l;", "getClickstream", "()Ljw0/l;", "b", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    @com.google.gson.annotations.c("actionType")
    @Y61.l
    private final String actionType;

    @com.google.gson.annotations.c("clickstream")
    @Y61.l
    private final l clickstream;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final String style;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("toPageId")
    @Y61.l
    private final Long toPageId;

    public i(@Y61.l String str, @Y61.l l lVar, @Y61.l String str2, @Y61.k String str3, @Y61.l Long l12) {
        this.actionType = str;
        this.clickstream = lVar;
        this.style = str2;
        this.title = str3;
        this.toPageId = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Long getToPageId() {
        return this.toPageId;
    }
}
