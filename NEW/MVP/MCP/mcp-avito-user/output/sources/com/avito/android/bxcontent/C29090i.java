package com.avito.android.bxcontent;

import kotlin.Metadata;

/* compiled from: BxContentCombinationFeatureManagerConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/i;", "", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C29090i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111123a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111124b;

    public C29090i(boolean z12, boolean z13) {
        this.f111123a = z12;
        this.f111124b = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29090i)) {
            return false;
        }
        C29090i c29090i = (C29090i) obj;
        return this.f111123a == c29090i.f111123a && this.f111124b == c29090i.f111124b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111124b) + (Boolean.hashCode(this.f111123a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BxContentCombinationFeatureManagerConfig(isBeduinFeatureEnabled=");
        sb2.append(this.f111123a);
        sb2.append(", isMapFeatureEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f111124b, ')');
    }
}
