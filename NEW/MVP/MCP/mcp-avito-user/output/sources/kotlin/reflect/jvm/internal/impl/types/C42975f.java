package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import u51.InterfaceC48801c;
import u51.InterfaceC48806h;

/* compiled from: AbstractTypeChecker.kt */
@kotlin.jvm.internal.s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42975f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42975f f410201a = new C42975f();

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TypeVariance typeVariance = TypeVariance.f410229c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TypeVariance typeVariance2 = TypeVariance.f410229c;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TypeCheckerState.LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = TypeCheckerState.LowerCapturedTypePolicy.f410059b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TypeCheckerState.LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr2 = TypeCheckerState.LowerCapturedTypePolicy.f410059b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final boolean a(InterfaceC42966b interfaceC42966b, u51.i iVar) {
        if (!interfaceC42966b.y(iVar)) {
            if (iVar instanceof InterfaceC48801c) {
                x0 x0VarS = interfaceC42966b.s(interfaceC42966b.C((InterfaceC48801c) iVar));
                if (interfaceC42966b.t(x0VarS) || !interfaceC42966b.y(interfaceC42966b.i0(interfaceC42966b.R(x0VarS)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean b(InterfaceC42966b interfaceC42966b, TypeCheckerState typeCheckerState, u51.i iVar, u51.i iVar2, boolean z12) {
        Collection<InterfaceC48806h> collectionB = interfaceC42966b.B(iVar);
        if ((collectionB instanceof Collection) && collectionB.isEmpty()) {
            return false;
        }
        for (InterfaceC48806h interfaceC48806h : collectionB) {
            if (kotlin.jvm.internal.L.f(interfaceC42966b.U(interfaceC48806h), interfaceC42966b.w(iVar2)) || (z12 && i(f410201a, typeCheckerState, iVar2, interfaceC48806h))) {
                return true;
            }
        }
        return false;
    }

    public static List c(TypeCheckerState typeCheckerState, u51.i iVar, u51.m mVar) {
        TypeCheckerState.b bVarG;
        InterfaceC42966b interfaceC42966b = typeCheckerState.f410053c;
        interfaceC42966b.getClass();
        if (!interfaceC42966b.d(mVar) && interfaceC42966b.a0(iVar)) {
            return C42784z0.f406748b;
        }
        if (interfaceC42966b.x(mVar)) {
            if (!interfaceC42966b.e0(interfaceC42966b.w(iVar), mVar)) {
                return C42784z0.f406748b;
            }
            CaptureStatus captureStatus = CaptureStatus.f410226b;
            Y yM2 = interfaceC42966b.M(iVar);
            if (yM2 != null) {
                iVar = yM2;
            }
            return Collections.singletonList(iVar);
        }
        kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
        typeCheckerState.c();
        ArrayDeque<u51.i> arrayDeque = typeCheckerState.f410057g;
        kotlin.reflect.jvm.internal.impl.utils.g gVar = typeCheckerState.f410058h;
        arrayDeque.push(iVar);
        while (!arrayDeque.isEmpty()) {
            if (gVar.f410369c > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + C42745f0.O(gVar, null, null, null, null, 63)).toString());
            }
            u51.i iVarPop = arrayDeque.pop();
            if (gVar.add(iVarPop)) {
                CaptureStatus captureStatus2 = CaptureStatus.f410226b;
                Y yM3 = interfaceC42966b.M(iVarPop);
                if (yM3 == null) {
                    yM3 = iVarPop;
                }
                if (interfaceC42966b.e0(interfaceC42966b.w(yM3), mVar)) {
                    fVar.add(yM3);
                    bVarG = TypeCheckerState.b.c.f410063a;
                } else {
                    bVarG = interfaceC42966b.d0(yM3) == 0 ? TypeCheckerState.b.C11695b.f410062a : interfaceC42966b.G(yM3);
                }
                if (kotlin.jvm.internal.L.f(bVarG, TypeCheckerState.b.c.f410063a)) {
                    bVarG = null;
                }
                if (bVarG != null) {
                    Iterator<InterfaceC48806h> it = interfaceC42966b.n0(interfaceC42966b.w(iVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(bVarG.a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.a();
        return fVar;
    }

    public static List d(TypeCheckerState typeCheckerState, u51.i iVar, u51.m mVar) {
        int i12;
        List listC = c(typeCheckerState, iVar, mVar);
        if (listC.size() < 2) {
            return listC;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            InterfaceC42966b interfaceC42966b = typeCheckerState.f410053c;
            u51.k kVarI = interfaceC42966b.I((u51.i) obj);
            int iO2 = interfaceC42966b.O(kVarI);
            while (true) {
                if (i12 >= iO2) {
                    arrayList.add(obj);
                    break;
                }
                i12 = interfaceC42966b.o(interfaceC42966b.R(interfaceC42966b.W(kVarI, i12))) == null ? i12 + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : listC;
    }

    public static boolean e(@Y61.k TypeCheckerState typeCheckerState, @Y61.k InterfaceC48806h interfaceC48806h, @Y61.k InterfaceC48806h interfaceC48806h2) {
        if (interfaceC48806h == interfaceC48806h2) {
            return true;
        }
        C42975f c42975f = f410201a;
        c42975f.getClass();
        InterfaceC42966b interfaceC42966b = typeCheckerState.f410053c;
        if (g(interfaceC42966b, interfaceC48806h) && g(interfaceC42966b, interfaceC48806h2)) {
            kotlin.reflect.jvm.internal.impl.types.checker.i iVar = typeCheckerState.f410055e;
            O oA2 = iVar.a(interfaceC48806h);
            kotlin.reflect.jvm.internal.impl.types.checker.g gVar = typeCheckerState.f410054d;
            J0 j0A = gVar.a(oA2);
            J0 j0A2 = gVar.a(iVar.a(interfaceC48806h2));
            Y yI2 = interfaceC42966b.i(j0A);
            if (!interfaceC42966b.e0(interfaceC42966b.U(j0A), interfaceC42966b.U(j0A2))) {
                return false;
            }
            if (interfaceC42966b.d0(yI2) == 0) {
                return interfaceC42966b.g0(j0A) || interfaceC42966b.g0(j0A2) || interfaceC42966b.g(yI2) == interfaceC42966b.g(interfaceC42966b.i(j0A2));
            }
        }
        return i(c42975f, typeCheckerState, interfaceC48806h, interfaceC48806h2) && i(c42975f, typeCheckerState, interfaceC48806h2, interfaceC48806h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r6.P(r6.U(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u51.n f(kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b r6, u51.InterfaceC48806h r7, u51.i r8) {
        /*
            int r0 = r6.d0(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            u51.l r4 = r6.E(r7, r2)
            boolean r5 = r6.t(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            kotlin.reflect.jvm.internal.impl.types.J0 r3 = r6.R(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            kotlin.reflect.jvm.internal.impl.types.Y r4 = r6.i(r3)
            u51.i r4 = r6.u(r4)
            boolean r4 = r6.p(r4)
            if (r4 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.types.Y r4 = r6.i(r8)
            u51.i r4 = r6.u(r4)
            boolean r4 = r6.p(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            kotlin.reflect.jvm.internal.impl.types.q0 r4 = r6.U(r3)
            kotlin.reflect.jvm.internal.impl.types.q0 r5 = r6.U(r8)
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            u51.n r3 = f(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            kotlin.reflect.jvm.internal.impl.types.q0 r7 = r6.U(r7)
            u51.n r6 = r6.P(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C42975f.f(kotlin.reflect.jvm.internal.impl.types.checker.b, u51.h, u51.i):u51.n");
    }

    public static boolean g(InterfaceC42966b interfaceC42966b, InterfaceC48806h interfaceC48806h) {
        return (!interfaceC42966b.m(interfaceC42966b.U(interfaceC48806h)) || interfaceC42966b.Q(interfaceC48806h) || interfaceC42966b.l(interfaceC48806h) || interfaceC42966b.K(interfaceC48806h) || !kotlin.jvm.internal.L.f(interfaceC42966b.w(interfaceC42966b.i(interfaceC48806h)), interfaceC42966b.w(interfaceC42966b.i0(interfaceC48806h)))) ? false : true;
    }

    public static boolean h(@Y61.k TypeCheckerState typeCheckerState, @Y61.k u51.k kVar, @Y61.k u51.i iVar) {
        boolean zI2;
        InterfaceC42966b interfaceC42966b = typeCheckerState.f410053c;
        q0 q0VarW = interfaceC42966b.w(iVar);
        int iO2 = interfaceC42966b.O(kVar);
        int iD2 = interfaceC42966b.D(q0VarW);
        if (iO2 != iD2 || iO2 != interfaceC42966b.d0(iVar)) {
            return false;
        }
        for (int i12 = 0; i12 < iD2; i12++) {
            u51.l lVarE = interfaceC42966b.E(iVar, i12);
            if (!interfaceC42966b.t(lVarE)) {
                J0 j0R = interfaceC42966b.R(lVarE);
                u51.l lVarW = interfaceC42966b.W(kVar, i12);
                interfaceC42966b.S(lVarW);
                TypeVariance typeVariance = TypeVariance.f410231e;
                J0 j0R2 = interfaceC42966b.R(lVarW);
                TypeVariance typeVarianceC0 = interfaceC42966b.c0(interfaceC42966b.P(q0VarW, i12));
                TypeVariance typeVarianceS = interfaceC42966b.S(lVarE);
                C42975f c42975f = f410201a;
                c42975f.getClass();
                if (typeVarianceC0 == typeVariance) {
                    typeVarianceC0 = typeVarianceS;
                } else if (typeVarianceS != typeVariance && typeVarianceC0 != typeVarianceS) {
                    typeVarianceC0 = null;
                }
                if (typeVarianceC0 == null) {
                    return typeCheckerState.f410051a;
                }
                if (typeVarianceC0 != typeVariance || (!j(interfaceC42966b, j0R2, j0R, q0VarW) && !j(interfaceC42966b, j0R, j0R2, q0VarW))) {
                    int i13 = typeCheckerState.f410056f;
                    if (i13 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + j0R2).toString());
                    }
                    typeCheckerState.f410056f = i13 + 1;
                    int iOrdinal = typeVarianceC0.ordinal();
                    if (iOrdinal == 0) {
                        zI2 = i(c42975f, typeCheckerState, j0R, j0R2);
                    } else if (iOrdinal == 1) {
                        zI2 = i(c42975f, typeCheckerState, j0R2, j0R);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zI2 = e(typeCheckerState, j0R2, j0R);
                    }
                    typeCheckerState.f410056f--;
                    if (!zI2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0320 A[EDGE_INSN: B:368:0x0320->B:205:0x0320 BREAK  A[LOOP:10: B:196:0x0301->B:369:0x0301]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(kotlin.reflect.jvm.internal.impl.types.C42975f r23, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r24, u51.InterfaceC48806h r25, u51.InterfaceC48806h r26) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C42975f.i(kotlin.reflect.jvm.internal.impl.types.f, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, u51.h, u51.h):boolean");
    }

    public static boolean j(InterfaceC42966b interfaceC42966b, InterfaceC48806h interfaceC48806h, InterfaceC48806h interfaceC48806h2, u51.m mVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g0 g0VarX;
        InterfaceC48806h interfaceC48806hL = interfaceC42966b.L(interfaceC48806h);
        if (!(interfaceC48806hL instanceof InterfaceC48801c)) {
            return false;
        }
        InterfaceC48801c interfaceC48801c = (InterfaceC48801c) interfaceC48806hL;
        if (interfaceC42966b.k(interfaceC48801c) || !interfaceC42966b.t(interfaceC42966b.s(interfaceC42966b.C(interfaceC48801c))) || interfaceC42966b.b(interfaceC48801c) != CaptureStatus.f410226b) {
            return false;
        }
        q0 q0VarU = interfaceC42966b.U(interfaceC48806h2);
        u51.t tVar = q0VarU instanceof u51.t ? (u51.t) q0VarU : null;
        return (tVar == null || (g0VarX = interfaceC42966b.X(tVar)) == null || !interfaceC42966b.b0(g0VarX, mVar)) ? false : true;
    }
}
