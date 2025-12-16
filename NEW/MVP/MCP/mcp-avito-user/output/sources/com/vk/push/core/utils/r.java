package com.vk.push.core.utils;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.rustore.sdk.core.tasks.f;

/* compiled from: TaskExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1", f = "TaskExtensions.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f367184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.rustore.sdk.core.tasks.f<Object>.b f367185r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f367185r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new r(this.f367185r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f367184q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f367184q = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        Object obj2 = ((Z) obj).f406625b;
        boolean z12 = obj2 instanceof Z.b;
        ru.rustore.sdk.core.tasks.f<Object>.b bVar = this.f367185r;
        if (!z12) {
            bVar.b(obj2);
        }
        Throwable thB = Z.b(obj2);
        if (thB != null) {
            bVar.a(thB);
        }
        return G0.f406611a;
    }
}
