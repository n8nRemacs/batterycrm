package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextFieldScroll.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/J2;", "", "<init>", "()V", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J2 {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final c f30369g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f30370h = androidx.compose.runtime.saveable.b.a(b.f30378l, a.f30377l);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f30371a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f30372b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f30373c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public l0.j f30374d;

    /* renamed from: e, reason: collision with root package name */
    public long f30375e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f30376f;

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/text/J2;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/text/J2;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, J2, List<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f30377l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends Object> invoke(androidx.compose.runtime.saveable.x xVar, J2 j22) {
            J2 j23 = j22;
            return C42745f0.U(Float.valueOf(((C22040c3) j23.f30371a).f()), Boolean.valueOf(((Orientation) ((C22082i3) j23.f30376f).getF42167b()) == Orientation.f27425b));
        }
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "restored", "Landroidx/compose/foundation/text/J2;", "invoke", "(Ljava/util/List;)Landroidx/compose/foundation/text/J2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends Object>, J2> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f30378l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final J2 invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            return new J2(((Boolean) list2.get(1)).booleanValue() ? Orientation.f27425b : Orientation.f27426c, ((Float) list2.get(0)).floatValue());
        }
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/J2$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public J2(@Y61.k Orientation orientation, float f12) {
        this.f30371a = androidx.compose.runtime.Q1.a(f12);
        this.f30372b = androidx.compose.runtime.Q1.a(0.0f);
        this.f30373c = androidx.compose.runtime.U2.a(0);
        l0.j.f413388e.getClass();
        this.f30374d = l0.j.f413389f;
        androidx.compose.ui.text.v0.f42734b.getClass();
        this.f30375e = androidx.compose.ui.text.v0.f42735c;
        this.f30376f = C22126m3.f(orientation, C22126m3.o());
    }

    public final void a(@Y61.k Orientation orientation, @Y61.k l0.j jVar, int i12, int i13) {
        float f12 = i13 - i12;
        ((C22040c3) this.f30372b).S6(f12);
        l0.j jVar2 = this.f30374d;
        float f13 = jVar2.f413390a;
        float f14 = jVar.f413390a;
        InterfaceC22192v1 interfaceC22192v1 = this.f30371a;
        float f15 = jVar.f413391b;
        if (f14 != f13 || f15 != jVar2.f413391b) {
            boolean z12 = orientation == Orientation.f27425b;
            if (z12) {
                f14 = f15;
            }
            float f16 = z12 ? jVar.f413393d : jVar.f413392c;
            C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
            float f17 = c22040c3.f();
            float f18 = i12;
            float f19 = f17 + f18;
            ((C22040c3) interfaceC22192v1).S6(c22040c3.f() + ((f16 <= f19 && (f14 >= f17 || f16 - f14 <= f18)) ? (f14 >= f17 || f16 - f14 > f18) ? 0.0f : f14 - f17 : f16 - f19));
            this.f30374d = jVar;
        }
        ((C22040c3) interfaceC22192v1).S6(kotlin.ranges.s.f(((C22040c3) interfaceC22192v1).f(), 0.0f, f12));
        ((C22061e3) this.f30373c).L3(i12);
    }

    public /* synthetic */ J2(Orientation orientation, float f12, int i12, C42822w c42822w) {
        this(orientation, (i12 & 2) != 0 ? 0.0f : f12);
    }

    public J2() {
        this(Orientation.f27425b, 0.0f, 2, null);
    }
}
