package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingToggleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_toggle/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_toggle/g;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f275101d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f275102b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f275103c;

    /* compiled from: BookingToggleView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/list_item/ListItemSwitcher;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ListItemSwitcher> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ListItemSwitcher invoke() {
            View viewFindViewById = h.this.f275102b.findViewById(R.id.item_booking);
            if (viewFindViewById != null) {
                return (ListItemSwitcher) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
    }

    public h(@k View view) {
        super(view);
        this.f275102b = view;
        this.f275103c = C42727D.c(new a());
    }

    public final ListItemSwitcher B80() {
        return (ListItemSwitcher) this.f275103c.getValue();
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.g
    public final void OF(@k AdditionalSettingsElementsContentItem additionalSettingsElementsContentItem, @k l<? super Boolean, G0> lVar) {
        D6.F(B80(), additionalSettingsElementsContentItem.f275041g);
        B80().setTitle(additionalSettingsElementsContentItem.f275038d);
        B80().setMessage(additionalSettingsElementsContentItem.f275039e);
        ListItemSwitcher listItemSwitcherB80 = B80();
        AdditionalSettingsElementsContentItem.AdditionalSettingsElementsSpecific additionalSettingsElementsSpecific = additionalSettingsElementsContentItem.f275040f;
        AdditionalSettingsElementsContentItem.AdditionalSettingsElementBookingToggle additionalSettingsElementBookingToggle = additionalSettingsElementsSpecific instanceof AdditionalSettingsElementsContentItem.AdditionalSettingsElementBookingToggle ? (AdditionalSettingsElementsContentItem.AdditionalSettingsElementBookingToggle) additionalSettingsElementsSpecific : null;
        listItemSwitcherB80.setChecked(additionalSettingsElementBookingToggle != null ? L.f(additionalSettingsElementBookingToggle.f275043b, Boolean.TRUE) : false);
        B80().setImageDrawable(androidx.core.content.d.getDrawable(this.f275102b.getContext(), additionalSettingsElementsContentItem.f275037c));
        B80().setOnClickListener(new com.avito.android.seller_promotions.b(4, lVar));
    }
}
