package com.avito.android.service_booking_common.blueprints.date.timeslot_list;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_booking_common.di.F;
import com.avito.android.util.InterfaceC35945t1;
import kotlin.Metadata;

/* compiled from: SbTimeslotListItemViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/i;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f276403g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<Long> f276404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f276405c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f276406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f276407e;

    /* renamed from: f, reason: collision with root package name */
    public final int f276408f;

    public i(@k View view, @F @k InterfaceC35945t1<Long> interfaceC35945t1) {
        super(view);
        this.f276404b = interfaceC35945t1;
        this.f276405c = (Button) view;
        this.f276406d = view.getContext();
        this.f276407e = R.attr.buttonPrimaryMedium;
        this.f276408f = R.attr.buttonSecondaryMedium;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }
}
