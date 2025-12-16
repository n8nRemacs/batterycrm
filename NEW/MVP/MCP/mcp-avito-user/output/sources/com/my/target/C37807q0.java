package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39924z;

/* renamed from: com.my.target.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37807q0 extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final int f365076G;

    /* renamed from: H, reason: collision with root package name */
    public int f365077H;

    /* renamed from: I, reason: collision with root package name */
    @j.P
    public com.my.target.ads.a f365078I;

    /* renamed from: J, reason: collision with root package name */
    public int f365079J;

    /* renamed from: K, reason: collision with root package name */
    public int f365080K;

    /* renamed from: L, reason: collision with root package name */
    public int f365081L;

    /* renamed from: M, reason: collision with root package name */
    public int f365082M;

    /* renamed from: com.my.target.q0$a */
    public interface a {
    }

    public C37807q0(Context context) {
        super(0, false);
        this.f365076G = new C39924z(context).a(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(View view) {
        int i12 = this.f53851q;
        int i13 = this.f53850p;
        if (i12 != this.f365082M || i13 != this.f365081L || this.f365079J <= 0 || this.f365080K <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i13, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(this.f53851q, BeduinInputModel.MIN_TEXT_VERSION));
            float measuredWidth = this.f53850p / view.getMeasuredWidth();
            this.f365079J = measuredWidth > 1.0f ? (int) (i13 / (Math.floor(measuredWidth) + 0.5d)) : (int) (i13 / 1.5f);
            this.f365080K = i12;
            this.f365081L = i13;
            this.f365082M = i12;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (view != d0(0)) {
            ((ViewGroup.MarginLayoutParams) nVar).leftMargin = C39924z.c(this.f365077H / 2, view.getContext());
        }
        if (view != d0(e0())) {
            ((ViewGroup.MarginLayoutParams) nVar).rightMargin = C39924z.c(this.f365077H / 2, view.getContext());
        }
        int iF02 = RecyclerView.m.f0(i13, this.f53848n, 0, this.f365079J, I());
        int i14 = this.f53849o;
        int i15 = this.f365076G;
        view.measure(iF02, RecyclerView.m.f0(i12, i14, i15, i12 - (i15 * 2), J()));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void V0(RecyclerView.z zVar) {
        super.V0(zVar);
        com.my.target.ads.a aVar = this.f365078I;
        if (aVar != null) {
            ((E0) aVar.f364681c).L0();
        }
    }
}
