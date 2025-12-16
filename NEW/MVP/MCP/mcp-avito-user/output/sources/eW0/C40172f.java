package ew0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/f;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C40172f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f395483a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC40168b f395484b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40167a f395485c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC40173g f395486d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f395487e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f395488f;

    public C40172f(@k PrintableText printableText, @k AbstractC40168b abstractC40168b, @k InterfaceC40167a interfaceC40167a, @k InterfaceC40173g interfaceC40173g, @k PrintableText printableText2, boolean z12) {
        this.f395483a = printableText;
        this.f395484b = abstractC40168b;
        this.f395485c = interfaceC40167a;
        this.f395486d = interfaceC40173g;
        this.f395487e = printableText2;
        this.f395488f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40172f)) {
            return false;
        }
        C40172f c40172f = (C40172f) obj;
        return L.f(this.f395483a, c40172f.f395483a) && L.f(this.f395484b, c40172f.f395484b) && L.f(this.f395485c, c40172f.f395485c) && L.f(this.f395486d, c40172f.f395486d) && L.f(this.f395487e, c40172f.f395487e) && this.f395488f == c40172f.f395488f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f395488f) + com.avito.android.actions_sheet.a.f(this.f395487e, (this.f395486d.hashCode() + ((this.f395485c.hashCode() + ((this.f395484b.hashCode() + (this.f395483a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCodeViewState(title=");
        sb2.append(this.f395483a);
        sb2.append(", input=");
        sb2.append(this.f395484b);
        sb2.append(", inputDescription=");
        sb2.append(this.f395485c);
        sb2.append(", promoCodes=");
        sb2.append(this.f395486d);
        sb2.append(", buttonTitle=");
        sb2.append(this.f395487e);
        sb2.append(", isButtonLoading=");
        return r.x(sb2, this.f395488f, ')');
    }
}
