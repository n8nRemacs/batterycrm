package VV0;

import TV0.b;
import TV0.c;
import Y61.k;
import kotlin.Metadata;

/* compiled from: BlueprintCollisionException.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_konveyor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @k
    public static final String a(@k b<?, ?> bVar) {
        int iA2 = c.a(bVar);
        Class<?> cls = bVar.a().getClass();
        int iHashCode = bVar.a().getClass().hashCode();
        return "Type:" + iA2 + " / BP:" + bVar.getClass() + " (" + bVar.getClass().hashCode() + ") / P:" + cls + " (" + iHashCode + ") / L:" + bVar.b().f15692a;
    }
}
