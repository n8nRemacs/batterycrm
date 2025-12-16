package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/b;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C50218b implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BadgeItem f443226a;

    public C50218b(@Y61.k BadgeItem badgeItem) {
        this.f443226a = badgeItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50218b) && L.f(this.f443226a, ((C50218b) obj).f443226a);
    }

    public final int hashCode() {
        return this.f443226a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "BadgeBarItemAction(item=" + this.f443226a + ')';
    }
}
