package com.avito.android.comfortable_deal.deal.item.agent;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AgentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/agent/k;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f121183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121184b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f121185c;

    public k(@Y61.k String str, int i12, @l Integer num) {
        this.f121183a = str;
        this.f121184b = i12;
        this.f121185c = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f121183a, kVar.f121183a) && this.f121184b == kVar.f121184b && L.f(this.f121185c, kVar.f121185c);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f121184b, this.f121183a.hashCode() * 31, 31);
        Integer num = this.f121185c;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stat(title=");
        sb2.append(this.f121183a);
        sb2.append(", count=");
        sb2.append(this.f121184b);
        sb2.append(", additionalCount=");
        return s.j(sb2, this.f121185c, ')');
    }

    public /* synthetic */ k(String str, int i12, Integer num, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? null : num);
    }
}
