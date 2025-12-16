package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$phonesStateUpdate$1", f = "PhonesListMviActor.kt", i = {0, 1}, l = {240, 241, 242}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33439k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228052q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228053r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PrintableText f228054s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33433e f228055t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33439k(PrintableText printableText, C33433e c33433e, Continuation<? super C33439k> continuation) {
        super(2, continuation);
        this.f228054s = printableText;
        this.f228055t = c33433e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33439k c33439k = new C33439k(this.f228054s, this.f228055t, continuation);
        c33439k.f228053r = obj;
        return c33439k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33439k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
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
            int r1 = r7.f228052q
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.C42729a0.b(r8)
            goto L7a
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.f228053r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L6d
        L26:
            java.lang.Object r1 = r7.f228053r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L4a
        L2e:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f228053r
            r1 = r8
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.printable_text.PrintableText r8 = r7.f228054s
            if (r8 == 0) goto L4a
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$SuccessToast r6 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$SuccessToast
            r6.<init>(r8)
            r7.f228053r = r1
            r7.f228052q = r5
            java.lang.Object r8 = r1.emit(r6, r7)
            if (r8 != r0) goto L4a
            return r0
        L4a:
            com.avito.android.profile_phones.phones_list.mvi.e r8 = r7.f228055t
            r8.getClass()
            com.avito.android.profile_phones.phones_list.mvi.h r5 = new com.avito.android.profile_phones.phones_list.mvi.h
            r5.<init>(r8, r2)
            kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.flow.C43175k.G(r5)
            com.avito.android.profile_phones.phones_list.mvi.i r6 = new com.avito.android.profile_phones.phones_list.mvi.i
            r6.<init>(r8, r2)
            kotlinx.coroutines.flow.f0 r8 = new kotlinx.coroutines.flow.f0
            r8.<init>(r5, r6)
            r7.f228053r = r1
            r7.f228052q = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
            if (r8 != r0) goto L6d
            return r0
        L6d:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$NeedRefreshProfileAfterExit r8 = com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction.NeedRefreshProfileAfterExit.f227996b
            r7.f228053r = r2
            r7.f228052q = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L7a
            return r0
        L7a:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.C33439k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
