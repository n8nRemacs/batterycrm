package O10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCategoryAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO10/a;", "", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f11897a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f11898b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11899c;

    public a(@k String str, @l DeepLink deepLink, boolean z12) {
        this.f11897a = str;
        this.f11898b = deepLink;
        this.f11899c = z12;
    }

    public static a a(a aVar, boolean z12) {
        String str = aVar.f11897a;
        DeepLink deepLink = aVar.f11898b;
        aVar.getClass();
        return new a(str, deepLink, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f11897a, aVar.f11897a) && L.f(this.f11898b, aVar.f11898b) && this.f11899c == aVar.f11899c;
    }

    public final int hashCode() {
        int iHashCode = this.f11897a.hashCode() * 31;
        DeepLink deepLink = this.f11898b;
        return Boolean.hashCode(this.f11899c) + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageCategoryAction(title=");
        sb2.append(this.f11897a);
        sb2.append(", link=");
        sb2.append(this.f11898b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f11899c, ')');
    }

    public /* synthetic */ a(String str, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? false : z12);
    }
}
