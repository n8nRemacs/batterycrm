package dX;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceMeta.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LdX/q;", "", "", "segment", "serviceQualityGrade", "reputationId", "reputationStateId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "a", "b", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class q {

    @com.google.gson.annotations.c("reputationId")
    @Y61.l
    private final String reputationId;

    @com.google.gson.annotations.c("reputationStateId")
    @Y61.l
    private final String reputationStateId;

    @com.google.gson.annotations.c("segment")
    @Y61.l
    private final String segment;

    @com.google.gson.annotations.c("serviceQualityGrade")
    @Y61.l
    private final String serviceQualityGrade;

    public q(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.segment = str;
        this.serviceQualityGrade = str2;
        this.reputationId = str3;
        this.reputationStateId = str4;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getReputationId() {
        return this.reputationId;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getReputationStateId() {
        return this.reputationStateId;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getSegment() {
        return this.segment;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getServiceQualityGrade() {
        return this.serviceQualityGrade;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.segment, qVar.segment) && L.f(this.serviceQualityGrade, qVar.serviceQualityGrade) && L.f(this.reputationId, qVar.reputationId) && L.f(this.reputationStateId, qVar.reputationStateId);
    }

    public final int hashCode() {
        String str = this.segment;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serviceQualityGrade;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reputationId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reputationStateId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityServiceMeta(segment=");
        sb2.append(this.segment);
        sb2.append(", serviceQualityGrade=");
        sb2.append(this.serviceQualityGrade);
        sb2.append(", reputationId=");
        sb2.append(this.reputationId);
        sb2.append(", reputationStateId=");
        return C22026a.c(sb2, this.reputationStateId, ')');
    }
}
