package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import u51.InterfaceC48806h;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42971d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42971d f410128a = new C42971d();

    public static boolean a(InterfaceC42966b interfaceC42966b, u51.i iVar, u51.i iVar2) {
        if (interfaceC42966b.d0(iVar) == interfaceC42966b.d0(iVar2) && interfaceC42966b.g(iVar) == interfaceC42966b.g(iVar2)) {
            if ((interfaceC42966b.l0(iVar) == null) == (interfaceC42966b.l0(iVar2) == null) && interfaceC42966b.e0(interfaceC42966b.w(iVar), interfaceC42966b.w(iVar2))) {
                if (interfaceC42966b.A(iVar, iVar2)) {
                    return true;
                }
                int iD02 = interfaceC42966b.d0(iVar);
                for (int i12 = 0; i12 < iD02; i12++) {
                    u51.l lVarE = interfaceC42966b.E(iVar, i12);
                    u51.l lVarE2 = interfaceC42966b.E(iVar2, i12);
                    if (interfaceC42966b.t(lVarE) != interfaceC42966b.t(lVarE2)) {
                        return false;
                    }
                    if (!interfaceC42966b.t(lVarE) && (interfaceC42966b.S(lVarE) != interfaceC42966b.S(lVarE2) || !b(interfaceC42966b, interfaceC42966b.R(lVarE), interfaceC42966b.R(lVarE2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean b(InterfaceC42966b interfaceC42966b, InterfaceC48806h interfaceC48806h, InterfaceC48806h interfaceC48806h2) {
        if (interfaceC48806h == interfaceC48806h2) {
            return true;
        }
        Y yL2 = interfaceC42966b.L(interfaceC48806h);
        Y yL3 = interfaceC42966b.L(interfaceC48806h2);
        if (yL2 != null && yL3 != null) {
            return a(interfaceC42966b, yL2, yL3);
        }
        H hO2 = interfaceC42966b.o(interfaceC48806h);
        H hO3 = interfaceC42966b.o(interfaceC48806h2);
        if (hO2 == null || hO3 == null) {
            return false;
        }
        return a(interfaceC42966b, interfaceC42966b.c(hO2), interfaceC42966b.c(hO3)) && a(interfaceC42966b, interfaceC42966b.r(hO2), interfaceC42966b.r(hO3));
    }
}
