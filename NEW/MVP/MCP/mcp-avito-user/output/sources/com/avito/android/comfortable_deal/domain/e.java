package com.avito.android.comfortable_deal.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.AcceptCallbackRequestStatus;
import com.avito.android.comfortable_deal.api.model.AcceptCallbackResponse;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import cp.InterfaceC39387a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendPhoneInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/domain/e;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39387a f122013a;

    /* compiled from: SendPhoneInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/domain/g;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.domain.SendPhoneInteractor$sendPhoneNumber$1", f = "SendPhoneInteractor.kt", i = {0}, l = {18, 33}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super g>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122014q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f122015r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f122017t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f122018u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f122017t = str;
            this.f122018u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f122017t, this.f122018u, continuation);
            aVar.f122015r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super g> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            g gVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122014q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f122015r;
                InterfaceC39387a interfaceC39387a = e.this.f122013a;
                String strF = new C43059p("[\\s-]").f(this.f122017t, "");
                this.f122015r = interfaceC43172j;
                this.f122014q = 1;
                obj = interfaceC39387a.m(strF, this.f122018u, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f122015r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                AcceptCallbackResponse acceptCallbackResponse = (AcceptCallbackResponse) ((TypedResult.Success) typedResult).getResult();
                gVar = new g(acceptCallbackResponse.getDescription(), !(acceptCallbackResponse.getStatus() == AcceptCallbackRequestStatus.CALL_SOON || acceptCallbackResponse.getStatus() == AcceptCallbackRequestStatus.ALREADY_EXISTS));
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                gVar = new g(z.l(C35936s.a(error.getError(), error.getCause())), true);
            }
            this.f122015r = null;
            this.f122014q = 2;
            if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public e(@k InterfaceC39387a interfaceC39387a) {
        this.f122013a = interfaceC39387a;
    }

    @k
    public final InterfaceC43160i<g> a(@k String str, @k String str2) {
        return C43175k.G(new a(str, str2, null));
    }
}
