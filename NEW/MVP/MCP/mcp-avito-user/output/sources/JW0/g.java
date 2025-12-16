package jw0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljw0/g;", "", "", "id", "", "isEnabled", "isSelected", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "value", "<init>", "(Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "d", "()Z", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("isEnabled")
    private final boolean isEnabled;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final Long value;

    public g(@Y61.k String str, boolean z12, boolean z13, @Y61.k AttributedText attributedText, @Y61.l Long l12) {
        this.id = str;
        this.isEnabled = z12;
        this.isSelected = z13;
        this.text = attributedText;
        this.value = l12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
