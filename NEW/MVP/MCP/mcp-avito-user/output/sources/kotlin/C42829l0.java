package kotlin;

import java.io.Serializable;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/l0;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C42829l0<A, B, C> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final A f406871b;

    /* renamed from: c, reason: collision with root package name */
    public final B f406872c;

    /* renamed from: d, reason: collision with root package name */
    public final C f406873d;

    public C42829l0(A a12, B b12, C c12) {
        this.f406871b = a12;
        this.f406872c = b12;
        this.f406873d = c12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42829l0)) {
            return false;
        }
        C42829l0 c42829l0 = (C42829l0) obj;
        return kotlin.jvm.internal.L.f(this.f406871b, c42829l0.f406871b) && kotlin.jvm.internal.L.f(this.f406872c, c42829l0.f406872c) && kotlin.jvm.internal.L.f(this.f406873d, c42829l0.f406873d);
    }

    public final int hashCode() {
        A a12 = this.f406871b;
        int iHashCode = (a12 == null ? 0 : a12.hashCode()) * 31;
        B b12 = this.f406872c;
        int iHashCode2 = (iHashCode + (b12 == null ? 0 : b12.hashCode())) * 31;
        C c12 = this.f406873d;
        return iHashCode2 + (c12 != null ? c12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f406871b);
        sb2.append(", ");
        sb2.append(this.f406872c);
        sb2.append(", ");
        return androidx.compose.foundation.H.n(sb2, this.f406873d, ')');
    }
}
