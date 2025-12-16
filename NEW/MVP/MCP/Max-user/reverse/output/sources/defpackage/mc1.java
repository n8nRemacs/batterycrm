package defpackage;

import android.content.Context;
import android.graphics.PointF;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* loaded from: classes.dex */
public final class mc1 implements lc1, er1 {
    public final k18 a;
    public final PointF b;
    public final Object c;

    public mc1(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.c = ipi.b(3, new nz(k18Var, 4));
        ((ax1) k18Var2.getValue()).d(this);
        this.b = mfh.e((Context) k18Var.getValue());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        PointF pointFE = mfh.e((Context) this.a.getValue());
        float f = pointFE.x;
        PointF pointF = this.b;
        pointF.x = f;
        pointF.y = pointFE.y;
    }
}
