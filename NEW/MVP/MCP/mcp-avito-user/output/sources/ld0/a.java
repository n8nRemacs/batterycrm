package LD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLD0/a;", "", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f9876a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9877b;

    public a(@l String str, @k String str2) {
        this.f9876a = str;
        this.f9877b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9876a, aVar.f9876a) && L.f(this.f9877b, aVar.f9877b);
    }

    public final int hashCode() {
        String str = this.f9876a;
        return this.f9877b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceInfo(oldPrice=");
        sb2.append(this.f9876a);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f9877b, ')');
    }
}
