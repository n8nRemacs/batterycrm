package qL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasDiscountV2State.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LqL0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f429200e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f429201f = new c(C42784z0.f406748b, null, true);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f429202b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f429203c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f429204d;

    /* compiled from: VasDiscountV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqL0/c$a;", "", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, false, 7, null);
    }

    public static c a(c cVar, ApiException apiException, boolean z12) {
        List<com.avito.conveyor_item.a> list = cVar.f429202b;
        cVar.getClass();
        return new c(list, apiException, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f429202b, cVar.f429202b) && L.f(this.f429203c, cVar.f429203c) && this.f429204d == cVar.f429204d;
    }

    public final int hashCode() {
        int iHashCode = this.f429202b.hashCode() * 31;
        Throwable th2 = this.f429203c;
        return Boolean.hashCode(this.f429204d) + ((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasDiscountV2State(items=");
        sb2.append(this.f429202b);
        sb2.append(", error=");
        sb2.append(this.f429203c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f429204d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends com.avito.conveyor_item.a> list, @l Throwable th2, boolean z12) {
        this.f429202b = list;
        this.f429203c = th2;
        this.f429204d = z12;
    }

    public c(List list, Throwable th2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : th2, (i12 & 4) != 0 ? false : z12);
    }
}
