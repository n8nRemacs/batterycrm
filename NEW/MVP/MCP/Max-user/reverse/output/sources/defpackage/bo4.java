package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.entity.ContentLengthStrategy;

/* loaded from: classes.dex */
public final class bo4 implements jb8 {
    public final ri4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final HashMap i;
    public long j;

    public bo4(ri4 ri4Var, int i, int i2, int i3, int i4, boolean z) {
        m("bufferForPlaybackMs", i3, 0, "0");
        m("bufferForPlaybackAfterRebufferMs", i4, 0, "0");
        m("minBufferMs", i, i3, "bufferForPlaybackMs");
        m("minBufferMs", i, i4, "bufferForPlaybackAfterRebufferMs");
        m("maxBufferMs", i2, i, "minBufferMs");
        m("backBufferDurationMs", 0, 0, "0");
        this.a = ri4Var;
        this.b = zxg.U(i);
        this.c = zxg.U(i2);
        this.d = zxg.U(i3);
        this.e = zxg.U(i4);
        this.f = -1;
        this.g = z;
        this.h = zxg.U(0);
        this.i = new HashMap();
        this.j = -1L;
    }

    public static void m(String str, int i, int i2, String str2) {
        hsi.a(str + " cannot be less than " + str2, i >= i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.jb8
    public final void a(ib8 ib8Var, bn5[] bn5VarArr) {
        n4c n4cVar = ib8Var.a;
        HashMap map = this.i;
        zn4 zn4Var = (zn4) map.get(n4cVar);
        zn4Var.getClass();
        int iMax = this.f;
        if (iMax == -1) {
            int length = bn5VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    bn5 bn5Var = bn5VarArr[i];
                    if (bn5Var != null) {
                        switch (bn5Var.a().c) {
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
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        zn4Var.b = iMax;
        boolean zIsEmpty = map.isEmpty();
        ri4 ri4Var = this.a;
        if (zIsEmpty) {
            ri4Var.b();
        } else {
            ri4Var.c(n());
        }
    }

    @Override // defpackage.jb8
    public final boolean b() {
        return false;
    }

    @Override // defpackage.jb8
    public final boolean c() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            if (((zn4) it.next()).a) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jb8
    public final void e(n4c n4cVar) {
        HashMap map = this.i;
        if (map.remove(n4cVar) != null) {
            boolean zIsEmpty = map.isEmpty();
            ri4 ri4Var = this.a;
            if (zIsEmpty) {
                ri4Var.b();
            } else {
                ri4Var.c(n());
            }
        }
        if (map.isEmpty()) {
            this.j = -1L;
        }
    }

    @Override // defpackage.jb8
    public final void f(n4c n4cVar) {
        HashMap map = this.i;
        if (map.remove(n4cVar) != null) {
            boolean zIsEmpty = map.isEmpty();
            ri4 ri4Var = this.a;
            if (zIsEmpty) {
                ri4Var.b();
            } else {
                ri4Var.c(n());
            }
        }
    }

    @Override // defpackage.jb8
    public final long h() {
        return this.h;
    }

    @Override // defpackage.jb8
    public final void i(n4c n4cVar) {
        long id = Thread.currentThread().getId();
        long j = this.j;
        hsi.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.j = id;
        HashMap map = this.i;
        if (!map.containsKey(n4cVar)) {
            map.put(n4cVar, new zn4());
        }
        zn4 zn4Var = (zn4) map.get(n4cVar);
        zn4Var.getClass();
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        zn4Var.b = i;
        zn4Var.a = false;
    }

    @Override // defpackage.jb8
    public final boolean j(ib8 ib8Var) {
        zn4 zn4Var = (zn4) this.i.get(ib8Var.a);
        zn4Var.getClass();
        boolean z = true;
        boolean z2 = this.a.a() >= n();
        float f = ib8Var.c;
        long j = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(zxg.D(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = ib8Var.b;
        if (j2 < jMax) {
            if (!this.g && z2) {
                z = false;
            }
            zn4Var.a = z;
            if (!z && j2 < 500000) {
                a8i.l("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            zn4Var.a = false;
        }
        return zn4Var.a;
    }

    @Override // defpackage.jb8
    public final ri4 k() {
        return this.a;
    }

    @Override // defpackage.jb8
    public final boolean l(ib8 ib8Var) {
        long jG = zxg.G(ib8Var.c, ib8Var.b);
        long jMin = ib8Var.d ? this.e : this.d;
        long j = ib8Var.e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jG >= jMin) {
            return true;
        }
        return !this.g && this.a.a() >= n();
    }

    public final int n() {
        Iterator it = this.i.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zn4) it.next()).b;
        }
        return i;
    }
}
