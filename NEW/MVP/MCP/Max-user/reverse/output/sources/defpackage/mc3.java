package defpackage;

import android.util.CloseGuard;

/* loaded from: classes.dex */
public final class mc3 implements nc3 {
    public final CloseGuard a = new CloseGuard();

    @Override // defpackage.nc3
    public final void b() {
        this.a.warnIfOpen();
    }

    @Override // defpackage.nc3
    public final void c(String str) {
        this.a.open(str);
    }

    @Override // defpackage.nc3
    public final void close() {
        this.a.close();
    }
}
