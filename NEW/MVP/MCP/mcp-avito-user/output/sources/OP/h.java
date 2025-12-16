package Op;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AgentRoomGetSoldFormApiResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"LOp/h;", "", "LOp/f;", "comment", "LOp/c;", "commissionConfirmation", "contractPrice", "LOp/g;", "dealDate", "LOp/d;", "dealFeatures", "paymentMethod", "rewardAmount", "usedPartnerServices", "<init>", "(LOp/f;LOp/c;LOp/f;LOp/g;LOp/d;LOp/d;LOp/f;LOp/d;)V", "LOp/f;", "a", "()LOp/f;", "LOp/c;", "b", "()LOp/c;", "c", "LOp/g;", "d", "()LOp/g;", "LOp/d;", "e", "()LOp/d;", "f", "g", "h", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    @com.google.gson.annotations.c("comment")
    @l
    private final f comment;

    @com.google.gson.annotations.c("commissionConfirmation")
    @k
    private final c commissionConfirmation;

    @com.google.gson.annotations.c("contractPrice")
    @k
    private final f contractPrice;

    @com.google.gson.annotations.c("dealDate")
    @k
    private final g dealDate;

    @com.google.gson.annotations.c("dealFeatures")
    @k
    private final d dealFeatures;

    @com.google.gson.annotations.c("paymentMethod")
    @k
    private final d paymentMethod;

    @com.google.gson.annotations.c("rewardAmount")
    @k
    private final f rewardAmount;

    @com.google.gson.annotations.c("usedPartnerServices")
    @k
    private final d usedPartnerServices;

    public h(@l f fVar, @k c cVar, @k f fVar2, @k g gVar, @k d dVar, @k d dVar2, @k f fVar3, @k d dVar3) {
        this.comment = fVar;
        this.commissionConfirmation = cVar;
        this.contractPrice = fVar2;
        this.dealDate = gVar;
        this.dealFeatures = dVar;
        this.paymentMethod = dVar2;
        this.rewardAmount = fVar3;
        this.usedPartnerServices = dVar3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getComment() {
        return this.comment;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final c getCommissionConfirmation() {
        return this.commissionConfirmation;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final f getContractPrice() {
        return this.contractPrice;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final g getDealDate() {
        return this.dealDate;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final d getDealFeatures() {
        return this.dealFeatures;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final d getPaymentMethod() {
        return this.paymentMethod;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final f getRewardAmount() {
        return this.rewardAmount;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final d getUsedPartnerServices() {
        return this.usedPartnerServices;
    }
}
