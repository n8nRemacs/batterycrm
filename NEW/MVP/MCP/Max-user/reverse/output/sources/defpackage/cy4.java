package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final class cy4 {
    public static ArrayList j;
    public static cy4 k;
    public static final ArrayList l = new ArrayList();
    public static final o6 m = new o6(1);
    public final int d;
    public int e;
    public int g;
    public boolean h;
    public final ArrayList a = new ArrayList(10);
    public final SparseIntArray b = new SparseIntArray();
    public final ArrayList c = new ArrayList(10);
    public final ue i = new ue(14, this);
    public final int f = by4.j.nextInt();

    public cy4(int i) {
        this.d = i;
    }

    public static void a(Runnable runnable, boolean z) {
        if (!ie.b()) {
            RLottie.getLogger().d(new RuntimeException("wrong thread"));
            return;
        }
        ArrayList arrayList = j;
        o6 o6Var = m;
        if (arrayList == null) {
            ArrayList arrayList2 = l;
            if (arrayList2.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) arrayList2.remove(arrayList2.size() - 1);
            }
            if (!z) {
                ie.d(o6Var);
            }
        }
        j.add(runnable);
        if (z) {
            ie.a.removeCallbacks(o6Var);
            o6Var.run();
        }
    }
}
