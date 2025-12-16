package androidx.compose.ui.text;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.C22629x;
import androidx.compose.ui.text.font.D;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextLayoutResult.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Be\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019Be\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/n0;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/s;", "overflow", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/D$b;", "resourceLoader", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/D$b;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/E$b;JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f42506a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x0 f42507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<C22602e.C1684e<U>> f42508c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42511f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f42512g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f42513h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final E.b f42514i;

    /* renamed from: j, reason: collision with root package name */
    public final long f42515j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final D.b f42516k;

    public n0() {
        throw null;
    }

    public n0(C22602e c22602e, x0 x0Var, List<C22602e.C1684e<U>> list, int i12, boolean z12, int i13, androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, D.b bVar, E.b bVar2, long j12) {
        this.f42506a = c22602e;
        this.f42507b = x0Var;
        this.f42508c = list;
        this.f42509d = i12;
        this.f42510e = z12;
        this.f42511f = i13;
        this.f42512g = dVar;
        this.f42513h = layoutDirection;
        this.f42514i = bVar2;
        this.f42515j = j12;
        this.f42516k = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.L.f(this.f42506a, n0Var.f42506a) && kotlin.jvm.internal.L.f(this.f42507b, n0Var.f42507b) && kotlin.jvm.internal.L.f(this.f42508c, n0Var.f42508c) && this.f42509d == n0Var.f42509d && this.f42510e == n0Var.f42510e && androidx.compose.ui.text.style.s.a(this.f42511f, n0Var.f42511f) && kotlin.jvm.internal.L.f(this.f42512g, n0Var.f42512g) && this.f42513h == n0Var.f42513h && kotlin.jvm.internal.L.f(this.f42514i, n0Var.f42514i) && C22712b.d(this.f42515j, n0Var.f42515j);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((androidx.compose.foundation.H.e(androidx.compose.foundation.H.c(this.f42506a.hashCode() * 31, 31, this.f42507b), 31, this.f42508c) + this.f42509d) * 31, 31, this.f42510e);
        s.a aVar = androidx.compose.ui.text.style.s.f42720b;
        int iHashCode = (this.f42514i.hashCode() + ((this.f42513h.hashCode() + ((this.f42512g.hashCode() + androidx.appcompat.app.r.e(this.f42511f, i12, 31)) * 31)) * 31)) * 31;
        C22712b.a aVar2 = C22712b.f42842b;
        return Long.hashCode(this.f42515j) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f42506a) + ", style=" + this.f42507b + ", placeholders=" + this.f42508c + ", maxLines=" + this.f42509d + ", softWrap=" + this.f42510e + ", overflow=" + ((Object) androidx.compose.ui.text.style.s.b(this.f42511f)) + ", density=" + this.f42512g + ", layoutDirection=" + this.f42513h + ", fontFamilyResolver=" + this.f42514i + ", constraints=" + ((Object) C22712b.n(this.f42515j)) + ')';
    }

    @InterfaceC42830m
    public n0(C22602e c22602e, x0 x0Var, List list, int i12, boolean z12, int i13, androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, D.b bVar, long j12, C42822w c42822w) {
        this(c22602e, x0Var, (List<C22602e.C1684e<U>>) list, i12, z12, i13, dVar, layoutDirection, bVar, new androidx.compose.ui.text.font.M(new C22629x(bVar), null, null, null, null, 30, null), j12);
    }

    public n0(C22602e c22602e, x0 x0Var, List list, int i12, boolean z12, int i13, androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, E.b bVar, long j12, C42822w c42822w) {
        this(c22602e, x0Var, (List<C22602e.C1684e<U>>) list, i12, z12, i13, dVar, layoutDirection, (D.b) null, bVar, j12);
    }
}
