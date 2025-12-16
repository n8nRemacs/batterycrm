package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.V1;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.foundation.text.modifiers.c;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.text.C22578b;
import androidx.compose.ui.text.O;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ParagraphLayoutCache.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/modifiers/h;", "", "", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;IZIILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public String f31647a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public x0 f31648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public E.b f31649c;

    /* renamed from: d, reason: collision with root package name */
    public int f31650d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31651e;

    /* renamed from: f, reason: collision with root package name */
    public int f31652f;

    /* renamed from: g, reason: collision with root package name */
    public int f31653g;

    /* renamed from: h, reason: collision with root package name */
    public long f31654h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public InterfaceC22393x f31655i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public C22578b f31656j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31657k;

    /* renamed from: l, reason: collision with root package name */
    public long f31658l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public c f31659m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public O f31660n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public LayoutDirection f31661o;

    /* renamed from: p, reason: collision with root package name */
    public long f31662p;

    /* renamed from: q, reason: collision with root package name */
    public int f31663q;

    /* renamed from: r, reason: collision with root package name */
    public int f31664r;

    public h(String str, x0 x0Var, E.b bVar, int i12, boolean z12, int i13, int i14, C42822w c42822w) {
        this.f31647a = str;
        this.f31648b = x0Var;
        this.f31649c = bVar;
        this.f31650d = i12;
        this.f31651e = z12;
        this.f31652f = i13;
        this.f31653g = i14;
        a.f31612b.getClass();
        this.f31654h = a.f31613c;
        long j12 = 0;
        u.a aVar = u.f42871b;
        this.f31658l = (j12 & 4294967295L) | (j12 << 32);
        C22712b.f42842b.getClass();
        this.f31662p = C22712b.a.c(0, 0);
        this.f31663q = -1;
        this.f31664r = -1;
    }

    public static long e(h hVar, long j12, LayoutDirection layoutDirection) {
        x0 x0Var = hVar.f31648b;
        hVar.getClass();
        c.a aVar = c.f31615h;
        c cVar = hVar.f31659m;
        InterfaceC22393x interfaceC22393x = hVar.f31655i;
        E.b bVar = hVar.f31649c;
        aVar.getClass();
        c cVarA = c.a.a(cVar, layoutDirection, x0Var, interfaceC22393x, bVar);
        hVar.f31659m = cVarA;
        return cVarA.a(hVar.f31653g, j12);
    }

    public final int a(int i12, @Y61.k LayoutDirection layoutDirection) {
        int i13 = this.f31663q;
        int i14 = this.f31664r;
        if (i12 == i13 && i13 != -1) {
            return i14;
        }
        long jA2 = C22713c.a(0, i12, 0, Integer.MAX_VALUE);
        int i15 = 1;
        if (this.f31653g > 1) {
            jA2 = e(this, jA2, layoutDirection);
        }
        O oD2 = d(layoutDirection);
        boolean z12 = this.f31651e;
        long jA3 = b.a(oD2.a(), this.f31650d, jA2, z12);
        boolean z13 = this.f31651e;
        int i16 = this.f31650d;
        int i17 = this.f31652f;
        if ((z13 || !b.b(i16)) && i17 >= 1) {
            i15 = i17;
        }
        int iA2 = V1.a(new C22578b((androidx.compose.ui.text.platform.g) oD2, i15, this.f31650d, jA3, null).getHeight());
        int iK2 = C22712b.k(jA2);
        if (iA2 < iK2) {
            iA2 = iK2;
        }
        this.f31663q = i12;
        this.f31664r = iA2;
        return iA2;
    }

    public final void b() {
        this.f31656j = null;
        this.f31660n = null;
        this.f31661o = null;
        this.f31663q = -1;
        this.f31664r = -1;
        C22712b.f42842b.getClass();
        this.f31662p = C22712b.a.c(0, 0);
        long j12 = 0;
        u.a aVar = u.f42871b;
        this.f31658l = (j12 & 4294967295L) | (j12 << 32);
        this.f31657k = false;
    }

    public final void c(@Y61.l InterfaceC22393x interfaceC22393x) {
        long jA2;
        InterfaceC22393x interfaceC22393x2 = this.f31655i;
        a.C1626a c1626a = a.f31612b;
        if (interfaceC22393x != null) {
            jA2 = a.a(interfaceC22393x.getF40389c(), interfaceC22393x.getF40390d());
        } else {
            c1626a.getClass();
            jA2 = a.f31613c;
        }
        if (interfaceC22393x2 == null) {
            this.f31655i = interfaceC22393x;
            this.f31654h = jA2;
        } else if (interfaceC22393x == null || this.f31654h != jA2) {
            this.f31655i = interfaceC22393x;
            this.f31654h = jA2;
            b();
        }
    }

    public final O d(LayoutDirection layoutDirection) {
        O gVar = this.f31660n;
        if (gVar == null || layoutDirection != this.f31661o || gVar.b()) {
            this.f31661o = layoutDirection;
            String str = this.f31647a;
            x0 x0VarB = y0.b(this.f31648b, layoutDirection);
            C42784z0 c42784z0 = C42784z0.f406748b;
            gVar = new androidx.compose.ui.text.platform.g(str, x0VarB, c42784z0, c42784z0, this.f31649c, this.f31655i);
        }
        this.f31660n = gVar;
        return gVar;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f31656j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f31654h));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String str, x0 x0Var, E.b bVar, int i12, boolean z12, int i13, int i14, int i15, C42822w c42822w) {
        int i16;
        if ((i15 & 8) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i12;
        }
        this(str, x0Var, bVar, i16, (i15 & 16) != 0 ? true : z12, (i15 & 32) != 0 ? Integer.MAX_VALUE : i13, (i15 & 64) != 0 ? 1 : i14, null);
    }
}
