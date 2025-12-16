package com.avito.android.early_access_advert.feedback_screen.domain;

import Tx.InterfaceC15421a;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EarlyAccessAdvertFeedbackInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/domain/a;", "", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15421a f145656a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f145657b;

    /* compiled from: EarlyAccessAdvertFeedbackInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackInteractor$sendFeedback$1", f = "EarlyAccessAdvertFeedbackInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.early_access_advert.feedback_screen.domain.a$a, reason: collision with other inner class name */
    public static final class C4236a extends SuspendLambda implements p<InterfaceC43172j<? super EarlyAccessAdvertFeedbackInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145658q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f145659r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f145661t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f145662u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f145663v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4236a(String str, String str2, String str3, Continuation<? super C4236a> continuation) {
            super(2, continuation);
            this.f145661t = str;
            this.f145662u = str2;
            this.f145663v = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4236a c4236a = a.this.new C4236a(this.f145661t, this.f145662u, this.f145663v, continuation);
            c4236a.f145659r = obj;
            return c4236a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EarlyAccessAdvertFeedbackInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4236a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f145658q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C42729a0.b(r8)
                goto L92
            L22:
                java.lang.Object r1 = r7.f145659r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5c
            L2a:
                java.lang.Object r1 = r7.f145659r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L47
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f145659r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction$SendFeedbackLoading r1 = com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction.SendFeedbackLoading.f145695b
                r7.f145659r = r8
                r7.f145658q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r8
            L47:
                com.avito.android.early_access_advert.feedback_screen.domain.a r8 = com.avito.android.early_access_advert.feedback_screen.domain.a.this
                Tx.a r8 = r8.f145656a
                r7.f145659r = r1
                r7.f145658q = r4
                java.lang.String r4 = r7.f145662u
                java.lang.String r5 = r7.f145663v
                java.lang.String r6 = r7.f145661t
                java.lang.Object r8 = r8.a(r6, r4, r5, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult r8 = (com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult.Error
                r5 = 0
                if (r4 == 0) goto L81
                com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction$SendFeedbackError r2 = new com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction$SendFeedbackError
                com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult$Error r8 = (com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult.Error) r8
                java.lang.String r8 = r8.getMessage()
                if (r8 != 0) goto L6f
                java.lang.String r8 = ""
            L6f:
                com.avito.android.printable_text.PrintableText r8 = com.avito.android.printable_text.b.f(r8)
                r2.<init>(r8)
                r7.f145659r = r5
                r7.f145658q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L92
                return r0
            L81:
                boolean r8 = r8 instanceof com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult.Success
                if (r8 == 0) goto L92
                com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction$CloseScreen r8 = com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction.CloseScreen.f145689b
                r7.f145659r = r5
                r7.f145658q = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L92
                return r0
            L92:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.early_access_advert.feedback_screen.domain.a.C4236a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackInteractor$sendFeedback$2", f = "EarlyAccessAdvertFeedbackInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super EarlyAccessAdvertFeedbackInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145664q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f145665r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EarlyAccessAdvertFeedbackInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f145665r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145664q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f145665r;
                EarlyAccessAdvertFeedbackInternalAction.SendFeedbackError sendFeedbackError = new EarlyAccessAdvertFeedbackInternalAction.SendFeedbackError(com.avito.android.printable_text.b.c(R.string.early_access_advert_default_error_message, new Serializable[0]));
                this.f145664q = 1;
                if (interfaceC43172j.emit(sendFeedbackError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC15421a interfaceC15421a, @k R0 r02) {
        this.f145656a = interfaceC15421a;
        this.f145657b = r02;
    }

    @k
    public final InterfaceC43160i<EarlyAccessAdvertFeedbackInternalAction> a(@k String str, @k String str2, @k String str3) {
        return C43175k.I(this.f145657b.a(), new C43152f0(C43175k.G(new C4236a(str, str2, str3, null)), new b(3, null)));
    }
}
