package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VectorPainter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/W;", "Landroidx/compose/ui/graphics/painter/e;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W extends androidx.compose.ui.graphics.painter.e {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f39812g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f39813h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C22303n f39814i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f39815j;

    /* renamed from: k, reason: collision with root package name */
    public float f39816k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.U f39817l;

    /* renamed from: m, reason: collision with root package name */
    public int f39818m;

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            W w12 = W.this;
            int i12 = w12.f39818m;
            InterfaceC22196w1 interfaceC22196w1 = w12.f39815j;
            if (i12 == ((C22061e3) interfaceC22196w1).e()) {
                ((C22061e3) interfaceC22196w1).L3(((C22061e3) interfaceC22196w1).e() + 1);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        this.f39816k = f12;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@Y61.l androidx.compose.ui.graphics.U u12) {
        this.f39817l = u12;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h */
    public final long getF39738j() {
        return ((l0.n) ((C22082i3) this.f39812g).getF42167b()).f413404a;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.U u12 = this.f39817l;
        C22303n c22303n = this.f39814i;
        if (u12 == null) {
            u12 = (androidx.compose.ui.graphics.U) ((C22082i3) c22303n.f40004g).getF42167b();
        }
        if (((Boolean) ((C22082i3) this.f39813h).getF42167b()).booleanValue() && gVar.getLayoutDirection() == LayoutDirection.f42839c) {
            long jV1 = gVar.v1();
            a.b f39478c = gVar.getF39478c();
            long jE2 = f39478c.e();
            f39478c.a().k();
            try {
                f39478c.f39485a.e(-1.0f, 1.0f, jV1);
                c22303n.e(gVar, this.f39816k, u12);
            } finally {
                androidx.compose.foundation.H.C(f39478c, jE2);
            }
        } else {
            c22303n.e(gVar, this.f39816k, u12);
        }
        this.f39818m = ((C22061e3) this.f39815j).e();
    }

    public W(@Y61.k C22292c c22292c) {
        l0.n.f413402b.getClass();
        this.f39812g = C22126m3.g(l0.n.a(0L));
        this.f39813h = C22126m3.g(Boolean.FALSE);
        C22303n c22303n = new C22303n(c22292c);
        c22303n.f40003f = new a();
        this.f39814i = c22303n;
        this.f39815j = U2.a(0);
        this.f39816k = 1.0f;
        this.f39818m = -1;
    }

    public /* synthetic */ W(C22292c c22292c, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new C22292c() : c22292c);
    }
}
