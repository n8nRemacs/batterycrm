package com.avito.avcalls.call;

import com.avito.avcalls.a;
import com.avito.avcalls.call.C36199e;
import com.avito.avcalls.call.models.CallState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallManager$handleStatsReport$1", f = "CallManager.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36201g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332682q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36199e f332683r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f332684s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CallState f332685t;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/avcalls/a$g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<a.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f332686l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CallState f332687m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CallState callState) {
            super(1);
            this.f332686l = str;
            this.f332687m = callState;
        }

        @Override // Y41.l
        public final G0 invoke(a.g gVar) {
            gVar.b(this.f332686l, this.f332687m);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36201g(C36199e c36199e, String str, CallState callState, Continuation<? super C36201g> continuation) {
        super(2, continuation);
        this.f332683r = c36199e;
        this.f332684s = str;
        this.f332685t = callState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36201g(this.f332683r, this.f332684s, this.f332685t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36201g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332682q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f332684s, this.f332685t);
            this.f332682q = 1;
            C36199e.Companion companion = C36199e.INSTANCE;
            if (this.f332683r.i(aVar, this) == coroutine_suspended) {
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
