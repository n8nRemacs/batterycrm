package E91;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3848c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3849d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3850e;

    public g(String str, String str2, List list, List list2, boolean z12) {
        this.f3846a = str;
        this.f3847b = str2;
        this.f3848c = list;
        this.f3849d = list2;
        this.f3850e = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3846a.equals(gVar.f3846a) && L.f(this.f3847b, gVar.f3847b) && L.f(this.f3848c, gVar.f3848c) && L.f(this.f3849d, gVar.f3849d) && this.f3850e == gVar.f3850e && L.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.f3846a.hashCode() * 31;
        String str = this.f3847b;
        return r.i(H.e(H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f3848c), 31, this.f3849d), 31, this.f3850e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingState(iconUri=");
        sb2.append(this.f3846a);
        sb2.append(", title=");
        sb2.append(this.f3847b);
        sb2.append(", recommendationShort=");
        sb2.append(this.f3848c);
        sb2.append(", recommendationFull=");
        sb2.append(this.f3849d);
        sb2.append(", isRecommendationButtonEnabled=");
        return r.s(", prefetchedBitmap=null)", sb2, this.f3850e);
    }
}
