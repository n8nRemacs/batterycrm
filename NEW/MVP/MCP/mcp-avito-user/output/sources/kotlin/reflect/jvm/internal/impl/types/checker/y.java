package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.s0;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: TypeCheckingProcedure.java */
/* loaded from: classes8.dex */
public class y {
    @Y61.l
    public static J0 a(@Y61.k Y y12, @Y61.k Y y13) {
        boolean z12 = false;
        if (y12 != null) {
            x xVar = new x();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(new w(y12, null));
            q0 q0VarH0 = y13.H0();
            while (!arrayDeque.isEmpty()) {
                w wVar = (w) arrayDeque.poll();
                O oH2 = wVar.f410126a;
                q0 q0VarH02 = oH2.H0();
                if (xVar.b(q0VarH02, q0VarH0)) {
                    boolean zI02 = oH2.I0();
                    for (w wVar2 = wVar.f410127b; wVar2 != null; wVar2 = wVar2.f410127b) {
                        O o12 = wVar2.f410126a;
                        List<x0> listF0 = o12.F0();
                        if ((listF0 instanceof Collection) && listF0.isEmpty()) {
                            s0.a aVar = s0.f410245b;
                            aVar.getClass();
                            oH2 = E0.e(aVar.a(o12.H0(), o12.F0())).h(oH2, Variance.f410069d);
                        } else {
                            Iterator<T> it = listF0.iterator();
                            while (it.hasNext()) {
                                Variance varianceA = ((x0) it.next()).a();
                                Variance variance = Variance.f410069d;
                                if (varianceA != variance) {
                                    s0.a aVar2 = s0.f410245b;
                                    aVar2.getClass();
                                    oH2 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.a(E0.e(kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.b(aVar2.a(o12.H0(), o12.F0()))).h(oH2, variance)).f410250b;
                                    break;
                                }
                            }
                            s0.a aVar3 = s0.f410245b;
                            aVar3.getClass();
                            oH2 = E0.e(aVar3.a(o12.H0(), o12.F0())).h(oH2, Variance.f410069d);
                        }
                        zI02 = zI02 || o12.I0();
                    }
                    q0 q0VarH03 = oH2.H0();
                    if (xVar.b(q0VarH03, q0VarH0)) {
                        return G0.h(oH2, zI02);
                    }
                    throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + F.a(q0VarH03) + ", \n\nsupertype: " + F.a(q0VarH0) + " \n" + q0VarH03.equals(q0VarH0));
                }
                Iterator<O> it2 = q0VarH02.C().iterator();
                while (it2.hasNext()) {
                    arrayDeque.add(new w(it2.next(), wVar));
                }
            }
            return null;
        }
        Object[] objArr = new Object[3];
        switch (z12) {
            case true:
            case true:
            case true:
            case true:
                objArr[0] = "supertype";
                break;
            case true:
            case true:
            case true:
            default:
                objArr[0] = "subtype";
                break;
            case true:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case true:
            case true:
            case true:
                objArr[0] = "parameter";
                break;
            case true:
            case true:
                objArr[0] = "argument";
                break;
            case true:
            case true:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case true:
                objArr[0] = "type1";
                break;
            case true:
                objArr[0] = "type2";
                break;
            case true:
                objArr[0] = "typeParameter";
                break;
            case true:
                objArr[0] = "typeArgument";
                break;
            case true:
                objArr[0] = "typeParameterVariance";
                break;
            case true:
                objArr[0] = "typeArgumentVariance";
                break;
            case true:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case true:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        switch (z12) {
            case true:
            case true:
                objArr[2] = "getOutType";
                break;
            case true:
            case true:
                break;
            case true:
            case true:
                objArr[2] = "getInType";
                break;
            case true:
            case true:
                objArr[2] = "equalTypes";
                break;
            case true:
            case true:
            case true:
            case true:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case true:
            case true:
                objArr[2] = "isSubtypeOf";
                break;
            case true:
            case true:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case true:
            case true:
            case true:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
