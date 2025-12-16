package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.HandwritingGesture;
import androidx.compose.foundation.text.input.internal.D0;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22636b;
import androidx.compose.ui.text.input.C22643i;
import androidx.compose.ui.text.input.InterfaceC22645k;
import kotlin.Metadata;

/* compiled from: HandwritingGesture.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/V;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final V f31005a = new V();

    public static int a(t1 t1Var, HandwritingGesture handwritingGesture) {
        androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
        androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
        pVar.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
        iVar.f30762i = null;
        t1Var.m(iVar);
        androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        t1.i(t1Var, fallbackText, false, 12);
        return 5;
    }

    public static int b(HandwritingGesture handwritingGesture, Y41.l lVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ((D0.a) lVar).invoke(new C22636b(fallbackText, 1));
        return 5;
    }

    public static void c(t1 t1Var, long j12, int i12) {
        if (androidx.compose.ui.text.v0.d(j12)) {
            androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
            androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
            pVar.f31519b.a().b();
            androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
            iVar.f30762i = null;
            t1Var.m(iVar);
            androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
            return;
        }
        long jF2 = t1Var.f(j12);
        androidx.compose.foundation.text.input.c cVar2 = t1Var.f31453b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.f31477b;
        androidx.compose.foundation.text.input.p pVar2 = t1Var.f31452a;
        pVar2.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar2 = pVar2.f31519b;
        int i13 = (int) (jF2 >> 32);
        int i14 = (int) (jF2 & 4294967295L);
        if (i13 >= i14) {
            iVar2.getClass();
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i13, i14, "Do not set reversed or empty range: ", " > "));
        }
        C0 c02 = iVar2.f30757d;
        iVar2.f30762i = new kotlin.Q<>(androidx.compose.foundation.text.input.s.a(i12), androidx.compose.ui.text.v0.a(androidx.compose.ui.text.w0.a(kotlin.ranges.s.g(i13, 0, c02.length()), kotlin.ranges.s.g(i14, 0, c02.length()))));
        androidx.compose.foundation.text.input.p.a(pVar2, cVar2, true, textFieldEditUndoBehavior2);
    }

    public static void d(long j12, C22602e c22602e, boolean z12, Y41.l lVar) {
        if (z12) {
            j12 = X.a(j12, c22602e);
        }
        int i12 = (int) (4294967295L & j12);
        ((D0.a) lVar).invoke(new W(new InterfaceC22645k[]{new androidx.compose.ui.text.input.V(i12, i12), new C22643i(androidx.compose.ui.text.v0.e(j12), 0)}));
    }

    public static int e(int i12) {
        if (i12 == 1) {
            androidx.compose.ui.text.k0.f42491b.getClass();
            return androidx.compose.ui.text.k0.f42492c;
        }
        if (i12 != 2) {
            androidx.compose.ui.text.k0.f42491b.getClass();
            return 0;
        }
        androidx.compose.ui.text.k0.f42491b.getClass();
        return 0;
    }
}
