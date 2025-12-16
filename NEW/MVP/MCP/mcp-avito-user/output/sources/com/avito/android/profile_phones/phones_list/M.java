package com.avito.android.profile_phones.phones_list;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhonesListResourceProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/M;", "Lcom/avito/android/profile_phones/phones_list/L;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f227347a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f227348b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f227349c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f227350d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f227351e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f227352f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f227353g;

    @Inject
    public M(@Y61.k Resources resources) {
        this.f227347a = resources;
        this.f227348b = resources.getString(R.string.iac_picker_any_time);
        this.f227349c = resources.getString(R.string.phone_status_not_verified);
        this.f227350d = resources.getString(R.string.phone_status_on_verification);
        this.f227351e = resources.getString(R.string.phone_not_used);
        this.f227352f = resources.getString(R.string.phone_remove_button_text);
        this.f227353g = resources.getString(R.string.settings_iac_current_device);
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    public final String a(@Y61.k String str) {
        return this.f227347a.getString(R.string.settings_iac_dots_args, this.f227353g, str);
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF227352f() {
        return this.f227352f;
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF227348b() {
        return this.f227348b;
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF227350d() {
        return this.f227350d;
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF227351e() {
        return this.f227351e;
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    public final String f(@Y61.k String str) {
        return this.f227347a.getString(R.string.settings_iac_device_slug, str);
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getF227353g() {
        return this.f227353g;
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    public final String h(int i12) {
        return this.f227347a.getQuantityString(R.plurals.adverts_count, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.profile_phones.phones_list.L
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final String getF227349c() {
        return this.f227349c;
    }
}
