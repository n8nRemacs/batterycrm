package com.avito.android.advert.item.preload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsPreloadingPromise.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/preload/f;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Map<String, String> f78217a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f78218b;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f78217a, fVar.f78217a) && L.f(this.f78218b, fVar.f78218b);
    }

    public final int hashCode() {
        Map<String, String> map = this.f78217a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Integer num = this.f78218b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPreloadingParams(strBookingRange=");
        sb2.append(this.f78217a);
        sb2.append(", userAddressId=");
        return s.j(sb2, this.f78218b, ')');
    }

    public f(@l Map<String, String> map, @l Integer num) {
        this.f78217a = map;
        this.f78218b = num;
    }

    public /* synthetic */ f(Map map, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : map, (i12 & 2) != 0 ? null : num);
    }
}
