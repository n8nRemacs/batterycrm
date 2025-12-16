package defpackage;

import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class bjd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cjd b;

    public /* synthetic */ bjd(cjd cjdVar, int i) {
        this.a = i;
        this.b = cjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((ejd) sparseArray.valueAt(i)).getClass();
                    ejd.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                cjd cjdVar = this.b;
                hjd hjdVar = cjdVar.i;
                if (hjdVar.x0 == cjdVar) {
                    if (hjd.A0) {
                        Log.d("MediaRouteProviderProxy", hjdVar + ": Service connection died");
                    }
                    hjdVar.k();
                    break;
                }
                break;
        }
    }
}
