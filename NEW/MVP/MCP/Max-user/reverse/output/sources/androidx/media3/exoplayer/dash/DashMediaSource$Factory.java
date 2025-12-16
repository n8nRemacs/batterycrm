package androidx.media3.exoplayer.dash;

import androidx.work.WorkRequest;
import defpackage.b99;
import defpackage.bd4;
import defpackage.fd4;
import defpackage.jbe;
import defpackage.k09;
import defpackage.kc3;
import defpackage.lk6;
import defpackage.oe4;
import defpackage.py0;
import defpackage.sd4;
import defpackage.tc4;
import defpackage.te8;
import defpackage.tha;
import defpackage.xmb;
import java.util.List;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements b99 {
    public final tc4 a;
    public final oe4 b;
    public final te8 c;
    public final kc3 d;
    public tha e;
    public final long f;
    public final long g;
    public bd4 h;

    public DashMediaSource$Factory(oe4 oe4Var) {
        this(new lk6(oe4Var), oe4Var);
    }

    @Override // defpackage.b99
    public final void b(jbe jbeVar) {
        this.a.b(jbeVar);
    }

    @Override // defpackage.b99
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final sd4 a(k09 k09Var) {
        k09Var.b.getClass();
        xmb fd4Var = this.h;
        if (fd4Var == null) {
            fd4Var = new fd4();
        }
        List list = k09Var.b.e;
        return new sd4(k09Var, this.b, !list.isEmpty() ? new py0(fd4Var, 16, list) : fd4Var, this.a, this.d, this.c.q(k09Var), this.e, this.f, this.g);
    }

    @Override // defpackage.b99
    public final void d(boolean z) {
        this.a.d(z);
    }

    @Override // defpackage.b99
    public final void f() {
        this.a.f();
    }

    public DashMediaSource$Factory(tc4 tc4Var, oe4 oe4Var) {
        this.a = tc4Var;
        this.b = oe4Var;
        this.c = new te8();
        this.e = new tha(18);
        this.f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.g = 5000000L;
        this.d = new kc3(18);
        tc4Var.d(true);
    }
}
