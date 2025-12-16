package com.avito.android.section.vertical.adapter;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_core.advert.q;
import com.avito.android.serp.adapter.C34690c0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.e1;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionVerticalAdapterView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/vertical/adapter/h;", "Lcom/avito/android/section/vertical/adapter/f;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f264942b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f264943c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f264944d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f264945e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Z0 f264946f;

    public h(@k View view, @k com.avito.konveyor.adapter.a aVar, int i12, @k com.avito.konveyor.a aVar2, @k q qVar) {
        super(view);
        this.f264942b = view;
        this.f264943c = aVar;
        View viewFindViewById = view.findViewById(R.id.section_vertical_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f264944d = recyclerView;
        j jVar = new j(aVar, aVar2);
        this.f264945e = jVar;
        Z0 z02 = new Z0(i12, new C34690c0(i12));
        z02.f268509c = new g();
        this.f264946f = z02;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12, 1);
        jVar.setHasStableIds(true);
        gridLayoutManager.f53667M = new e1(z02);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.l(qVar, -1);
    }

    @Override // com.avito.android.section.vertical.adapter.f
    public final void ie(@k UV0.c cVar) {
        this.f264946f.f268508b = cVar;
        this.f264943c.c(cVar);
        RecyclerView recyclerView = this.f264944d;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        j jVar = this.f264945e;
        if (adapter == null) {
            recyclerView.setAdapter(jVar);
        } else {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f264944d.setAdapter(null);
    }
}
