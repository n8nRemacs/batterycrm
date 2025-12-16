package com.avito.android.arch.mvi.utils;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ActorExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "InternalAction", "State", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.utils.ActorExtKt$processActions$1", f = "ActorExt.kt", i = {0, 0}, l = {20}, m = "invokeSuspend", n = {"$this$flow", "$this$forEach$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object[] f92021q;

    /* renamed from: r, reason: collision with root package name */
    public int f92022r;

    /* renamed from: s, reason: collision with root package name */
    public int f92023s;

    /* renamed from: t, reason: collision with root package name */
    public int f92024t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f92025u;

    public a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92024t;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = this.f92023s;
        int i14 = this.f92022r;
        Object[] objArr = this.f92021q;
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f92025u;
        C42729a0.b(obj);
        do {
            i14++;
            if (i14 >= i13) {
                return G0.f406611a;
            }
            obj2 = objArr[i14];
            this.f92025u = interfaceC43172j;
            this.f92021q = objArr;
            this.f92022r = i14;
            this.f92023s = i13;
            this.f92024t = 1;
        } while (interfaceC43172j.emit(obj2, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
