package oB;

import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/C;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class C implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TabsWithWidgetsItem f419497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419498c;

    public C(@Y61.k TabsWithWidgetsItem tabsWithWidgetsItem, int i12) {
        this.f419497b = tabsWithWidgetsItem;
        this.f419498c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return L.f(this.f419497b, c12.f419497b) && this.f419498c == c12.f419498c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419498c) + (this.f419497b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabsWithWidgetsClickAction(item=");
        sb2.append(this.f419497b);
        sb2.append(", selectedIndex=");
        return androidx.appcompat.app.r.t(sb2, this.f419498c, ')');
    }
}
