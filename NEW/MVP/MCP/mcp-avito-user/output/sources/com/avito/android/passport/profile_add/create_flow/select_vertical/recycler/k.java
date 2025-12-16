package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/k;", "Lcom/avito/conveyor_item/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class k implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f212008b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f212009c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PrintableText f212010d;

    public k(@Y61.k PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.k PrintableText printableText3) {
        this.f212008b = printableText;
        this.f212009c = printableText2;
        this.f212010d = printableText3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f212008b, kVar.f212008b) && L.f(this.f212009c, kVar.f212009c) && L.f(this.f212010d, kVar.f212010d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF202667b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF202667b() {
        return "passport.add_profile.select_vertical.header_item";
    }

    public final int hashCode() {
        return this.f212010d.hashCode() + com.avito.android.actions_sheet.a.f(this.f212009c, this.f212008b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(title=");
        sb2.append(this.f212008b);
        sb2.append(", subtitle=");
        sb2.append(this.f212009c);
        sb2.append(", description=");
        return AK.c.m(sb2, this.f212010d, ')');
    }
}
