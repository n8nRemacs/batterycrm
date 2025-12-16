package JZ;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateApplicantResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJZ/f;", "", "", "applicantId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getApplicantId", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("applicantId")
    @Y61.k
    private final String applicantId;

    public f(@Y61.k String str) {
        this.applicantId = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.applicantId, ((f) obj).applicantId);
    }

    public final int hashCode() {
        return this.applicantId.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("CreateApplicantResponse(applicantId="), this.applicantId, ')');
    }
}
