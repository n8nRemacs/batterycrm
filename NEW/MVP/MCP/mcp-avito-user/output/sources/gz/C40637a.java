package gZ;

import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.k;

/* compiled from: HorizontalWrapContentViewContainer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgZ/a;", "Landroid/widget/LinearLayout;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40637a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public View f396487b;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        super.onMeasure(i12, i13);
        if (getOrientation() == 0) {
            int childCount = getChildCount() - 1;
            int measuredWidth = 0;
            if (childCount >= 0) {
                i14 = 0;
                while (true) {
                    View childAt = getChildAt(i14);
                    int i15 = childAt.getLayoutParams().width;
                    if (childAt.getVisibility() != 0 || i15 != -2) {
                        if (i14 == childCount) {
                            break;
                        } else {
                            i14++;
                        }
                    } else {
                        break;
                    }
                }
                i14 = -1;
            } else {
                i14 = -1;
            }
            if (i14 >= 0) {
                View childAt2 = getChildAt(i14);
                if (getOrientation() == 0) {
                    int left = childAt2.getLeft();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = childAt2.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + left;
                    kotlin.ranges.l lVar = new kotlin.ranges.l(i14 + 1, getChildCount() - 1, 1);
                    ArrayList arrayList = new ArrayList(C42745f0.q(lVar, 10));
                    k it = lVar.iterator();
                    while (it.f406910d) {
                        arrayList.add(getChildAt(it.a()));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((View) next).getVisibility() == 0) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        View view = (View) it3.next();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        measuredWidth += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                    }
                    measuredWidth = (getMeasuredWidth() - (measuredWidth2 + measuredWidth)) - getPaddingRight();
                }
                if (measuredWidth < 0) {
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    layoutParams.width = childAt2.getMeasuredWidth() + measuredWidth;
                    childAt2.setLayoutParams(layoutParams);
                }
                this.f396487b = childAt2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@l View view) {
        super.removeView(view);
        if (L.f(view, this.f396487b)) {
            this.f396487b = null;
        }
    }
}
