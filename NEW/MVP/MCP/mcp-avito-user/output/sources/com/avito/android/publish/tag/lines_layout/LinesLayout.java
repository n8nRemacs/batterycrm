package com.avito.android.publish.tag.lines_layout;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LinesLayout.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/publish/tag/lines_layout/LinesLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "lines", "Lkotlin/G0;", "setMaxLines", "(I)V", "Lkotlin/Function0;", "b", "LY41/a;", "getOnMeasureChanged", "()LY41/a;", "setOnMeasureChanged", "(LY41/a;)V", "onMeasureChanged", "e", "I", "getDividerSize", "()I", "setDividerSize", "dividerSize", "", "Landroid/view/View;", "getShowedLines", "()Ljava/util/List;", "showedLines", "_avito_publish_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinesLayout extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public Y41.a<G0> onMeasureChanged;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f245500c;

    /* renamed from: d, reason: collision with root package name */
    public int f245501d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int dividerSize;

    /* compiled from: LinesLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f245503l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    @j
    public LinesLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void g(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, BeduinInputModel.MIN_TEXT_VERSION));
    }

    public final int getDividerSize() {
        return this.dividerSize;
    }

    @k
    public final Y41.a<G0> getOnMeasureChanged() {
        return this.onMeasureChanged;
    }

    @k
    public final List<List<View>> getShowedLines() {
        ArrayList arrayList = this.f245500c;
        int size = arrayList.size();
        int i12 = this.f245501d;
        return size > i12 ? C42745f0.E0(arrayList, i12) : arrayList;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        int i14;
        int i15;
        List arrayList;
        List list;
        int i16;
        int size = (View.MeasureSpec.getSize(i12) - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList2 = this.f245500c;
        arrayList2.clear();
        int i17 = 0;
        if (getChildCount() > 0) {
            d dVar = new d();
            dVar.g(this);
            int childCount = getChildCount();
            measuredHeight = 0;
            int i18 = 0;
            int i19 = 0;
            int i22 = 0;
            while (i22 < childCount) {
                View childAt = getChildAt(i22);
                g(childAt);
                if (measuredHeight == 0) {
                    measuredHeight += childAt.getMeasuredHeight();
                }
                int measuredWidth = childAt.getMeasuredWidth();
                if (i22 <= 0 || this.dividerSize + i18 + measuredWidth <= size) {
                    measuredHeight2 = measuredHeight;
                    i14 = i19;
                    i15 = this.dividerSize + measuredWidth + i18;
                } else {
                    measuredHeight2 = childAt.getMeasuredHeight() + this.dividerSize + measuredHeight;
                    i14 = i19 + 1;
                    i15 = measuredWidth;
                }
                if (i14 >= arrayList2.size()) {
                    arrayList = new ArrayList();
                    arrayList2.add(arrayList);
                } else {
                    arrayList = (List) arrayList2.get(i14);
                }
                List list2 = arrayList;
                int i23 = i14 - 1;
                View view = (i23 < 0 || arrayList2.size() <= i23) ? null : (View) C42745f0.G((List) arrayList2.get(i23));
                dVar.f(childAt.getId(), 3);
                dVar.f(childAt.getId(), 4);
                dVar.f(childAt.getId(), 6);
                dVar.f(childAt.getId(), 7);
                if (view == null) {
                    dVar.i(childAt.getId(), 3, 0, 3);
                    list = list2;
                    i16 = i14;
                } else {
                    list = list2;
                    i16 = i14;
                    dVar.j(childAt.getId(), 3, view.getId(), 4, this.dividerSize);
                }
                View view2 = (View) C42745f0.S(list);
                if (view2 == null) {
                    dVar.i(childAt.getId(), 6, 0, 6);
                } else {
                    dVar.j(childAt.getId(), 6, view2.getId(), 7, this.dividerSize);
                }
                list.add(childAt);
                i22++;
                measuredHeight = measuredHeight2;
                i18 = i15;
                i19 = i16;
            }
            dVar.c(this);
        } else {
            measuredHeight = 0;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        int i24 = Integer.MAX_VALUE;
        if (this.f245501d != Integer.MAX_VALUE) {
            if (getChildCount() > 0) {
                View childAt2 = getChildAt(0);
                g(childAt2);
                int measuredHeight3 = childAt2.getMeasuredHeight();
                int i25 = this.f245501d;
                i17 = ((i25 - 1) * this.dividerSize) + (measuredHeight3 * i25);
            }
            i24 = i17;
        }
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, i24), 1073741824));
        this.onMeasureChanged.invoke();
    }

    public final void setDividerSize(int i12) {
        this.dividerSize = i12;
    }

    public final void setMaxLines(int lines) {
        this.f245501d = lines;
        requestLayout();
    }

    public final void setOnMeasureChanged(@k Y41.a<G0> aVar) {
        this.onMeasureChanged = aVar;
    }

    public LinesLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.onMeasureChanged = a.f245503l;
        this.f245500c = new ArrayList();
        this.f245501d = Integer.MAX_VALUE;
    }
}
