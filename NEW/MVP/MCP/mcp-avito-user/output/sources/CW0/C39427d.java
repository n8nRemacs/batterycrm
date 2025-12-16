package cw0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.mvi.entity.FooterButtonItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/d;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39427d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f393082a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f393083b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FooterButtonItem f393084c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f393085d;

    public C39427d(@l AttributedText attributedText, @k AttributedText attributedText2, @k FooterButtonItem footerButtonItem, @l String str) {
        this.f393082a = attributedText;
        this.f393083b = attributedText2;
        this.f393084c = footerButtonItem;
        this.f393085d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39427d)) {
            return false;
        }
        C39427d c39427d = (C39427d) obj;
        return L.f(this.f393082a, c39427d.f393082a) && L.f(this.f393083b, c39427d.f393083b) && L.f(this.f393084c, c39427d.f393084c) && L.f(this.f393085d, c39427d.f393085d);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f393082a;
        int iHashCode = (this.f393084c.hashCode() + com.avito.android.actions_sheet.a.b((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.f393083b)) * 31;
        String str = this.f393085d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FooterItem(price=");
        sb2.append(this.f393082a);
        sb2.append(", description=");
        sb2.append(this.f393083b);
        sb2.append(", button=");
        sb2.append(this.f393084c);
        sb2.append(", toItemId=");
        return C22026a.c(sb2, this.f393085d, ')');
    }
}
