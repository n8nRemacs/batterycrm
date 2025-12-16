package fW0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LfW0/r;", "", "", "dynamicsBarCharts", "platformSpendings", "platformDynamics", "", "platformDynamicsABGroup", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getDynamicsBarCharts", "()Ljava/lang/Boolean;", "c", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r {

    @com.google.gson.annotations.c("dynamicsBarCharts")
    @Y61.l
    private final Boolean dynamicsBarCharts;

    @com.google.gson.annotations.c("platformDynamics")
    @Y61.l
    private final Boolean platformDynamics;

    @com.google.gson.annotations.c("platformDynamicsABGroup")
    @Y61.l
    private final String platformDynamicsABGroup;

    @com.google.gson.annotations.c("platformSpendings")
    @Y61.l
    private final Boolean platformSpendings;

    public r(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l String str) {
        this.dynamicsBarCharts = bool;
        this.platformSpendings = bool2;
        this.platformDynamics = bool3;
        this.platformDynamicsABGroup = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Boolean getPlatformDynamics() {
        return this.platformDynamics;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getPlatformDynamicsABGroup() {
        return this.platformDynamicsABGroup;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getPlatformSpendings() {
        return this.platformSpendings;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.dynamicsBarCharts, rVar.dynamicsBarCharts) && L.f(this.platformSpendings, rVar.platformSpendings) && L.f(this.platformDynamics, rVar.platformDynamics) && L.f(this.platformDynamicsABGroup, rVar.platformDynamicsABGroup);
    }

    public final int hashCode() {
        Boolean bool = this.dynamicsBarCharts;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.platformSpendings;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.platformDynamics;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.platformDynamicsABGroup;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Features(dynamicsBarCharts=");
        sb2.append(this.dynamicsBarCharts);
        sb2.append(", platformSpendings=");
        sb2.append(this.platformSpendings);
        sb2.append(", platformDynamics=");
        sb2.append(this.platformDynamics);
        sb2.append(", platformDynamicsABGroup=");
        return C22026a.c(sb2, this.platformDynamicsABGroup, ')');
    }
}
