package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.phones.ExtendedSettingsPhonesItem;
import com.avito.android.profile_settings_extended.adapter.phones.PhoneValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsListItemGroup.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/k;", "Lcom/avito/android/profile_settings_extended/entity/v;", "Lcom/avito/android/profile_settings_extended/entity/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class k implements v, e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230329a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedSettingsPhonesItem f230330b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ExtendedSettingsPhonesItem> f230331c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f230332d;

    public k(@Y61.k String str, @Y61.k ExtendedSettingsPhonesItem extendedSettingsPhonesItem) {
        this.f230329a = str;
        this.f230330b = extendedSettingsPhonesItem;
        this.f230331c = Collections.singletonList(extendedSettingsPhonesItem);
        this.f230332d = extendedSettingsPhonesItem.f229675c;
    }

    @Override // com.avito.android.profile_settings_extended.entity.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF230332d() {
        return this.f230332d;
    }

    @Override // com.avito.android.profile_settings_extended.entity.e
    @Y61.k
    public final e b(@Y61.k CommonValueId commonValueId) {
        ExtendedSettingsPhonesItem extendedSettingsPhonesItem = this.f230330b;
        if (!L.f(extendedSettingsPhonesItem.f229675c, commonValueId.f230265b)) {
            return this;
        }
        List<PhoneValue> list = extendedSettingsPhonesItem.f229682j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!L.f(((PhoneValue) obj).f229694b.f229689b.f230266c, commonValueId.f230266c)) {
                arrayList.add(obj);
            }
        }
        return new k(this.f230329a, ExtendedSettingsPhonesItem.a(extendedSettingsPhonesItem, arrayList));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f230329a, kVar.f230329a) && L.f(this.f230330b, kVar.f230330b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230329a() {
        return this.f230329a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<ExtendedSettingsPhonesItem> getItems() {
        return this.f230331c;
    }

    public final int hashCode() {
        return this.f230330b.hashCode() + (this.f230329a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "PhonesWidgetItemsGroup(widgetName=" + this.f230329a + ", item=" + this.f230330b + ')';
    }
}
