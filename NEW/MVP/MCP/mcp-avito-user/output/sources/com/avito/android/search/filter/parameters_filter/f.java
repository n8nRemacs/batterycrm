package com.avito.android.search.filter.parameters_filter;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NextPageByOffset.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/parameters_filter/f;", "LZp0/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f implements InterfaceC19587b {

    /* renamed from: a, reason: collision with root package name */
    public final int f263763a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f263764b;

    public f(int i12, @k String str) {
        this.f263763a = i12;
        this.f263764b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f263763a == fVar.f263763a && L.f(this.f263764b, fVar.f263764b);
    }

    public final int hashCode() {
        return this.f263764b.hashCode() + (Integer.hashCode(this.f263763a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NextPageByOffset(offset=");
        sb2.append(this.f263763a);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f263764b, ')');
    }
}
