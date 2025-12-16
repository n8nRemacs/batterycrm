package Bv;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PriceReductionState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBv/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f1788f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f1789g = new c(0, 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public final long f1790b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1791c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1792d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1793e;

    /* compiled from: PriceReductionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBv/c$a;", "", "<init>", "()V", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(long j12, long j13, long j14, boolean z12) {
        this.f1790b = j12;
        this.f1791c = j13;
        this.f1792d = j14;
        this.f1793e = z12;
    }

    public static c a(c cVar, long j12, long j13, long j14, boolean z12, int i12) {
        long j15 = (i12 & 1) != 0 ? cVar.f1790b : j12;
        long j16 = (i12 & 2) != 0 ? cVar.f1791c : j13;
        long j17 = (i12 & 4) != 0 ? cVar.f1792d : j14;
        boolean z13 = (i12 & 8) != 0 ? cVar.f1793e : z12;
        cVar.getClass();
        return new c(j15, j16, j17, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1790b == cVar.f1790b && this.f1791c == cVar.f1791c && this.f1792d == cVar.f1792d && this.f1793e == cVar.f1793e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1793e) + r.g(r.g(Long.hashCode(this.f1790b) * 31, 31, this.f1791c), 31, this.f1792d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceReductionState(itemId=");
        sb2.append(this.f1790b);
        sb2.append(", oldPrice=");
        sb2.append(this.f1791c);
        sb2.append(", newPrice=");
        sb2.append(this.f1792d);
        sb2.append(", loading=");
        return r.x(sb2, this.f1793e, ')');
    }
}
