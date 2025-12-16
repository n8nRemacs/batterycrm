package com.avito.android.lib.design.docking_badge;

import LV.b;
import X41.j;
import Y61.k;
import Y61.l;
import aV.C19818a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22829k0;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.docking_badge.a;
import com.avito.android.lib.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DockingBadgeContainer.kt */
@s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeContainer;", "Landroid/view/ViewGroup;", "LLV/b;", "LaV/a;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "size", "Lkotlin/G0;", "setSize", "(Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)V", "", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeItem;", "badges", "setBadgeItems", "(Ljava/util/List;)V", "", "number", "setNumberOfLines", "(I)V", "newState", "setState", "(LaV/a;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DockingBadgeContainer extends ViewGroup implements b<C19818a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public DockingBadgeSize f179120b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public C19818a f179121c;

    /* renamed from: d, reason: collision with root package name */
    public int f179122d;

    @j
    public DockingBadgeContainer(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = 0;
        if (this.f179122d == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        Iterator<View> it = new C22829k0(this).iterator();
        while (it.hasNext()) {
            View next = it.next();
            int i17 = this.f179122d;
            if (1 <= i17 && i17 <= i16) {
                return;
            }
            if (next.getVisibility() == 0) {
                if (next.getMeasuredWidth() + paddingStart > getWidth() - getPaddingEnd()) {
                    paddingStart = getPaddingStart();
                    i16++;
                    paddingTop = next.getMeasuredHeight() + this.f179121c.f20902b + paddingTop;
                }
                DockingBadge dockingBadge = (DockingBadge) next;
                dockingBadge.layout(paddingStart, paddingTop, dockingBadge.getMeasuredWidth() + paddingStart, dockingBadge.getMeasuredHeight() + paddingTop);
                paddingStart = dockingBadge.getRight() + dockingBadge.getEndEdgeStyle$_design_modules_components().f179119d;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        if (this.f179122d == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingStart()) - getPaddingEnd(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        Iterator<View> it = new C22829k0(this).iterator();
        View view = null;
        int i14 = 0;
        while (it.hasNext()) {
            View next = it.next();
            if (next.getVisibility() == 0) {
                if (view == null) {
                    view = next;
                }
                DockingBadge dockingBadge = (DockingBadge) next;
                dockingBadge.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                if (dockingBadge.getMeasuredWidth() + paddingStart > size - getPaddingEnd()) {
                    i14++;
                    int i15 = this.f179122d;
                    if (1 <= i15 && i15 <= i14) {
                        break;
                    }
                    paddingStart = getPaddingStart();
                    paddingTop = dockingBadge.getMeasuredHeight() + this.f179121c.f20902b + paddingTop;
                }
                paddingStart += dockingBadge.getMeasuredWidth() + dockingBadge.getEndEdgeStyle$_design_modules_components().f179119d;
            }
        }
        int measuredHeight = paddingTop + (view != null ? view.getMeasuredHeight() : 0);
        if (mode == Integer.MIN_VALUE) {
            int paddingBottom = getPaddingBottom() + measuredHeight;
            if (paddingBottom <= size2) {
                size2 = paddingBottom;
            }
        } else if (mode != 1073741824) {
            size2 = getPaddingBottom() + measuredHeight;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setBadgeItems(@k List<DockingBadgeItem> badges) {
        Iterable iterable;
        DockingBadgeEdgeType dockingBadgeEdgeType;
        DockingBadge dockingBadge;
        if (L.f(this.f179121c.f20901a, badges)) {
            return;
        }
        removeAllViewsInLayout();
        this.f179121c = C19818a.a(this.f179121c, badges, 0, 6);
        List<DockingBadgeItem> list = badges;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            arrayList.add(next);
            while (it.hasNext()) {
                DockingBadgeItem dockingBadgeItem = (DockingBadgeItem) it.next();
                int i12 = a.C5268a.f179145b[((DockingBadgeItem) next).f179130e.ordinal()];
                if (i12 == 1) {
                    dockingBadgeEdgeType = DockingBadgeEdgeType.Square;
                } else if (i12 == 2) {
                    dockingBadgeEdgeType = DockingBadgeEdgeType.Pipka;
                } else if (i12 == 3) {
                    dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                } else if (i12 == 4) {
                    dockingBadgeEdgeType = DockingBadgeEdgeType.AntiPyramid;
                } else {
                    if (i12 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dockingBadgeEdgeType = DockingBadgeEdgeType.Pyramid;
                }
                next = new DockingBadgeItem(dockingBadgeItem.f179127b, dockingBadgeItem.f179128c, dockingBadgeEdgeType, dockingBadgeItem.f179130e, dockingBadgeItem.f179131f);
                arrayList.add(next);
            }
            iterable = arrayList;
        } else {
            iterable = C42784z0.f406748b;
        }
        Iterable<DockingBadgeItem> iterable2 = iterable;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable2, 10));
        for (DockingBadgeItem dockingBadgeItem2 : iterable2) {
            C25568a c25568a = dockingBadgeItem2.f179131f;
            if (c25568a != null) {
                dockingBadge = new DockingBadge(getContext(), (AttributeSet) null, 0, 0, 14, (C42822w) null);
                dockingBadge.setStyle(c25568a);
                dockingBadge.setText(dockingBadgeItem2.f179127b);
                dockingBadge.f(dockingBadgeItem2.f179129d, dockingBadgeItem2.f179130e);
            } else {
                dockingBadge = new DockingBadge(getContext(), dockingBadgeItem2.f179127b, dockingBadgeItem2.f179128c, this.f179120b, dockingBadgeItem2.f179129d, dockingBadgeItem2.f179130e);
            }
            arrayList2.add(dockingBadge);
        }
        Iterator it2 = arrayList2.iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            addViewInLayout((DockingBadge) next2, i13, generateDefaultLayoutParams(), false);
            i13 = i14;
        }
        requestLayout();
    }

    public final void setNumberOfLines(int number) {
        if (number < 0) {
            number = -1;
        }
        if (this.f179122d == number) {
            return;
        }
        this.f179122d = number;
        requestLayout();
    }

    public final void setSize(@k DockingBadgeSize size) {
        this.f179120b = size;
        setBadgeItems(this.f179121c.f20901a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DockingBadgeContainer(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        Object obj = null;
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.dockingBadgeContainer : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_DockingBadgeContainer : i13;
        super(context, attributeSet, i12, i13);
        this.f179120b = DockingBadgeSize.MEDIUM;
        this.f179121c = new C19818a(null, 0, 0, 7, null);
        this.f179122d = -1;
        setWillNotDraw(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178927J, i12, i13);
        this.f179121c = C19818a.a(this.f179121c, null, typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), 5);
        int i15 = typedArrayObtainStyledAttributes.getInt(0, this.f179120b.f179135b);
        DockingBadgeSize.f179132c.getClass();
        Iterator it = ((AbstractC42738c) DockingBadgeSize.f179134e).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((DockingBadgeSize) next).f179135b == i15) {
                obj = next;
                break;
            }
        }
        DockingBadgeSize dockingBadgeSize = (DockingBadgeSize) obj;
        this.f179120b = dockingBadgeSize == null ? DockingBadgeSize.MEDIUM : dockingBadgeSize;
        int integer = typedArrayObtainStyledAttributes.getInteger(1, -1);
        this.f179122d = integer;
        if (integer < 0) {
            this.f179122d = -1;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k C19818a newState) {
        C19818a c19818a = this.f179121c;
        if (c19818a == null) {
            c19818a = null;
        }
        if (new c(newState, c19818a).f181333c) {
            return;
        }
        List<DockingBadgeItem> list = c19818a != null ? c19818a.f20901a : null;
        List<DockingBadgeItem> list2 = newState.f20901a;
        if (!new c(list2, list).f181333c && list2 != null) {
            setBadgeItems(list2);
        }
        this.f179121c = newState;
        Integer numValueOf = Integer.valueOf(newState.f20902b);
        if (!new c(numValueOf, c19818a != null ? Integer.valueOf(c19818a.f20902b) : null).f181333c) {
            numValueOf.intValue();
            requestLayout();
        }
        int i12 = newState.f20903c;
        Integer numValueOf2 = Integer.valueOf(i12);
        if (new c(numValueOf2, c19818a != null ? Integer.valueOf(c19818a.f20903c) : null).f181333c) {
            return;
        }
        numValueOf2.intValue();
        setNumberOfLines(i12);
    }
}
