package com.avito.android.tariff_lf.edit_info.item.tools_header_item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToolsHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/tools_header_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299061b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f299062c;

    public a(@k String str, @l AttributedText attributedText) {
        this.f299061b = str;
        this.f299062c = attributedText;
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
        return L.f(this.f299061b, aVar.f299061b) && L.f(this.f299062c, aVar.f299062c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return -2027202191;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF297177b() {
        return "tools_header";
    }

    public final int hashCode() {
        int iD2 = H.d(1581241519, 31, this.f299061b);
        AttributedText attributedText = this.f299062c;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToolsHeaderItem(stringId=tools_header, title=");
        sb2.append(this.f299061b);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f299062c, ')');
    }
}
