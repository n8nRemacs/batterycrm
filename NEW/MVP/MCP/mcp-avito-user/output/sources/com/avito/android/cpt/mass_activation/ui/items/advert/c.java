package com.avito.android.cpt.mass_activation.ui.items.advert;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationAdvertItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/advert/c;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f126609b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Image f126610c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f126611d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f126612e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f126613f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f126614g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final k f126615h;

    public c(@Y61.k String str, @Y61.k Image image, @Y61.k AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l AttributedText attributedText4, @l k kVar) {
        this.f126609b = str;
        this.f126610c = image;
        this.f126611d = attributedText;
        this.f126612e = attributedText2;
        this.f126613f = attributedText3;
        this.f126614g = attributedText4;
        this.f126615h = kVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f126609b, cVar.f126609b) && L.f(this.f126610c, cVar.f126610c) && L.f(this.f126611d, cVar.f126611d) && L.f(this.f126612e, cVar.f126612e) && L.f(this.f126613f, cVar.f126613f) && L.f(this.f126614g, cVar.f126614g) && L.f(this.f126615h, cVar.f126615h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return getF126166c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF126166c() {
        return this.f126609b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.g(this.f126610c, this.f126609b.hashCode() * 31, 31), 31, this.f126611d);
        AttributedText attributedText = this.f126612e;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f126613f;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f126614g;
        int iHashCode3 = (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        k kVar = this.f126615h;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CptMassActivationAdvertItem(stringId=" + this.f126609b + ", image=" + this.f126610c + ", title=" + this.f126611d + ", description=" + this.f126612e + ", fee=" + this.f126613f + ", fbsFee=" + this.f126614g + ", feeTooltip=" + this.f126615h + ')';
    }
}
