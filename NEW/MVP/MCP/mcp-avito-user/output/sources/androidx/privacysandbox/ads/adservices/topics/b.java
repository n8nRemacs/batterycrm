package androidx.privacysandbox.ads.adservices.topics;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: GetTopicsResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/b;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f53590a;

    public b(@k ArrayList arrayList) {
        this.f53590a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ArrayList arrayList = this.f53590a;
        b bVar = (b) obj;
        if (arrayList.size() != bVar.f53590a.size()) {
            return false;
        }
        return new HashSet(arrayList).equals(new HashSet(bVar.f53590a));
    }

    public final int hashCode() {
        return Objects.hash(this.f53590a);
    }

    @k
    public final String toString() {
        return "Topics=" + this.f53590a;
    }
}
