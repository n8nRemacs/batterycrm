package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;

/* compiled from: TextFieldScroll.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D2 {

    /* compiled from: TextFieldScroll.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.f27425b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final l0.j a(androidx.compose.ui.unit.d dVar, int i12, androidx.compose.ui.text.input.j0 j0Var, androidx.compose.ui.text.o0 o0Var, boolean z12, int i13) {
        l0.j jVarC;
        if (o0Var != null) {
            jVarC = o0Var.c(j0Var.f42450b.b(i12));
        } else {
            l0.j.f413388e.getClass();
            jVarC = l0.j.f413389f;
        }
        int iY02 = dVar.y0(C20850b2.f30651a);
        return l0.j.b(jVarC, z12 ? (i13 - jVarC.f413390a) - iY02 : jVarC.f413390a, z12 ? i13 - jVarC.f413390a : iY02 + jVarC.f413390a, 0.0f, 10);
    }
}
