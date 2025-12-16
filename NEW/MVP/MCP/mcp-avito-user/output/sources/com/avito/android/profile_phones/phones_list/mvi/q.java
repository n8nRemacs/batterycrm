package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$setIacEnable$1", f = "PhonesListMviActor.kt", i = {0, 1, 2}, l = {173, 176, 179, 180}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes16.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228069q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228070r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f228071s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33433e f228072t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z12, C33433e c33433e, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f228071s = z12;
        this.f228072t = c33433e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f228071s, this.f228072t, continuation);
        qVar.f228070r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f228069q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            boolean r7 = r10.f228071s
            com.avito.android.profile_phones.phones_list.mvi.e r8 = r10.f228072t
            if (r1 == 0) goto L3e
            if (r1 == r6) goto L36
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            kotlin.C42729a0.b(r11)
            goto L91
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            java.lang.Object r1 = r10.f228070r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L81
        L2e:
            java.lang.Object r1 = r10.f228070r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L70
        L36:
            java.lang.Object r1 = r10.f228070r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L53
        L3e:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f228070r
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$IacEnableSwitchLoading r1 = com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction.IacEnableSwitchLoading.f227995b
            r10.f228070r = r11
            r10.f228069q = r6
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L52
            return r0
        L52:
            r1 = r11
        L53:
            if (r7 == 0) goto L70
            com.avito.android.permissions.z r11 = r8.f227965c
            java.lang.String r9 = "android.permission.RECORD_AUDIO"
            com.avito.android.permissions.PermissionState r11 = r11.b(r9)
            boolean r11 = r11.c()
            if (r11 == 0) goto L70
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$StartMicPermissionRequestFlow r11 = com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction.StartMicPermissionRequestFlow.f228012b
            r10.f228070r = r1
            r10.f228069q = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L70
            return r0
        L70:
            NL.e r11 = r8.f227966d
            io.reactivex.rxjava3.internal.operators.completable.v r11 = r11.e(r7, r6)
            r10.f228070r = r1
            r10.f228069q = r3
            java.lang.Object r11 = kotlinx.coroutines.rx3.C43292o.a(r11, r10)
            if (r11 != r0) goto L81
            return r0
        L81:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$IacEnableChangeState r11 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$IacEnableChangeState
            r11.<init>(r7)
            r10.f228070r = r5
            r10.f228069q = r2
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L91
            return r0
        L91:
            com.avito.android.analytics.a r11 = r8.f227971i
            nJ.Q r0 = new nJ.Q
            OL.a r1 = r8.f227969g
            boolean r2 = r1.l()
            if (r2 == 0) goto L9f
            java.lang.String r5 = "first_touch"
        L9f:
            r0.<init>(r7, r5)
            r11.c(r0)
            boolean r11 = r1.l()
            if (r11 == 0) goto Lae
            r1.n()
        Lae:
            java.lang.String r11 = java.lang.String.valueOf(r7)
            oJ.c r0 = oJ.C44656c.f419703a
            com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario r1 = com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario.f164281b
            r0.getClass()
            java.lang.String r0 = oJ.C44656c.d(r1)
            java.lang.String r1 = "iac_enable"
            java.lang.String r2 = "{{%app_ver%}}"
            java.lang.String r3 = "calls"
            java.lang.String[] r11 = new java.lang.String[]{r3, r1, r2, r11, r0}
            com.avito.android.analytics.statsd.F r0 = r8.f227970h
            com.avito.android.analytics.statsd.F$b r11 = r0.a(r11)
            com.avito.android.analytics.statsd.y$a r0 = new com.avito.android.analytics.statsd.y$a
            java.lang.String r11 = r11.f91030a
            r1 = 1
            r0.<init>(r11, r1)
            com.avito.android.analytics.a r11 = r8.f227971i
            r11.c(r0)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
