package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/k;", "Lcom/avito/conveyor_item/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class k implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f211785b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f211786c;

    public k(@Y61.k PrintableText printableText, @Y61.k PrintableText printableText2) {
        this.f211785b = printableText;
        this.f211786c = printableText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f211785b, kVar.f211785b) && L.f(this.f211786c, kVar.f211786c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF208180b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF208180b() {
        return "passport.add_profile.select_specific.header_item";
    }

    public final int hashCode() {
        return this.f211786c.hashCode() + (this.f211785b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(title=");
        sb2.append(this.f211785b);
        sb2.append(", subtitle=");
        return AK.c.m(sb2, this.f211786c, ')');
    }
}
