package defpackage;

import android.content.Context;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class q2e implements ke8 {
    public volatile ek6 X;
    public volatile boolean Y = false;
    public final p2e Z = new p2e(this, 2);
    public final y6d a;
    public final u44 b;
    public volatile boolean c;
    public mj6 d;
    public qj6 o;

    public q2e(EglBase.Context context, Context context2, y6d y6dVar, awd awdVar, btd btdVar) {
        u44 u44Var = new u44("SSSendControl");
        this.b = u44Var;
        this.a = y6dVar;
        u44Var.c(new j65(this, context, context2, awdVar, y6dVar, btdVar, 1));
    }

    @Override // defpackage.ke8
    public final void a(int i, int i2) {
        this.b.c(new vu0(this, i, i2, 3));
    }
}
