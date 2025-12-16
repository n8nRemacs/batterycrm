package oB;

import com.avito.android.remote.model.ExtendedProfileGeo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/v;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class v implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileGeo f419534b;

    public v(@Y61.k ExtendedProfileGeo extendedProfileGeo) {
        this.f419534b = extendedProfileGeo;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && L.f(this.f419534b, ((v) obj).f419534b);
    }

    public final int hashCode() {
        return this.f419534b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "MapItemAction(geo=" + this.f419534b + ')';
    }
}
