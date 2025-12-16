package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.about.AboutItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/a;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230304a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AboutItem f230305b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<AboutItem> f230306c;

    public a(@Y61.k String str, @Y61.k AboutItem aboutItem) {
        this.f230304a = str;
        this.f230305b = aboutItem;
        this.f230306c = Collections.singletonList(aboutItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f230304a, aVar.f230304a) && L.f(this.f230305b, aVar.f230305b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230304a() {
        return this.f230304a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<AboutItem> getItems() {
        return this.f230306c;
    }

    public final int hashCode() {
        return this.f230305b.hashCode() + (this.f230304a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "AboutWidgetItemsGroup(widgetName=" + this.f230304a + ", item=" + this.f230305b + ')';
    }
}
