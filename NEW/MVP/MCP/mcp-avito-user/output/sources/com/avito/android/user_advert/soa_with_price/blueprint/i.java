package com.avito.android.user_advert.soa_with_price.blueprint;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CloseReasonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/blueprint/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/soa_with_price/blueprint/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f311879c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f311880b;

    public i(@k View view) {
        super(view);
        this.f311880b = (ListItemCheckmark) view;
    }

    @Override // com.avito.android.user_advert.soa_with_price.blueprint.h
    public final void c(@l Y41.a<G0> aVar) {
        com.avito.android.user_advert.advert.items.service_booking.i iVar = new com.avito.android.user_advert.advert.items.service_booking.i(6, aVar);
        ListItemCheckmark listItemCheckmark = this.f311880b;
        listItemCheckmark.setOnClickListener(iVar);
        if (G0.f406611a == null) {
            listItemCheckmark.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.user_advert.soa_with_price.blueprint.h
    public final void g0(@k CharSequence charSequence) {
        this.f311880b.setTitle(charSequence);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f311880b.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.soa_with_price.blueprint.h
    public final void setChecked(boolean z12) {
        this.f311880b.setChecked(z12);
    }
}
