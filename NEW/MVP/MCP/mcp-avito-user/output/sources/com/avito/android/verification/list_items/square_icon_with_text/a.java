package com.avito.android.verification.list_items.square_icon_with_text;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SquareIconWithTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/square_icon_with_text/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f324830c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f324831d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f324832e;

    public a(String str, String str2, AttributedText attributedText, String str3, int i12, C42822w c42822w) {
        this.f324829b = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f324830c = str2;
        this.f324831d = attributedText;
        this.f324832e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324829b, aVar.f324829b) && L.f(this.f324830c, aVar.f324830c) && L.f(this.f324831d, aVar.f324831d) && L.f(this.f324832e, aVar.f324832e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF281502b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281502b() {
        return this.f324829b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f324829b.hashCode() * 31, 31, this.f324830c);
        AttributedText attributedText = this.f324831d;
        return this.f324832e.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SquareIconWithTextItem(stringId=");
        sb2.append(this.f324829b);
        sb2.append(", title=");
        sb2.append(this.f324830c);
        sb2.append(", body=");
        sb2.append(this.f324831d);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.f324832e, ')');
    }
}
