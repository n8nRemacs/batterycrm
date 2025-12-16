package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/c;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230310a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BasicInfoV2Item f230311b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<BasicInfoV2Item> f230312c;

    public c(@Y61.k BasicInfoV2Item basicInfoV2Item, @Y61.k String str) {
        this.f230310a = str;
        this.f230311b = basicInfoV2Item;
        this.f230312c = Collections.singletonList(basicInfoV2Item);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f230310a, cVar.f230310a) && L.f(this.f230311b, cVar.f230311b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230310a() {
        return this.f230310a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<BasicInfoV2Item> getItems() {
        return this.f230312c;
    }

    public final int hashCode() {
        return this.f230311b.hashCode() + (this.f230310a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "BasicInfoV2WidgetItemsGroup(widgetName=" + this.f230310a + ", item=" + this.f230311b + ')';
    }
}
