package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qsf implements SurfaceHolder.Callback {
    public boolean X = false;
    public boolean Y = false;
    public final /* synthetic */ rsf Z;
    public Size a;
    public msf b;
    public msf c;
    public nl d;
    public Size o;

    public qsf(rsf rsfVar) {
        this.Z = rsfVar;
    }

    public final void a() {
        if (this.b != null) {
            gri.a("SurfaceViewImpl", "Request canceled: " + this.b);
            this.b.d();
        }
    }

    public final boolean b() {
        rsf rsfVar = this.Z;
        Surface surface = rsfVar.e.getHolder().getSurface();
        if (this.X || this.b == null || !Objects.equals(this.a, this.o)) {
            return false;
        }
        gri.a("SurfaceViewImpl", "Surface set on Preview.");
        nl nlVar = this.d;
        msf msfVar = this.b;
        Objects.requireNonNull(msfVar);
        msfVar.b(surface, z7.d(rsfVar.e.getContext()), new s32(5, nlVar));
        this.X = true;
        rsfVar.a = true;
        rsfVar.i();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        gri.a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
        this.o = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        msf msfVar;
        gri.a("SurfaceViewImpl", "Surface created.");
        if (!this.Y || (msfVar = this.c) == null) {
            return;
        }
        msfVar.d();
        msfVar.j.b(null);
        this.c = null;
        this.Y = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        gri.a("SurfaceViewImpl", "Surface destroyed.");
        if (!this.X) {
            a();
        } else if (this.b != null) {
            gri.a("SurfaceViewImpl", "Surface closed " + this.b);
            this.b.l.a();
        }
        this.Y = true;
        msf msfVar = this.b;
        if (msfVar != null) {
            this.c = msfVar;
        }
        this.X = false;
        this.b = null;
        this.d = null;
        this.o = null;
        this.a = null;
    }
}
