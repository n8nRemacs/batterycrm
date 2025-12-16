package com.avito.android.imv_goods_poll.items.check_box;

import Y41.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/check_box/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/imv_goods_poll/items/check_box/h;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f170645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f170646c;

    public i(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.checkbox_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f170645b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.checkbox_item_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f170646c = (RecyclerView) viewFindViewById2;
    }

    @Override // com.avito.android.imv_goods_poll.items.check_box.h
    public final void I5(@Y61.k l lVar, @Y61.k List list) {
        this.f170645b.k();
        k kVar = new k(lVar, list);
        RecyclerView recyclerView = this.f170646c;
        recyclerView.setAdapter(kVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // com.avito.android.imv_goods_poll.items.check_box.h
    public final void setError(@Y61.k String str) {
        ComponentContainer.n(this.f170645b, str, 2);
    }
}
