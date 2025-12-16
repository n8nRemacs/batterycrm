package JZ;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnalyticsMeta.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LJZ/a;", "", "", "currentMortgageStage", "currentApplicantType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("currentApplicantType")
    @Y61.l
    private final String currentApplicantType;

    @com.google.gson.annotations.c("currentMortgageStage")
    @Y61.k
    private final String currentMortgageStage;

    public a(@Y61.k String str, @Y61.l String str2) {
        this.currentMortgageStage = str;
        this.currentApplicantType = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getCurrentApplicantType() {
        return this.currentApplicantType;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getCurrentMortgageStage() {
        return this.currentMortgageStage;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.currentMortgageStage, aVar.currentMortgageStage) && L.f(this.currentApplicantType, aVar.currentApplicantType);
    }

    public final int hashCode() {
        int iHashCode = this.currentMortgageStage.hashCode() * 31;
        String str = this.currentApplicantType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsMeta(currentMortgageStage=");
        sb2.append(this.currentMortgageStage);
        sb2.append(", currentApplicantType=");
        return C22026a.c(sb2, this.currentApplicantType, ')');
    }
}
