package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class w7d extends LinearLayout {
    public u7d a;
    public int b;
    public List c;

    private final void setDataList(List<v7d> list) {
        int size = list.size();
        int i = this.b;
        if (size <= i) {
            this.c = list;
            a();
            return;
        }
        this.c = ue3.Y(list, i);
        a();
        wqi.e(w7d.class.getName(), "Buttons count out of limit. Size -> " + list.size(), null);
    }

    private final void setMaxButtonsCount(int i) {
        if (i < 1) {
            return;
        }
        this.b = i;
        requestLayout();
    }

    public final void a() {
        if (getChildCount() < this.c.size()) {
            int size = this.c.size() - getChildCount();
            for (int i = 0; i < size; i++) {
                t7d t7dVar = new t7d(getContext());
                t7dVar.setId(View.generateViewId());
                addView(t7dVar);
            }
        }
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                int i3 = 0;
                for (Object obj : this.c) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        ve3.p();
                        throw null;
                    }
                    v7d v7dVar = (v7d) obj;
                    t7d t7dVar2 = (t7d) getChildAt(i3);
                    t7dVar2.setId(v7dVar.a);
                    t7dVar2.setVisibility(0);
                    t7dVar2.setSize(s7d.b);
                    t7dVar2.setEnabled(v7dVar.c);
                    t7dVar2.setImage(v7dVar.b);
                    f8j.d(t7dVar2, 300L, new kg6(this, 25, v7dVar));
                    ViewGroup.LayoutParams layoutParams = t7dVar2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (i3 != 0) {
                        marginLayoutParams.setMarginStart(kti.d(40 * vw4.d().getDisplayMetrics().density));
                        t7dVar2.setLayoutParams(marginLayoutParams);
                    }
                    i3 = i4;
                }
                return;
            }
            int i5 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            childAt.setVisibility(8);
            i2 = i5;
        }
    }

    public final void setButtonToolDataList(List<v7d> list) {
        setDataList(list);
    }

    public final void setListener(u7d u7dVar) {
        this.a = u7dVar;
    }
}
