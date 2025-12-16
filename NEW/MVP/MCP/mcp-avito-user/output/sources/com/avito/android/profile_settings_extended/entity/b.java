package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.banner.ExtendedSettingsBannerItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/b;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230307a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedSettingsBannerItem f230308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ExtendedSettingsBannerItem> f230309c;

    public b(@Y61.k String str, @Y61.k ExtendedSettingsBannerItem extendedSettingsBannerItem) {
        this.f230307a = str;
        this.f230308b = extendedSettingsBannerItem;
        this.f230309c = Collections.singletonList(extendedSettingsBannerItem);
    }

    public static b a(b bVar, ExtendedSettingsBannerItem extendedSettingsBannerItem) {
        String str = bVar.f230307a;
        bVar.getClass();
        return new b(str, extendedSettingsBannerItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f230307a, bVar.f230307a) && L.f(this.f230308b, bVar.f230308b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230307a() {
        return this.f230307a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<ExtendedSettingsBannerItem> getItems() {
        return this.f230309c;
    }

    public final int hashCode() {
        return this.f230308b.hashCode() + (this.f230307a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "BannerWidgetItemsGroup(widgetName=" + this.f230307a + ", item=" + this.f230308b + ')';
    }
}
