package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/t;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class t implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectionsItem f230354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<SelectionsItem> f230355c;

    public t(@Y61.k String str, @Y61.k SelectionsItem selectionsItem) {
        this.f230353a = str;
        this.f230354b = selectionsItem;
        this.f230355c = Collections.singletonList(selectionsItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f230353a, tVar.f230353a) && L.f(this.f230354b, tVar.f230354b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230353a() {
        return this.f230353a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<SelectionsItem> getItems() {
        return this.f230355c;
    }

    public final int hashCode() {
        return this.f230354b.hashCode() + (this.f230353a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SelectionsWidgetItemsGroup(widgetName=" + this.f230353a + ", item=" + this.f230354b + ')';
    }
}
