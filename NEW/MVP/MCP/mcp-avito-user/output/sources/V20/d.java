package v20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationUiState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv20/d;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f440418a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f440419b;

    public d(@k String str, @k DeepLink deepLink) {
        this.f440418a = str;
        this.f440419b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f440418a, dVar.f440418a) && L.f(this.f440419b, dVar.f440419b);
    }

    public final int hashCode() {
        return this.f440419b.hashCode() + (this.f440418a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiAction(title=");
        sb2.append(this.f440418a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f440419b, ')');
    }
}
