package com.avito.android.tariff.cpx.info.items.header;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f296503b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f296504c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f296505d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final b f296506e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<a> f296507f;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.l b bVar, @Y61.l List<a> list) {
        this.f296503b = str;
        this.f296504c = str2;
        this.f296505d = attributedText;
        this.f296506e = bVar;
        this.f296507f = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f296503b, cVar.f296503b) && L.f(this.f296504c, cVar.f296504c) && L.f(this.f296505d, cVar.f296505d) && L.f(this.f296506e, cVar.f296506e) && L.f(this.f296507f, cVar.f296507f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF288417b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288417b() {
        return this.f296503b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f296503b.hashCode() * 31, 31, this.f296504c);
        AttributedText attributedText = this.f296505d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        b bVar = this.f296506e;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<a> list = this.f296507f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoHeaderItem(stringId=");
        sb2.append(this.f296503b);
        sb2.append(", title=");
        sb2.append(this.f296504c);
        sb2.append(", description=");
        sb2.append(this.f296505d);
        sb2.append(", button=");
        sb2.append(this.f296506e);
        sb2.append(", tabs=");
        return H.p(sb2, this.f296507f, ')');
    }

    public /* synthetic */ c(String str, String str2, AttributedText attributedText, b bVar, List list, int i12, C42822w c42822w) {
        this(str, str2, attributedText, (i12 & 8) != 0 ? null : bVar, (i12 & 16) != 0 ? null : list);
    }
}
