package jw0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Ljw0/s;", "", "", "planId", "Ljw0/t;", "progress", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "termTitle", "title", "type", "<init>", "(Ljava/lang/String;Ljw0/t;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljw0/t;", "b", "()Ljw0/t;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "e", "f", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    @com.google.gson.annotations.c("planId")
    @Y61.k
    private final String planId;

    @com.google.gson.annotations.c("progress")
    @Y61.k
    private final t progress;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("termTitle")
    @Y61.k
    private final String termTitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final String type;

    public s(@Y61.k String str, @Y61.k t tVar, @Y61.l AttributedText attributedText, @Y61.k String str2, @Y61.k AttributedText attributedText2, @Y61.k String str3) {
        this.planId = str;
        this.progress = tVar;
        this.subtitle = attributedText;
        this.termTitle = str2;
        this.title = attributedText2;
        this.type = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final t getProgress() {
        return this.progress;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTermTitle() {
        return this.termTitle;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
