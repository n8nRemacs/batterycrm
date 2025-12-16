package com.avito.android;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComparisonAnalyticsParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/J;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f67340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f67341b;

    public J(String str, String str2, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? "comparison" : str2;
        this.f67340a = str;
        this.f67341b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j12 = (J) obj;
        return kotlin.jvm.internal.L.f(this.f67340a, j12.f67340a) && kotlin.jvm.internal.L.f(this.f67341b, j12.f67341b);
    }

    public final int hashCode() {
        return this.f67341b.hashCode() + (this.f67340a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonAnalyticsParams(advertId=");
        sb2.append(this.f67340a);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f67341b, ')');
    }
}
