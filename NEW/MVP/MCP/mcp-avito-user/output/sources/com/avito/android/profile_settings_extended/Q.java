package com.avito.android.profile_settings_extended;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsResourceProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/Q;", "Lcom/avito/android/profile_settings_extended/P;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f229074a;

    @Inject
    public Q(@Y61.k Resources resources) {
        this.f229074a = resources;
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String a(@Y61.k String str) {
        return this.f229074a.getString(R.string.extended_profile_settings_phone_removed, str);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String[] b() {
        return this.f229074a.getStringArray(R.array.week_days_short);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String c() {
        return this.f229074a.getString(R.string.extended_profile_settings_selection_link_copied);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String d(@Y61.k String str) {
        return this.f229074a.getString(R.string.verification_status_stub_title, str);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String e() {
        return this.f229074a.getString(R.string.extended_profile_settings_city_number_is_being_verified_support_link_title);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String f() {
        return this.f229074a.getString(R.string.schedule_around_the_clock);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String g() {
        return this.f229074a.getString(R.string.extended_profile_settings_city_number_is_being_verified_header_1);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String h() {
        return this.f229074a.getString(R.string.extended_profile_settings_personal_link_copied);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String i() {
        return this.f229074a.getString(R.string.network_unavailable_snack);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String j() {
        return this.f229074a.getString(R.string.extended_profile_settings_city_number_is_being_verified_header_2);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String k() {
        return this.f229074a.getString(R.string.week_days_work);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String l() {
        return this.f229074a.getString(R.string.schedule_without_break);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String m() {
        return this.f229074a.getString(R.string.week_days_off);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String n() {
        return this.f229074a.getString(R.string.extended_profile_settings_user_id_copied);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String o() {
        return this.f229074a.getString(R.string.extended_profile_settings_selection_created);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String p() {
        return this.f229074a.getString(R.string.week_days_all);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String q() {
        return this.f229074a.getString(R.string.verification_status_stub_subtitle);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String r() {
        return this.f229074a.getString(R.string.extended_profile_settings_city_number_is_being_verified_description);
    }

    @Override // com.avito.android.profile_settings_extended.P
    @Y61.k
    public final String s(@Y61.k String str) {
        return this.f229074a.getString(R.string.schedule_break, str);
    }
}
