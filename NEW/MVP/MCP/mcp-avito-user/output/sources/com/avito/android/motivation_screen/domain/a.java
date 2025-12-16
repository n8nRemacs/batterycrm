package com.avito.android.motivation_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import com.avito.android.motivation_screen.models.MotivationInternalAction;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MotivationInteractor.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/domain/a;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WF.a f206299a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206300b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f206301c;

    /* compiled from: MotivationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.motivation_screen.domain.MotivationInteractor$getInfo$1", f = "MotivationInteractor.kt", i = {0}, l = {15, 16}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.motivation_screen.domain.a$a, reason: collision with other inner class name */
    public static final class C6146a extends SuspendLambda implements p<InterfaceC43172j<? super MotivationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public c f206302q;

        /* renamed from: r, reason: collision with root package name */
        public int f206303r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f206304s;

        public C6146a(Continuation<? super C6146a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6146a c6146a = a.this.new C6146a(continuation);
            c6146a.f206304s = obj;
            return c6146a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MotivationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6146a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206303r;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f206304s;
                a aVar = a.this;
                c cVar2 = aVar.f206301c;
                this.f206304s = interfaceC43172j2;
                this.f206302q = cVar2;
                this.f206303r = 1;
                Object objA = aVar.f206299a.a(aVar.f206300b, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                obj = objA;
                cVar = cVar2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                cVar = this.f206302q;
                interfaceC43172j = (InterfaceC43172j) this.f206304s;
                C42729a0.b(obj);
            }
            cVar.getClass();
            MotivationInternalAction motivationInternalActionA = c.a((TypedResult) obj);
            this.f206304s = null;
            this.f206302q = null;
            this.f206303r = 2;
            if (interfaceC43172j.emit(motivationInternalActionA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k WF.a aVar, @k String str, @k c cVar) {
        this.f206299a = aVar;
        this.f206300b = str;
        this.f206301c = cVar;
    }

    @k
    public final InterfaceC43160i<MotivationInternalAction> a() {
        return C43175k.G(new C6146a(null));
    }
}
