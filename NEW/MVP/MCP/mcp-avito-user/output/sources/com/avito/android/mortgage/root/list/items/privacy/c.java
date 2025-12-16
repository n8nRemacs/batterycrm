package com.avito.android.mortgage.root.list.items.privacy;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PrivacyItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/privacy/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202731b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f202732c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f202733d;

    public c(@k AttributedText attributedText, @k String str, boolean z12) {
        this.f202731b = str;
        this.f202732c = attributedText;
        this.f202733d = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202732c, this.f202731b, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202731b, cVar.f202731b) && L.f(this.f202732c, cVar.f202732c) && this.f202733d == cVar.f202733d;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202708g() {
        return this.f202733d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83467b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF81752b() {
        return this.f202731b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202733d) + com.avito.android.actions_sheet.a.b(this.f202731b.hashCode() * 31, 31, this.f202732c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PrivacyItem(stringId=");
        sb2.append(this.f202731b);
        sb2.append(", text=");
        sb2.append(this.f202732c);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202733d, ')');
    }

    public /* synthetic */ c(String str, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, str, (i12 & 4) != 0 ? true : z12);
    }
}
