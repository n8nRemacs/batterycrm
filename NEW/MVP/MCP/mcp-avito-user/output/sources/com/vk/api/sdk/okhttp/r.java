package com.vk.api.sdk.okhttp;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RequestTag.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/r;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f366671a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Boolean f366672b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f366673c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f366674d;

    @X41.j
    public r() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f366671a, rVar.f366671a) && L.f(this.f366672b, rVar.f366672b) && L.f(this.f366673c, rVar.f366673c) && L.f(this.f366674d, rVar.f366674d);
    }

    public final int hashCode() {
        Integer num = this.f366671a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f366672b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f366673c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f366674d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestTag(uid=");
        sb2.append(this.f366671a);
        sb2.append(", awaitNetwork=");
        sb2.append(this.f366672b);
        sb2.append(", reason=");
        sb2.append((Object) this.f366673c);
        sb2.append(", retryCount=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f366674d, ')');
    }

    public r(Integer num, Boolean bool, String str, Integer num2, int i12, C42822w c42822w) {
        num = (i12 & 1) != 0 ? null : num;
        bool = (i12 & 2) != 0 ? null : bool;
        str = (i12 & 4) != 0 ? null : str;
        num2 = (i12 & 8) != 0 ? null : num2;
        this.f366671a = num;
        this.f366672b = bool;
        this.f366673c = str;
        this.f366674d = num2;
    }
}
