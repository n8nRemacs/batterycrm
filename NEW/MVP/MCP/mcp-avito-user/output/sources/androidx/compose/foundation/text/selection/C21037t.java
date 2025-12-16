package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import kotlin.Metadata;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21037t {
    public static final Direction a(Direction direction, Direction direction2, C21025m0 c21025m0, long j12, C21045x.a aVar) {
        if (aVar == null) {
            return C21027n0.b(direction, direction2);
        }
        int iCompare = c21025m0.f32080f.compare(Long.valueOf(aVar.f32161c), Long.valueOf(j12));
        return iCompare < 0 ? Direction.f31836b : iCompare > 0 ? Direction.f31838d : Direction.f31837c;
    }

    public static final int b(long j12, androidx.compose.ui.text.o0 o0Var) {
        int i12 = (int) (4294967295L & j12);
        if (Float.intBitsToFloat(i12) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i12);
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        return fIntBitsToFloat >= g12.f41920e ? o0Var.f42526a.f42506a.f42127c.length() : g12.g(j12);
    }
}
