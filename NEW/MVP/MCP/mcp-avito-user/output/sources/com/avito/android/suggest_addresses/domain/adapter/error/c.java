package com.avito.android.suggest_addresses.domain.adapter.error;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressesErrorItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/error/c;", "Lcom/avito/conveyor_item/a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f291865b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f291866c;

    public c(boolean z12, String str, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? c.class.getName() : str;
        this.f291865b = z12;
        this.f291866c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f291865b == cVar.f291865b && L.f(this.f291866c, cVar.f291866c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287650b() {
        return getF291866c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF291866c() {
        return this.f291866c;
    }

    public final int hashCode() {
        return this.f291866c.hashCode() + (Boolean.hashCode(this.f291865b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestAddressesErrorItem(isNetworkError=");
        sb2.append(this.f291865b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f291866c, ')');
    }
}
