package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.C42975f;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.g;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes8.dex */
public final class q implements p {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f410120c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g f410121d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final OverridingUtil f410122e;

    public q(i iVar, g gVar, int i12, C42822w c42822w) {
        gVar = (i12 & 2) != 0 ? g.a.f410098a : gVar;
        this.f410120c = iVar;
        this.f410121d = gVar;
        this.f410122e = new OverridingUtil(OverridingUtil.f409561f, iVar, g.a.f410098a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.p
    @Y61.k
    public final i a() {
        return this.f410120c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f
    public final boolean b(@Y61.k O o12, @Y61.k O o13) {
        TypeCheckerState typeCheckerStateA = C42965a.a(false, null, this.f410121d, this.f410120c, 6);
        J0 j0K0 = o12.K0();
        J0 j0K02 = o13.K0();
        C42975f.f410201a.getClass();
        return C42975f.e(typeCheckerStateA, j0K0, j0K02);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.p
    @Y61.k
    public final OverridingUtil c() {
        return this.f410122e;
    }

    public final boolean d(@Y61.k O o12, @Y61.k O o13) {
        return C42975f.i(C42975f.f410201a, C42965a.a(true, null, this.f410121d, this.f410120c, 6), o12.K0(), o13.K0());
    }
}
