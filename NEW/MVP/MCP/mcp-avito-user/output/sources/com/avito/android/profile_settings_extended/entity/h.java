package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/h;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class h implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230320a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f230321b;

    public h(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f230320a = str;
        this.f230321b = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f230320a.equals(hVar.f230320a) && this.f230321b.equals(hVar.f230321b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230320a() {
        return this.f230320a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f230321b;
    }

    public final int hashCode() {
        return this.f230321b.hashCode() + (this.f230320a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeoV2WidgetItemsGroup(widgetName=");
        sb2.append(this.f230320a);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f230321b, ')');
    }
}
