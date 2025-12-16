package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.p1;
import androidx.compose.foundation.text.input.internal.q1;
import androidx.compose.foundation.text.input.internal.t1;
import androidx.compose.foundation.text.selection.M0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TextFieldMagnifier.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.selection.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20923h {

    /* compiled from: TextFieldMagnifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.h$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31373a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                Handle handle = Handle.f30328b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Handle handle2 = Handle.f30328b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Handle handle3 = Handle.f30328b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31373a = iArr;
        }
    }

    public static final long a(@Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k p1 p1Var, long j12) {
        long j13;
        long jN2 = textFieldSelectionState.n();
        if ((9223372034707292159L & jN2) == 9205357640488583168L || t1Var.d().f31511c.length() == 0) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        long j14 = t1Var.d().f31512d;
        Handle handleM = textFieldSelectionState.m();
        int i12 = handleM == null ? -1 : a.f31373a[handleM.ordinal()];
        if (i12 == -1) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        if (i12 == 1 || i12 == 2) {
            v0.a aVar = v0.f42734b;
            j13 = j14 >> 32;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            v0.a aVar2 = v0.f42734b;
            j13 = j14 & 4294967295L;
        }
        int i13 = (int) j13;
        o0 o0VarB = p1Var.b();
        if (o0VarB == null) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN2 >> 32));
        androidx.compose.ui.text.G g12 = o0VarB.f42527b;
        int iD2 = g12.d(i13);
        float fG2 = o0VarB.g(iD2);
        float fH2 = o0VarB.h(iD2);
        float f12 = kotlin.ranges.s.f(fIntBitsToFloat, Math.min(fG2, fH2), Math.max(fG2, fH2));
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (!androidx.compose.ui.unit.u.c(j12, 0L) && Math.abs(fIntBitsToFloat - f12) > ((int) (j12 >> 32)) / 2) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        float f13 = g12.f(iD2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(((g12.b(iD2) - f13) / 2) + f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        androidx.compose.ui.layout.A aC2 = p1Var.c();
        l0.g gVarA = null;
        if (aC2 != null) {
            if (!aC2.m()) {
                aC2 = null;
            }
            if (aC2 != null) {
                jFloatToRawIntBits = q1.a(jFloatToRawIntBits, M0.c(aC2));
            }
        }
        androidx.compose.ui.layout.A aC3 = p1Var.c();
        if (aC3 == null) {
            return jFloatToRawIntBits;
        }
        if (!aC3.m()) {
            aC3 = null;
        }
        if (aC3 == null) {
            return jFloatToRawIntBits;
        }
        androidx.compose.ui.layout.A a12 = (androidx.compose.ui.layout.A) ((C22082i3) p1Var.f31203d).getF42167b();
        if (a12 != null) {
            if (!a12.m()) {
                a12 = null;
            }
            if (a12 != null) {
                gVarA = l0.g.a(a12.z(aC3, jFloatToRawIntBits));
            }
        }
        return gVarA != null ? gVarA.f413387a : jFloatToRawIntBits;
    }
}
