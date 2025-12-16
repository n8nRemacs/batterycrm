package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lV.InterfaceC43686b;

/* compiled from: AdditionalSettingsTechBreakView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/g;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f275073f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f275074b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f275075c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f275076d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f275077e;

    /* compiled from: AdditionalSettingsTechBreakView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/list_item/ListItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ListItem> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ListItem invoke() {
            View viewFindViewById = h.this.f275074b.findViewById(R.id.item_booking_tech_break);
            if (viewFindViewById != null) {
                return (ListItem) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
    }

    /* compiled from: AdditionalSettingsTechBreakView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            int i12 = h.f275073f;
            View viewFindViewById = ((ListItem) h.this.f275076d.getValue()).findViewById(R.id.design_item_title);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public h(@k View view) {
        super(view);
        this.f275074b = view;
        this.f275075c = view.getContext();
        this.f275076d = C42727D.c(new a());
        this.f275077e = C42727D.c(new b());
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.g
    public final void la(@k AdditionalSettingsElementsContentItem additionalSettingsElementsContentItem, @k Y41.a<G0> aVar) {
        InterfaceC42726C interfaceC42726C = this.f275076d;
        ListItem listItem = (ListItem) interfaceC42726C.getValue();
        String str = additionalSettingsElementsContentItem.f275038d;
        listItem.setState((kV.b) new kV.f(str == null ? "" : str, null, additionalSettingsElementsContentItem.f275039e, null, null, false, false, null, null, 506, null));
        ListItem listItem2 = (ListItem) interfaceC42726C.getValue();
        int i12 = additionalSettingsElementsContentItem.f275037c;
        Context context = this.f275075c;
        listItem2.setStyle((InterfaceC43686b) new lV.f(null, androidx.core.content.d.getDrawable(context, i12), C35835l0.m(context, R.attr.ic_arrowRight20, R.attr.gray36), null, null, null, null, 121, null));
        ((ListItem) interfaceC42726C.getValue()).setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(22, aVar));
        AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem additionalSettingsTechBreakItem = (AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem) additionalSettingsElementsContentItem.f275040f;
        AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem.TechBreakBadgeItem techBreakBadgeItem = additionalSettingsTechBreakItem.f275061g;
        if (techBreakBadgeItem != null) {
            TextView textView = (TextView) this.f275077e.getValue();
            String str2 = str == null ? "" : str;
            AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem.TechBreakBadgeItem techBreakBadgeItem2 = additionalSettingsTechBreakItem.f275061g;
            String str3 = techBreakBadgeItem2 != null ? techBreakBadgeItem2.f275063c : null;
            com.avito.android.lib.design.badge.e.d(textView, str2, str3 == null ? "" : str3, com.avito.android.lib.util.f.a(context, techBreakBadgeItem.f275062b), "$\\text  $\\badgeText", 48);
        }
        D6.F((ListItem) interfaceC42726C.getValue(), additionalSettingsElementsContentItem.f275041g);
    }
}
