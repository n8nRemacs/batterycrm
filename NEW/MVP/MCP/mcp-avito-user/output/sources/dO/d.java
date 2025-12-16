package dO;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.installments_block.entity.InstallmentsBlockStateData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlockState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LdO/d;", "", "a", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f393843d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f393844e = new d(null, C42784z0.f406748b, P0.c());

    /* renamed from: a, reason: collision with root package name */
    @l
    public final InstallmentsBlockStateData f393845a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<e> f393846b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, InstallmentsBlockStateData> f393847c;

    /* compiled from: InstallmentsBlockState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdO/d$a;", "", "<init>", "()V", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l InstallmentsBlockStateData installmentsBlockStateData, @k List<e> list, @k Map<String, InstallmentsBlockStateData> map) {
        this.f393845a = installmentsBlockStateData;
        this.f393846b = list;
        this.f393847c = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f393845a, dVar.f393845a) && L.f(this.f393846b, dVar.f393846b) && L.f(this.f393847c, dVar.f393847c);
    }

    public final int hashCode() {
        InstallmentsBlockStateData installmentsBlockStateData = this.f393845a;
        return this.f393847c.hashCode() + H.e((installmentsBlockStateData == null ? 0 : installmentsBlockStateData.hashCode()) * 31, 31, this.f393846b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsBlockState(stateData=");
        sb2.append(this.f393845a);
        sb2.append(", termChips=");
        sb2.append(this.f393846b);
        sb2.append(", planIdToState=");
        return r.w(sb2, this.f393847c, ')');
    }
}
