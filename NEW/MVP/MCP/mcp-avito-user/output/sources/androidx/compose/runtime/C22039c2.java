package androidx.compose.runtime;

import androidx.compose.runtime.A;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecomposeScopeImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/c2;", "Landroidx/compose/runtime/H2;", "Landroidx/compose/runtime/b2;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22039c2 implements H2, InterfaceC22034b2 {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f38180h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f38181a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC22071g2 f38182b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C22068g f38183c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super A, ? super Integer, kotlin.G0> f38184d;

    /* renamed from: e, reason: collision with root package name */
    public int f38185e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public androidx.collection.M0<Object> f38186f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.collection.R0<InterfaceC22074h0<?>, Object> f38187g;

    /* compiled from: RecomposeScopeImpl.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/c2$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.c2$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(@Y61.k O2 o22, @Y61.k List list, @Y61.k InterfaceC22071g2 interfaceC22071g2) {
            Object obj;
            List list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                int iC2 = o22.c((C22068g) list.get(i12));
                int iM2 = o22.M(o22.q(iC2), o22.f38069b);
                if (iM2 < o22.f(o22.q(iC2 + 1), o22.f38069b)) {
                    obj = o22.f38070c[o22.g(iM2)];
                } else {
                    A.f37866a.getClass();
                    obj = A.a.f37868b;
                }
                C22039c2 c22039c2 = obj instanceof C22039c2 ? (C22039c2) obj : null;
                if (c22039c2 != null) {
                    c22039c2.f38182b = interfaceC22071g2;
                }
            }
        }

        public a() {
        }
    }

    public C22039c2(@Y61.l M m12) {
        this.f38182b = m12;
    }

    public final boolean a() {
        if (this.f38182b == null) {
            return false;
        }
        C22068g c22068g = this.f38183c;
        return c22068g != null ? c22068g.a() : false;
    }

    @Y61.k
    public final InvalidationResult b(@Y61.l Object obj) {
        InvalidationResult invalidationResultF;
        InterfaceC22071g2 interfaceC22071g2 = this.f38182b;
        return (interfaceC22071g2 == null || (invalidationResultF = interfaceC22071g2.f(this, obj)) == null) ? InvalidationResult.f37981b : invalidationResultF;
    }

    public final void c() {
        InterfaceC22071g2 interfaceC22071g2 = this.f38182b;
        if (interfaceC22071g2 != null) {
            interfaceC22071g2.d();
        }
        this.f38182b = null;
        this.f38186f = null;
        this.f38187g = null;
    }

    public final void d(boolean z12) {
        if (z12) {
            this.f38181a |= 32;
        } else {
            this.f38181a &= -33;
        }
    }

    public final void e() {
        this.f38181a |= 1;
    }

    @Override // androidx.compose.runtime.InterfaceC22034b2
    public final void invalidate() {
        InterfaceC22071g2 interfaceC22071g2 = this.f38182b;
        if (interfaceC22071g2 != null) {
            interfaceC22071g2.f(this, null);
        }
    }
}
