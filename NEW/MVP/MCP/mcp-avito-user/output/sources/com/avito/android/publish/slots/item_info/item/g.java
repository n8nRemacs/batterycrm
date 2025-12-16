package com.avito.android.publish.slots.item_info.item;

import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemInfoItemPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/item_info/item/g;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Boolean f244388a;

    public g(@Y61.l Boolean bool) {
        this.f244388a = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && L.f(this.f244388a, ((g) obj).f244388a);
    }

    public final int hashCode() {
        Boolean bool = this.f244388a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C0.g(new StringBuilder("ItemInfoItemPayload(isExpanded="), this.f244388a, ')');
    }
}
