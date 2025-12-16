package com.avito.android.mortgage.root.list.items.borrower_title;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BorrowerTitleItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_title/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202476b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202477c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f202478d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f202479e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202480f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f202481g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f202482h;

    public c(@l AttributedText attributedText, @k String str, @k String str2, @l String str3, boolean z12, boolean z13) {
        this.f202476b = str;
        this.f202477c = str2;
        this.f202478d = str3;
        this.f202479e = attributedText;
        this.f202480f = z12;
        this.f202481g = z13;
        this.f202482h = str;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202479e, this.f202476b, this.f202477c, this.f202478d, this.f202480f, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202476b, cVar.f202476b) && L.f(this.f202477c, cVar.f202477c) && L.f(this.f202478d, cVar.f202478d) && L.f(this.f202479e, cVar.f202479e) && this.f202480f == cVar.f202480f && this.f202481g == cVar.f202481g;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202556f() {
        return this.f202481g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170102b() {
        return this.f202482h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f202476b.hashCode() * 31, 31, this.f202477c);
        String str = this.f202478d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f202479e;
        return Boolean.hashCode(this.f202481g) + r.i((iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f202480f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorrowerTitleItem(borrowerId=");
        sb2.append(this.f202476b);
        sb2.append(", title=");
        sb2.append(this.f202477c);
        sb2.append(", titleStyle=");
        sb2.append(this.f202478d);
        sb2.append(", subtitle=");
        sb2.append(this.f202479e);
        sb2.append(", canEdit=");
        sb2.append(this.f202480f);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202481g, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, AttributedText attributedText, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(attributedText, str, str2, str3, z12, (i12 & 32) != 0 ? true : z13);
    }
}
