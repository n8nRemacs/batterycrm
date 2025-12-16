package Ki;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InnerBeduinScreenState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKi/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D f9632b;

    public b(@k D d12) {
        this.f9632b = d12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f9632b, ((b) obj).f9632b);
    }

    public final int hashCode() {
        return this.f9632b.hashCode();
    }

    @k
    public final String toString() {
        return "InnerBeduinScreenState(rendererState=" + this.f9632b + ')';
    }
}
