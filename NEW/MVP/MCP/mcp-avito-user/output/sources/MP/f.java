package Mp;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"LMp/f;", "", "", "agentCommission", "", "backgroundGradient", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LMp/i;", "image", "objectPriceByContract", "productCommission", "productCommissionRate", "title", "<init>", "(JLjava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;LMp/i;JJJLcom/avito/android/remote/model/text/AttributedText;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LMp/i;", "d", "()LMp/i;", "e", "f", "g", "h", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    @com.google.gson.annotations.c("agentCommission")
    private final long agentCommission;

    @com.google.gson.annotations.c("backgroundGradient")
    @Y61.k
    private final String backgroundGradient;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final i image;

    @com.google.gson.annotations.c("objectPriceByContract")
    private final long objectPriceByContract;

    @com.google.gson.annotations.c("productCommission")
    private final long productCommission;

    @com.google.gson.annotations.c("productCommissionRate")
    private final long productCommissionRate;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public f(long j12, @Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l i iVar, long j13, long j14, long j15, @Y61.k AttributedText attributedText2) {
        this.agentCommission = j12;
        this.backgroundGradient = str;
        this.description = attributedText;
        this.image = iVar;
        this.objectPriceByContract = j13;
        this.productCommission = j14;
        this.productCommissionRate = j15;
        this.title = attributedText2;
    }

    /* renamed from: a, reason: from getter */
    public final long getAgentCommission() {
        return this.agentCommission;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final i getImage() {
        return this.image;
    }

    /* renamed from: e, reason: from getter */
    public final long getObjectPriceByContract() {
        return this.objectPriceByContract;
    }

    /* renamed from: f, reason: from getter */
    public final long getProductCommission() {
        return this.productCommission;
    }

    /* renamed from: g, reason: from getter */
    public final long getProductCommissionRate() {
        return this.productCommissionRate;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
