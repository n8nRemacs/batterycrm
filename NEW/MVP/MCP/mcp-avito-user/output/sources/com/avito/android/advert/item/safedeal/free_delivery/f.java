package com.avito.android.advert.item.safedeal.free_delivery;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreeDeliveryResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/free_delivery/f;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeepLink f78809a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SafeDeal.Component.CombinedButtons.FreeDeliveryBlock f78810b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78811c;

    public f(@k DeepLink deepLink, @k SafeDeal.Component.CombinedButtons.FreeDeliveryBlock freeDeliveryBlock, @k String str) {
        this.f78809a = deepLink;
        this.f78810b = freeDeliveryBlock;
        this.f78811c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f78809a, fVar.f78809a) && L.f(this.f78810b, fVar.f78810b) && L.f(this.f78811c, fVar.f78811c);
    }

    public final int hashCode() {
        return this.f78811c.hashCode() + ((this.f78810b.hashCode() + (this.f78809a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeDeliveryResponse(chatDeeplink=");
        sb2.append(this.f78809a);
        sb2.append(", freeDeliveryBlock=");
        sb2.append(this.f78810b);
        sb2.append(", toastMessage=");
        return C22026a.c(sb2, this.f78811c, ')');
    }
}
