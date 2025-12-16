package com.avito.android.avito_finance_user_profile.view.item;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f97989b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f97990c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f97991d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f97992e;

    public a(@k PrintableText printableText, @l ArrayList arrayList, @l ArrayList arrayList2, @l ArrayList arrayList3) {
        this.f97989b = printableText;
        this.f97990c = arrayList;
        this.f97991d = arrayList2;
        this.f97992e = arrayList3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f97989b.equals(aVar.f97989b) && L.f(this.f97990c, aVar.f97990c) && L.f(this.f97991d, aVar.f97991d) && L.f(this.f97992e, aVar.f97992e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return 1839456962;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF80109b() {
        return "avito_finance_block_id";
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f97989b, 1188590974, 31);
        ArrayList arrayList = this.f97990c;
        int iHashCode = (iF2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f97991d;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.f97992e;
        return iHashCode2 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceBlockItem(stringId=avito_finance_block_id, title=");
        sb2.append(this.f97989b);
        sb2.append(", features=");
        sb2.append(this.f97990c);
        sb2.append(", onSelect=");
        sb2.append(this.f97991d);
        sb2.append(", onAppear=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f97992e, ')');
    }
}
