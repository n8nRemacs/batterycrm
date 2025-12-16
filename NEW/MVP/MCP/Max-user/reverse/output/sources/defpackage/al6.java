package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class al6 implements io7 {
    public final /* synthetic */ AtomicBoolean a;

    public al6(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        bwf bwfVarD = w5Var.d(32);
        AtomicBoolean atomicBoolean = this.a;
        return new ed8(new r5g("Fresco Debug"), new o91(0, atomicBoolean, AtomicBoolean.class, "get", "get()Z", 0, 17), new hu1(atomicBoolean, 4, bwfVarD), ivd.v0, 16);
    }
}
