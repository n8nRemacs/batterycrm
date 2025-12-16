package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class m97 implements py4, p97 {
    public long Y;
    public final bwf a;
    public final File c;
    public final h0e d;
    public final vta o;
    public final AtomicBoolean X = new AtomicBoolean();
    public final String b = "";

    public m97(vta vtaVar, bwf bwfVar, File file, h0e h0eVar) {
        this.a = bwfVar;
        this.c = file;
        this.d = h0eVar;
        this.o = vtaVar;
    }

    @Override // defpackage.p97
    public final String a() {
        return this.c.getAbsolutePath();
    }

    @Override // defpackage.p97
    public final void b() {
        if (this.X.get()) {
            return;
        }
        this.d.b(new k97(this, 1));
    }

    @Override // defpackage.p97
    public final void c() {
    }

    @Override // defpackage.p97
    public final void d() {
        if (this.X.get()) {
            return;
        }
        this.d.b(new k97(this, 0));
    }

    @Override // defpackage.py4
    public final void dispose() {
        i(true);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.X.get();
    }

    @Override // defpackage.p97
    public final void f(File file) {
        if (this.X.get()) {
            return;
        }
        this.d.b(new qz5(this, 10, file));
    }

    @Override // defpackage.p97
    public final void g() {
        if (this.X.get()) {
            return;
        }
        this.d.b(new k97(this, 2));
    }

    @Override // defpackage.p97
    public final void h(float f, long j) {
        if (this.X.get()) {
            return;
        }
        this.d.b(new l97(this, f, j, 0));
    }

    public final void i(boolean z) {
        if (this.X.compareAndSet(false, true)) {
            h0e h0eVar = this.d;
            if (!h0eVar.e()) {
                h0eVar.dispose();
            }
            if (z) {
                wqi.c("n97", "cancelDownload", new Object[0]);
                ((s97) this.a.getValue()).a(this.c, null);
            }
        }
    }
}
