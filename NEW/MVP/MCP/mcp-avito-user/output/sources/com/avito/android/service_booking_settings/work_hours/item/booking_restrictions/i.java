package com.avito.android.service_booking_settings.work_hours.item.booking_restrictions;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.Option;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BookingTimeRestrictionsItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/booking_restrictions/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_settings/work_hours/item/booking_restrictions/h;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f277954f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f277955b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f277956c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f277957d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f277958e;

    public i(@k View view) {
        super(view);
        this.f277955b = view;
        View viewFindViewById = view.findViewById(R.id.sb_restrictions_select);
        ((Input) viewFindViewById).setClearButtonTint(C35835l0.e(R.attr.black, view.getContext()));
        this.f277956c = (Input) viewFindViewById;
        this.f277957d = (TextView) view.findViewById(R.id.sb_restrictions_title);
        this.f277958e = (TextView) view.findViewById(R.id.sb_restrictions_subtitle);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void HA(@l Option option) {
        Input.t(this.f277956c, option != null ? option.f278054c : null, false, 6);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void f(@k String str) {
        this.f277958e.setText(str);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void hn(@k Y41.a<G0> aVar) {
        this.f277956c.setClearButtonClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(4, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Input input = this.f277956c;
        input.setOnClickListener(null);
        input.setClearButtonClickListener(null);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void setEnabled(boolean z12) {
        D6.F(this.f277955b, z12);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void setHint(@l String str) {
        this.f277956c.setHint(str);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void setInputClickListener(@k Y41.a<G0> aVar) {
        this.f277956c.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(3, aVar));
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.h
    public final void setTitle(@k String str) {
        this.f277957d.setText(str);
    }
}
