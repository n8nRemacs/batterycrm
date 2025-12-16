package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

@Metadata(d1 = {"kotlin/collections/m", "kotlin/collections/n", "kotlin/collections/w", "kotlin/collections/a0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42756l extends C42735a0 {
    public static void A(long[] jArr, long j12) {
        Arrays.fill(jArr, 0, jArr.length, j12);
    }

    @Y61.k
    public static ArrayList B(@Y61.k Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object C(@Y61.k Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Y61.k
    public static kotlin.ranges.l D(@Y61.k int[] iArr) {
        return new kotlin.ranges.l(0, iArr.length - 1, 1);
    }

    @Y61.l
    public static Integer E(int i12, @Y61.k int[] iArr) {
        if (i12 < 0 || i12 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i12]);
    }

    @Y61.l
    public static Object F(int i12, @Y61.k Object[] objArr) {
        if (i12 < 0 || i12 >= objArr.length) {
            return null;
        }
        return objArr[i12];
    }

    public static int G(int i12, @Y61.k int[] iArr) {
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i12 == iArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    public static int H(Object obj, @Y61.k Object[] objArr) {
        int i12 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i12 < length) {
                if (objArr[i12] == null) {
                    return i12;
                }
                i12++;
            }
        } else {
            int length2 = objArr.length;
            while (i12 < length2) {
                if (obj.equals(objArr[i12])) {
                    return i12;
                }
                i12++;
            }
        }
        return -1;
    }

    public static int I(@Y61.k byte[] bArr, byte b12) {
        int length = bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (b12 == bArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static int J(@Y61.k char[] cArr, char c12) {
        int length = cArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (c12 == cArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static int K(@Y61.k long[] jArr, long j12) {
        int length = jArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (j12 == jArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static int L(@Y61.k short[] sArr, short s5) {
        int length = sArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (s5 == sArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static String N(byte[] bArr, Y41.l lVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i12 = 0;
        for (byte b12 : bArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) "");
            }
            if (lVar != null) {
                sb2.append((CharSequence) lVar.invoke(Byte.valueOf(b12)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b12));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static String O(char[] cArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i12 = 0;
        for (char c12 : cArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) "");
            }
            sb2.append(c12);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static String P(Object[] objArr, String str, String str2, String str3, Y41.l lVar, int i12) {
        if ((i12 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i12 & 2) != 0 ? "" : str2;
        String str6 = (i12 & 4) != 0 ? "" : str3;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        C42735a0.c(objArr, sb2, str4, str5, str6, lVar);
        return sb2.toString();
    }

    public static Object Q(@Y61.k Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Y61.l
    @InterfaceC42733c0
    public static Comparable R(@Y61.k Comparable[] comparableArr) {
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int i12 = 1;
        int length = comparableArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable2 = comparableArr[i12];
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return comparable;
    }

    @Y61.l
    @InterfaceC42733c0
    public static Float S(@Y61.k Float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int i12 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i12].floatValue());
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC42733c0
    @X41.i
    public static int T(@Y61.k int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i12 = iArr[0];
        int i13 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i14 = iArr[i13];
                if (i12 < i14) {
                    i12 = i14;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return i12;
    }

    @Y61.l
    @InterfaceC42733c0
    public static Float U(@Y61.k Float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int i12 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i12].floatValue());
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @Y61.l
    @InterfaceC42733c0
    public static Integer V(@Y61.k int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i12 = iArr[0];
        int i13 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i14 = iArr[i13];
                if (i12 > i14) {
                    i12 = i14;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return Integer.valueOf(i12);
    }

    @Y61.k
    public static byte[] W(@Y61.k byte[] bArr, @Y61.k byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    @Y61.k
    public static Object[] X(@Y61.k Object[] objArr, @Y61.k Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    public static void Y(@Y61.k int[] iArr) {
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = iArr.length - 1;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = iArr[i12];
            iArr[i12] = iArr[length2];
            iArr[length2] = i13;
            length2--;
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public static Object Z(@Y61.k Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Y61.k
    public static Object[] a0(@Y61.k Object[] objArr, @Y61.k kotlin.ranges.l lVar) {
        if (lVar.isEmpty()) {
            C42758m.a(0, objArr.length);
            return Arrays.copyOfRange(objArr, 0, 0);
        }
        int i12 = lVar.f406906c + 1;
        C42758m.a(i12, objArr.length);
        return Arrays.copyOfRange(objArr, lVar.f406905b, i12);
    }

    @Y61.k
    public static Comparable[] b0(@Y61.k Comparable[] comparableArr) {
        if (comparableArr.length != 0) {
            comparableArr = (Comparable[]) Arrays.copyOf(comparableArr, comparableArr.length);
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
        }
        return comparableArr;
    }

    @Y61.k
    public static List c0(@Y61.k Object[] objArr, @Y61.k Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return Arrays.asList(objArr);
    }

    @Y61.k
    public static List d0(@Y61.k char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            return C42784z0.f406748b;
        }
        if (length == 1) {
            return Collections.singletonList(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c12 : cArr) {
            arrayList.add(Character.valueOf(c12));
        }
        return arrayList;
    }

    @Y61.k
    public static Iterable e(@Y61.k Object[] objArr) {
        return objArr.length == 0 ? C42784z0.f406748b : new C42779x(objArr);
    }

    @Y61.k
    public static List e0(@Y61.k int[] iArr) {
        int length = iArr.length;
        return length != 0 ? length != 1 ? h0(iArr) : Collections.singletonList(Integer.valueOf(iArr[0])) : C42784z0.f406748b;
    }

    @Y61.k
    public static InterfaceC43030m f(@Y61.k Object[] objArr) {
        return objArr.length == 0 ? C43033p.h() : new G(objArr);
    }

    @Y61.k
    public static List f0(@Y61.k long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return C42784z0.f406748b;
        }
        if (length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j12 : jArr) {
            arrayList.add(Long.valueOf(j12));
        }
        return arrayList;
    }

    public static boolean g(int i12, @Y61.k int[] iArr) {
        return G(i12, iArr) >= 0;
    }

    @Y61.k
    public static List g0(@Y61.k Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? i0(objArr) : Collections.singletonList(objArr[0]) : C42784z0.f406748b;
    }

    public static boolean h(Object obj, @Y61.k Object[] objArr) {
        return H(obj, objArr) >= 0;
    }

    @Y61.k
    public static ArrayList h0(@Y61.k int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    @kotlin.X
    @InterfaceC42733c0
    @X41.i
    public static boolean i(@Y61.l Object[] objArr, @Y61.l Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                Object obj = objArr[i12];
                Object obj2 = objArr2[i12];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!i((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof kotlin.p0) && (obj2 instanceof kotlin.p0)) {
                            kotlin.p0 p0Var = (kotlin.p0) obj2;
                            byte[] bArr = ((kotlin.p0) obj).f406876b;
                            if (bArr == null) {
                                bArr = null;
                            }
                            byte[] bArr2 = p0Var.f406876b;
                            if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                            }
                        } else if ((obj instanceof kotlin.D0) && (obj2 instanceof kotlin.D0)) {
                            kotlin.D0 d02 = (kotlin.D0) obj2;
                            short[] sArr = ((kotlin.D0) obj).f406604b;
                            if (sArr == null) {
                                sArr = null;
                            }
                            ?? r52 = d02.f406604b;
                            if (!Arrays.equals(sArr, (short[]) (r52 != 0 ? r52 : null))) {
                            }
                        } else if ((obj instanceof kotlin.t0) && (obj2 instanceof kotlin.t0)) {
                            kotlin.t0 t0Var = (kotlin.t0) obj2;
                            int[] iArr = ((kotlin.t0) obj).f410567b;
                            if (iArr == null) {
                                iArr = null;
                            }
                            ?? r53 = t0Var.f410567b;
                            if (!Arrays.equals(iArr, (int[]) (r53 != 0 ? r53 : null))) {
                            }
                        } else if ((obj instanceof kotlin.x0) && (obj2 instanceof kotlin.x0)) {
                            kotlin.x0 x0Var = (kotlin.x0) obj2;
                            long[] jArr = ((kotlin.x0) obj).f410664b;
                            if (jArr == null) {
                                jArr = null;
                            }
                            ?? r54 = x0Var.f410664b;
                            if (!Arrays.equals(jArr, (long[]) (r54 != 0 ? r54 : null))) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Y61.k
    public static ArrayList i0(@Y61.k Object[] objArr) {
        return new ArrayList(new C42752j(false, objArr));
    }

    @InterfaceC42733c0
    @kotlin.X
    @X41.i
    @Y61.k
    public static String j(@Y61.l Object[] objArr) {
        int length = objArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb2 = new StringBuilder((length * 5) + 2);
        C42760n.b(objArr, sb2, new ArrayList());
        return sb2.toString();
    }

    @Y61.k
    public static LinkedHashSet j0(@Y61.k Object[] objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(objArr.length));
        C42735a0.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @InterfaceC42733c0
    @Y61.k
    public static void k(int i12, int i13, int i14, @Y61.k int[] iArr, @Y61.k int[] iArr2) {
        System.arraycopy(iArr, i13, iArr2, i12, i14 - i13);
    }

    @Y61.k
    public static Set k0(@Y61.k int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return B0.f406639b;
        }
        if (length == 1) {
            return Collections.singleton(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(iArr.length));
        for (int i12 : iArr) {
            linkedHashSet.add(Integer.valueOf(i12));
        }
        return linkedHashSet;
    }

    @InterfaceC42733c0
    @Y61.k
    public static void l(@Y61.k byte[] bArr, int i12, @Y61.k byte[] bArr2, int i13, int i14) {
        System.arraycopy(bArr, i13, bArr2, i12, i14 - i13);
    }

    @Y61.k
    public static Set l0(@Y61.k Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return B0.f406639b;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(objArr.length));
        C42735a0.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @InterfaceC42733c0
    @Y61.k
    public static void m(@Y61.k char[] cArr, @Y61.k char[] cArr2, int i12, int i13, int i14) {
        System.arraycopy(cArr, i13, cArr2, i12, i14 - i13);
    }

    @Y61.k
    public static I0 m0(@Y61.k Object[] objArr) {
        return new I0(new Q(objArr));
    }

    @InterfaceC42733c0
    @Y61.k
    public static void n(@Y61.k long[] jArr, @Y61.k long[] jArr2, int i12, int i13, int i14) {
        System.arraycopy(jArr, i13, jArr2, i12, i14 - i13);
    }

    @Y61.k
    public static ArrayList n0(@Y61.k Object[] objArr, @Y61.k Object[] objArr2) {
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i12 = 0; i12 < iMin; i12++) {
            arrayList.add(new kotlin.Q(objArr[i12], objArr2[i12]));
        }
        return arrayList;
    }

    @InterfaceC42733c0
    @Y61.k
    public static void o(@Y61.k Object[] objArr, int i12, @Y61.k Object[] objArr2, int i13, int i14) {
        System.arraycopy(objArr, i13, objArr2, i12, i14 - i13);
    }

    public static void p(int i12, int i13, int i14, int[] iArr, int[] iArr2) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i12, i13);
    }

    public static void q(byte[] bArr, byte[] bArr2, int i12, int i13) {
        System.arraycopy(bArr, i12, bArr2, 0, i13 - i12);
    }

    public static void r(long[] jArr, long[] jArr2, int i12) {
        System.arraycopy(jArr, 0, jArr2, i12, jArr.length);
    }

    public static void s(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        int i15 = (i14 & 2) != 0 ? 0 : 1;
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = objArr.length;
        }
        System.arraycopy(objArr, i12, objArr2, i15, i13 - i12);
    }

    @InterfaceC42733c0
    @kotlin.X
    @X41.i
    @Y61.k
    public static byte[] t(int i12, int i13, @Y61.k byte[] bArr) {
        C42758m.a(i13, bArr.length);
        return Arrays.copyOfRange(bArr, i12, i13);
    }

    @InterfaceC42733c0
    @kotlin.X
    @X41.i
    @Y61.k
    public static char[] u(@Y61.k char[] cArr, int i12, int i13) {
        C42758m.a(i13, cArr.length);
        return Arrays.copyOfRange(cArr, i12, i13);
    }

    @InterfaceC42733c0
    @kotlin.X
    @X41.i
    @Y61.k
    public static float[] v(int i12, @Y61.k float[] fArr) {
        C42758m.a(i12, fArr.length);
        return Arrays.copyOfRange(fArr, 0, i12);
    }

    @InterfaceC42733c0
    @kotlin.X
    @X41.i
    @Y61.k
    public static Object[] w(int i12, int i13, @Y61.k Object[] objArr) {
        C42758m.a(i13, objArr.length);
        return Arrays.copyOfRange(objArr, i12, i13);
    }

    @Y61.k
    public static List x(int i12, @Y61.k Object[] objArr) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " is less than zero.").toString());
        }
        int length = objArr.length - i12;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            return C42784z0.f406748b;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return g0(objArr);
        }
        if (length == 1) {
            return Collections.singletonList(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = length2 - length; i13 < length2; i13++) {
            arrayList.add(objArr[i13]);
        }
        return arrayList;
    }

    public static void y(Object obj, Object[] objArr) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    public static void z(int[] iArr, int i12, int i13, int i14) {
        if ((i14 & 4) != 0) {
            i13 = iArr.length;
        }
        Arrays.fill(iArr, 0, i13, i12);
    }
}
