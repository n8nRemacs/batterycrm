package com.avito.android.comfortable_deal.submitting.success.deeplink;

import Ju.InterfaceC14249c;
import Xp.InterfaceC17035a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
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
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
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

/* compiled from: SubmittingSuccessDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/deeplink/a;", "Lev/a;", "Lcom/avito/android/comfortable_deal/deeplink/SubmittingSuccessLink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<SubmittingSuccessLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f123383f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC17035a f123384g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f123385h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f123386i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.submitting.success.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3681a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f123387b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f123388c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.submitting.success.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C3682a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f123389b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f123390c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.comfortable_deal.submitting.success.deeplink.SubmittingSuccessDeeplinkHandler$onCreate$$inlined$filter$1$2", f = "SubmittingSuccessDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.submitting.success.deeplink.a$a$a$a, reason: collision with other inner class name */
            public static final class C3683a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f123391q;

                /* renamed from: r, reason: collision with root package name */
                public int f123392r;

                public C3683a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f123391q = obj;
                    this.f123392r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3682a.this.emit(null, this);
                }
            }

            public C3682a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f123389b = interfaceC43172j;
                this.f123390c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.comfortable_deal.submitting.success.deeplink.a.C3681a.C3682a.C3683a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.comfortable_deal.submitting.success.deeplink.a$a$a$a r0 = (com.avito.android.comfortable_deal.submitting.success.deeplink.a.C3681a.C3682a.C3683a) r0
                    int r1 = r0.f123392r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f123392r = r1
                    goto L18
                L13:
                    com.avito.android.comfortable_deal.submitting.success.deeplink.a$a$a$a r0 = new com.avito.android.comfortable_deal.submitting.success.deeplink.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f123391q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f123392r
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
                    com.avito.android.comfortable_deal.submitting.success.deeplink.a r2 = r4.f123390c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f123392r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f123389b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.submitting.success.deeplink.a.C3681a.C3682a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C3681a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f123387b = interfaceC43160i;
            this.f123388c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f123387b).collect(new C3682a(interfaceC43172j, this.f123388c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SubmittingSuccessDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            Intent intent;
            DeepLink deepLink;
            C47918a c47918a2 = c47918a;
            a aVar = (a) this.receiver;
            aVar.getClass();
            InterfaceC14249c.b c3605b = (c47918a2.f437156b != -1 || (intent = c47918a2.f437157c) == null || (deepLink = (DeepLink) intent.getParcelableExtra("bundle_key_deeplink.success")) == null) ? SubmittingSuccessLink.b.a.f121889b : new SubmittingSuccessLink.b.C3605b(deepLink);
            aVar.j(c3605b);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC17035a interfaceC17035a, @k a.b bVar, @k R0 r02) {
        this.f123383f = interfaceC4053a;
        this.f123384g = interfaceC17035a;
        this.f123385h = bVar;
        this.f123386i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f123383f.J(this.f123384g.a((SubmittingSuccessLink) deepLink), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new C3681a(y.a(this.f123385h.Q()), this)), this.f123386i);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f123386i, null);
    }
}
