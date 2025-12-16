package com.avito.android.beduin.common.container.horizontal_slider;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BeduinHorizontalSliderLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/l;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout;", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l extends BeduinBaseHorizontalSliderLayout<AbstractC40112a<BeduinModel, InterfaceC40116e>> {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.component.adapter.h f103121r;

    public l(@Y61.k Context context, @Y61.k AbstractC35201t abstractC35201t) {
        super(context);
        com.avito.android.beduin.common.component.adapter.h hVar = new com.avito.android.beduin.common.component.adapter.h(0);
        this.f103121r = hVar;
        this.f103063e = hVar;
        RecyclerView recyclerView = this.recycler;
        recyclerView.setAdapter(hVar);
        addView(recyclerView);
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout
    public final void c(int i12, @Y61.k ArrayList arrayList, boolean z12) {
        super.c(i12, arrayList, z12);
        com.avito.android.beduin.common.component.adapter.h hVar = this.f103121r;
        hVar.f100619l = z12;
        hVar.f100618k = i12;
    }
}
