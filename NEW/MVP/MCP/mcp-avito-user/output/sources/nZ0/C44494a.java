package nz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaginationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnz0/a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C44494a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f419252b;

    public C44494a(@k String str, int i12) {
        this.f419251a = str;
        this.f419252b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44494a)) {
            return false;
        }
        C44494a c44494a = (C44494a) obj;
        return L.f(this.f419251a, c44494a.f419251a) && this.f419252b == c44494a.f419252b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419252b) + (this.f419251a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaginationInfo(sectionName=");
        sb2.append(this.f419251a);
        sb2.append(", nextPage=");
        return r.t(sb2, this.f419252b, ')');
    }
}
