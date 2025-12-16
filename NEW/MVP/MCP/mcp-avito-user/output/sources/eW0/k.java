package eW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserStatsScreenData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LeW0/k;", "", "", "title", "LeW0/j;", "groupType", "", "LeW0/l;", "tabs", "<init>", "(Ljava/lang/String;LeW0/j;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "LeW0/j;", "getGroupType", "()LeW0/j;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c("group_type")
    @Y61.l
    private final j groupType;

    @com.google.gson.annotations.c("tabs")
    @Y61.k
    private final List<l> tabs;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public k(@Y61.k String str, @Y61.l j jVar, @Y61.k List<l> list) {
        this.title = str;
        this.groupType = jVar;
        this.tabs = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.title, kVar.title) && L.f(this.groupType, kVar.groupType) && L.f(this.tabs, kVar.tabs);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        j jVar = this.groupType;
        return this.tabs.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserStatsScreenData(title=");
        sb2.append(this.title);
        sb2.append(", groupType=");
        sb2.append(this.groupType);
        sb2.append(", tabs=");
        return H.p(sb2, this.tabs, ')');
    }
}
