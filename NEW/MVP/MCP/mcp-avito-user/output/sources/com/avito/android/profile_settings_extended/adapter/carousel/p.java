package com.avito.android.profile_settings_extended.adapter.carousel;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FixedVisibleItemsCountWidthCalculator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/p;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class p extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final float f229353G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final RecyclerView.m f229354H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public RecyclerView.u f229355I;

    /* renamed from: J, reason: collision with root package name */
    public int f229356J;

    public p(@Y61.k Context context, float f12, @Y61.l RecyclerView.m mVar) {
        super(0, false);
        this.f229353G = f12;
        this.f229354H = mVar;
    }

    public static void h2(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.dispatchOnPreDraw();
        viewTreeObserver.dispatchOnDraw();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        Iterator itA = C22816e.a(viewGroup);
        while (true) {
            C22833m0 c22833m0 = (C22833m0) itA;
            if (!c22833m0.hasNext()) {
                return;
            } else {
                h2((View) c22833m0.next());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void C0(@Y61.k View view, int i12, int i13, int i14, int i15) {
        h2(view);
        RecyclerView.u uVar = this.f229355I;
        if (uVar != null) {
            e1(view, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(@Y61.k View view) {
        float f12 = this.f229353G;
        if (f12 == 0.0f) {
            return;
        }
        float fMin = Math.min(o0(), f12);
        int iCeil = ((int) Math.ceil(fMin)) - 1;
        int iT02 = RecyclerView.m.t0(view);
        if (iT02 <= iCeil) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            int iB2 = kotlin.math.b.b((this.f53850p - ((getPaddingLeft() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin) + (o0() <= iCeil ? getPaddingRight() + ((ViewGroup.MarginLayoutParams) nVar).rightMargin : 0))) / fMin);
            Rect rect = new Rect();
            H(view, rect);
            int i12 = rect.left;
            boolean z12 = iT02 == iCeil;
            boolean z13 = ((double) (Math.abs(fMin) % 1.0f)) < 1.0E-10d;
            if (!z12 || z13) {
                i12 += rect.right;
            }
            view.measure(RecyclerView.m.f0(this.f53850p, 1073741824, 0, iB2 - i12, I()), RecyclerView.m.f0(this.f53851q, BeduinInputModel.MIN_TEXT_VERSION, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin, ((ViewGroup.MarginLayoutParams) nVar).height, J()));
            if (this.f229356J == 0) {
                this.f229356J = view.getMeasuredWidth();
                return;
            }
            if (view.getMeasuredWidth() < this.f229356J) {
                this.f229356J -= (int) ((r2 - view.getMeasuredWidth()) / f12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void U0(@Y61.l RecyclerView.u uVar, @Y61.l RecyclerView.z zVar) {
        this.f229355I = uVar;
        super.U0(uVar, zVar);
        this.f229355I = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        RecyclerView.m mVar = this.f229354H;
        RecyclerView.n nVarA0 = mVar != null ? mVar.a0() : null;
        return nVarA0 == null ? super.a0() : nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n b0(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        RecyclerView.m mVar = this.f229354H;
        RecyclerView.n nVarB0 = mVar != null ? mVar.b0(context, attributeSet) : null;
        return nVarB0 == null ? new RecyclerView.n(context, attributeSet) : nVarB0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.l ViewGroup.LayoutParams layoutParams) {
        RecyclerView.m mVar = this.f229354H;
        RecyclerView.n nVarC0 = mVar != null ? mVar.c0(layoutParams) : null;
        return nVarC0 == null ? super.c0(layoutParams) : nVarC0;
    }
}
