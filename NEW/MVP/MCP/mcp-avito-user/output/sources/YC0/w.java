package yc0;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/w;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class w implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f443351a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f443352b;

    public w(@Y61.k DeepLink deepLink, @Y61.l String str) {
        this.f443351a = deepLink;
        this.f443352b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return L.f(this.f443351a, wVar.f443351a) && L.f(this.f443352b, wVar.f443352b);
    }

    public final int hashCode() {
        int iHashCode = this.f443351a.hashCode() * 31;
        String str = this.f443352b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReAgentEmptyInfoWidgetLinkClick(deeplink=");
        sb2.append(this.f443351a);
        sb2.append(", widgetsToScroll=");
        return C22026a.c(sb2, this.f443352b, ')');
    }
}
