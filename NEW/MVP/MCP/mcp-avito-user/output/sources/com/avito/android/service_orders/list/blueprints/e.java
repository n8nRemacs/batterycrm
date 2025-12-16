package com.avito.android.service_orders.list.blueprints;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/e;", "Lcom/avito/conveyor_item/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f279300b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f279301c;

    public e(@k String str, @k String str2) {
        this.f279300b = str;
        this.f279301c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f279300b, eVar.f279300b) && L.f(this.f279301c, eVar.f279301c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF429445b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279229b() {
        return this.f279300b;
    }

    public final int hashCode() {
        return this.f279301c.hashCode() + (this.f279300b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersListTitleItem(stringId=");
        sb2.append(this.f279300b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f279301c, ')');
    }
}
