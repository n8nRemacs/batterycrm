package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/y;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428479a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428480b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f428481c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f428482d;

    public y(@Y61.k DeepLink deepLink, @Y61.k UniversalImage universalImage, @Y61.k String str, @Y61.k String str2) {
        this.f428479a = str;
        this.f428480b = str2;
        this.f428481c = universalImage;
        this.f428482d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f428479a, yVar.f428479a) && L.f(this.f428480b, yVar.f428480b) && L.f(this.f428481c, yVar.f428481c) && L.f(this.f428482d, yVar.f428482d);
    }

    public final int hashCode() {
        return this.f428482d.hashCode() + com.avito.android.actions_sheet.a.a(H.d(this.f428479a.hashCode() * 31, 31, this.f428480b), 31, this.f428481c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotTutorialsBanner(title=");
        sb2.append(this.f428479a);
        sb2.append(", description=");
        sb2.append(this.f428480b);
        sb2.append(", image=");
        sb2.append(this.f428481c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428482d, ')');
    }
}
