package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class yeg implements y6d {
    public final reg a;
    public final y6d b;

    public yeg(reg regVar, y6d y6dVar) {
        this.a = regVar;
        this.b = y6dVar;
    }

    @Override // defpackage.y6d
    public final void log(String str, String str2) {
        this.b.log(str, str2);
    }

    @Override // defpackage.y6d
    public final void logException(String str, String str2, Throwable th) {
        this.b.logException(str, str2, th);
    }

    @Override // defpackage.y6d
    public final void reportException(String str, String str2, Throwable th) {
        this.b.reportException(str, str2, th);
        reg regVar = this.a;
        regVar.getClass();
        try {
            ((keg) regVar.b.getValue()).a(null, th);
        } catch (Throwable th2) {
            Log.e("TracerLiteFacade", "Crash report failed", th2);
        }
    }
}
