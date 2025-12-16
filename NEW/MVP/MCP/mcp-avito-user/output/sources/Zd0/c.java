package ZD0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uZ.e;

/* compiled from: TariffSelectState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZD0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f19993f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f19994g = new c(null, C42784z0.f406748b, null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final e f19995b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f19996c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ApiException f19997d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19998e;

    /* compiled from: TariffSelectState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZD0/c$a;", "", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l e eVar, @k List list, @l ApiException apiException, boolean z12) {
        this.f19995b = eVar;
        this.f19996c = list;
        this.f19997d = apiException;
        this.f19998e = z12;
    }

    public static c a(c cVar, ApiException apiException, boolean z12) {
        e eVar = cVar.f19995b;
        List<com.avito.conveyor_item.a> list = cVar.f19996c;
        cVar.getClass();
        return new c(eVar, list, apiException, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f19995b, cVar.f19995b) && L.f(this.f19996c, cVar.f19996c) && L.f(this.f19997d, cVar.f19997d) && this.f19998e == cVar.f19998e;
    }

    public final int hashCode() {
        e eVar = this.f19995b;
        int iE2 = H.e((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f19996c);
        ApiException apiException = this.f19997d;
        return Boolean.hashCode(this.f19998e) + ((iE2 + (apiException != null ? apiException.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffSelectState(navBar=");
        sb2.append(this.f19995b);
        sb2.append(", items=");
        sb2.append(this.f19996c);
        sb2.append(", error=");
        sb2.append(this.f19997d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f19998e, ')');
    }
}
