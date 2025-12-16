package com.avito.android.tariff_lf_constructor.configure.size.items.size;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConfigureSizeItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/items/size/i;", "Lcom/avito/android/tariff_lf_constructor/configure/size/items/size/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f300323b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f300324c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListItemRadio f300325d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ShimmerLayout f300326e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f300327f;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f300323b = view;
        this.f300324c = aVar;
        View viewFindViewById = view.findViewById(R.id.radio_list_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemRadio");
        }
        ListItemRadio listItemRadio = (ListItemRadio) viewFindViewById;
        this.f300325d = listItemRadio;
        View viewFindViewById2 = view.findViewById(R.id.shimmer_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f300326e = (ShimmerLayout) viewFindViewById2;
        listItemRadio.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 13));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.h
    public final void K4(boolean z12) {
        this.f300326e.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.h
    public final void g(@l AttributedText attributedText) {
        this.f300325d.setMessage(this.f300324c.c(this.f300323b.getContext(), attributedText));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.h
    public final void n0(@l String str) {
        this.f300325d.setSubtitle(str);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.h
    public final void p3(@k Y41.a<G0> aVar) {
        this.f300327f = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.h
    public final void setSelected(boolean z12) {
        this.f300325d.setChecked(z12);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.h
    public final void setTitle(@k String str) {
        this.f300325d.setTitle(str);
    }
}
