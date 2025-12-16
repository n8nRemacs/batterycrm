package lj0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MobileNetworkOperator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj0/a;", "", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C43781a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f414169a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414170b;

    public C43781a(@k String str, @k String str2) {
        this.f414169a = str;
        this.f414170b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43781a)) {
            return false;
        }
        C43781a c43781a = (C43781a) obj;
        return L.f(this.f414169a, c43781a.f414169a) && L.f(this.f414170b, c43781a.f414170b);
    }

    public final int hashCode() {
        return this.f414170b.hashCode() + (this.f414169a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MobileNetworkOperator(name=");
        sb2.append(this.f414169a);
        sb2.append(", numericName=");
        return C22026a.c(sb2, this.f414170b, ')');
    }
}
