package androidx.media3.exoplayer.hls;

import defpackage.b6a;
import defpackage.b99;
import defpackage.bn4;
import defpackage.dm4;
import defpackage.jbe;
import defpackage.k09;
import defpackage.k55;
import defpackage.k57;
import defpackage.kc3;
import defpackage.oe4;
import defpackage.te8;
import defpackage.tha;
import defpackage.w57;
import defpackage.wm4;
import defpackage.xo8;
import defpackage.y6i;
import java.util.List;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements b99 {
    public final y6i a;
    public wm4 b;
    public jbe c;
    public w57 e;
    public final kc3 g;
    public final tha i;
    public final te8 h = new te8();
    public final dm4 f = bn4.A0;
    public final int k = 1;
    public final long l = -9223372036854775807L;
    public final boolean j = true;
    public boolean d = true;

    public HlsMediaSource$Factory(oe4 oe4Var) {
        this.a = new y6i(13, oe4Var);
        int i = 18;
        this.e = new b6a(i);
        this.i = new tha(i);
        this.g = new kc3(i);
    }

    @Override // defpackage.b99
    public final void b(jbe jbeVar) {
        this.c = jbeVar;
    }

    @Override // defpackage.b99
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k57 a(k09 k09Var) {
        k09Var.b.getClass();
        if (this.b == null) {
            wm4 wm4Var = new wm4();
            wm4Var.a = new jbe(18);
            this.b = wm4Var;
        }
        jbe jbeVar = this.c;
        if (jbeVar != null) {
            this.b.a = jbeVar;
        }
        wm4 wm4Var2 = this.b;
        wm4Var2.b = this.d;
        wm4Var2.getClass();
        w57 xo8Var = this.e;
        List list = k09Var.b.e;
        if (!list.isEmpty()) {
            xo8Var = new xo8(xo8Var, 18, list);
        }
        k55 k55VarQ = this.h.q(k09Var);
        this.f.getClass();
        y6i y6iVar = this.a;
        tha thaVar = this.i;
        return new k57(k09Var, y6iVar, wm4Var2, this.g, k55VarQ, thaVar, new bn4(y6iVar, thaVar, xo8Var), this.l, this.j, this.k);
    }

    @Override // defpackage.b99
    public final void d(boolean z) {
        this.d = z;
    }

    @Override // defpackage.b99
    public final void f() {
    }
}
