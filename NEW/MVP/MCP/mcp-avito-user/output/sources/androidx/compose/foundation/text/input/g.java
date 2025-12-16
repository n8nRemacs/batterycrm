package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.C0;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.E;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.semantics.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputTransformation.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/g;", "Landroidx/compose/foundation/text/input/c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class g implements c {
    @Override // androidx.compose.foundation.text.input.c
    public final void O(@Y61.k F f12) {
        kotlin.reflect.n<Object>[] nVarArr = C.f41719a;
        y.f41820a.getClass();
        E<Integer> e12 = y.f41819N;
        kotlin.reflect.n<Object> nVar = C.f41719a[25];
        e12.getClass();
        f12.a(e12, 0);
    }

    @Override // androidx.compose.foundation.text.input.c
    public final void P(@Y61.k i iVar) {
        C0 c02 = iVar.f30757d;
        if (c02.length() > 0) {
            int length = c02.length();
            l lVar = iVar.f30755b;
            iVar.c(0, length, lVar.f31511c.toString());
            iVar.g(lVar.f31512d);
            iVar.a().b();
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        ((g) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    @Y61.k
    public final String toString() {
        return "InputTransformation.maxLength(0)";
    }
}
