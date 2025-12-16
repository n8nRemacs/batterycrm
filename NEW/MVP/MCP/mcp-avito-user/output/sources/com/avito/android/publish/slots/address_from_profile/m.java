package com.avito.android.publish.slots.address_from_profile;

import androidx.compose.runtime.internal.P;
import dl0.InterfaceC39749a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectAddressInListInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/m;", "Lcom/avito/android/publish/slots/address_from_profile/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f242846a;

    /* compiled from: SelectAddressInListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/slots/address_from_profile/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.SelectAddressInListInteractorImpl$getAddressListFlow$1", f = "SelectAddressInListInteractor.kt", i = {0}, l = {21, 22, 22}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super j>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242847q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f242848r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f242850t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f242850t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(this.f242850t, continuation);
            aVar.f242848r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super j> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f242847q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r6)
                goto L5d
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.f242848r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L51
            L25:
                java.lang.Object r1 = r5.f242848r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L42
            L2d:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f242848r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.publish.slots.address_from_profile.j$b r1 = com.avito.android.publish.slots.address_from_profile.j.b.f242841a
                r5.f242848r = r6
                r5.f242847q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r6
            L42:
                r5.f242848r = r1
                r5.f242847q = r3
                com.avito.android.publish.slots.address_from_profile.m r6 = com.avito.android.publish.slots.address_from_profile.m.this
                long r3 = r5.f242850t
                java.lang.Object r6 = r6.c(r3, r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                r3 = 0
                r5.f242848r = r3
                r5.f242847q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.address_from_profile.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public m(@Y61.k InterfaceC39749a interfaceC39749a) {
        this.f242846a = interfaceC39749a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.publish.slots.address_from_profile.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.publish.slots.address_from_profile.l
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.publish.slots.address_from_profile.l r0 = (com.avito.android.publish.slots.address_from_profile.l) r0
            int r1 = r0.f242845s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242845s = r1
            goto L18
        L13:
            com.avito.android.publish.slots.address_from_profile.l r0 = new com.avito.android.publish.slots.address_from_profile.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f242843q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242845s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f242845s = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            com.avito.android.publish.slots.address_from_profile.j r7 = (com.avito.android.publish.slots.address_from_profile.j) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.address_from_profile.m.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.publish.slots.address_from_profile.k
    @Y61.k
    public final InterfaceC43160i<j> b(long j12) {
        return C43175k.G(new a(j12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.avito.android.publish.slots.address_from_profile.n
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.publish.slots.address_from_profile.n r0 = (com.avito.android.publish.slots.address_from_profile.n) r0
            int r1 = r0.f242854t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242854t = r1
            goto L18
        L13:
            com.avito.android.publish.slots.address_from_profile.n r0 = new com.avito.android.publish.slots.address_from_profile.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f242852r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242854t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.remote.model.TypedResult r6 = r0.f242851q
            kotlin.C42729a0.b(r8)
            goto L59
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C42729a0.b(r8)
            goto L49
        L3a:
            kotlin.C42729a0.b(r8)
            r0.f242854t = r4
            dl0.a r8 = r5.f242846a
            r2 = 0
            java.lang.Object r8 = r8.c(r6, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            r6 = r8
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            r0.f242851q = r6
            r0.f242854t = r3
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r7 == 0) goto L69
            com.avito.android.publish.slots.address_from_profile.j$a r7 = new com.avito.android.publish.slots.address_from_profile.j$a
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r6 = r6.getError()
            r7.<init>(r6)
            goto L7a
        L69:
            boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r7 == 0) goto L7b
            com.avito.android.publish.slots.address_from_profile.j$c r7 = new com.avito.android.publish.slots.address_from_profile.j$c
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            kl0.a r6 = (kl0.C42710a) r6
            r7.<init>(r6)
        L7a:
            return r7
        L7b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.address_from_profile.m.c(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
