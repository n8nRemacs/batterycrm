package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.node.InterfaceC22432q0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: Placeable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/K0;", "Landroidx/compose/ui/layout/n0;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class K0 implements InterfaceC22375n0 {

    /* renamed from: b, reason: collision with root package name */
    public int f40345b;

    /* renamed from: c, reason: collision with root package name */
    public int f40346c;

    /* renamed from: d, reason: collision with root package name */
    public long f40347d;

    /* renamed from: e, reason: collision with root package name */
    public long f40348e;

    /* renamed from: f, reason: collision with root package name */
    public long f40349f;

    /* compiled from: Placeable.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @M0
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f40350a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(K0 k02, a aVar) {
            aVar.getClass();
            if (k02 instanceof InterfaceC22432q0) {
                ((InterfaceC22432q0) k02).u(aVar.f40350a);
            }
        }

        public static void g(a aVar, K0 k02, long j12) {
            aVar.getClass();
            a(k02, aVar);
            k02.k0(androidx.compose.ui.unit.q.e(j12, k02.f40349f), 0.0f, null);
        }

        public static void j(a aVar, K0 k02, int i12, int i13) {
            Y41.l<InterfaceC22276o0, kotlin.G0> lVar = L0.f40352a;
            aVar.getClass();
            long j12 = (i12 << 32) | (i13 & 4294967295L);
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            if (aVar.c() == LayoutDirection.f42838b || aVar.d() == 0) {
                a(k02, aVar);
                k02.k0(androidx.compose.ui.unit.q.e(j12, k02.f40349f), 0.0f, lVar);
            } else {
                int iD2 = (aVar.d() - k02.f40345b) - ((int) (j12 >> 32));
                a(k02, aVar);
                k02.k0(androidx.compose.ui.unit.q.e((iD2 << 32) | (((int) (j12 & 4294967295L)) & 4294967295L), k02.f40349f), 0.0f, lVar);
            }
        }

        public static void k(a aVar, K0 k02, long j12) {
            Y41.l<InterfaceC22276o0, kotlin.G0> lVar = L0.f40352a;
            if (aVar.c() == LayoutDirection.f42838b || aVar.d() == 0) {
                a(k02, aVar);
                k02.k0(androidx.compose.ui.unit.q.e(j12, k02.f40349f), 0.0f, lVar);
                return;
            }
            int iD2 = aVar.d() - k02.f40345b;
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            a(k02, aVar);
            k02.k0(androidx.compose.ui.unit.q.e((((int) (j12 & 4294967295L)) & 4294967295L) | ((iD2 - ((int) (j12 >> 32))) << 32), k02.f40349f), 0.0f, lVar);
        }

        public static void l(a aVar, K0 k02, long j12, C22267c c22267c) {
            if (aVar.c() == LayoutDirection.f42838b || aVar.d() == 0) {
                a(k02, aVar);
                k02.m0(androidx.compose.ui.unit.q.e(j12, k02.f40349f), 0.0f, c22267c);
                return;
            }
            int iD2 = aVar.d() - k02.f40345b;
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            a(k02, aVar);
            k02.m0(androidx.compose.ui.unit.q.e((((int) (j12 & 4294967295L)) & 4294967295L) | ((iD2 - ((int) (j12 >> 32))) << 32), k02.f40349f), 0.0f, c22267c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void m(a aVar, K0 k02, int i12, int i13, Y41.l lVar, int i14) {
            if ((i14 & 8) != 0) {
                lVar = L0.f40352a;
            }
            aVar.getClass();
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            a(k02, aVar);
            k02.k0(androidx.compose.ui.unit.q.e((i13 & 4294967295L) | (i12 << 32), k02.f40349f), 0.0f, lVar);
        }

        public static void n(a aVar, K0 k02, long j12) {
            Y41.l<InterfaceC22276o0, kotlin.G0> lVar = L0.f40352a;
            aVar.getClass();
            a(k02, aVar);
            k02.k0(androidx.compose.ui.unit.q.e(j12, k02.f40349f), 0.0f, lVar);
        }

        @Y61.l
        public A b() {
            return null;
        }

        @Y61.k
        public abstract LayoutDirection c();

        public abstract int d();

        public final void e(@Y61.k K0 k02, int i12, int i13, float f12) {
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            a(k02, this);
            k02.k0(androidx.compose.ui.unit.q.e((i13 & 4294967295L) | (i12 << 32), k02.f40349f), f12, null);
        }

        public final void h(@Y61.k K0 k02, int i12, int i13, float f12) {
            long j12 = (i12 << 32) | (i13 & 4294967295L);
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            if (c() == LayoutDirection.f42838b || d() == 0) {
                a(k02, this);
                k02.k0(androidx.compose.ui.unit.q.e(j12, k02.f40349f), f12, null);
            } else {
                int iD2 = (d() - k02.f40345b) - ((int) (j12 >> 32));
                a(k02, this);
                k02.k0(androidx.compose.ui.unit.q.e((iD2 << 32) | (((int) (j12 & 4294967295L)) & 4294967295L), k02.f40349f), f12, null);
            }
        }
    }

    public K0() {
        long j12 = 0;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        this.f40347d = (j12 & 4294967295L) | (j12 << 32);
        this.f40348e = L0.f40353b;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f40349f = 0L;
    }

    public int f0() {
        return (int) (this.f40347d & 4294967295L);
    }

    public int g0() {
        return (int) (this.f40347d >> 32);
    }

    public final void i0() {
        this.f40345b = kotlin.ranges.s.g((int) (this.f40347d >> 32), C22712b.l(this.f40348e), C22712b.j(this.f40348e));
        this.f40346c = kotlin.ranges.s.g((int) (this.f40347d & 4294967295L), C22712b.k(this.f40348e), C22712b.i(this.f40348e));
        int i12 = this.f40345b;
        long j12 = this.f40347d;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        this.f40349f = (((i12 - ((int) (j12 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j12 & 4294967295L))) / 2));
    }

    public abstract void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar);

    public void m0(long j12, float f12, @Y61.k C22267c c22267c) {
        k0(j12, f12, null);
    }

    public final void o0(long j12) {
        if (androidx.compose.ui.unit.u.c(this.f40347d, j12)) {
            return;
        }
        this.f40347d = j12;
        i0();
    }

    public final void q0(long j12) {
        if (C22712b.d(this.f40348e, j12)) {
            return;
        }
        this.f40348e = j12;
        i0();
    }
}
