package com.avito.android.tariff_cpt.info.ui.items.card;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/card/j;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AC0.a f298289a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AC0.d f298290b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AC0.c f298291c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AC0.b f298292d;

    public j(@l AC0.a aVar, @l AC0.d dVar, @l AC0.c cVar, @l AC0.b bVar) {
        this.f298289a = aVar;
        this.f298290b = dVar;
        this.f298291c = cVar;
        this.f298292d = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f298289a, jVar.f298289a) && L.f(this.f298290b, jVar.f298290b) && L.f(this.f298291c, jVar.f298291c) && L.f(this.f298292d, jVar.f298292d);
    }

    public final int hashCode() {
        AC0.a aVar = this.f298289a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        AC0.d dVar = this.f298290b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        AC0.c cVar = this.f298291c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        AC0.b bVar = this.f298292d;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CptInfoItemContentItem(button=" + this.f298289a + ", text=" + this.f298290b + ", progress=" + this.f298291c + ", dottedText=" + this.f298292d + ')';
    }
}
