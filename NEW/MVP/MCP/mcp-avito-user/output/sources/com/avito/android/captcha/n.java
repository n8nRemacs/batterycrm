package com.avito.android.captcha;

import Lj0.InterfaceC14403a;
import Mj0.InterfaceC14498a;
import com.avito.android.captcha.y;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: CaptchaInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/n;", "Lcom/avito/android/captcha/t;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14403a f115109a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14498a f115110b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.D f115111c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f115112d;

    /* compiled from: CaptchaInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/captcha/K;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/captcha/K;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.captcha.AvitoCaptchaInteractor$verifyToken$2", f = "CaptchaInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super K>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115113q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ y f115114r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n f115115s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, n nVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f115114r = yVar;
            this.f115115s = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f115114r, this.f115115s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super K> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115113q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return (K) obj;
                }
                if (i12 == 2) {
                    C42729a0.b(obj);
                    return (K) obj;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return (K) obj;
            }
            C42729a0.b(obj);
            y yVar = this.f115114r;
            boolean z12 = yVar instanceof y.c;
            n nVar = this.f115115s;
            if (z12) {
                this.f115113q = 1;
                obj = n.e(nVar, (y.c) yVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (K) obj;
            }
            if (yVar instanceof y.b) {
                this.f115113q = 2;
                obj = n.d(nVar, (y.b) yVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (K) obj;
            }
            if (!(yVar instanceof y.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f115113q = 3;
            obj = n.c(nVar, (y.a) yVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (K) obj;
        }
    }

    @Inject
    public n(@Y61.k InterfaceC14403a interfaceC14403a, @Y61.k InterfaceC14498a interfaceC14498a, @Y61.k com.avito.android.D d12, @Y61.k R0 r02) {
        this.f115109a = interfaceC14403a;
        this.f115110b = interfaceC14498a;
        this.f115111c = d12;
        this.f115112d = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.captcha.n r10, com.avito.android.captcha.y.a r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.avito.android.captcha.C29330k
            if (r0 == 0) goto L17
            r0 = r12
            com.avito.android.captcha.k r0 = (com.avito.android.captcha.C29330k) r0
            int r1 = r0.f115102s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f115102s = r1
        L15:
            r9 = r0
            goto L1d
        L17:
            com.avito.android.captcha.k r0 = new com.avito.android.captcha.k
            r0.<init>(r10, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r9.f115100q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f115102s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.C42729a0.b(r12)
            goto L7a
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.C42729a0.b(r12)
            goto L65
        L3d:
            kotlin.C42729a0.b(r12)
            com.avito.android.D r12 = r10.f115111c
            DE0.a r12 = r12.v()
            java.lang.Object r12 = r12.invoke()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6d
            java.lang.String r2 = r11.f115143a
            r9.f115102s = r3
            r5 = 0
            r6 = 0
            Mj0.a r1 = r10.f115110b
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L65
            goto L81
        L65:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            com.avito.android.captcha.K r10 = com.avito.android.captcha.L.a(r12)
        L6b:
            r0 = r10
            goto L81
        L6d:
            java.lang.String r11 = r11.f115143a
            r9.f115102s = r2
            Lj0.a r10 = r10.f115109a
            java.lang.Object r12 = r10.d(r11, r9)
            if (r12 != r0) goto L7a
            goto L81
        L7a:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            com.avito.android.captcha.K r10 = com.avito.android.captcha.L.b(r12)
            goto L6b
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.n.c(com.avito.android.captcha.n, com.avito.android.captcha.y$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.captcha.n r11, com.avito.android.captcha.y.b r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof com.avito.android.captcha.C29331l
            if (r0 == 0) goto L16
            r0 = r13
            com.avito.android.captcha.l r0 = (com.avito.android.captcha.C29331l) r0
            int r1 = r0.f115105s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f115105s = r1
            goto L1b
        L16:
            com.avito.android.captcha.l r0 = new com.avito.android.captcha.l
            r0.<init>(r11, r13)
        L1b:
            java.lang.Object r13 = r0.f115103q
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f115105s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.C42729a0.b(r13)
            goto L88
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.C42729a0.b(r13)
            goto L69
        L3b:
            kotlin.C42729a0.b(r13)
            com.avito.android.D r13 = r11.f115111c
            DE0.a r13 = r13.v()
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L71
            java.lang.String r13 = r12.f115144a
            r0.f115105s = r3
            java.lang.String r5 = r12.f115148e
            r6 = 0
            Mj0.a r1 = r11.f115110b
            r2 = 0
            java.lang.String r4 = r12.f115146c
            java.lang.String r7 = r12.f115145b
            java.lang.String r8 = r12.f115147d
            r3 = r13
            r9 = r0
            java.lang.Object r13 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r10) goto L69
            goto L8f
        L69:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            com.avito.android.captcha.K r11 = com.avito.android.captcha.L.a(r13)
        L6f:
            r10 = r11
            goto L8f
        L71:
            java.lang.String r13 = r12.f115144a
            r0.f115105s = r2
            java.lang.String r3 = r12.f115145b
            java.lang.String r4 = r12.f115146c
            Lj0.a r1 = r11.f115109a
            java.lang.String r5 = r12.f115147d
            java.lang.String r6 = r12.f115148e
            r2 = r13
            r7 = r0
            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r13 != r10) goto L88
            goto L8f
        L88:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            com.avito.android.captcha.K r11 = com.avito.android.captcha.L.b(r13)
            goto L6f
        L8f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.n.d(com.avito.android.captcha.n, com.avito.android.captcha.y$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.captcha.n r10, com.avito.android.captcha.y.c r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.avito.android.captcha.m
            if (r0 == 0) goto L17
            r0 = r12
            com.avito.android.captcha.m r0 = (com.avito.android.captcha.m) r0
            int r1 = r0.f115108s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f115108s = r1
        L15:
            r9 = r0
            goto L1d
        L17:
            com.avito.android.captcha.m r0 = new com.avito.android.captcha.m
            r0.<init>(r10, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r9.f115106q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f115108s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.C42729a0.b(r12)
            goto L7a
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.C42729a0.b(r12)
            goto L65
        L3d:
            kotlin.C42729a0.b(r12)
            com.avito.android.D r12 = r10.f115111c
            DE0.a r12 = r12.v()
            java.lang.Object r12 = r12.invoke()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6d
            java.lang.String r6 = r11.f115149a
            r9.f115108s = r3
            r4 = 0
            r5 = 0
            Mj0.a r1 = r10.f115110b
            r2 = 0
            r3 = 0
            r7 = 0
            r8 = 0
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L65
            goto L81
        L65:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            com.avito.android.captcha.K r10 = com.avito.android.captcha.L.a(r12)
        L6b:
            r0 = r10
            goto L81
        L6d:
            java.lang.String r11 = r11.f115149a
            r9.f115108s = r2
            Lj0.a r10 = r10.f115109a
            java.lang.Object r12 = r10.b(r11, r9)
            if (r12 != r0) goto L7a
            goto L81
        L7a:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            com.avito.android.captcha.K r10 = com.avito.android.captcha.L.b(r12)
            goto L6b
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.n.e(com.avito.android.captcha.n, com.avito.android.captcha.y$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.captcha.t
    @Y61.l
    public final Object a(boolean z12, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f115112d.a(), new C29329j(this, z12, null), suspendLambda);
    }

    @Override // com.avito.android.captcha.t
    @Y61.l
    public final Object b(@Y61.k y yVar, @Y61.k Continuation<? super K> continuation) {
        return C43259k.g(this.f115112d.a(), new a(yVar, this, null), continuation);
    }
}
