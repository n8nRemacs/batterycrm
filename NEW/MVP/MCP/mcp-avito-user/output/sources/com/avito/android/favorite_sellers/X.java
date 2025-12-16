package com.avito.android.favorite_sellers;

import kotlin.Metadata;

/* compiled from: ViewPortState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/X;", "", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class X {

    /* renamed from: a, reason: collision with root package name */
    public final int f155487a;

    /* renamed from: b, reason: collision with root package name */
    public final int f155488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f155489c;

    public X(int i12, int i13, int i14) {
        this.f155487a = i12;
        this.f155488b = i13;
        this.f155489c = i14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x12 = (X) obj;
        return this.f155487a == x12.f155487a && this.f155488b == x12.f155488b && this.f155489c == x12.f155489c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f155489c) + androidx.appcompat.app.r.e(this.f155488b, Integer.hashCode(this.f155487a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewPortState(firstVisible=");
        sb2.append(this.f155487a);
        sb2.append(", lastVisible=");
        sb2.append(this.f155488b);
        sb2.append(", lastCompletelyVisible=");
        return androidx.appcompat.app.r.t(sb2, this.f155489c, ')');
    }
}
