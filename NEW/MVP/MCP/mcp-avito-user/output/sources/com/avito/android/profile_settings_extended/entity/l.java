package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.popup_banner.PopupBannerItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/l;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class l implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230333a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PopupBannerItem f230334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<PopupBannerItem> f230335c;

    public l(@Y61.k String str, @Y61.k PopupBannerItem popupBannerItem) {
        this.f230333a = str;
        this.f230334b = popupBannerItem;
        this.f230335c = Collections.singletonList(popupBannerItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f230333a, lVar.f230333a) && L.f(this.f230334b, lVar.f230334b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230333a() {
        return this.f230333a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<PopupBannerItem> getItems() {
        return this.f230335c;
    }

    public final int hashCode() {
        return this.f230334b.hashCode() + (this.f230333a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "PopupBannerWidgetItemsGroup(widgetName=" + this.f230333a + ", item=" + this.f230334b + ')';
    }
}
