package fN;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvGoodsPollState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LfN/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f395862d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f395863e = new c(C42784z0.f406748b, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f395864b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f395865c;

    /* compiled from: ImvGoodsPollState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfN/c$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends com.avito.conveyor_item.a> list, boolean z12) {
        this.f395864b = list;
        this.f395865c = z12;
    }

    public static c a(c cVar, List list, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f395864b;
        }
        if ((i12 & 2) != 0) {
            z12 = cVar.f395865c;
        }
        cVar.getClass();
        return new c(list, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f395864b, cVar.f395864b) && this.f395865c == cVar.f395865c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f395865c) + (this.f395864b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvGoodsPollState(items=");
        sb2.append(this.f395864b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f395865c, ')');
    }
}
