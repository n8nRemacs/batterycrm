package defpackage;

import android.opengl.GLES30;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final /* synthetic */ class dr4 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.a4h
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                ir4 ir4Var = (ir4) this.c;
                long j = this.b;
                synchronized (ir4Var) {
                    while (ir4Var.h.j() < ir4Var.h.b && ir4Var.i.f() <= j) {
                        try {
                            rs0 rs0Var = ir4Var.h;
                            ArrayDeque arrayDeque = (ArrayDeque) rs0Var.e;
                            hsi.g(!arrayDeque.isEmpty());
                            ((ArrayDeque) rs0Var.d).add((tu6) arrayDeque.remove());
                            ir4Var.i.h();
                            GLES30.glDeleteSync(ir4Var.j.h());
                            guf.d();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ir4Var.c();
                }
                return;
            case 1:
                rr4 rr4Var = (rr4) this.c;
                long j2 = this.b;
                rz5 rz5Var = rr4Var.k;
                xo8 xo8Var = rr4Var.c;
                ConcurrentLinkedQueue concurrentLinkedQueue = rz5Var.k;
                rz5Var.h.i();
                if (rz5Var.o != null) {
                    return;
                }
                hsi.g(!rz5Var.p);
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                h9g h9gVar = (h9g) concurrentLinkedQueue.remove();
                rz5Var.i(xo8Var, h9gVar.a, h9gVar.b, j2);
                if (concurrentLinkedQueue.isEmpty() && rz5Var.t) {
                    fs4 fs4Var = rz5Var.w;
                    fs4Var.getClass();
                    fs4Var.h();
                    rz5Var.t = false;
                    return;
                }
                return;
            default:
                rz5 rz5Var2 = (rz5) this.c;
                long j3 = this.b;
                ry ryVar = rz5Var2.m;
                rs0 rs0Var2 = rz5Var2.l;
                hsi.g(rz5Var2.o != null);
                while (rs0Var2.j() < rs0Var2.b && ryVar.f() <= j3) {
                    ArrayDeque arrayDeque2 = (ArrayDeque) rs0Var2.e;
                    hsi.g(!arrayDeque2.isEmpty());
                    ((ArrayDeque) rs0Var2.d).add((tu6) arrayDeque2.remove());
                    ryVar.h();
                    GLES30.glDeleteSync(rz5Var2.n.h());
                    guf.d();
                    rz5Var2.u.m();
                }
                return;
        }
    }
}
