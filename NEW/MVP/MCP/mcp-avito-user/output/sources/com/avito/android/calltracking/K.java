package com.avito.android.calltracking;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/K;", "Lcom/avito/android/calltracking/J;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f113580a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f113581b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f113582c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113583d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113584e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f113585f;

    /* compiled from: CalltrackingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = K.this.f113583d;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: CalltrackingView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/calltracking/K$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 0) {
                K k12 = K.this;
                if (k12.f113581b.f338513c.getCount() - 2 <= k12.f113585f.M1()) {
                    k12.f113584e.accept(G0.f406611a);
                }
            }
        }
    }

    public K(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f113580a = view;
        this.f113581b = jVar;
        ViewGroup viewGroup = (ViewGroup) view;
        int i12 = 0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, i12, null, 0, C35835l0.d(R.attr.transparentBlack, viewGroup.getContext()), 14, null);
        this.f113582c = lVar;
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f113583d = new com.jakewharton.rxrelay3.c<>();
        this.f113584e = new com.jakewharton.rxrelay3.c<>();
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f113585f = linearLayoutManager;
        b bVar = new b();
        lVar.f231600j = new a();
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.o(bVar);
    }
}
