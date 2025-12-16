package z90;

import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz90/M;", "", "Lz90/N;", "prepayment", "Lz90/O;", PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_WALLET, "<init>", "(Lz90/N;Lz90/O;)V", "Lz90/N;", "a", "()Lz90/N;", "Lz90/O;", "b", "()Lz90/O;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class M {

    @com.google.gson.annotations.c("prepayment")
    @Y61.l
    private final N prepayment;

    @com.google.gson.annotations.c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_WALLET)
    @Y61.k
    private final O wallet;

    public M(@Y61.l N n12, @Y61.k O o12) {
        this.prepayment = n12;
        this.wallet = o12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final N getPrepayment() {
        return this.prepayment;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final O getWallet() {
        return this.wallet;
    }
}
