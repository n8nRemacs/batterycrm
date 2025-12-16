package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public final class naa extends i3 implements t39, s39, gdh {
    public final xd8 X;
    public final long Y;
    public long Z;
    public final FrgTrimVideo c;
    public final dd d;
    public final String o;
    public long s0;
    public long t0;
    public final lqc u0;
    public v08 v0;
    public v08 w0;
    public boolean x0;

    public naa(kba kbaVar, FrgTrimVideo frgTrimVideo, dd ddVar, String str, xd8 xd8Var, long j, long j2, boolean z) {
        super(0, kbaVar);
        this.u0 = new lqc();
        this.x0 = true;
        this.c = frgTrimVideo;
        this.d = ddVar;
        this.o = str;
        this.X = xd8Var;
        this.Z = j;
        this.s0 = j2;
        kbaVar.p(this);
        xd8Var.e = this;
        long jC = zpi.c(frgTrimVideo.v(), Uri.parse(str));
        this.Y = jC;
        xd8Var.k(new b4a(j, jC, Collections.singletonList(new z3a(0, str, 0, 0)), z), this);
        kbaVar.z(j, j, j2, jC);
        O0();
    }

    @Override // defpackage.gdh
    public final int B() {
        return this.X.f == null ? 0 : 2;
    }

    @Override // defpackage.i3
    public final void D0() {
        bwd.b(this.w0);
        this.w0 = null;
        this.X.g();
    }

    @Override // defpackage.gdh
    public final int F() {
        xd8 xd8Var = this.X;
        if (xd8Var.f == null) {
            return 0;
        }
        fl5 fl5Var = xd8Var.b;
        if (fl5Var.Y == null) {
            return 0;
        }
        return fl5Var.u0;
    }

    @Override // defpackage.t39
    public final void G() {
        wqi.c("naa", "onMediaPlayerControllerDetach", new Object[0]);
    }

    @Override // defpackage.gdh
    public final void J(Surface surface) {
        this.X.j(surface);
    }

    @Override // defpackage.t39
    public final void K(int i, int i2, int i3) {
        ((kba) ((oaa) this.b)).s0.d();
    }

    public final void L0() {
        if (this.v0 == null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j0e j0eVarA = de.a();
            lqc lqcVar = this.u0;
            lqcVar.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            ssa ssaVarL = new jta(lqcVar, 300L, timeUnit, j0eVarA).l(de.a());
            xd8 xd8Var = this.X;
            Objects.requireNonNull(xd8Var);
            xu9 xu9Var = new xu9(3, xd8Var);
            r8j r8jVar = pdf.e;
            kc3 kc3Var = pdf.f;
            jn6 jn6Var = pdf.d;
            v08 v08Var = new v08(r8jVar, kc3Var, jn6Var);
            try {
                ssaVarL.a(new rra(v08Var, xu9Var, r8jVar, jn6Var));
                this.v0 = v08Var;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                raj.c(th);
                t8j.a(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    @Override // defpackage.gdh
    public final int M() {
        xd8 xd8Var = this.X;
        if (xd8Var.f == null) {
            return 0;
        }
        return xd8Var.b.v0;
    }

    public final void M0() {
        D0();
        this.X.i(this.Z);
        kba kbaVar = (kba) ((oaa) this.b);
        kbaVar.x0.setPointerPosition(this.Z);
    }

    public final void N0() {
        bwd.b(this.v0);
        this.v0 = null;
    }

    public final void O0() {
        oaa oaaVar = (oaa) this.b;
        if (this.Z == 0 && this.s0 == this.Y) {
            ((kba) oaaVar).A(false);
        } else {
            ((kba) oaaVar).A(true);
        }
    }

    @Override // defpackage.t39
    public final void d() {
        M0();
    }

    @Override // defpackage.gdh
    public final int m() {
        xd8 xd8Var = this.X;
        if (xd8Var.f == null) {
            return 0;
        }
        fl5 fl5Var = xd8Var.b;
        if (fl5Var.Y == null) {
            return 0;
        }
        return fl5Var.t0;
    }

    @Override // defpackage.t39
    public final void o() {
        kba kbaVar = (kba) ((oaa) this.b);
        ((View) kbaVar.c).setKeepScreenOn(false);
        bwd.b(this.w0);
        this.w0 = null;
        kbaVar.t0.setVisibility(0);
        kbaVar.u0.setVisibility(4);
        kbaVar.B(true, this.X.d());
    }

    @Override // defpackage.t39
    public final void r() {
        kba kbaVar = (kba) ((oaa) this.b);
        ((View) kbaVar.c).setKeepScreenOn(true);
        kbaVar.u0.setVisibility(0);
        kbaVar.t0.setVisibility(4);
    }

    @Override // defpackage.t39
    public final void z(Throwable th) {
        int i = mvd.h2;
        FrgTrimVideo frgTrimVideo = this.c;
        Context contextV = frgTrimVideo.v();
        if (contextV != null) {
            efi.r(contextV, frgTrimVideo.y(i), 0);
        }
    }
}
