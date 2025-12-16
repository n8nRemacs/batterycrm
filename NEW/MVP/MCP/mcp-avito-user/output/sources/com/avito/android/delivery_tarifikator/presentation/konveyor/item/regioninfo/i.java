package com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RegionInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/regioninfo/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/regioninfo/h;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f135397e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f135398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f135399c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f135400d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.region_name_tv);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135398b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.region_info_tv);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135399c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.region_delivery_info_tv);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135400d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.h
    public final void nZ(@k c cVar, @k d dVar) {
        this.f135398b.setText(cVar.f135391c);
        this.f135399c.setText(cVar.f135392d);
        this.f135400d.setText(cVar.f135393e);
        this.itemView.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(11, dVar, cVar));
    }
}
