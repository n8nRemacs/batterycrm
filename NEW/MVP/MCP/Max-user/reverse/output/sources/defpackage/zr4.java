package defpackage;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class zr4 {
    public static final Size k = new Size(0, 0);
    public static final boolean l = gri.d(3, "DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public tu1 d;
    public final wu1 e;
    public tu1 f;
    public final wu1 g;
    public final Size h;
    public final int i;
    public Class j;

    public zr4(Size size, int i) {
        this.h = size;
        this.i = i;
        final int i2 = 0;
        wu1 wu1VarA = ixi.a(new uu1(this) { // from class: yr4
            public final /* synthetic */ zr4 b;

            {
                this.b = this;
            }

            @Override // defpackage.uu1
            public final String m(tu1 tu1Var) {
                switch (i2) {
                    case 0:
                        zr4 zr4Var = this.b;
                        synchronized (zr4Var.a) {
                            zr4Var.d = tu1Var;
                        }
                        return "DeferrableSurface-termination(" + zr4Var + ")";
                    default:
                        zr4 zr4Var2 = this.b;
                        synchronized (zr4Var2.a) {
                            zr4Var2.f = tu1Var;
                        }
                        return "DeferrableSurface-close(" + zr4Var2 + ")";
                }
            }
        });
        this.e = wu1VarA;
        final int i3 = 1;
        this.g = ixi.a(new uu1(this) { // from class: yr4
            public final /* synthetic */ zr4 b;

            {
                this.b = this;
            }

            @Override // defpackage.uu1
            public final String m(tu1 tu1Var) {
                switch (i3) {
                    case 0:
                        zr4 zr4Var = this.b;
                        synchronized (zr4Var.a) {
                            zr4Var.d = tu1Var;
                        }
                        return "DeferrableSurface-termination(" + zr4Var + ")";
                    default:
                        zr4 zr4Var2 = this.b;
                        synchronized (zr4Var2.a) {
                            zr4Var2.f = tu1Var;
                        }
                        return "DeferrableSurface-close(" + zr4Var2 + ")";
                }
            }
        });
        if (gri.d(3, "DeferrableSurface")) {
            e(n.incrementAndGet(), m.get(), "Surface created");
            wu1VarA.b.d(new kr4(this, 2, Log.getStackTraceString(new Exception())), ayi.a());
        }
    }

    public void a() {
        tu1 tu1Var;
        synchronized (this.a) {
            try {
                if (this.c) {
                    tu1Var = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        tu1Var = this.d;
                        this.d = null;
                    } else {
                        tu1Var = null;
                    }
                    if (gri.d(3, "DeferrableSurface")) {
                        gri.a("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tu1Var != null) {
            tu1Var.b(null);
        }
    }

    public final void b() {
        tu1 tu1Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    tu1Var = this.d;
                    this.d = null;
                } else {
                    tu1Var = null;
                }
                if (gri.d(3, "DeferrableSurface")) {
                    gri.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                    if (this.b == 0) {
                        e(n.get(), m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tu1Var != null) {
            tu1Var.b(null);
        }
    }

    public final ha8 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new ag7(1, new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (gri.d(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        e(n.get(), m.incrementAndGet(), "New surface in use");
                    }
                    gri.a("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!l && gri.d(3, "DeferrableSurface")) {
            gri.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        gri.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract ha8 f();
}
