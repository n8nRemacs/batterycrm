package com.avito.android.cpt.mass_activation.ui.items.advert;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationAdvertItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/advert/k;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f126628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f126629b;

    public k(@l AttributedText attributedText, @Y61.k AttributedText attributedText2) {
        this.f126628a = attributedText;
        this.f126629b = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f126628a, kVar.f126628a) && L.f(this.f126629b, kVar.f126629b);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f126628a;
        return this.f126629b.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TooltipContent(title=");
        sb2.append(this.f126628a);
        sb2.append(", body=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f126629b, ')');
    }
}
