package un;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemQuantityChange.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lun/a;", "", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: un.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49079a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f440278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f440280c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440281d;

    public C49079a(@k String str, int i12, int i13, int i14) {
        this.f440278a = str;
        this.f440279b = i12;
        this.f440280c = i13;
        this.f440281d = i14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49079a)) {
            return false;
        }
        C49079a c49079a = (C49079a) obj;
        return L.f(this.f440278a, c49079a.f440278a) && this.f440279b == c49079a.f440279b && this.f440280c == c49079a.f440280c && this.f440281d == c49079a.f440281d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f440281d) + r.e(this.f440280c, r.e(this.f440279b, this.f440278a.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemQuantityChange(itemId=");
        sb2.append(this.f440278a);
        sb2.append(", oldQuantity=");
        sb2.append(this.f440279b);
        sb2.append(", newQuantity=");
        sb2.append(this.f440280c);
        sb2.append(", maxQuantity=");
        return r.t(sb2, this.f440281d, ')');
    }
}
