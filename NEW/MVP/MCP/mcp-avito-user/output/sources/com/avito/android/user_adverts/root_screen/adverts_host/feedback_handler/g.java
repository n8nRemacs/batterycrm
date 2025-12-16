package com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Y1;

/* compiled from: FeedbackHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.FeedbackHandler$sendOnStartEvent$1", f = "FeedbackHandler.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312671q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f312672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f312673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, String str, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f312672r = bVar;
        this.f312673s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new g(this.f312672r, this.f312673s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312671q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = b.f312652e;
            Y1 y12 = (Y1) this.f312672r.f312655c.getValue();
            j.b bVar = new j.b(this.f312673s);
            this.f312671q = 1;
            if (y12.emit(bVar, this) == coroutine_suspended) {
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
