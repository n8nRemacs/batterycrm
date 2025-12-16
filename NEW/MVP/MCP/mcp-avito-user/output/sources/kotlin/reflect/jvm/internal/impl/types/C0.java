package kotlin.reflect.jvm.internal.impl.types;

import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes8.dex */
public final class C0 {
    @Y61.k
    public static final Y a(@Y61.k O o12) {
        J0 j0K0 = o12.K0();
        Y y12 = j0K0 instanceof Y ? (Y) j0K0 : null;
        if (y12 != null) {
            return y12;
        }
        throw new IllegalStateException(("This is should be simple type: " + o12).toString());
    }

    @X41.j
    @Y61.k
    public static final Y b(@Y61.k Y y12, @Y61.k List<? extends x0> list, @Y61.k n0 n0Var) {
        if (list.isEmpty() && n0Var == y12.G0()) {
            return y12;
        }
        if (list.isEmpty()) {
            return y12.N0(n0Var);
        }
        if (!(y12 instanceof kotlin.reflect.jvm.internal.impl.types.error.f)) {
            return P.e(n0Var, y12.H0(), list, y12.I0(), null);
        }
        kotlin.reflect.jvm.internal.impl.types.error.f fVar = (kotlin.reflect.jvm.internal.impl.types.error.f) y12;
        String[] strArr = fVar.f410190h;
        return new kotlin.reflect.jvm.internal.impl.types.error.f(fVar.f410185c, fVar.f410186d, fVar.f410187e, list, fVar.f410189g, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static O c(O o12, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i12) {
        if ((i12 & 2) != 0) {
            gVar = o12.getAnnotations();
        }
        if ((list.isEmpty() || list == o12.F0()) && gVar == o12.getAnnotations()) {
            return o12;
        }
        n0 n0VarG0 = o12.G0();
        if ((gVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.m) && ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.m) gVar).isEmpty()) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            gVar = g.a.f407524b;
        }
        n0 n0VarA = o0.a(n0VarG0, gVar);
        J0 j0K0 = o12.K0();
        if (j0K0 instanceof H) {
            H h12 = (H) j0K0;
            return P.c(b(h12.f410024c, list, n0VarA), b(h12.f410025d, list, n0VarA));
        }
        if (j0K0 instanceof Y) {
            return b((Y) j0K0, list, n0VarA);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Y d(Y y12, List list, n0 n0Var, int i12) {
        if ((i12 & 1) != 0) {
            list = y12.F0();
        }
        if ((i12 & 2) != 0) {
            n0Var = y12.G0();
        }
        return b(y12, list, n0Var);
    }
}
