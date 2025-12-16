package com.avito.android.payment.items.phone_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneInputItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/items/phone_item/g;", "Lcom/avito/conveyor_item/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f214492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f214493c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f214494d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f214495e;

    public g(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f214492b = str;
        this.f214493c = str2;
        this.f214494d = str3;
        this.f214495e = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f214492b, gVar.f214492b) && L.f(this.f214493c, gVar.f214493c) && L.f(this.f214494d, gVar.f214494d) && this.f214495e == gVar.f214495e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162223b() {
        return getF214512b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF214512b() {
        return this.f214492b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214495e) + H.d(H.d(this.f214492b.hashCode() * 31, 31, this.f214493c), 31, this.f214494d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneInputItem(stringId=");
        sb2.append(this.f214492b);
        sb2.append(", title=");
        sb2.append(this.f214493c);
        sb2.append(", value=");
        sb2.append(this.f214494d);
        sb2.append(", hasError=");
        return r.x(sb2, this.f214495e, ')');
    }

    public /* synthetic */ g(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? false : z12);
    }
}
