package defpackage;

import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final /* synthetic */ class nr4 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr4 b;

    public /* synthetic */ nr4(rr4 rr4Var, int i) {
        this.a = i;
        this.b = rr4Var;
    }

    @Override // defpackage.a4h
    public final void run() {
        int i = this.a;
        rr4 rr4Var = this.b;
        switch (i) {
            case 0:
                rr4Var.b();
                return;
            case 1:
                EGLDisplay eGLDisplay = rr4Var.e;
                xo8 xo8Var = rr4Var.c;
                boolean z = rr4Var.d;
                ArrayList arrayList = rr4Var.l;
                try {
                    try {
                        rr4Var.f.b();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((su6) arrayList.get(i2)).release();
                        }
                        rr4Var.k.release();
                    } catch (Exception e) {
                        a8i.h("DefaultFrameProcessor", "Error releasing shader program", e);
                    }
                    if (z) {
                        try {
                            xo8Var.K(eGLDisplay);
                            return;
                        } catch (GlUtil$GlException e2) {
                            a8i.h("DefaultFrameProcessor", "Error releasing GL objects", e2);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        try {
                            xo8Var.K(eGLDisplay);
                        } catch (GlUtil$GlException e3) {
                            a8i.h("DefaultFrameProcessor", "Error releasing GL objects", e3);
                        }
                    }
                    throw th;
                }
            case 2:
                rz5 rz5Var = rr4Var.k;
                emd emdVar = rr4Var.u;
                String str = zxg.a;
                boolean z2 = emdVar.j == 0;
                h9g[] h9gVarArr = emdVar.i;
                long j = z2 ? -9223372036854775807L : h9gVarArr[0].b;
                ConcurrentLinkedQueue concurrentLinkedQueue = rz5Var.k;
                rz5Var.A = j;
                for (int i3 = 0; i3 < concurrentLinkedQueue.size(); i3++) {
                    rz5Var.u.o(((h9g) concurrentLinkedQueue.remove()).a);
                }
                if (emdVar.j == 0) {
                    return;
                }
                h9g h9gVar = h9gVarArr[0];
                emdVar.c.w(h9gVar.a, h9gVar.b);
                if (emdVar.j > 1) {
                    h9g h9gVar2 = h9gVarArr[1];
                    emdVar.c.w(h9gVar2.a, h9gVar2.b);
                    return;
                }
                return;
            default:
                int i4 = rr4.y;
                rr4Var.b();
                return;
        }
    }
}
