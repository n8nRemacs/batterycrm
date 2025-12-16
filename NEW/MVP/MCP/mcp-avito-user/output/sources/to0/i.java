package To0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/i;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15921a;

    public i(@k String str) {
        this.f15921a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && L.f(this.f15921a, ((i) obj).f15921a);
    }

    public final int hashCode() {
        return this.f15921a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("Vas(offerLink="), this.f15921a, ')');
    }
}
