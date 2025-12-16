package com.avito.android.verification.links.vtb;

import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.R0;
import com.avito.android.verification.links.vtb.k;
import com.avito.android.verification.verification_webview.VerificationWebViewResult;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;

/* compiled from: VerificationVTBAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/vtb/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/verification/links/vtb/VerificationVTBLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<VerificationVTBLink> {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f324685t = 0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f324686g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f324687h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.b f324688i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.open.a f324689j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.vtb.e f324690k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.storage.a f324691l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a.g f324692m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final a.i f324693n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final vM0.f f324694o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324695p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final g f324696q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final R0 f324697r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f324698s;

    /* compiled from: VerificationVTBAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/verification/links/vtb/c$a;", "", "<init>", "()V", "", "CODE_CHALLENGE_METHOD_S256", "Ljava/lang/String;", "KEY_APP_REDIRECT_URI", "KEY_CODE_CHALLENGE", "KEY_CODE_CHALLENGE_METHOD", "KEY_CODE_VERIFIER", "KEY_STATE_URI", "KEY_WEB_REDIRECT_URI", "VTB_APP_DOMAIN", "VTB_APP_REDIRECT_URL", "VTB_FINISH_PATH", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationVTBAsyncLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.verification.links.vtb.VerificationVTBAsyncLinkHandler", f = "VerificationVTBAsyncLinkHandler.kt", i = {0}, l = {63}, m = "handleSuccess", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public c f324699q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f324700r;

        /* renamed from: t, reason: collision with root package name */
        public int f324702t;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f324700r = obj;
            this.f324702t |= BeduinInputModel.MIN_TEXT_VERSION;
            int i12 = c.f324685t;
            return c.this.o(null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.vtb.c$c, reason: collision with other inner class name */
    public static final class C10044c implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f324703b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f324704c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.verification.links.vtb.c$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f324705b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f324706c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.verification.links.vtb.VerificationVTBAsyncLinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "VerificationVTBAsyncLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.verification.links.vtb.c$c$a$a, reason: collision with other inner class name */
            public static final class C10045a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f324707q;

                /* renamed from: r, reason: collision with root package name */
                public int f324708r;

                public C10045a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f324707q = obj;
                    this.f324708r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f324705b = interfaceC43172j;
                this.f324706c = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.verification.links.vtb.c.C10044c.a.C10045a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.verification.links.vtb.c$c$a$a r0 = (com.avito.android.verification.links.vtb.c.C10044c.a.C10045a) r0
                    int r1 = r0.f324708r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f324708r = r1
                    goto L18
                L13:
                    com.avito.android.verification.links.vtb.c$c$a$a r0 = new com.avito.android.verification.links.vtb.c$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f324707q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f324708r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.verification.links.vtb.c r2 = r4.f324706c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f324708r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f324705b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.vtb.c.C10044c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C10044c(InterfaceC43160i interfaceC43160i, c cVar) {
            this.f324703b = interfaceC43160i;
            this.f324704c = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f324703b).collect(new a(interfaceC43172j, this.f324704c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: VerificationVTBAsyncLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.verification.links.vtb.VerificationVTBAsyncLinkHandler", f = "VerificationVTBAsyncLinkHandler.kt", i = {0}, l = {50, 53}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public c f324710q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f324711r;

        /* renamed from: t, reason: collision with root package name */
        public int f324713t;

        public d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f324711r = obj;
            this.f324713t |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.n(this);
        }
    }

    /* compiled from: VerificationVTBAsyncLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e implements InterfaceC43172j, D {
        public e() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            VerificationWebViewResult verificationWebViewResult;
            Object objO;
            C47918a c47918a = (C47918a) obj;
            int i12 = c.f324685t;
            c cVar = c.this;
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                verificationWebViewResult = (VerificationWebViewResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationWebViewResult", VerificationWebViewResult.class) : intent.getParcelableExtra("verificationWebViewResult"));
            } else {
                verificationWebViewResult = null;
            }
            if (verificationWebViewResult instanceof VerificationWebViewResult.Success) {
                objO = cVar.o((VerificationWebViewResult.Success) verificationWebViewResult, continuation);
                if (objO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objO = G0.f406611a;
                }
            } else {
                if (verificationWebViewResult instanceof VerificationWebViewResult.Error) {
                    PrintableText f323383c = cVar.f324694o.getF323383c();
                    f.c.f125255c.getClass();
                    a.i.C4057a.d(cVar.f324693n, f323383c, null, null, f.c.a.b(), 0, null, null, null, 2030);
                    cVar.p("webview unknown error");
                    cVar.j(new k.a("webview error"));
                } else if (c47918a.f437156b == 0) {
                    cVar.j(new k.a(PaymentStateKt.PAYMENT_STATE_CANCELED));
                } else {
                    cVar.p("webview result is null");
                    cVar.j(new k.a("result is null"));
                }
                objO = G0.f406611a;
            }
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(2, c.this, c.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.verification.b bVar2, @Y61.k com.avito.android.verification.links.open.a aVar, @Y61.k com.avito.android.verification.links.vtb.e eVar, @Y61.k com.avito.android.verification.storage.a aVar2, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k vM0.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k g gVar2, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a) {
        super(r02);
        this.f324686g = bVar;
        this.f324687h = interfaceC4053a;
        this.f324688i = bVar2;
        this.f324689j = aVar;
        this.f324690k = eVar;
        this.f324691l = aVar2;
        this.f324692m = gVar;
        this.f324693n = iVar;
        this.f324694o = fVar;
        this.f324695p = aVar3;
        this.f324696q = gVar2;
        this.f324697r = r02;
        this.f324698s = interfaceC28373a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.avito.android.deep_linking.links.DeepLink r9, java.lang.String r10, android.os.Bundle r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.vtb.c.m(com.avito.android.deep_linking.links.DeepLink, java.lang.String, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.verification.links.vtb.c.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.verification.links.vtb.c$d r0 = (com.avito.android.verification.links.vtb.c.d) r0
            int r1 = r0.f324713t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324713t = r1
            goto L1a
        L13:
            com.avito.android.verification.links.vtb.c$d r0 = new com.avito.android.verification.links.vtb.c$d
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f324711r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f324713t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.C42729a0.b(r6)
            goto L69
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.avito.android.verification.links.vtb.c r2 = r0.f324710q
            kotlin.C42729a0.b(r6)
            goto L49
        L3c:
            kotlin.C42729a0.b(r6)
            r0.f324710q = r5
            r0.f324713t = r4
            kotlin.G0 r6 = kotlin.G0.f406611a
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            com.avito.android.deeplink_handler.view.a$b r6 = r2.f324686g
            io.reactivex.rxjava3.internal.operators.observable.q0 r6 = r6.Q()
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.rx3.y.a(r6)
            com.avito.android.verification.links.vtb.c$c r4 = new com.avito.android.verification.links.vtb.c$c
            r4.<init>(r6, r2)
            com.avito.android.verification.links.vtb.c$e r6 = new com.avito.android.verification.links.vtb.c$e
            r6.<init>()
            r2 = 0
            r0.f324710q = r2
            r0.f324713t = r3
            java.lang.Object r6 = r4.collect(r6, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.vtb.c.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:31:0x008b, B:33:0x0095, B:34:0x009b), top: B:52:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:31:0x008b, B:33:0x0095, B:34:0x009b), top: B:52:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.avito.android.verification.verification_webview.VerificationWebViewResult.Success r19, kotlin.coroutines.Continuation<? super kotlin.G0> r20) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.vtb.c.o(com.avito.android.verification.verification_webview.VerificationWebViewResult$Success, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p(String str) {
        this.f324698s.c(new com.avito.android.verification.links.vtb.b(String.valueOf(c()), str, false));
    }
}
