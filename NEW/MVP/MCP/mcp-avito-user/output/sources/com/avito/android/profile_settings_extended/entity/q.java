package com.avito.android.profile_settings_extended.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.ReAgentShortFlowCreationBannerItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/q;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class q implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230344a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReAgentShortFlowCreationBannerItem f230345b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ReAgentShortFlowCreationBannerItem> f230346c;

    public q(@Y61.k String str, @Y61.k ReAgentShortFlowCreationBannerItem reAgentShortFlowCreationBannerItem) {
        this.f230344a = str;
        this.f230345b = reAgentShortFlowCreationBannerItem;
        this.f230346c = Collections.singletonList(reAgentShortFlowCreationBannerItem);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f230344a, qVar.f230344a) && L.f(this.f230345b, qVar.f230345b);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230344a() {
        return this.f230344a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<ReAgentShortFlowCreationBannerItem> getItems() {
        return this.f230346c;
    }

    public final int hashCode() {
        return this.f230345b.hashCode() + (this.f230344a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ProfileBannerReAgentShortFlowCreationWidgetItemsGroup(widgetName=" + this.f230344a + ", item=" + this.f230345b + ')';
    }
}
