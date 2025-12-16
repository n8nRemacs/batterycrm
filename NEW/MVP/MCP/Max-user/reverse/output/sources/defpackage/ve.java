package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.animated.gif.GifImage;

/* loaded from: classes.dex */
public final class ve extends Drawable implements Animatable, g45 {
    public static final kk4 z0 = new kk4(14);
    public long X;
    public int Y;
    public long Z;
    public final ag a;
    public final v32 b;
    public volatile boolean c;
    public long d;
    public long o;
    public long s0;
    public int t0;
    public int v0;
    public x35 x0;
    public final long u0 = 8;
    public volatile kk4 w0 = z0;
    public final ue y0 = new ue(0, this);

    public ve(ag agVar) {
        this.a = agVar;
        this.b = new v32(agVar);
    }

    @Override // defpackage.g45
    public final void a() {
        ag agVar = this.a;
        if (agVar != null) {
            ((uo0) agVar.c).a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws Throwable {
        long j;
        hk4 hk4Var;
        cp0 cp0Var;
        if (this.a == null || this.b == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMax = this.c ? jUptimeMillis - this.d : (long) Math.max(this.o, 0.0d);
        v32 v32Var = this.b;
        ag agVar = (ag) v32Var.c;
        long jY = v32Var.Y();
        long jB = 0;
        int iA = 0;
        if (jY == 0) {
            long jB2 = 0;
            while (true) {
                jB2 += agVar.b(iA);
                int i = iA + 1;
                if (0 < jB2) {
                    break;
                } else {
                    iA = i;
                }
            }
        } else if (agVar.c() != 0 && jMax / jY >= agVar.c()) {
            iA = -1;
        } else {
            while (true) {
                jB += agVar.b(iA);
                int i2 = iA + 1;
                if (jMax % jY < jB) {
                    break;
                } else {
                    iA = i2;
                }
            }
        }
        if (iA == -1) {
            iA = this.a.a() - 1;
            this.w0.getClass();
            this.c = false;
        } else if (iA == 0 && this.Y != -1 && jUptimeMillis >= this.X) {
            this.w0.getClass();
        }
        ag agVar2 = this.a;
        agVar2.b = ((d2a) agVar2.e).now();
        uo0 uo0Var = (uo0) agVar2.c;
        boolean zC = uo0Var.c(canvas, iA, 0);
        if (!uo0Var.e && (hk4Var = uo0Var.g) != null && (cp0Var = uo0Var.f) != null) {
            cp0Var.h(hk4Var, uo0Var.b, uo0Var, iA);
        }
        boolean z = zC;
        agVar2.d();
        if (z) {
            this.w0.getClass();
            this.Y = iA;
        }
        if (!z) {
            this.v0++;
            if (op5.a.h(2)) {
                op5.d(ve.class, Integer.valueOf(this.v0), "Dropped a frame. Count: %s");
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.c) {
            v32 v32Var2 = this.b;
            long j2 = jUptimeMillis2 - this.d;
            ag agVar3 = (ag) v32Var2.c;
            long jY2 = v32Var2.Y();
            long jB3 = 0;
            if (jY2 != 0 && (agVar3.c() == 0 || j2 / jY2 < agVar3.c())) {
                long j3 = j2 % jY2;
                int iA2 = agVar3.a();
                for (int i3 = 0; i3 < iA2 && jB3 <= j3; i3++) {
                    jB3 += agVar3.b(i3);
                }
                j = j2 + (jB3 - j3);
            } else {
                j = -1;
            }
            if (j != -1) {
                long j4 = this.d + j + this.u0;
                this.X = j4;
                scheduleSelf(this.y0, j4);
            } else {
                this.w0.getClass();
                this.c = false;
            }
        }
        this.o = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        ag agVar = this.a;
        return agVar != null ? ((uo0) agVar.c).l : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        ag agVar = this.a;
        return agVar != null ? ((uo0) agVar.c).k : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ag agVar = this.a;
        if (agVar != null) {
            uo0 uo0Var = (uo0) agVar.c;
            uo0Var.j = rect;
            we weVar = uo0Var.d;
            fs3 fs3Var = (fs3) weVar.c;
            if (!fs3.d((GifImage) fs3Var.e, rect).equals((Rect) fs3Var.f)) {
                fs3Var = new fs3((kk4) fs3Var.c, (ywf) fs3Var.d, rect, fs3Var.b);
            }
            if (fs3Var != ((fs3) weVar.c)) {
                weVar.c = fs3Var;
                weVar.d = new dl6(fs3Var, weVar.a, (ukd) weVar.o);
            }
            uo0Var.d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.c) {
            return false;
        }
        long j = i;
        if (this.o == j) {
            return false;
        }
        this.o = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.x0 == null) {
            this.x0 = new x35();
        }
        this.x0.a = i;
        ag agVar = this.a;
        if (agVar != null) {
            ((uo0) agVar.c).i.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.x0 == null) {
            this.x0 = new x35();
        }
        x35 x35Var = this.x0;
        x35Var.e = colorFilter;
        x35Var.d = colorFilter != null;
        ag agVar = this.a;
        if (agVar != null) {
            ((uo0) agVar.c).i.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ag agVar;
        if (this.c || (agVar = this.a) == null || agVar.a() <= 1) {
            return;
        }
        this.c = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.Z;
        this.d = j;
        this.X = j;
        this.o = jUptimeMillis - this.s0;
        this.Y = this.t0;
        invalidateSelf();
        this.w0.getClass();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.Z = jUptimeMillis - this.d;
            this.s0 = jUptimeMillis - this.o;
            this.t0 = this.Y;
            this.c = false;
            this.d = 0L;
            this.X = 0L;
            this.o = -1L;
            this.Y = -1;
            unscheduleSelf(this.y0);
            this.w0.getClass();
        }
    }
}
