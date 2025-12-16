package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.serp.adapter.serp_advert_card.i;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingTimeGapView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_timegap/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_timegap/g;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f275089d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f275090b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f275091c;

    /* compiled from: BookingTimeGapView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/list_item/ListItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ListItem> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ListItem invoke() {
            View viewFindViewById = h.this.f275090b.findViewById(R.id.item_booking_time_gap);
            if (viewFindViewById != null) {
                return (ListItem) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
    }

    public h(@k View view) {
        super(view);
        this.f275090b = view;
        this.f275091c = C42727D.c(new a());
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.g
    public final void la(@k AdditionalSettingsElementsContentItem additionalSettingsElementsContentItem, @k Y41.a<G0> aVar) {
        InterfaceC42726C interfaceC42726C = this.f275091c;
        D6.F((ListItem) interfaceC42726C.getValue(), additionalSettingsElementsContentItem.f275041g);
        ((ListItem) interfaceC42726C.getValue()).setTitle(additionalSettingsElementsContentItem.f275038d);
        ((ListItem) interfaceC42726C.getValue()).setMessage(additionalSettingsElementsContentItem.f275039e);
        ListItem.i((ListItem) interfaceC42726C.getValue(), androidx.core.content.d.getDrawable(this.f275090b.getContext(), additionalSettingsElementsContentItem.f275037c));
        ((ListItem) interfaceC42726C.getValue()).setOnClickListener(new i(23, aVar));
    }
}
