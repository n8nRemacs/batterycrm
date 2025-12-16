package Sr;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateActivateV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSr/d;", "", "LSr/e;", "fee", "LSr/f;", "overall", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(LSr/e;LSr/f;Lcom/avito/android/remote/model/text/AttributedText;)V", "LSr/e;", "a", "()LSr/e;", "LSr/f;", "b", "()LSr/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("fee")
    @Y61.l
    private final e fee;

    @com.google.gson.annotations.c("overall")
    @Y61.k
    private final f overall;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public d(@Y61.l e eVar, @Y61.k f fVar, @Y61.l AttributedText attributedText) {
        this.fee = eVar;
        this.overall = fVar;
        this.title = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final e getFee() {
        return this.fee;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final f getOverall() {
        return this.overall;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
