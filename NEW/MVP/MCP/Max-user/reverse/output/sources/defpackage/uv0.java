package defpackage;

import bolts.Task;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class uv0 {
    public final nv5 a;
    public final py0 b;
    public final bj c;
    public final Executor d;
    public final Executor e;
    public final be7 f;
    public final t9f g;

    public uv0(nv5 nv5Var, py0 py0Var, bj bjVar, Executor executor, Executor executor2, be7 be7Var) {
        this.a = nv5Var;
        this.b = py0Var;
        this.c = bjVar;
        this.d = executor;
        this.e = executor2;
        this.f = be7Var;
        t9f t9fVar = new t9f(0);
        t9fVar.b = new HashMap();
        this.g = t9fVar;
    }

    public final void a() {
        this.g.h();
        try {
            Task.call(new tv0(0, this), this.e);
        } catch (Exception e) {
            op5.l(e, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e);
        }
    }

    public final nf9 b(c1f c1fVar) throws IOException {
        String str = c1fVar.a;
        be7 be7Var = this.f;
        try {
            op5.d(uv0.class, str, "Disk cache read for %s");
            mv5 mv5VarB = ((wx4) this.a).b(c1fVar);
            if (mv5VarB == null) {
                op5.d(uv0.class, str, "Disk cache miss for %s");
                be7Var.l();
                return null;
            }
            op5.d(uv0.class, str, "Found entry in disk cache for %s");
            be7Var.b();
            FileInputStream fileInputStream = new FileInputStream(mv5VarB.a);
            try {
                py0 py0Var = this.b;
                int length = (int) mv5VarB.a.length();
                py0Var.getClass();
                of9 of9Var = new of9((mf9) py0Var.b, length);
                try {
                    ((bj) py0Var.c).a(fileInputStream, of9Var);
                    nf9 nf9VarW = of9Var.w();
                    fileInputStream.close();
                    op5.d(uv0.class, str, "Successful read from disk cache for %s");
                    return nf9VarW;
                } finally {
                    of9Var.close();
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            op5.l(e, "Exception reading from cache for %s", str);
            be7Var.f();
            throw e;
        }
    }

    public final void c(c1f c1fVar, ce5 ce5Var) {
        String str = c1fVar.a;
        op5.d(uv0.class, str, "About to write to disk-cache for key %s");
        try {
            ((wx4) this.a).d(c1fVar, new i00(ce5Var, 3, this));
            this.f.getClass();
            op5.d(uv0.class, str, "Successful disk-cache write for key %s");
        } catch (IOException e) {
            op5.l(e, "Failed to write to disk-cache for key %s", str);
        }
    }
}
