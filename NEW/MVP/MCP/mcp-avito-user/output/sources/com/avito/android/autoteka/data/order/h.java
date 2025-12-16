package com.avito.android.autoteka.data.order;

import Fj0.InterfaceC13808a;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AutotekaGetOrderItemInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LFj0/a;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.data.order.AutotekaGetOrderItemInteractorImpl$invoke$2", f = "AutotekaGetOrderItemInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<InterfaceC13808a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96162q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f96163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f96164s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f96165t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f96166u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f96167v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Boolean f96168w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, String str2, String str3, String str4, Boolean bool, Continuation<? super h> continuation) {
        super(1, continuation);
        this.f96163r = iVar;
        this.f96164s = str;
        this.f96165t = str2;
        this.f96166u = str3;
        this.f96167v = str4;
        this.f96168w = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new h(this.f96163r, this.f96164s, this.f96165t, this.f96166u, this.f96167v, this.f96168w, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TypedResult<InterfaceC13808a>> continuation) {
        return ((h) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96162q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.autoteka.data.i iVar = this.f96163r.f96169a;
            this.f96162q = 1;
            obj = iVar.f96124b.e(this.f96166u, this.f96168w, this.f96165t, this.f96167v, this.f96164s, this);
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
