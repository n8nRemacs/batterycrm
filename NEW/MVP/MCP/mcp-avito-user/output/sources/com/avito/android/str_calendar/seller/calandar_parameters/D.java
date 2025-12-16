package com.avito.android.str_calendar.seller.calandar_parameters;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: StrCalendarParametersFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$handleEvent$3", f = "StrCalendarParametersFragment.kt", i = {}, l = {297, 302, 305}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class D extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286671q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrCalendarParametersFragment f286672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Gy0.d f286673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(StrCalendarParametersFragment strCalendarParametersFragment, Gy0.d dVar, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f286672r = strCalendarParametersFragment;
        this.f286673s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new D(this.f286672r, this.f286673s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((D) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f286671q
            com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment r2 = r9.f286672r
            r3 = 3
            r4 = 2
            r5 = 1
            Gy0.d r6 = r9.f286673s
            r7 = 0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlin.C42729a0.b(r10)
            goto L73
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.C42729a0.b(r10)
            goto L5f
        L26:
            kotlin.C42729a0.b(r10)
            goto L43
        L2a:
            kotlin.C42729a0.b(r10)
            com.avito.android.str_calendar.seller.core.c r10 = r2.f286692q0
            if (r10 == 0) goto L32
            goto L33
        L32:
            r10 = r7
        L33:
            r1 = r6
            Gy0.d$b r1 = (Gy0.d.b) r1
            boolean r8 = r1.f6851a
            com.avito.android.str_calendar.common.models.UpdatedParametersInfo r1 = r1.f6852b
            r9.f286671q = r5
            java.lang.Object r10 = r10.d(r8, r1, r9)
            if (r10 != r0) goto L43
            return r0
        L43:
            r10 = r6
            Gy0.d$b r10 = (Gy0.d.b) r10
            Fy0.a r10 = r10.f6853c
            boolean r1 = r10 instanceof Fy0.InterfaceC13856a.c
            if (r1 == 0) goto L5f
            com.avito.android.str_calendar.seller.core.c r1 = r2.f286692q0
            if (r1 == 0) goto L51
            goto L52
        L51:
            r1 = r7
        L52:
            Fy0.a$c r10 = (Fy0.InterfaceC13856a.c) r10
            SK0.f r10 = r10.f6109b
            r9.f286671q = r4
            java.lang.Object r10 = r1.h(r10, r9)
            if (r10 != r0) goto L5f
            return r0
        L5f:
            Gy0.d$b r6 = (Gy0.d.b) r6
            boolean r10 = r6.f6854d
            if (r10 == 0) goto L73
            com.avito.android.str_calendar.seller.core.c r10 = r2.f286692q0
            if (r10 == 0) goto L6a
            r7 = r10
        L6a:
            r9.f286671q = r3
            java.lang.Object r10 = r7.a(r9)
            if (r10 != r0) goto L73
            return r0
        L73:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
