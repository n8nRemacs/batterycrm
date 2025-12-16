package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppBar.kt */
@InterfaceC21537e7
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/Fl;", "", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* loaded from: classes.dex */
public final class Fl {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f34759a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f34760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f34761c;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/material3/Fl;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/material3/Fl;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, Fl, List<? extends Float>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34762l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends Float> invoke(androidx.compose.runtime.saveable.x xVar, Fl fl2) {
            Fl fl3 = fl2;
            return C42745f0.U(Float.valueOf(((C22040c3) fl3.f34759a).f()), Float.valueOf(fl3.b()), Float.valueOf(((C22040c3) fl3.f34760b).f()));
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/material3/Fl;", "invoke", "(Ljava/util/List;)Landroidx/compose/material3/Fl;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends Float>, Fl> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f34763l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Fl invoke(List<? extends Float> list) {
            List<? extends Float> list2 = list;
            return new Fl(list2.get(0).floatValue(), list2.get(1).floatValue(), list2.get(2).floatValue());
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Fl$c;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
        androidx.compose.runtime.saveable.b.a(b.f34763l, a.f34762l);
    }

    public Fl(float f12, float f13, float f14) {
        this.f34759a = androidx.compose.runtime.Q1.a(f12);
        this.f34760b = androidx.compose.runtime.Q1.a(f14);
        this.f34761c = androidx.compose.runtime.Q1.a(f13);
    }

    public final float a() {
        InterfaceC22192v1 interfaceC22192v1 = this.f34759a;
        if (((C22040c3) interfaceC22192v1).f() == 0.0f) {
            return 0.0f;
        }
        return b() / ((C22040c3) interfaceC22192v1).f();
    }

    public final float b() {
        return ((C22040c3) this.f34761c).f();
    }

    public final void c(float f12) {
        ((C22040c3) this.f34761c).S6(kotlin.ranges.s.f(f12, ((C22040c3) this.f34759a).f(), 0.0f));
    }
}
