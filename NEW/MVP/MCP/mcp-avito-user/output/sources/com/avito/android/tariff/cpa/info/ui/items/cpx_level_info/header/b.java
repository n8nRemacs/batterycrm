package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevelInfoHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/header/b;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f294837b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f294838c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f294839d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f294840e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294841f;

    public b(@Y61.k String str, @Y61.k String str2, @l AttributedText attributedText, @l a aVar, boolean z12) {
        this.f294837b = str;
        this.f294838c = str2;
        this.f294839d = attributedText;
        this.f294840e = aVar;
        this.f294841f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f294837b, bVar.f294837b) && L.f(this.f294838c, bVar.f294838c) && L.f(this.f294839d, bVar.f294839d) && L.f(this.f294840e, bVar.f294840e) && this.f294841f == bVar.f294841f;
    }

    @Override // TV0.a
    public final long getId() {
        return getF283227b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283227b() {
        return this.f294837b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f294837b.hashCode() * 31, 31, this.f294838c);
        AttributedText attributedText = this.f294839d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        a aVar = this.f294840e;
        return Boolean.hashCode(this.f294841f) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelInfoHeaderItem(stringId=");
        sb2.append(this.f294837b);
        sb2.append(", title=");
        sb2.append(this.f294838c);
        sb2.append(", description=");
        sb2.append(this.f294839d);
        sb2.append(", button=");
        sb2.append(this.f294840e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f294841f, ')');
    }

    public /* synthetic */ b(String str, String str2, AttributedText attributedText, a aVar, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, attributedText, aVar, (i12 & 16) != 0 ? false : z12);
    }
}
