package PE0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedPlanBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/e;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12891a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12892b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f12893c;

    public e(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f12891a = str;
        this.f12892b = str2;
        this.f12893c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f12891a, eVar.f12891a) && L.f(this.f12892b, eVar.f12892b) && L.f(this.f12893c, eVar.f12893c);
    }

    public final int hashCode() {
        return this.f12893c.hashCode() + H.d(this.f12891a.hashCode() * 31, 31, this.f12892b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedPlanButton(title=");
        sb2.append(this.f12891a);
        sb2.append(", subtitle=");
        sb2.append(this.f12892b);
        sb2.append(", action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f12893c, ')');
    }
}
