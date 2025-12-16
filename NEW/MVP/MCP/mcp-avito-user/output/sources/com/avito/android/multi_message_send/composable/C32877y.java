package com.avito.android.multi_message_send.composable;

import G20.c;
import androidx.compose.foundation.lazy.w0;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: MultiSendContent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiSendContentKt$MultiSendContent$1$1$1$1", f = "MultiSendContent.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.multi_message_send.composable.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32877y extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206586q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f206587r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G20.f f206588s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G20.c f206589t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32877y(w0 w0Var, G20.f fVar, G20.c cVar, Continuation<? super C32877y> continuation) {
        super(2, continuation);
        this.f206587r = w0Var;
        this.f206588s = fVar;
        this.f206589t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32877y(this.f206587r, this.f206588s, this.f206589t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C32877y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206586q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                w0 w0Var = this.f206587r;
                List<F20.e> list = this.f206588s.f6259b;
                G20.c cVar = this.f206589t;
                Iterator<F20.e> it = list.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.L.f(it.next().f4507a, ((c.C0330c) cVar).f6242a)) {
                        break;
                    }
                    i13++;
                }
                this.f206586q = 1;
                w0.c cVar2 = w0.f29712w;
                if (w0Var.f(i13, 0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Throwable unused) {
        }
        return G0.f406611a;
    }
}
