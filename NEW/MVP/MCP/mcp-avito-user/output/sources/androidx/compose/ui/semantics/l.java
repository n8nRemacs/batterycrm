package androidx.compose.ui.semantics;

import androidx.collection.R0;
import androidx.collection.i1;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SemanticsConfiguration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/semantics/F;", "", "", "Landroidx/compose/ui/semantics/E;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements F, Iterable<Map.Entry<? extends E<?>, ? extends Object>>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0<E<?>, Object> f41786b = i1.b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Map<E<?>, ? extends Object> f41787c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41788d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41789e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.F
    public final <T> void a(@Y61.k E<T> e12, T t12) {
        boolean z12 = t12 instanceof C22553a;
        R0<E<?>, Object> r02 = this.f41786b;
        if (!z12 || !r02.c(e12)) {
            r02.m(e12, t12);
            return;
        }
        C22553a c22553a = (C22553a) r02.e(e12);
        C22553a c22553a2 = (C22553a) t12;
        String str = c22553a2.f41727a;
        if (str == null) {
            str = c22553a.f41727a;
        }
        InterfaceC43072x interfaceC43072x = c22553a2.f41728b;
        if (interfaceC43072x == null) {
            interfaceC43072x = c22553a.f41728b;
        }
        r02.m(e12, new C22553a(str, interfaceC43072x));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.semantics.l b() {
        /*
            r18 = this;
            r0 = r18
            androidx.compose.ui.semantics.l r1 = new androidx.compose.ui.semantics.l
            r1.<init>()
            boolean r2 = r0.f41788d
            r1.f41788d = r2
            boolean r2 = r0.f41789e
            r1.f41789e = r2
            androidx.collection.R0<androidx.compose.ui.semantics.E<?>, java.lang.Object> r2 = r1.f41786b
            r2.getClass()
            androidx.collection.R0<androidx.compose.ui.semantics.E<?>, java.lang.Object> r3 = r0.f41786b
            java.lang.Object[] r4 = r3.f25722b
            java.lang.Object[] r5 = r3.f25723c
            long[] r3 = r3.f25721a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = 0
            r8 = r7
        L23:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L58
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L3d:
            if (r13 >= r11) goto L56
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L52
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r4[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L52:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L56:
            if (r11 != r12) goto L5d
        L58:
            if (r8 == r6) goto L5d
            int r8 = r8 + 1
            goto L23
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.l.b():androidx.compose.ui.semantics.l");
    }

    public final <T> T d(@Y61.k E<T> e12) {
        T t12 = (T) this.f41786b.e(e12);
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("Key not present: " + e12 + " - consider getOrElse or getOrNull");
    }

    public final <T> T e(@Y61.k E<T> e12, @Y61.k Y41.a<? extends T> aVar) {
        T t12 = (T) this.f41786b.e(e12);
        return t12 == null ? aVar.invoke() : t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f41786b, lVar.f41786b) && this.f41788d == lVar.f41788d && this.f41789e == lVar.f41789e;
    }

    public final void g(@Y61.k l lVar) {
        R0<E<?>, Object> r02 = lVar.f41786b;
        Object[] objArr = r02.f25722b;
        Object[] objArr2 = r02.f25723c;
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
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        E<?> e12 = (E) obj;
                        R0<E<?>, Object> r03 = this.f41786b;
                        Object objInvoke = e12.f41723b.invoke(r03.e(e12), obj2);
                        if (objInvoke != null) {
                            r03.m(e12, objInvoke);
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

    public final int hashCode() {
        return Boolean.hashCode(this.f41789e) + androidx.appcompat.app.r.i(this.f41786b.hashCode() * 31, 31, this.f41788d);
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<Map.Entry<? extends E<?>, ? extends Object>> iterator() {
        Map<E<?>, ? extends Object> mapA = this.f41787c;
        if (mapA == null) {
            mapA = this.f41786b.a();
            this.f41787c = mapA;
        }
        return mapA.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f41788d
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f41789e
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            androidx.collection.R0<androidx.compose.ui.semantics.E<?>, java.lang.Object> r4 = r0.f41786b
            java.lang.Object[] r5 = r4.f25722b
            java.lang.Object[] r6 = r4.f25723c
            long[] r4 = r4.f25721a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            androidx.compose.ui.semantics.E r8 = (androidx.compose.ui.semantics.E) r8
            r1.append(r2)
            java.lang.String r2 = r8.f41722a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = androidx.compose.ui.platform.B1.a(r19)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.l.toString():java.lang.String");
    }
}
