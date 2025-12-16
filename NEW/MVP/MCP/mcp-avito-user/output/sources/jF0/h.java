package jF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LjF0/h;", "", "", "blockWidth", "LjF0/i;", "dashColor", "dashCount", "dashSpacing", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "textMarginTop", "title", "<init>", "(Ljava/lang/Long;LjF0/i;JJLcom/avito/android/remote/model/text/AttributedText;JLcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/Long;", "getBlockWidth", "()Ljava/lang/Long;", "LjF0/i;", "getDashColor", "()LjF0/i;", "J", "getDashCount", "()J", "getDashSpacing", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTextMarginTop", "getTitle", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c("blockWidth")
    @l
    private final Long blockWidth;

    @com.google.gson.annotations.c("dashColor")
    @k
    private final i dashColor;

    @com.google.gson.annotations.c("dashCount")
    private final long dashCount;

    @com.google.gson.annotations.c("dashSpacing")
    private final long dashSpacing;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("textMarginTop")
    private final long textMarginTop;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public h(@l Long l12, @k i iVar, long j12, long j13, @l AttributedText attributedText, long j14, @k AttributedText attributedText2) {
        this.blockWidth = l12;
        this.dashColor = iVar;
        this.dashCount = j12;
        this.dashSpacing = j13;
        this.subtitle = attributedText;
        this.textMarginTop = j14;
        this.title = attributedText2;
    }
}
