package E60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaymentListUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE60/d;", "", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f3783a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3784b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3785c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3786d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3787e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3788f;

    public d() {
        this(null, false, false, false, false, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, ArrayList arrayList, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = dVar.f3783a;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            z12 = dVar.f3784b;
        }
        boolean z17 = z12;
        if ((i12 & 4) != 0) {
            z13 = dVar.f3785c;
        }
        boolean z18 = z13;
        if ((i12 & 8) != 0) {
            z14 = dVar.f3786d;
        }
        boolean z19 = z14;
        if ((i12 & 16) != 0) {
            z15 = dVar.f3787e;
        }
        boolean z22 = z15;
        if ((i12 & 32) != 0) {
            z16 = dVar.f3788f;
        }
        dVar.getClass();
        return new d(list2, z17, z18, z19, z22, z16);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3783a, dVar.f3783a) && this.f3784b == dVar.f3784b && this.f3785c == dVar.f3785c && this.f3786d == dVar.f3786d && this.f3787e == dVar.f3787e && this.f3788f == dVar.f3788f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3788f) + r.i(r.i(r.i(r.i(this.f3783a.hashCode() * 31, 31, this.f3784b), 31, this.f3785c), 31, this.f3786d), 31, this.f3787e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentListUiState(content=");
        sb2.append(this.f3783a);
        sb2.append(", isLoading=");
        sb2.append(this.f3784b);
        sb2.append(", isContent=");
        sb2.append(this.f3785c);
        sb2.append(", isError=");
        sb2.append(this.f3786d);
        sb2.append(", isMoreLoading=");
        sb2.append(this.f3787e);
        sb2.append(", canLoadMore=");
        return r.x(sb2, this.f3788f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f3783a = list;
        this.f3784b = z12;
        this.f3785c = z13;
        this.f3786d = z14;
        this.f3787e = z15;
        this.f3788f = z16;
    }

    public d(List list, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) == 0 ? z15 : false, (i12 & 32) == 0 ? z16 : true);
    }
}
