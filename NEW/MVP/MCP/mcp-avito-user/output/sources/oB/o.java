package oB;

import android.os.Bundle;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/o;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class o implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f419522b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Bundle f419523c;

    public o(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        this.f419522b = deepLink;
        this.f419523c = bundle;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f419522b, oVar.f419522b) && L.f(this.f419523c, oVar.f419523c);
    }

    public final int hashCode() {
        int iHashCode = this.f419522b.hashCode() * 31;
        Bundle bundle = this.f419523c;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemDeeplinkAction(deepLink=");
        sb2.append(this.f419522b);
        sb2.append(", args=");
        return H.m(sb2, this.f419523c, ')');
    }

    public /* synthetic */ o(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
        this(deepLink, (i12 & 2) != 0 ? null : bundle);
    }
}
