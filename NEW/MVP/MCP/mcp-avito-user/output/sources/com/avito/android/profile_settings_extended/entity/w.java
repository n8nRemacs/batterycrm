package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.toggle.RegularToggleItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/w;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RegularToggleItem f230362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<RegularToggleItem> f230363c;

    public w(@Y61.k String str, @Y61.k RegularToggleItem regularToggleItem) {
        this.f230361a = str;
        this.f230362b = regularToggleItem;
        this.f230363c = Collections.singletonList(regularToggleItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return L.f(this.f230361a, wVar.f230361a) && L.f(this.f230362b, wVar.f230362b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230361a() {
        return this.f230361a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<RegularToggleItem> getItems() {
        return this.f230363c;
    }

    public final int hashCode() {
        return this.f230362b.hashCode() + (this.f230361a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ToggleWidgetItemsGroup(widgetName=" + this.f230361a + ", item=" + this.f230362b + ')';
    }
}
