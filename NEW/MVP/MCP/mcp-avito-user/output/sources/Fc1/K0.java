package Fc1;

import androidx.compose.runtime.C22026a;

@androidx.compose.runtime.internal.P
/* loaded from: classes9.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f5048a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f5049b;

    public K0(@Y61.k String str, @Y61.k String str2) {
        this.f5048a = str;
        this.f5049b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        return kotlin.jvm.internal.L.f(this.f5048a, k02.f5048a) && kotlin.jvm.internal.L.f(this.f5049b, k02.f5049b);
    }

    public final int hashCode() {
        return this.f5049b.hashCode() + (this.f5048a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedbackFieldRatingMessages(negative=");
        sb2.append(this.f5048a);
        sb2.append(", positive=");
        return C22026a.c(sb2, this.f5049b, ')');
    }
}
