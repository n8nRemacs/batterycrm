package Sr;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateActivateV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LSr/g;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalInfo", "LSr/h;", "fee", "LSr/i;", "overall", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LSr/h;LSr/i;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LSr/h;", "b", "()LSr/h;", "LSr/i;", "c", "()LSr/i;", "d", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("additionalInfo")
    @Y61.l
    private final AttributedText additionalInfo;

    @com.google.gson.annotations.c("fee")
    @Y61.l
    private final h fee;

    @com.google.gson.annotations.c("overall")
    @Y61.k
    private final i overall;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public g(@Y61.l AttributedText attributedText, @Y61.l h hVar, @Y61.k i iVar, @Y61.l AttributedText attributedText2) {
        this.additionalInfo = attributedText;
        this.fee = hVar;
        this.overall = iVar;
        this.title = attributedText2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final h getFee() {
        return this.fee;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final i getOverall() {
        return this.overall;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
