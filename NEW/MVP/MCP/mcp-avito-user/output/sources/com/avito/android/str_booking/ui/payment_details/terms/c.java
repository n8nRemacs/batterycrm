package com.avito.android.str_booking.ui.payment_details.terms;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingTermItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/terms/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f286138b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f286139c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f286140d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f286141e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f286142f;

    public c(@l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l String str, @k String str2) {
        this.f286138b = attributedText;
        this.f286139c = attributedText2;
        this.f286140d = attributedText3;
        this.f286141e = str;
        this.f286142f = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f286138b, cVar.f286138b) && L.f(this.f286139c, cVar.f286139c) && L.f(this.f286140d, cVar.f286140d) && L.f(this.f286141e, cVar.f286141e) && L.f(this.f286142f, cVar.f286142f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return getF281166b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281166b() {
        return this.f286142f;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f286138b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f286139c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f286140d;
        int iHashCode3 = (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        String str = this.f286141e;
        return this.f286142f.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingTermItem(title=");
        sb2.append(this.f286138b);
        sb2.append(", value=");
        sb2.append(this.f286139c);
        sb2.append(", subtitle=");
        sb2.append(this.f286140d);
        sb2.append(", hint=");
        sb2.append(this.f286141e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f286142f, ')');
    }
}
