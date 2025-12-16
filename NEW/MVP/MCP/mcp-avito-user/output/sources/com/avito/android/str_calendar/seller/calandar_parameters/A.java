package com.avito.android.str_calendar.seller.calandar_parameters;

import Gy0.InterfaceC13931a;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StrCalendarParametersFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$configureViews$1$5", f = "StrCalendarParametersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class A extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f286663q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrCalendarParametersFragment f286664r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(StrCalendarParametersFragment strCalendarParametersFragment, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f286664r = strCalendarParametersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        A a12 = new A(this.f286664r, continuation);
        a12.f286663q = obj;
        return a12;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        return ((A) create(bool, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Boolean bool = (Boolean) this.f286663q;
        StrCalendarParametersFragment.a aVar = StrCalendarParametersFragment.f286684D0;
        this.f286664r.r5().accept(new InterfaceC13931a.r(bool.booleanValue()));
        return G0.f406611a;
    }
}
