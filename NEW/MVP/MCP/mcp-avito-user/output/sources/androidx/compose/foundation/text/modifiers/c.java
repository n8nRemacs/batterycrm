package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.Q;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MinLinesConstrainer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/c;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f31615h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public static c f31616i;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f31617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x0 f31618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f31619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E.b f31620d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x0 f31621e;

    /* renamed from: f, reason: collision with root package name */
    public float f31622f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f31623g = Float.NaN;

    /* compiled from: MinLinesConstrainer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/modifiers/c$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/c;", "last", "Landroidx/compose/foundation/text/modifiers/c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static c a(@Y61.l c cVar, @Y61.k LayoutDirection layoutDirection, @Y61.k x0 x0Var, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k E.b bVar) {
            if (cVar != null && layoutDirection == cVar.f31617a && y0.b(x0Var, layoutDirection).equals(cVar.f31618b) && dVar.getF40389c() == cVar.f31619c.getF40389c() && bVar == cVar.f31620d) {
                return cVar;
            }
            c cVar2 = c.f31616i;
            if (cVar2 != null && layoutDirection == cVar2.f31617a && y0.b(x0Var, layoutDirection).equals(cVar2.f31618b) && dVar.getF40389c() == cVar2.f31619c.getF40389c() && bVar == cVar2.f31620d) {
                return cVar2;
            }
            c cVar3 = new c(layoutDirection, y0.b(x0Var, layoutDirection), androidx.compose.ui.unit.f.a(dVar.getF40389c(), dVar.getF40390d()), bVar);
            c.f31616i = cVar3;
            return cVar3;
        }

        public a() {
        }
    }

    public c(@Y61.k LayoutDirection layoutDirection, @Y61.k x0 x0Var, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k E.b bVar) {
        this.f31617a = layoutDirection;
        this.f31618b = x0Var;
        this.f31619c = dVar;
        this.f31620d = bVar;
        this.f31621e = y0.b(x0Var, layoutDirection);
    }

    public final long a(int i12, long j12) {
        int iK2;
        float f12 = this.f31623g;
        float height = this.f31622f;
        if (Float.isNaN(f12) || Float.isNaN(height)) {
            String str = d.f31624a;
            long jB2 = C22713c.b(0, 0, 15);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            int i13 = androidx.compose.ui.text.style.s.f42721c;
            androidx.compose.ui.unit.d dVar = this.f31619c;
            float height2 = Q.a(str, this.f31621e, jB2, dVar, this.f31620d, null, 1, i13, 96).getHeight();
            height = Q.a(d.f31625b, this.f31621e, C22713c.b(0, 0, 15), dVar, this.f31620d, null, 2, i13, 96).getHeight() - height2;
            this.f31623g = height2;
            this.f31622f = height;
            f12 = height2;
        }
        if (i12 != 1) {
            int iRound = Math.round((height * (i12 - 1)) + f12);
            iK2 = iRound >= 0 ? iRound : 0;
            int i14 = C22712b.i(j12);
            if (iK2 > i14) {
                iK2 = i14;
            }
        } else {
            iK2 = C22712b.k(j12);
        }
        return C22713c.a(C22712b.l(j12), C22712b.j(j12), iK2, C22712b.i(j12));
    }
}
