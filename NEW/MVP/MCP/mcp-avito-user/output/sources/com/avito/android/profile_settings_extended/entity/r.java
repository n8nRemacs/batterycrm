package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.setting.SettingItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/r;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class r implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230347a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SettingItem f230348b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<SettingItem> f230349c;

    public r(@Y61.k String str, @Y61.k SettingItem settingItem) {
        this.f230347a = str;
        this.f230348b = settingItem;
        this.f230349c = Collections.singletonList(settingItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f230347a, rVar.f230347a) && L.f(this.f230348b, rVar.f230348b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230347a() {
        return this.f230347a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<SettingItem> getItems() {
        return this.f230349c;
    }

    public final int hashCode() {
        return this.f230348b.hashCode() + (this.f230347a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ProfileViewPrivateWidgetItemsGroup(widgetName=" + this.f230347a + ", item=" + this.f230348b + ')';
    }
}
