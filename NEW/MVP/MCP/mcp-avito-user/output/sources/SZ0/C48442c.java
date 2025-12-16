package sz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/c;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48442c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f438984a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f438985b;

    public C48442c(@k String str, @k String str2) {
        this.f438984a = str;
        this.f438985b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48442c)) {
            return false;
        }
        C48442c c48442c = (C48442c) obj;
        return L.f(this.f438984a, c48442c.f438984a) && L.f(this.f438985b, c48442c.f438985b);
    }

    public final int hashCode() {
        return this.f438985b.hashCode() + (this.f438984a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionItem(id=");
        sb2.append(this.f438984a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f438985b, ')');
    }
}
