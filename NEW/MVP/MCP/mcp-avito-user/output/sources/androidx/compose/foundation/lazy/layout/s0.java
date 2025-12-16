package androidx.compose.foundation.lazy.layout;

import androidx.collection.S0;
import androidx.collection.k1;
import androidx.compose.runtime.saveable.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazySaveableStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s0;", "Landroidx/compose/runtime/saveable/r;", "Landroidx/compose/runtime/saveable/l;", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class s0 implements androidx.compose.runtime.saveable.r, androidx.compose.runtime.saveable.l {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f29536d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.saveable.r f29537a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.saveable.l f29538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final S0<Object> f29539c = k1.a();

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.saveable.r f29540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.saveable.r rVar) {
            super(1);
            this.f29540l = rVar;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            androidx.compose.runtime.saveable.r rVar = this.f29540l;
            return Boolean.valueOf(rVar != null ? rVar.a(obj) : true);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s0$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public s0(@Y61.l androidx.compose.runtime.saveable.r rVar, @Y61.l Map<String, ? extends List<? extends Object>> map, @Y61.k androidx.compose.runtime.saveable.l lVar) {
        this.f29537a = androidx.compose.runtime.saveable.t.a(map, new a(rVar));
        this.f29538b = lVar;
    }

    @Override // androidx.compose.runtime.saveable.r
    public final boolean a(@Y61.k Object obj) {
        return this.f29537a.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @Override // androidx.compose.runtime.saveable.l
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k java.lang.Object r2, @Y61.k androidx.compose.runtime.internal.C22096n r3, @Y61.l androidx.compose.runtime.A r4, int r5) {
        /*
            r1 = this;
            r0 = -697180401(0xffffffffd671df0f, float:-6.6485083E13)
            r4.C(r0)
            r5 = r5 & 126(0x7e, float:1.77E-43)
            androidx.compose.runtime.saveable.l r0 = r1.f29538b
            r0.b(r2, r3, r4, r5)
            boolean r3 = r4.u(r1)
            boolean r5 = r4.u(r2)
            r3 = r3 | r5
            java.lang.Object r5 = r4.t()
            if (r3 != 0) goto L25
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L2d
        L25:
            androidx.compose.foundation.lazy.layout.w0 r5 = new androidx.compose.foundation.lazy.layout.w0
            r5.<init>(r1, r2)
            r4.H(r5)
        L2d:
            Y41.l r5 = (Y41.l) r5
            androidx.compose.runtime.C22187u0.a(r2, r5, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.s0.b(java.lang.Object, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // androidx.compose.runtime.saveable.r
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> c() {
        /*
            r14 = this;
            androidx.collection.S0<java.lang.Object> r0 = r14.f29539c
            java.lang.Object[] r1 = r0.f25730b
            long[] r0 = r0.f25729a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.runtime.saveable.l r11 = r14.f29538b
            r11.e(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            androidx.compose.runtime.saveable.r r0 = r14.f29537a
            java.util.Map r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.s0.c():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.k
    public final r.a d(@Y61.k String str, @Y61.k Y41.a<? extends Object> aVar) {
        return this.f29537a.d(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.l
    public final void e(@Y61.k Object obj) {
        this.f29538b.e(obj);
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.l
    public final Object f(@Y61.k String str) {
        return this.f29537a.f(str);
    }
}
