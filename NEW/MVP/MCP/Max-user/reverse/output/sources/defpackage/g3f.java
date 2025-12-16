package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g3f extends ck0 {
    public final ze4 h;
    public final oe4 i;
    public final hf6 j;
    public final tha l;
    public final y2f n;
    public final k09 o;
    public wgg p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public g3f(g09 g09Var, oe4 oe4Var, tha thaVar) {
        a09 a09Var;
        this.i = oe4Var;
        this.l = thaVar;
        boolean z = true;
        oz8 oz8Var = new oz8();
        uz8 uz8Var = new uz8();
        List list = Collections.EMPTY_LIST;
        zjd zjdVar = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        Uri uri = Uri.EMPTY;
        String string = g09Var.a.toString();
        string.getClass();
        wg7 wg7VarJ = wg7.j(wg7.m(g09Var));
        if (uz8Var.b != null && uz8Var.a == null) {
            z = false;
        }
        hsi.g(z);
        if (uri != null) {
            a09Var = new a09(uri, null, uz8Var.a != null ? new vz8(uz8Var) : null, null, list, null, wg7VarJ, -9223372036854775807L);
        } else {
            a09Var = null;
        }
        k09 k09Var = new k09(string, new sz8(oz8Var), a09Var, new yz8(wz8Var), w19.K, d09Var);
        this.o = k09Var;
        ff6 ff6Var = new ff6();
        String str = g09Var.b;
        ff6Var.m = xz9.n(str == null ? "text/x-unknown" : str);
        ff6Var.d = g09Var.c;
        ff6Var.e = g09Var.d;
        ff6Var.f = g09Var.e;
        ff6Var.b = g09Var.f;
        String str2 = g09Var.g;
        ff6Var.a = str2 != null ? str2 : null;
        this.j = new hf6(ff6Var);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = g09Var.a;
        hsi.i(uri2, "The uri must be set.");
        this.h = new ze4(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.n = new y2f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k09Var, null);
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        return new f3f(this.h, this.i, this.p, this.j, this.k, this.l, b(d99Var), this.m, null);
    }

    @Override // defpackage.ck0
    public final k09 i() {
        return this.o;
    }

    @Override // defpackage.ck0
    public final void k() {
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.p = wggVar;
        n(this.n);
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        ((f3f) p29Var).s0.D(null);
    }

    @Override // defpackage.ck0
    public final void q() {
    }
}
