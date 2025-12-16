package T10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientForms.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT10/a;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15273a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15274b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15275c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f15276d;

    public a(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f15273a = str;
        this.f15274b = str2;
        this.f15275c = str3;
        this.f15276d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f15273a, aVar.f15273a) && L.f(this.f15274b, aVar.f15274b) && L.f(this.f15275c, aVar.f15275c) && L.f(this.f15276d, aVar.f15276d);
    }

    public final int hashCode() {
        return this.f15276d.hashCode() + H.d(H.d(this.f15273a.hashCode() * 31, 31, this.f15274b), 31, this.f15275c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionBanner(title=");
        sb2.append(this.f15273a);
        sb2.append(", description=");
        sb2.append(this.f15274b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f15275c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f15276d, ')');
    }
}
