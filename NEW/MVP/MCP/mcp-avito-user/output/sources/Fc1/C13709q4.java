package Fc1;

import androidx.compose.runtime.C22026a;

/* renamed from: Fc1.q4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13709q4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f5767a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f5768b;

    /* JADX WARN: Multi-variable type inference failed */
    public C13709q4(@Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.l<? super String, kotlin.G0> lVar) {
        this.f5767a = (kotlin.jvm.internal.N) aVar;
        this.f5768b = (kotlin.jvm.internal.N) lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13709q4)) {
            return false;
        }
        C13709q4 c13709q4 = (C13709q4) obj;
        return kotlin.jvm.internal.L.f(this.f5767a, c13709q4.f5767a) && kotlin.jvm.internal.L.f(this.f5768b, c13709q4.f5768b);
    }

    public final int hashCode() {
        return this.f5768b.hashCode() + (this.f5767a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoreDialogsCallbacks(closeClick=");
        sb2.append(this.f5767a);
        sb2.append(", urlClick=");
        return C22026a.d(sb2, this.f5768b, ')');
    }
}
