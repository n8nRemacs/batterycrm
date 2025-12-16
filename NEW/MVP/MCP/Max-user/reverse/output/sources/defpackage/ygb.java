package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.entity.ContentLengthStrategy;

/* loaded from: classes2.dex */
public final class ygb implements jb8 {
    public final ri4 a;
    public final Supplier c;
    public final int d;
    public final xo8 b = new xo8(22, (byte) 0);
    public final long e = zxg.U(0);
    public final HashMap f = new HashMap();
    public long g = -1;

    public ygb(ri4 ri4Var, int i, Supplier supplier) {
        this.a = ri4Var;
        this.c = supplier;
        this.d = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.jb8
    public final void a(ib8 ib8Var, bn5[] bn5VarArr) {
        if (bn5VarArr != null && bn5VarArr.length != 0) {
            int iMax = Integer.MIN_VALUE;
            for (bn5 bn5Var : bn5VarArr) {
                if (bn5Var != null) {
                    iMax = Math.max(iMax, bn5Var.j().j);
                }
            }
        }
        n4c n4cVar = ib8Var.a;
        HashMap map = this.f;
        xgb xgbVar = (xgb) map.get(n4cVar);
        xgbVar.getClass();
        int iMax2 = this.d;
        if (iMax2 == -1) {
            int length = bn5VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    bn5 bn5Var2 = bn5VarArr[i];
                    if (bn5Var2 != null) {
                        switch (bn5Var2.a().c) {
                            case ContentLengthStrategy.CHUNKED /* -2 */:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax2 = Math.max(13107200, i2);
                }
            }
        }
        xgbVar.b = iMax2;
        boolean zIsEmpty = map.isEmpty();
        ri4 ri4Var = this.a;
        if (zIsEmpty) {
            ri4Var.b();
        } else {
            ri4Var.c(m());
        }
    }

    @Override // defpackage.jb8
    public final boolean b() {
        return false;
    }

    @Override // defpackage.jb8
    public final boolean c() {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            if (((xgb) it.next()).a) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jb8
    public final void e(n4c n4cVar) {
        HashMap map = this.f;
        if (map.remove(n4cVar) != null) {
            boolean zIsEmpty = map.isEmpty();
            ri4 ri4Var = this.a;
            if (zIsEmpty) {
                ri4Var.b();
            } else {
                ri4Var.c(m());
            }
        }
        if (map.isEmpty()) {
            this.g = -1L;
        }
    }

    @Override // defpackage.jb8
    public final void f(n4c n4cVar) {
        HashMap map = this.f;
        if (map.remove(n4cVar) != null) {
            boolean zIsEmpty = map.isEmpty();
            ri4 ri4Var = this.a;
            if (zIsEmpty) {
                ri4Var.b();
            } else {
                ri4Var.c(m());
            }
        }
    }

    @Override // defpackage.jb8
    public final long h() {
        return this.e;
    }

    @Override // defpackage.jb8
    public final void i(n4c n4cVar) {
        long id = Thread.currentThread().getId();
        long j = this.g;
        hsi.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.g = id;
        HashMap map = this.f;
        if (!map.containsKey(n4cVar)) {
            map.put(n4cVar, new xgb());
        }
        xgb xgbVar = (xgb) map.get(n4cVar);
        xgbVar.getClass();
        int i = this.d;
        if (i == -1) {
            i = 13107200;
        }
        xgbVar.b = i;
        xgbVar.a = false;
    }

    @Override // defpackage.jb8
    public final boolean j(ib8 ib8Var) {
        xgb xgbVar = (xgb) this.f.get(ib8Var.a);
        xgbVar.getClass();
        boolean z = this.a.a() >= m();
        kb8 kb8Var = (kb8) n().b;
        long jMin = kb8Var.f;
        long j = kb8Var.g;
        float f = ib8Var.c;
        if (f > 1.0f) {
            jMin = Math.min(zxg.D(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        boolean z2 = xgbVar.a;
        long j2 = ib8Var.b;
        if (j2 < jMax) {
            z = kb8Var.e || !z;
            if (!z2 && j2 < 500000) {
                a8i.l("DefaultLoadControlStrat", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 < j && !z) {
            z = z2;
        }
        xgbVar.a = z;
        return z;
    }

    @Override // defpackage.jb8
    public final ri4 k() {
        return this.a;
    }

    @Override // defpackage.jb8
    public final boolean l(ib8 ib8Var) {
        boolean z = this.a.a() >= m();
        kb8 kb8Var = (kb8) n().b;
        long jG = zxg.G(ib8Var.c, ib8Var.b);
        long jMin = ib8Var.d ? kb8Var.i : kb8Var.h;
        long j = ib8Var.e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jG >= jMin || (!kb8Var.e && z);
    }

    public final int m() {
        Iterator it = this.f.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((xgb) it.next()).b;
        }
        return i;
    }

    public final r5j n() {
        lb8 lb8Var = (lb8) this.c.get();
        xo8 xo8Var = this.b;
        r5j r5jVar = (r5j) xo8Var.b;
        if (r5jVar != null) {
            if (!lb8Var.equals((kb8) xo8Var.c)) {
                r5jVar = null;
            }
            if (r5jVar != null) {
                return r5jVar;
            }
        }
        if (!(lb8Var instanceof kb8)) {
            throw new NoWhenBranchMatchedException();
        }
        r5j r5jVar2 = new r5j(15, (kb8) lb8Var);
        xo8Var.c = (kb8) lb8Var;
        xo8Var.b = r5jVar2;
        return r5jVar2;
    }
}
