package com.avito.android.rating.utils.span_decorator;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpanInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/utils/span_decorator/d;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f247876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f247877b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f247878c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f247879d;

    public d(@k String str, int i12, @k String str2, @l String str3) {
        this.f247876a = str;
        this.f247877b = i12;
        this.f247878c = str2;
        this.f247879d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f247876a, dVar.f247876a) && this.f247877b == dVar.f247877b && L.f(this.f247878c, dVar.f247878c) && L.f(this.f247879d, dVar.f247879d);
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f247877b, this.f247876a.hashCode() * 31, 31), 31, this.f247878c);
        String str = this.f247879d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanInfo(strippedText=");
        sb2.append(this.f247876a);
        sb2.append(", spanStart=");
        sb2.append(this.f247877b);
        sb2.append(", iconName=");
        sb2.append(this.f247878c);
        sb2.append(", iconColor=");
        return C22026a.c(sb2, this.f247879d, ')');
    }
}
