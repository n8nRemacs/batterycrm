package com.avito.android.lib.util.recycler_wrap_height_calculator;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.p6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecyclerWrapHeightCalculator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/recycler_wrap_height_calculator/a;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    @l
    public final RecyclerView.m f181419G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public RecyclerView.u f181420H;

    /* renamed from: I, reason: collision with root package name */
    public int f181421I;

    public a(@k Context context, @l RecyclerView.m mVar) {
        super(0, false);
        this.f181419G = mVar;
        this.f181421I = BeduinInputModel.MIN_TEXT_VERSION;
    }

    public static void h2(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.dispatchOnPreDraw();
        viewTreeObserver.dispatchOnDraw();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            p6 p6Var = new p6(viewGroup);
            while (p6Var.hasNext()) {
                h2((View) p6Var.next());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void C0(@k View view, int i12, int i13, int i14, int i15) {
        h2(view);
        RecyclerView.u uVar = this.f181420H;
        if (uVar != null) {
            e1(view, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(@k View view) {
        super.D0(view);
        this.f181421I = Math.max(this.f181421I, view.getMeasuredHeight());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void U0(@l RecyclerView.u uVar, @l RecyclerView.z zVar) {
        this.f181420H = uVar;
        super.U0(uVar, zVar);
        this.f181420H = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n a0() {
        RecyclerView.m mVar = this.f181419G;
        RecyclerView.n nVarA0 = mVar != null ? mVar.a0() : null;
        return nVarA0 == null ? super.a0() : nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n b0(@l Context context, @l AttributeSet attributeSet) {
        RecyclerView.m mVar = this.f181419G;
        RecyclerView.n nVarB0 = mVar != null ? mVar.b0(context, attributeSet) : null;
        return nVarB0 == null ? new RecyclerView.n(context, attributeSet) : nVarB0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n c0(@l ViewGroup.LayoutParams layoutParams) {
        RecyclerView.m mVar = this.f181419G;
        RecyclerView.n nVarC0 = mVar != null ? mVar.c0(layoutParams) : null;
        return nVarC0 == null ? super.c0(layoutParams) : nVarC0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l0(@k View view) {
        return 0;
    }
}
