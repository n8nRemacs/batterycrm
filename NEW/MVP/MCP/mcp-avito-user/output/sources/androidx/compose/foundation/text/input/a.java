package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.C20981p1;
import androidx.compose.foundation.text.input.internal.C20907o;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputTransformation.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/a;", "Landroidx/compose/foundation/text/input/c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class a implements c {
    @Override // androidx.compose.foundation.text.input.c
    public final void P(@Y61.k i iVar) {
        C20907o c20907oA = iVar.a();
        for (int i12 = 0; i12 < c20907oA.f31175a.f38262d; i12++) {
            long jD2 = c20907oA.d(i12);
            c20907oA.c(i12);
            if (!v0.d(jD2)) {
                v0.g(jD2);
                v0.f(jD2);
                w0.c(jD2, iVar.f30757d);
                int i13 = j0.f42490a;
                throw null;
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.c
    @Y61.k
    public final C20981p1 Q() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "InputTransformation.allCaps(locale=null)";
    }
}
