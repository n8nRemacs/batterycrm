package com.avito.android.service_booking_common.blueprints.price_list;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbPriceListViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/price_list/e;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f276479e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.asynclayoutinflater.view.a f276480b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f276481c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f276482d;

    public e(@k View view) {
        super(view);
        this.f276480b = new androidx.asynclayoutinflater.view.a(view.getContext());
        this.f276481c = (TextView) view.findViewById(R.id.sb_price_list_title);
        this.f276482d = (ViewGroup) view.findViewById(R.id.sb_price_list_container);
    }
}
