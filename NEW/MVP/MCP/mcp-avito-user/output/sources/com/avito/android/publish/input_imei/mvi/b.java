package com.avito.android.publish.input_imei.mvi;

import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import le0.C43742c;
import le0.InterfaceC43740a;

/* compiled from: InputImeiActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiActor$process$2", f = "InputImeiActor.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InputImeiInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236369q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f236370r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f236371s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43742c f236372t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43740a f236373u;

    /* compiled from: InputImeiActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InputImeiInternalAction> f236374b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j) {
            this.f236374b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit = this.f236374b.emit((InputImeiInternalAction) obj, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, C43742c c43742c, InterfaceC43740a interfaceC43740a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f236371s = fVar;
        this.f236372t = c43742c;
        this.f236373u = interfaceC43740a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f236371s, this.f236372t, this.f236373u, continuation);
        bVar.f236370r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f236369q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f236370r;
            f fVar = this.f236371s;
            String strG = fVar.f236391a.g();
            C43742c c43742c = this.f236372t;
            if (L.f(c43742c.f413975b, strG)) {
                fVar.f236391a.e();
            } else {
                InterfaceC43160i interfaceC43160iG = C43175k.G(new e(fVar, ((InterfaceC43740a.c) this.f236373u).f413965a, c43742c, null));
                a aVar = new a(interfaceC43172j);
                this.f236369q = 1;
                if (interfaceC43160iG.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
