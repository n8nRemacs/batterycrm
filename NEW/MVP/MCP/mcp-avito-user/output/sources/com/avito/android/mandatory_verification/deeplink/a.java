package com.avito.android.mandatory_verification.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mandatory_verification.deeplink.d;
import com.avito.android.util.R0;
import fv.C40483b;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import sv.C48421d;

/* compiled from: MandatoryVerificationDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/mandatory_verification/deeplink/MandatoryVerificationLink;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<MandatoryVerificationLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.mandatory_verification.b f184470g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f184471h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f184472i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mandatory_verification.deeplink.a$a, reason: collision with other inner class name */
    public static final class C5408a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f184473b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f184474c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mandatory_verification.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C5409a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f184475b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f184476c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.mandatory_verification.deeplink.MandatoryVerificationDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "MandatoryVerificationDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.mandatory_verification.deeplink.a$a$a$a, reason: collision with other inner class name */
            public static final class C5410a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f184477q;

                /* renamed from: r, reason: collision with root package name */
                public int f184478r;

                public C5410a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f184477q = obj;
                    this.f184478r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C5409a.this.emit(null, this);
                }
            }

            public C5409a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f184475b = interfaceC43172j;
                this.f184476c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.mandatory_verification.deeplink.a.C5408a.C5409a.C5410a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.mandatory_verification.deeplink.a$a$a$a r0 = (com.avito.android.mandatory_verification.deeplink.a.C5408a.C5409a.C5410a) r0
                    int r1 = r0.f184478r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f184478r = r1
                    goto L18
                L13:
                    com.avito.android.mandatory_verification.deeplink.a$a$a$a r0 = new com.avito.android.mandatory_verification.deeplink.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f184477q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f184478r
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
                    com.avito.android.mandatory_verification.deeplink.a r2 = r4.f184476c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f184478r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f184475b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.deeplink.a.C5408a.C5409a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C5408a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f184473b = interfaceC43160i;
            this.f184474c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f184473b).collect(new C5409a(interfaceC43172j, this.f184474c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: MandatoryVerificationDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            a aVar = (a) this.receiver;
            aVar.getClass();
            aVar.j(c47918a.f437156b == -1 ? d.b.f184485b : d.a.f184484b);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k R0 r02, @k com.avito.android.mandatory_verification.b bVar, @k a.b bVar2, @k a.InterfaceC4053a interfaceC4053a) {
        super(r02);
        this.f184470g = bVar;
        this.f184471h = bVar2;
        this.f184472i = interfaceC4053a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f184472i.J(this.f184470g.a(((MandatoryVerificationLink) deepLink).f184469b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new b(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new C5408a(C40483b.a(this.f184471h), this)), this.f134492f);
        return G0.f406611a;
    }
}
