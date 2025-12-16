package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.setting.SettingItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/A;", "Lyc0/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc0.A, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C50214A implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SettingItem f443217a;

    public C50214A(@Y61.k SettingItem settingItem) {
        this.f443217a = settingItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50214A) && L.f(this.f443217a, ((C50214A) obj).f443217a);
    }

    public final int hashCode() {
        return this.f443217a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ShowMoreActionsSettingItemAction(item=" + this.f443217a + ')';
    }
}
