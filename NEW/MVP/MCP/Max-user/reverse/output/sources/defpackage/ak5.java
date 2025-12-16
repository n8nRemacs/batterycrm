package defpackage;

/* loaded from: classes2.dex */
public final class ak5 implements t98 {
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int o;

    public ak5(String str, int i, long j, int i2, int i3, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.o = i3;
        this.X = z;
        this.Y = z2;
        this.Z = str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak5)) {
            return false;
        }
        ak5 ak5Var = (ak5) obj;
        return fni.a(this.a, ak5Var.a) && this.b == ak5Var.b && this.c == ak5Var.c && this.d == ak5Var.d && this.o == ak5Var.o && this.X == ak5Var.X && this.Y == ak5Var.Y;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Y) + a9h.b(xrf.k(this.o, xrf.k(this.d, a9h.a(xrf.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.X);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "ExecutorState(name=", this.a, ", numberOfIdleThreads=", ", completedTasksCount=");
        utb.n(sbM, this.c, ", activeTasksCount=", this.d);
        sbM.append(", tasksInQueue=");
        sbM.append(this.o);
        sbM.append(", shutdown=");
        sbM.append(this.X);
        return vb9.f(sbM, ", terminated=", this.Y, ")");
    }
}
