package com.avito.android.avito_finance_user_profile.view.item;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/i;", "", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f98010a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f98011b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f98012c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f98013d;

    public i(@l String str, @l String str2, @l ArrayList arrayList, @l ArrayList arrayList2) {
        this.f98010a = str;
        this.f98011b = str2;
        this.f98012c = arrayList;
        this.f98013d = arrayList2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f98010a, iVar.f98010a) && L.f(this.f98011b, iVar.f98011b) && L.f(this.f98012c, iVar.f98012c) && L.f(this.f98013d, iVar.f98013d);
    }

    public final int hashCode() {
        String str = this.f98010a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98011b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList arrayList = this.f98012c;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f98013d;
        return iHashCode3 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceItemButton(title=");
        sb2.append(this.f98010a);
        sb2.append(", style=");
        sb2.append(this.f98011b);
        sb2.append(", onSelect=");
        sb2.append(this.f98012c);
        sb2.append(", onAppear=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f98013d, ')');
    }
}
