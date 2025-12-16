package Wo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbcDispatchEditState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LWo0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f18059f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final d f18060g = new d(C42784z0.f406748b, false, true, false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18061b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18062c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18063d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<C15785a> f18064e;

    /* compiled from: SbcDispatchEditState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWo0/d$a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k List list, boolean z12, boolean z13, boolean z14) {
        this.f18061b = z12;
        this.f18062c = z13;
        this.f18063d = z14;
        this.f18064e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, boolean z12, boolean z13, boolean z14, ArrayList arrayList, int i12) {
        if ((i12 & 1) != 0) {
            z12 = dVar.f18061b;
        }
        if ((i12 & 2) != 0) {
            z13 = dVar.f18062c;
        }
        if ((i12 & 4) != 0) {
            z14 = dVar.f18063d;
        }
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = dVar.f18064e;
        }
        dVar.getClass();
        return new d(list, z12, z13, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18061b == dVar.f18061b && this.f18062c == dVar.f18062c && this.f18063d == dVar.f18063d && L.f(this.f18064e, dVar.f18064e);
    }

    public final int hashCode() {
        return this.f18064e.hashCode() + r.i(r.i(Boolean.hashCode(this.f18061b) * 31, 31, this.f18062c), 31, this.f18063d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbcDispatchEditState(isCheckedAll=");
        sb2.append(this.f18061b);
        sb2.append(", noItemsSelectedButtonDisabled=");
        sb2.append(this.f18062c);
        sb2.append(", isRemovingInProgress=");
        sb2.append(this.f18063d);
        sb2.append(", items=");
        return H.p(sb2, this.f18064e, ')');
    }
}
