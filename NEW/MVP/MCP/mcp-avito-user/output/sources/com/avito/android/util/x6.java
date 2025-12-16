package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: ViewSize.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/x6;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f319128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f319129b;

    public x6(int i12, int i13) {
        this.f319128a = i12;
        this.f319129b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return this.f319128a == x6Var.f319128a && this.f319129b == x6Var.f319129b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f319129b) + (Integer.hashCode(this.f319128a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewSize(width=");
        sb2.append(this.f319128a);
        sb2.append(", height=");
        return androidx.appcompat.app.r.t(sb2, this.f319129b, ')');
    }
}
