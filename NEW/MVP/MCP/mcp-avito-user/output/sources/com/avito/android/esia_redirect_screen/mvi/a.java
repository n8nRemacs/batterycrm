package com.avito.android.esia_redirect_screen.mvi;

import Iz.AbstractC14176a;
import Iz.AbstractC14178c;
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

/* compiled from: EsiaRedirectActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LIz/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.esia_redirect_screen.mvi.EsiaRedirectActor$process$1", f = "EsiaRedirectActor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AbstractC14178c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f148056q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f148057r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f148058s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC14176a f148059t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, AbstractC14176a abstractC14176a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f148058s = eVar;
        this.f148059t = abstractC14176a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f148058s, this.f148059t, continuation);
        aVar.f148057r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC14178c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f148056q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f148057r;
            b.a.a(this.f148058s.f148073a, ((AbstractC14176a.b) this.f148059t).f8667a, null, null, 6);
            AbstractC14178c.a aVar = AbstractC14178c.a.f8673a;
            this.f148056q = 1;
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
