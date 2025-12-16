package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;

/* compiled from: TypeSubstitution.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class L extends A0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.g0[] f410028b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x0[] f410029c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f410030d;

    public L() {
        throw null;
    }

    public /* synthetic */ L(kotlin.reflect.jvm.internal.impl.descriptors.g0[] g0VarArr, x0[] x0VarArr, boolean z12, int i12, C42822w c42822w) {
        this(g0VarArr, x0VarArr, (i12 & 4) != 0 ? false : z12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean b() {
        return this.f410030d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    @Y61.l
    public final x0 d(@Y61.k O o12) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var = interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0 ? (kotlin.reflect.jvm.internal.impl.descriptors.g0) interfaceC42853fB : null;
        if (g0Var == null) {
            return null;
        }
        int index = g0Var.getIndex();
        kotlin.reflect.jvm.internal.impl.descriptors.g0[] g0VarArr = this.f410028b;
        if (index >= g0VarArr.length || !kotlin.jvm.internal.L.f(g0VarArr[index].l(), g0Var.l())) {
            return null;
        }
        return this.f410029c[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean e() {
        return this.f410029c.length == 0;
    }

    public L(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0[] g0VarArr, @Y61.k x0[] x0VarArr, boolean z12) {
        this.f410028b = g0VarArr;
        this.f410029c = x0VarArr;
        this.f410030d = z12;
    }
}
