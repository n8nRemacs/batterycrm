package kotlin.ranges;

import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/e;", "Lkotlin/ranges/f;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class e implements f<Float> {

    /* renamed from: b, reason: collision with root package name */
    public final float f406900b;

    /* renamed from: c, reason: collision with root package name */
    public final float f406901c;

    public e(float f12, float f13) {
        this.f406900b = f12;
        this.f406901c = f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return Float.valueOf(this.f406900b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f406900b && fFloatValue <= this.f406901c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f406900b != eVar.f406900b || this.f406901c != eVar.f406901c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return Float.valueOf(this.f406901c);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f406900b) * 31) + Float.hashCode(this.f406901c);
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return this.f406900b > this.f406901c;
    }

    @Y61.k
    public final String toString() {
        return this.f406900b + ".." + this.f406901c;
    }
}
