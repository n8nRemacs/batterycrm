package androidx.compose.foundation.lazy.layout;

import androidx.collection.Y0;
import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.Metadata;

/* compiled from: LazyLayoutKeyIndexMap.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/D0;", "Landroidx/compose/foundation/lazy/layout/I;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D0 implements I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.M0 f29265a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object[] f29266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29267c;

    /* compiled from: LazyLayoutKeyIndexMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/f$a;", "Landroidx/compose/foundation/lazy/layout/o$a;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/layout/f$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC20717f.a<? extends AbstractC20735o.a>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f29268l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f29269m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.M0<Object> f29270n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ D0 f29271o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, androidx.collection.M0<Object> m02, D0 d02) {
            super(1);
            this.f29268l = i12;
            this.f29269m = i13;
            this.f29270n = m02;
            this.f29271o = d02;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[LOOP:0: B:4:0x001f->B:10:0x0043, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[EDGE_INSN: B:13:0x0046->B:11:0x0046 BREAK  A[LOOP:0: B:4:0x001f->B:10:0x0043], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.lazy.layout.InterfaceC20717f.a<? extends androidx.compose.foundation.lazy.layout.AbstractC20735o.a> r7) {
            /*
                r6 = this;
                androidx.compose.foundation.lazy.layout.f$a r7 = (androidx.compose.foundation.lazy.layout.InterfaceC20717f.a) r7
                T r0 = r7.f29413c
                androidx.compose.foundation.lazy.layout.o$a r0 = (androidx.compose.foundation.lazy.layout.AbstractC20735o.a) r0
                Y41.l r0 = r0.getKey()
                int r1 = r6.f29268l
                int r2 = r7.f29411a
                int r1 = java.lang.Math.max(r1, r2)
                int r7 = r7.f29412b
                int r7 = r7 + r2
                int r7 = r7 + (-1)
                int r3 = r6.f29269m
                int r7 = java.lang.Math.min(r3, r7)
                if (r1 > r7) goto L46
            L1f:
                if (r0 == 0) goto L2d
                int r3 = r1 - r2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L32
            L2d:
                androidx.compose.foundation.lazy.layout.DefaultLazyKey r3 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
                r3.<init>(r1)
            L32:
                androidx.collection.M0<java.lang.Object> r4 = r6.f29270n
                r4.h(r1, r3)
                androidx.compose.foundation.lazy.layout.D0 r4 = r6.f29271o
                java.lang.Object[] r5 = r4.f29266b
                int r4 = r4.f29267c
                int r4 = r1 - r4
                r5[r4] = r3
                if (r1 == r7) goto L46
                int r1 = r1 + 1
                goto L1f
            L46:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.D0.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public D0(@Y61.k kotlin.ranges.l lVar, @Y61.k AbstractC20735o<?> abstractC20735o) {
        C0 f29574a = abstractC20735o.getF28997b();
        int i12 = lVar.f406905b;
        if (i12 < 0) {
            androidx.compose.foundation.internal.e.c("negative nearestRange.first");
        }
        int iMin = Math.min(lVar.f406906c, f29574a.f29258b - 1);
        if (iMin < i12) {
            this.f29265a = Y0.f25657a;
            this.f29266b = new Object[0];
            this.f29267c = 0;
            return;
        }
        int i13 = (iMin - i12) + 1;
        this.f29266b = new Object[i13];
        this.f29267c = i12;
        androidx.collection.M0 m02 = new androidx.collection.M0(i13);
        a aVar = new a(i12, iMin, m02, this);
        if (i12 < 0 || i12 >= f29574a.f29258b) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index ", ", size ");
            sbJ.append(f29574a.f29258b);
            androidx.compose.foundation.internal.e.e(sbJ.toString());
        }
        if (iMin < 0 || iMin >= f29574a.f29258b) {
            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(iMin, "Index ", ", size ");
            sbJ2.append(f29574a.f29258b);
            androidx.compose.foundation.internal.e.e(sbJ2.toString());
        }
        if (iMin < i12) {
            androidx.compose.foundation.internal.e.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i12 + ')');
        }
        androidx.compose.runtime.collection.e<InterfaceC20717f.a<T>> eVar = f29574a.f29257a;
        int iA2 = C20719g.a(i12, eVar);
        int i14 = ((InterfaceC20717f.a) eVar.f38260b[iA2]).f29411a;
        while (i14 <= iMin) {
            InterfaceC20717f.a<? extends AbstractC20735o.a> aVar2 = (InterfaceC20717f.a) eVar.f38260b[iA2];
            aVar.invoke(aVar2);
            i14 += aVar2.f29412b;
            iA2++;
        }
        this.f29265a = m02;
    }

    @Y61.l
    public final Object a(int i12) {
        int i13 = i12 - this.f29267c;
        if (i13 >= 0) {
            Object[] objArr = this.f29266b;
            if (i13 <= objArr.length - 1) {
                return objArr[i13];
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.I
    public final int b(@Y61.k Object obj) {
        androidx.collection.M0 m02 = this.f29265a;
        int iA2 = m02.a(obj);
        if (iA2 >= 0) {
            return m02.f25649c[iA2];
        }
        return -1;
    }
}
