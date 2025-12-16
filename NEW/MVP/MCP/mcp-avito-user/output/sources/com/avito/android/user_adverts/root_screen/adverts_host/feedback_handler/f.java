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
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.FeedbackHandler$sendOnFailedEvent$1", f = "FeedbackHandler.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f312669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f312670s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, String str, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f312669r = bVar;
        this.f312670s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f312669r, this.f312670s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312668q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = b.f312652e;
            Y1 y12 = (Y1) this.f312669r.f312655c.getValue();
            j.a aVar = new j.a(this.f312670s);
            this.f312668q = 1;
            if (y12.emit(aVar, this) == coroutine_suspended) {
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
