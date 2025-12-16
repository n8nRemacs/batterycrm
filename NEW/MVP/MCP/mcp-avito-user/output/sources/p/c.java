package P;

import androidx.compose.runtime.saveable.u;
import androidx.compose.runtime.saveable.x;
import androidx.compose.runtime.snapshots.D;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: UndoManager.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LP/c;", "Landroidx/compose/runtime/saveable/u;", "LP/d;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes.dex */
public final class c implements u<d<Object>, Object> {
    @Override // androidx.compose.runtime.saveable.u
    public final Object a(x xVar, d<Object> dVar) {
        d<Object> dVar2 = dVar;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.add(Integer.valueOf(dVar2.f12759a));
        D<Object> d12 = dVar2.f12760b;
        bVarT.add(Integer.valueOf(d12.size()));
        D<Object> d13 = dVar2.f12761c;
        bVarT.add(Integer.valueOf(d13.size()));
        if (d12.size() > 0) {
            d12.get(0);
            throw null;
        }
        if (d13.size() <= 0) {
            return C42745f0.p(bVarT);
        }
        d13.get(0);
        throw null;
    }
}
