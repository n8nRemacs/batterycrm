package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/s;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class s implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectItem f230351b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<SelectItem> f230352c;

    public s(@Y61.k SelectItem selectItem, @Y61.k String str) {
        this.f230350a = str;
        this.f230351b = selectItem;
        this.f230352c = Collections.singletonList(selectItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f230350a, sVar.f230350a) && L.f(this.f230351b, sVar.f230351b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230350a() {
        return this.f230350a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<SelectItem> getItems() {
        return this.f230352c;
    }

    public final int hashCode() {
        return this.f230351b.hashCode() + (this.f230350a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SelectWidgetItemsGroup(widgetName=" + this.f230350a + ", item=" + this.f230351b + ')';
    }
}
