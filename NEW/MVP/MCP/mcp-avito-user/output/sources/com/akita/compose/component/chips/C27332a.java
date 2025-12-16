package com.akita.compose.component.chips;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Chip.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/chips/a;", "Lcom/akita/compose/component/chips/b;", "chips_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.component.chips.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C27332a implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f60867b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60868c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f60869d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f60870e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f60871f;

    public C27332a(String str, boolean z12, boolean z13, Integer num, Integer num2, int i12, C42822w c42822w) {
        z13 = (i12 & 4) != 0 ? true : z13;
        num = (i12 & 8) != 0 ? null : num;
        num2 = (i12 & 16) != 0 ? null : num2;
        this.f60867b = str;
        this.f60868c = z12;
        this.f60869d = z13;
        this.f60870e = num;
        this.f60871f = num2;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Integer getF60871f() {
        return this.f60871f;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getF60870e() {
        return this.f60870e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27332a)) {
            return false;
        }
        C27332a c27332a = (C27332a) obj;
        return L.f(this.f60867b, c27332a.f60867b) && this.f60868c == c27332a.f60868c && this.f60869d == c27332a.f60869d && L.f(this.f60870e, c27332a.f60870e) && L.f(this.f60871f, c27332a.f60871f);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF60867b() {
        return this.f60867b;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f60867b.hashCode() * 31, 31, this.f60868c), 31, this.f60869d);
        Integer num = this.f60870e;
        int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f60871f;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    public final boolean isActive() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF60869d() {
        return this.f60869d;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF60868c() {
        return this.f60868c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Chip(title=");
        sb2.append(this.f60867b);
        sb2.append(", isSelected=");
        sb2.append(this.f60868c);
        sb2.append(", isEnabled=");
        sb2.append(this.f60869d);
        sb2.append(", leftIconRes=");
        sb2.append(this.f60870e);
        sb2.append(", rightIconRes=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f60871f, ')');
    }
}
