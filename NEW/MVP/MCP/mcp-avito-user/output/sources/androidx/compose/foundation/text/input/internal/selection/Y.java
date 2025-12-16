package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.t1;
import androidx.compose.ui.text.v0;
import j.k0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TextPreparedSelection.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {

    /* compiled from: TextPreparedSelection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IndexTransformationType indexTransformationType = IndexTransformationType.f30841b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IndexTransformationType indexTransformationType2 = IndexTransformationType.f30841b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IndexTransformationType indexTransformationType3 = IndexTransformationType.f30841b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @k0
    public static final long a(int i12, int i13, @Y61.k t1 t1Var) {
        if (i12 == -1) {
            return (i13 << 32) | (4294967295L & (-1));
        }
        boolean z12 = i12 > i13;
        long jE2 = t1Var.e(i12);
        long jG2 = t1Var.g(jE2);
        int iOrdinal = ((v0.d(jE2) && v0.d(jG2)) ? IndexTransformationType.f30841b : (v0.d(jE2) || v0.d(jG2)) ? (!v0.d(jE2) || v0.d(jG2)) ? IndexTransformationType.f30844e : IndexTransformationType.f30842c : IndexTransformationType.f30843d).ordinal();
        if (iOrdinal == 0) {
            return C20918c.b(i12, z12 ? WedgeAffinity.f31012b : WedgeAffinity.f31013c);
        }
        if (iOrdinal == 1) {
            return z12 ? i12 == ((int) (jG2 >> 32)) ? C20918c.b(i12, WedgeAffinity.f31012b) : C20918c.b((int) (jG2 & 4294967295L), WedgeAffinity.f31013c) : i12 == ((int) (jG2 & 4294967295L)) ? C20918c.b(i12, WedgeAffinity.f31013c) : C20918c.b((int) (jG2 >> 32), WedgeAffinity.f31012b);
        }
        if (iOrdinal == 2) {
            return z12 ? C20918c.b((int) (jG2 & 4294967295L), WedgeAffinity.f31012b) : C20918c.b((int) (jG2 >> 32), WedgeAffinity.f31013c);
        }
        if (iOrdinal == 3) {
            return (i12 << 32) | (4294967295L & (-1));
        }
        throw new NoWhenBranchMatchedException();
    }
}
