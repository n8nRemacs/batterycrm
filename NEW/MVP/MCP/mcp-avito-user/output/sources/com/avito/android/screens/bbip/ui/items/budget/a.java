package com.avito.android.screens.bbip.ui.items.budget;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BudgetChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f260300a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f260301b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f260302c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f260303d;

    public a(@Y61.k String str, @Y61.l String str2, boolean z12, boolean z13) {
        this.f260300a = str;
        this.f260301b = str2;
        this.f260302c = z12;
        this.f260303d = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f260300a, aVar.f260300a) && L.f(this.f260301b, aVar.f260301b) && this.f260302c == aVar.f260302c && this.f260303d == aVar.f260303d;
    }

    public final int hashCode() {
        int iHashCode = this.f260300a.hashCode() * 31;
        String str = this.f260301b;
        return Boolean.hashCode(this.f260303d) + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f260302c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BudgetChipsItem(price=");
        sb2.append(this.f260300a);
        sb2.append(", budget=");
        sb2.append(this.f260301b);
        sb2.append(", recommended=");
        sb2.append(this.f260302c);
        sb2.append(", selected=");
        return r.x(sb2, this.f260303d, ')');
    }
}
