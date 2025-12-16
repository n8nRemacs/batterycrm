package androidx.compose.foundation.pager;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/b;", "Landroidx/compose/foundation/pager/m0;", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20808b extends m0 {

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final c f29888K = new c(null);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f29889L = androidx.compose.runtime.saveable.b.a(C1597b.f29892l, a.f29891l);

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Y41.a<Integer>> f29890J;

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/pager/b;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/pager/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.pager.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, C20808b, List<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f29891l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends Object> invoke(androidx.compose.runtime.saveable.x xVar, C20808b c20808b) {
            C20808b c20808b2 = c20808b;
            return C42745f0.U(Integer.valueOf(c20808b2.j()), Float.valueOf(kotlin.ranges.s.f(c20808b2.k(), -0.5f, 0.5f)), Integer.valueOf(c20808b2.m()));
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/pager/b;", "invoke", "(Ljava/util/List;)Landroidx/compose/foundation/pager/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.pager.b$b, reason: collision with other inner class name */
    public static final class C1597b extends kotlin.jvm.internal.N implements Y41.l<List, C20808b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1597b f29892l = new C1597b();

        public C1597b() {
            super(1);
        }

        @Override // Y41.l
        public final C20808b invoke(List list) {
            List list2 = list;
            return new C20808b(((Integer) list2.get(0)).intValue(), ((Float) list2.get(1)).floatValue(), new C20809c(list2));
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/pager/b$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.b$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public C20808b(int i12, float f12, @Y61.k Y41.a<Integer> aVar) {
        super(i12, f12, null);
        this.f29890J = C22126m3.g(aVar);
    }

    @Override // androidx.compose.foundation.pager.m0
    public final int m() {
        return ((Number) ((Y41.a) ((C22082i3) this.f29890J).getF42167b()).invoke()).intValue();
    }
}
