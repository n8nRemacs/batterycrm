package androidx.compose.foundation.text;

import androidx.compose.runtime.F3;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.LayoutDirection;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextDelegate.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/U1;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "maxLines", "minLines", "", "softWrap", "Landroidx/compose/ui/text/style/s;", "overflow", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;IIZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/E$b;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f30561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.x0 f30562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30564d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30565e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30566f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f30567g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final E.b f30568h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<C22602e.C1684e<androidx.compose.ui.text.U>> f30569i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.text.H f30570j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public LayoutDirection f30571k;

    /* compiled from: TextDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/U1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public U1() {
        throw null;
    }

    public U1(C22602e c22602e, androidx.compose.ui.text.x0 x0Var, int i12, int i13, boolean z12, int i14, androidx.compose.ui.unit.d dVar, E.b bVar, List list, C42822w c42822w) {
        this.f30561a = c22602e;
        this.f30562b = x0Var;
        this.f30563c = i12;
        this.f30564d = i13;
        this.f30565e = z12;
        this.f30566f = i14;
        this.f30567g = dVar;
        this.f30568h = bVar;
        this.f30569i = list;
        if (i12 <= 0) {
            androidx.compose.foundation.internal.e.a("no maxLines");
        }
        if (i13 <= 0) {
            androidx.compose.foundation.internal.e.a("no minLines");
        }
        if (i13 <= i12) {
            return;
        }
        androidx.compose.foundation.internal.e.a("minLines greater than maxLines");
    }

    public final void a(@Y61.k LayoutDirection layoutDirection) {
        androidx.compose.ui.text.H h12 = this.f30570j;
        if (h12 == null || layoutDirection != this.f30571k || h12.b()) {
            this.f30571k = layoutDirection;
            h12 = new androidx.compose.ui.text.H(this.f30561a, androidx.compose.ui.text.y0.b(this.f30562b, layoutDirection), this.f30569i, this.f30567g, this.f30568h);
        }
        this.f30570j = h12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public U1(C22602e c22602e, androidx.compose.ui.text.x0 x0Var, int i12, int i13, boolean z12, int i14, androidx.compose.ui.unit.d dVar, E.b bVar, List list, int i15, C42822w c42822w) {
        int i16;
        int i17 = (i15 & 4) != 0 ? Integer.MAX_VALUE : i12;
        int i18 = (i15 & 8) != 0 ? 1 : i13;
        boolean z13 = (i15 & 16) != 0 ? true : z12;
        if ((i15 & 32) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i14;
        }
        this(c22602e, x0Var, i17, i18, z13, i16, dVar, bVar, (i15 & 256) != 0 ? C42784z0.f406748b : list, null);
    }
}
