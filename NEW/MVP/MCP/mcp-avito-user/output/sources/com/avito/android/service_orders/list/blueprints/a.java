package com.avito.android.service_orders.list.blueprints;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListCalendarButtonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/a;", "Lcom/avito/conveyor_item/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f279255b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f279256c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f279257d;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f279255b = str;
        this.f279256c = str2;
        this.f279257d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f279255b, aVar.f279255b) && L.f(this.f279256c, aVar.f279256c) && L.f(this.f279257d, aVar.f279257d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF270098b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270098b() {
        return this.f279255b;
    }

    public final int hashCode() {
        return this.f279257d.hashCode() + H.d(this.f279255b.hashCode() * 31, 31, this.f279256c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersListCalendarButtonItem(stringId=");
        sb2.append(this.f279255b);
        sb2.append(", title=");
        sb2.append(this.f279256c);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f279257d, ')');
    }
}
