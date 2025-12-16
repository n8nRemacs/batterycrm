package tM0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LtM0/i;", "", "LtM0/d;", "vasPerformance", "LtM0/c;", "bundles", "<init>", "(LtM0/d;LtM0/c;)V", "LtM0/d;", "b", "()LtM0/d;", "LtM0/c;", "a", "()LtM0/c;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i {

    @com.google.gson.annotations.c("bundles")
    @l
    private final C48579c bundles;

    @com.google.gson.annotations.c("vasPerformance")
    @l
    private final d vasPerformance;

    public i(@l d dVar, @l C48579c c48579c) {
        this.vasPerformance = dVar;
        this.bundles = c48579c;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C48579c getBundles() {
        return this.bundles;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final d getVasPerformance() {
        return this.vasPerformance;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.vasPerformance, iVar.vasPerformance) && L.f(this.bundles, iVar.bundles);
    }

    public final int hashCode() {
        d dVar = this.vasPerformance;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        C48579c c48579c = this.bundles;
        return iHashCode + (c48579c != null ? c48579c.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VasUnionV2TabContent(vasPerformance=" + this.vasPerformance + ", bundles=" + this.bundles + ')';
    }
}
