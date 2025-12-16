package wZ;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MnzNavBarDomainV2.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/j;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Float f441569a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C49578b f441570b;

    public j(@Y61.l Float f12, @Y61.l C49578b c49578b) {
        this.f441569a = f12;
        this.f441570b = c49578b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f441569a, jVar.f441569a) && L.f(this.f441570b, jVar.f441570b);
    }

    public final int hashCode() {
        Float f12 = this.f441569a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        C49578b c49578b = this.f441570b;
        return iHashCode + (c49578b != null ? c49578b.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "MnzNavBarDomainV2(progress=" + this.f441569a + ", button=" + this.f441570b + ')';
    }
}
