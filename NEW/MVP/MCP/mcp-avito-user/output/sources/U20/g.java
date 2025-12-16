package U20;

import Y61.k;
import Y61.l;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.Metadata;

/* compiled from: StartConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU20/g;", "", "_avito_navigation-config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BottomNavigationSpace f16134a;

    public g(@k BottomNavigationSpace bottomNavigationSpace) {
        this.f16134a = bottomNavigationSpace;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f16134a == ((g) obj).f16134a;
    }

    public final int hashCode() {
        return this.f16134a.hashCode();
    }

    @k
    public final String toString() {
        return "StartConfig(space=" + this.f16134a + ')';
    }
}
