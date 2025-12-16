package com.avito.android.push.impl_module.token.sending.sender;

import Ek0.InterfaceC13498a;
import Kk0.C14323b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: PushTokenSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LKk0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.push.impl_module.token.sending.sender.PushTokenSenderImpl$sendTokenV3$1", f = "PushTokenSenderImpl.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super TypedResult<C14323b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f246040q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f246041r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f246042s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f246043t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f246044u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, boolean z12, String str, String str2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f246041r = aVar;
        this.f246042s = z12;
        this.f246043t = str;
        this.f246044u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f246041r, this.f246042s, this.f246043t, this.f246044u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C14323b>> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246040q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC13498a interfaceC13498a = this.f246041r.f246031a.get();
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            Boolean boolBoxBoolean2 = Boxing.boxBoolean(!r11.f246033c.v().invoke().booleanValue());
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(this.f246042s);
            this.f246040q = 1;
            obj = interfaceC13498a.g(boolBoxBoolean, boolBoxBoolean2, boolBoxBoolean3, this.f246043t, this.f246044u, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
