package com.avito.android.screens.bbip_v2.ui.items.budget;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2BudgetChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f261565a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f261566b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f261567c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f261568d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f261569e;

    public a(boolean z12, boolean z13, boolean z14, @Y61.k String str, @Y61.l String str2) {
        this.f261565a = str;
        this.f261566b = str2;
        this.f261567c = z12;
        this.f261568d = z13;
        this.f261569e = z14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f261565a, aVar.f261565a) && L.f(this.f261566b, aVar.f261566b) && this.f261567c == aVar.f261567c && this.f261568d == aVar.f261568d && this.f261569e == aVar.f261569e;
    }

    public final int hashCode() {
        int iHashCode = this.f261565a.hashCode() * 31;
        String str = this.f261566b;
        return Boolean.hashCode(this.f261569e) + r.i(r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f261567c), 31, this.f261568d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2BudgetChipsItem(price=");
        sb2.append(this.f261565a);
        sb2.append(", budget=");
        sb2.append(this.f261566b);
        sb2.append(", recommended=");
        sb2.append(this.f261567c);
        sb2.append(", selected=");
        sb2.append(this.f261568d);
        sb2.append(", hasWarning=");
        return r.x(sb2, this.f261569e, ')');
    }
}
