package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: DateInput.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/input/W;", "text", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.layout.V1 f35226a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f35227b;

    /* compiled from: DateInput.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f35228l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f35229m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(2);
            this.f35228l = str;
            this.f35229m = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r28, java.lang.Integer r29) {
            /*
                r27 = this;
                r0 = r27
                r2 = r28
                androidx.compose.runtime.A r2 = (androidx.compose.runtime.A) r2
                r1 = r29
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r1 = r1 & 3
                r3 = 2
                if (r1 != r3) goto L1e
                boolean r1 = r2.c()
                if (r1 != 0) goto L1a
                goto L1e
            L1a:
                r2.f()
                goto L7f
            L1e:
                androidx.compose.ui.v$a r1 = androidx.compose.ui.v.f42878y1
                r3 = -694340528(0xffffffffd69d3450, float:-8.6424E13)
                r2.I(r3)
                java.lang.String r3 = r0.f35228l
                boolean r4 = r2.B(r3)
                java.lang.String r5 = r0.f35229m
                boolean r6 = r2.B(r5)
                r4 = r4 | r6
                java.lang.Object r6 = r2.t()
                if (r4 != 0) goto L42
                androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
                r4.getClass()
                androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
                if (r6 != r4) goto L4a
            L42:
                androidx.compose.material3.N3 r6 = new androidx.compose.material3.N3
                r6.<init>(r3, r5)
                r2.H(r6)
            L4a:
                Y41.l r6 = (Y41.l) r6
                r2.O()
                r3 = 0
                androidx.compose.ui.v r22 = androidx.compose.ui.semantics.r.b(r1, r3, r6)
                r24 = 0
                r25 = 131068(0x1fffc, float:1.83665E-40)
                java.lang.String r1 = r0.f35228l
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r23 = 0
                r26 = r2
                r2 = r22
                r22 = r26
                androidx.compose.material3.C21914uj.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            L7f:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.O3.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f35230l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(2);
            this.f35230l = str;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 3) == 2 && a13.c()) {
                a13.f();
            } else {
                C21914uj.b(this.f35230l, androidx.compose.ui.semantics.r.a(androidx.compose.ui.v.f42878y1, P3.f35282l), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, a13, 0, 0, 131068);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Long f35231l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, kotlin.G0> f35232m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AbstractC21692l2 f35233n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.l f35234o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21648j4 f35235p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Ce f35236q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y3 f35237r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Long l12, Y41.l<? super Long, kotlin.G0> lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2, InterfaceC21648j4 interfaceC21648j4, Ce ce2, Y3 y32, int i12) {
            super(2);
            this.f35231l = l12;
            this.f35232m = lVar;
            this.f35233n = abstractC21692l2;
            this.f35234o = lVar2;
            this.f35235p = interfaceC21648j4;
            this.f35236q = ce2;
            this.f35237r = y32;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            kotlin.ranges.l lVar = this.f35234o;
            InterfaceC21648j4 interfaceC21648j4 = this.f35235p;
            O3.a(this.f35231l, this.f35232m, this.f35233n, lVar, interfaceC21648j4, this.f35236q, this.f35237r, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    static {
        float f12 = 24;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f35226a = androidx.compose.foundation.layout.R1.e(f12, 10, f12, 0.0f, 8);
        f35227b = 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l java.lang.Long r29, @Y61.k Y41.l<? super java.lang.Long, kotlin.G0> r30, @Y61.k androidx.compose.material3.AbstractC21692l2 r31, @Y61.k kotlin.ranges.l r32, @Y61.k androidx.compose.material3.InterfaceC21648j4 r33, @Y61.k androidx.compose.material3.Ce r34, @Y61.k androidx.compose.material3.Y3 r35, @Y61.l androidx.compose.runtime.A r36, int r37) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.O3.a(java.lang.Long, Y41.l, androidx.compose.material3.l2, kotlin.ranges.l, androidx.compose.material3.j4, androidx.compose.material3.Ce, androidx.compose.material3.Y3, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.ui.v r43, @Y61.l java.lang.Long r44, @Y61.k Y41.l r45, @Y61.k androidx.compose.material3.AbstractC21692l2 r46, @Y61.l androidx.compose.runtime.internal.C22096n r47, @Y61.l androidx.compose.runtime.internal.C22096n r48, int r49, @Y61.k androidx.compose.material3.W3 r50, @Y61.k androidx.compose.material3.M3 r51, @Y61.k java.util.Locale r52, @Y61.k androidx.compose.material3.Y3 r53, @Y61.l androidx.compose.runtime.A r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.O3.b(androidx.compose.ui.v, java.lang.Long, Y41.l, androidx.compose.material3.l2, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, int, androidx.compose.material3.W3, androidx.compose.material3.M3, java.util.Locale, androidx.compose.material3.Y3, androidx.compose.runtime.A, int, int):void");
    }
}
