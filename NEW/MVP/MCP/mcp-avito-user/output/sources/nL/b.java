package NL;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacOptionsData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNL/b;", "", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f11375a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f11376b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f11377c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f11378d;

    public b(@k String str, @k String str2, @l Integer num, @l String str3) {
        this.f11375a = str;
        this.f11376b = str2;
        this.f11377c = num;
        this.f11378d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f11375a, bVar.f11375a) && L.f(this.f11376b, bVar.f11376b) && L.f(this.f11377c, bVar.f11377c) && L.f(this.f11378d, bVar.f11378d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f11375a.hashCode() * 31, 31, this.f11376b);
        Integer num = this.f11377c;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f11378d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacOptionDevice(deviceName=");
        sb2.append(this.f11375a);
        sb2.append(", deviceId=");
        sb2.append(this.f11376b);
        sb2.append(", itemsCounter=");
        sb2.append(this.f11377c);
        sb2.append(", deviceSlug=");
        return C22026a.c(sb2, this.f11378d, ')');
    }
}
