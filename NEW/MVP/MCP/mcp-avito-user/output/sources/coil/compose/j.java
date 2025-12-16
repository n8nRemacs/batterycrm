package coil.compose;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: utils.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/j;", "", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Object f58233a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f58234b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final coil.j f58235c;

    public j(@Y61.l Object obj, @Y61.k o oVar, @Y61.k coil.j jVar) {
        this.f58233a = obj;
        this.f58234b = oVar;
        this.f58235c = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f58234b.equals(this.f58233a, jVar.f58233a) && L.f(this.f58235c, jVar.f58235c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58235c.hashCode() + (this.f58234b.hashCode(this.f58233a) * 31);
    }
}
