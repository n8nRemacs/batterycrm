package defpackage;

/* loaded from: classes.dex */
public final class eof extends jve implements mcf {
    @Override // defpackage.mcf
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) kve.c(this.Z, (this.s0 + ((int) ((s() + this.u0) - this.s0))) - 1)).intValue());
        }
        return numValueOf;
    }

    public final void z(int i) {
        synchronized (this) {
            h(Integer.valueOf(((Number) kve.c(this.Z, (this.s0 + ((int) ((s() + this.u0) - this.s0))) - 1)).intValue() + i));
        }
    }
}
