package defpackage;

import android.content.Context;
import java.util.Map;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public final /* synthetic */ class j65 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ j65(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
        this.X = obj5;
        this.Y = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((t86) this.b).c((n22) this.c, (n22) this.d, (dsf) this.o, (dsf) this.X, (Map.Entry) this.Y);
                break;
            default:
                q2e q2eVar = (q2e) this.b;
                EglBase.Context context = (EglBase.Context) this.c;
                Context context2 = (Context) this.d;
                awd awdVar = (awd) this.o;
                y6d y6dVar = (y6d) this.X;
                btd btdVar = (btd) this.Y;
                q2eVar.d = new mj6(context, context2, awdVar, y6dVar);
                q2eVar.o = new qj6(y6dVar, btdVar);
                q2eVar.X = new ek6();
                mj6 mj6Var = q2eVar.d;
                final qj6 qj6Var = q2eVar.o;
                mj6Var.Y = qj6Var;
                final ek6 ek6Var = q2eVar.X;
                final int i = 0;
                qj6Var.c.c(new Runnable() { // from class: oj6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                qj6Var.Y = ek6Var;
                                break;
                            default:
                                qj6Var.Z = ek6Var;
                                break;
                        }
                    }
                });
                final qj6 qj6Var2 = q2eVar.o;
                final ek6 ek6Var2 = q2eVar.X;
                final int i2 = 1;
                qj6Var2.c.c(new Runnable() { // from class: oj6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                qj6Var2.Y = ek6Var2;
                                break;
                            default:
                                qj6Var2.Z = ek6Var2;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
