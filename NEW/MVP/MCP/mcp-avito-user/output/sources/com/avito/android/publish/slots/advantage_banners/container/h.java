package com.avito.android.publish.slots.advantage_banners.container;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;

/* compiled from: AdvantageContainerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/advantage_banners/container/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/advantage_banners/container/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f243011b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f243012c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f243013d;

    public h(@k View view, @k com.avito.konveyor.adapter.a aVar, @k j jVar) {
        super(view);
        this.f243011b = jVar;
        this.f243012c = aVar;
        RecyclerView recyclerView = (RecyclerView) view;
        this.f243013d = recyclerView;
        recyclerView.l(new com.avito.android.publish.slots.advantage_banners.banner.d(com.avito.android.actions_sheet.a.d(view, R.dimen.advantage_banners_horizontal_padding)), -1);
    }

    @Override // com.avito.android.publish.slots.advantage_banners.container.g
    public final void Dg(@k c cVar) {
        RecyclerView recyclerView = this.f243013d;
        recyclerView.setAdapter(this.f243011b);
        this.f243012c.c(new UV0.c(cVar.f243009c));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
