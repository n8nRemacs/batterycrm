package com.avito.android.publish.slots.address_from_profile.publish_item;

import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishAddressPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/q;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<k> f242943a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Boolean f242944b;

    public q(@Y61.k List<k> list, @Y61.l Boolean bool) {
        this.f242943a = list;
        this.f242944b = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f242943a, qVar.f242943a) && L.f(this.f242944b, qVar.f242944b);
    }

    public final int hashCode() {
        int iHashCode = this.f242943a.hashCode() * 31;
        Boolean bool = this.f242944b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishAddressPayload(addresses=");
        sb2.append(this.f242943a);
        sb2.append(", needSearch=");
        return C0.g(sb2, this.f242944b, ')');
    }
}
