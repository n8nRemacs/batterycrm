package ml0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lml0/b;", "", "Lml0/c;", "fee", "Lml0/d;", "overall", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lml0/c;Lml0/d;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lml0/c;", "a", "()Lml0/c;", "Lml0/d;", "b", "()Lml0/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ml0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44095b {

    @com.google.gson.annotations.c("fee")
    @Y61.l
    private final C44096c fee;

    @com.google.gson.annotations.c("overall")
    @Y61.k
    private final d overall;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public C44095b(@Y61.l C44096c c44096c, @Y61.k d dVar, @Y61.l AttributedText attributedText) {
        this.fee = c44096c;
        this.overall = dVar;
        this.title = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C44096c getFee() {
        return this.fee;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final d getOverall() {
        return this.overall;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
