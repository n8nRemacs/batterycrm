package UX;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUX/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f16438b;

    public d(@k ArrayList arrayList) {
        this.f16438b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f16438b, ((d) obj).f16438b);
    }

    public final int hashCode() {
        return this.f16438b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("MandatoryVerificationViewState(items="), this.f16438b, ')');
    }
}
