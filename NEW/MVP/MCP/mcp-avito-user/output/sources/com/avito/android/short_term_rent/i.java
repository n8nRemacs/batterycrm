package com.avito.android.short_term_rent;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.StrBookingPaymentLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
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

/* compiled from: StrBookingPaymentLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/i;", "Lev/a;", "Lcom/avito/android/deep_linking/links/StrBookingPaymentLink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends AbstractC40161a<StrBookingPaymentLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f282391f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f282392g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f282393h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f282394i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f282395b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f282396c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.short_term_rent.i$a$a, reason: collision with other inner class name */
        public static final class C8428a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f282397b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f282398c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.short_term_rent.StrBookingPaymentLinkHandler$onCreate$$inlined$filter$1$2", f = "StrBookingPaymentLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.short_term_rent.i$a$a$a, reason: collision with other inner class name */
            public static final class C8429a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f282399q;

                /* renamed from: r, reason: collision with root package name */
                public int f282400r;

                public C8429a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f282399q = obj;
                    this.f282400r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8428a.this.emit(null, this);
                }
            }

            public C8428a(InterfaceC43172j interfaceC43172j, i iVar) {
                this.f282397b = interfaceC43172j;
                this.f282398c = iVar;
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
                    boolean r0 = r6 instanceof com.avito.android.short_term_rent.i.a.C8428a.C8429a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.short_term_rent.i$a$a$a r0 = (com.avito.android.short_term_rent.i.a.C8428a.C8429a) r0
                    int r1 = r0.f282400r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f282400r = r1
                    goto L18
                L13:
                    com.avito.android.short_term_rent.i$a$a$a r0 = new com.avito.android.short_term_rent.i$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f282399q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f282400r
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
                    com.avito.android.short_term_rent.i r2 = r4.f282398c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f282400r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f282397b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.i.a.C8428a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, i iVar) {
            this.f282395b = interfaceC43160i;
            this.f282396c = iVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f282395b).collect(new C8428a(interfaceC43172j, this.f282396c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrBookingPaymentLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            DeepLink deepLink;
            i iVar = (i) this.receiver;
            iVar.getClass();
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("web_payment_final_deeplink_extra", DeepLink.class) : intent.getParcelableExtra("web_payment_final_deeplink_extra"));
            } else {
                deepLink = null;
            }
            iVar.j(new StrBookingPaymentLink.b(deepLink));
            return G0.f406611a;
        }
    }

    @Inject
    public i(@Y61.k a.b bVar, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k R0 r02) {
        this.f282391f = bVar;
        this.f282392g = interfaceC36134w1;
        this.f282393h = interfaceC4053a;
        this.f282394i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f282393h.J(this.f282392g.j(((StrBookingPaymentLink) deepLink).f133688b, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(2, this, i.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new a(y.a(this.f282391f.Q()), this)), this.f282394i);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f282394i, null);
    }
}
