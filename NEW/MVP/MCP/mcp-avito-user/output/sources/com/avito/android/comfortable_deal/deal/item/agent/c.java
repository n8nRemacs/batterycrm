package com.avito.android.comfortable_deal.deal.item.agent;

import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/agent/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f121159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f121160c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f121161d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f121162e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Uri f121163f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f121164g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DeepLink f121165h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f121166i;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @l Uri uri, @l String str5, @Y61.k DeepLink deepLink, @Y61.k List list) {
        this.f121159b = str;
        this.f121160c = str2;
        this.f121161d = str3;
        this.f121162e = str4;
        this.f121163f = uri;
        this.f121164g = str5;
        this.f121165h = deepLink;
        this.f121166i = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f121159b, cVar.f121159b) && L.f(this.f121160c, cVar.f121160c) && L.f(this.f121161d, cVar.f121161d) && L.f(this.f121162e, cVar.f121162e) && L.f(this.f121163f, cVar.f121163f) && L.f(this.f121164g, cVar.f121164g) && L.f(this.f121165h, cVar.f121165h) && L.f(this.f121166i, cVar.f121166i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return -1182856179;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF84868c() {
        return "agent_item";
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(1986164115, 31, this.f121159b), 31, this.f121160c), 31, this.f121161d), 31, this.f121162e);
        Uri uri = this.f121163f;
        int iHashCode = (iD2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f121164g;
        return this.f121166i.hashCode() + com.avito.android.actions_sheet.a.e(this.f121165h, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentItem(stringId=agent_item, agentItemId=");
        sb2.append(this.f121159b);
        sb2.append(", price=");
        sb2.append(this.f121160c);
        sb2.append(", title=");
        sb2.append(this.f121161d);
        sb2.append(", address=");
        sb2.append(this.f121162e);
        sb2.append(", image=");
        sb2.append(this.f121163f);
        sb2.append(", imageIcon=");
        sb2.append(this.f121164g);
        sb2.append(", deeplink=");
        sb2.append(this.f121165h);
        sb2.append(", stats=");
        return H.n(sb2, this.f121166i, ')');
    }
}
