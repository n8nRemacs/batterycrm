package com.avito.android.service_booking_day_settings.daysettings.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import xt0.C49997a;

/* compiled from: SettingsBreakItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/adapter/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/adapter/j;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f276744g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f276745b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BaseSelect f276746c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BaseSelect f276747d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f276748e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f276749f;

    public k(@Y61.k View view) {
        super(view);
        this.f276745b = view;
        this.f276746c = (BaseSelect) view.findViewById(R.id.break_input_start);
        this.f276747d = (BaseSelect) view.findViewById(R.id.break_input_end);
        this.f276748e = (ImageView) view.findViewById(R.id.break_delete);
        this.f276749f = (TextView) view.findViewById(R.id.breaks_description);
    }

    public static void B80(Input input, org.threeten.bp.g gVar, boolean z12) {
        Input.t(input, gVar != null ? C49997a.a(gVar) : null, false, 6);
        Input.f179303W.getClass();
        input.setState(z12 ? Input.f179305b0 : Input.f179304a0);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void Cu(@Y61.k Y41.a aVar, boolean z12) {
        this.f276748e.setOnClickListener(new com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.g(z12, aVar, 1));
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void IM(@Y61.k Y41.a<G0> aVar) {
        this.f276747d.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(1, aVar));
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void Oq(@Y61.k TimeSelect timeSelect) {
        B80(this.f276746c, timeSelect.f276729b, timeSelect.f276730c);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void SQ(@Y61.l BreakDescription breakDescription) {
        TextView textView = this.f276749f;
        if (breakDescription == null) {
            D6.w(textView);
            return;
        }
        D6.H(textView);
        com.avito.android.printable_text.a.c(textView, breakDescription.f276720b);
        UniversalColor universalColor = breakDescription.f276721c;
        if (universalColor != null) {
            textView.setTextColor(C48063a.f437606a.a(this.f276745b.getContext(), universalColor));
        }
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void g50(@Y61.k TimeSelect timeSelect) {
        B80(this.f276747d, timeSelect.f276729b, timeSelect.f276730c);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void kQ(boolean z12) {
        D6.G(this.f276748e, z12);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void setEnabled(boolean z12) {
        this.f276746c.setEnabled(z12);
        this.f276747d.setEnabled(z12);
        this.f276748e.setEnabled(z12);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.adapter.j
    public final void zp(@Y61.k Y41.a<G0> aVar) {
        this.f276746c.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(2, aVar));
    }
}
