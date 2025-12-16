package kotlin;

import java.io.Serializable;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Q;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Q<A, B> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final A f406619b;

    /* renamed from: c, reason: collision with root package name */
    public final B f406620c;

    public Q(A a12, B b12) {
        this.f406619b = a12;
        this.f406620c = b12;
    }

    public final A a() {
        return this.f406619b;
    }

    public final B b() {
        return this.f406620c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q12 = (Q) obj;
        return kotlin.jvm.internal.L.f(this.f406619b, q12.f406619b) && kotlin.jvm.internal.L.f(this.f406620c, q12.f406620c);
    }

    public final int hashCode() {
        A a12 = this.f406619b;
        int iHashCode = (a12 == null ? 0 : a12.hashCode()) * 31;
        B b12 = this.f406620c;
        return iHashCode + (b12 != null ? b12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f406619b);
        sb2.append(", ");
        return androidx.compose.foundation.H.n(sb2, this.f406620c, ')');
    }
}
