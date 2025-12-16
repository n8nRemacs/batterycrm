package com.avito.android.cpt.activation.ui.items.delivery;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationDeliveryItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/delivery/a;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f126381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126382c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f126383d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126384e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126385f;

    public a(@l AttributedText attributedText, @k Q q12, @l DeepLink deepLink, @k Q q13, @k Q q14) {
        this.f126381b = attributedText;
        this.f126382c = q12;
        this.f126383d = deepLink;
        this.f126384e = q13;
        this.f126385f = q14;
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
        return L.f(this.f126381b, aVar.f126381b) && this.f126382c.equals(aVar.f126382c) && L.f(this.f126383d, aVar.f126383d) && this.f126384e.equals(aVar.f126384e) && this.f126385f.equals(aVar.f126385f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return 846092901;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF126166c() {
        return "cpt_activation_delivery";
    }

    public final int hashCode() {
        AttributedText attributedText = this.f126381b;
        int iHashCode = (this.f126382c.hashCode() + ((459076155 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f126383d;
        return this.f126385f.hashCode() + ((this.f126384e.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationDeliveryItem(stringId=cpt_activation_delivery, title=");
        sb2.append(this.f126381b);
        sb2.append(", feeTexts=");
        sb2.append(this.f126382c);
        sb2.append(", feeDeeplink=");
        sb2.append(this.f126383d);
        sb2.append(", discountTexts=");
        sb2.append(this.f126384e);
        sb2.append(", totalTexts=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(sb2, this.f126385f, ')');
    }
}
