package Fc1;

import androidx.compose.runtime.C22026a;

/* renamed from: Fc1.w7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13765w7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final xyz.n.a.z3 f5877a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f5878b;

    public C13765w7(@Y61.k xyz.n.a.z3 z3Var, @Y61.k String str) {
        this.f5877a = z3Var;
        this.f5878b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13765w7)) {
            return false;
        }
        C13765w7 c13765w7 = (C13765w7) obj;
        return this.f5877a == c13765w7.f5877a && kotlin.jvm.internal.L.f(this.f5878b, c13765w7.f5878b);
    }

    public final int hashCode() {
        return this.f5878b.hashCode() + (this.f5877a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedbackFieldEdit(mode=");
        sb2.append(this.f5877a);
        sb2.append(", placeholder=");
        return C22026a.c(sb2, this.f5878b, ')');
    }
}
