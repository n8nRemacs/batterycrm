package com.avito.android.crm_paid_cvs.render;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/render/d;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f130682a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f130683b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f130684c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f130685d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Set<FilterItem.FilterType> f130686e;

    /* compiled from: FiltersRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f130687l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f130687l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f130687l.invoke();
            return G0.f406611a;
        }
    }

    public d(@k View view, @k com.avito.konveyor.adapter.d dVar, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3) {
        this.f130682a = dVar;
        View viewFindViewById = view.findViewById(R.id.navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.filter_recycler);
        this.f130683b = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.apply_button);
        this.f130684c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.drop_button);
        this.f130685d = viewFindViewById3;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(dVar);
        ((NavBar) viewFindViewById).setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new a(aVar), false, view.getContext().getString(R.string.paid_cvs_filters), null, null, null, 116, null));
        viewFindViewById2.setOnClickListener(new com.avito.android.component.user_hat.items.k(19, aVar2));
        viewFindViewById3.setOnClickListener(new com.avito.android.component.user_hat.items.k(20, aVar3));
        this.f130686e = C42756l.l0(new FilterItem.FilterType[]{FilterItem.FilterType.f130363d, FilterItem.FilterType.f130364e, FilterItem.FilterType.f130365f, FilterItem.FilterType.f130366g, FilterItem.FilterType.f130361b, FilterItem.FilterType.f130362c});
    }
}
