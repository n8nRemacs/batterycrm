package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.K0;
import e11.C39883l;
import e11.C39922y0;
import e11.ViewOnTouchListenerC39904s0;
import e11.k2;
import i11.C41211a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class E0 extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public final a f364377F0;

    /* renamed from: G0, reason: collision with root package name */
    @j.N
    public final C37807q0 f364378G0;

    /* renamed from: H0, reason: collision with root package name */
    @j.N
    public final b f364379H0;

    /* renamed from: I0, reason: collision with root package name */
    @j.N
    public final androidx.recyclerview.widget.A f364380I0;

    /* renamed from: J0, reason: collision with root package name */
    @j.P
    public ArrayList f364381J0;

    /* renamed from: K0, reason: collision with root package name */
    @j.P
    public K0.a f364382K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f364383L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f364384M0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            View viewY;
            K0.a aVar;
            ArrayList arrayList;
            E0 e02 = E0.this;
            if (e02.f364383L0 || (viewY = e02.getCardLayoutManager().Y(view)) == null) {
                return;
            }
            C37807q0 cardLayoutManager = e02.getCardLayoutManager();
            int iH1 = cardLayoutManager.H1();
            int iT02 = RecyclerView.m.t0(viewY);
            int iL1 = cardLayoutManager.L1();
            if ((iH1 > iT02 || iT02 > iL1) && !e02.f364384M0) {
                int[] iArrC = e02.f364380I0.c(e02.getCardLayoutManager(), viewY);
                if (iArrC != null) {
                    e02.D0(iArrC[0], 0, null);
                    return;
                }
                return;
            }
            if (!view.isClickable() || (aVar = e02.f364382K0) == null || (arrayList = e02.f364381J0) == null) {
                return;
            }
            e02.getCardLayoutManager().getClass();
            aVar.a((C39883l) arrayList.get(RecyclerView.m.t0(viewY)));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            ViewParent parent = view.getParent();
            while (parent != 0 && !(parent instanceof ViewOnTouchListenerC39904s0)) {
                parent = parent.getParent();
            }
            E0 e02 = E0.this;
            K0.a aVar = e02.f364382K0;
            if (aVar == null || (arrayList = e02.f364381J0) == null || parent == 0) {
                return;
            }
            e02.getCardLayoutManager().getClass();
            aVar.a((C39883l) arrayList.get(RecyclerView.m.t0((View) parent)));
        }
    }

    public static class c extends RecyclerView.Adapter<d> {

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final Context f364387c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        public final ArrayList f364388d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        public final ArrayList f364389e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f364390f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public a f364391g;

        /* renamed from: h, reason: collision with root package name */
        public b f364392h;

        public c(@j.N Context context, @j.N ArrayList arrayList) {
            this.f364388d = arrayList;
            this.f364387c = context;
            this.f364390f = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f364388d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i12) {
            if (i12 == 0) {
                return 1;
            }
            return i12 == this.f364388d.size() - 1 ? 2 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@j.N RecyclerView.C c12, int i12) {
            d dVar = (d) c12;
            ViewOnTouchListenerC39904s0 viewOnTouchListenerC39904s0 = dVar.f364393b;
            C39883l c39883l = (C39883l) this.f364388d.get(i12);
            ArrayList arrayList = this.f364389e;
            if (!arrayList.contains(c39883l)) {
                arrayList.add(c39883l);
                k2.a(dVar.itemView.getContext(), c39883l.f394702a.e("render"));
            }
            com.my.target.common.models.b bVar = c39883l.f394716o;
            if (bVar != null) {
                C39922y0 smartImageView = viewOnTouchListenerC39904s0.getSmartImageView();
                int i13 = bVar.f394305b;
                int i14 = bVar.f394306c;
                smartImageView.f394908e = i13;
                smartImageView.f394907d = i14;
                C37802o.c(bVar, smartImageView, null);
            }
            viewOnTouchListenerC39904s0.getTitleTextView().setText(c39883l.f394706e);
            viewOnTouchListenerC39904s0.getDescriptionTextView().setText(c39883l.f394704c);
            viewOnTouchListenerC39904s0.getCtaButtonView().setText(c39883l.a());
            TextView domainTextView = viewOnTouchListenerC39904s0.getDomainTextView();
            String str = c39883l.f394713l;
            C41211a ratingView = viewOnTouchListenerC39904s0.getRatingView();
            if ("web".equals(c39883l.f394714m)) {
                ratingView.setVisibility(8);
                domainTextView.setVisibility(0);
                domainTextView.setText(str);
            } else {
                domainTextView.setVisibility(8);
                float f12 = c39883l.f394709h;
                if (f12 > 0.0f) {
                    ratingView.setVisibility(0);
                    ratingView.setRating(f12);
                } else {
                    ratingView.setVisibility(8);
                }
            }
            viewOnTouchListenerC39904s0.a(this.f364391g, c39883l.f394718q);
            viewOnTouchListenerC39904s0.getCtaButtonView().setOnClickListener(this.f364392h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @j.N
        public final RecyclerView.C onCreateViewHolder(@j.N ViewGroup viewGroup, int i12) {
            return new d(new ViewOnTouchListenerC39904s0(this.f364387c, this.f364390f));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(@j.N RecyclerView.C c12) {
            ViewOnTouchListenerC39904s0 viewOnTouchListenerC39904s0 = ((d) c12).f364393b;
            viewOnTouchListenerC39904s0.a(null, null);
            viewOnTouchListenerC39904s0.getCtaButtonView().setOnClickListener(null);
        }
    }

    public static class d extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        public final ViewOnTouchListenerC39904s0 f364393b;

        public d(ViewOnTouchListenerC39904s0 viewOnTouchListenerC39904s0) {
            super(viewOnTouchListenerC39904s0);
            this.f364393b = viewOnTouchListenerC39904s0;
        }
    }

    public E0(Context context) {
        super(context, null, 0);
        this.f364377F0 = new a();
        this.f364379H0 = new b();
        setOverScrollMode(2);
        this.f364378G0 = new C37807q0(context);
        androidx.recyclerview.widget.A a12 = new androidx.recyclerview.widget.A();
        this.f364380I0 = a12;
        a12.b(this);
    }

    @j.N
    private List<C39883l> getVisibleCards() {
        int iH1;
        int iL1;
        ArrayList arrayList = new ArrayList();
        if (this.f364381J0 != null && (iH1 = getCardLayoutManager().H1()) <= (iL1 = getCardLayoutManager().L1()) && iH1 >= 0 && iL1 < this.f364381J0.size()) {
            while (iH1 <= iL1) {
                arrayList.add((C39883l) this.f364381J0.get(iH1));
                iH1++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(@j.N C37807q0 c37807q0) {
        c37807q0.f365078I = new com.my.target.ads.a(this, 15);
        super.setLayoutManager(c37807q0);
    }

    public final void L0() {
        K0.a aVar = this.f364382K0;
        if (aVar != null) {
            aVar.a(getVisibleCards());
        }
    }

    public final void M0(List<C39883l> list) {
        ArrayList arrayList = (ArrayList) list;
        c cVar = new c(getContext(), arrayList);
        this.f364381J0 = arrayList;
        cVar.f364391g = this.f364377F0;
        cVar.f364392h = this.f364379H0;
        setCardLayoutManager(this.f364378G0);
        setAdapter(cVar);
    }

    @j.k0
    public C37807q0 getCardLayoutManager() {
        return this.f364378G0;
    }

    @j.N
    @j.k0
    public androidx.recyclerview.widget.A getSnapHelper() {
        return this.f364380I0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i12) {
        boolean z12 = i12 != 0;
        this.f364383L0 = z12;
        if (z12) {
            return;
        }
        L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        if (i14 > i15) {
            this.f364384M0 = true;
        }
        super.onLayout(z12, i12, i13, i14, i15);
    }

    public void setCarouselListener(@j.P K0.a aVar) {
        this.f364382K0 = aVar;
    }

    public void setSideSlidesMargins(int i12) {
        getCardLayoutManager().f365077H = i12;
    }
}
