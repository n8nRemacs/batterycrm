package kotlin.ranges;

import java.lang.Comparable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/i;", "", "T", "Lkotlin/ranges/g;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
class i<T extends Comparable<? super T>> implements g<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Date f406902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Date f406903c;

    public i(@Y61.k Date date, @Y61.k Date date2) {
        this.f406902b = date;
        this.f406903c = date2;
    }

    @Override // kotlin.ranges.g
    @Y61.k
    public final T d() {
        return this.f406902b;
    }

    @Override // kotlin.ranges.g
    public final boolean e(@Y61.k T t12) {
        return g.a.a(this, t12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof i) {
            if (g.a.b(this)) {
                i iVar = (i) obj;
                iVar.getClass();
                if (!g.a.b(iVar)) {
                }
                return true;
            }
            i iVar2 = (i) obj;
            if (L.f(this.f406902b, iVar2.f406902b) && L.f(this.f406903c, iVar2.f406903c)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.ranges.g
    @Y61.k
    public final T g() {
        return this.f406903c;
    }

    public final int hashCode() {
        if (g.a.b(this)) {
            return -1;
        }
        return (this.f406902b.hashCode() * 31) + this.f406903c.hashCode();
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return g.a.b(this);
    }

    @Y61.k
    public final String toString() {
        return this.f406902b + ".." + this.f406903c;
    }
}
