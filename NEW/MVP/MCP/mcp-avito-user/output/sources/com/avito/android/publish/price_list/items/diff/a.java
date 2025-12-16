package com.avito.android.publish.price_list.items.diff;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SelectPriceListItemPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/diff/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f238623a;

    public a(boolean z12) {
        this.f238623a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f238623a == ((a) obj).f238623a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238623a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("SelectPriceListGroupPayload(isExpanded="), this.f238623a, ')');
    }
}
