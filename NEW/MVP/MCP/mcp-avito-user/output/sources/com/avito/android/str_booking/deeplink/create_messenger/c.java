package com.avito.android.str_booking.deeplink.create_messenger;

import Px0.InterfaceC14851a;
import Qx0.C14948a;
import Y41.p;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCreateMessengerDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LQx0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplinkHandler$doHandleSuspend$2", f = "StrCreateMessengerDeeplinkHandler.kt", i = {}, l = {39, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<C14948a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f285415q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f285416r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f285417s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ StrCreateMessengerDeeplink f285418t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, StrCreateMessengerDeeplink strCreateMessengerDeeplink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f285417s = fVar;
        this.f285418t = strCreateMessengerDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f285417s, this.f285418t, continuation);
        cVar.f285416r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<C14948a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f285415q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f285416r;
            InterfaceC14851a interfaceC14851a = this.f285417s.f285424g;
            StrCreateMessengerDeeplink strCreateMessengerDeeplink = this.f285418t;
            String str = strCreateMessengerDeeplink.f285400c;
            this.f285416r = interfaceC43172j;
            this.f285415q = 1;
            obj = interfaceC14851a.b(str, strCreateMessengerDeeplink.f285399b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f285416r;
            C42729a0.b(obj);
        }
        this.f285416r = null;
        this.f285415q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
