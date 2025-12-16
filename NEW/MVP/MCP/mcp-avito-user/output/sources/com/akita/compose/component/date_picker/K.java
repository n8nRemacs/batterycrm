package com.akita.compose.component.date_picker;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import com.akita.compose.component.date_picker.data.DayRangeType;
import com.avito.android.remote.model.category_parameters.SelectionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: StateData.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/date_picker/K;", "", "a", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f61169p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<kotlin.ranges.o> f61170a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61171b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61172c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DatePickerSelectionType f61173d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Long f61174e;

    /* renamed from: f, reason: collision with root package name */
    public final int f61175f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61176g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.date_picker.utils.a f61177h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f61178i;

    /* renamed from: j, reason: collision with root package name */
    public final long f61179j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final P2.b f61180k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final P2.b f61181l;

    /* renamed from: m, reason: collision with root package name */
    public final long f61182m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f61183n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f61184o;

    /* compiled from: StateData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/date_picker/K$a;", "", "<init>", "()V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StateData.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", SelectionType.TYPE_DAY, "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Long, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, Boolean> f61185l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ K f61186m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Long, Boolean> lVar, K k12) {
            super(1);
            this.f61185l = lVar;
            this.f61186m = k12;
        }

        @Override // Y41.l
        public final Boolean invoke(Long l12) {
            boolean z12;
            long jLongValue = l12.longValue();
            if (!this.f61185l.invoke(Long.valueOf(jLongValue)).booleanValue()) {
                z12 = false;
                break;
            }
            List<kotlin.ranges.o> listC = this.f61186m.c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                for (kotlin.ranges.o oVar : listC) {
                    long j12 = oVar.f406915b;
                    if (jLongValue <= oVar.f406916c && j12 <= jLongValue) {
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = true;
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: StateData.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Long, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Long l12) {
            return Boolean.valueOf(K.this.e(l12.longValue()));
        }
    }

    public K() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Type inference failed for: r3v10, types: [P2.b] */
    /* JADX WARN: Type inference failed for: r3v11, types: [P2.b] */
    /* JADX WARN: Type inference failed for: r3v15, types: [P2.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K(boolean r3, java.lang.Long r4, java.util.List r5, boolean r6, boolean r7, com.akita.compose.component.date_picker.data.DatePickerSelectionType r8, java.lang.Long r9, int r10, boolean r11, com.akita.compose.component.date_picker.utils.a r12, int r13, kotlin.jvm.internal.C42822w r14) {
        /*
            r2 = this;
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L9
            com.akita.compose.component.date_picker.utils.b r12 = new com.akita.compose.component.date_picker.utils.b
            r12.<init>()
        L9:
            r2.<init>()
            r2.f61170a = r5
            r2.f61171b = r6
            r2.f61172c = r7
            r2.f61173d = r8
            r2.f61174e = r9
            r2.f61175f = r10
            r2.f61176g = r11
            r2.f61177h = r12
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            androidx.compose.runtime.y1 r3 = androidx.compose.runtime.C22126m3.g(r3)
            r2.f61178i = r3
            if (r9 == 0) goto L2d
            long r6 = r9.longValue()
            goto L33
        L2d:
            P2.a r3 = r12.f()
            long r6 = r3.f12786e
        L33:
            r2.f61179j = r6
            P2.b r3 = r12.k(r6)
            r2.f61180k = r3
            r6 = 1
            int r10 = r10 - r6
            P2.b r3 = r12.m(r3, r10)
            r2.f61181l = r3
            P2.b r3 = r12.m(r3, r6)
            r6 = 1
            long r8 = r3.f12791f
            long r8 = r8 - r6
            r2.f61182m = r8
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r5.next()
            kotlin.ranges.o r6 = (kotlin.ranges.o) r6
            boolean r8 = com.akita.compose.component.date_picker.utils.i.a(r6)
            long r9 = r2.f61182m
            long r11 = r2.f61179j
            long r13 = r6.f406915b
            if (r8 == 0) goto L7b
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 > 0) goto L94
            int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r8 > 0) goto L94
            goto L85
        L7b:
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            long r0 = r6.f406916c
            if (r7 < 0) goto L87
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 > 0) goto L87
        L85:
            r7 = r6
            goto L94
        L87:
            kotlin.ranges.o r7 = new kotlin.ranges.o
            long r11 = kotlin.ranges.s.b(r13, r11)
            long r8 = kotlin.ranges.s.d(r0, r9)
            r7.<init>(r11, r8)
        L94:
            if (r7 == 0) goto L59
            r3.add(r7)
            goto L59
        L9a:
            androidx.compose.runtime.y1 r3 = androidx.compose.runtime.C22126m3.g(r3)
            r2.f61183n = r3
            if (r4 == 0) goto Lc0
            long r3 = r4.longValue()
            com.akita.compose.component.date_picker.utils.a r5 = r2.f61177h
            P2.b r3 = r5.k(r3)
            P2.b r4 = r2.f61181l
            int r4 = r3.compareTo(r4)
            if (r4 > 0) goto Lbd
            P2.b r4 = r2.f61180k
            int r4 = r3.compareTo(r4)
            if (r4 < 0) goto Lbd
            r7 = r3
        Lbd:
            if (r7 == 0) goto Lc0
            goto Ldf
        Lc0:
            com.akita.compose.component.date_picker.utils.a r3 = r2.f61177h
            P2.a r4 = r3.f()
            P2.b r3 = r3.c(r4)
            P2.b r4 = r2.f61181l
            int r4 = r3.compareTo(r4)
            if (r4 > 0) goto Ldc
            P2.b r4 = r2.f61180k
            int r4 = r3.compareTo(r4)
            if (r4 < 0) goto Ldc
        Lda:
            r7 = r3
            goto Ldf
        Ldc:
            P2.b r3 = r2.f61180k
            goto Lda
        Ldf:
            androidx.compose.runtime.y1 r3 = androidx.compose.runtime.C22126m3.g(r7)
            r2.f61184o = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.date_picker.K.<init>(boolean, java.lang.Long, java.util.List, boolean, boolean, com.akita.compose.component.date_picker.data.DatePickerSelectionType, java.lang.Long, int, boolean, com.akita.compose.component.date_picker.utils.a, int, kotlin.jvm.internal.w):void");
    }

    @Y61.k
    public final DayRangeType a(long j12, @Y61.k Y41.l<? super Long, Boolean> lVar) {
        return b(j12, new b(lVar, this));
    }

    public final DayRangeType b(long j12, Y41.l<? super Long, Boolean> lVar) {
        com.akita.compose.component.date_picker.utils.a aVar = this.f61177h;
        P2.a aVarJ = aVar.j(j12);
        P2.a aVarN = aVar.n(aVarJ);
        P2.a aVarH = aVar.h(aVarJ);
        boolean zG2 = aVar.g(j12);
        boolean zB2 = aVar.b(j12);
        boolean zA2 = aVar.a(j12);
        boolean zO2 = aVar.o(j12);
        boolean z12 = true;
        boolean z13 = !lVar.invoke(Long.valueOf(aVarN.f12786e)).booleanValue() || zG2 || zA2;
        if (lVar.invoke(Long.valueOf(aVarH.f12786e)).booleanValue() && !zB2 && !zO2) {
            z12 = false;
        }
        return (z13 && z12) ? DayRangeType.f61215b : z13 ? DayRangeType.f61216c : z12 ? DayRangeType.f61217d : DayRangeType.f61218e;
    }

    @Y61.k
    public final List<kotlin.ranges.o> c() {
        return (List) ((C22082i3) this.f61183n).getF42167b();
    }

    public final boolean d(long j12) {
        Integer num;
        DatePickerSelectionType datePickerSelectionType = this.f61173d;
        DatePickerSelectionType.a aVar = datePickerSelectionType instanceof DatePickerSelectionType.a ? (DatePickerSelectionType.a) datePickerSelectionType : null;
        if (aVar == null || (num = aVar.f61207a) == null) {
            return false;
        }
        int iIntValue = num.intValue();
        kotlin.ranges.o oVar = (kotlin.ranges.o) C42745f0.G(c());
        if (oVar == null || !com.akita.compose.component.date_picker.utils.i.a(oVar) || oVar.f406915b >= j12) {
            return false;
        }
        long j13 = iIntValue - 1;
        e.a aVar2 = kotlin.time.e.f410651c;
        return j12 < (kotlin.time.e.e(kotlin.time.g.g(1, DurationUnit.f410637i)) * j13) + oVar.f406916c;
    }

    public final boolean e(long j12) {
        List<kotlin.ranges.o> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (((kotlin.ranges.o) it.next()).b(j12)) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public final DayRangeType f(long j12) {
        return b(j12, new c());
    }
}
