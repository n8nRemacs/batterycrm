package Sr;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateActivateV3Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LSr/j;", "", "LSr/k;", "fee", "LSr/l;", "overall", "LSr/m;", "subsidy", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(LSr/k;LSr/l;LSr/m;Lcom/avito/android/remote/model/text/AttributedText;)V", "LSr/k;", "a", "()LSr/k;", "LSr/l;", "b", "()LSr/l;", "LSr/m;", "c", "()LSr/m;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    @com.google.gson.annotations.c("fee")
    @Y61.l
    private final k fee;

    @com.google.gson.annotations.c("overall")
    @Y61.k
    private final l overall;

    @com.google.gson.annotations.c("subsidy")
    @Y61.l
    private final m subsidy;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public j(@Y61.l k kVar, @Y61.k l lVar, @Y61.l m mVar, @Y61.l AttributedText attributedText) {
        this.fee = kVar;
        this.overall = lVar;
        this.subsidy = mVar;
        this.title = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final k getFee() {
        return this.fee;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final l getOverall() {
        return this.overall;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final m getSubsidy() {
        return this.subsidy;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
