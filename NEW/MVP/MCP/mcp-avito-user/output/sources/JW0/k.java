package jw0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljw0/k;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "toPageId", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("toPageId")
    @Y61.l
    private final Long toPageId;

    public k(@Y61.k AttributedText attributedText, @Y61.l Long l12) {
        this.title = attributedText;
        this.toPageId = l12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getToPageId() {
        return this.toPageId;
    }
}
