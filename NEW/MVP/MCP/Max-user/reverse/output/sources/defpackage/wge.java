package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class wge extends hge implements tsb, mf8 {
    public long X;
    public v08 Y;
    public final long b;
    public final long c;
    public final boolean d;
    public final String o = wge.class.getName();

    public wge(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.mf8
    public final void E() {
        wqi.c(this.o, "onServiceNotAvailable, fail task", new Object[0]);
        j().b(this);
        bwd.a(new vge(this, 0), new hfd(3, this), ((n0g) o()).a());
        bwd.b(this.Y);
        v();
    }

    @Override // defpackage.mf8
    public final void P(cf8 cf8Var) {
        int i;
        String str = this.o;
        wqi.c(str, "onLocation: %s", cf8Var);
        if (this.d) {
            w(cf8Var);
            return;
        }
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        ((lv4) igeVar.d.getValue()).getClass();
        if (SystemClock.elapsedRealtime() - this.X > 30000) {
            wqi.c(str, "onLocation: accuracy timeout reached, use minRequiredAccuracy", new Object[0]);
            i = HttpStatus.SC_MULTIPLE_CHOICES;
        } else {
            i = 30;
        }
        float f = cf8Var.d;
        if (f < i) {
            w(cf8Var);
        } else {
            wqi.c(str, "onLocation: accuracy %f is not enough, continue listening for location updates", Float.valueOf(f));
        }
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        si9 si9VarM = l().m(this.c);
        return (si9VarM == null || si9VarM.t0 == jm9.DELETED || !si9VarM.F()) ? 3 : 1;
    }

    @Override // defpackage.tsb
    public final void f() throws Throwable {
        wqi.c(this.o, "onMaxFailCount: remove task, mark message as error", new Object[0]);
        bwd.b(this.Y);
        si9 si9VarM = l().m(this.c);
        if (si9VarM != null) {
            l().t(si9VarM, xi9.Y);
            j().b(this);
            p().d(this.b);
        }
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.LocationRequest locationRequest = new Tasks.LocationRequest();
        locationRequest.requestId = this.b;
        locationRequest.messageId = this.c;
        locationRequest.liveLocation = this.d;
        return fl9.toByteArray(locationRequest);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.L0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.hge
    public final void u() {
        wy1.q(this.c, "Process request location for message: ", this.o);
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        ((lv4) igeVar.d.getValue()).getClass();
        this.X = SystemClock.elapsedRealtime();
        of8 of8VarJ = j();
        synchronized (of8VarJ.c) {
            of8VarJ.c.add(this);
        }
        bwd.b(this.Y);
        if (this.d) {
            return;
        }
        long j = 60000;
        vge vgeVar = new vge(this, 1);
        vgd vgdVar = new vgd(2, this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        yra yraVar = yra.a;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        r8j r8jVar = pdf.e;
        v08 v08Var = new v08(new ycd(2), vgdVar, pdf.d);
        try {
            try {
                yee yeeVar = new yee(new rra(v08Var, r8jVar, r8jVar, vgeVar));
                h0e h0eVarA = j0eVarA.a();
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                yraVar.a(new mra(yeeVar, j, h0eVarA));
                this.Y = v08Var;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                raj.c(th);
                t8j.a(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th2) {
            raj.c(th2);
            t8j.a(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    public final void v() {
        String str = this.o;
        wqi.c(str, "Reach max timeout", new Object[0]);
        j().b(this);
        p().d(this.b);
        qi9 qi9VarL = l();
        long j = this.c;
        si9 si9VarM = qi9VarL.m(j);
        if (si9VarM != null) {
            long j2 = si9VarM.Z;
            if (si9VarM.t0 == jm9.DELETED) {
                return;
            }
            w10 w10VarD = si9VarM.d(s10.w0);
            if (w10VarD == null) {
                wqi.e(str, "Reach max timeout: WTF, no location attach in message", null);
                qi9 qi9VarL2 = l();
                qi9VarL2.getClass();
                qi9VarL2.c(j2, Collections.singletonList(Long.valueOf(j)));
                r().c(new q4a(j2, Collections.singletonList(Long.valueOf(j)), null));
                return;
            }
            l().t(si9VarM, xi9.Y);
            l().q(si9VarM, w10VarD.r, p10.b);
            r().c(new itg(si9VarM.Z, this.c, false));
            wf8 wf8VarK = k();
            long j3 = si9VarM.Z;
            long j4 = si9VarM.c;
            wf8VarK.getClass();
        }
    }

    public final void w(cf8 cf8Var) {
        wqi.c(this.o, "onSuccess: %s", cf8Var);
        bwd.b(this.Y);
        j().b(this);
        bwd.a(new v64(this, 9, cf8Var), new ulc(3, this), (j0e) bwd.a.b);
    }
}
