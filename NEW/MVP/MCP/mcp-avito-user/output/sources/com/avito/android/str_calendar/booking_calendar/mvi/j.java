package com.avito.android.str_calendar.booking_calendar.mvi;

import java.util.Date;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import oy0.C44958c;
import vy0.C49398a;

/* compiled from: StrBookingCalendarDataBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Loy0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Loy0/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarDataBuilderImpl$buildMonthInfo$2", f = "StrBookingCalendarDataBuilder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super C44958c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List<C49398a> f286482q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f286483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Date f286484s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Date f286485t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Date date, Date date2, List list, Continuation continuation) {
        super(2, continuation);
        this.f286482q = list;
        this.f286483r = kVar;
        this.f286484s = date;
        this.f286485t = date2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f286483r, this.f286484s, this.f286485t, this.f286482q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C44958c> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
