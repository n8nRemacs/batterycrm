package com.avito.android.recall_me_v2.domain.scenario;

import To.InterfaceC15383a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.recall_me.domain.n;
import com.avito.android.remote.ConfirmPhoneResponse;
import com.avito.android.remote.RecallMeError;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMeCodeConfirmInteractor.kt */
@com.avito.android.code_check_public.g
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/domain/scenario/d;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f252059a;

    /* compiled from: RecallMeCodeConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recall_me_v2.domain.scenario.RecallMeCodeConfirmInteractor$confirm$1", f = "RecallMeCodeConfirmInteractor.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public d f252060q;

        /* renamed from: r, reason: collision with root package name */
        public int f252061r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f252062s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f252063t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d f252064u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f252065v;

        /* compiled from: RecallMeCodeConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/ConfirmPhoneResponse;", "response", "LTo/a;", "<anonymous>", "(Lcom/avito/android/remote/ConfirmPhoneResponse;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.recall_me_v2.domain.scenario.RecallMeCodeConfirmInteractor$confirm$1$result$1", f = "RecallMeCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.recall_me_v2.domain.scenario.d$a$a, reason: collision with other inner class name */
        public static final class C7562a extends SuspendLambda implements p<ConfirmPhoneResponse, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f252066q;

            public C7562a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C7562a c7562a = new C7562a(2, continuation);
                c7562a.f252066q = obj;
                return c7562a;
            }

            @Override // Y41.p
            public final Object invoke(ConfirmPhoneResponse confirmPhoneResponse, Continuation<? super InterfaceC15383a> continuation) {
                return ((C7562a) create(confirmPhoneResponse, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [To.b, kotlin.jvm.internal.w] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                String message;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                ConfirmPhoneResponse confirmPhoneResponse = (ConfirmPhoneResponse) this.f252066q;
                PrintableText printableTextF = 0;
                printableTextF = 0;
                if (confirmPhoneResponse.getSuccess()) {
                    return new InterfaceC15383a.C1082a(printableTextF, 1, printableTextF);
                }
                RecallMeError error = confirmPhoneResponse.getError();
                if (error != null && (message = error.getMessage()) != null) {
                    printableTextF = com.avito.android.printable_text.b.f(message);
                }
                return new InterfaceC15383a.c(printableTextF, null, null, 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, d dVar, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f252063t = str;
            this.f252064u = dVar;
            this.f252065v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f252063t, this.f252064u, this.f252065v, continuation);
            aVar.f252062s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f252061r
                r2 = 3
                r3 = 1
                r4 = 2
                r5 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                kotlin.C42729a0.b(r9)
                goto L83
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f252062s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L76
            L27:
                com.avito.android.recall_me_v2.domain.scenario.d r1 = r8.f252060q
                java.lang.Object r3 = r8.f252062s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r9)
                goto L5e
            L31:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f252062s
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                java.lang.String r1 = r8.f252063t
                if (r1 == 0) goto L41
                com.avito.android.code_check_public.model.Phone r6 = com.avito.android.code_check_public.model.Phone.a(r1)
                goto L42
            L41:
                r6 = r5
            L42:
                if (r6 == 0) goto L86
                com.avito.android.recall_me_v2.domain.scenario.d r6 = r8.f252064u
                com.avito.android.recall_me.domain.n r7 = r6.f252059a
                java.lang.String r1 = com.avito.android.code_check_public.model.Phone.b(r1)
                r8.f252062s = r9
                r8.f252060q = r6
                r8.f252061r = r3
                java.lang.String r3 = r8.f252065v
                java.lang.Object r1 = r7.c(r1, r3, r8)
                if (r1 != r0) goto L5b
                return r0
            L5b:
                r3 = r9
                r9 = r1
                r1 = r6
            L5e:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                com.avito.android.recall_me_v2.domain.scenario.d$a$a r6 = new com.avito.android.recall_me_v2.domain.scenario.d$a$a
                r6.<init>(r4, r5)
                r8.f252062s = r3
                r8.f252060q = r5
                r8.f252061r = r4
                r1.getClass()
                java.lang.Object r9 = com.avito.android.code_check_public.screen.c.b.b(r9, r6, r8)
                if (r9 != r0) goto L75
                return r0
            L75:
                r1 = r3
            L76:
                To.a r9 = (To.InterfaceC15383a) r9
                r8.f252062s = r5
                r8.f252061r = r2
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L83
                return r0
            L83:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            L86:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Phone must be set for RecallMeCodeConfirmInteractor"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.domain.scenario.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@k n nVar) {
        this.f252059a = nVar;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @k
    public final InterfaceC43160i<InterfaceC15383a> a(@k String str, @l String str2) {
        return C43175k.G(new a(str2, this, str, null));
    }
}
