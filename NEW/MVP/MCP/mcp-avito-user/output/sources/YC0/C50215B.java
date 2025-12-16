package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.toggle.ToggleItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/B;", "Lyc0/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc0.B, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C50215B implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ToggleItem f443218a;

    public C50215B(@Y61.k ToggleItem toggleItem) {
        this.f443218a = toggleItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50215B) && L.f(this.f443218a, ((C50215B) obj).f443218a);
    }

    public final int hashCode() {
        return this.f443218a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ToggleSwitchedAction(item=" + this.f443218a + ')';
    }
}
