package x10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx10/a;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49742a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f442080a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f442081b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442082c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f442083d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f442084e;

    public C49742a(@k PrintableText printableText, @k DeepLink deepLink, boolean z12, boolean z13, boolean z14) {
        this.f442080a = printableText;
        this.f442081b = deepLink;
        this.f442082c = z12;
        this.f442083d = z13;
        this.f442084e = z14;
    }

    public static C49742a a(C49742a c49742a, DeepLink deepLink, boolean z12, boolean z13, int i12) {
        PrintableText printableText = c49742a.f442080a;
        if ((i12 & 2) != 0) {
            deepLink = c49742a.f442081b;
        }
        DeepLink deepLink2 = deepLink;
        boolean z14 = c49742a.f442082c;
        if ((i12 & 8) != 0) {
            z12 = c49742a.f442083d;
        }
        boolean z15 = z12;
        if ((i12 & 16) != 0) {
            z13 = c49742a.f442084e;
        }
        c49742a.getClass();
        return new C49742a(printableText, deepLink2, z14, z15, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49742a)) {
            return false;
        }
        C49742a c49742a = (C49742a) obj;
        return L.f(this.f442080a, c49742a.f442080a) && L.f(this.f442081b, c49742a.f442081b) && this.f442082c == c49742a.f442082c && this.f442083d == c49742a.f442083d && this.f442084e == c49742a.f442084e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f442084e) + r.i(r.i(com.avito.android.actions_sheet.a.e(this.f442081b, this.f442080a.hashCode() * 31, 31), 31, this.f442082c), 31, this.f442083d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItem(text=");
        sb2.append(this.f442080a);
        sb2.append(", deeplink=");
        sb2.append(this.f442081b);
        sb2.append(", isLoading=");
        sb2.append(this.f442082c);
        sb2.append(", isEnabled=");
        sb2.append(this.f442083d);
        sb2.append(", isVisible=");
        return r.x(sb2, this.f442084e, ')');
    }

    public /* synthetic */ C49742a(PrintableText printableText, DeepLink deepLink, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(printableText, deepLink, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? true : z13, (i12 & 16) != 0 ? true : z14);
    }
}
