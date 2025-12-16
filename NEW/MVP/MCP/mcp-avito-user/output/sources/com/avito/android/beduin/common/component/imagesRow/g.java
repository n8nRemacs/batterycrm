package com.avito.android.beduin.common.component.imagesRow;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.serp.NoTouchEventRecyclerView;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: ImagesRowViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/g;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NoTouchEventRecyclerView f101483b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.adapter.a f101484c;

    public g(@k NoTouchEventRecyclerView noTouchEventRecyclerView) {
        this.f101483b = noTouchEventRecyclerView;
        com.avito.android.beduin.common.component.adapter.a aVar = new com.avito.android.beduin.common.component.adapter.a(0);
        this.f101484c = aVar;
        noTouchEventRecyclerView.setAdapter(aVar);
        noTouchEventRecyclerView.getContext();
        noTouchEventRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }

    @Override // ej.InterfaceC40116e
    /* renamed from: getRoot */
    public final View getF103243b() {
        return this.f101483b;
    }
}
