package com.avito.android.registration_self_employment_redirect_screen.mvi;

import aj0.AbstractC19901b;
import aj0.c;
import com.avito.android.deeplink_handler.handler.b;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelfEmploymentRedirectActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Laj0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.registration_self_employment_redirect_screen.mvi.SelfEmploymentRedirectActor$process$2", f = "SelfEmploymentRedirectActor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super aj0.c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252743q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252744r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f252745s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC19901b f252746t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, AbstractC19901b abstractC19901b, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f252745s = eVar;
        this.f252746t = abstractC19901b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f252745s, this.f252746t, continuation);
        bVar.f252744r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super aj0.c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252743q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f252744r;
            b.a.a(this.f252745s.f252752a, ((AbstractC19901b.a) this.f252746t).f21126a.f252736c, null, null, 6);
            c.a aVar = c.a.f21130a;
            this.f252743q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
