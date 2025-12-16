package RI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/c;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f14288a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f14289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14290c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f14291d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14292e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14293f;

    public c(@l AttributedText attributedText, @l AttributedText attributedText2, int i12, @k PrintableText printableText, boolean z12, boolean z13) {
        this.f14288a = attributedText;
        this.f14289b = attributedText2;
        this.f14290c = i12;
        this.f14291d = printableText;
        this.f14292e = z12;
        this.f14293f = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14288a, cVar.f14288a) && L.f(this.f14289b, cVar.f14289b) && this.f14290c == cVar.f14290c && L.f(this.f14291d, cVar.f14291d) && this.f14292e == cVar.f14292e && this.f14293f == cVar.f14293f;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f14288a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f14289b;
        return Boolean.hashCode(this.f14293f) + r.i(com.avito.android.actions_sheet.a.f(this.f14291d, r.e(this.f14290c, (iHashCode + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31, 31), 31), 31, this.f14292e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingFloatingBlockViewState(price=");
        sb2.append(this.f14288a);
        sb2.append(", description=");
        sb2.append(this.f14289b);
        sb2.append(", buttonStyle=");
        sb2.append(this.f14290c);
        sb2.append(", buttonText=");
        sb2.append(this.f14291d);
        sb2.append(", isVisible=");
        sb2.append(this.f14292e);
        sb2.append(", showRedesign=");
        return r.x(sb2, this.f14293f, ')');
    }
}
