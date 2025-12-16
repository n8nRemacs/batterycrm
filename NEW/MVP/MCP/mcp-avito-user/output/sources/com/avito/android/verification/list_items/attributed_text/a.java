package com.avito.android.verification.list_items.attributed_text;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AttributedTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/attributed_text/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324767b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f324768c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f324769d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f324770e;

    public a(String str, AttributedText attributedText, Integer num, boolean z12, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        num = (i12 & 4) != 0 ? Integer.valueOf(R.attr.textM10) : num;
        z12 = (i12 & 8) != 0 ? false : z12;
        this.f324767b = str;
        this.f324768c = attributedText;
        this.f324769d = num;
        this.f324770e = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324767b, aVar.f324767b) && L.f(this.f324768c, aVar.f324768c) && L.f(this.f324769d, aVar.f324769d) && this.f324770e == aVar.f324770e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF290919b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290919b() {
        return this.f324767b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f324767b.hashCode() * 31, 31, this.f324768c);
        Integer num = this.f324769d;
        return Boolean.hashCode(this.f324770e) + ((iB2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttributedTextItem(stringId=");
        sb2.append(this.f324767b);
        sb2.append(", text=");
        sb2.append(this.f324768c);
        sb2.append(", appearanceAttr=");
        sb2.append(this.f324769d);
        sb2.append(", showBullet=");
        return r.x(sb2, this.f324770e, ')');
    }
}
