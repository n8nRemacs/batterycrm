package com.avito.android.das_date_picker.mvi;

import bu.C25712a;
import bu.C25715d;
import java.util.Date;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: DasCalendarDataBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lbu/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lbu/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarDataBuilderImpl$buildMonthInfo$2", f = "DasCalendarDataBuilder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements Y41.p<T, Continuation<? super C25715d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List<C25712a> f132415q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f132416r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Date f132417s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Date f132418t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Date date, Date date2, List list, Continuation continuation) {
        super(2, continuation);
        this.f132415q = list;
        this.f132416r = hVar;
        this.f132417s = date;
        this.f132418t = date2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f132416r, this.f132417s, this.f132418t, this.f132415q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C25715d> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r13)
            java.util.List<bu.a> r13 = r12.f132415q
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L10
            r13 = 0
            return r13
        L10:
            java.lang.Object r0 = kotlin.collections.C42745f0.E(r13)
            bu.a r0 = (bu.C25712a) r0
            java.util.Date r0 = r0.f57529a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.avito.android.das_date_picker.mvi.h r2 = r12.f132416r
            r2.getClass()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r0)
            r3 = 7
            int r2 = r2.get(r3)
            r4 = 1
            r5 = 5
            r6 = 0
            r7 = 6
            if (r2 == r4) goto L4b
            r8 = 3
            if (r2 == r8) goto L4a
            r9 = 4
            if (r2 == r9) goto L48
            if (r2 == r5) goto L46
            if (r2 == r7) goto L44
            if (r2 == r3) goto L42
            r7 = r6
            goto L4b
        L42:
            r7 = r5
            goto L4b
        L44:
            r7 = r9
            goto L4b
        L46:
            r7 = r8
            goto L4b
        L48:
            r7 = 2
            goto L4b
        L4a:
            r7 = r4
        L4b:
            r2 = r6
        L4c:
            if (r2 >= r7) goto L59
            bu.c$b r8 = new bu.c$b
            r8.<init>(r0)
            r1.add(r8)
            int r2 = r2 + 1
            goto L4c
        L59:
            r2 = r13
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.C42745f0.q(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L6b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r2.next()
            bu.a r8 = (bu.C25712a) r8
            java.util.Date r9 = r8.f57529a
            java.util.Date r10 = r12.f132417s
            boolean r10 = du.C39803a.a(r9, r10)
            if (r10 == 0) goto L91
            java.util.Date r10 = r12.f132418t
            boolean r11 = du.C39803a.b(r9, r10)
            if (r11 != 0) goto L8f
            boolean r10 = du.C39803a.c(r9, r10)
            if (r10 == 0) goto L91
        L8f:
            r10 = r4
            goto L92
        L91:
            r10 = r6
        L92:
            bu.c$a r11 = new bu.c$a
            boolean r8 = r8.f57530b
            if (r8 == 0) goto L9c
            if (r10 == 0) goto L9c
            r8 = r4
            goto L9d
        L9c:
            r8 = r6
        L9d:
            r11.<init>(r9, r8)
            r7.add(r11)
            goto L6b
        La4:
            r1.addAll(r7)
            java.lang.Object r13 = kotlin.collections.C42745f0.Q(r13)
            bu.a r13 = (bu.C25712a) r13
            java.util.Date r13 = r13.f57529a
            java.util.Date r13 = com.avito.android.util.G0.a(r13, r5)
        Lb3:
            int r2 = r1.size()
            int r2 = r2 % r3
            if (r2 == 0) goto Lc3
            bu.c$b r2 = new bu.c$b
            r2.<init>(r13)
            r1.add(r2)
            goto Lb3
        Lc3:
            bu.d r13 = new bu.d
            r13.<init>(r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.das_date_picker.mvi.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
