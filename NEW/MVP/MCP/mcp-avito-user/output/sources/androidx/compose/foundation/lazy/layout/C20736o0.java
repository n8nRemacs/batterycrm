package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.T0;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: LazyLayoutSemantics.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o0;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/T0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20736o0 extends v.d implements T0 {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public kotlin.reflect.o f29468p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public InterfaceC20732m0 f29469q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Orientation f29470r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f29471s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f29472t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.compose.ui.semantics.j f29473u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, Integer> f29474v = new p0(this);

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, Boolean> f29475w;

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.o0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            C20736o0 c20736o0 = C20736o0.this;
            return Float.valueOf(c20736o0.f29469q.e() - c20736o0.f29469q.b());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.o0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(C20736o0.this.f29469q.f());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.o0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(C20736o0.this.f29469q.c());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "index", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.o0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Integer, Boolean> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Integer num) {
            int iIntValue = num.intValue();
            C20736o0 c20736o0 = C20736o0.this;
            F f12 = (F) c20736o0.f29468p.invoke();
            if (iIntValue < 0 || iIntValue >= f12.P()) {
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                sbJ.append(f12.P());
                sbJ.append(')');
                androidx.compose.foundation.internal.e.a(sbJ.toString());
            }
            C43259k.d(c20736o0.Y1(), null, null, new q0(c20736o0, iIntValue, null), 3);
            return Boolean.TRUE;
        }
    }

    public C20736o0(@Y61.k kotlin.reflect.o oVar, @Y61.k InterfaceC20732m0 interfaceC20732m0, @Y61.k Orientation orientation, boolean z12, boolean z13) {
        this.f29468p = oVar;
        this.f29469q = interfaceC20732m0;
        this.f29470r = orientation;
        this.f29471s = z12;
        this.f29472t = z13;
        k2();
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.C.w(f12);
        Y41.l<Object, Integer> lVar = this.f29474v;
        androidx.compose.ui.semantics.y.f41820a.getClass();
        f12.a(androidx.compose.ui.semantics.y.f41817L, lVar);
        if (this.f29470r == Orientation.f27425b) {
            androidx.compose.ui.semantics.j jVar = this.f29473u;
            if (jVar == null) {
                jVar = null;
            }
            androidx.compose.ui.semantics.C.x(f12, jVar);
        } else {
            androidx.compose.ui.semantics.j jVar2 = this.f29473u;
            if (jVar2 == null) {
                jVar2 = null;
            }
            androidx.compose.ui.semantics.C.n(f12, jVar2);
        }
        Y41.l<? super Integer, Boolean> lVar2 = this.f29475w;
        if (lVar2 != null) {
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41766g, new C22553a(null, lVar2));
        }
        androidx.compose.ui.semantics.C.e(f12, new a());
        androidx.compose.ui.semantics.C.k(f12, this.f29469q.d());
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    public final void k2() {
        this.f29473u = new androidx.compose.ui.semantics.j(new b(), new c(), this.f29472t);
        this.f29475w = this.f29471s ? new d() : null;
    }
}
