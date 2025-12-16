package com.avito.android.comfortable_deal.deal.item.description;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/description/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121365b;

    public c(@k String str) {
        this.f121365b = str;
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
        return L.f(this.f121365b, cVar.f121365b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return 506842486;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF115821b() {
        return "description_item";
    }

    public final int hashCode() {
        return this.f121365b.hashCode() - 1467752118;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("DescriptionItem(stringId=description_item, description="), this.f121365b, ')');
    }
}
