package com.avito.android.str_booking.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Application;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_core.OpenSellerOrderBookingDeepLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47918a;

/* compiled from: OpenSellerOrderBookingLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/deeplink/e;", "Lev/a;", "Lcom/avito/android/str_core/OpenSellerOrderBookingDeepLink;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40161a<OpenSellerOrderBookingDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Application f285442f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f285443g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f285444h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f285445i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f285446j;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f285447b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f285448c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_booking.deeplink.e$a$a, reason: collision with other inner class name */
        public static final class C8544a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f285449b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f285450c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_booking.deeplink.OpenSellerOrderBookingLinkHandler$onCreate$$inlined$filter$1$2", f = "OpenSellerOrderBookingLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_booking.deeplink.e$a$a$a, reason: collision with other inner class name */
            public static final class C8545a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f285451q;

                /* renamed from: r, reason: collision with root package name */
                public int f285452r;

                public C8545a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f285451q = obj;
                    this.f285452r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8544a.this.emit(null, this);
                }
            }

            public C8544a(InterfaceC43172j interfaceC43172j, e eVar) {
                this.f285449b = interfaceC43172j;
                this.f285450c = eVar;
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
                    boolean r0 = r6 instanceof com.avito.android.str_booking.deeplink.e.a.C8544a.C8545a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_booking.deeplink.e$a$a$a r0 = (com.avito.android.str_booking.deeplink.e.a.C8544a.C8545a) r0
                    int r1 = r0.f285452r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f285452r = r1
                    goto L18
                L13:
                    com.avito.android.str_booking.deeplink.e$a$a$a r0 = new com.avito.android.str_booking.deeplink.e$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f285451q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f285452r
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
                    com.avito.android.str_booking.deeplink.e r2 = r4.f285450c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f285452r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f285449b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.deeplink.e.a.C8544a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, e eVar) {
            this.f285447b = interfaceC43160i;
            this.f285448c = eVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f285447b).collect(new C8544a(interfaceC43172j, this.f285448c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: OpenSellerOrderBookingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_booking.deeplink.OpenSellerOrderBookingLinkHandler$onCreate$2", f = "OpenSellerOrderBookingLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return e.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((b) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.j(OpenSellerOrderBookingDeepLink.c.f288529b);
            return G0.f406611a;
        }
    }

    @Inject
    public e(@k Application application, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k a.b bVar, @k R0 r02) {
        this.f285442f = application;
        this.f285443g = interfaceC4053a;
        this.f285444h = c25719a;
        this.f285445i = bVar;
        this.f285446j = U.a(r02.b().plus(t1.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OpenSellerOrderBookingDeepLink openSellerOrderBookingDeepLink = (OpenSellerOrderBookingDeepLink) deepLink;
        this.f285444h.b(openSellerOrderBookingDeepLink, this, null, new d(this, openSellerOrderBookingDeepLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(null), new a(y.a(this.f285445i.Q()), this)), this.f285446j);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f285446j, null);
    }
}
