package com.avito.android.str_booking.ui.attributed_text;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingAttributedTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/attributed_text/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f285912b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f285913c;

    public c(@l AttributedText attributedText, @k String str) {
        this.f285912b = attributedText;
        this.f285913c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f285912b, cVar.f285912b) && L.f(this.f285913c, cVar.f285913c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF281152b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281152b() {
        return this.f285913c;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f285912b;
        return this.f285913c.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingAttributedTextItem(content=");
        sb2.append(this.f285912b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f285913c, ')');
    }
}
