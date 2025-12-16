package fW0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.AdvertStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LfW0/m;", "", "", "LfW0/g;", "active", "", AdvertStatus.REMOVED, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c("active")
    @Y61.k
    private final List<g> active;

    @com.google.gson.annotations.c(AdvertStatus.REMOVED)
    @Y61.l
    private final List<String> removed;

    public m(@Y61.k List<g> list, @Y61.l List<String> list2) {
        this.active = list;
        this.removed = list2;
    }

    @Y61.k
    public final List<g> a() {
        return this.active;
    }

    @Y61.l
    public final List<String> b() {
        return this.removed;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.active, mVar.active) && L.f(this.removed, mVar.removed);
    }

    public final int hashCode() {
        int iHashCode = this.active.hashCode() * 31;
        List<String> list = this.removed;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Employees(active=");
        sb2.append(this.active);
        sb2.append(", removed=");
        return H.p(sb2, this.removed, ')');
    }
}
