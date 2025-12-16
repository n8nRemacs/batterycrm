package com.avito.android.lib.design.item_color_picker;

import Y41.p;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MultilineItemColorPickerLayoutManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/MultilineItemColorPickerLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$m;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MultilineItemColorPickerLayoutManager extends RecyclerView.m {

    /* renamed from: r, reason: collision with root package name */
    public final int f179464r;

    /* renamed from: s, reason: collision with root package name */
    public final int f179465s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final Integer f179466t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final p<Boolean, Integer, G0> f179467u;

    public /* synthetic */ MultilineItemColorPickerLayoutManager(int i12, int i13, Integer num, p pVar, int i14, C42822w c42822w) {
        this(i12, i13, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@l RecyclerView.n nVar) {
        return nVar != null && ((ViewGroup.MarginLayoutParams) nVar).width == -2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U0(@Y61.k RecyclerView.u uVar, @Y61.k RecyclerView.z zVar) {
        U(uVar);
        int i12 = this.f53849o == 1073741824 ? this.f53851q : Integer.MAX_VALUE;
        int i13 = this.f53848n == 1073741824 ? this.f53850p : Integer.MAX_VALUE;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int iO02 = o0();
        if (iO02 == 0) {
            b1();
            return;
        }
        boolean z12 = true;
        int i14 = 0;
        for (int i15 = 0; z12 && i15 < iO02; i15++) {
            View viewD = uVar.d(i15);
            D(viewD);
            D0(viewD);
            if (getPaddingRight() + viewD.getMeasuredWidth() + paddingLeft > i13) {
                paddingLeft = getPaddingLeft();
                paddingTop = C22026a.a(this.f179465s, 2, viewD.getMeasuredHeight(), paddingTop);
                i14++;
            }
            RecyclerView.m.B0(viewD, paddingLeft, paddingTop, viewD.getMeasuredWidth() + paddingLeft, viewD.getMeasuredHeight() + paddingTop);
            paddingLeft = C22026a.a(this.f179464r, 2, viewD.getMeasuredWidth(), paddingLeft);
            Integer num = this.f179466t;
            boolean z13 = num == null || i14 < num.intValue();
            p<Boolean, Integer, G0> pVar = this.f179467u;
            if (pVar != null) {
                pVar.invoke(Boolean.valueOf(z13), Integer.valueOf(i15));
            }
            if (!z13) {
                f1(viewD);
            }
            z12 = paddingTop <= i12 && z13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.k ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVar = new RecyclerView.n(layoutParams);
        ((ViewGroup.MarginLayoutParams) nVar).width = -2;
        ((ViewGroup.MarginLayoutParams) nVar).height = -2;
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean x0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultilineItemColorPickerLayoutManager(int i12, int i13, @l Integer num, @l p<? super Boolean, ? super Integer, G0> pVar) {
        this.f179464r = i12;
        this.f179465s = i13;
        this.f179466t = num;
        this.f179467u = pVar;
    }
}
