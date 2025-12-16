package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridIntervalContent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H;", "Landroidx/compose/foundation/lazy/grid/y0;", "Landroidx/compose/foundation/lazy/layout/o;", "Landroidx/compose/foundation/lazy/grid/G;", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H extends AbstractC20735o<G> implements y0 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<Z, Integer, C20664c> f28995d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f28996a = new H0(this);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.C0<G> f28997b = new androidx.compose.foundation.lazy.layout.C0<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f28998c;

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/Z;", "", "it", "Landroidx/compose/foundation/lazy/grid/c;", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/Z;I)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Z, Integer, C20664c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f28999l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C20664c invoke(Z z12, Integer num) {
            num.intValue();
            return C20664c.a(G0.a(1));
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f28995d = a.f28999l;
    }

    public H(@Y61.k Y41.l<? super y0, kotlin.G0> lVar) {
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.grid.y0
    public final void d(@Y61.l Y41.l lVar, @Y61.k C22096n c22096n) {
        this.f28997b.a(1, new G(null, lVar != null ? new J(lVar) : f28995d, new K(1), new C22096n(-34608120, new L(c22096n), true)));
        if (lVar != null) {
            this.f28998c = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.y0
    public final void f(int i12, @Y61.l Y41.l lVar, @Y61.l Y41.p pVar, @Y61.k Y41.l lVar2, @Y61.k C22096n c22096n) {
        this.f28997b.a(i12, new G(lVar, pVar == null ? f28995d : pVar, lVar2, c22096n));
        if (pVar != null) {
            this.f28998c = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o
    /* renamed from: h, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.C0 getF28997b() {
        return this.f28997b;
    }
}
