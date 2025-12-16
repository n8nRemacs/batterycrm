package defpackage;

import android.media.metrics.LogSessionId;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ich {
    public final cd3 a;
    public final hf6 b;
    public final wg7 c;
    public final List d;
    public final chg e;
    public final w86 f;
    public final String g;
    public final int h;
    public final LogSessionId i;
    public esf j;
    public volatile sk4 k;
    public volatile int l;
    public volatile boolean m;

    public ich(cd3 cd3Var, hf6 hf6Var, wg7 wg7Var, wg7 wg7Var2, chg chgVar, w86 w86Var, LogSessionId logSessionId) {
        gf3 gf3Var = hf6Var.D;
        hsi.b(gf3Var != null);
        this.a = cd3Var;
        this.b = hf6Var;
        this.c = wg7Var;
        this.d = wg7Var2;
        this.e = chgVar;
        this.f = w86Var;
        this.i = logSessionId;
        String str = hf6Var.n;
        str.getClass();
        String str2 = chgVar.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (xz9.k(str)) {
            str = "video/hevc";
        }
        int i = chgVar.d;
        if (i != 0 || !gf3.h(gf3Var) || !ff5.f(str, gf3Var).isEmpty()) {
            str3 = str;
        } else if (ff5.f("video/hevc", gf3Var).isEmpty()) {
            i = 2;
            str3 = str;
        }
        Pair pairCreate = Pair.create(str3, Integer.valueOf(i));
        this.g = (String) pairCreate.first;
        this.h = ((Integer) pairCreate.second).intValue();
    }

    public final esf a(int i, int i2) {
        gf3 gf3Var;
        if (this.m) {
            return null;
        }
        esf esfVar = this.j;
        if (esfVar != null) {
            return esfVar;
        }
        if (i < i2) {
            this.l = 90;
            i2 = i;
            i = i2;
        }
        if (this.b.z % 180 == this.l % 180) {
            this.l = this.b.z;
        }
        if (!this.c.contains(Integer.valueOf(this.l))) {
            int i3 = (this.l + 180) % 360;
            if (this.c.contains(Integer.valueOf(i3))) {
                this.l = i3;
            } else {
                this.l = ((Integer) this.c.get(0)).intValue();
                int i4 = i2;
                i2 = i;
                i = i4;
            }
        }
        ff6 ff6Var = new ff6();
        ff6Var.t = i;
        ff6Var.u = i2;
        ff6Var.y = 0;
        ff6Var.x = this.b.y;
        ff6Var.m = xz9.n(this.g);
        hf6 hf6Var = this.b;
        if ((!gf3.h(hf6Var.D) || this.h == 0) && !gf3.i.equals(hf6Var.D)) {
            gf3Var = hf6Var.D;
            gf3Var.getClass();
        } else {
            gf3Var = gf3.h;
        }
        ff6Var.C = gf3Var;
        ff6Var.j = this.b.k;
        hf6 hf6Var2 = new hf6(ff6Var);
        cd3 cd3Var = this.a;
        ff6 ff6VarA = hf6Var2.a();
        ff6VarA.m = xz9.n(bxd.i(hf6Var2, this.d));
        this.k = cd3Var.k(new hf6(ff6VarA), this.i);
        hf6 hf6Var3 = this.k.c;
        w86 w86Var = this.f;
        chg chgVar = this.e;
        boolean z = this.l != 0;
        int i5 = this.h;
        ft0 ft0VarA = chgVar.a();
        if (chgVar.d != i5) {
            ft0VarA.b = i5;
        }
        if (!Objects.equals(hf6Var2.n, hf6Var3.n)) {
            ft0VarA.c(hf6Var3.n);
        }
        if (z) {
            int i6 = hf6Var2.u;
            int i7 = hf6Var3.u;
            if (i6 != i7) {
                ft0VarA.a = i7;
            }
        } else {
            int i8 = hf6Var2.v;
            int i9 = hf6Var3.v;
            if (i8 != i9) {
                ft0VarA.a = i9;
            }
        }
        w86Var.f(ft0VarA.a());
        Surface surface = this.k.e;
        hsi.h(surface);
        this.j = new esf(surface, hf6Var3.u, hf6Var3.v, this.l, true);
        if (this.m) {
            this.k.i();
        }
        return this.j;
    }

    public final void b() throws InterruptedException, ExportException {
        if (this.k != null) {
            sk4 sk4Var = this.k;
            if (!sk4Var.i.get()) {
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            LinkedHashMap linkedHashMap = ah4.a;
            try {
                synchronized (ah4.class) {
                    synchronized (ah4.class) {
                    }
                    sk4Var.d.signalEndOfInputStream();
                }
                sk4Var.d.signalEndOfInputStream();
            } catch (RuntimeException e) {
                a8i.f("DefaultCodec", "MediaCodec error", e);
                throw sk4Var.b(e);
            }
        }
    }
}
