package com.avito.android.user_address.map.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapFlowUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapFlowUtilsKt$moveCameraToPositionSellerAddAddressFlow$2", f = "UserAddressMapFlowUtils.kt", i = {0, 1, 2}, l = {370, 377, 384, 385}, m = "invokeSuspend", n = {"$this$catch", "$this$catch", "$this$catch"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.user_address.map.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35364q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307905q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f307906r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f307907s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_address.map.view.e f307908t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35364q(com.avito.android.user_address.map.view.e eVar, Continuation<? super C35364q> continuation) {
        super(3, continuation);
        this.f307908t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C35364q c35364q = new C35364q(this.f307908t, continuation);
        c35364q.f307906r = interfaceC43172j;
        c35364q.f307907s = th2;
        return c35364q.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f307905q
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L30
            if (r2 == r7) goto L2a
            if (r2 == r6) goto L2a
            if (r2 == r5) goto L24
            if (r2 != r4) goto L1c
            kotlin.C42729a0.b(r18)
            goto L9e
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            kotlinx.coroutines.flow.j r2 = r0.f307906r
            kotlin.C42729a0.b(r18)
            goto L8d
        L2a:
            kotlinx.coroutines.flow.j r2 = r0.f307906r
            kotlin.C42729a0.b(r18)
            goto L7d
        L30:
            kotlin.C42729a0.b(r18)
            kotlinx.coroutines.flow.j r2 = r0.f307906r
            java.lang.Throwable r8 = r0.f307907s
            boolean r9 = com.avito.android.util.K5.e(r8)
            com.avito.android.user_address.map.view.e r10 = r0.f307908t
            if (r9 == 0) goto L5d
            com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$ShowToastBar r6 = new com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$ShowToastBar
            java.lang.String r12 = r10.getF307960b()
            com.avito.android.component.toast.f$c r14 = new com.avito.android.component.toast.f$c
            r14.<init>(r8)
            r16 = 0
            r13 = 0
            r15 = 2
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r0.f307906r = r2
            r0.f307905q = r7
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L7d
            return r1
        L5d:
            com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$ShowToastBar r13 = new com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$ShowToastBar
            java.lang.String r9 = r10.getF307959a()
            com.avito.android.component.toast.f$c r10 = new com.avito.android.component.toast.f$c
            r10.<init>(r8)
            r12 = 0
            r11 = 0
            r14 = 2
            r7 = r13
            r8 = r9
            r9 = r11
            r11 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r0.f307906r = r2
            r0.f307905q = r6
            java.lang.Object r6 = r2.emit(r13, r0)
            if (r6 != r1) goto L7d
            return r1
        L7d:
            com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$ShowLoaderOnSaveButton r6 = new com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$ShowLoaderOnSaveButton
            r6.<init>(r3)
            r0.f307906r = r2
            r0.f307905q = r5
            java.lang.Object r5 = r2.emit(r6, r0)
            if (r5 != r1) goto L8d
            return r1
        L8d:
            com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$SaveButtonEnable r5 = new com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction$SaveButtonEnable
            r5.<init>(r3)
            r3 = 0
            r0.f307906r = r3
            r0.f307905q = r4
            java.lang.Object r2 = r2.emit(r5, r0)
            if (r2 != r1) goto L9e
            return r1
        L9e:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.mvi.C35364q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
