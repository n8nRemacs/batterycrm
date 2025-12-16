package Lo0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchNotificationFrequency.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLo0/b;", "", "_avito_saved-searches-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14424b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final List<String> f10123a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<String> f10124b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f10125c;

    public C14424b(@l List<String> list, @l List<String> list2, @l List<String> list3) {
        this.f10123a = list;
        this.f10124b = list2;
        this.f10125c = list3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14424b)) {
            return false;
        }
        C14424b c14424b = (C14424b) obj;
        return L.f(this.f10123a, c14424b.f10123a) && L.f(this.f10124b, c14424b.f10124b) && L.f(this.f10125c, c14424b.f10125c);
    }

    public final int hashCode() {
        List<String> list = this.f10123a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f10124b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f10125c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchNotificationFrequency(dayOfWeek=");
        sb2.append(this.f10123a);
        sb2.append(", periodicity=");
        sb2.append(this.f10124b);
        sb2.append(", timeOfDay=");
        return H.p(sb2, this.f10125c, ')');
    }
}
