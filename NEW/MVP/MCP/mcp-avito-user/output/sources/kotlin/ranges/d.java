package kotlin.ranges;

import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/d;", "Lkotlin/ranges/f;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class d implements f<Double> {

    /* renamed from: b, reason: collision with root package name */
    public final double f406898b;

    /* renamed from: c, reason: collision with root package name */
    public final double f406899c;

    public d(double d12, double d13) {
        this.f406898b = d12;
        this.f406899c = d13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return Double.valueOf(this.f406898b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.f406898b && dDoubleValue <= this.f406899c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f406898b != dVar.f406898b || this.f406899c != dVar.f406899c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return Double.valueOf(this.f406899c);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f406898b) * 31) + Double.hashCode(this.f406899c);
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return this.f406898b > this.f406899c;
    }

    @Y61.k
    public final String toString() {
        return this.f406898b + ".." + this.f406899c;
    }
}
