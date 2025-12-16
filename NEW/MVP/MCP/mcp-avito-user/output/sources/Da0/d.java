package DA0;

import DA0.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressEntryState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDA0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f3087f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final d f3088g = new d(null, false, false, a.c.f3081a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<com.avito.android.sx_address.entry.domain.a> f3089b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3090c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3091d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DA0.a f3092e;

    /* compiled from: SxAddressEntryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDA0/d$a;", "", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l List<com.avito.android.sx_address.entry.domain.a> list, boolean z12, boolean z13, @k DA0.a aVar) {
        this.f3089b = list;
        this.f3090c = z12;
        this.f3091d = z13;
        this.f3092e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, ArrayList arrayList, boolean z12, boolean z13, DA0.a aVar, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = dVar.f3089b;
        }
        if ((i12 & 2) != 0) {
            z12 = dVar.f3090c;
        }
        if ((i12 & 4) != 0) {
            z13 = dVar.f3091d;
        }
        if ((i12 & 8) != 0) {
            aVar = dVar.f3092e;
        }
        dVar.getClass();
        return new d(list, z12, z13, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3089b, dVar.f3089b) && this.f3090c == dVar.f3090c && this.f3091d == dVar.f3091d && L.f(this.f3092e, dVar.f3092e);
    }

    public final int hashCode() {
        List<com.avito.android.sx_address.entry.domain.a> list = this.f3089b;
        return this.f3092e.hashCode() + r.i(r.i((list == null ? 0 : list.hashCode()) * 31, 31, this.f3090c), 31, this.f3091d);
    }

    @k
    public final String toString() {
        return "SxAddressEntryState(data=" + this.f3089b + ", isLoading=" + this.f3090c + ", isError=" + this.f3091d + ", viewState=" + this.f3092e + ')';
    }
}
