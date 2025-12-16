package KZ;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: ApplicationBorrowerItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/L;", "", "", "hasUploadedSignature", "", "applicantType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class L {

    @com.google.gson.annotations.c("applicantType")
    @Y61.l
    private final String applicantType;

    @com.google.gson.annotations.c("hasUploadedSignature")
    @Y61.l
    private final Boolean hasUploadedSignature;

    public L(@Y61.l Boolean bool, @Y61.l String str) {
        this.hasUploadedSignature = bool;
        this.applicantType = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getApplicantType() {
        return this.applicantType;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Boolean getHasUploadedSignature() {
        return this.hasUploadedSignature;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l12 = (L) obj;
        return kotlin.jvm.internal.L.f(this.hasUploadedSignature, l12.hasUploadedSignature) && kotlin.jvm.internal.L.f(this.applicantType, l12.applicantType);
    }

    public final int hashCode() {
        Boolean bool = this.hasUploadedSignature;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.applicantType;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorrowerActionContext(hasUploadedSignature=");
        sb2.append(this.hasUploadedSignature);
        sb2.append(", applicantType=");
        return C22026a.c(sb2, this.applicantType, ')');
    }
}
