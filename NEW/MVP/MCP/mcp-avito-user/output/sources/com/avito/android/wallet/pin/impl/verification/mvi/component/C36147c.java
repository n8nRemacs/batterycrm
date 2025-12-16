package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationActor$process$$inlined$transform$1", f = "WalletPinVerificationActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.component.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36147c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinVerificationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329144q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329145r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C36146b f329146s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C36145a f329147t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.component.c$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<WalletPinVerificationInternalAction> f329148b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C36145a f329149c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationActor$process$$inlined$transform$1$1", f = "WalletPinVerificationActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.component.c$a$a, reason: collision with other inner class name */
        public static final class C10226a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f329150q;

            /* renamed from: r, reason: collision with root package name */
            public int f329151r;

            public C10226a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f329150q = obj;
                this.f329151r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C36145a c36145a) {
            this.f329149c = c36145a;
            this.f329148b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.wallet.pin.impl.verification.mvi.component.C36147c.a.C10226a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.wallet.pin.impl.verification.mvi.component.c$a$a r0 = (com.avito.android.wallet.pin.impl.verification.mvi.component.C36147c.a.C10226a) r0
                int r1 = r0.f329151r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f329151r = r1
                goto L18
            L13:
                com.avito.android.wallet.pin.impl.verification.mvi.component.c$a$a r0 = new com.avito.android.wallet.pin.impl.verification.mvi.component.c$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f329150q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f329151r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L96
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                kv.a r7 = (kv.C43501a) r7
                Ju.c r7 = r7.f413261b
                r0.f329151r = r3
                int r8 = com.avito.android.wallet.pin.impl.verification.mvi.component.C36145a.f329133f
                com.avito.android.wallet.pin.impl.verification.mvi.component.a r8 = r6.f329149c
                r8.getClass()
                boolean r2 = r7 instanceof com.avito.android.deep_linking.links.BeduinUniversalPageLink.b.C3987b
                if (r2 == 0) goto L91
                com.avito.android.deep_linking.links.BeduinUniversalPageLink$b$b r7 = (com.avito.android.deep_linking.links.BeduinUniversalPageLink.b.C3987b) r7
                java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f133046b
                java.lang.String r4 = "link"
                java.lang.Object r2 = r2.get(r4)
                boolean r4 = r2 instanceof java.lang.String
                r5 = 0
                if (r4 == 0) goto L57
                java.lang.String r2 = (java.lang.String) r2
                goto L58
            L57:
                r2 = r5
            L58:
                if (r2 == 0) goto L66
                com.avito.android.deep_linking.x r4 = r8.f329138e
                com.avito.android.deep_linking.links.DeepLink r2 = r4.b(r2)
                r4 = 6
                com.avito.android.deeplink_handler.handler.composite.a r8 = r8.f329137d
                com.avito.android.deeplink_handler.handler.b.a.a(r8, r2, r5, r5, r4)
            L66:
                java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f133046b
                java.lang.String r8 = "closeScreen"
                java.lang.Object r7 = r7.get(r8)
                boolean r8 = r7 instanceof java.lang.Boolean
                if (r8 == 0) goto L75
                r5 = r7
                java.lang.Boolean r5 = (java.lang.Boolean) r5
            L75:
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                boolean r7 = kotlin.jvm.internal.L.f(r5, r7)
                if (r7 == 0) goto L91
                com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction$Close r7 = com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction.Close.f329273b
                kotlinx.coroutines.flow.j<com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction> r8 = r6.f329148b
                java.lang.Object r7 = r8.emit(r7, r0)
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r7 != r8) goto L8e
                goto L93
            L8e:
                kotlin.G0 r7 = kotlin.G0.f406611a
                goto L93
            L91:
                kotlin.G0 r7 = kotlin.G0.f406611a
            L93:
                if (r7 != r1) goto L96
                return r1
            L96:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.verification.mvi.component.C36147c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36147c(C36146b c36146b, Continuation continuation, C36145a c36145a) {
        super(2, continuation);
        this.f329146s = c36146b;
        this.f329147t = c36145a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C36147c c36147c = new C36147c(this.f329146s, continuation, this.f329147t);
        c36147c.f329145r = obj;
        return c36147c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletPinVerificationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C36147c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329144q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f329145r, this.f329147t);
            this.f329144q = 1;
            if (this.f329146s.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
