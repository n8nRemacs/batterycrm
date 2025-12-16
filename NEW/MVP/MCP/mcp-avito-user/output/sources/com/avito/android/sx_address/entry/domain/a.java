package com.avito.android.sx_address.entry.domain;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressesLinkItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/entry/domain/a;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f292930a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f292931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f292932c;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f292930a = str;
        this.f292931b = str2;
        this.f292932c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f292930a, aVar.f292930a) && L.f(this.f292931b, aVar.f292931b) && L.f(this.f292932c, aVar.f292932c);
    }

    public final int hashCode() {
        return this.f292932c.hashCode() + H.d(this.f292930a.hashCode() * 31, 31, this.f292931b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressesLinkItem(description=");
        sb2.append(this.f292930a);
        sb2.append(", title=");
        sb2.append(this.f292931b);
        sb2.append(", url=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f292932c, ')');
    }
}
