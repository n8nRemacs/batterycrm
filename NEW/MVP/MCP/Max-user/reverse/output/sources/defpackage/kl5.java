package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kl5 implements vld {
    public final v32 a = new v32(18);
    public final boolean b;
    public final boolean c;
    public final jdc d;
    public final int e;
    public final zt f;
    public final LogSessionId g;

    public kl5(boolean z, boolean z2, jdc jdcVar, int i, zt ztVar, LogSessionId logSessionId) {
        this.b = z;
        this.c = z2;
        this.d = jdcVar;
        this.e = i;
        this.f = ztVar;
        this.g = logSessionId;
    }

    @Override // defpackage.vld
    public final tk0[] b(Handler handler, yl5 yl5Var, yl5 yl5Var2, yl5 yl5Var3, yl5 yl5Var4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        zt ztVar = this.f;
        jdc jdcVar = this.d;
        if (!z) {
            arrayList.add(new vk5(jdcVar, this.a, ztVar, this.g));
        }
        if (!this.c) {
            arrayList.add(new xk5(jdcVar, this.e, this.a, ztVar, this.g));
        }
        return (tk0[]) arrayList.toArray(new tk0[0]);
    }
}
