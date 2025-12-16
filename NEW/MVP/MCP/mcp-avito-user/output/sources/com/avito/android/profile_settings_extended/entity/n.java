package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/n;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class n implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230336a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f230337b;

    public n(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f230336a = str;
        this.f230337b = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f230336a.equals(nVar.f230336a) && this.f230337b.equals(nVar.f230337b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230336a() {
        return this.f230336a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f230337b;
    }

    public final int hashCode() {
        return this.f230337b.hashCode() + (this.f230336a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileBadgesWidgetItemsGroup(widgetName=");
        sb2.append(this.f230336a);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f230337b, ')');
    }
}
