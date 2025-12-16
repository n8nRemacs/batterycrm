package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiIdentificationOptions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiIdentificationOptions;", "", "", "isManualInputActive", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isBioActive", "isWorkflowActive", "a", "isEsiaActive", "isMobileIdActive", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiIdentificationOptions {

    @l
    private final Boolean isBioActive;

    @l
    private final Boolean isEsiaActive;

    @l
    private final Boolean isManualInputActive;

    @l
    private final Boolean isMobileIdActive;

    @l
    private final Boolean isWorkflowActive;

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getIsWorkflowActive() {
        return this.isWorkflowActive;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiIdentificationOptions)) {
            return false;
        }
        ApiIdentificationOptions apiIdentificationOptions = (ApiIdentificationOptions) obj;
        return L.f(this.isManualInputActive, apiIdentificationOptions.isManualInputActive) && L.f(this.isBioActive, apiIdentificationOptions.isBioActive) && L.f(this.isWorkflowActive, apiIdentificationOptions.isWorkflowActive) && L.f(this.isEsiaActive, apiIdentificationOptions.isEsiaActive) && L.f(this.isMobileIdActive, apiIdentificationOptions.isMobileIdActive);
    }

    public final int hashCode() {
        Boolean bool = this.isManualInputActive;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isBioActive;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isWorkflowActive;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isEsiaActive;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isMobileIdActive;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiIdentificationOptions(isManualInputActive=");
        sb2.append(this.isManualInputActive);
        sb2.append(", isBioActive=");
        sb2.append(this.isBioActive);
        sb2.append(", isWorkflowActive=");
        sb2.append(this.isWorkflowActive);
        sb2.append(", isEsiaActive=");
        sb2.append(this.isEsiaActive);
        sb2.append(", isMobileIdActive=");
        return C0.g(sb2, this.isMobileIdActive, ')');
    }
}
