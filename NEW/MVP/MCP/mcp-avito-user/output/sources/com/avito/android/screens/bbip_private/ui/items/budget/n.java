package com.avito.android.screens.bbip_private.ui.items.budget;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateCustomBudgetChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/n;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f260711a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f260712b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f260713c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f260714d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f260715e;

    public n(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, int i12, boolean z12) {
        this.f260711a = i12;
        this.f260712b = str;
        this.f260713c = str2;
        this.f260714d = str3;
        this.f260715e = z12;
    }

    public static n a(n nVar, boolean z12) {
        int i12 = nVar.f260711a;
        String str = nVar.f260712b;
        String str2 = nVar.f260713c;
        String str3 = nVar.f260714d;
        nVar.getClass();
        return new n(str, str2, str3, i12, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f260711a == nVar.f260711a && L.f(this.f260712b, nVar.f260712b) && L.f(this.f260713c, nVar.f260713c) && L.f(this.f260714d, nVar.f260714d) && this.f260715e == nVar.f260715e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f260711a) * 31;
        String str = this.f260712b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f260713c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f260714d;
        return Boolean.hashCode(this.f260715e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateCustomBudgetChipsItem(id=");
        sb2.append(this.f260711a);
        sb2.append(", price=");
        sb2.append(this.f260712b);
        sb2.append(", budget=");
        sb2.append(this.f260713c);
        sb2.append(", forecast=");
        sb2.append(this.f260714d);
        sb2.append(", selected=");
        return androidx.appcompat.app.r.x(sb2, this.f260715e, ')');
    }
}
