package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/p;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class p implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f443326a;

    public p(@Y61.k DeepLink deepLink) {
        this.f443326a = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && L.f(this.f443326a, ((p) obj).f443326a);
    }

    public final int hashCode() {
        return this.f443326a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("GeoV2ActionClick(deeplink="), this.f443326a, ')');
    }
}
