package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/j;", "", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f250755a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f250756b;

    public j(@k String str, @l DeepLink deepLink) {
        this.f250755a = str;
        this.f250756b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f250755a, jVar.f250755a) && L.f(this.f250756b, jVar.f250756b);
    }

    public final int hashCode() {
        int iHashCode = this.f250755a.hashCode() * 31;
        DeepLink deepLink = this.f250756b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionButton(title=");
        sb2.append(this.f250755a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f250756b, ')');
    }
}
