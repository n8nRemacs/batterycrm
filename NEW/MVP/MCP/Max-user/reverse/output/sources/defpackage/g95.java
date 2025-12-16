package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g95 {
    public final k09 a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final t95 f;

    public g95(k09 k09Var, boolean z, boolean z2, long j, int i, t95 t95Var) {
        hsi.f("Audio and video cannot both be removed", (z && z2) ? false : true);
        if (c(k09Var)) {
            hsi.b(j != -9223372036854775807L);
            hsi.b(!z && t95Var.a.isEmpty());
        }
        this.a = k09Var;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
        this.f = t95Var;
    }

    public static boolean c(k09 k09Var) {
        return Objects.equals(k09Var.a, "androidx-media3-GapMediaItem");
    }

    public final f95 a() {
        f95 f95Var = new f95();
        f95Var.a = this.a;
        f95Var.b = this.b;
        f95Var.c = this.c;
        f95Var.d = this.d;
        f95Var.e = this.e;
        f95Var.f = this.f;
        return f95Var;
    }

    public final long b(long j) {
        long jF;
        boolean z = this.b;
        t95 t95Var = this.f;
        if (z) {
            jF = -9223372036854775807L;
        } else {
            t76 t76VarListIterator = t95Var.a.listIterator(0);
            jF = j;
            while (t76VarListIterator.hasNext()) {
                jF = ((l50) t76VarListIterator.next()).f(jF);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            t76 t76VarListIterator2 = t95Var.b.listIterator(0);
            while (t76VarListIterator2.hasNext()) {
                ((s95) t76VarListIterator2.next()).getClass();
            }
        }
        return Math.max(jF, j);
    }
}
