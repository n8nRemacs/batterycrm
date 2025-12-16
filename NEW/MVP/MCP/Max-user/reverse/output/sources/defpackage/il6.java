package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class il6 implements wq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    @Override // defpackage.wq
    public final void c() {
        switch (this.a) {
            case 0:
                s7c s7cVar = (s7c) this.b;
                pb3 pb3Var = (pb3) ((k18) s7cVar.a).getValue();
                long j = ((AtomicLong) ((usd) s7cVar.b).b).get();
                int i = (int) (j >>> 32);
                int i2 = (int) (j & 4294967295L);
                w4e w4eVar = (w4e) pb3Var;
                w4eVar.f0.O(w4eVar, w4e.m0[49], Float.valueOf(i2 == 0 ? 0.0f : (float) (i / i2)));
                break;
            default:
                ((gda) this.b).i = SystemClock.elapsedRealtime();
                gda.g((gda) this.b, f1e.APPLICATION_BACKGROUND);
                break;
        }
    }

    @Override // defpackage.wq
    public final void n() {
        switch (this.a) {
            case 0:
                break;
            default:
                gda gdaVar = (gda) this.b;
                if (gdaVar.i != 0) {
                    bef befVar = (bef) gdaVar.l.get();
                    String str = gdaVar.f;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "Navigation stats. Try update session id on warmStart, lastTime:" + gdaVar.i + "|lastCondition:" + befVar, null);
                        }
                    }
                    if (!gdaVar.e()) {
                        befVar.getClass();
                        if (befVar != bef.b && befVar != bef.c) {
                            svi.e(gdaVar.e, null, null, new dda(gdaVar, null), 3);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
