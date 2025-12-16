package com.avito.android.comfortable_deal.deal.item.actions;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ActionsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/actions/d;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f121147b;

    public d(@k ArrayList arrayList) {
        this.f121147b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return this.f121147b.equals(dVar.f121147b);
    }

    @Override // TV0.a
    public final long getId() {
        return -1890385643;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF118486b() {
        return "actions_item";
    }

    public final int hashCode() {
        return this.f121147b.hashCode() + 1527587211;
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ActionsItem(stringId=actions_item, actions="), this.f121147b, ')');
    }
}
