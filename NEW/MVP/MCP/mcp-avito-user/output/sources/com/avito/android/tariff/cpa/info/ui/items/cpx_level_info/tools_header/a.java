package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevelInfoToolsHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tools_header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f294887c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f294888d;

    public a(@k AttributedText attributedText, @k String str, boolean z12) {
        this.f294886b = str;
        this.f294887c = attributedText;
        this.f294888d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f294886b, aVar.f294886b) && L.f(this.f294887c, aVar.f294887c) && this.f294888d == aVar.f294888d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF289436b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289436b() {
        return this.f294886b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f294888d) + com.avito.android.actions_sheet.a.b(this.f294886b.hashCode() * 31, 31, this.f294887c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelInfoToolsHeaderItem(stringId=");
        sb2.append(this.f294886b);
        sb2.append(", title=");
        sb2.append(this.f294887c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f294888d, ')');
    }

    public /* synthetic */ a(String str, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, str, (i12 & 4) != 0 ? false : z12);
    }
}
