package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SettingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/d;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f135409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f135410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final c f135411d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final c f135412e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final c f135413f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f135414g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.lib.design.bottom_sheet.k> f135415h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f135416i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final List<Ov.d> f135417j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f135418k;

    public d(@Y61.k String str, @Y61.l String str2, @Y61.l c cVar, @Y61.l c cVar2, @Y61.l c cVar3, @Y61.k String str3, @Y61.k List<com.avito.android.lib.design.bottom_sheet.k> list, boolean z12, @Y61.k List<Ov.d> list2, boolean z13) {
        this.f135409b = str;
        this.f135410c = str2;
        this.f135411d = cVar;
        this.f135412e = cVar2;
        this.f135413f = cVar3;
        this.f135414g = str3;
        this.f135415h = list;
        this.f135416i = z12;
        this.f135417j = list2;
        this.f135418k = z13;
    }

    public static d a(d dVar, boolean z12) {
        return new d(dVar.f135409b, dVar.f135410c, dVar.f135411d, dVar.f135412e, dVar.f135413f, dVar.f135414g, dVar.f135415h, dVar.f135416i, dVar.f135417j, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f135409b, dVar.f135409b) && L.f(this.f135410c, dVar.f135410c) && L.f(this.f135411d, dVar.f135411d) && L.f(this.f135412e, dVar.f135412e) && L.f(this.f135413f, dVar.f135413f) && L.f(this.f135414g, dVar.f135414g) && L.f(this.f135415h, dVar.f135415h) && this.f135416i == dVar.f135416i && L.f(this.f135417j, dVar.f135417j) && this.f135418k == dVar.f135418k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return getF80071c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80071c() {
        return this.f135409b;
    }

    public final int hashCode() {
        int iHashCode = this.f135409b.hashCode() * 31;
        String str = this.f135410c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.f135411d;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f135412e;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f135413f;
        return Boolean.hashCode(this.f135418k) + H.e(r.i(H.e(H.d((iHashCode4 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31, 31, this.f135414g), 31, this.f135415h), 31, this.f135416i), 31, this.f135417j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingItem(stringId=");
        sb2.append(this.f135409b);
        sb2.append(", title=");
        sb2.append(this.f135410c);
        sb2.append(", price=");
        sb2.append(this.f135411d);
        sb2.append(", minDays=");
        sb2.append(this.f135412e);
        sb2.append(", maxDays=");
        sb2.append(this.f135413f);
        sb2.append(", selectedTariffName=");
        sb2.append(this.f135414g);
        sb2.append(", selectOptions=");
        sb2.append(this.f135415h);
        sb2.append(", shouldShowSaveButton=");
        sb2.append(this.f135416i);
        sb2.append(", locations=");
        sb2.append(this.f135417j);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f135418k, ')');
    }

    public /* synthetic */ d(String str, String str2, c cVar, c cVar2, c cVar3, String str3, List list, boolean z12, List list2, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, cVar, cVar2, cVar3, str3, list, z12, list2, (i12 & 512) != 0 ? false : z13);
    }
}
