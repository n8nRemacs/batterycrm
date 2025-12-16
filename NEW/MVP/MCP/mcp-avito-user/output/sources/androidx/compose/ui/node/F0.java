package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ObserverModifierNode.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/F0;", "Landroidx/compose/ui/node/K0;", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F0 implements K0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f40568c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<F0, kotlin.G0> f40569d = a.f40571l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D0 f40570b;

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/F0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/F0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<F0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40571l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(F0 f02) {
            F0 f03 = f02;
            if (f03.n1()) {
                f03.f40570b.K1();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/F0$b;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public F0(@Y61.k D0 d02) {
        this.f40570b = d02;
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return this.f40570b.getF42880b().f42893o;
    }
}
