package com.avito.android.publish.details.parameters_filter;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NextPageByOffset.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/parameters_filter/a;", "LZp0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements InterfaceC19587b {

    /* renamed from: a, reason: collision with root package name */
    public final int f234872a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f234873b;

    public a(int i12, @k String str) {
        this.f234872a = i12;
        this.f234873b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f234872a == aVar.f234872a && L.f(this.f234873b, aVar.f234873b);
    }

    public final int hashCode() {
        return this.f234873b.hashCode() + (Integer.hashCode(this.f234872a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NextPageByOffset(offset=");
        sb2.append(this.f234872a);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f234873b, ')');
    }
}
