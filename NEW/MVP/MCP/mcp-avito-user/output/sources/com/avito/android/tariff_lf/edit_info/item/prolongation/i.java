package com.avito.android.tariff_lf.edit_info.item.prolongation;

import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffProlongationItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/prolongation/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/prolongation/h;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f299056b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f299057c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f299058d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f299059e;

    public i(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f299056b = view;
        this.f299057c = aVar;
        View viewFindViewById = view.findViewById(R.id.prolongation_switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById;
        this.f299059e = listItemSwitcher;
        listItemSwitcher.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 5));
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.prolongation.h
    public final void TB(boolean z12) {
        this.f299059e.setEnabled(z12);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.prolongation.h
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f299058d = aVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.prolongation.h
    public final void pM(boolean z12) {
        this.f299059e.setChecked(z12);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.prolongation.h
    public final void setTitle(@Y61.k String str) {
        this.f299059e.setTitle(str);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.prolongation.h
    public final void xt(@l AttributedText attributedText) {
        this.f299059e.setMessage(this.f299057c.c(this.f299056b.getContext(), attributedText));
    }
}
