package com.avito.android.mortgage.pre_approval.result.list.items.point;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PointItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/point/c;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202060b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202061c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f202062d;

    public c(@k PrintableText printableText, @k String str, @k String str2) {
        this.f202060b = str;
        this.f202061c = str2;
        this.f202062d = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202060b, cVar.f202060b) && L.f(this.f202061c, cVar.f202061c) && L.f(this.f202062d, cVar.f202062d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183847b() {
        return this.f202060b;
    }

    public final int hashCode() {
        return this.f202062d.hashCode() + H.d(this.f202060b.hashCode() * 31, 31, this.f202061c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointItem(stringId=");
        sb2.append(this.f202060b);
        sb2.append(", iconName=");
        sb2.append(this.f202061c);
        sb2.append(", title=");
        return AK.c.m(sb2, this.f202062d, ')');
    }
}
