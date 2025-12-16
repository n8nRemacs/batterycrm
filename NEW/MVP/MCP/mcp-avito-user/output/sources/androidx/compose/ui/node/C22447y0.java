package androidx.compose.ui.node;

import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: NodeCoordinator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22447y0 {
    public static final v.d a(InterfaceC22419k interfaceC22419k, int i12) {
        v.d dVar = interfaceC22419k.getF42880b().f42885g;
        if (dVar == null || (dVar.f42883e & i12) == 0) {
            return null;
        }
        while (dVar != null) {
            int i13 = dVar.f42882d;
            if ((i13 & 2) != 0) {
                return null;
            }
            if ((i13 & i12) != 0) {
                return dVar;
            }
            dVar = dVar.f42885g;
        }
        return null;
    }
}
