package ml0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lml0/h;", "", "Lml0/i;", "fbsFee", "Lml0/j;", "fee", "Lml0/k;", "overall", "Lml0/l;", "subsidy", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lml0/i;Lml0/j;Lml0/k;Lml0/l;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lml0/i;", "a", "()Lml0/i;", "Lml0/j;", "b", "()Lml0/j;", "Lml0/k;", "c", "()Lml0/k;", "Lml0/l;", "d", "()Lml0/l;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    @com.google.gson.annotations.c("fbsFee")
    @Y61.l
    private final i fbsFee;

    @com.google.gson.annotations.c("fee")
    @Y61.l
    private final j fee;

    @com.google.gson.annotations.c("overall")
    @Y61.k
    private final k overall;

    @com.google.gson.annotations.c("subsidy")
    @Y61.l
    private final l subsidy;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public h(@Y61.l i iVar, @Y61.l j jVar, @Y61.k k kVar, @Y61.l l lVar, @Y61.l AttributedText attributedText) {
        this.fbsFee = iVar;
        this.fee = jVar;
        this.overall = kVar;
        this.subsidy = lVar;
        this.title = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final i getFbsFee() {
        return this.fbsFee;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final j getFee() {
        return this.fee;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final k getOverall() {
        return this.overall;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final l getSubsidy() {
        return this.subsidy;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
