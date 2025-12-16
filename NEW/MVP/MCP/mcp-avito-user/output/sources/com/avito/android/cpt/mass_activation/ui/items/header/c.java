package com.avito.android.cpt.mass_activation.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126661b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f126662c;

    public c(@k String str, @l AttributedText attributedText) {
        this.f126661b = str;
        this.f126662c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f126661b, cVar.f126661b) && L.f(this.f126662c, cVar.f126662c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return -1505745181;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF118405b() {
        return "cpt_mass_activation_header";
    }

    public final int hashCode() {
        int iD2 = H.d(566539645, 31, this.f126661b);
        AttributedText attributedText = this.f126662c;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptMassActivationHeaderItem(stringId=cpt_mass_activation_header, title=");
        sb2.append(this.f126661b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f126662c, ')');
    }
}
