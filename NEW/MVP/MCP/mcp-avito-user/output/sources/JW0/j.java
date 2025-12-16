package jw0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Ljw0/j;", "", "Ljw0/i;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "price", "", "toBlockId", "type", "<init>", "(Ljw0/i;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Ljw0/i;", "a", "()Ljw0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getType", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final i button;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final AttributedText price;

    @com.google.gson.annotations.c("toBlockId")
    @Y61.l
    private final String toBlockId;

    @com.google.gson.annotations.c("type")
    @Y61.l
    private final String type;

    public j(@Y61.l i iVar, @Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l String str, @Y61.l String str2) {
        this.button = iVar;
        this.description = attributedText;
        this.price = attributedText2;
        this.toBlockId = str;
        this.type = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final i getButton() {
        return this.button;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getToBlockId() {
        return this.toBlockId;
    }
}
