package W50;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.VerificationDisclaimer;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationPopupState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final VerificationDisclaimer f17746b;

    public c(@k VerificationDisclaimer verificationDisclaimer) {
        this.f17746b = verificationDisclaimer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f17746b, ((c) obj).f17746b);
    }

    public final int hashCode() {
        return this.f17746b.hashCode();
    }

    @k
    public final String toString() {
        return "VerificationPopupState(content=" + this.f17746b + ')';
    }
}
