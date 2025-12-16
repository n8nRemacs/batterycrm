package kp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/c;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43477c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f413193a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f413194b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413195c;

    public C43477c(@k String str, boolean z12, boolean z13) {
        this.f413193a = str;
        this.f413194b = z12;
        this.f413195c = z13;
    }

    public static C43477c a(C43477c c43477c, String str, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            str = c43477c.f413193a;
        }
        if ((i12 & 2) != 0) {
            z12 = c43477c.f413194b;
        }
        if ((i12 & 4) != 0) {
            z13 = c43477c.f413195c;
        }
        c43477c.getClass();
        return new C43477c(str, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43477c)) {
            return false;
        }
        C43477c c43477c = (C43477c) obj;
        return L.f(this.f413193a, c43477c.f413193a) && this.f413194b == c43477c.f413194b && this.f413195c == c43477c.f413195c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f413195c) + r.i(this.f413193a.hashCode() * 31, 31, this.f413194b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientsFilterState(query=");
        sb2.append(this.f413193a);
        sb2.append(", isArchived=");
        sb2.append(this.f413194b);
        sb2.append(", isFilterShowed=");
        return r.x(sb2, this.f413195c, ')');
    }
}
