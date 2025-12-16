package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.ReAgentEmptyInfoBannerItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/p;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class p implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230341a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReAgentEmptyInfoBannerItem f230342b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ReAgentEmptyInfoBannerItem> f230343c;

    public p(@Y61.k String str, @Y61.k ReAgentEmptyInfoBannerItem reAgentEmptyInfoBannerItem) {
        this.f230341a = str;
        this.f230342b = reAgentEmptyInfoBannerItem;
        this.f230343c = Collections.singletonList(reAgentEmptyInfoBannerItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f230341a, pVar.f230341a) && L.f(this.f230342b, pVar.f230342b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230341a() {
        return this.f230341a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<ReAgentEmptyInfoBannerItem> getItems() {
        return this.f230343c;
    }

    public final int hashCode() {
        return this.f230342b.hashCode() + (this.f230341a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ProfileBannerReAgentEmptyInfoWidgetItemsGroup(widgetName=" + this.f230341a + ", item=" + this.f230342b + ')';
    }
}
