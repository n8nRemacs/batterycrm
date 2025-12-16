package com.avito.android.comfortable_deal.deal.mvi;

import Gp.C13905a;
import android.net.Uri;
import com.avito.android.comfortable_deal.api.model.Call;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$13", f = "DealActor.kt", i = {0, 0}, l = {303, 214}, m = "invokeSuspend", n = {"$this$flow", "callUri"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.comfortable_deal.deal.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29458f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Uri f121654q;

    /* renamed from: r, reason: collision with root package name */
    public int f121655r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f121656s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29453a f121657t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121658u;

    /* compiled from: DealActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/comfortable_deal/deal/mvi/b"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$13$invokeSuspend$$inlined$doOnMainThread$1", f = "DealActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.deal.mvi.f$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C29453a f121659q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Uri f121660r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, C29453a c29453a, Uri uri) {
            super(2, continuation);
            this.f121659q = c29453a;
            this.f121660r = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(continuation, this.f121659q, this.f121660r);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f121659q.f121580a.c(this.f121660r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29458f(C29453a c29453a, Ep.c cVar, Continuation<? super C29458f> continuation) {
        super(2, continuation);
        this.f121657t = c29453a;
        this.f121658u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29458f c29458f = new C29458f(this.f121657t, this.f121658u, continuation);
        c29458f.f121656s = obj;
        return c29458f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29458f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Uri uri;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121655r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f121656s;
            C29453a c29453a = this.f121657t;
            C13905a c13905a = c29453a.f121582c;
            Ep.c cVar = this.f121658u;
            String str = cVar.f4325b;
            if (str == null) {
                str = "";
            }
            Call call = cVar.f4331h.f4334c;
            String callId = call != null ? call.getCallId() : null;
            Uri uri2 = Uri.parse(c13905a.f6744a.a() + "/2/agent-room/deal/" + str + "/get-call?callId=" + (callId != null ? callId : ""));
            AbstractC43129d1 abstractC43129d1D = c29453a.f121583d.d();
            a aVar = new a(null, c29453a, uri2);
            this.f121656s = interfaceC43172j2;
            this.f121654q = uri2;
            this.f121655r = 1;
            if (C43259k.g(abstractC43129d1D, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
            uri = uri2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            uri = this.f121654q;
            interfaceC43172j = (InterfaceC43172j) this.f121656s;
            C42729a0.b(obj);
        }
        DealInternalAction.CallLoaded callLoaded = new DealInternalAction.CallLoaded(uri);
        this.f121656s = null;
        this.f121654q = null;
        this.f121655r = 2;
        if (interfaceC43172j.emit(callLoaded, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
