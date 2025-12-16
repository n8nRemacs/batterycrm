package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class n1c implements ComponentCallbacks, v26 {
    public final w1c a;

    public n1c(Context context, f28 f28Var, lv4 lv4Var, zg zgVar, qi9 qi9Var, i5i i5iVar, w1c w1cVar, tw0 tw0Var, ve2 ve2Var) {
        new HashSet();
        this.a = w1cVar;
        new k1c(context, this);
        rw4.a();
        context.registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @vnf
    public void onEvent(q4a q4aVar) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @vnf
    public void onEvent(vi2 vi2Var) {
    }

    @vnf
    public void onEvent(n73 n73Var) {
    }
}
