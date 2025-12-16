package com.avito.android.extended_profile_adverts;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.util.C35976x4;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.d2;
import pA.InterfaceC46926a;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/s;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/advert/viewed/j;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements com.avito.android.favorite.s, com.avito.android.advert.viewed.j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f150963b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f150964c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d2<InterfaceC46926a> f150965d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f150966e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.f f150967f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f150968g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> f150969h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h1 f150970i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y0 f150971j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47264a f150972k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f150973l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f150974m;

    public s(@Y61.k View view, @Y61.k ProfileAdvertsFragment profileAdvertsFragment, @Y61.k t tVar, @Y61.k d2 d2Var, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert.viewed.f fVar, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k com.avito.android.ui.adapter.h hVar, @Y61.k h1 h1Var, @Y61.k Y0 y02, @Y61.k GridLayoutManager.c cVar2, @Y61.k InterfaceC47264a interfaceC47264a) {
        this.f150963b = view;
        this.f150964c = tVar;
        this.f150965d = d2Var;
        this.f150966e = nVar;
        this.f150967f = fVar;
        this.f150968g = cVar;
        this.f150969h = hVar;
        this.f150970i = h1Var;
        this.f150971j = y02;
        this.f150972k = interfaceC47264a;
        View viewFindViewById = view.findViewById(R.id.progress_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f150973l = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f150974m = recyclerView;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getResources().getInteger(R.integer.profile_adverts_columns), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(null);
        gridLayoutManager.o2(view.getContext().getResources().getInteger(R.integer.profile_adverts_columns));
        gridLayoutManager.f53667M = cVar2;
        com.avito.android.arch.mvi.android.f.a(tVar, profileAdvertsFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new p(1, this, s.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/extended_profile_adverts/mvi/entity/ProfileAdvertsOneTimeEvent;)V", 0), new q(1, this, s.class, "render", "render(Lcom/avito/android/extended_profile_adverts/mvi/entity/ProfileAdvertsState;)V", 0));
        C22984Q.a(profileAdvertsFragment.getViewLifecycleOwner()).e(new r(this, null));
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f150974m);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void a(pA.d dVar) {
        UV0.c cVar = new UV0.c(dVar.f428243a);
        this.f150968g.c(cVar);
        this.f150971j.c(cVar);
        this.f150970i.c(cVar);
        this.f150966e.c(cVar);
        this.f150967f.c(cVar);
        InterfaceC47264a interfaceC47264a = this.f150972k;
        Throwable th2 = dVar.f428251i;
        if (th2 == null) {
            interfaceC47264a.j();
        } else {
            interfaceC47264a.g(th2);
        }
    }
}
