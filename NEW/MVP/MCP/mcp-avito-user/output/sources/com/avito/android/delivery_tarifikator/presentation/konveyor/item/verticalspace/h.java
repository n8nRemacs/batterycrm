package com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace;

import android.view.ViewGroup;
import j.U;
import kotlin.Metadata;

/* compiled from: VerticalSpaceView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/verticalspace/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/verticalspace/g;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @U
    public int f135522b;

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.g
    public final void sS(@U int i12) {
        if (this.f135522b != i12) {
            this.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, i12));
            this.f135522b = i12;
        }
    }
}
