package com.avito.android.services_seller_subscription_payment.deeplinks;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentResultLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServicesSellerSubscriptionPaymentDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/deeplinks/a;", "Lev/a;", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink;", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<ServicesSellerSubscriptionPaymentLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f280453f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC36134w1 f280454g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f280455h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f280456i;

    /* compiled from: ServicesSellerSubscriptionPaymentDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.services_seller_subscription_payment.deeplinks.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8344a {
        static {
            int[] iArr = new int[ServicesSellerSubscriptionPaymentResultLink.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ServicesSellerSubscriptionPaymentResultLink.Status status = ServicesSellerSubscriptionPaymentResultLink.Status.f280449b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f280457b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f280458c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.services_seller_subscription_payment.deeplinks.a$b$a, reason: collision with other inner class name */
        public static final class C8345a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f280459b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f280460c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.services_seller_subscription_payment.deeplinks.ServicesSellerSubscriptionPaymentDeepLinkHandler$onCreate$$inlined$filter$1$2", f = "ServicesSellerSubscriptionPaymentDeepLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.services_seller_subscription_payment.deeplinks.a$b$a$a, reason: collision with other inner class name */
            public static final class C8346a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f280461q;

                /* renamed from: r, reason: collision with root package name */
                public int f280462r;

                public C8346a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f280461q = obj;
                    this.f280462r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8345a.this.emit(null, this);
                }
            }

            public C8345a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f280459b = interfaceC43172j;
                this.f280460c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.services_seller_subscription_payment.deeplinks.a.b.C8345a.C8346a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.services_seller_subscription_payment.deeplinks.a$b$a$a r0 = (com.avito.android.services_seller_subscription_payment.deeplinks.a.b.C8345a.C8346a) r0
                    int r1 = r0.f280462r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f280462r = r1
                    goto L18
                L13:
                    com.avito.android.services_seller_subscription_payment.deeplinks.a$b$a$a r0 = new com.avito.android.services_seller_subscription_payment.deeplinks.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f280461q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f280462r
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
                    com.avito.android.services_seller_subscription_payment.deeplinks.a r2 = r4.f280460c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f280462r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f280459b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_seller_subscription_payment.deeplinks.a.b.C8345a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f280457b = interfaceC43160i;
            this.f280458c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f280457b).collect(new C8345a(interfaceC43172j, this.f280458c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ServicesSellerSubscriptionPaymentDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            InterfaceC14249c.b c8343b;
            a aVar = (a) this.receiver;
            aVar.getClass();
            Intent intent = c47918a.f437157c;
            DeepLink deepLink = intent != null ? (DeepLink) intent.getParcelableExtra("web_payment_final_deeplink_extra") : null;
            if (deepLink != null && (deepLink instanceof ServicesSellerSubscriptionPaymentResultLink)) {
                ServicesSellerSubscriptionPaymentResultLink servicesSellerSubscriptionPaymentResultLink = (ServicesSellerSubscriptionPaymentResultLink) deepLink;
                int iOrdinal = servicesSellerSubscriptionPaymentResultLink.f280448c.ordinal();
                Uri uri = servicesSellerSubscriptionPaymentResultLink.f280447b;
                if (iOrdinal == 0) {
                    c8343b = new ServicesSellerSubscriptionPaymentLink.b.C8343b(uri);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c8343b = new ServicesSellerSubscriptionPaymentLink.b.a(uri);
                }
                aVar.j(c8343b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.b bVar, @k InterfaceC36134w1 interfaceC36134w1, @k a.InterfaceC4053a interfaceC4053a, @k R0 r02) {
        this.f280453f = bVar;
        this.f280454g = interfaceC36134w1;
        this.f280455h = interfaceC4053a;
        this.f280456i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f280455h.J(this.f280454g.j(((ServicesSellerSubscriptionPaymentLink) deepLink).f280443b, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new c(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new b(y.a(this.f280453f.Q()), this)), this.f280456i);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f280456i, null);
    }
}
