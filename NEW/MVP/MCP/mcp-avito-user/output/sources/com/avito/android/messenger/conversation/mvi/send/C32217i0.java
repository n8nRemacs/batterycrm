package com.avito.android.messenger.conversation.mvi.send;

import aZ.C19843a;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/remote/model/TypedResult;", "LaZ/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.send.SendMessagePresenterImpl$getIncidentWarning$incidentWarningObservable$1", f = "SendMessagePresenter.kt", i = {}, l = {573, 573}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.i0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32217i0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.I0<? super TypedResult<C19843a>>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f194519q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f194520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f194521s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32217i0(D d12, Continuation<? super C32217i0> continuation) {
        super(2, continuation);
        this.f194521s = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32217i0 c32217i0 = new C32217i0(this.f194521s, continuation);
        c32217i0.f194520r = obj;
        return c32217i0;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.channels.I0<? super TypedResult<C19843a>> i02, Continuation<? super kotlin.G0> continuation) {
        return ((C32217i0) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.channels.I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f194519q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (kotlinx.coroutines.channels.I0) this.f194520r;
            WY.a aVar = this.f194521s.f194211n0;
            this.f194520r = i02;
            this.f194519q = 1;
            obj = aVar.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            i02 = (kotlinx.coroutines.channels.I0) this.f194520r;
            C42729a0.b(obj);
        }
        this.f194520r = null;
        this.f194519q = 2;
        if (i02.send(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
