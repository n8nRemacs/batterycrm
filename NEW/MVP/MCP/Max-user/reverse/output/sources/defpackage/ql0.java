package defpackage;

import android.os.SystemClock;
import android.util.Size;

/* loaded from: classes2.dex */
public final class ql0 implements jd5 {
    public final /* synthetic */ vgb a;

    public ql0(vgb vgbVar) {
        this.a = vgbVar;
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void k(vgb vgbVar, adh adhVar) {
        v3h v3hVar;
        vgb vgbVar2 = this.a;
        uld uldVar = vgbVar2.b;
        if (uldVar != null) {
            uldVar.g(vgbVar2, (adhVar == null || (v3hVar = (v3h) ((xy8) adhVar.c)) == null) ? null : (Size) v3hVar.j.getValue());
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void s(rl0 rl0Var, int i, int i2) {
        if (i2 != 3) {
            ((a9g) this.a.c.c).b();
            vgb vgbVar = this.a;
            vgbVar.b(((a9g) vgbVar.c.c).a());
        } else {
            a9g a9gVar = (a9g) this.a.c.c;
            synchronized (a9gVar) {
                if (a9gVar.d != -1) {
                    return;
                }
                a9gVar.d = SystemClock.elapsedRealtime();
                a9gVar.sendMessage(a9gVar.obtainMessage(1, a9gVar));
            }
        }
    }
}
