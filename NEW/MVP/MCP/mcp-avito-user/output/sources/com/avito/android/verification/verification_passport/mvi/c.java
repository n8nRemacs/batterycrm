package com.avito.android.verification.verification_passport.mvi;

import Y41.p;
import com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: PassportActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_passport.mvi.PassportActor$onSDKSuccess$1", f = "PassportActor.kt", i = {}, l = {54, 55}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super PassportInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325718q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CBRSDKState f325720s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f325721t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CBRSDKState cBRSDKState, f fVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f325720s = cBRSDKState;
        this.f325721t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f325720s, this.f325721t, continuation);
        cVar.f325719r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PassportInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f325718q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.C42729a0.b(r9)
            goto L84
        L1b:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f325719r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            ru.cyberity.cbr.core.data.model.CBRSDKState r1 = r8.f325720s
            boolean r4 = r1 instanceof ru.cyberity.cbr.core.data.model.CBRSDKState.Pending
            if (r4 != 0) goto L51
            boolean r4 = r1 instanceof ru.cyberity.cbr.core.data.model.CBRSDKState.FinallyRejected
            if (r4 != 0) goto L51
            boolean r4 = r1 instanceof ru.cyberity.cbr.core.data.model.CBRSDKState.Approved
            if (r4 != 0) goto L51
            boolean r4 = r1 instanceof ru.cyberity.cbr.core.data.model.CBRSDKState.ActionCompleted
            if (r4 == 0) goto L4f
            ru.cyberity.cbr.core.data.model.CBRSDKState$ActionCompleted r1 = (ru.cyberity.cbr.core.data.model.CBRSDKState.ActionCompleted) r1
            java.lang.String r4 = r1.getAnswer()
            java.lang.String r5 = "GREEN"
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L4f
            java.util.Map r1 = r1.getPayload()
            ru.cyberity.cbr.core.data.model.CBRLivenessReason$UserCancelled r4 = ru.cyberity.cbr.core.data.model.CBRLivenessReason.UserCancelled.INSTANCE
            boolean r1 = r1.containsValue(r4)
            if (r1 != 0) goto L4f
            goto L51
        L4f:
            r1 = 0
            goto L52
        L51:
            r1 = r3
        L52:
            if (r1 == 0) goto L6c
            com.avito.android.verification.verification_passport.mvi.f r4 = r8.f325721t
            com.avito.android.verification.verification_passport.CyberityParams r5 = r4.f325729b
            java.lang.String r6 = r5.f325675d
            com.avito.android.verification.verification_passport.b r7 = r4.f325730c
            java.lang.String r5 = r5.f325676e
            io.reactivex.rxjava3.internal.operators.single.W r5 = r7.a(r6, r5)
            com.avito.android.verification.verification_passport.mvi.d<T> r6 = com.avito.android.verification.verification_passport.mvi.d.f325722b
            com.avito.android.verification.verification_passport.mvi.e r7 = new com.avito.android.verification.verification_passport.mvi.e
            r7.<init>(r4)
            r5.x(r6, r7)
        L6c:
            if (r1 == 0) goto L79
            com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction$SetSuccessAndFinish r1 = com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction.SetSuccessAndFinish.f325727b
            r8.f325718q = r3
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L84
            return r0
        L79:
            com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction$FinishWithNoChanges r1 = com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction.FinishWithNoChanges.f325725b
            r8.f325718q = r2
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L84
            return r0
        L84:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_passport.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
