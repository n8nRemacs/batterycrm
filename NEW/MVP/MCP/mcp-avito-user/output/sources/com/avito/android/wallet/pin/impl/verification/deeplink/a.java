package com.avito.android.wallet.pin.impl.verification.deeplink;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.wallet.pin.impl.verification.WalletPinVerificationActivity;
import com.avito.android.wallet.pin.impl.verification.WalletPinVerificationActivityResultParams;
import com.avito.android.wallet.pin.impl.verification.deeplink.WalletPinVerificationLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
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
import sv.C48421d;

/* compiled from: WalletPinVerificationLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/deeplink/a;", "Lev/a;", "Lcom/avito/android/wallet/pin/impl/verification/deeplink/WalletPinVerificationLink;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40161a<WalletPinVerificationLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.pin.impl.verification.d f329051f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f329052g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f329053h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f329054i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.pin.impl.verification.deeplink.a$a, reason: collision with other inner class name */
    public static final class C10215a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f329055b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f329056c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.wallet.pin.impl.verification.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C10216a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f329057b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f329058c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.deeplink.WalletPinVerificationLinkHandler$onCreate$$inlined$filter$1$2", f = "WalletPinVerificationLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.wallet.pin.impl.verification.deeplink.a$a$a$a, reason: collision with other inner class name */
            public static final class C10217a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f329059q;

                /* renamed from: r, reason: collision with root package name */
                public int f329060r;

                public C10217a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f329059q = obj;
                    this.f329060r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10216a.this.emit(null, this);
                }
            }

            public C10216a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f329057b = interfaceC43172j;
                this.f329058c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.wallet.pin.impl.verification.deeplink.a.C10215a.C10216a.C10217a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.wallet.pin.impl.verification.deeplink.a$a$a$a r0 = (com.avito.android.wallet.pin.impl.verification.deeplink.a.C10215a.C10216a.C10217a) r0
                    int r1 = r0.f329060r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f329060r = r1
                    goto L18
                L13:
                    com.avito.android.wallet.pin.impl.verification.deeplink.a$a$a$a r0 = new com.avito.android.wallet.pin.impl.verification.deeplink.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f329059q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f329060r
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
                    com.avito.android.wallet.pin.impl.verification.deeplink.a r2 = r4.f329058c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f329060r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f329057b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.verification.deeplink.a.C10215a.C10216a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C10215a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f329055b = interfaceC43160i;
            this.f329056c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f329055b).collect(new C10216a(interfaceC43172j, this.f329056c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: WalletPinVerificationLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.deeplink.WalletPinVerificationLinkHandler$onCreate$2", f = "WalletPinVerificationLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f329062q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f329062q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((b) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            WalletPinVerificationActivityResultParams walletPinVerificationActivityResultParams;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47918a c47918a = (C47918a) this.f329062q;
            a aVar = a.this;
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                walletPinVerificationActivityResultParams = (WalletPinVerificationActivityResultParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("wallet_pin_verification_result_extra_params", WalletPinVerificationActivityResultParams.class) : intent.getParcelableExtra("wallet_pin_verification_result_extra_params"));
            } else {
                walletPinVerificationActivityResultParams = null;
            }
            if (walletPinVerificationActivityResultParams != null) {
                aVar.j(new WalletPinVerificationLink.b.a(walletPinVerificationActivityResultParams.f329043c, walletPinVerificationActivityResultParams.f329042b));
            } else {
                aVar.j(AbstractC14250d.c.f9171c);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.wallet.pin.impl.verification.d dVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k R0 r02) {
        this.f329051f = dVar;
        this.f329052g = interfaceC4053a;
        this.f329053h = bVar;
        this.f329054i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        com.avito.android.wallet.pin.impl.verification.d dVar = this.f329051f;
        dVar.getClass();
        Intent intent = new Intent(dVar.f329047a, (Class<?>) WalletPinVerificationActivity.class);
        intent.putExtra("key_content_url", ((WalletPinVerificationLink) deepLink).f329048b);
        this.f329052g.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(null), new C10215a(y.a(this.f329053h.Q()), this)), this.f329054i);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f329054i, null);
    }
}
