package defpackage;

import ru.ok.tamtam.stats.LogController$AnalyticsDebugException;

/* loaded from: classes2.dex */
public final /* synthetic */ class bg8 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;

    public /* synthetic */ bg8(k18 k18Var, int i) {
        this.a = i;
        this.b = k18Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                wqi.b("LogController", "Failed to store event", th);
                ((y3b) ((yi5) this.b.getValue())).a(new LogController$AnalyticsDebugException("Error in log buffer", th));
                return qqg.a;
            default:
                return Boolean.valueOf(((qv3) this.b.getValue()).m(((Long) obj).longValue()));
        }
    }
}
