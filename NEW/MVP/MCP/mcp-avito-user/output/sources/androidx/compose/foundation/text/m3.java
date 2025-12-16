package androidx.compose.foundation.text;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import kotlin.Metadata;

/* compiled from: ValidatingOffsetMapping.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.text.input.L f31576a;

    static {
        androidx.compose.ui.text.input.L.f42358a.getClass();
        f31576a = new l3(L.a.f42360b, 0, 0);
    }

    @Y61.k
    public static final androidx.compose.ui.text.input.j0 a(@Y61.k androidx.compose.ui.text.input.k0 k0Var, @Y61.k C22602e c22602e) {
        androidx.compose.ui.text.input.L l12;
        androidx.compose.ui.text.input.j0 j0VarC = k0Var.c(c22602e);
        int length = c22602e.f42127c.length();
        C22602e c22602e2 = j0VarC.f42449a;
        int length2 = c22602e2.f42127c.length();
        int iMin = Math.min(length, 100);
        int i12 = 0;
        while (true) {
            l12 = j0VarC.f42450b;
            if (i12 >= iMin) {
                break;
            }
            b(l12.b(i12), length2, i12);
            i12++;
        }
        b(l12.b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i13 = 0; i13 < iMin2; i13++) {
            c(l12.a(i13), length, i13);
        }
        c(l12.a(length2), length, length2);
        return new androidx.compose.ui.text.input.j0(c22602e2, new l3(l12, c22602e.f42127c.length(), c22602e2.f42127c.length()));
    }

    public static final void b(int i12, int i13, int i14) {
        boolean z12 = false;
        if (i12 >= 0 && i12 <= i13) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        StringBuilder sbY = androidx.appcompat.app.r.y(i14, i12, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbY.append(i13);
        sbY.append(']');
        androidx.compose.foundation.internal.e.c(sbY.toString());
    }

    public static final void c(int i12, int i13, int i14) {
        boolean z12 = false;
        if (i12 >= 0 && i12 <= i13) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        StringBuilder sbY = androidx.appcompat.app.r.y(i14, i12, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbY.append(i13);
        sbY.append(']');
        androidx.compose.foundation.internal.e.c(sbY.toString());
    }
}
