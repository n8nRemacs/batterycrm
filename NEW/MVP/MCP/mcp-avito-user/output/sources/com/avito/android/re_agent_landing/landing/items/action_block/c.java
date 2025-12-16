package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/c;", "Lcom/avito/conveyor_item/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250735b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ActionStatus f250736c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f250737d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f250738e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UniversalImage f250739f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final j f250740g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ReAgentProfileCreateLandingFlowsData f250741h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f250742i;

    public c(String str, ActionStatus actionStatus, String str2, String str3, UniversalImage universalImage, j jVar, ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData, String str4, int i12, C42822w c42822w) {
        this.f250735b = (i12 & 1) != 0 ? "action_block_item" : str;
        this.f250736c = actionStatus;
        this.f250737d = str2;
        this.f250738e = str3;
        this.f250739f = universalImage;
        this.f250740g = jVar;
        this.f250741h = reAgentProfileCreateLandingFlowsData;
        this.f250742i = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f250735b, cVar.f250735b) && this.f250736c == cVar.f250736c && L.f(this.f250737d, cVar.f250737d) && L.f(this.f250738e, cVar.f250738e) && L.f(this.f250739f, cVar.f250739f) && L.f(this.f250740g, cVar.f250740g) && L.f(this.f250741h, cVar.f250741h) && L.f(this.f250742i, cVar.f250742i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF73058b() {
        return getF200017b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200017b() {
        return this.f250735b;
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(H.d(H.d((this.f250736c.hashCode() + (this.f250735b.hashCode() * 31)) * 31, 31, this.f250737d), 31, this.f250738e), 31, this.f250739f);
        j jVar = this.f250740g;
        int iHashCode = (iA2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData = this.f250741h;
        int iHashCode2 = (iHashCode + (reAgentProfileCreateLandingFlowsData == null ? 0 : reAgentProfileCreateLandingFlowsData.hashCode())) * 31;
        String str = this.f250742i;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionBlockItem(stringId=");
        sb2.append(this.f250735b);
        sb2.append(", status=");
        sb2.append(this.f250736c);
        sb2.append(", title=");
        sb2.append(this.f250737d);
        sb2.append(", description=");
        sb2.append(this.f250738e);
        sb2.append(", image=");
        sb2.append(this.f250739f);
        sb2.append(", button=");
        sb2.append(this.f250740g);
        sb2.append(", actions=");
        sb2.append(this.f250741h);
        sb2.append(", analyticsInfo=");
        return C22026a.c(sb2, this.f250742i, ')');
    }
}
