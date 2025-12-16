package com.avito.android.loyalty.ui.badge_details_v3.items.error;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsErrorItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/items/error/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183297b;

    public a(@k String str) {
        this.f183297b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f183297b, ((a) obj).f183297b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return getF183297b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183297b() {
        return this.f183297b;
    }

    public final int hashCode() {
        return this.f183297b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("BadgeDetailsErrorItem(stringId="), this.f183297b, ')');
    }
}
