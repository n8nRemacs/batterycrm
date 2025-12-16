package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.runtime.C22026a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C43066x;

/* compiled from: methodSignatureMapping.kt */
@s0
/* loaded from: classes8.dex */
final class w implements v<u> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f408559a = new w();

    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.f407160g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.f407161h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.f407162i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.f407163j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.f407164k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.f407165l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.f407166m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.f407167n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Y61.k
    public static u a(@Y61.k String str) {
        JvmPrimitiveType jvmPrimitiveType;
        u cVar;
        char cCharAt = str.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i12];
            if (jvmPrimitiveType.c().charAt(0) == cCharAt) {
                break;
            }
            i12++;
        }
        if (jvmPrimitiveType != null) {
            return new u.d(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new u.d(null);
        }
        if (cCharAt == '[') {
            cVar = new u.a(a(str.substring(1)));
        } else {
            if (cCharAt == 'L') {
                C43066x.A(str, ';');
            }
            cVar = new u.c(androidx.compose.ui.graphics.colorspace.e.h(1, 1, str));
        }
        return cVar;
    }

    @Y61.k
    public static String b(@Y61.k u uVar) {
        String strC;
        if (uVar instanceof u.a) {
            return "[" + b(((u.a) uVar).f408556j);
        }
        if (uVar instanceof u.d) {
            JvmPrimitiveType jvmPrimitiveType = ((u.d) uVar).f408558j;
            return (jvmPrimitiveType == null || (strC = jvmPrimitiveType.c()) == null) ? "V" : strC;
        }
        if (uVar instanceof u.c) {
            return C22026a.c(new StringBuilder("L"), ((u.c) uVar).f408557j, ';');
        }
        throw new NoWhenBranchMatchedException();
    }
}
