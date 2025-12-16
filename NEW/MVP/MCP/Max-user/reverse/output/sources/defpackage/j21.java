package defpackage;

import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* loaded from: classes2.dex */
public final /* synthetic */ class j21 implements EventQueueCollector.IdleStateProvider, gu3, pa8, oa8, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ j21(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                rv3 rv3Var = (rv3) obj;
                int i = rv3Var.m;
                rv3Var.m = this.b ? i | 1 : i & (-2);
                break;
            case 2:
            case 3:
            case 4:
            default:
                ((a5c) obj).k0(this.b);
                break;
            case 5:
                x00 x00Var = (x00) obj;
                if (!this.b) {
                    x00Var.i = p10.a;
                    break;
                } else {
                    x00Var.i = p10.d;
                    break;
                }
            case 6:
                a5c a5cVar = (a5c) obj;
                a5cVar.m0();
                a5cVar.a.o1(this.b);
                break;
            case 7:
                ((a5c) obj).f0(this.b);
                break;
        }
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((r3c) obj).T(this.b);
                break;
            case 3:
                ((r3c) obj).m(this.b);
                break;
            default:
                ((q3c) obj).m(this.b);
                break;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector.IdleStateProvider
    public boolean isIdle() {
        return CallAnalyticsSender.setIdle$lambda$0(this.b);
    }
}
