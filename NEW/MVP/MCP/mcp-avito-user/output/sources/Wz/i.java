package wZ;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MnzNavBarDomain.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/i;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Float f441567a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C49577a f441568b;

    public i(@Y61.l Float f12, @Y61.l C49577a c49577a) {
        this.f441567a = f12;
        this.f441568b = c49577a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f441567a, iVar.f441567a) && L.f(this.f441568b, iVar.f441568b);
    }

    public final int hashCode() {
        Float f12 = this.f441567a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        C49577a c49577a = this.f441568b;
        return iHashCode + (c49577a != null ? c49577a.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "MnzNavBarDomain(progress=" + this.f441567a + ", button=" + this.f441568b + ')';
    }
}
