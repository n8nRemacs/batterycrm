package NH;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigTutorial.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNH/a;", "", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f11355a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f11356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11357c;

    public a(@InterfaceC42165v int i12, @k DeepLink deepLink, @k String str) {
        this.f11355a = str;
        this.f11356b = deepLink;
        this.f11357c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f11355a, aVar.f11355a) && L.f(this.f11356b, aVar.f11356b) && this.f11357c == aVar.f11357c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11357c) + com.avito.android.actions_sheet.a.e(this.f11356b, this.f11355a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigTutorial(text=");
        sb2.append(this.f11355a);
        sb2.append(", deepLink=");
        sb2.append(this.f11356b);
        sb2.append(", iconRes=");
        return r.t(sb2, this.f11357c, ')');
    }
}
