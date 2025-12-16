package com.avito.android.mortgage.pre_approval.result.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: PreApprovalResultBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.b<PreApprovalResultInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PreApprovalArguments f202095a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.pre_approval.result.mvi.domain.d f202096b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.pre_approval.result.mvi.domain.f f202097c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f202098d;

    /* compiled from: PreApprovalResultBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.pre_approval.result.mvi.PreApprovalResultBootstrap$produce$bootstrapFlow$1", f = "PreApprovalResultBootstrap.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 48}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalResultInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f202099q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f202100r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f202100r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PreApprovalResultInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f202099q;
            d dVar = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f202100r;
                if (dVar.f202098d) {
                    return G0.f406611a;
                }
                dVar.f202098d = true;
                PreApprovalResultInternalAction.Init init = new PreApprovalResultInternalAction.Init(dVar.f202095a);
                this.f202100r = interfaceC43172j;
                this.f202099q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f202100r;
                C42729a0.b(obj);
            }
            PreApprovalArguments preApprovalArguments = dVar.f202095a;
            String str = preApprovalArguments.f201965b;
            Integer num = preApprovalArguments.f201967d;
            Integer num2 = preApprovalArguments.f201968e;
            InterfaceC43172j interfaceC43172j2 = interfaceC43172j;
            InterfaceC43160i interfaceC43160iA = dVar.f202096b.a(new MZ.l(preApprovalArguments.f201966c, str, num2, num2 != null ? num : null, num2 == null ? num : null, preApprovalArguments.f201969f, preApprovalArguments.f201970g, preApprovalArguments.f201976m, preApprovalArguments.f201971h, preApprovalArguments.f201972i, preApprovalArguments.f201973j, preApprovalArguments.f201975l, preApprovalArguments.f201974k), InterfaceC40507d.b.a(7.0f));
            this.f202100r = null;
            this.f202099q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k PreApprovalArguments preApprovalArguments, @Y61.k com.avito.android.mortgage.pre_approval.result.mvi.domain.d dVar, @Y61.k com.avito.android.mortgage.pre_approval.result.mvi.domain.f fVar) {
        this.f202095a = preApprovalArguments;
        this.f202096b = dVar;
        this.f202097c = fVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PreApprovalResultInternalAction> a() {
        return C43175k.N(C43175k.G(new a(null)), this.f202097c.f396213c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
