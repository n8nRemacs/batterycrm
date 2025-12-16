package com.avito.android.advert.item.installments;

import Y61.k;
import aO.InterfaceC19795a;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import kotlin.Metadata;

/* compiled from: InstallmentsBlockItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/installments/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/installments/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final aO.d f76577b;

    public d(@k ViewGroup viewGroup, @k InterfaceC19795a interfaceC19795a) {
        super(viewGroup);
        this.f76577b = interfaceC19795a.a(viewGroup);
    }

    @Override // com.avito.android.advert.item.installments.c
    public final void dp(@k InstallmentsBlock installmentsBlock) {
        this.f76577b.a(installmentsBlock);
    }
}
