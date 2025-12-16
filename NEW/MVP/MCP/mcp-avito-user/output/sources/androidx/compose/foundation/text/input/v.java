package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.C20907o;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.Metadata;

/* compiled from: TextUndoManager.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {
    public static final void a(@Y61.k u uVar, @Y61.k l lVar, @Y61.k l lVar2, @Y61.k C20907o c20907o, boolean z12) {
        int i12 = c20907o.f31175a.f38262d;
        if (i12 > 1) {
            uVar.b(new P.a(0, lVar.f31511c.toString(), lVar2.f31511c.toString(), lVar.f31512d, lVar2.f31512d, 0L, false, 32, null));
            return;
        }
        if (i12 == 1) {
            long jC2 = c20907o.c(0);
            long jD2 = c20907o.d(0);
            if (v0.d(jC2) && v0.d(jD2)) {
                return;
            }
            uVar.b(new P.a(v0.g(jC2), w0.c(jC2, lVar), w0.c(jD2, lVar2), lVar.f31512d, lVar2.f31512d, 0L, z12, 32, null));
        }
    }
}
