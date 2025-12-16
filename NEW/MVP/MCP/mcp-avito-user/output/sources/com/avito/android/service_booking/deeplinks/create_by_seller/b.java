package com.avito.android.service_booking.deeplinks.create_by_seller;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.B2;
import com.avito.android.authorization.AuthSource;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47918a;

/* compiled from: ServiceBookingCreateBySellerLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create_by_seller/b;", "Lev/a;", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<ServiceBookingCreateBySellerLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f274215f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ServiceBookingFlowIntentFactory f274216g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f274217h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f274218i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final B2 f274219j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f274220k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.i f274221l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C43238h f274222m;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f274223b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f274224c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_booking.deeplinks.create_by_seller.b$a$a, reason: collision with other inner class name */
        public static final class C8140a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f274225b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f274226c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLinkHandler$onCreate$$inlined$filter$1$2", f = "ServiceBookingCreateBySellerLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking.deeplinks.create_by_seller.b$a$a$a, reason: collision with other inner class name */
            public static final class C8141a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f274227q;

                /* renamed from: r, reason: collision with root package name */
                public int f274228r;

                public C8141a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f274227q = obj;
                    this.f274228r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8140a.this.emit(null, this);
                }
            }

            public C8140a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f274225b = interfaceC43172j;
                this.f274226c = bVar;
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
                    boolean r0 = r6 instanceof com.avito.android.service_booking.deeplinks.create_by_seller.b.a.C8140a.C8141a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.service_booking.deeplinks.create_by_seller.b$a$a$a r0 = (com.avito.android.service_booking.deeplinks.create_by_seller.b.a.C8140a.C8141a) r0
                    int r1 = r0.f274228r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f274228r = r1
                    goto L18
                L13:
                    com.avito.android.service_booking.deeplinks.create_by_seller.b$a$a$a r0 = new com.avito.android.service_booking.deeplinks.create_by_seller.b$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f274227q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f274228r
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
                    com.avito.android.service_booking.deeplinks.create_by_seller.b r2 = r4.f274226c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f274228r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f274225b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.deeplinks.create_by_seller.b.a.C8140a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, b bVar) {
            this.f274223b = interfaceC43160i;
            this.f274224c = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f274223b).collect(new C8140a(interfaceC43172j, this.f274224c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingCreateBySellerLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLinkHandler$onCreate$2", f = "ServiceBookingCreateBySellerLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking.deeplinks.create_by_seller.b$b, reason: collision with other inner class name */
    public static final class C8142b extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f274230q;

        public C8142b(Continuation<? super C8142b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8142b c8142b = b.this.new C8142b(continuation);
            c8142b.f274230q = obj;
            return c8142b;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((C8142b) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f274230q
                rv.a r12 = (rv.C47918a) r12
                com.avito.android.service_booking.deeplinks.create_by_seller.b r0 = com.avito.android.service_booking.deeplinks.create_by_seller.b.this
                android.content.Intent r12 = r12.f437157c
                if (r12 == 0) goto L1a
                com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$a r1 = com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.f274177a
                r1.getClass()
                com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$Result r12 = com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.a.a(r12)
                goto L1b
            L1a:
                r12 = 0
            L1b:
                com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$Result$Cancel r1 = com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Cancel.f274178b
                boolean r1 = kotlin.jvm.internal.L.f(r12, r1)
                if (r1 == 0) goto L29
                com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink$b$a r12 = com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink.b.a.f274210b
                r0.j(r12)
                goto L86
            L29:
                boolean r1 = r12 instanceof com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Error
                if (r1 == 0) goto L51
                com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$Result$Error r12 = (com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Error) r12
                java.lang.String r12 = r12.f274180b
                com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.f(r12)
                com.avito.android.component.toast.f$c$a r12 = com.avito.android.component.toast.f.c.f125255c
                r12.getClass()
                com.avito.android.component.toast.f$c r5 = com.avito.android.component.toast.f.c.a.b()
                r8 = 0
                r9 = 0
                com.avito.android.deeplink_handler.view.a$i r1 = r0.f274221l
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r10 = 2030(0x7ee, float:2.845E-42)
                com.avito.android.deeplink_handler.view.a.i.C4057a.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink$b$a r12 = com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink.b.a.f274210b
                r0.j(r12)
                goto L86
            L51:
                boolean r1 = r12 instanceof com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Redirect
                if (r1 == 0) goto L81
                com.avito.android.B2 r1 = r0.f274219j
                r1.getClass()
                kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.B2.f67184X
                r3 = 0
                r2 = r2[r3]
                com.avito.android.A0$a r1 = r1.f67208b
                DE0.a r1 = r1.a()
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L81
                com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink$b$b r1 = com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink.b.C8139b.f274211b
                com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$Result$Redirect r12 = (com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Redirect) r12
                com.avito.android.deep_linking.links.DeepLink r12 = r12.f274181b
                com.avito.android.deep_linking.links.DeepLink[] r12 = new com.avito.android.deep_linking.links.DeepLink[]{r12}
                com.avito.android.deeplink_handler.handler.composite.a r2 = r0.f274220k
                r0.i(r1, r2, r12)
                goto L86
            L81:
                com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink$b$c r12 = com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink.b.c.f274212b
                r0.j(r12)
            L86:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.deeplinks.create_by_seller.b.C8142b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k ServiceBookingFlowIntentFactory serviceBookingFlowIntentFactory, @k C25719a c25719a, @k a.b bVar, @k B2 b22, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.i iVar, @k R0 r02) {
        this.f274215f = interfaceC4053a;
        this.f274216g = serviceBookingFlowIntentFactory;
        this.f274217h = c25719a;
        this.f274218i = bVar;
        this.f274219j = b22;
        this.f274220k = aVar;
        this.f274221l = iVar;
        this.f274222m = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingCreateBySellerLink serviceBookingCreateBySellerLink = (ServiceBookingCreateBySellerLink) deepLink;
        this.f274217h.a(serviceBookingCreateBySellerLink, this, AuthSource.f92669D, new com.avito.android.service_booking.deeplinks.create_by_seller.a(this, serviceBookingCreateBySellerLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C8142b(null), new a(y.a(this.f274218i.Q()), this)), this.f274222m);
    }
}
