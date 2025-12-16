package com.avito.android.settings;

import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.util.darkTheme.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SettingsResourceProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/settings/l;", "Lcom/avito/android/settings/k;", "LTv0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k, InterfaceC15415a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f280891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15415a f280892b;

    @Inject
    public l(@Y61.k Resources resources, @Y61.k InterfaceC15415a interfaceC15415a) {
        this.f280891a = resources;
        this.f280892b = interfaceC15415a;
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String a() {
        return this.f280891a.getString(R.string.region_for_search);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f280891a.getString(R.string.device_id, str);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String c() {
        return this.f280891a.getString(R.string.clear_search_history_fail);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String d() {
        return this.f280891a.getString(R.string.help);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String e(@Y61.k a.AbstractC5328a abstractC5328a) {
        boolean zEquals = abstractC5328a.equals(a.AbstractC5328a.d.f181344b);
        Resources resources = this.f280891a;
        if (zEquals) {
            return resources.getString(R.string.light_mode_title);
        }
        if (abstractC5328a.equals(a.AbstractC5328a.b.f181342b)) {
            return resources.getString(R.string.dark_mode_title);
        }
        if (abstractC5328a.equals(a.AbstractC5328a.C5329a.f181341b)) {
            return resources.getString(R.string.auto_battery_mode_title);
        }
        if (abstractC5328a.equals(a.AbstractC5328a.c.f181343b)) {
            return resources.getBoolean(R.bool.is_tablet) ? resources.getString(R.string.tablet_follow_system_mode_title) : resources.getString(R.string.follow_system_mode_title);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String f() {
        return this.f280891a.getString(R.string.ui_theme);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String g() {
        return this.f280891a.getString(R.string.about_app);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String h() {
        return this.f280891a.getString(R.string.clear_search_history);
    }

    @Override // Tv0.InterfaceC15415a
    @Y61.k
    public final String i() {
        return this.f280892b.i();
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String j() {
        return this.f280891a.getString(R.string.settings_notifications);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String k() {
        return this.f280891a.getString(R.string.rec_technologies);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String l() {
        return this.f280891a.getString(R.string.read_apps_licence);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String m() {
        return this.f280891a.getString(R.string.language_selector);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String n() {
        return this.f280891a.getString(R.string.open_source_licences);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String o() {
        return this.f280891a.getString(R.string.settings_replace_main_error);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String p() {
        return this.f280891a.getString(R.string.avito_care);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String q() {
        return this.f280891a.getString(R.string.b2b_hub);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String r() {
        return this.f280891a.getString(R.string.clear_search_history_success);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String s() {
        return this.f280891a.getString(R.string.licenses_and_agreements);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String t() {
        return this.f280891a.getString(R.string.read_offer);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String v(int i12, @Y61.k String str, @Y61.k String str2) {
        return this.f280891a.getString(R.string.version_template, str, Integer.valueOf(i12), str2);
    }

    @Override // com.avito.android.settings.k
    @Y61.k
    public final String y() {
        return this.f280891a.getString(R.string.rules_of_avito);
    }
}
