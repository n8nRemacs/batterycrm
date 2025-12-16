package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class rih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tih b;

    public /* synthetic */ rih(tih tihVar, int i) {
        this.a = i;
        this.b = tihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = true;
        tih tihVar = this.b;
        switch (i) {
            case 0:
                bac.s0.X.a(tihVar.m);
                break;
            case 1:
                ((uih) tihVar.a.getValue()).a();
                jzf jzfVar = (jzf) tihVar.c.getValue();
                jzfVar.getClass();
                wqi.c("jzf", "syncAll", new Object[0]);
                jzfVar.e.b(new dj(jzfVar, Collections.EMPTY_LIST, z, 4));
                break;
            default:
                uih uihVar = (uih) tihVar.a.getValue();
                qsb qsbVar = (qsb) tihVar.e.getValue();
                String[] strArr = qsb.d;
                String str = strArr[0];
                if (((SharedPreferences) ((bwf) qsbVar.c.c).getValue()).getBoolean(str, false) || z7.b(qsbVar.a, str) != 0) {
                    z = false;
                } else {
                    wqi.c("tih", "forceContactsSync", new Object[0]);
                    ssb ssbVar = qsbVar.c;
                    boolean zC = qsbVar.c(qsb.f);
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) ((bwf) ssbVar.c).getValue()).edit();
                    editorEdit.putBoolean(strArr[0], zC);
                    editorEdit.apply();
                }
                uihVar.b(z);
                break;
        }
    }
}
