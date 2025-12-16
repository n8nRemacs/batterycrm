package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.C37786g;
import com.my.target.H;
import e11.C39867f1;
import e11.C39924z;
import e11.InterfaceC39918x;
import java.util.List;

/* loaded from: classes7.dex */
public class c7 extends RecyclerView implements InterfaceC39918x {

    /* renamed from: F0, reason: collision with root package name */
    @j.N
    public final c f364763F0;

    /* renamed from: G0, reason: collision with root package name */
    @j.N
    public final b f364764G0;

    /* renamed from: H0, reason: collision with root package name */
    @j.N
    public final C37786g f364765H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f364766I0;

    /* renamed from: J0, reason: collision with root package name */
    @j.P
    public H.a f364767J0;

    public class b implements C37786g.c {
        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar;
            View viewY;
            c7 c7Var = c7.this;
            if (c7Var.f364766I0 || !c7Var.isClickable() || (viewY = (cVar = c7Var.f364763F0).Y(view)) == null || c7Var.f364767J0 == null) {
                return;
            }
            cVar.getClass();
            int iT02 = RecyclerView.m.t0(viewY);
            if (iT02 >= 0) {
                c7Var.f364767J0.c(viewY, iT02);
            }
        }
    }

    public static class c extends LinearLayoutManager {

        /* renamed from: G, reason: collision with root package name */
        @j.P
        public com.my.target.ads.a f364769G;

        /* renamed from: H, reason: collision with root package name */
        public int f364770H;

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void D0(View view) {
            int i12;
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            int i13 = this.f53850p;
            if (this.f53851q <= 0 || i13 <= 0) {
                return;
            }
            if (RecyclerView.m.p0(view) == 1) {
                i12 = this.f364770H;
            } else if (RecyclerView.m.p0(view) == 2) {
                ((ViewGroup.MarginLayoutParams) nVar).leftMargin = this.f364770H;
                super.D0(view);
            } else {
                i12 = this.f364770H;
                ((ViewGroup.MarginLayoutParams) nVar).leftMargin = i12;
            }
            ((ViewGroup.MarginLayoutParams) nVar).rightMargin = i12;
            super.D0(view);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final void V0(RecyclerView.z zVar) {
            c7 c7Var;
            H.a aVar;
            super.V0(zVar);
            com.my.target.ads.a aVar2 = this.f364769G;
            if (aVar2 == null || (aVar = (c7Var = (c7) aVar2.f364681c).f364767J0) == null) {
                return;
            }
            aVar.a(c7Var.getVisibleCardNumbers(), c7Var.getContext());
        }
    }

    public c7(@j.N Context context) {
        super(context, null, 0);
        this.f364764G0 = new b(null);
        c cVar = new c(0, false);
        this.f364763F0 = cVar;
        cVar.f364770H = C39924z.c(4, context);
        this.f364765H0 = new C37786g(getContext());
        setHasFixedSize(true);
    }

    private void setCardLayoutManager(c cVar) {
        cVar.f364769G = new com.my.target.ads.a(this, 10);
        super.setLayoutManager(cVar);
    }

    @Override // com.my.target.H
    public final void a(@j.N Parcelable parcelable) {
        this.f364763F0.X0(parcelable);
    }

    @Override // com.my.target.H
    public final void dispose() {
        C37786g c37786g = this.f364765H0;
        c37786g.f364839d.clear();
        c37786g.notifyDataSetChanged();
        c37786g.f364840e = null;
    }

    @Override // com.my.target.H
    public Parcelable getState() {
        return this.f364763F0.Y0();
    }

    @Override // com.my.target.H
    @j.N
    public int[] getVisibleCardNumbers() {
        c cVar = this.f364763F0;
        int iK1 = cVar.K1();
        int iM1 = cVar.M1();
        if (iK1 < 0 || iM1 < 0) {
            return new int[0];
        }
        if (C37803o0.a(cVar.Z(iK1)) < 50.0d) {
            iK1++;
        }
        if (C37803o0.a(cVar.Z(iM1)) < 50.0d) {
            iM1--;
        }
        if (iK1 > iM1) {
            return new int[0];
        }
        if (iK1 == iM1) {
            return new int[]{iK1};
        }
        int i12 = (iM1 - iK1) + 1;
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = iK1;
            iK1++;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i12) {
        H.a aVar;
        boolean z12 = i12 != 0;
        this.f364766I0 = z12;
        if (z12 || (aVar = this.f364767J0) == null) {
            return;
        }
        aVar.a(getVisibleCardNumbers(), getContext());
    }

    @Override // com.my.target.H
    public void setPromoCardSliderListener(@j.P H.a aVar) {
        this.f364767J0 = aVar;
    }

    @Override // e11.InterfaceC39918x
    public void setupCards(@j.N List<C39867f1> list) {
        C37786g c37786g = this.f364765H0;
        c37786g.f364839d.addAll(list);
        if (isClickable()) {
            c37786g.f364840e = this.f364764G0;
        }
        setCardLayoutManager(this.f364763F0);
        K0(c37786g, true);
    }

    @Override // e11.InterfaceC39918x
    public View getView() {
        return this;
    }
}
