package com.avito.android.sx_address.address_video_verification.mvi;

import BA0.b;
import Y41.q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressVideoVerificationActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBA0/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.mvi.SxAddressVideoVerificationActor$process$3", f = "SxAddressVideoVerificationActor.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<? super BA0.b>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292686q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f292687r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f292688s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f292688s = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BA0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f292688s, continuation);
        dVar.f292687r = interfaceC43172j;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292686q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f292687r;
            b.f fVar = new b.f(this.f292688s.f292675e.getF292735d());
            this.f292686q = 1;
            if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
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
