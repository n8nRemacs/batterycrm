package X3;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaCpoProgramState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LX3/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f18572c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CpoDescription f18573b;

    /* compiled from: AutotekaCpoProgramState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX3/d$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k CpoDescription cpoDescription) {
        this.f18573b = cpoDescription;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f18573b, ((d) obj).f18573b);
    }

    public final int hashCode() {
        return this.f18573b.hashCode();
    }

    @k
    public final String toString() {
        return "AutotekaCpoProgramState(data=" + this.f18573b + ')';
    }
}
