package com.avito.android.inline_filters.repository_suggest;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NextPageByOffset.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/repository_suggest/g;", "LZp0/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g implements InterfaceC19587b {

    /* renamed from: a, reason: collision with root package name */
    public final int f172363a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f172364b;

    public g(int i12, @k String str) {
        this.f172363a = i12;
        this.f172364b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f172363a == gVar.f172363a && L.f(this.f172364b, gVar.f172364b);
    }

    public final int hashCode() {
        return this.f172364b.hashCode() + (Integer.hashCode(this.f172363a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NextPageByOffset(offset=");
        sb2.append(this.f172363a);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f172364b, ')');
    }
}
