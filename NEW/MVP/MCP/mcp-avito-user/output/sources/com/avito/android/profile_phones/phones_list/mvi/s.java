package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$setSchedule$1", f = "PhonesListMviActor.kt", i = {0, 1}, l = {164, 165, 166}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228076q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228077r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33433e f228078s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ScheduleOption f228079t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C33433e c33433e, ScheduleOption scheduleOption, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f228078s = c33433e;
        this.f228079t = scheduleOption;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f228078s, this.f228079t, continuation);
        sVar.f228077r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f228076q
            com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption r2 = r7.f228079t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r8)
            goto L77
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.f228077r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L66
        L27:
            java.lang.Object r1 = r7.f228077r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L4c
        L2f:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f228077r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.profile_phones.phones_list.mvi.e r1 = r7.f228078s
            NL.f r1 = r1.f227967e
            java.lang.String r6 = r2.f168409b
            io.reactivex.rxjava3.internal.operators.completable.v r1 = r1.a(r6)
            r7.f228077r = r8
            r7.f228076q = r5
            java.lang.Object r1 = kotlinx.coroutines.rx3.C43292o.a(r1, r7)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            r1 = r8
        L4c:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$SuccessToast r8 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$SuccessToast
            r5 = 0
            java.io.Serializable[] r5 = new java.io.Serializable[r5]
            r6 = 2131954380(0x7f130acc, float:1.9545258E38)
            com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.c(r6, r5)
            r8.<init>(r5)
            r7.f228077r = r1
            r7.f228076q = r4
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L66
            return r0
        L66:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$ScheduleOptionClick r8 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$ScheduleOptionClick
            r8.<init>(r2)
            r2 = 0
            r7.f228077r = r2
            r7.f228076q = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L77
            return r0
        L77:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
