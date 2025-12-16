package com.avito.android.publish;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.util.InterfaceC35745a5;
import dl0.InterfaceC39749a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.Util;

/* compiled from: PublishPriceAbuseInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/x0;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/w0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.x0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34152x0 extends androidx.view.M0 implements InterfaceC34150w0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f245789E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245790J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f245791K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f245792L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public String f245793M = "";

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public String f245794N = "";

    /* renamed from: O, reason: collision with root package name */
    public boolean f245795O;

    /* compiled from: PublishPriceAbuseInteractor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.PublishPriceAbuseInteractorImpl$checkPriceReductionAbuseIfNeeded$1", f = "PublishPriceAbuseInteractor.kt", i = {0}, l = {67, 82}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.publish.x0$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Boolean>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f245796q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f245797r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f245799t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f245799t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C34152x0.this.new a(this.f245799t, continuation);
            aVar.f245797r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Boolean> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00d4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                r16 = this;
                r8 = r16
                java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.f245796q
                r10 = 2
                r1 = 1
                r11 = 0
                com.avito.android.publish.x0 r12 = com.avito.android.publish.C34152x0.this
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L20
                if (r0 != r10) goto L18
                kotlin.C42729a0.b(r17)
                goto Ld5
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r8.f245797r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r17)
                r13 = r0
                r0 = r17
                goto L76
            L2b:
                kotlin.C42729a0.b(r17)
                java.lang.Object r0 = r8.f245797r
                r13 = r0
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                com.avito.android.Z0 r0 = r12.f245792L
                r0.getClass()
                kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.Z0.f67595D
                r3 = 21
                r2 = r2[r3]
                com.avito.android.A0$a r0 = r0.f67621x
                DE0.a r0 = r0.a()
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto Lc2
                java.lang.String r0 = r12.f245793M
                r2 = 0
                long r4 = okhttp3.internal.Util.toLongOrDefault(r0, r2)
                java.lang.String r0 = r12.f245794N
                long r6 = okhttp3.internal.Util.toLongOrDefault(r0, r2)
                java.lang.String r0 = r8.f245799t
                long r14 = okhttp3.internal.Util.toLongOrDefault(r0, r2)
                r8.f245797r = r13
                r8.f245796q = r1
                dl0.a r0 = r12.f245789E
                r1 = r4
                r3 = r6
                r5 = r14
                r7 = r16
                java.lang.Object r0 = r0.o(r1, r3, r5, r7)
                if (r0 != r9) goto L76
                return r9
            L76:
                com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
                boolean r1 = r0 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r1 == 0) goto Laa
                com.avito.android.remote.model.TypedResult$Success r0 = (com.avito.android.remote.model.TypedResult.Success) r0
                java.lang.Object r0 = r0.getResult()
                el0.a r0 = (el0.C40125a) r0
                com.avito.android.analytics.a r1 = r12.f245791K
                com.avito.android.analytics.statsd.y$a r14 = new com.avito.android.analytics.statsd.y$a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "itemPriceAbuse."
                r2.<init>(r3)
                boolean r3 = r0.getNeedConfirmation()
                r2.append(r3)
                java.lang.String r3 = r2.toString()
                r7 = 0
                r4 = 0
                r6 = 2
                r2 = r14
                r2.<init>(r3, r4, r6, r7)
                r1.c(r14)
                boolean r0 = r0.getNeedConfirmation()
                goto Lc3
            Laa:
                boolean r1 = r0 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r1 == 0) goto Lbc
                com.avito.android.remote.model.TypedResult$Error r0 = (com.avito.android.remote.model.TypedResult.Error) r0
                com.avito.android.remote.error.ApiError r1 = r0.getError()
                java.lang.Throwable r0 = r0.getCause()
                com.avito.android.util.C35936s.a(r1, r0)
                goto Lc2
            Lbc:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            Lc2:
                r0 = r11
            Lc3:
                r12.f245795O = r11
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                r1 = 0
                r8.f245797r = r1
                r8.f245796q = r10
                java.lang.Object r0 = r13.emit(r0, r8)
                if (r0 != r9) goto Ld5
                return r9
            Ld5:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.C34152x0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C34152x0(@Y61.k InterfaceC39749a interfaceC39749a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.Z0 z02) {
        this.f245789E = interfaceC39749a;
        this.f245790J = interfaceC35745a5;
        this.f245791K = interfaceC28373a;
        this.f245792L = z02;
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final boolean Ca() {
        return this.f245795O && !kotlin.jvm.internal.L.f(this.f245793M, this.f245794N);
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void Eb(@Y61.k String str) {
        this.f245795O = false;
        this.f245793M = str;
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final long e8() {
        return Util.toLongOrDefault(this.f245793M, 0L);
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void oc() {
        this.f245795O = true;
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final long qd() {
        return Util.toLongOrDefault(this.f245794N, 0L);
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void r3(@Y61.k String str) {
        this.f245794N = str;
        this.f245795O = true;
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> z9(@Y61.k String str) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new a(str, null))).S().u(new C32102w0(5)).z(this.f245790J.a());
    }
}
