package com.avito.android.suggest_addresses.domain.adapter.addresses;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressesItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/addresses/c;", "Lcom/avito/conveyor_item/a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f291828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f291829c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f291830d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f291831e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f291832f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f291833g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f291834h;

    public c(@l String str, @k String str2, @k String str3, @k String str4, @k String str5, boolean z12, boolean z13) {
        this.f291828b = str;
        this.f291829c = str2;
        this.f291830d = str3;
        this.f291831e = str4;
        this.f291832f = z12;
        this.f291833g = z13;
        this.f291834h = str5;
    }

    public static c a(c cVar, String str, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f291828b;
        }
        return new c(str, cVar.f291829c, cVar.f291830d, cVar.f291831e, cVar.f291834h, cVar.f291832f, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f291828b, cVar.f291828b) && L.f(this.f291829c, cVar.f291829c) && L.f(this.f291830d, cVar.f291830d) && L.f(this.f291831e, cVar.f291831e) && this.f291832f == cVar.f291832f && this.f291833g == cVar.f291833g && L.f(this.f291834h, cVar.f291834h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return getF154848b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154848b() {
        return this.f291834h;
    }

    public final int hashCode() {
        String str = this.f291828b;
        return this.f291834h.hashCode() + r.i(r.i(H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f291829c), 31, this.f291830d), 31, this.f291831e), 31, this.f291832f), 31, this.f291833g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestAddressesItem(addressId=");
        sb2.append(this.f291828b);
        sb2.append(", jsonWebToken=");
        sb2.append(this.f291829c);
        sb2.append(", address=");
        sb2.append(this.f291830d);
        sb2.append(", locality=");
        sb2.append(this.f291831e);
        sb2.append(", historical=");
        sb2.append(this.f291832f);
        sb2.append(", checked=");
        sb2.append(this.f291833g);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f291834h, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, boolean z12, boolean z13, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, (i12 & 64) != 0 ? str2 : str5, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
    }
}
