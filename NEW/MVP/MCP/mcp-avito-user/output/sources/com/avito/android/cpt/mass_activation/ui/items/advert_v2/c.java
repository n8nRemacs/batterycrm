package com.avito.android.cpt.mass_activation.ui.items.advert_v2;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationAdvertV2Item.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/c;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f126635b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Image f126636c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f126637d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f126638e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f126639f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f126640g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final k f126641h;

    public c(@Y61.k String str, @Y61.k Image image, @Y61.k AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l AttributedText attributedText4, @l k kVar) {
        this.f126635b = str;
        this.f126636c = image;
        this.f126637d = attributedText;
        this.f126638e = attributedText2;
        this.f126639f = attributedText3;
        this.f126640g = attributedText4;
        this.f126641h = kVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f126635b, cVar.f126635b) && L.f(this.f126636c, cVar.f126636c) && L.f(this.f126637d, cVar.f126637d) && L.f(this.f126638e, cVar.f126638e) && L.f(this.f126639f, cVar.f126639f) && L.f(this.f126640g, cVar.f126640g) && L.f(this.f126641h, cVar.f126641h);
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
        return this.f126635b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.g(this.f126636c, this.f126635b.hashCode() * 31, 31), 31, this.f126637d);
        AttributedText attributedText = this.f126638e;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f126639f;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f126640g;
        int iHashCode3 = (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        k kVar = this.f126641h;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CptMassActivationAdvertV2Item(stringId=" + this.f126635b + ", image=" + this.f126636c + ", title=" + this.f126637d + ", description=" + this.f126638e + ", fee=" + this.f126639f + ", fbsFee=" + this.f126640g + ", feeTooltip=" + this.f126641h + ')';
    }
}
