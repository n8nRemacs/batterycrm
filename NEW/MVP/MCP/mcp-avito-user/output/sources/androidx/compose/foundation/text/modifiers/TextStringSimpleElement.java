package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextStringSimpleElement.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/modifiers/t;", "", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/a0;", "color", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;IZIILandroidx/compose/ui/graphics/a0;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC22430p0<t> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f31604b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x0 f31605c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E.b f31606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31607e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31608f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31609g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31610h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22242a0 f31611i;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextStringSimpleElement(String str, x0 x0Var, E.b bVar, int i12, boolean z12, int i13, int i14, InterfaceC22242a0 interfaceC22242a0, int i15, C42822w c42822w) {
        int i16;
        if ((i15 & 8) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i12;
        }
        this(str, x0Var, bVar, i16, (i15 & 16) != 0 ? true : z12, (i15 & 32) != 0 ? Integer.MAX_VALUE : i13, (i15 & 64) != 0 ? 1 : i14, (i15 & 128) != 0 ? null : interfaceC22242a0, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new t(this.f31604b, this.f31605c, this.f31606d, this.f31607e, this.f31608f, this.f31609g, this.f31610h, this.f31611i, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        t tVar = (t) dVar;
        InterfaceC22242a0 interfaceC22242a0 = tVar.f31725w;
        InterfaceC22242a0 interfaceC22242a02 = this.f31611i;
        boolean zF2 = L.f(interfaceC22242a02, interfaceC22242a0);
        tVar.f31725w = interfaceC22242a02;
        boolean z12 = false;
        boolean z13 = true;
        x0 x0Var = this.f31605c;
        boolean z14 = (zF2 && x0Var.e(tVar.f31719q)) ? false : true;
        String str = tVar.f31718p;
        String str2 = this.f31604b;
        if (!L.f(str, str2)) {
            tVar.f31718p = str2;
            tVar.f31717A = null;
            z12 = true;
        }
        boolean z15 = !tVar.f31719q.f(x0Var);
        tVar.f31719q = x0Var;
        int i12 = tVar.f31724v;
        int i13 = this.f31610h;
        if (i12 != i13) {
            tVar.f31724v = i13;
            z15 = true;
        }
        int i14 = tVar.f31723u;
        int i15 = this.f31609g;
        if (i14 != i15) {
            tVar.f31723u = i15;
            z15 = true;
        }
        boolean z16 = tVar.f31722t;
        boolean z17 = this.f31608f;
        if (z16 != z17) {
            tVar.f31722t = z17;
            z15 = true;
        }
        E.b bVar = tVar.f31720r;
        E.b bVar2 = this.f31606d;
        if (!L.f(bVar, bVar2)) {
            tVar.f31720r = bVar2;
            z15 = true;
        }
        int i16 = tVar.f31721s;
        int i17 = this.f31607e;
        if (androidx.compose.ui.text.style.s.a(i16, i17)) {
            z13 = z15;
        } else {
            tVar.f31721s = i17;
        }
        if (z12 || z13) {
            h hVarL2 = tVar.l2();
            String str3 = tVar.f31718p;
            x0 x0Var2 = tVar.f31719q;
            E.b bVar3 = tVar.f31720r;
            int i18 = tVar.f31721s;
            boolean z18 = tVar.f31722t;
            int i19 = tVar.f31723u;
            int i22 = tVar.f31724v;
            hVarL2.f31647a = str3;
            hVarL2.f31648b = x0Var2;
            hVarL2.f31649c = bVar3;
            hVarL2.f31650d = i18;
            hVarL2.f31651e = z18;
            hVarL2.f31652f = i19;
            hVarL2.f31653g = i22;
            hVarL2.b();
        }
        if (tVar.f42893o) {
            if (z12 || (z14 && tVar.f31728z != null)) {
                C22421l.g(tVar).Z();
            }
            if (z12 || z13) {
                C22421l.g(tVar).Y();
                C22440v.a(tVar);
            }
            if (z14) {
                C22440v.a(tVar);
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return L.f(this.f31611i, textStringSimpleElement.f31611i) && L.f(this.f31604b, textStringSimpleElement.f31604b) && L.f(this.f31605c, textStringSimpleElement.f31605c) && L.f(this.f31606d, textStringSimpleElement.f31606d) && androidx.compose.ui.text.style.s.a(this.f31607e, textStringSimpleElement.f31607e) && this.f31608f == textStringSimpleElement.f31608f && this.f31609g == textStringSimpleElement.f31609g && this.f31610h == textStringSimpleElement.f31610h;
    }

    public final int hashCode() {
        int iHashCode = (this.f31606d.hashCode() + H.c(this.f31604b.hashCode() * 31, 31, this.f31605c)) * 31;
        s.a aVar = androidx.compose.ui.text.style.s.f42720b;
        int i12 = (((androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f31607e, iHashCode, 31), 31, this.f31608f) + this.f31609g) * 31) + this.f31610h) * 31;
        InterfaceC22242a0 interfaceC22242a0 = this.f31611i;
        return i12 + (interfaceC22242a0 != null ? interfaceC22242a0.hashCode() : 0);
    }

    public TextStringSimpleElement(String str, x0 x0Var, E.b bVar, int i12, boolean z12, int i13, int i14, InterfaceC22242a0 interfaceC22242a0, C42822w c42822w) {
        this.f31604b = str;
        this.f31605c = x0Var;
        this.f31606d = bVar;
        this.f31607e = i12;
        this.f31608f = z12;
        this.f31609g = i13;
        this.f31610h = i14;
        this.f31611i = interfaceC22242a0;
    }
}
