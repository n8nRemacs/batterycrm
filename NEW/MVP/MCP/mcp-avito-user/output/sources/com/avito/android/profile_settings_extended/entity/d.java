package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/d;", "Lcom/avito/android/profile_settings_extended/entity/v;", "Lcom/avito/android/profile_settings_extended/entity/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d implements v, e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230313a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedSettingsCarouselItem f230314b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ExtendedSettingsCarouselItem> f230315c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f230316d;

    public d(@Y61.k String str, @Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
        this.f230313a = str;
        this.f230314b = extendedSettingsCarouselItem;
        this.f230315c = Collections.singletonList(extendedSettingsCarouselItem);
        this.f230316d = extendedSettingsCarouselItem.f229283d;
    }

    public static d c(d dVar, ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
        String str = dVar.f230313a;
        dVar.getClass();
        return new d(str, extendedSettingsCarouselItem);
    }

    @Override // com.avito.android.profile_settings_extended.entity.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF230316d() {
        return this.f230316d;
    }

    @Override // com.avito.android.profile_settings_extended.entity.e
    @Y61.k
    public final e b(@Y61.k CommonValueId commonValueId) {
        ExtendedSettingsCarouselItem extendedSettingsCarouselItem = this.f230314b;
        return L.f(extendedSettingsCarouselItem.f229283d, commonValueId.f230265b) ? c(this, ExtendedSettingsCarouselItem.a(extendedSettingsCarouselItem, null, null, 95)) : this;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f230313a, dVar.f230313a) && L.f(this.f230314b, dVar.f230314b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230313a() {
        return this.f230313a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<ExtendedSettingsCarouselItem> getItems() {
        return this.f230315c;
    }

    public final int hashCode() {
        return this.f230314b.hashCode() + (this.f230313a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "CarouselEditWidgetItemsGroup(widgetName=" + this.f230313a + ", item=" + this.f230314b + ')';
    }
}
