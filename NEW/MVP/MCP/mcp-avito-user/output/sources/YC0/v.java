package yc0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/v;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class v implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<String> f443350a;

    public v(@Y61.k List<String> list) {
        this.f443350a = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && L.f(this.f443350a, ((v) obj).f443350a);
    }

    public final int hashCode() {
        return this.f443350a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("ReAgentEmptyInfoWidgetButtonClick(widgetsToScroll="), this.f443350a, ')');
    }
}
