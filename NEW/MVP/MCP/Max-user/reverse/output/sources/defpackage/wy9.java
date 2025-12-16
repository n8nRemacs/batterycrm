package defpackage;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wy9 implements lf7, eh6 {
    public final vd X;
    public kf7 Y;
    public Executor Z;
    public final Object a;
    public final l52 b;
    public int c;
    public final xu9 d;
    public boolean o;
    public final LongSparseArray s0;
    public final LongSparseArray t0;
    public int u0;
    public final ArrayList v0;
    public final ArrayList w0;

    public wy9(int i, int i2, int i3, int i4) {
        vd vdVar = new vd(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new l52(1, this);
        this.c = 0;
        this.d = new xu9(1, this);
        this.o = false;
        this.s0 = new LongSparseArray();
        this.t0 = new LongSparseArray();
        this.w0 = new ArrayList();
        this.X = vdVar;
        this.u0 = 0;
        this.v0 = new ArrayList(m());
    }

    @Override // defpackage.eh6
    public final void a(fh6 fh6Var) {
        synchronized (this.a) {
            b(fh6Var);
        }
    }

    public final void b(fh6 fh6Var) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.v0.indexOf(fh6Var);
                if (iIndexOf >= 0) {
                    this.v0.remove(iIndexOf);
                    int i = this.u0;
                    if (iIndexOf <= i) {
                        this.u0 = i - 1;
                    }
                }
                this.w0.remove(fh6Var);
                if (this.c > 0) {
                    d(this.X);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(jke jkeVar) {
        kf7 kf7Var;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.v0.size() < m()) {
                    jkeVar.c(this);
                    this.v0.add(jkeVar);
                    kf7Var = this.Y;
                    executor = this.Z;
                } else {
                    gri.a("TAG", "Maximum image number reached.");
                    jkeVar.close();
                    kf7Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kf7Var != null) {
            if (executor != null) {
                executor.execute(new k79(this, 8, kf7Var));
            } else {
                kf7Var.d(this);
            }
        }
    }

    @Override // defpackage.lf7
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.o) {
                    return;
                }
                Iterator it = new ArrayList(this.v0).iterator();
                while (it.hasNext()) {
                    ((jf7) it.next()).close();
                }
                this.v0.clear();
                this.X.close();
                this.o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(lf7 lf7Var) {
        jf7 jf7VarN;
        synchronized (this.a) {
            try {
                if (this.o) {
                    return;
                }
                int size = this.t0.size() + this.v0.size();
                if (size >= lf7Var.m()) {
                    gri.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        jf7VarN = lf7Var.n();
                        if (jf7VarN != null) {
                            this.c--;
                            size++;
                            this.t0.put(jf7VarN.getImageInfo().getTimestamp(), jf7VarN);
                            h();
                        }
                    } catch (IllegalStateException e) {
                        if (gri.d(3, "MetadataImageReader")) {
                            Log.d("MetadataImageReader", "Failed to acquire next image.", e);
                        }
                        jf7VarN = null;
                    }
                    if (jf7VarN == null || this.c <= 0) {
                        break;
                    }
                } while (size < lf7Var.m());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lf7
    public final jf7 e() {
        synchronized (this.a) {
            try {
                if (this.v0.isEmpty()) {
                    return null;
                }
                if (this.u0 >= this.v0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.v0.size() - 1; i++) {
                    if (!this.w0.contains(this.v0.get(i))) {
                        arrayList.add((jf7) this.v0.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((jf7) it.next()).close();
                }
                int size = this.v0.size();
                ArrayList arrayList2 = this.v0;
                this.u0 = size;
                jf7 jf7Var = (jf7) arrayList2.get(size - 1);
                this.w0.add(jf7Var);
                return jf7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lf7
    public final int f() {
        int iF;
        synchronized (this.a) {
            iF = this.X.f();
        }
        return iF;
    }

    @Override // defpackage.lf7
    public final void g() {
        synchronized (this.a) {
            this.X.g();
            this.Y = null;
            this.Z = null;
            this.c = 0;
        }
    }

    @Override // defpackage.lf7
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.X.getHeight();
        }
        return height;
    }

    @Override // defpackage.lf7
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.X.getSurface();
        }
        return surface;
    }

    @Override // defpackage.lf7
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.X.getWidth();
        }
        return width;
    }

    public final void h() {
        synchronized (this.a) {
            try {
                for (int size = this.s0.size() - 1; size >= 0; size--) {
                    qe7 qe7Var = (qe7) this.s0.valueAt(size);
                    long timestamp = qe7Var.getTimestamp();
                    jf7 jf7Var = (jf7) this.t0.get(timestamp);
                    if (jf7Var != null) {
                        this.t0.remove(timestamp);
                        this.s0.removeAt(size);
                        c(new jke(jf7Var, null, qe7Var));
                    }
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lf7
    public final void i(kf7 kf7Var, Executor executor) {
        synchronized (this.a) {
            kf7Var.getClass();
            this.Y = kf7Var;
            executor.getClass();
            this.Z = executor;
            this.X.i(this.d, executor);
        }
    }

    public final void j() {
        synchronized (this.a) {
            try {
                if (this.t0.size() != 0 && this.s0.size() != 0) {
                    long jKeyAt = this.t0.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.s0.keyAt(0);
                    z5j.b(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.t0.size() - 1; size >= 0; size--) {
                            if (this.t0.keyAt(size) < jKeyAt2) {
                                ((jf7) this.t0.valueAt(size)).close();
                                this.t0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.s0.size() - 1; size2 >= 0; size2--) {
                            if (this.s0.keyAt(size2) < jKeyAt) {
                                this.s0.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.lf7
    public final int m() {
        int iM;
        synchronized (this.a) {
            iM = this.X.m();
        }
        return iM;
    }

    @Override // defpackage.lf7
    public final jf7 n() {
        synchronized (this.a) {
            try {
                if (this.v0.isEmpty()) {
                    return null;
                }
                if (this.u0 >= this.v0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.v0;
                int i = this.u0;
                this.u0 = i + 1;
                jf7 jf7Var = (jf7) arrayList.get(i);
                this.w0.add(jf7Var);
                return jf7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
