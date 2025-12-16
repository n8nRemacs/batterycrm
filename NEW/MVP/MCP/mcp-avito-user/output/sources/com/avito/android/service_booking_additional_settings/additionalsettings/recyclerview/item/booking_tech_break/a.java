package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdditionalSettingsTechBreakBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/a;", "LTV0/b;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/g;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<g, AdditionalSettingsElementsContentItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f275064a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f275065b = new g.a<>(R.layout.srv_list_item_tech_break, C8155a.f275066l);

    /* compiled from: AdditionalSettingsTechBreakBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.a$a, reason: collision with other inner class name */
    public static final class C8155a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8155a f275066l = new C8155a();

        public C8155a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f275064a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f275064a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f275065b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AdditionalSettingsElementsContentItem) && (((AdditionalSettingsElementsContentItem) aVar).f275040f instanceof AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem);
    }
}
