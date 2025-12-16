package com.avito.android.mortgage.landing.list.items.offers;

import Y41.p;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.android.util.D6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OffersView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/offers/k;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f199826r = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f199827b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f199828c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f199829d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f199830e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f199831f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f199832g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f199833h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f199834i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f199835j;

    /* renamed from: k, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f199836k;

    /* renamed from: l, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f199837l;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.landing.list.items.offers.a f199838m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public p<? super String, ? super Boolean, G0> f199839n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f199840o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f199841p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f199842q;

    /* compiled from: OffersView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "offerId", "", "isChecked", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<String, Boolean, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Boolean bool) {
            String str2 = str;
            Boolean bool2 = bool;
            bool2.booleanValue();
            p<? super String, ? super Boolean, G0> pVar = l.this.f199839n;
            if (pVar != null) {
                pVar.invoke(str2, bool2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OffersView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/list/items/offers/l$b", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            Y41.l<? super Boolean, G0> lVar = l.this.f199840o;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            Y41.l<? super Boolean, G0> lVar = l.this.f199840o;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* compiled from: OffersView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/list/items/offers/l$c", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.r {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            Y41.a<G0> aVar;
            l lVar = l.this;
            if (i12 != 0) {
                if (i12 == 1 && (aVar = lVar.f199842q) != null) {
                    ((g) aVar).invoke();
                    return;
                }
                return;
            }
            Y41.a<G0> aVar2 = lVar.f199841p;
            if (aVar2 != null) {
                ((h) aVar2).invoke();
            }
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f199827b = view;
        View viewFindViewById = view.findViewById(R.id.offers_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f199828c = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.offers_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199829d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.offers_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199830e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.offers_submit);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f199831f = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.mkb_banner);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f199832g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.data_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f199833h = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.placeholders_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f199834i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.nothing_found_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f199835j = (LinearLayout) viewFindViewById8;
        com.avito.android.mortgage.landing.list.items.offers.di.a.a().a(new a()).a(this);
        com.avito.android.mortgage.landing.list.items.offers.a aVar = this.f199838m;
        recyclerView.l(aVar == null ? null : aVar, -1);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.o1();
        linearLayoutManager.f53688E = 6;
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.konveyor.adapter.j jVar = this.f199836k;
        jVar = jVar == null ? null : jVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        view.addOnAttachStateChangeListener(new b());
        recyclerView.o(new c());
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void AP() {
        D6.w(this.f199833h);
        D6.w(this.f199834i);
        D6.H(this.f199835j);
    }

    @Override // u00.InterfaceC48756d
    public final void FM(@Y61.k Y41.a<G0> aVar) {
        this.f199841p = aVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void I40(boolean z12) {
        this.f199832g.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void It(@Y61.k List<OfferItem> list) {
        com.avito.konveyor.adapter.a aVar = this.f199837l;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void KY(@Y61.k Y41.a<G0> aVar) {
        this.f199842q = aVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void M40(@Y61.k p<? super String, ? super Boolean, G0> pVar) {
        this.f199839n = pVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void NO() {
        D6.w(this.f199835j);
        D6.w(this.f199834i);
        D6.H(this.f199833h);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void Na(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f199840o = lVar;
        lVar.invoke(Boolean.valueOf(this.f199827b.isAttachedToWindow()));
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void Rw(int i12) {
        this.f199830e.setText(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void Tc(int i12) {
        this.f199829d.setText(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void U10(@Y61.k Y41.a<G0> aVar) {
        this.f199831f.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(5, aVar));
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void XK() {
        D6.w(this.f199833h);
        D6.w(this.f199835j);
        D6.H(this.f199834i);
    }

    @Override // u00.InterfaceC48756d
    public final void e3(@Y61.l Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.m layoutManager = this.f199828c.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.X0(parcelable);
            }
        }
    }

    @Override // u00.InterfaceC48756d
    @Y61.l
    public final Parcelable l1() {
        RecyclerView.m layoutManager = this.f199828c.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.Y0();
        }
        return null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.k
    public final void nj(boolean z12) {
        this.f199831f.setLoading(z12);
    }
}
