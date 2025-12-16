package com.avito.android.tariff.cpx.info.items.level_header;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoLevelHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/level_header/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f296534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final b f296535c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f296536d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final a f296537e;

    public c(@Y61.k String str, @Y61.l b bVar, @Y61.l AttributedText attributedText, @Y61.l a aVar) {
        this.f296534b = str;
        this.f296535c = bVar;
        this.f296536d = attributedText;
        this.f296537e = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f296534b, cVar.f296534b) && L.f(this.f296535c, cVar.f296535c) && L.f(this.f296536d, cVar.f296536d) && L.f(this.f296537e, cVar.f296537e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74860b() {
        return 1318892874;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF155493b() {
        return "level_header_item";
    }

    public final int hashCode() {
        int iD2 = H.d(-2063993866, 31, this.f296534b);
        b bVar = this.f296535c;
        int iHashCode = (iD2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AttributedText attributedText = this.f296536d;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        a aVar = this.f296537e;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TariffCpxInfoLevelHeaderItem(stringId=level_header_item, title=" + this.f296534b + ", titleButton=" + this.f296535c + ", description=" + this.f296536d + ", banner=" + this.f296537e + ')';
    }
}
