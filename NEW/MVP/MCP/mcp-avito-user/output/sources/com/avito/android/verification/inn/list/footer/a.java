package com.avito.android.verification.inn.list.footer;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FooterItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/footer/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f323975b;

    public a(@k AttributedText attributedText) {
        this.f323975b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f323975b, aVar.f323975b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return 2079435163;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF281670b() {
        return "FOOTER";
    }

    public final int hashCode() {
        return this.f323975b.hashCode() + 37980613;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("FooterItem(stringId=FOOTER, text="), this.f323975b, ')');
    }
}
