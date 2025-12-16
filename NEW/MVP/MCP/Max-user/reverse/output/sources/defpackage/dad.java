package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class dad extends bid {
    public final RecyclerView a;
    public final k9d b;
    public final fr7 c;
    public final String d = dad.class.getName();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedList f = new LinkedList();
    public boolean g;

    public dad(EndlessRecyclerView2 endlessRecyclerView2, k9d k9dVar, fr7 fr7Var) {
        this.a = endlessRecyclerView2;
        this.b = k9dVar;
        this.c = fr7Var;
    }

    public static final void c(dad dadVar, String str, long j, Rect rect) {
        String str2 = dadVar.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, vb9.e(j, "Play message "), null);
            }
        }
        RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
        RLottieDrawable rLottieDrawableCreateByUrl$default = RLottieFactory.createByUrl$default(str, kti.d(t9d.b.getWidth() * vw4.d().getDisplayMetrics().density), kti.d(t9d.b.getHeight() * vw4.d().getDisplayMetrics().density), false, false, true, false, true, false, 72, null);
        rLottieDrawableCreateByUrl$default.setAutoRepeat(0);
        dadVar.b.a(j, rLottieDrawableCreateByUrl$default, rect);
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.setScrollOffset(-i2);
        if (!this.g) {
            f(false);
        } else {
            this.g = false;
            mgb.a(recyclerView, new r98(16, recyclerView, this));
        }
    }

    public final void d(long j, x8d x8dVar, String str) {
        String str2 = this.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "Add reaction effect, reaction:" + ((Object) x8dVar) + ", " + j, null);
            }
        }
        this.e.add(new z9d(j, x8dVar, str));
    }

    public final boolean e(int i) {
        RecyclerView recyclerView = this.a;
        LinearLayoutManager linearLayoutManagerE = x7j.e(recyclerView);
        int iX0 = linearLayoutManagerE != null ? linearLayoutManagerE.X0() : -1;
        LinearLayoutManager linearLayoutManagerE2 = x7j.e(recyclerView);
        return i == -1 || iX0 > i || i > (linearLayoutManagerE2 != null ? linearLayoutManagerE2.Z0() : -1);
    }

    public final void f(boolean z) {
        long jLongValue;
        mid midVarN;
        Object next;
        LinkedList linkedList = this.f;
        Long l = (Long) linkedList.peek();
        if (l == null || (midVarN = this.a.N((jLongValue = l.longValue()))) == null) {
            return;
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((z9d) next).a == jLongValue) {
                    break;
                }
            }
        }
        z9d z9dVar = (z9d) next;
        if (z9dVar == null) {
            linkedList.remove(l);
        } else {
            RecyclerView recyclerView = this.a;
            mgb.a(recyclerView, new bad(recyclerView, this, midVarN, jLongValue, z9dVar, z));
        }
    }
}
