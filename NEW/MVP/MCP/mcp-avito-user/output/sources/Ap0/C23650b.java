package ap0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiCreateAutoDispatchV1Request.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lap0/b;", "", "", "budgetRub", "discountValue", "endDate", "itemId", "", "offerSlug", "offerTTLDays", "<init>", "(JLjava/lang/Long;JJLjava/lang/String;J)V", "J", "getBudgetRub", "()J", "Ljava/lang/Long;", "getDiscountValue", "()Ljava/lang/Long;", "getEndDate", "getItemId", "Ljava/lang/String;", "getOfferSlug", "()Ljava/lang/String;", "getOfferTTLDays", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ap0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23650b {

    @c("budgetRub")
    private final long budgetRub;

    @c("discountValue")
    @l
    private final Long discountValue;

    @c("endDate")
    private final long endDate;

    @c("itemId")
    private final long itemId;

    @c("offerSlug")
    @k
    private final String offerSlug;

    @c("offerTTLDays")
    private final long offerTTLDays;

    public C23650b(long j12, @l Long l12, long j13, long j14, @k String str, long j15) {
        this.budgetRub = j12;
        this.discountValue = l12;
        this.endDate = j13;
        this.itemId = j14;
        this.offerSlug = str;
        this.offerTTLDays = j15;
    }
}
