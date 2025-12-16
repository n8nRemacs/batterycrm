package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.Y;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$setCallTime$1", f = "PhonesListMviActor.kt", i = {0, 1, 2}, l = {155, 156, 157, 158}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33443o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228062q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228063r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33433e f228064s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y f228065t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33443o(C33433e c33433e, Y y12, Continuation<? super C33443o> continuation) {
        super(2, continuation);
        this.f228064s = c33433e;
        this.f228065t = y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33443o c33443o = new C33443o(this.f228064s, this.f228065t, continuation);
        c33443o.f228063r = obj;
        return c33443o;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33443o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f228062q
            com.avito.android.profile_phones.phones_list.Y r2 = r9.f228065t
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3b
            if (r1 == r6) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            kotlin.C42729a0.b(r10)
            goto L96
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f228063r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L81
        L2b:
            java.lang.Object r1 = r9.f228063r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L74
        L33:
            java.lang.Object r1 = r9.f228063r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L5a
        L3b:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f228063r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.profile_phones.phones_list.mvi.e r10 = r9.f228064s
            NL.f r10 = r10.f227967e
            org.threeten.bp.g r7 = r2.f227432a
            org.threeten.bp.g r8 = r2.f227433b
            io.reactivex.rxjava3.internal.operators.completable.v r10 = r10.b(r7, r8)
            r9.f228063r = r1
            r9.f228062q = r6
            java.lang.Object r10 = kotlinx.coroutines.rx3.C43292o.a(r10, r9)
            if (r10 != r0) goto L5a
            return r0
        L5a:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$SuccessToast r10 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$SuccessToast
            r6 = 0
            java.io.Serializable[] r6 = new java.io.Serializable[r6]
            r7 = 2131954381(0x7f130acd, float:1.954526E38)
            com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.c(r7, r6)
            r10.<init>(r6)
            r9.f228063r = r1
            r9.f228062q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$CloseTimePickerDialog r10 = com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction.CloseTimePickerDialog.f227984b
            r9.f228063r = r1
            r9.f228062q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L81
            return r0
        L81:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$UpdateTimePicker r10 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$UpdateTimePicker
            org.threeten.bp.g r4 = r2.f227432a
            org.threeten.bp.g r2 = r2.f227433b
            r10.<init>(r4, r2)
            r2 = 0
            r9.f228063r = r2
            r9.f228062q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L96
            return r0
        L96:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.C33443o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
