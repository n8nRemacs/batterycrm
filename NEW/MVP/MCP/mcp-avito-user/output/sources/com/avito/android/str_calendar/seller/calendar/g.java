package com.avito.android.str_calendar.seller.calendar;

import Jy0.InterfaceC14263c;
import Y41.p;
import Y61.l;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: StrSellerCalendarFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment$handleEvent$2", f = "StrSellerCalendarFragment.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287593q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrSellerCalendarFragment f287594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14263c f287595s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StrSellerCalendarFragment strSellerCalendarFragment, InterfaceC14263c interfaceC14263c, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f287594r = strSellerCalendarFragment;
        this.f287595s = interfaceC14263c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f287594r, this.f287595s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287593q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.str_calendar.seller.core.c cVar = this.f287594r.f287485u0;
            if (cVar == null) {
                cVar = null;
            }
            com.avito.android.str_calendar.seller.core.c cVar2 = cVar;
            InterfaceC14263c.d dVar = (InterfaceC14263c.d) this.f287595s;
            String str = dVar.f9198a;
            Date date = dVar.f9199b;
            Date date2 = dVar.f9200c;
            boolean z12 = dVar.f9201d;
            this.f287593q = 1;
            if (cVar2.e(str, date, date2, z12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
