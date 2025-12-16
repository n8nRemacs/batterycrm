package Fc1;

import androidx.compose.runtime.C22026a;

/* loaded from: classes9.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f5335b;

    public Y0(@Y61.k String str, boolean z12) {
        this.f5334a = z12;
        this.f5335b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        return this.f5334a == y02.f5334a && kotlin.jvm.internal.L.f(this.f5335b, y02.f5335b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z12 = this.f5334a;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        return this.f5335b.hashCode() + (r02 * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedbackFieldRequired(isRequired=");
        sb2.append(this.f5334a);
        sb2.append(", warning=");
        return C22026a.c(sb2, this.f5335b, ')');
    }
}
