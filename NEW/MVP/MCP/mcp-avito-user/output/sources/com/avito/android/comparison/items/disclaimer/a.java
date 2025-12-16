package com.avito.android.comparison.items.disclaimer;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/disclaimer/a;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f123940b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f123941c;

    public a(long j12, @l String str) {
        this.f123940b = j12;
        this.f123941c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f123940b == aVar.f123940b && L.f(this.f123941c, aVar.f123941c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF123940b() {
        return this.f123940b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f123940b) * 31;
        String str = this.f123941c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerItem(id=");
        sb2.append(this.f123940b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f123941c, ')');
    }
}
