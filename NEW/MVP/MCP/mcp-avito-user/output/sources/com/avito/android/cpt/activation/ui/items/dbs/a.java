package com.avito.android.cpt.activation.ui.items.dbs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationDbsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/dbs/a;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f126361b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126362c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f126363d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Q<AttributedText, String> f126364e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f126365f;

    public a(@l AttributedText attributedText, @k Q q12, @l DeepLink deepLink, @k Q q13, @l AttributedText attributedText2) {
        this.f126361b = attributedText;
        this.f126362c = q12;
        this.f126363d = deepLink;
        this.f126364e = q13;
        this.f126365f = attributedText2;
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
        return L.f(this.f126361b, aVar.f126361b) && this.f126362c.equals(aVar.f126362c) && L.f(this.f126363d, aVar.f126363d) && this.f126364e.equals(aVar.f126364e) && L.f(this.f126365f, aVar.f126365f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return -1926937948;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF126166c() {
        return "cpt_activation_dbs";
    }

    public final int hashCode() {
        AttributedText attributedText = this.f126361b;
        int iHashCode = (this.f126362c.hashCode() + ((394465756 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f126363d;
        int iHashCode2 = (this.f126364e.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
        AttributedText attributedText2 = this.f126365f;
        return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationDbsItem(stringId=cpt_activation_dbs, title=");
        sb2.append(this.f126361b);
        sb2.append(", feeTexts=");
        sb2.append(this.f126362c);
        sb2.append(", feeDeeplink=");
        sb2.append(this.f126363d);
        sb2.append(", totalTexts=");
        sb2.append(this.f126364e);
        sb2.append(", additionalInfo=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f126365f, ')');
    }
}
