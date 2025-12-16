package com.avito.android.publish.slots.cpa_tariff.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaButtonAction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpaTariffSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cpa_tariff/item/b;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243375b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243376c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f243377d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f243378e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CpaButtonAction f243379f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Map<String, String> f243380g;

    public b(@k String str, @k String str2, @k String str3, @k String str4, @l CpaButtonAction cpaButtonAction, @l Map<String, String> map) {
        this.f243375b = str;
        this.f243376c = str2;
        this.f243377d = str3;
        this.f243378e = str4;
        this.f243379f = cpaButtonAction;
        this.f243380g = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f243375b, bVar.f243375b) && L.f(this.f243376c, bVar.f243376c) && L.f(this.f243377d, bVar.f243377d) && L.f(this.f243378e, bVar.f243378e) && this.f243379f == bVar.f243379f && L.f(this.f243380g, bVar.f243380g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return getF8986b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8986b() {
        return this.f243375b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f243375b.hashCode() * 31, 31, this.f243376c), 31, this.f243377d), 31, this.f243378e);
        CpaButtonAction cpaButtonAction = this.f243379f;
        int iHashCode = (iD2 + (cpaButtonAction == null ? 0 : cpaButtonAction.hashCode())) * 31;
        Map<String, String> map = this.f243380g;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpaTariffSlotItem(stringId=");
        sb2.append(this.f243375b);
        sb2.append(", title=");
        sb2.append(this.f243376c);
        sb2.append(", description=");
        sb2.append(this.f243377d);
        sb2.append(", buttonTitle=");
        sb2.append(this.f243378e);
        sb2.append(", buttonAction=");
        sb2.append(this.f243379f);
        sb2.append(", attributesAndValues=");
        return r.w(sb2, this.f243380g, ')');
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, CpaButtonAction cpaButtonAction, Map map, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, cpaButtonAction, (i12 & 32) != 0 ? null : map);
    }
}
