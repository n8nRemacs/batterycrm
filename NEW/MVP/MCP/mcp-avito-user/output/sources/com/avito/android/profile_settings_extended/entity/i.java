package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.geo.ExtendedSettingsGeoItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsListItemGroup.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/i;", "Lcom/avito/android/profile_settings_extended/entity/v;", "Lcom/avito/android/profile_settings_extended/entity/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class i implements v, e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedSettingsGeoItem f230323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ExtendedSettingsGeoItem> f230324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f230325d;

    public i(@Y61.k String str, @Y61.k ExtendedSettingsGeoItem extendedSettingsGeoItem) {
        this.f230322a = str;
        this.f230323b = extendedSettingsGeoItem;
        this.f230324c = Collections.singletonList(extendedSettingsGeoItem);
        this.f230325d = extendedSettingsGeoItem.f229450c;
    }

    @Override // com.avito.android.profile_settings_extended.entity.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF230325d() {
        return this.f230325d;
    }

    @Override // com.avito.android.profile_settings_extended.entity.e
    @Y61.k
    public final e b(@Y61.k CommonValueId commonValueId) {
        ArrayList arrayList;
        ExtendedSettingsGeoItem extendedSettingsGeoItem = this.f230323b;
        if (!L.f(extendedSettingsGeoItem.f229450c, commonValueId.f230265b)) {
            return this;
        }
        List<AddressValue> list = extendedSettingsGeoItem.f229455h;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!L.f(((AddressValue) obj).f230253b.f145900b.f230266c, commonValueId.f230266c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        String str = extendedSettingsGeoItem.f229449b;
        String str2 = extendedSettingsGeoItem.f229450c;
        String str3 = extendedSettingsGeoItem.f229451d;
        String str4 = extendedSettingsGeoItem.f229452e;
        String str5 = extendedSettingsGeoItem.f229453f;
        Integer num = extendedSettingsGeoItem.f229454g;
        boolean z12 = extendedSettingsGeoItem.f229456i;
        extendedSettingsGeoItem.getClass();
        return new i(this.f230322a, new ExtendedSettingsGeoItem(str, str2, str3, str4, str5, num, arrayList2, z12));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f230322a, iVar.f230322a) && L.f(this.f230323b, iVar.f230323b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230322a() {
        return this.f230322a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<ExtendedSettingsGeoItem> getItems() {
        return this.f230324c;
    }

    public final int hashCode() {
        return this.f230323b.hashCode() + (this.f230322a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "GeoWidgetItemsGroup(widgetName=" + this.f230322a + ", item=" + this.f230323b + ')';
    }
}
