package com.avito.android.mortgage.root.list.items.bank;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BankItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/d;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f202314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f202315b;

    public d(@Y61.k String str, boolean z12) {
        this.f202314a = str;
        this.f202315b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f202314a, dVar.f202314a) && this.f202315b == dVar.f202315b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202315b) + (this.f202314a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankItemAction(title=");
        sb2.append(this.f202314a);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f202315b, ')');
    }

    public /* synthetic */ d(String str, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12);
    }
}
