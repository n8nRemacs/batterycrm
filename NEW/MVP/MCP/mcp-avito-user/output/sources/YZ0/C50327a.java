package yz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.StrSellerOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C50327a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443624a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f443625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443626c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f443627d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f443628e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<StrSellerOrder> f443629f;

    public C50327a(@k String str, @k String str2, int i12, boolean z12, @l Integer num, @k List<StrSellerOrder> list) {
        this.f443624a = str;
        this.f443625b = str2;
        this.f443626c = i12;
        this.f443627d = z12;
        this.f443628e = num;
        this.f443629f = list;
    }

    public static C50327a a(C50327a c50327a, int i12, boolean z12, List list, int i13) {
        String str = c50327a.f443625b;
        if ((i13 & 4) != 0) {
            i12 = c50327a.f443626c;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            z12 = c50327a.f443627d;
        }
        return new C50327a(c50327a.f443624a, str, i14, z12, c50327a.f443628e, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50327a)) {
            return false;
        }
        C50327a c50327a = (C50327a) obj;
        return L.f(this.f443624a, c50327a.f443624a) && L.f(this.f443625b, c50327a.f443625b) && this.f443626c == c50327a.f443626c && this.f443627d == c50327a.f443627d && L.f(this.f443628e, c50327a.f443628e) && L.f(this.f443629f, c50327a.f443629f);
    }

    public final int hashCode() {
        int i12 = r.i(r.e(this.f443626c, H.d(this.f443624a.hashCode() * 31, 31, this.f443625b), 31), 31, this.f443627d);
        Integer num = this.f443628e;
        return this.f443629f.hashCode() + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionInfo(id=");
        sb2.append(this.f443624a);
        sb2.append(", title=");
        sb2.append(this.f443625b);
        sb2.append(", pageNumber=");
        sb2.append(this.f443626c);
        sb2.append(", hasMore=");
        sb2.append(this.f443627d);
        sb2.append(", count=");
        sb2.append(this.f443628e);
        sb2.append(", loadedOrders=");
        return H.p(sb2, this.f443629f, ')');
    }
}
