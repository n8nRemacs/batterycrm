package com.avito.android.visual_rubricator;

import Oi0.C14700d;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VisualRubricatorWidgetItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/visual_rubricator/W;", "Lcom/avito/android/visual_rubricator/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class W extends com.avito.konveyor.adapter.b implements InterfaceC36120k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f327334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14700d f327335c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f327336d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f327337e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UV0.c<VisualRubricatorWidgetElementItem> f327338f;

    public W(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k C14700d c14700d, @Y61.k GridLayoutManager.c cVar, @Y61.k J j12, boolean z12) {
        super(view);
        this.f327334b = hVar;
        this.f327335c = c14700d;
        View viewFindViewById = view.findViewById(R.id.big_visual_rubricator_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f327336d = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f327337e = arrayList;
        UV0.c<VisualRubricatorWidgetElementItem> cVar2 = new UV0.c<>(arrayList);
        this.f327338f = cVar2;
        boolean z13 = recyclerView.getResources().getConfiguration().orientation == 2 || view.getResources().getBoolean(R.bool.is_tablet);
        com.avito.android.visual_rubricator.element.g gVar = new com.avito.android.visual_rubricator.element.g(view.getResources(), j12.g(z13), cVar, z12);
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(j12.g(z13));
        gridLayoutManager.f53667M = cVar;
        j12.c(cVar2);
        j12.b(view.getResources());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(c14700d);
        recyclerView.l(gVar, -1);
    }

    @Override // com.avito.android.visual_rubricator.V
    public final boolean K10() {
        return this.f327336d.getChildCount() == 0;
    }

    @Override // com.avito.android.visual_rubricator.V
    public final void MV(@Y61.k List list, @Y61.k T t12, boolean z12, boolean z13) {
        gy(list, t12, 0, z12, z13);
    }

    @Override // com.avito.android.visual_rubricator.V
    public final int gm() {
        int[] iArr = new int[2];
        RecyclerView recyclerView = this.f327336d;
        recyclerView.getLocationOnScreen(iArr);
        int height = recyclerView.getHeight() + iArr[1];
        if (height != recyclerView.getHeight()) {
            return height;
        }
        return -1;
    }

    @Override // com.avito.android.visual_rubricator.V
    public final void gy(@Y61.k List list, @Y61.k T t12, int i12, boolean z12, boolean z13) {
        ArrayList arrayList = this.f327337e;
        arrayList.clear();
        arrayList.addAll(list);
        this.f327334b.f338510e = this.f327338f;
        this.f327335c.notifyDataSetChanged();
    }
}
