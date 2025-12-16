package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/y;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class y implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectItem f443354a;

    public y(@Y61.k SelectItem selectItem) {
        this.f443354a = selectItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && L.f(this.f443354a, ((y) obj).f443354a);
    }

    public final int hashCode() {
        return this.f443354a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "SelectWidgetClick(item=" + this.f443354a + ')';
    }
}
