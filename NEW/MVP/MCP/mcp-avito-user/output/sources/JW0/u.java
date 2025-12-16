package jw0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Ljw0/u;", "", "", "blockWidth", "Ljw0/v;", "dashColor", "dashCount", "dashSpacing", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "textMarginTop", "title", "<init>", "(Ljava/lang/Long;Ljw0/v;JLjava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljw0/v;", "b", "()Ljw0/v;", "J", "c", "()J", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "g", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u {

    @com.google.gson.annotations.c("blockWidth")
    @Y61.l
    private final Long blockWidth;

    @com.google.gson.annotations.c("dashColor")
    @Y61.k
    private final v dashColor;

    @com.google.gson.annotations.c("dashCount")
    private final long dashCount;

    @com.google.gson.annotations.c("dashSpacing")
    @Y61.l
    private final Long dashSpacing;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("textMarginTop")
    @Y61.l
    private final Long textMarginTop;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public u(@Y61.l Long l12, @Y61.k v vVar, long j12, @Y61.l Long l13, @Y61.l AttributedText attributedText, @Y61.l Long l14, @Y61.k AttributedText attributedText2) {
        this.blockWidth = l12;
        this.dashColor = vVar;
        this.dashCount = j12;
        this.dashSpacing = l13;
        this.subtitle = attributedText;
        this.textMarginTop = l14;
        this.title = attributedText2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getBlockWidth() {
        return this.blockWidth;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final v getDashColor() {
        return this.dashColor;
    }

    /* renamed from: c, reason: from getter */
    public final long getDashCount() {
        return this.dashCount;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Long getDashSpacing() {
        return this.dashSpacing;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Long getTextMarginTop() {
        return this.textMarginTop;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
