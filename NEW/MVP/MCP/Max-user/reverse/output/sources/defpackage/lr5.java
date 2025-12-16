package defpackage;

import java.util.List;
import java.util.Locale;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final /* synthetic */ class lr5 implements gu3, w89, y89, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lr5(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        int i2 = this.c;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                wqi.e("vr5", "onNotifMoved: failed to move id=" + j + " to position=" + i2, (Throwable) obj);
                ((vr5) obj2).g();
                break;
            case 1:
                Locale locale2 = Locale.ENGLISH;
                wqi.e("ps5", "onNotifMoved: failed to move id=" + j + " to position=" + i2, (Throwable) obj);
                ((ps5) obj2).f();
                break;
            default:
                yof yofVar = (yof) obj2;
                kb4 kb4Var = (kb4) obj;
                hsi.h(yofVar.h);
                byte[] bArrO = rha.o(kb4Var.a, kb4Var.c);
                umb umbVar = yofVar.c;
                umbVar.getClass();
                umbVar.H(bArrO.length, bArrO);
                yofVar.a.b(umbVar, bArrO.length, 0);
                long j2 = kb4Var.b;
                if (j2 == -9223372036854775807L) {
                    hsi.g(yofVar.h.s == BuildConfig.MAX_TIME_TO_UPLOAD);
                } else {
                    long j3 = yofVar.h.s;
                    j = j3 == BuildConfig.MAX_TIME_TO_UPLOAD ? j + j2 : j2 + j3;
                }
                yofVar.a.a(j, i2 | 1, bArrO.length, 0, null);
                break;
        }
    }

    @Override // defpackage.w89
    public void h(a5c a5cVar, u69 u69Var) {
        int iU = ((z89) this.d).U(u69Var, a5cVar, this.c);
        a5cVar.m0();
        a5cVar.a.E0(iU, this.b, false);
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        List list = (List) this.d;
        int i2 = this.c;
        return o79Var.r(u69Var, list, i2 == -1 ? o79Var.t.t() : i2, i2 == -1 ? o79Var.t.e() : this.b);
    }

    public /* synthetic */ lr5(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = j;
        this.c = i;
    }
}
