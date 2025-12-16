package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x9c {
    public final w9c a;

    public x9c(w9c w9cVar) {
        this.a = w9cVar;
    }

    public final void a(uwg... uwgVarArr) {
        int i;
        w9c w9cVar = this.a;
        w9cVar.getClass();
        Trace.beginSection(kfi.h("CX:unbind"));
        try {
            jei.b();
            q32 q32Var = w9cVar.d;
            if (q32Var == null) {
                i = 0;
            } else {
                wm2 wm2Var = q32Var.f;
                if (wm2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = ((ggg) wm2Var.c).b;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            w9cVar.c.o(ve3.j(Arrays.copyOf(uwgVarArr, uwgVarArr.length)));
        } finally {
            Trace.endSection();
        }
    }
}
