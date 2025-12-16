package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c74 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c74(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) obj).C0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            case 1:
                int i2 = FastScroller.A0;
                ((FastScroller) obj).b();
                break;
            default:
                v3b v3bVar = (v3b) obj;
                mcf mcfVar = v3bVar.a.a;
                WeakHashMap weakHashMap = v3bVar.b;
                boolean z = view2 instanceof TextView;
                qqg qqgVar = qqg.a;
                if (!z) {
                    if (view2 instanceof be6) {
                        weakHashMap.put(view2, qqgVar);
                        ((be6) view2).a((t75) mcfVar.getValue());
                        break;
                    }
                } else {
                    weakHashMap.put(view2, qqgVar);
                    TextView textView = (TextView) view2;
                    t75 t75Var = (t75) mcfVar.getValue();
                    Object tag = textView.getTag(z9b.a);
                    t5g t5gVar = tag instanceof t5g ? (t5g) tag : null;
                    if (t5gVar != null) {
                        t5gVar.b(textView, t75Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.C0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
            case 1:
                int i2 = FastScroller.A0;
                ((FastScroller) obj).b();
                break;
            default:
                v3b v3bVar = (v3b) obj;
                v3bVar.getClass();
                if ((view2 instanceof TextView) || (view2 instanceof be6)) {
                    v3bVar.b.remove(view2);
                    break;
                }
                break;
        }
    }
}
