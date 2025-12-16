package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import Y41.p;
import com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRootBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.b<ForceUpdateRootInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ForceUpdateRootOpenParams f158582a;

    /* compiled from: ForceUpdateRootBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdateroot.mvi.ForceUpdateRootBootstrap$produce$1", f = "ForceUpdateRootBootstrap.kt", i = {0}, l = {20, 21, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ForceUpdateRootInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158583q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f158584r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f158584r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ForceUpdateRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
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
                int r1 = r8.f158583q
                com.avito.android.forceupdate.screens.forceupdateroot.mvi.e r2 = com.avito.android.forceupdate.screens.forceupdateroot.mvi.e.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2b
                if (r1 == r6) goto L23
                if (r1 == r5) goto L1f
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                kotlin.C42729a0.b(r9)
                goto L8e
            L23:
                java.lang.Object r1 = r8.f158584r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4d
            L2b:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f158584r
                r1 = r9
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams r9 = r2.f158582a
                boolean r7 = r9 instanceof com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams.UpdateProposal
                if (r7 == 0) goto L62
                com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$SetUpdateSourceType r3 = new com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$SetUpdateSourceType
                com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams$UpdateProposal r9 = (com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams.UpdateProposal) r9
                com.avito.android.forceupdate.domain.dto.UpdateSource r9 = r9.f158556b
                r3.<init>(r9)
                r8.f158584r = r1
                r8.f158583q = r6
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto L4d
                return r0
            L4d:
                r9 = 0
                r8.f158584r = r9
                r8.f158583q = r5
                java.lang.Object r9 = r2.d(r1, r8)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r9 != r1) goto L5d
                goto L5f
            L5d:
                kotlin.G0 r9 = kotlin.G0.f406611a
            L5f:
                if (r9 != r0) goto L8e
                return r0
            L62:
                boolean r5 = r9 instanceof com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams.UpdateRequired
                if (r5 == 0) goto L81
                com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams$UpdateRequired r9 = (com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams.UpdateRequired) r9
                r8.f158583q = r4
                com.avito.android.forceupdate.domain.dto.UpdateSource r9 = r9.f158557b
                com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$OpenUpdateRequiredScreen r2 = new com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$OpenUpdateRequiredScreen
                r2.<init>(r9)
                java.lang.Object r9 = r1.emit(r2, r8)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r9 != r1) goto L7c
                goto L7e
            L7c:
                kotlin.G0 r9 = kotlin.G0.f406611a
            L7e:
                if (r9 != r0) goto L8e
                return r0
            L81:
                boolean r9 = r9 instanceof com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams.DeviceNotSupported
                if (r9 == 0) goto L8e
                r8.f158583q = r3
                java.lang.Object r9 = com.avito.android.forceupdate.screens.forceupdateroot.mvi.e.c(r2, r1, r8)
                if (r9 != r0) goto L8e
                return r0
            L8e:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdateroot.mvi.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k ForceUpdateRootOpenParams forceUpdateRootOpenParams) {
        this.f158582a = forceUpdateRootOpenParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.forceupdate.screens.forceupdateroot.mvi.e r4, kotlinx.coroutines.flow.InterfaceC43172j r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.forceupdate.screens.forceupdateroot.mvi.d
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.d r0 = (com.avito.android.forceupdate.screens.forceupdateroot.mvi.d) r0
            int r1 = r0.f158581t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f158581t = r1
            goto L1b
        L16:
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.d r0 = new com.avito.android.forceupdate.screens.forceupdateroot.mvi.d
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f158579r
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f158581t
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.C42729a0.b(r4)
            goto L5b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlinx.coroutines.flow.j r5 = r0.f158578q
            kotlin.C42729a0.b(r4)
            goto L4d
        L3d:
            kotlin.C42729a0.b(r4)
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$OpenMavInWebView r4 = com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction.OpenMavInWebView.f158590b
            r0.f158578q = r5
            r0.f158581t = r3
            java.lang.Object r4 = r5.emit(r4, r0)
            if (r4 != r6) goto L4d
            goto L5d
        L4d:
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$TrackWebViewGoToMavWithForceRedirect r4 = com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction.TrackWebViewGoToMavWithForceRedirect.f158599b
            r1 = 0
            r0.f158578q = r1
            r0.f158581t = r2
            java.lang.Object r4 = r5.emit(r4, r0)
            if (r4 != r6) goto L5b
            goto L5d
        L5b:
            kotlin.G0 r6 = kotlin.G0.f406611a
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdateroot.mvi.e.c(com.avito.android.forceupdate.screens.forceupdateroot.mvi.e, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ForceUpdateRootInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlinx.coroutines.flow.InterfaceC43172j r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.forceupdate.screens.forceupdateroot.mvi.f
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.f r0 = (com.avito.android.forceupdate.screens.forceupdateroot.mvi.f) r0
            int r1 = r0.f158603t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158603t = r1
            goto L18
        L13:
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.f r0 = new com.avito.android.forceupdate.screens.forceupdateroot.mvi.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f158601r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f158603t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlinx.coroutines.flow.j r6 = r0.f158600q
            kotlin.C42729a0.b(r7)
            goto L4a
        L3a:
            kotlin.C42729a0.b(r7)
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$ShowProposalDialog r7 = com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction.ShowProposalDialog.f158594b
            r0.f158600q = r6
            r0.f158603t = r4
            java.lang.Object r7 = r6.emit(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction$TrackShownDialog r7 = com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction.TrackShownDialog.f158598b
            r2 = 0
            r0.f158600q = r2
            r0.f158603t = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdateroot.mvi.e.d(kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
