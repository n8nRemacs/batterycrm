package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class cj2 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Set set;
        switch (this.a) {
            case 0:
                ij2 ij2Var = (ij2) this.b;
                ij2Var.A.i(-1);
                ij2Var.C.i(-1);
                break;
            case 1:
                so3 so3Var = (so3) this.b;
                int iDiff = configuration.diff(so3Var.b);
                so3Var.b = new Configuration(configuration);
                ConcurrentHashMap concurrentHashMap = so3Var.a;
                for (Integer num : concurrentHashMap.keySet()) {
                    if ((num.intValue() & iDiff) != 0 && (set = (Set) concurrentHashMap.get(num)) != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((ro3) it.next()).a();
                        }
                    }
                }
                break;
            default:
                int i = configuration.uiMode & 48;
                kf3 kf3Var = i != 16 ? i != 32 ? kf3.c : kf3.b : kf3.a;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "SystemThemeObserver", "onConfigurationChanged scheme=" + kf3Var + ", uiMode=0x" + Integer.toHexString(configuration.uiMode & 48), null);
                    }
                }
                ((tcf) ((xpb) this.b).b).m(null, kf3Var);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                ij2 ij2Var = (ij2) this.b;
                ij2Var.A.i(-1);
                ij2Var.C.i(-1);
                break;
        }
    }

    public cj2(so3 so3Var, Context context) {
        this.a = 1;
        this.b = so3Var;
    }
}
