package com.avito.android.imv_goods_poll.items.list_radio_button;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/list_radio_button/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/imv_goods_poll/items/list_radio_button/h;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f170665b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f170666c;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.radio_button_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f170665b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.radio_button_item_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f170666c = (RecyclerView) viewFindViewById2;
    }

    @Override // com.avito.android.imv_goods_poll.items.list_radio_button.h
    public final void I5(@k l lVar, @k List list) {
        this.f170665b.k();
        j jVar = new j(lVar, list);
        RecyclerView recyclerView = this.f170666c;
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // com.avito.android.imv_goods_poll.items.list_radio_button.h
    public final void setError(@k String str) {
        ComponentContainer.n(this.f170665b, str, 2);
    }
}
