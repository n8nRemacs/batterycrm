package RN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRN0/d;", "", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14436a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14437b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14438c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final QN0.a f14439d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final QN0.a f14440e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final QN0.a f14441f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final QN0.a f14442g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<PN0.a> f14443h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final PrintableText f14444i;

    public d(boolean z12, boolean z13, boolean z14, @k QN0.a aVar, @k QN0.a aVar2, @k QN0.a aVar3, @k QN0.a aVar4, @k List<PN0.a> list, @l PrintableText printableText) {
        this.f14436a = z12;
        this.f14437b = z13;
        this.f14438c = z14;
        this.f14439d = aVar;
        this.f14440e = aVar2;
        this.f14441f = aVar3;
        this.f14442g = aVar4;
        this.f14443h = list;
        this.f14444i = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f14436a == dVar.f14436a && this.f14437b == dVar.f14437b && this.f14438c == dVar.f14438c && L.f(this.f14439d, dVar.f14439d) && L.f(this.f14440e, dVar.f14440e) && L.f(this.f14441f, dVar.f14441f) && L.f(this.f14442g, dVar.f14442g) && L.f(this.f14443h, dVar.f14443h) && L.f(this.f14444i, dVar.f14444i);
    }

    public final int hashCode() {
        int iE2 = H.e((this.f14442g.hashCode() + ((this.f14441f.hashCode() + ((this.f14440e.hashCode() + ((this.f14439d.hashCode() + r.i(r.i(Boolean.hashCode(this.f14436a) * 31, 31, this.f14437b), 31, this.f14438c)) * 31)) * 31)) * 31)) * 31, 31, this.f14443h);
        PrintableText printableText = this.f14444i;
        return iE2 + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateViewState(showBottomButton=");
        sb2.append(this.f14436a);
        sb2.append(", showButtonLoader=");
        sb2.append(this.f14437b);
        sb2.append(", showExistingClientsPlaceholders=");
        sb2.append(this.f14438c);
        sb2.append(", firstName=");
        sb2.append(this.f14439d);
        sb2.append(", lastName=");
        sb2.append(this.f14440e);
        sb2.append(", middleName=");
        sb2.append(this.f14441f);
        sb2.append(", phone=");
        sb2.append(this.f14442g);
        sb2.append(", suggestedClients=");
        sb2.append(this.f14443h);
        sb2.append(", suggestedClientsText=");
        return AK.c.m(sb2, this.f14444i, ')');
    }
}
