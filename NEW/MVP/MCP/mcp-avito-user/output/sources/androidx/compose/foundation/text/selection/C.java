package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import androidx.compose.ui.text.v0;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: SelectionAdjustment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "currentRawLine", "Landroidx/compose/foundation/text/selection/x$a;", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C {
    public static final C21045x a(InterfaceC21023l0 interfaceC21023l0, InterfaceC21018j interfaceC21018j) {
        boolean z12 = interfaceC21023l0.c() == CrossStatus.f31829b;
        return new C21045x(c(interfaceC21023l0.j(), z12, true, interfaceC21023l0.getF32110c(), interfaceC21018j), c(interfaceC21023l0.i(), z12, false, interfaceC21023l0.getF32111d(), interfaceC21018j), z12);
    }

    public static final C21045x.a b(InterfaceC21023l0 interfaceC21023l0, C21043w c21043w, C21045x.a aVar) {
        int i12 = interfaceC21023l0.getF32112e() ? c21043w.f32151c : c21043w.f32152d;
        if ((interfaceC21023l0.getF32112e() ? interfaceC21023l0.getF32110c() : interfaceC21023l0.getF32111d()) != c21043w.f32150b) {
            return c21043w.a(i12);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new B(c21043w, i12));
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new A(c21043w, i12, interfaceC21023l0.getF32112e() ? c21043w.f32152d : c21043w.f32151c, interfaceC21023l0, interfaceC42726CB));
        if (c21043w.f32149a != aVar.f32161c) {
            return (C21045x.a) interfaceC42726CB2.getValue();
        }
        int i13 = c21043w.f32153e;
        if (i12 == i13) {
            return aVar;
        }
        androidx.compose.ui.text.o0 o0Var = c21043w.f32154f;
        if (((Number) interfaceC42726CB.getValue()).intValue() != o0Var.f42527b.d(i13)) {
            return (C21045x.a) interfaceC42726CB2.getValue();
        }
        int i14 = aVar.f32160b;
        long jL2 = o0Var.l(i14);
        boolean f32112e = interfaceC21023l0.getF32112e();
        if (i13 != -1) {
            if (i12 != i13) {
                if (!(f32112e ^ (c21043w.b() == CrossStatus.f31829b))) {
                }
            }
            return c21043w.a(i12);
        }
        v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
        return (i14 == ((int) (jL2 >> 32)) || i14 == ((int) (jL2 & 4294967295L))) ? (C21045x.a) interfaceC42726CB2.getValue() : c21043w.a(i12);
    }

    public static final C21045x.a c(C21043w c21043w, boolean z12, boolean z13, int i12, InterfaceC21018j interfaceC21018j) {
        long j12;
        int i13 = z13 ? c21043w.f32151c : c21043w.f32152d;
        if (i12 != c21043w.f32150b) {
            return c21043w.a(i13);
        }
        long jA2 = interfaceC21018j.a(c21043w, i13);
        if (z12 ^ z13) {
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            j12 = jA2 >> 32;
        } else {
            v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
            j12 = 4294967295L & jA2;
        }
        return c21043w.a((int) j12);
    }

    public static final C21045x.a d(C21045x.a aVar, C21043w c21043w, int i12) {
        return new C21045x.a(c21043w.f32154f.a(i12), i12, aVar.f32161c);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.text.selection.C21045x e(@Y61.k androidx.compose.foundation.text.selection.C21045x r8, @Y61.k androidx.compose.foundation.text.selection.InterfaceC21023l0 r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C.e(androidx.compose.foundation.text.selection.x, androidx.compose.foundation.text.selection.l0):androidx.compose.foundation.text.selection.x");
    }
}
