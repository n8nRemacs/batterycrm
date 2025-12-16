package q4;

import VU.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AnchorsExpandContainerStyle.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq4/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C47196a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f429010a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f429011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f429012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f429013d;

    public C47196a(@k b bVar, @k b bVar2, @U int i12, @U int i13) {
        this.f429010a = bVar;
        this.f429011b = bVar2;
        this.f429012c = i12;
        this.f429013d = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47196a)) {
            return false;
        }
        C47196a c47196a = (C47196a) obj;
        return L.f(this.f429010a, c47196a.f429010a) && L.f(this.f429011b, c47196a.f429011b) && this.f429012c == c47196a.f429012c && this.f429013d == c47196a.f429013d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f429013d) + r.e(this.f429012c, (this.f429011b.hashCode() + (this.f429010a.hashCode() * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorsExpandContainerStyle(buttonStyle=");
        sb2.append(this.f429010a);
        sb2.append(", expandButtonStyle=");
        sb2.append(this.f429011b);
        sb2.append(", verticalSpacing=");
        sb2.append(this.f429012c);
        sb2.append(", horizontalSpacing=");
        return r.t(sb2, this.f429013d, ')');
    }

    public /* synthetic */ C47196a(b bVar, b bVar2, int i12, int i13, int i14, C42822w c42822w) {
        this(bVar, bVar2, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
