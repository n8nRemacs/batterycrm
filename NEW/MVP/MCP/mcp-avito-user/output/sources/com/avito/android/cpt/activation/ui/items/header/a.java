package com.avito.android.cpt.activation.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f126401b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f126402c;

    public a(@k AttributedText attributedText, @l AttributedText attributedText2) {
        this.f126401b = attributedText;
        this.f126402c = attributedText2;
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
        return L.f(this.f126401b, aVar.f126401b) && L.f(this.f126402c, aVar.f126402c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return 1241319742;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF118933d() {
        return "cpt_activation_header";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(-173793662, 31, this.f126401b);
        AttributedText attributedText = this.f126402c;
        return iB2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationHeaderItem(stringId=cpt_activation_header, title=");
        sb2.append(this.f126401b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f126402c, ')');
    }
}
