package PE0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileHeaderBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/f;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12894a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f12895b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f12896c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f12897d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f12898e;

    public f(@k String str, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalImage universalImage, @k DeepLink deepLink) {
        this.f12894a = str;
        this.f12895b = universalColor;
        this.f12896c = universalColor2;
        this.f12897d = universalImage;
        this.f12898e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f12894a, fVar.f12894a) && L.f(this.f12895b, fVar.f12895b) && L.f(this.f12896c, fVar.f12896c) && L.f(this.f12897d, fVar.f12897d) && L.f(this.f12898e, fVar.f12898e);
    }

    public final int hashCode() {
        int iHashCode = this.f12894a.hashCode() * 31;
        UniversalColor universalColor = this.f12895b;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.f12896c;
        int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalImage universalImage = this.f12897d;
        return this.f12898e.hashCode() + ((iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileHeaderBadge(title=");
        sb2.append(this.f12894a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f12895b);
        sb2.append(", fontColor=");
        sb2.append(this.f12896c);
        sb2.append(", icon=");
        sb2.append(this.f12897d);
        sb2.append(", action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f12898e, ')');
    }
}
