package com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.seller.calandar_parameters.items.input.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyBookingDiscountItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/early_booking_discount/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/early_booking_discount/f;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final ListItemSwitcher f287177b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f287178c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f287179d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f287180e;

    public g(@k View view) {
        super(view);
        this.f287177b = (ListItemSwitcher) view.findViewById(R.id.early_booking_enabled_switcher);
        this.f287178c = (ViewGroup) view.findViewById(R.id.inputs_container);
        this.f287179d = new j(view, R.id.days_input_container, R.id.days_input);
        this.f287180e = new j(view, R.id.percent_input_container, R.id.percent_input);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.f
    public final void FH(@k PrintableText printableText) {
        ListItemSwitcher listItemSwitcher = this.f287177b;
        listItemSwitcher.setTitle(printableText.k0(listItemSwitcher.getContext()));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.f
    public final void W7(@k l<? super Boolean, G0> lVar) {
        this.f287177b.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(23, lVar, this));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.f
    public final void Zf(boolean z12) {
        this.f287177b.setChecked(z12);
        this.f287178c.setVisibility(!z12 ? 8 : 0);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.f
    @k
    /* renamed from: oc, reason: from getter */
    public final j getF287179d() {
        return this.f287179d;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.f
    @k
    /* renamed from: r7, reason: from getter */
    public final j getF287180e() {
        return this.f287180e;
    }
}
