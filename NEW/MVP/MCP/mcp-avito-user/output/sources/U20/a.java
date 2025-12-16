package U20;

import Y61.k;
import Y61.l;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.Metadata;

/* compiled from: NavigationConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU20/a;", "", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final BottomNavigationSpace f16133a;

    public a(@l BottomNavigationSpace bottomNavigationSpace) {
        this.f16133a = bottomNavigationSpace;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f16133a == ((a) obj).f16133a;
    }

    public final int hashCode() {
        BottomNavigationSpace bottomNavigationSpace = this.f16133a;
        if (bottomNavigationSpace == null) {
            return 0;
        }
        return bottomNavigationSpace.hashCode();
    }

    @k
    public final String toString() {
        return "NavigationConfig(startSpace=" + this.f16133a + ')';
    }
}
