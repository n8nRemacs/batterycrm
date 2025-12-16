package com.avito.android.cookie_provider;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CookieProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cookie_provider/a;", "", "_avito_cookie-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f126169a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126170b;

    public a(@k String str, @k String str2) {
        this.f126169a = str;
        this.f126170b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f126169a, aVar.f126169a) && L.f(this.f126170b, aVar.f126170b);
    }

    public final int hashCode() {
        return this.f126170b.hashCode() + (this.f126169a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cookie(domain=");
        sb2.append(this.f126169a);
        sb2.append(", cookie=");
        return C22026a.c(sb2, this.f126170b, ')');
    }
}
