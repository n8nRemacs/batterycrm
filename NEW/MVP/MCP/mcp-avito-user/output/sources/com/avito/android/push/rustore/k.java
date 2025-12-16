package com.avito.android.push.rustore;

import Y41.q;
import com.avito.android.push.PushToken;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RustorePushTokenProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Z;", "Lcom/avito/android/push/PushToken;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.push.rustore.RustorePushTokenProviderImpl$getPushToken$3", f = "RustorePushTokenProvider.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements q<InterfaceC43172j<? super Z<? extends PushToken>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f246104q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f246105r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f246106s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f246107t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, Continuation<? super k> continuation) {
        super(3, continuation);
        this.f246107t = gVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Z<? extends PushToken>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        k kVar = new k(this.f246107t, continuation);
        kVar.f246105r = interfaceC43172j;
        kVar.f246106s = th2;
        return kVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246104q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f246105r;
            Throwable th2 = this.f246106s;
            g.b(this.f246107t, th2);
            Z zA2 = Z.a(new Z.b(th2));
            this.f246105r = null;
            this.f246104q = 1;
            if (interfaceC43172j.emit(zA2, this) == coroutine_suspended) {
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
