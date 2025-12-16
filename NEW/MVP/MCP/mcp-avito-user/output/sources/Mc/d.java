package mC;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FakeDoorDialogState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmC/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d extends q {

    /* renamed from: b, reason: collision with root package name */
    public final int f414396b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<FakeDoorDialogLink.Stage> f414397c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FakeDoorDialogLink.Stage f414398d;

    public d(int i12, @k List<FakeDoorDialogLink.Stage> list) {
        this.f414396b = i12;
        this.f414397c = list;
        this.f414398d = list.get(i12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f414396b == dVar.f414396b && L.f(this.f414397c, dVar.f414397c);
    }

    public final int hashCode() {
        return this.f414397c.hashCode() + (Integer.hashCode(this.f414396b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FakeDoorDialogState(currentPage=");
        sb2.append(this.f414396b);
        sb2.append(", stages=");
        return H.p(sb2, this.f414397c, ')');
    }
}
