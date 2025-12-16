package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;

/* compiled from: ConstantValueFactory.kt */
@s0
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f409588a = new i();

    public final C42939b a(List list, G g12, PrimitiveType primitiveType) {
        List listM0 = C42745f0.M0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            g gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return g12 != null ? new y(arrayList, g12.f407553e.p(primitiveType)) : new C42939b(new h(primitiveType), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v37, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v42, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.i] */
    @Y61.l
    public final g b(@Y61.l Object obj, @Y61.l G g12) {
        ?? SingletonList;
        ?? SingletonList2;
        ?? SingletonList3;
        ?? SingletonList4;
        ?? SingletonList5;
        if (obj instanceof Byte) {
            return new C42941d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch2 = (Character) obj;
            ch2.getClass();
            return new e(ch2);
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C42940c(bool);
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        int i12 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                SingletonList5 = C42784z0.f406748b;
            } else if (length != 1) {
                SingletonList5 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i12 < length2) {
                    SingletonList5.add(Byte.valueOf(bArr[i12]));
                    i12++;
                }
            } else {
                SingletonList5 = Collections.singletonList(Byte.valueOf(bArr[0]));
            }
            return a(SingletonList5, g12, PrimitiveType.f407162i);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                SingletonList4 = C42784z0.f406748b;
            } else if (length3 != 1) {
                SingletonList4 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i12 < length4) {
                    SingletonList4.add(Short.valueOf(sArr[i12]));
                    i12++;
                }
            } else {
                SingletonList4 = Collections.singletonList(Short.valueOf(sArr[0]));
            }
            return a(SingletonList4, g12, PrimitiveType.f407163j);
        }
        if (obj instanceof int[]) {
            return a(C42756l.e0((int[]) obj), g12, PrimitiveType.f407164k);
        }
        if (obj instanceof long[]) {
            return a(C42756l.f0((long[]) obj), g12, PrimitiveType.f407166m);
        }
        if (obj instanceof char[]) {
            return a(C42756l.d0((char[]) obj), g12, PrimitiveType.f407161h);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            if (length5 == 0) {
                SingletonList3 = C42784z0.f406748b;
            } else if (length5 != 1) {
                SingletonList3 = new ArrayList(fArr.length);
                int length6 = fArr.length;
                while (i12 < length6) {
                    SingletonList3.add(Float.valueOf(fArr[i12]));
                    i12++;
                }
            } else {
                SingletonList3 = Collections.singletonList(Float.valueOf(fArr[0]));
            }
            return a(SingletonList3, g12, PrimitiveType.f407165l);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length7 = dArr.length;
            if (length7 == 0) {
                SingletonList2 = C42784z0.f406748b;
            } else if (length7 != 1) {
                SingletonList2 = new ArrayList(dArr.length);
                int length8 = dArr.length;
                while (i12 < length8) {
                    SingletonList2.add(Double.valueOf(dArr[i12]));
                    i12++;
                }
            } else {
                SingletonList2 = Collections.singletonList(Double.valueOf(dArr[0]));
            }
            return a(SingletonList2, g12, PrimitiveType.f407167n);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new u();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length9 = zArr.length;
        if (length9 == 0) {
            SingletonList = C42784z0.f406748b;
        } else if (length9 != 1) {
            SingletonList = new ArrayList(zArr.length);
            int length10 = zArr.length;
            while (i12 < length10) {
                SingletonList.add(Boolean.valueOf(zArr[i12]));
                i12++;
            }
        } else {
            SingletonList = Collections.singletonList(Boolean.valueOf(zArr[0]));
        }
        return a(SingletonList, g12, PrimitiveType.f407160g);
    }
}
