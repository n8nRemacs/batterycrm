package androidx.compose.ui.text;

import androidx.compose.runtime.H0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.y;
import kotlin.Metadata;

/* compiled from: TextMeasurer.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/s;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22671s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n0 f42624a;

    public C22671s(@Y61.k n0 n0Var) {
        this.f42624a = n0Var;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22671s)) {
            return false;
        }
        n0 n0Var = this.f42624a;
        C22671s c22671s = (C22671s) obj;
        if (!kotlin.jvm.internal.L.f(n0Var.f42506a, c22671s.f42624a.f42506a)) {
            return false;
        }
        if (!n0Var.f42507b.f(c22671s.f42624a.f42507b)) {
            return false;
        }
        if (!kotlin.jvm.internal.L.f(n0Var.f42508c, c22671s.f42624a.f42508c)) {
            return false;
        }
        n0 n0Var2 = c22671s.f42624a;
        if (n0Var.f42509d != n0Var2.f42509d) {
            return false;
        }
        if (n0Var.f42510e != n0Var2.f42510e) {
            return false;
        }
        if (!androidx.compose.ui.text.style.s.a(n0Var.f42511f, n0Var2.f42511f)) {
            return false;
        }
        if (!kotlin.jvm.internal.L.f(n0Var.f42512g, c22671s.f42624a.f42512g)) {
            return false;
        }
        n0 n0Var3 = c22671s.f42624a;
        if (n0Var.f42513h != n0Var3.f42513h) {
            return false;
        }
        if (n0Var.f42514i != n0Var3.f42514i) {
            return false;
        }
        return C22712b.d(n0Var.f42515j, n0Var3.f42515j);
    }

    public final int hashCode() {
        n0 n0Var = this.f42624a;
        int iHashCode = n0Var.f42506a.hashCode() * 31;
        x0 x0Var = n0Var.f42507b;
        e0 e0Var = x0Var.f42739a;
        e0Var.getClass();
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        int iHashCode2 = Long.hashCode(e0Var.fontSize) * 31;
        androidx.compose.ui.text.font.e0 e0Var2 = e0Var.fontWeight;
        int i12 = (iHashCode2 + (e0Var2 != null ? e0Var2.f42253b : 0)) * 31;
        androidx.compose.ui.text.font.Z z12 = e0Var.fontStyle;
        int iHashCode3 = (i12 + (z12 != null ? Integer.hashCode(z12.f42219a) : 0)) * 31;
        C22605a0 c22605a0 = e0Var.fontSynthesis;
        int iHashCode4 = (iHashCode3 + (c22605a0 != null ? Integer.hashCode(c22605a0.f42227a) : 0)) * 31;
        androidx.compose.ui.text.font.E e12 = e0Var.fontFamily;
        int iHashCode5 = (iHashCode4 + (e12 != null ? e12.hashCode() : 0)) * 31;
        String str = e0Var.fontFeatureSettings;
        int iG2 = androidx.appcompat.app.r.g((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, e0Var.letterSpacing);
        androidx.compose.ui.text.style.a aVar2 = e0Var.baselineShift;
        int iHashCode6 = (iG2 + (aVar2 != null ? Float.hashCode(aVar2.f42630a) : 0)) * 31;
        androidx.compose.ui.text.style.n nVar = e0Var.textGeometricTransform;
        int iHashCode7 = (iHashCode6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        z0.f fVar = e0Var.localeList;
        int iHashCode8 = (iHashCode7 + (fVar != null ? fVar.f443678b.hashCode() : 0)) * 31;
        T.a aVar3 = androidx.compose.ui.graphics.T.f39320b;
        int i13 = kotlin.w0.f410662c;
        int iG3 = androidx.appcompat.app.r.g(iHashCode8, 31, e0Var.f42153l);
        X x12 = e0Var.platformStyle;
        int iHashCode9 = (x0Var.f42740b.hashCode() + ((iG3 + (x12 != null ? x12.hashCode() : 0)) * 31)) * 31;
        Z z13 = x0Var.platformStyle;
        int i14 = androidx.appcompat.app.r.i((androidx.compose.foundation.H.e((iHashCode9 + (z13 != null ? z13.hashCode() : 0) + iHashCode) * 31, 31, n0Var.f42508c) + n0Var.f42509d) * 31, 31, n0Var.f42510e);
        s.a aVar4 = androidx.compose.ui.text.style.s.f42720b;
        int iHashCode10 = (n0Var.f42514i.hashCode() + ((n0Var.f42513h.hashCode() + ((n0Var.f42512g.hashCode() + androidx.appcompat.app.r.e(n0Var.f42511f, i14, 31)) * 31)) * 31)) * 31;
        C22712b.a aVar5 = C22712b.f42842b;
        return Long.hashCode(n0Var.f42515j) + iHashCode10;
    }
}
