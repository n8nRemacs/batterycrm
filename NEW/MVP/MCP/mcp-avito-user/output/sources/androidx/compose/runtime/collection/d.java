package androidx.compose.runtime.collection;

import Y61.k;
import Y61.l;
import androidx.collection.N0;
import androidx.collection.R0;
import androidx.collection.a1;
import androidx.compose.runtime.Y0;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.ranges.s;

/* compiled from: MultiValueMap.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/collection/d;", "", "K", "V", "map", "Landroidx/collection/R0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0<Object, Object> f38259a;

    private /* synthetic */ d(R0 r02) {
        this.f38259a = r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(R0<Object, Object> r02, @k K k12, @k V v12) {
        int i12 = r02.i(k12);
        boolean z12 = i12 < 0;
        Object obj = z12 ? null : r02.f25723c[i12];
        v0.g(obj);
        if (obj != null) {
            if (obj instanceof N0) {
                N0 n02 = (N0) obj;
                n02.f(v12);
                v12 = n02;
            } else {
                Object[] objArr = a1.f25678a;
                N0 n03 = new N0(2, null);
                n03.f(obj);
                n03.f(v12);
                v12 = n03;
            }
        }
        if (!z12) {
            r02.f25723c[i12] = v12;
            return;
        }
        int i13 = ~i12;
        r02.f25722b[i13] = k12;
        r02.f25723c[i13] = v12;
    }

    public static final /* synthetic */ d b(R0 r02) {
        return new d(r02);
    }

    public static R0 c() {
        return new R0(0, 1, null);
    }

    @l
    public static final Object d(R0 r02, @k Y0 y02) {
        Object objE = r02.e(y02);
        if (objE == null) {
            return null;
        }
        if (!(objE instanceof N0)) {
            r02.k(y02);
            return objE;
        }
        N0 n02 = (N0) objE;
        if (n02.d()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i12 = n02.f25660b - 1;
        E eB2 = n02.b(i12);
        n02.k(i12);
        if (n02.d()) {
            r02.k(y02);
        }
        if (n02.f25660b == 1) {
            r02.m(y02, n02.a());
        }
        return eB2;
    }

    public static final void e(R0 r02, @k Y0 y02, @k Y41.l lVar) {
        Object objE = r02.e(y02);
        if (objE != null) {
            if (!(objE instanceof N0)) {
                if (((Boolean) lVar.invoke(objE)).booleanValue()) {
                    r02.k(y02);
                    return;
                }
                return;
            }
            N0 n02 = (N0) objE;
            int i12 = n02.f25660b;
            Object[] objArr = n02.f25659a;
            int i13 = 0;
            kotlin.ranges.l lVarR = s.r(0, i12);
            int i14 = lVarR.f406905b;
            int i15 = lVarR.f406906c;
            if (i14 <= i15) {
                while (true) {
                    objArr[i14 - i13] = objArr[i14];
                    if (((Boolean) lVar.invoke(objArr[i14])).booleanValue()) {
                        i13++;
                    }
                    if (i14 == i15) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            Arrays.fill(objArr, i12 - i13, i12, (Object) null);
            n02.f25660b -= i13;
            if (n02.d()) {
                r02.k(y02);
            }
            if (n02.f25660b == 0) {
                r02.m(y02, n02.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.collection.N0 f(androidx.collection.R0 r15) {
        /*
            boolean r0 = r15.f()
            if (r0 == 0) goto L9
            androidx.collection.N0 r15 = androidx.collection.a1.f25679b
            return r15
        L9:
            androidx.collection.N0 r0 = new androidx.collection.N0
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.lang.Object[] r2 = r15.f25723c
            long[] r15 = r15.f25721a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L80
            r4 = r1
        L1b:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L7b
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L79
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L75
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r2[r10]
            boolean r11 = r10 instanceof androidx.collection.N0
            if (r11 == 0) goto L72
            androidx.collection.N0 r10 = (androidx.collection.N0) r10
            boolean r11 = r10.d()
            if (r11 == 0) goto L52
            goto L75
        L52:
            int r11 = r0.f25660b
            int r12 = r10.f25660b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.f25659a
            int r13 = r12.length
            if (r13 >= r11) goto L5f
            r0.m(r11, r12)
        L5f:
            java.lang.Object[] r11 = r0.f25659a
            java.lang.Object[] r12 = r10.f25659a
            int r13 = r0.f25660b
            int r14 = r10.f25660b
            kotlin.collections.C42756l.o(r12, r13, r11, r1, r14)
            int r11 = r0.f25660b
            int r10 = r10.f25660b
            int r11 = r11 + r10
            r0.f25660b = r11
            goto L75
        L72:
            r0.f(r10)
        L75:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L79:
            if (r7 != r8) goto L80
        L7b:
            if (r4 == r3) goto L80
            int r4 = r4 + 1
            goto L1b
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.d.f(androidx.collection.R0):androidx.collection.N0");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return L.f(this.f38259a, ((d) obj).f38259a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38259a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f38259a + ')';
    }
}
