package com.avito.android.crm_candidates.view.base;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/b;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.crm_candidates.view.base.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29624b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f129903a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f129904b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f129905c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f129906d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<FilterItem.FilterType> f129907e;

    /* compiled from: FiltersRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.base.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f129908l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f129908l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f129908l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.base.b$b, reason: collision with other inner class name */
    public static final class C3853b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(com.avito.android.crm_candidates.features.full_filters.logics.a.a((FilterItem) t12)), Integer.valueOf(com.avito.android.crm_candidates.features.full_filters.logics.a.a((FilterItem) t13)));
        }
    }

    public C29624b(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f129903a = dVar;
        View viewFindViewById = view.findViewById(R.id.navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.filter_recycler);
        this.f129904b = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.apply_button);
        this.f129905c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.drop_button);
        this.f129906d = viewFindViewById3;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(dVar);
        ((NavBar) viewFindViewById).setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new a(aVar), false, view.getContext().getString(R.string.crm_filters), null, null, null, 116, null));
        viewFindViewById2.setOnClickListener(new com.avito.android.component.user_hat.items.k(10, aVar2));
        viewFindViewById3.setOnClickListener(new com.avito.android.component.user_hat.items.k(11, aVar3));
        this.f129907e = C42756l.l0(new FilterItem.FilterType[]{FilterItem.FilterType.f129569c, FilterItem.FilterType.f129570d, FilterItem.FilterType.f129571e, FilterItem.FilterType.f129572f, FilterItem.FilterType.f129568b});
    }

    public final void a(@Y61.k List<FilterItem> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f129907e.contains(((FilterItem) obj).f129565c)) {
                arrayList.add(obj);
            }
        }
        this.f129903a.l(C42745f0.B0(arrayList, new C3853b()), null);
    }
}
