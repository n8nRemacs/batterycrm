package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.C22778f;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
@RestrictTo
/* loaded from: classes.dex */
public abstract class O {
    public static void d(View view, List list) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (list.get(i12) == view) {
                return;
            }
        }
        if (C22823h0.p(view) != null) {
            list.add(view);
        }
        for (int i13 = size; i13 < list.size(); i13++) {
            View view2 = (View) list.get(i13);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    int i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            if (list.get(i15) == childAt) {
                                break;
                            } else {
                                i15++;
                            }
                        } else if (C22823h0.p(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(@j.N View view, @j.N Object obj);

    public abstract void b(@j.N ArrayList arrayList, @j.N Object obj);

    public abstract void c(@j.N ViewGroup viewGroup, @j.P Object obj);

    public abstract boolean e(@j.N Object obj);

    public abstract Object f(@j.P Object obj);

    public abstract Object i(@j.P Object obj, @j.P Object obj2, @j.P Object obj3);

    public abstract Object j(@j.P Object obj, @j.P Object obj2);

    public abstract void k(@j.N Object obj, @j.N View view, @j.N ArrayList<View> arrayList);

    public abstract void l(@j.N Object obj, @j.P Object obj2, @j.P ArrayList arrayList, @j.P Object obj3, @j.P ArrayList arrayList2);

    public abstract void m(@j.P View view, @j.N Object obj);

    public abstract void n(@j.N Object obj, @j.N Rect rect);

    public void o(@j.N Object obj, @j.N C22778f c22778f, @j.N RunnableC22948f runnableC22948f) {
        runnableC22948f.run();
    }

    public abstract void p(@j.N Object obj, @j.N View view, @j.N ArrayList<View> arrayList);

    public abstract void q(@j.P Object obj, @j.P ArrayList<View> arrayList, @j.P ArrayList<View> arrayList2);

    public abstract Object r(@j.P Object obj);
}
