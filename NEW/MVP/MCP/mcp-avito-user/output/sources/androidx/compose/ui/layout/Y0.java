package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/Y0;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a1 f40428a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Q f40429b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<LayoutNode, Y0, kotlin.G0> f40430c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<LayoutNode, androidx.compose.runtime.I, kotlin.G0> f40431d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.p<LayoutNode, Y41.p<? super Z0, ? super C22712b, ? extends InterfaceC22367j0>, kotlin.G0> f40432e;

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/I;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/I;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<LayoutNode, androidx.compose.runtime.I, kotlin.G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(LayoutNode layoutNode, androidx.compose.runtime.I i12) {
            Y0.this.a().f40365c = i12;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/w;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;LY41/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<LayoutNode, Y41.p<? super Z0, ? super C22712b, ? extends InterfaceC22367j0>, kotlin.G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(LayoutNode layoutNode, Y41.p<? super Z0, ? super C22712b, ? extends InterfaceC22367j0> pVar) {
            Q qA2 = Y0.this.a();
            layoutNode.b(new T(qA2, pVar, qA2.f40379q));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Y0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/Y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<LayoutNode, Y0, kotlin.G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(LayoutNode layoutNode, Y0 y02) {
            LayoutNode layoutNode2 = layoutNode;
            Q q12 = layoutNode2.f40617K;
            Y0 y03 = Y0.this;
            if (q12 == null) {
                q12 = new Q(layoutNode2, y03.f40428a);
                layoutNode2.f40617K = q12;
            }
            y03.f40429b = q12;
            y03.a().b();
            Q qA2 = y03.a();
            a1 a1Var = qA2.f40366d;
            a1 a1Var2 = y03.f40428a;
            if (a1Var != a1Var2) {
                qA2.f40366d = a1Var2;
                qA2.d(false);
                LayoutNode.o0(qA2.f40364b, false, 7);
            }
            return kotlin.G0.f406611a;
        }
    }

    public Y0(@Y61.k a1 a1Var) {
        this.f40428a = a1Var;
        this.f40430c = new d();
        this.f40431d = new b();
        this.f40432e = new c();
    }

    public final Q a() {
        Q q12 = this.f40429b;
        if (q12 != null) {
            return q12;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public Y0() {
        this(C22386t0.f40519a);
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/Y0$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        default int d() {
            return 0;
        }

        void dispose();

        default void b(@Y61.k Y41.l lVar) {
        }

        default void a(int i12, long j12) {
        }
    }
}
