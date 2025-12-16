package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.B;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22448z;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DragAndDropNode.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    @Y61.k
    public static final e a(@Y61.k Y41.l lVar, @Y61.k o oVar) {
        return new e(null, new j(lVar, oVar), 1, null);
    }

    public static final boolean b(e eVar, long j12) {
        if (!eVar.f42880b.f42893o) {
            return false;
        }
        C22448z c22448z = C22421l.g(eVar).f40615I.f40875b;
        if (!c22448z.f40957T.f42893o) {
            return false;
        }
        long jE2 = B.e(c22448z);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        long j13 = eVar.f39006u;
        float f12 = ((int) (j13 >> 32)) + fIntBitsToFloat;
        float f13 = ((int) (j13 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j12 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f12) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f13;
    }
}
