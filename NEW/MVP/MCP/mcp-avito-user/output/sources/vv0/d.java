package Vv0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShiftListUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVv0/d;", "", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f17493a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f17494b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17495c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17496d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17497e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17498f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17499g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17500h;

    public d() {
        this(null, null, false, false, false, false, false, false, 255, null);
    }

    public static d a(d dVar, ArrayList arrayList, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12) {
        String str = dVar.f17493a;
        List<com.avito.conveyor_item.a> list = (i12 & 2) != 0 ? dVar.f17494b : arrayList;
        boolean z18 = (i12 & 4) != 0 ? dVar.f17495c : z12;
        boolean z19 = (i12 & 8) != 0 ? dVar.f17496d : z13;
        boolean z22 = (i12 & 16) != 0 ? dVar.f17497e : z14;
        boolean z23 = (i12 & 64) != 0 ? dVar.f17499g : z16;
        boolean z24 = (i12 & 128) != 0 ? dVar.f17500h : z17;
        dVar.getClass();
        return new d(str, list, z18, z19, z22, z15, z23, z24);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f17493a, dVar.f17493a) && L.f(this.f17494b, dVar.f17494b) && this.f17495c == dVar.f17495c && this.f17496d == dVar.f17496d && this.f17497e == dVar.f17497e && this.f17498f == dVar.f17498f && this.f17499g == dVar.f17499g && this.f17500h == dVar.f17500h;
    }

    public final int hashCode() {
        String str = this.f17493a;
        return Boolean.hashCode(this.f17500h) + r.i(r.i(r.i(r.i(r.i(H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f17494b), 31, this.f17495c), 31, this.f17496d), 31, this.f17497e), 31, this.f17498f), 31, this.f17499g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShiftListUiState(title=");
        sb2.append(this.f17493a);
        sb2.append(", content=");
        sb2.append(this.f17494b);
        sb2.append(", isLoading=");
        sb2.append(this.f17495c);
        sb2.append(", isContent=");
        sb2.append(this.f17496d);
        sb2.append(", isError=");
        sb2.append(this.f17497e);
        sb2.append(", isMoreLoading=");
        sb2.append(this.f17498f);
        sb2.append(", canLoadMore=");
        sb2.append(this.f17499g);
        sb2.append(", hasPastSlotsTitle=");
        return r.x(sb2, this.f17500h, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l String str, @k List<? extends com.avito.conveyor_item.a> list, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f17493a = str;
        this.f17494b = list;
        this.f17495c = z12;
        this.f17496d = z13;
        this.f17497e = z14;
        this.f17498f = z15;
        this.f17499g = z16;
        this.f17500h = z17;
    }

    public d(String str, List list, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) == 0 ? z16 : true, (i12 & 128) == 0 ? z17 : false);
    }
}
