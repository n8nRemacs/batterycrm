package com.avito.android.mortgage.landing.list.items.programs;

import Y41.p;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProgramsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/programs/j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f199906l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f199907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f199908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f199909d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f199910e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f199911f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.landing.list.decoration.c f199912g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f199913h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f199914i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f199915j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public p<? super Integer, ? super Integer, G0> f199916k;

    /* compiled from: ProgramsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = k.this.f199913h;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProgramsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/list/items/programs/k$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            Y41.a<G0> aVar;
            k kVar = k.this;
            if (i12 != 0) {
                if (i12 == 1 && (aVar = kVar.f199915j) != null) {
                    ((g) aVar).invoke();
                    return;
                }
                return;
            }
            Y41.a<G0> aVar2 = kVar.f199914i;
            if (aVar2 != null) {
                ((e) aVar2).invoke();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            k kVar = k.this;
            RecyclerView.m layoutManager = kVar.f199907b.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            int iK1 = linearLayoutManager != null ? linearLayoutManager.K1() : -1;
            int iM1 = linearLayoutManager != null ? linearLayoutManager.M1() : -1;
            p<? super Integer, ? super Integer, G0> pVar = kVar.f199916k;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(iK1), Integer.valueOf(iM1));
            }
        }
    }

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.programs_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f199907b = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.programs_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199908c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.programs_hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199909d = (TextView) viewFindViewById3;
        com.avito.android.mortgage.landing.list.items.programs.di.a.a().a(new a()).a(this);
        com.avito.android.mortgage.landing.list.decoration.c cVar = this.f199912g;
        recyclerView.l(cVar == null ? null : cVar, -1);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.o1();
        linearLayoutManager.f53688E = 3;
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.konveyor.adapter.j jVar = this.f199910e;
        jVar = jVar == null ? null : jVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.o(new b());
    }

    @Override // u00.InterfaceC48756d
    public final void FM(@Y61.k Y41.a<G0> aVar) {
        this.f199914i = aVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void Tc(int i12) {
        this.f199908c.setText(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void c30(@Y61.k Y41.a<G0> aVar) {
        this.f199909d.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(6, aVar));
    }

    @Override // u00.InterfaceC48756d
    public final void e3(@Y61.l Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.m layoutManager = this.f199907b.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.X0(parcelable);
            }
        }
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void el(@Y61.k ArrayList arrayList) {
        com.avito.konveyor.adapter.h hVar = this.f199911f;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f338510e = new UV0.c(arrayList);
        com.avito.konveyor.adapter.j jVar = this.f199910e;
        (jVar != null ? jVar : null).notifyDataSetChanged();
    }

    @Override // u00.InterfaceC48756d
    @Y61.l
    public final Parcelable l1() {
        RecyclerView.m layoutManager = this.f199907b.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.Y0();
        }
        return null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void s70(int i12) {
        this.f199909d.setHint(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void sI(@Y61.k p<? super Integer, ? super Integer, G0> pVar) {
        this.f199916k = pVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void tI(@Y61.k Y41.a<G0> aVar) {
        this.f199915j = aVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.j
    public final void vZ(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f199913h = lVar;
    }
}
