package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.Q2;
import androidx.compose.foundation.text.selection.o1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextFieldSelectionManager.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "invoke-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class v1 extends kotlin.jvm.internal.N implements Y41.a<l0.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f32148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(C21011f1 c21011f1, InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1) {
        super(0);
        this.f32147l = c21011f1;
        this.f32148m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final l0.g invoke() {
        long jFloatToRawIntBits;
        long j12;
        Q2 q2D;
        C20985q1 c20985q1;
        C22602e c22602e;
        long j13 = this.f32148m.getF42167b().f42872a;
        C21011f1 c21011f1 = this.f32147l;
        l0.g gVarI = c21011f1.i();
        if (gVarI != null) {
            C20985q1 c20985q12 = c21011f1.f31986d;
            C22602e c22602e2 = c20985q12 != null ? c20985q12.f31778a.f30561a : null;
            if (c22602e2 == null || c22602e2.f42127c.length() == 0) {
                l0.g.f413384b.getClass();
                jFloatToRawIntBits = l0.g.f413386d;
            } else {
                Handle handle = (Handle) ((C22082i3) c21011f1.f32000r).getF42167b();
                int i12 = handle == null ? -1 : o1.d.f32099a[handle.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1 || i12 == 2) {
                        long j14 = c21011f1.m().f42384b;
                        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
                        j12 = j14 >> 32;
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        long j15 = c21011f1.m().f42384b;
                        v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
                        j12 = j15 & 4294967295L;
                    }
                    int i13 = (int) j12;
                    C20985q1 c20985q13 = c21011f1.f31986d;
                    if (c20985q13 == null || (q2D = c20985q13.d()) == null || (c20985q1 = c21011f1.f31986d) == null || (c22602e = c20985q1.f31778a.f30561a) == null) {
                        l0.g.f413384b.getClass();
                        jFloatToRawIntBits = l0.g.f413386d;
                    } else {
                        int iG2 = kotlin.ranges.s.g(c21011f1.f31984b.b(i13), 0, c22602e.f42127c.length());
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (q2D.d(gVarI.f413387a) >> 32));
                        androidx.compose.ui.text.o0 o0Var = q2D.f30513a;
                        int iD2 = o0Var.f42527b.d(iG2);
                        float fG2 = o0Var.g(iD2);
                        float fH2 = o0Var.h(iD2);
                        float f12 = kotlin.ranges.s.f(fIntBitsToFloat, Math.min(fG2, fH2), Math.max(fG2, fH2));
                        androidx.compose.ui.unit.u.f42871b.getClass();
                        if (androidx.compose.ui.unit.u.c(j13, 0L) || Math.abs(fIntBitsToFloat - f12) <= ((int) (j13 >> 32)) / 2) {
                            float f13 = o0Var.f42527b.f(iD2);
                            jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(((r0.b(iD2) - f13) / 2) + f13) & 4294967295L);
                        } else {
                            l0.g.f413384b.getClass();
                            jFloatToRawIntBits = l0.g.f413386d;
                        }
                    }
                } else {
                    l0.g.f413384b.getClass();
                    jFloatToRawIntBits = l0.g.f413386d;
                }
            }
        } else {
            l0.g.f413384b.getClass();
            jFloatToRawIntBits = l0.g.f413386d;
        }
        return l0.g.a(jFloatToRawIntBits);
    }
}
