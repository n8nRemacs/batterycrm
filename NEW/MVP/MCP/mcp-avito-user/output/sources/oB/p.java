package oB;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/p;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class p implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f419524b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f419525c;

    public p(@Y61.k DeepLink deepLink, @Y61.l String str) {
        this.f419524b = deepLink;
        this.f419525c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f419524b, pVar.f419524b) && L.f(this.f419525c, pVar.f419525c);
    }

    public final int hashCode() {
        int iHashCode = this.f419524b.hashCode() * 31;
        String str = this.f419525c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCarouselContactsClickAction(deeplink=");
        sb2.append(this.f419524b);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f419525c, ')');
    }
}
