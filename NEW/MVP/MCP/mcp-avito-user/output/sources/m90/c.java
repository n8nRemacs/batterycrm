package M90;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveItemsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LM90/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f10426d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f10427e = new c(null, null, 3, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f10428b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<L90.a> f10429c;

    /* compiled from: ProfileRemoveItemsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM90/c$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f10428b, cVar.f10428b) && L.f(this.f10429c, cVar.f10429c);
    }

    public final int hashCode() {
        return this.f10429c.hashCode() + (this.f10428b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileRemoveItemsState(items=");
        sb2.append(this.f10428b);
        sb2.append(", buttons=");
        return H.p(sb2, this.f10429c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends com.avito.conveyor_item.a> list, @k List<L90.a> list2) {
        this.f10428b = list;
        this.f10429c = list2;
    }

    public c(List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2);
    }
}
