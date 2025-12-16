package com.avito.android.cpt.activation.ui.items.cnc;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationCncItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/cnc/a;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f126343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126344c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f126345d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126346e;

    public a(@l AttributedText attributedText, @k Q q12, @l DeepLink deepLink, @k Q q13) {
        this.f126343b = attributedText;
        this.f126344c = q12;
        this.f126345d = deepLink;
        this.f126346e = q13;
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
        return L.f(this.f126343b, aVar.f126343b) && this.f126344c.equals(aVar.f126344c) && L.f(this.f126345d, aVar.f126345d) && this.f126346e.equals(aVar.f126346e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return -1926938553;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF126166c() {
        return "cpt_activation_cnc";
    }

    public final int hashCode() {
        AttributedText attributedText = this.f126343b;
        int iHashCode = (this.f126344c.hashCode() + ((394447001 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f126345d;
        return this.f126346e.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationCncItem(stringId=cpt_activation_cnc, title=");
        sb2.append(this.f126343b);
        sb2.append(", feeTexts=");
        sb2.append(this.f126344c);
        sb2.append(", feeDeeplink=");
        sb2.append(this.f126345d);
        sb2.append(", totalTexts=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(sb2, this.f126346e, ')');
    }
}
