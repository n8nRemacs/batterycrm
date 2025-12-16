package com.avito.android.mortgage.root.list.items.title;

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

/* compiled from: TitleItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/title/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202883b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f202884c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f202885d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f202886e;

    public /* synthetic */ c(String str, AttributedText attributedText, AttributedText attributedText2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 8) != 0 ? true : z12, attributedText, str, (i12 & 4) != 0 ? null : attributedText2);
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(false, this.f202884c, this.f202883b, this.f202885d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202883b, cVar.f202883b) && L.f(this.f202884c, cVar.f202884c) && L.f(this.f202885d, cVar.f202885d) && this.f202886e == cVar.f202886e;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202708g() {
        return this.f202886e;
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
        return this.f202883b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f202883b.hashCode() * 31, 31, this.f202884c);
        AttributedText attributedText = this.f202885d;
        return Boolean.hashCode(this.f202886e) + ((iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f202883b);
        sb2.append(", title=");
        sb2.append(this.f202884c);
        sb2.append(", subtitle=");
        sb2.append(this.f202885d);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202886e, ')');
    }

    public c(boolean z12, @k AttributedText attributedText, @k String str, @l AttributedText attributedText2) {
        this.f202883b = str;
        this.f202884c = attributedText;
        this.f202885d = attributedText2;
        this.f202886e = z12;
    }
}
