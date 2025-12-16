package MZ;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: LandingOffersConfig.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LMZ/j;", "", "", "needUpdateConfirm", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    @com.google.gson.annotations.c("needUpdateConfirm")
    private final boolean needUpdateConfirm;

    public j(boolean z12) {
        this.needUpdateConfirm = z12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getNeedUpdateConfirm() {
        return this.needUpdateConfirm;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.needUpdateConfirm == ((j) obj).needUpdateConfirm;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.needUpdateConfirm);
    }

    @Y61.k
    public final String toString() {
        return r.x(new StringBuilder("LandingOffersConfig(needUpdateConfirm="), this.needUpdateConfirm, ')');
    }
}
