package com.avito.android.mortgage.pre_approval.result.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetApplicationUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/domain/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<IZ.a> f202102a;

    /* compiled from: GetApplicationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.pre_approval.result.mvi.domain.GetApplicationUseCase$getApplicationId$1", f = "GetApplicationUseCase.kt", i = {0, 1, 4}, l = {21, 23, AvailableCode.ERROR_NO_ACTIVITY, 31, 37, 40, 43, 46}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.pre_approval.result.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C6003a extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalResultInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f202103q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f202104r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MZ.k f202106t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6003a(MZ.k kVar, Continuation<? super C6003a> continuation) {
            super(2, continuation);
            this.f202106t = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6003a c6003a = a.this.new C6003a(this.f202106t, continuation);
            c6003a.f202104r = obj;
            return c6003a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PreApprovalResultInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6003a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.pre_approval.result.mvi.domain.a.C6003a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k h31.e<IZ.a> eVar) {
        this.f202102a = eVar;
    }

    @k
    public final InterfaceC43160i<PreApprovalResultInternalAction> a(@k MZ.k kVar) {
        return C43175k.G(new C6003a(kVar, null));
    }
}
