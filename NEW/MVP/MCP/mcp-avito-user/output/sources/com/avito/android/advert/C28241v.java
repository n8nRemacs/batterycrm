package com.avito.android.advert;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.di.module.C30070i4;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsResourcesProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/v;", "Lcom/avito/android/advert/u;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28241v implements InterfaceC28240u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f81000a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f81001b;

    @Inject
    public C28241v(@C30070i4.h @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k Resources resources) {
        this.f81000a = bVar;
        this.f81001b = resources;
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String a() {
        return this.f81001b.getString(R.string.advert_details_advert_unknown_error);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String b() {
        return this.f81001b.getString(R.string.advert_details_price_list_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String c() {
        return this.f81001b.getString(R.string.advert_details_leasing_calculator_benefits_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String d() {
        return this.f81001b.getString(R.string.advert_details_gig_description_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String e() {
        return this.f81001b.getString(R.string.advert_details_consultation_subtitle);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String f() {
        return this.f81001b.getString(R.string.advert_details_flats_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String g() {
        return this.f81001b.getString(R.string.advert_details_description_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String getAddress() {
        return this.f81001b.getString(R.string.advert_details_address);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String h(@Y61.k String str) {
        return this.f81001b.getString(R.string.advert_details_leasing_link_title, str);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String i() {
        return this.f81001b.getString(R.string.advert_details_leasing_link_text);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String j(@Y61.l Long l12, @Y61.k String str) {
        return this.f81001b.getString(R.string.advert_core_rds_advert_number_template, str, this.f81000a.a(l12, TimeUnit.SECONDS));
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String k() {
        return this.f81001b.getString(R.string.advert_details_advert_repeat);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String l() {
        return this.f81001b.getString(R.string.advert_details_advert_added_to_fav);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String m() {
        return this.f81001b.getString(R.string.advert_details_advert_removed_from_fav);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String n() {
        return this.f81001b.getString(R.string.advert_details_consultation_button_text);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String o() {
        return this.f81001b.getString(R.string.advert_details_hotel_location_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String p() {
        return this.f81001b.getString(R.string.advert_details_consultation_title);
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String q(int i12) {
        return this.f81001b.getQuantityString(R.plurals.advert_details_views, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.advert.InterfaceC28240u
    @Y61.k
    public final String r() {
        return this.f81001b.getString(R.string.advert_details_goods_description_title);
    }
}
