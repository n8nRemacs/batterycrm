package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Arrays.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42760n extends C42758m {
    public static final void b(Object[] objArr, StringBuilder sb2, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb2.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb2.append('[');
        int length = objArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 != 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i12];
            if (obj == null) {
                sb2.append("null");
            } else if (obj instanceof Object[]) {
                b((Object[]) obj, sb2, arrayList);
            } else if (obj instanceof byte[]) {
                sb2.append(Arrays.toString((byte[]) obj));
            } else if (obj instanceof short[]) {
                sb2.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof int[]) {
                sb2.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof long[]) {
                sb2.append(Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb2.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb2.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof char[]) {
                sb2.append(Arrays.toString((char[]) obj));
            } else if (obj instanceof boolean[]) {
                sb2.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof kotlin.p0) {
                byte[] bArr = ((kotlin.p0) obj).f406876b;
                sb2.append(bArr != null ? C42745f0.O(kotlin.p0.a(bArr), ", ", "[", "]", null, 56) : "null");
            } else if (obj instanceof kotlin.D0) {
                short[] sArr = ((kotlin.D0) obj).f406604b;
                sb2.append(sArr != null ? C42745f0.O(kotlin.D0.a(sArr), ", ", "[", "]", null, 56) : "null");
            } else if (obj instanceof kotlin.t0) {
                int[] iArr = ((kotlin.t0) obj).f410567b;
                sb2.append(iArr != null ? C42745f0.O(kotlin.t0.a(iArr), ", ", "[", "]", null, 56) : "null");
            } else if (obj instanceof kotlin.x0) {
                long[] jArr = ((kotlin.x0) obj).f410664b;
                sb2.append(jArr != null ? C42745f0.O(kotlin.x0.a(jArr), ", ", "[", "]", null, 56) : "null");
            } else {
                sb2.append(obj.toString());
            }
        }
        sb2.append(']');
        arrayList.remove(arrayList.size() - 1);
    }
}
