package gm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SaleBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgm/d;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gm.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40707d {

    /* renamed from: a, reason: collision with root package name */
    public final int f396785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396786b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396787c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f396788d;

    public C40707d(int i12, int i13, @k String str, @k String str2) {
        this.f396785a = i12;
        this.f396786b = i13;
        this.f396787c = str;
        this.f396788d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40707d)) {
            return false;
        }
        C40707d c40707d = (C40707d) obj;
        return this.f396785a == c40707d.f396785a && this.f396786b == c40707d.f396786b && L.f(this.f396787c, c40707d.f396787c) && L.f(this.f396788d, c40707d.f396788d);
    }

    public final int hashCode() {
        return this.f396788d.hashCode() + H.d(r.e(this.f396786b, Integer.hashCode(this.f396785a) * 31, 31), 31, this.f396787c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Validate(min=");
        sb2.append(this.f396785a);
        sb2.append(", max=");
        sb2.append(this.f396786b);
        sb2.append(", minText=");
        sb2.append(this.f396787c);
        sb2.append(", maxText=");
        return C22026a.c(sb2, this.f396788d, ')');
    }
}
