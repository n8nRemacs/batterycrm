package com.yandex.div.evaluable;

import Y61.k;
import Y61.l;
import com.yandex.div.evaluable.internal.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: EvaluableException.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-evaluable"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d {
    @k
    public static final void a(@k b.d.a aVar, @k Object obj, @k Object obj2) {
        EvaluableType evaluableType;
        String strJ;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        String str = e(obj) + ' ' + aVar + ' ' + e(obj2);
        if (obj.getClass().equals(obj2.getClass())) {
            EvaluableType evaluableType4 = EvaluableType.INTEGER;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof com.yandex.div.evaluable.types.b) {
                evaluableType = EvaluableType.DATETIME;
            } else {
                if (!(obj instanceof com.yandex.div.evaluable.types.a)) {
                    throw new EvaluableException(L.j(obj.getClass().getName(), "Unable to find type for "), null, 2, null);
                }
                evaluableType = EvaluableType.COLOR;
            }
            strJ = L.j(" type", evaluableType.f369375b);
        } else {
            StringBuilder sb2 = new StringBuilder("different types: ");
            EvaluableType evaluableType5 = EvaluableType.INTEGER;
            if (obj instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (obj instanceof com.yandex.div.evaluable.types.b) {
                evaluableType2 = EvaluableType.DATETIME;
            } else {
                if (!(obj instanceof com.yandex.div.evaluable.types.a)) {
                    throw new EvaluableException(L.j(obj.getClass().getName(), "Unable to find type for "), null, 2, null);
                }
                evaluableType2 = EvaluableType.COLOR;
            }
            sb2.append(evaluableType2.f369375b);
            sb2.append(" and ");
            if (obj2 instanceof Long) {
                evaluableType3 = EvaluableType.INTEGER;
            } else if (obj2 instanceof Double) {
                evaluableType3 = EvaluableType.NUMBER;
            } else if (obj2 instanceof Boolean) {
                evaluableType3 = EvaluableType.BOOLEAN;
            } else if (obj2 instanceof String) {
                evaluableType3 = EvaluableType.STRING;
            } else if (obj2 instanceof com.yandex.div.evaluable.types.b) {
                evaluableType3 = EvaluableType.DATETIME;
            } else {
                if (!(obj2 instanceof com.yandex.div.evaluable.types.a)) {
                    throw new EvaluableException(L.j(obj2.getClass().getName(), "Unable to find type for "), null, 2, null);
                }
                evaluableType3 = EvaluableType.COLOR;
            }
            sb2.append(evaluableType3.f369375b);
            strJ = sb2.toString();
        }
        b(str, "Operator '" + aVar + "' cannot be applied to " + strJ + '.');
        throw null;
    }

    public static void b(String str, String str2) {
        throw new EvaluableException(androidx.compose.ui.graphics.colorspace.e.n("Failed to evaluate [", str, "]. ", str2), null);
    }

    @k
    public static final void c(@k String str, @k List list, @k String str2, @l IllegalArgumentException illegalArgumentException) {
        throw new EvaluableException(androidx.compose.ui.graphics.colorspace.e.n("Failed to evaluate [", C42745f0.O(list, null, L.j("(", str), ")", b.f369411l, 25), "]. ", str2), illegalArgumentException);
    }

    public static void d(String str, String str2, List list) {
        throw new EvaluableException(androidx.compose.ui.graphics.colorspace.e.n("Failed to evaluate [", C42745f0.O(list, null, L.j("(", str), ")", b.f369411l, 25), "]. ", str2), null);
    }

    @k
    public static final String e(@k Object obj) {
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        return "'" + obj + '\'';
    }

    @k
    public static final String f(@k ArrayList arrayList) {
        return C42745f0.O(arrayList, ", ", null, null, c.f369412l, 30);
    }
}
