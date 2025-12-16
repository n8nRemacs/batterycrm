package tx0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.models.SparePartsGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsBottomSheetState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltx0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C48737c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f439673c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C48737c f439674d = new C48737c(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<SparePartsGroup> f439675b;

    /* compiled from: SparePartsBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltx0/c$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tx0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48737c(@k List<SparePartsGroup> list) {
        this.f439675b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48737c) && L.f(this.f439675b, ((C48737c) obj).f439675b);
    }

    public final int hashCode() {
        return this.f439675b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("SparePartsBottomSheetState(groups="), this.f439675b, ')');
    }
}
