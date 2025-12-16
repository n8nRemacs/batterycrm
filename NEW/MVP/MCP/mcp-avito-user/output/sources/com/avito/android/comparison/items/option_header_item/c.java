package com.avito.android.comparison.items.option_header_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OptionHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/option_header_item/c;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f124042b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f124043c;

    public c(long j12, @k String str) {
        this.f124042b = j12;
        this.f124043c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f124042b == cVar.f124042b && L.f(this.f124043c, cVar.f124043c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF123940b() {
        return this.f124042b;
    }

    public final int hashCode() {
        return this.f124043c.hashCode() + (Long.hashCode(this.f124042b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionHeaderItem(id=");
        sb2.append(this.f124042b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f124043c, ')');
    }
}
