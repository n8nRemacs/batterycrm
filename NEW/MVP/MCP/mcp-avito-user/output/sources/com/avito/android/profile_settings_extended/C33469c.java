package com.avito.android.profile_settings_extended;

import com.avito.android.profile_settings_extended.C33468b;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CommonValueInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/b$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.CommonValueInteractorImpl$deleteValue$1", f = "CommonValueInteractor.kt", i = {0, 1}, l = {34, 37, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.profile_settings_extended.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33469c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super C33468b.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f229999q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230000r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33468b f230001s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CommonValueId f230002t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33469c(C33468b c33468b, CommonValueId commonValueId, Continuation<? super C33469c> continuation) {
        super(2, continuation);
        this.f230001s = c33468b;
        this.f230002t = commonValueId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33469c c33469c = new C33469c(this.f230001s, this.f230002t, continuation);
        c33469c.f230000r = obj;
        return c33469c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super C33468b.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33469c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws com.avito.android.util.ApiException {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f229999q
            r2 = 1
            r3 = 3
            com.avito.android.profile_settings_extended.entity.CommonValueId r4 = r11.f230002t
            com.avito.android.profile_settings_extended.b r5 = r11.f230001s
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L33
            if (r1 == r2) goto L2b
            if (r1 == r6) goto L23
            if (r1 != r3) goto L1b
            kotlin.C42729a0.b(r12)
            goto Laf
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r1 = r11.f230000r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L84
        L2b:
            java.lang.Object r1 = r11.f230000r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L50
        L33:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f230000r
            kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r5.f229994c
            r1.add(r4)
            com.avito.android.profile_settings_extended.b$a$b r1 = new com.avito.android.profile_settings_extended.b$a$b
            r1.<init>(r4)
            r11.f230000r = r12
            r11.f229999q = r2
            java.lang.Object r1 = r12.emit(r1, r11)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r1 = r12
        L50:
            com.google.gson.Gson r12 = r5.f229993b
            com.avito.android.remote.model.extended.modification.RemoveValueModification$Operation r2 = new com.avito.android.remote.model.extended.modification.RemoveValueModification$Operation
            java.lang.String r8 = r4.f230266c
            r2.<init>(r8, r7, r6, r7)
            com.avito.android.remote.model.extended.modification.ModificationBody r8 = new com.avito.android.remote.model.extended.modification.ModificationBody
            com.avito.android.remote.model.extended.modification.RemoveValueModification r9 = new com.avito.android.remote.model.extended.modification.RemoveValueModification
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r10 = r4.f230265b
            r9.<init>(r10, r2)
            java.util.List r2 = java.util.Collections.singletonList(r9)
            r8.<init>(r2)
            java.lang.String r12 = r12.l(r8)
            h31.e<com.avito.android.remote.D0> r2 = r5.f229992a
            java.lang.Object r2 = r2.get()
            com.avito.android.remote.D0 r2 = (com.avito.android.remote.D0) r2
            r11.f230000r = r1
            r11.f229999q = r6
            java.lang.Object r12 = r2.e(r12, r11)
            if (r12 != r0) goto L84
            return r0
        L84:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r2 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto Lbc
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r12 = r12.getResult()
            com.avito.android.remote.model.extended.modification.ModificationResult r12 = (com.avito.android.remote.model.extended.modification.ModificationResult) r12
            boolean r2 = r12 instanceof com.avito.android.remote.model.extended.modification.ModificationResult.Ok
            if (r2 == 0) goto Lab
            java.util.concurrent.ConcurrentHashMap$KeySetView r12 = r5.f229994c
            r12.remove(r4)
            com.avito.android.profile_settings_extended.b$a$c r12 = new com.avito.android.profile_settings_extended.b$a$c
            r12.<init>(r4)
            r11.f230000r = r7
            r11.f229999q = r3
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto Laf
            return r0
        Lab:
            boolean r12 = r12 instanceof com.avito.android.remote.model.extended.modification.ModificationResult.IncorrectValues
            if (r12 != 0) goto Lb2
        Laf:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        Lb2:
            com.avito.android.util.ApiException r12 = new com.avito.android.util.ApiException
            com.avito.android.remote.error.ApiError$UnknownError r0 = com.avito.android.remote.error.j.d(r3, r7)
            r12.<init>(r0, r7, r6, r7)
            throw r12
        Lbc:
            boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lcf
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r0 = r12.getError()
            java.lang.Throwable r12 = r12.getCause()
            com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r0, r12)
            throw r12
        Lcf:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.C33469c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
