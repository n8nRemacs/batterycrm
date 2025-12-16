package com.avito.android.screens.bbip_private.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f260862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f260863c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f260864d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f260865e;

    public a(@k String str, @k String str2, @l String str3, @l AttributedText attributedText) {
        this.f260862b = str;
        this.f260863c = str2;
        this.f260864d = str3;
        this.f260865e = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f260862b, aVar.f260862b) && L.f(this.f260863c, aVar.f260863c) && L.f(this.f260864d, aVar.f260864d) && L.f(this.f260865e, aVar.f260865e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return getF2687b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF2687b() {
        return this.f260862b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f260862b.hashCode() * 31, 31, this.f260863c);
        String str = this.f260864d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f260865e;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateHeaderItem(stringId=");
        sb2.append(this.f260862b);
        sb2.append(", title=");
        sb2.append(this.f260863c);
        sb2.append(", subTitle=");
        sb2.append(this.f260864d);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f260865e, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, attributedText);
    }
}
