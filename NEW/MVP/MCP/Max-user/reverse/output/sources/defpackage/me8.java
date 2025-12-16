package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class me8 implements Serializable {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean o;
    public final gsc s0;
    public final boolean t0;
    public final int u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;

    public me8(le8 le8Var) {
        this.a = le8Var.a;
        this.b = le8Var.b;
        this.c = le8Var.c;
        this.d = le8Var.d;
        this.o = le8Var.e;
        this.X = le8Var.f;
        this.Y = le8Var.g;
        this.Z = le8Var.h;
        this.s0 = le8Var.i;
        this.t0 = le8Var.j;
        this.u0 = le8Var.k;
        this.v0 = le8Var.l;
        this.w0 = le8Var.m;
        this.x0 = le8Var.n;
        this.y0 = le8Var.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || me8.class != obj.getClass()) {
            return false;
        }
        me8 me8Var = (me8) obj;
        return this.a == me8Var.a && this.b == me8Var.b && this.c == me8Var.c && this.d == me8Var.d && this.o == me8Var.o && this.X == me8Var.X && this.Y == me8Var.Y && this.Z == me8Var.Z && this.t0 == me8Var.t0 && this.u0 == me8Var.u0 && this.v0 == me8Var.v0 && this.w0 == me8Var.w0 && this.x0 == me8Var.x0 && this.y0 == me8Var.y0 && this.s0 == me8Var.s0;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.o), Boolean.valueOf(this.X), Boolean.valueOf(this.Y), Boolean.valueOf(this.Z), this.s0, Boolean.valueOf(this.t0), Integer.valueOf(this.u0), Boolean.valueOf(this.v0), Boolean.valueOf(this.w0), Boolean.valueOf(this.x0), Boolean.valueOf(this.y0));
    }

    public final String toString() {
        return "LocalMediaToolboxViewState{qualityButtonEnable=" + this.a + ", qualityTextVisibility=" + this.b + ", qualityProgressBarVisibility=" + this.c + ", multiSelect=" + this.d + ", videoControlsVisibility=" + this.o + ", videoSeekBarVisibility=" + this.X + ", cropVisibility=" + this.Y + ", editVisibility=" + this.Z + ", quality=" + this.s0 + ", isNumericCheckButtonEnabled=" + this.t0 + ", numberForNumericCheckButton=" + this.u0 + ", highlightCropButton=" + this.v0 + ", highlightEditButton=" + this.w0 + ", muteVideo=" + this.x0 + '}';
    }
}
