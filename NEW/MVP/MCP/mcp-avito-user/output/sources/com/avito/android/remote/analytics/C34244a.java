package com.avito.android.remote.analytics;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkErrorsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/a;", "", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.analytics.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C34244a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f253102a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f253103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f253104c;

    public C34244a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f253102a = str;
        this.f253103b = str2;
        this.f253104c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34244a)) {
            return false;
        }
        C34244a c34244a = (C34244a) obj;
        return L.f(this.f253102a, c34244a.f253102a) && L.f(this.f253103b, c34244a.f253103b) && L.f(this.f253104c, c34244a.f253104c);
    }

    public final int hashCode() {
        int iHashCode = this.f253102a.hashCode() * 31;
        String str = this.f253103b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f253104c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkErrorId(networkErrorId=");
        sb2.append(this.f253102a);
        sb2.append(", diagnosticContext=");
        sb2.append(this.f253103b);
        sb2.append(", diagnosticContextId=");
        return C22026a.c(sb2, this.f253104c, ')');
    }
}
