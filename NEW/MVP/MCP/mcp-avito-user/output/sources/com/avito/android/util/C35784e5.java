package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: RecyclerViews.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/e5;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.e5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C35784e5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f318865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f318866b;

    public C35784e5(int i12, int i13) {
        this.f318865a = i12;
        this.f318866b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35784e5)) {
            return false;
        }
        C35784e5 c35784e5 = (C35784e5) obj;
        return this.f318865a == c35784e5.f318865a && this.f318866b == c35784e5.f318866b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f318866b) + (Integer.hashCode(this.f318865a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollEventWithThreshold(dx=");
        sb2.append(this.f318865a);
        sb2.append(", dy=");
        return androidx.appcompat.app.r.t(sb2, this.f318866b, ')');
    }
}
