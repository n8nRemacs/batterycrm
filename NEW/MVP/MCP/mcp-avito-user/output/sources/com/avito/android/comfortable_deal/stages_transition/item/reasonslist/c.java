package com.avito.android.comfortable_deal.stages_transition.item.reasonslist;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import eq.InterfaceC40145a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReasonsListItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/c;", "Leq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements InterfaceC40145a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.c> f122913b;

    public c(@k List list) {
        this.f122913b = list;
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
        return L.f(this.f122913b, cVar.f122913b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83915c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF108380b() {
        return "reason";
    }

    public final int hashCode() {
        return this.f122913b.hashCode() + 1080866364;
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("ReasonsListItem(stringId=reason, reasons="), this.f122913b, ')');
    }
}
