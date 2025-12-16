package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n38 implements f48, h02 {
    public final j48 b;
    public final n32 c;
    public final Object a = new Object();
    public boolean d = false;

    public n38(j48 j48Var, n32 n32Var) {
        this.b = j48Var;
        this.c = n32Var;
        if (j48Var.p().d.a(l38.d)) {
            n32Var.d();
        } else {
            n32Var.r();
        }
        j48Var.p().a(this);
    }

    @Override // defpackage.h02
    public final l22 a() {
        return this.c.B0;
    }

    public final j48 b() {
        j48 j48Var;
        synchronized (this.a) {
            j48Var = this.b;
        }
        return j48Var;
    }

    public final List h() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.v());
        }
        return listUnmodifiableList;
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                onStop(this.b);
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ova(k38.ON_DESTROY)
    public void onDestroy(j48 j48Var) {
        synchronized (this.a) {
            n32 n32Var = this.c;
            n32Var.y((ArrayList) n32Var.v());
        }
    }

    @ova(k38.ON_PAUSE)
    public void onPause(j48 j48Var) {
        this.c.a.i(false);
    }

    @ova(k38.ON_RESUME)
    public void onResume(j48 j48Var) {
        this.c.a.i(true);
    }

    @ova(k38.ON_START)
    public void onStart(j48 j48Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ova(k38.ON_STOP)
    public void onStop(j48 j48Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    this.d = false;
                    if (this.b.p().d.a(l38.d)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
