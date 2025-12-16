package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateCustomBudgetWidgetChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/o;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f260812a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f260813b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f260814c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f260815d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f260816e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f260817f;

    public o(int i12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
        this.f260812a = i12;
        this.f260813b = str;
        this.f260814c = str2;
        this.f260815d = str3;
        this.f260816e = str4;
        this.f260817f = z12;
    }

    public static o a(o oVar, boolean z12) {
        int i12 = oVar.f260812a;
        String str = oVar.f260813b;
        String str2 = oVar.f260814c;
        String str3 = oVar.f260815d;
        String str4 = oVar.f260816e;
        oVar.getClass();
        return new o(i12, str, str2, str3, str4, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f260812a == oVar.f260812a && L.f(this.f260813b, oVar.f260813b) && L.f(this.f260814c, oVar.f260814c) && L.f(this.f260815d, oVar.f260815d) && L.f(this.f260816e, oVar.f260816e) && this.f260817f == oVar.f260817f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f260812a) * 31;
        String str = this.f260813b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f260814c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f260815d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f260816e;
        return Boolean.hashCode(this.f260817f) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateCustomBudgetWidgetChipsItem(id=");
        sb2.append(this.f260812a);
        sb2.append(", price=");
        sb2.append(this.f260813b);
        sb2.append(", budget=");
        sb2.append(this.f260814c);
        sb2.append(", contactsForecast=");
        sb2.append(this.f260815d);
        sb2.append(", viewsForecast=");
        sb2.append(this.f260816e);
        sb2.append(", selected=");
        return androidx.appcompat.app.r.x(sb2, this.f260817f, ')');
    }
}
