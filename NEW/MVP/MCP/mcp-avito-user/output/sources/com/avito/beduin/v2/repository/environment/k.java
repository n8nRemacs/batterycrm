package com.avito.beduin.v2.repository.environment;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: Environment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/k;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f338252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338254c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338255d;

    public k(int i12, int i13, int i14, int i15) {
        this.f338252a = i12;
        this.f338253b = i13;
        this.f338254c = i14;
        this.f338255d = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f338252a == kVar.f338252a && this.f338253b == kVar.f338253b && this.f338254c == kVar.f338254c && this.f338255d == kVar.f338255d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f338255d) + r.e(this.f338254c, r.e(this.f338253b, Integer.hashCode(this.f338252a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EnvironmentIndent(start=");
        sb2.append(this.f338252a);
        sb2.append(", end=");
        sb2.append(this.f338253b);
        sb2.append(", bottom=");
        sb2.append(this.f338254c);
        sb2.append(", top=");
        return r.t(sb2, this.f338255d, ')');
    }
}
