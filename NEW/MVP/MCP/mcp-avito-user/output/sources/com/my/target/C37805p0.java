package com.my.target;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39924z;

/* renamed from: com.my.target.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37805p0 extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    @j.P
    public C f365068G;

    /* renamed from: com.my.target.p0$a */
    public interface a {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(@j.N View view) {
        int iC2 = C39924z.c(10, view.getContext());
        if (RecyclerView.m.t0(view) > 0) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin = iC2;
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(((int) (this.f53850p * 0.7f)) - iC2, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(this.f53851q, BeduinInputModel.MIN_TEXT_VERSION));
        int measuredHeight = view.getMeasuredHeight();
        int i12 = this.f53851q;
        if (measuredHeight > i12) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((int) (this.f53850p * (((i12 - (iC2 * 2)) * 0.7f) / measuredHeight))) - iC2, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(this.f53851q, BeduinInputModel.MIN_TEXT_VERSION));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void V0(RecyclerView.z zVar) {
        super.V0(zVar);
        C c12 = this.f365068G;
        if (c12 != null) {
            C37805p0 c37805p0 = c12.f364353c;
            int iH1 = c37805p0.H1();
            View viewZ = iH1 >= 0 ? c37805p0.Z(iH1) : null;
            c12.f364354d.o((c12.f364352b.getChildCount() == 0 || viewZ == null || ((double) c12.getWidth()) > ((double) viewZ.getWidth()) * 1.7d) ? 8388611 : 17);
            c12.a();
        }
    }
}
