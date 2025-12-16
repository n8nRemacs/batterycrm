package com.avito.android.mortgage.phone_confirm.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import g00.InterfaceC40507d;
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

/* compiled from: PhoneConfirmBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.b<PhoneConfirmInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PhoneConfirmArguments f201627a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.phone_confirm.mvi.domain.d f201628b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f201629c;

    /* compiled from: PhoneConfirmBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$InitState;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmBootstrap$produce$initialFlow$1", f = "PhoneConfirmBootstrap.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PhoneConfirmInternalAction.InitState>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201630q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201631r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f201631r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PhoneConfirmInternalAction.InitState> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201630q;
            e eVar = e.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201631r;
                if (eVar.f201629c) {
                    return G0.f406611a;
                }
                PhoneConfirmInternalAction.InitState initState = new PhoneConfirmInternalAction.InitState(eVar.f201627a);
                this.f201630q = 1;
                if (interfaceC43172j.emit(initState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            eVar.f201628b.b(InterfaceC40507d.b.a(eVar.f201627a.f201579d != null ? r6.intValue() : 60));
            eVar.f201629c = true;
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k PhoneConfirmArguments phoneConfirmArguments, @Y61.k com.avito.android.mortgage.phone_confirm.mvi.domain.d dVar) {
        this.f201627a = phoneConfirmArguments;
        this.f201628b = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PhoneConfirmInternalAction> a() {
        return C43175k.N(C43175k.G(new a(null)), this.f201628b.f396213c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
