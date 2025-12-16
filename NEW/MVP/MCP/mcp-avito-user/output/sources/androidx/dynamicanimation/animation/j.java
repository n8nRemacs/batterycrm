package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.c;
import j.InterfaceC42167x;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public double f46050a;

    /* renamed from: b, reason: collision with root package name */
    public double f46051b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46052c;

    /* renamed from: d, reason: collision with root package name */
    public double f46053d;

    /* renamed from: e, reason: collision with root package name */
    public double f46054e;

    /* renamed from: f, reason: collision with root package name */
    public double f46055f;

    /* renamed from: g, reason: collision with root package name */
    public double f46056g;

    /* renamed from: h, reason: collision with root package name */
    public double f46057h;

    /* renamed from: i, reason: collision with root package name */
    public double f46058i;

    /* renamed from: j, reason: collision with root package name */
    public final c.p f46059j;

    public j() {
        this.f46050a = Math.sqrt(1500.0d);
        this.f46051b = 0.5d;
        this.f46052c = false;
        this.f46058i = Double.MAX_VALUE;
        this.f46059j = new c.p();
    }

    public final void a(@InterfaceC42167x float f12) {
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f46051b = f12;
        this.f46052c = false;
    }

    public final void b(@InterfaceC42167x float f12) {
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f46050a = Math.sqrt(f12);
        this.f46052c = false;
    }

    public final c.p c(double d12, double d13, long j12) {
        double dCos;
        double dPow;
        if (!this.f46052c) {
            if (this.f46058i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d14 = this.f46051b;
            if (d14 > 1.0d) {
                double d15 = this.f46050a;
                this.f46055f = (Math.sqrt((d14 * d14) - 1.0d) * d15) + ((-d14) * d15);
                double d16 = this.f46051b;
                double d17 = this.f46050a;
                this.f46056g = ((-d16) * d17) - (Math.sqrt((d16 * d16) - 1.0d) * d17);
            } else if (d14 >= 0.0d && d14 < 1.0d) {
                this.f46057h = Math.sqrt(1.0d - (d14 * d14)) * this.f46050a;
            }
            this.f46052c = true;
        }
        double d18 = j12 / 1000.0d;
        double d19 = d12 - this.f46058i;
        double d22 = this.f46051b;
        if (d22 > 1.0d) {
            double d23 = this.f46056g;
            double d24 = ((d23 * d19) - d13) / (d23 - this.f46055f);
            double d25 = d19 - d24;
            dPow = (Math.pow(2.718281828459045d, this.f46055f * d18) * d24) + (Math.pow(2.718281828459045d, d23 * d18) * d25);
            double d26 = this.f46056g;
            double dPow2 = Math.pow(2.718281828459045d, d26 * d18) * d25 * d26;
            double d27 = this.f46055f;
            dCos = (Math.pow(2.718281828459045d, d27 * d18) * d24 * d27) + dPow2;
        } else if (d22 == 1.0d) {
            double d28 = this.f46050a;
            double d29 = (d28 * d19) + d13;
            double d32 = (d29 * d18) + d19;
            double dPow3 = Math.pow(2.718281828459045d, (-d28) * d18) * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f46050a) * d18) * d32;
            double d33 = -this.f46050a;
            dCos = (Math.pow(2.718281828459045d, d33 * d18) * d29) + (dPow4 * d33);
            dPow = dPow3;
        } else {
            double d34 = 1.0d / this.f46057h;
            double d35 = this.f46050a;
            double d36 = ((d22 * d35 * d19) + d13) * d34;
            double dSin = ((Math.sin(this.f46057h * d18) * d36) + (Math.cos(this.f46057h * d18) * d19)) * Math.pow(2.718281828459045d, (-d22) * d35 * d18);
            double d37 = this.f46050a;
            double d38 = this.f46051b;
            double d39 = (-d37) * dSin * d38;
            double dPow5 = Math.pow(2.718281828459045d, (-d38) * d37 * d18);
            double d42 = this.f46057h;
            double dSin2 = Math.sin(d42 * d18) * (-d42) * d19;
            double d43 = this.f46057h;
            dCos = (((Math.cos(d43 * d18) * d36 * d43) + dSin2) * dPow5) + d39;
            dPow = dSin;
        }
        float f12 = (float) (dPow + this.f46058i);
        c.p pVar = this.f46059j;
        pVar.f46044a = f12;
        pVar.f46045b = (float) dCos;
        return pVar;
    }

    public j(float f12) {
        this.f46050a = Math.sqrt(1500.0d);
        this.f46051b = 0.5d;
        this.f46052c = false;
        this.f46058i = Double.MAX_VALUE;
        this.f46059j = new c.p();
        this.f46058i = f12;
    }
}
