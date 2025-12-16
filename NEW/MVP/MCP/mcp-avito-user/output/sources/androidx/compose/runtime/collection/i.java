package androidx.compose.runtime.collection;

import Y61.k;
import androidx.collection.R0;
import androidx.collection.S0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ScopeMap.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/collection/i;", "", "Key", "Scope", "map", "Landroidx/collection/R0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i<Key, Scope> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0<Object, Object> f38280a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.collection.S0] */
    public static final void a(R0<Object, Object> r02, @k Key key, @k Scope scope) {
        int i12 = r02.i(key);
        boolean z12 = i12 < 0;
        Scope scope2 = z12 ? null : r02.f25723c[i12];
        if (scope2 != null) {
            if (scope2 instanceof S0) {
                ((S0) scope2).e(scope);
            } else if (scope2 != scope) {
                ?? s02 = new S0(0, 1, null);
                s02.e(scope2);
                s02.e(scope);
                scope = s02;
            }
            scope = scope2;
        }
        if (!z12) {
            r02.f25723c[i12] = scope;
            return;
        }
        int i13 = ~i12;
        r02.f25722b[i13] = key;
        r02.f25723c[i13] = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap b(androidx.collection.R0 r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object[] r1 = r15.f25722b
            java.lang.Object[] r2 = r15.f25723c
            long[] r15 = r15.f25721a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5f
            r4 = 0
            r5 = r4
        L12:
            r6 = r15[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5a
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L58
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            boolean r13 = r11 instanceof androidx.collection.S0
            if (r13 == 0) goto L49
            androidx.collection.S0 r11 = (androidx.collection.S0) r11
            java.util.Set r11 = r11.a()
            goto L51
        L49:
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.LinkedHashSet r11 = kotlin.collections.b1.g(r11)
        L51:
            r0.put(r12, r11)
        L54:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L58:
            if (r8 != r9) goto L5f
        L5a:
            if (r5 == r3) goto L5f
            int r5 = r5 + 1
            goto L12
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.i.b(androidx.collection.R0):java.util.HashMap");
    }

    public static final boolean c(R0<Object, Object> r02, @k Key key, @k Scope scope) {
        Object objE = r02.e(key);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof S0)) {
            if (!objE.equals(scope)) {
                return false;
            }
            r02.k(key);
            return true;
        }
        S0 s02 = (S0) objE;
        boolean zN2 = s02.n(scope);
        if (zN2 && s02.c()) {
            r02.k(key);
        }
        return zN2;
    }

    public static final void d(R0<Object, Object> r02, @k Scope scope) {
        boolean zC2;
        long[] jArr = r02.f25721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j12) < 128) {
                        int i15 = (i12 << 3) + i14;
                        Object obj = r02.f25722b[i15];
                        Object obj2 = r02.f25723c[i15];
                        if (obj2 instanceof S0) {
                            S0 s02 = (S0) obj2;
                            s02.n(scope);
                            zC2 = s02.c();
                        } else {
                            zC2 = obj2 == scope;
                        }
                        if (zC2) {
                            r02.l(i15);
                        }
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return L.f(this.f38280a, ((i) obj).f38280a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38280a.hashCode();
    }

    public final String toString() {
        return "ScopeMap(map=" + this.f38280a + ')';
    }
}
