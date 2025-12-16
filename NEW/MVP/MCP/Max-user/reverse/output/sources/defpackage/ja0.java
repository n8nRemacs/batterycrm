package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class ja0 implements qe7 {
    public final ryf a;
    public final long b;
    public final int c;
    public final Matrix d;

    public ja0(ryf ryfVar, long j, int i, Matrix matrix) {
        if (ryfVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.a = ryfVar;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.d = matrix;
    }

    @Override // defpackage.qe7
    public final int a() {
        return this.c;
    }

    @Override // defpackage.qe7
    public final Matrix b() {
        return this.d;
    }

    @Override // defpackage.qe7
    public final void d(gk5 gk5Var) {
        gk5Var.d(this.c);
    }

    @Override // defpackage.qe7
    public final ryf e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ja0) {
            ja0 ja0Var = (ja0) obj;
            if (this.a.equals(ja0Var.a) && this.b == ja0Var.b && this.c == ja0Var.c && this.d.equals(ja0Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qe7
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
