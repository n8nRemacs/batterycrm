package com.avito.android.comfortable_deal.deeplink;

import Ip.C14141a;
import Wp.InterfaceC15788a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplink;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import rv.C47918a;

/* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/g;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealClientsDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.deeplink.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29466g extends com.avito.android.deeplink_handler.handler.base.coroutines.a<ComfortableDealClientsDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f121922g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f121923h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.b f121924i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.g f121925j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.i f121926k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15788a f121927l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f121928m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.clients.use_case.c f121929n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C14141a f121930o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C43238h f121931p;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.deeplink.g$a */
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f121932b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.deeplink.g$a$a, reason: collision with other inner class name */
        public static final class C3606a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f121933b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "ComfortableDealClientsDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.deeplink.g$a$a$a, reason: collision with other inner class name */
            public static final class C3607a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f121934q;

                /* renamed from: r, reason: collision with root package name */
                public int f121935r;

                public C3607a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f121934q = obj;
                    this.f121935r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3606a.this.emit(null, this);
                }
            }

            public C3606a(InterfaceC43172j interfaceC43172j) {
                this.f121933b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.comfortable_deal.deeplink.C29466g.a.C3606a.C3607a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.comfortable_deal.deeplink.g$a$a$a r0 = (com.avito.android.comfortable_deal.deeplink.C29466g.a.C3606a.C3607a) r0
                    int r1 = r0.f121935r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f121935r = r1
                    goto L18
                L13:
                    com.avito.android.comfortable_deal.deeplink.g$a$a$a r0 = new com.avito.android.comfortable_deal.deeplink.g$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f121934q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f121935r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
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
                    r2 = 23124(0x5a54, float:3.2404E-41)
                    if (r6 != r2) goto L48
                    r0.f121935r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f121933b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deeplink.C29466g.a.C3606a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f121932b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f121932b).collect(new C3606a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplinkHandler", f = "ComfortableDealClientsDeeplinkHandler.kt", i = {0}, l = {48, 51}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    /* renamed from: com.avito.android.comfortable_deal.deeplink.g$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C29466g f121937q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121938r;

        /* renamed from: t, reason: collision with root package name */
        public int f121940t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f121938r = obj;
            this.f121940t |= BeduinInputModel.MIN_TEXT_VERSION;
            return C29466g.this.n(this);
        }
    }

    /* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.deeplink.g$c */
    public /* synthetic */ class c implements InterfaceC43172j, kotlin.jvm.internal.D {
        public c() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objO;
            C47918a c47918a = (C47918a) obj;
            C29466g c29466g = C29466g.this;
            if (c47918a.f437156b == -1) {
                objO = c29466g.o(continuation);
                if (objO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objO = G0.f406611a;
                }
            } else {
                c29466g.f121925j.g(c29466g.d(), false);
                Intent intent = c47918a.f437157c;
                String stringExtra = intent != null ? intent.getStringExtra("sign_status") : null;
                if (!L.f(stringExtra, "cancelled") && L.f(stringExtra, PaymentStateKt.PAYMENT_STATE_FAILED)) {
                    String stringExtra2 = intent != null ? intent.getStringExtra("sign_msg") : null;
                    if (stringExtra2 != null) {
                        a.i.C4057a.d(c29466g.f121926k, com.avito.android.printable_text.b.f(stringExtra2), null, null, new f.c(new ApiError.UnknownError(stringExtra2, null, null, 6, null)), 0, ToastBarPosition.f181046d, null, null, 1966);
                    }
                    c29466g.j(ComfortableDealClientsDeeplink.a.b.f121846b);
                } else {
                    c29466g.j(ComfortableDealClientsDeeplink.a.C3601a.f121845b);
                }
                objO = G0.f406611a;
            }
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.H(2, C29466g.this, C29466g.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplinkHandler", f = "ComfortableDealClientsDeeplinkHandler.kt", i = {0}, l = {140}, m = "openClientsAndFinishFlowWithSuccess", n = {"this"}, s = {"L$0"})
    /* renamed from: com.avito.android.comfortable_deal.deeplink.g$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C29466g f121942q;

        /* renamed from: r, reason: collision with root package name */
        public a.InterfaceC4053a f121943r;

        /* renamed from: s, reason: collision with root package name */
        public InterfaceC15788a f121944s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f121945t;

        /* renamed from: v, reason: collision with root package name */
        public int f121947v;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f121945t = obj;
            this.f121947v |= BeduinInputModel.MIN_TEXT_VERSION;
            return C29466g.this.o(this);
        }
    }

    @Inject
    public C29466g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC15788a interfaceC15788a, @Y61.k com.avito.android.comfortable_deal.repository.a aVar2, @Y61.k com.avito.android.comfortable_deal.clients.use_case.c cVar, @Y61.k C14141a c14141a, @Y61.k R0 r02) {
        super(r02);
        this.f121922g = aVar;
        this.f121923h = interfaceC4053a;
        this.f121924i = bVar;
        this.f121925j = gVar;
        this.f121926k = iVar;
        this.f121927l = interfaceC15788a;
        this.f121928m = aVar2;
        this.f121929n = cVar;
        this.f121930o = c14141a;
        this.f121931p = U.a(r02.b());
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f121925j.g(d(), true);
        C43259k.d(this.f121931p, null, null, new C29465f(this, null), 3);
        return G0.f406611a;
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
            boolean r0 = r6 instanceof com.avito.android.comfortable_deal.deeplink.C29466g.b
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.comfortable_deal.deeplink.g$b r0 = (com.avito.android.comfortable_deal.deeplink.C29466g.b) r0
            int r1 = r0.f121940t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121940t = r1
            goto L1a
        L13:
            com.avito.android.comfortable_deal.deeplink.g$b r0 = new com.avito.android.comfortable_deal.deeplink.g$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f121938r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f121940t
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
            com.avito.android.comfortable_deal.deeplink.g r2 = r0.f121937q
            kotlin.C42729a0.b(r6)
            goto L49
        L3c:
            kotlin.C42729a0.b(r6)
            r0.f121937q = r5
            r0.f121940t = r4
            kotlin.G0 r6 = kotlin.G0.f406611a
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            com.avito.android.deeplink_handler.view.a$b r6 = r2.f121924i
            io.reactivex.rxjava3.internal.operators.observable.q0 r6 = r6.Q()
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.rx3.y.a(r6)
            com.avito.android.comfortable_deal.deeplink.g$a r4 = new com.avito.android.comfortable_deal.deeplink.g$a
            r4.<init>(r6)
            com.avito.android.comfortable_deal.deeplink.g$c r6 = new com.avito.android.comfortable_deal.deeplink.g$c
            r6.<init>()
            r2 = 0
            r0.f121937q = r2
            r0.f121940t = r3
            java.lang.Object r6 = r4.collect(r6, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deeplink.C29466g.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.comfortable_deal.deeplink.C29466g.d
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.comfortable_deal.deeplink.g$d r0 = (com.avito.android.comfortable_deal.deeplink.C29466g.d) r0
            int r1 = r0.f121947v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121947v = r1
            goto L18
        L13:
            com.avito.android.comfortable_deal.deeplink.g$d r0 = new com.avito.android.comfortable_deal.deeplink.g$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f121945t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f121947v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Wp.a r1 = r0.f121944s
            com.avito.android.deeplink_handler.view.a$a r2 = r0.f121943r
            com.avito.android.comfortable_deal.deeplink.g r0 = r0.f121942q
            kotlin.C42729a0.b(r7)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.C42729a0.b(r7)
            r0.f121942q = r6
            com.avito.android.deeplink_handler.view.a$a r2 = r6.f121923h
            r0.f121943r = r2
            Wp.a r7 = r6.f121927l
            r0.f121944s = r7
            r0.f121947v = r3
            com.avito.android.comfortable_deal.clients.model.RequestType r3 = com.avito.android.comfortable_deal.clients.model.RequestType.f120269c
            com.avito.android.comfortable_deal.clients.use_case.c r4 = r6.f121929n
            r5 = 0
            java.lang.Object r0 = r4.a(r3, r5, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r1 = r7
            r7 = r0
            r0 = r6
        L55:
            com.avito.android.comfortable_deal.clients.model.ClientsInfo r7 = (com.avito.android.comfortable_deal.clients.model.ClientsInfo) r7
            com.avito.android.comfortable_deal.clients.model.ClientsArguments r3 = new com.avito.android.comfortable_deal.clients.model.ClientsArguments
            r3.<init>(r7)
            android.content.Intent r7 = r1.a(r3)
            com.avito.android.deeplink_handler.view.a.InterfaceC4053a.C4054a.a(r2, r7)
            com.avito.android.deeplink_handler.view.a$g r7 = r0.f121925j
            com.avito.android.deeplink_handler.handler.bundle.a r1 = r0.d()
            r2 = 0
            r7.g(r1, r2)
            com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplink$a$c r7 = com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplink.a.c.f121847b
            r0.j(r7)
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deeplink.C29466g.o(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
