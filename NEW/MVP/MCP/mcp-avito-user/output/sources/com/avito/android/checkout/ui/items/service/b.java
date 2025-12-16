package com.avito.android.checkout.ui.items.service;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutServiceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/service/b;", "Lcom/avito/conveyor_item/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f118486b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final wZ.l f118487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f118488d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributedText f118489e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f118490f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f118491g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f118492h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f118493i;

    public b(@Y61.k String str, @l wZ.l lVar, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @l a aVar, boolean z12, boolean z13, @l AttributedText attributedText3) {
        this.f118486b = str;
        this.f118487c = lVar;
        this.f118488d = attributedText;
        this.f118489e = attributedText2;
        this.f118490f = aVar;
        this.f118491g = z12;
        this.f118492h = z13;
        this.f118493i = attributedText3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f118486b, bVar.f118486b) && L.f(this.f118487c, bVar.f118487c) && L.f(this.f118488d, bVar.f118488d) && L.f(this.f118489e, bVar.f118489e) && L.f(this.f118490f, bVar.f118490f) && this.f118491g == bVar.f118491g && this.f118492h == bVar.f118492h && L.f(this.f118493i, bVar.f118493i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF118947g().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF118947g() {
        return this.f118486b;
    }

    public final int hashCode() {
        int iHashCode = this.f118486b.hashCode() * 31;
        wZ.l lVar = this.f118487c;
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f118488d), 31, this.f118489e);
        a aVar = this.f118490f;
        int i12 = r.i(r.i((iB2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f118491g), 31, this.f118492h);
        AttributedText attributedText = this.f118493i;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutServiceItem(stringId=");
        sb2.append(this.f118486b);
        sb2.append(", icon=");
        sb2.append(this.f118487c);
        sb2.append(", title=");
        sb2.append(this.f118488d);
        sb2.append(", price=");
        sb2.append(this.f118489e);
        sb2.append(", action=");
        sb2.append(this.f118490f);
        sb2.append(", isFullFillLine=");
        sb2.append(this.f118491g);
        sb2.append(", isRemoved=");
        sb2.append(this.f118492h);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f118493i, ')');
    }
}
