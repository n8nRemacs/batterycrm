package com.avito.android.short_term_rent.utils;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingParametersValidatorResourceProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/utils/q;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f283036a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f283037b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f283038c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f283039d;

    public q(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f283036a = str;
        this.f283037b = str2;
        this.f283038c = str3;
        this.f283039d = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f283036a, qVar.f283036a) && L.f(this.f283037b, qVar.f283037b) && L.f(this.f283038c, qVar.f283038c) && L.f(this.f283039d, qVar.f283039d);
    }

    public final int hashCode() {
        return this.f283039d.hashCode() + H.d(H.d(this.f283036a.hashCode() * 31, 31, this.f283037b), 31, this.f283038c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValidationPlaceholders(name=");
        sb2.append(this.f283036a);
        sb2.append(", phone=");
        sb2.append(this.f283037b);
        sb2.append(", email=");
        sb2.append(this.f283038c);
        sb2.append(", unknown=");
        return C22026a.c(sb2, this.f283039d, ')');
    }
}
