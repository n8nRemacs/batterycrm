package com.avito.android.loyalty.ui.items.spacer;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpacerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/spacer/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f183739c;

    public a(@k String str, @U int i12) {
        this.f183738b = str;
        this.f183739c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183738b, aVar.f183738b) && this.f183739c == aVar.f183739c;
    }

    @Override // TV0.a
    public final long getId() {
        return getF154247b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154247b() {
        return this.f183738b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f183739c) + (this.f183738b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpacerItem(stringId=");
        sb2.append(this.f183738b);
        sb2.append(", height=");
        return r.t(sb2, this.f183739c, ')');
    }
}
