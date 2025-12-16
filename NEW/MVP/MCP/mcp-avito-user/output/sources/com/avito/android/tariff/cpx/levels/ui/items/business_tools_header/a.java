package com.avito.android.tariff.cpx.levels.ui.items.business_tools_header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxBusinessToolHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/ui/items/business_tools_header/a;", "LJB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements JB0.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f297178c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f297179d;

    public a(int i12, @k AttributedText attributedText, @k String str) {
        this.f297177b = str;
        this.f297178c = i12;
        this.f297179d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f297177b, aVar.f297177b) && this.f297178c == aVar.f297178c && L.f(this.f297179d, aVar.f297179d);
    }

    @Override // JB0.a
    /* renamed from: g, reason: from getter */
    public final int getF297178c() {
        return this.f297178c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF295701b() {
        return this.f297177b;
    }

    public final int hashCode() {
        return this.f297179d.hashCode() + r.e(this.f297178c, this.f297177b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxBusinessToolHeaderItem(stringId=");
        sb2.append(this.f297177b);
        sb2.append(", levelId=");
        sb2.append(this.f297178c);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f297179d, ')');
    }
}
