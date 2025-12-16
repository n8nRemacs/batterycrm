package com.avito.android.comparison;

import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/l;", "Lcom/avito/android/comparison/h;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f124078a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f124079b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f124080c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.menu_bottom_sheet.b f124081d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b f124082e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f124083f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final GestureProxyView f124084g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.items.nested_scrolling_item.b f124085h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f124086i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public s f124087j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f124088k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f124089l;

    public l(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k q qVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k com.avito.konveyor.adapter.h hVar2, @Y61.k com.avito.android.comparison.menu_bottom_sheet.b bVar, @Y61.k io.reactivex.rxjava3.subjects.b bVar2, @Y61.k Y41.a aVar3) {
        this.f124078a = view;
        this.f124079b = hVar;
        this.f124080c = hVar2;
        this.f124081d = bVar;
        this.f124082e = bVar2;
        this.f124083f = aVar3;
        View viewFindViewById = view.findViewById(R.id.root_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comparison.GestureProxyView");
        }
        GestureProxyView gestureProxyView = (GestureProxyView) viewFindViewById;
        this.f124084g = gestureProxyView;
        com.avito.android.comparison.items.nested_scrolling_item.b bVar3 = new com.avito.android.comparison.items.nested_scrolling_item.b(hVar, aVar);
        bVar3.setHasStableIds(false);
        this.f124085h = bVar3;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar2, aVar2);
        jVar.setHasStableIds(false);
        this.f124086i = jVar;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(gestureProxyView.getOverlayContainer(), 0, null, 0, 0, 30, null);
        this.f124088k = lVar;
        gestureProxyView.f123818i = qVar;
        gestureProxyView.f123819j = new GestureDetector(gestureProxyView.getContext(), new o(gestureProxyView, gestureProxyView.bodyRecycler, qVar));
        p pVar = new p(gestureProxyView);
        CollapsingHeader collapsingHeader = gestureProxyView.f123817h;
        if (collapsingHeader.f43795M == null) {
            collapsingHeader.f43795M = new CopyOnWriteArrayList<>();
        }
        collapsingHeader.f43795M.add(pVar);
        RecyclerView headerRecycler = gestureProxyView.getHeaderRecycler();
        headerRecycler.getContext();
        headerRecycler.setLayoutManager(new LinearLayoutManager(0, false));
        headerRecycler.setAdapter(jVar);
        RecyclerView bodyRecycler = gestureProxyView.getBodyRecycler();
        bodyRecycler.getContext();
        bodyRecycler.setLayoutManager(new LinearLayoutManager(1, false));
        bodyRecycler.setAdapter(bVar3);
        lVar.f231600j = new i(this);
    }
}
