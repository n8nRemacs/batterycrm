package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/j;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class j implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230326a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkEditItem f230327b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<LinkEditItem> f230328c;

    public j(@Y61.k String str, @Y61.k LinkEditItem linkEditItem) {
        this.f230326a = str;
        this.f230327b = linkEditItem;
        this.f230328c = Collections.singletonList(linkEditItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f230326a, jVar.f230326a) && L.f(this.f230327b, jVar.f230327b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230326a() {
        return this.f230326a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<LinkEditItem> getItems() {
        return this.f230328c;
    }

    public final int hashCode() {
        return this.f230327b.hashCode() + (this.f230326a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "LinkEditWidgetItemsGroup(widgetName=" + this.f230326a + ", item=" + this.f230327b + ')';
    }
}
