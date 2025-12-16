package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.alert.PromoBlockItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/o;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class o implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230338a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PromoBlockItem f230339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<PromoBlockItem> f230340c;

    public o(@Y61.k String str, @Y61.k PromoBlockItem promoBlockItem) {
        this.f230338a = str;
        this.f230339b = promoBlockItem;
        this.f230340c = Collections.singletonList(promoBlockItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f230338a, oVar.f230338a) && L.f(this.f230339b, oVar.f230339b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230338a() {
        return this.f230338a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<PromoBlockItem> getItems() {
        return this.f230340c;
    }

    public final int hashCode() {
        return this.f230339b.hashCode() + (this.f230338a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ProfileBannerPrivateWidgetItemsGroup(widgetName=" + this.f230338a + ", item=" + this.f230339b + ')';
    }
}
