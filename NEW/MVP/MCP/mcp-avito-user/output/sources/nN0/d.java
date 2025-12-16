package NN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.virtual_deal_room_client_creation.clients.model.PagingState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNN0/d;", "", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PagingState f11411a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<PN0.a> f11412b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f11413c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11414d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11415e;

    public d() {
        this(null, null, null, false, false, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11411a == dVar.f11411a && L.f(this.f11412b, dVar.f11412b) && L.f(this.f11413c, dVar.f11413c) && this.f11414d == dVar.f11414d && this.f11415e == dVar.f11415e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11415e) + r.i(H.d(H.e(this.f11411a.hashCode() * 31, 31, this.f11412b), 31, this.f11413c), 31, this.f11414d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientsViewState(pagingState=");
        sb2.append(this.f11411a);
        sb2.append(", items=");
        sb2.append(this.f11412b);
        sb2.append(", search=");
        sb2.append(this.f11413c);
        sb2.append(", canLoadNext=");
        sb2.append(this.f11414d);
        sb2.append(", showAddItem=");
        return r.x(sb2, this.f11415e, ')');
    }

    public d(@k PagingState pagingState, @k List<PN0.a> list, @k String str, boolean z12, boolean z13) {
        this.f11411a = pagingState;
        this.f11412b = list;
        this.f11413c = str;
        this.f11414d = z12;
        this.f11415e = z13;
    }

    public d(PagingState pagingState, List list, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? PagingState.f326629c : pagingState, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13);
    }
}
