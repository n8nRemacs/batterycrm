package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.C42965a;
import u51.InterfaceC48802d;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42997w extends AbstractC42999y implements InterfaceC42995u, InterfaceC48802d {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f410264e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f410265c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f410266d;

    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.w$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static C42997w a(a aVar, J0 j02, boolean z12) {
            boolean zF2;
            aVar.getClass();
            if (j02 instanceof C42997w) {
                return (C42997w) j02;
            }
            C42822w c42822w = null;
            if (!(j02.H0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.r) && !(j02.H0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) && !(j02 instanceof kotlin.reflect.jvm.internal.impl.types.checker.k) && !(j02 instanceof C42980h0)) {
                zF2 = false;
            } else if (j02 instanceof C42980h0) {
                zF2 = G0.f(j02);
            } else {
                InterfaceC42853f interfaceC42853fB = j02.H0().b();
                kotlin.reflect.jvm.internal.impl.descriptors.impl.U u12 = interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.U ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.U) interfaceC42853fB : null;
                if (u12 != null && !u12.f407628m) {
                    zF2 = true;
                } else if (z12 && (j02.H0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0)) {
                    zF2 = G0.f(j02);
                } else {
                    kotlin.reflect.jvm.internal.impl.types.checker.s.f410123a.getClass();
                    C42963c c42963c = C42963c.f410086a;
                    kotlin.reflect.jvm.internal.impl.types.checker.u uVar = kotlin.reflect.jvm.internal.impl.types.checker.u.f410124a;
                    uVar.getClass();
                    TypeCheckerState typeCheckerStateA = C42965a.a(false, uVar, null, null, 24);
                    Y yA2 = K.a(j02);
                    TypeCheckerState.b.C11695b c11695b = TypeCheckerState.b.C11695b.f410062a;
                    c42963c.getClass();
                    zF2 = !C42963c.a(typeCheckerStateA, yA2, c11695b);
                }
            }
            if (!zF2) {
                return null;
            }
            if (j02 instanceof H) {
                H h12 = (H) j02;
                kotlin.jvm.internal.L.f(h12.f410024c.H0(), h12.f410025d.H0());
            }
            return new C42997w(K.a(j02).L0(false), z12, c42822w);
        }

        public a() {
        }
    }

    public /* synthetic */ C42997w(Y y12, boolean z12, C42822w c42822w) {
        this(y12, z12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y, kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC42995u
    @Y61.k
    public final J0 N(@Y61.k O o12) {
        return C42964c0.a(o12.K0(), this.f410266d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return z12 ? this.f410265c.L0(z12) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return new C42997w(this.f410265c.N0(n0Var), this.f410266d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    public final Y Q0() {
        return this.f410265c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    public final AbstractC42999y S0(Y y12) {
        return new C42997w(y12, this.f410266d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC42995u
    public final boolean U() {
        Y y12 = this.f410265c;
        return (y12.H0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.r) || (y12.H0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    public final String toString() {
        return this.f410265c + " & Any";
    }

    public C42997w(Y y12, boolean z12) {
        this.f410265c = y12;
        this.f410266d = z12;
    }
}
