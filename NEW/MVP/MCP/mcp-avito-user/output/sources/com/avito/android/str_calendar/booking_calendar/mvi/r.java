package com.avito.android.str_calendar.booking_calendar.mvi;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import oy0.AbstractC44957b;
import oy0.C44956a;
import oy0.C44958c;
import wy0.C49704a;

/* compiled from: StrBookingCalendarInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)I"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$calculateScrollPosition$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super Integer>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C44956a f286597q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Date f286598r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C44956a c44956a, Date date, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f286597q = c44956a;
        this.f286598r = date;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f286597q, this.f286598r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Integer> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Date date;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ArrayList arrayList = this.f286597q.f422375a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h(((C44958c) it.next()).f422381b, arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            date = this.f286598r;
            if (!zHasNext) {
                i13 = -1;
                break;
            }
            AbstractC44957b abstractC44957b = (AbstractC44957b) it2.next();
            if ((abstractC44957b instanceof AbstractC44957b.a) && L.f(((AbstractC44957b.a) abstractC44957b).f422376a, date)) {
                break;
            }
            i13++;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (C49704a.d(((C44958c) it3.next()).f422380a, date) && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        Integer numBoxInt = Boxing.boxInt((i12 - 1) + i13);
        if (numBoxInt.intValue() >= 0) {
            return numBoxInt;
        }
        return null;
    }
}
