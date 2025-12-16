package com.avito.android.iac_dialer.impl_module.push_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.notification.U;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: IacPushHandlerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.push_handler.IacPushHandlerImpl$trackPushDelivered$1", f = "IacPushHandlerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ U f166202q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f166203r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f166204s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(U u12, a aVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f166202q = u12;
        this.f166203r = aVar;
        this.f166204s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f166202q, this.f166203r, this.f166204s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        U u12 = this.f166202q;
        Map<String, Object> mapA = u12.a();
        if (mapA != null) {
            a aVar = this.f166203r;
            aVar.f166199i.a(C35755b0.c(mapA), u12.getTrackingInfo(), this.f166204s, null, aVar.f166198h.getStatus().isForeground());
        }
        return G0.f406611a;
    }
}
