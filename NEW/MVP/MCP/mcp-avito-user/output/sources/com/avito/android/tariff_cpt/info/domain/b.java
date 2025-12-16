package com.avito.android.tariff_cpt.info.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import uC0.InterfaceC48882a;

/* compiled from: CptInfoV2UseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/domain/b;", "Lcom/avito/android/tariff_cpt/info/domain/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff_cpt.info.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC48882a f298213a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f298214b;

    /* compiled from: CptInfoV2UseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_cpt.info.domain.CptInfoV2UseCaseImpl$execute$1", f = "CptInfoV2UseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 32, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f298215q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f298216r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f298217s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f298218t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f298219u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, b bVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f298217s = z12;
            this.f298218t = bVar;
            this.f298219u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f298217s, this.f298218t, this.f298219u, continuation);
            aVar.f298216r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f298215q
                java.lang.String r2 = r9.f298219u
                boolean r3 = r9.f298217s
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r1 == 0) goto L39
                if (r1 == r8) goto L31
                if (r1 == r7) goto L29
                if (r1 == r6) goto L24
                if (r1 == r5) goto L24
                if (r1 != r4) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                kotlin.C42729a0.b(r10)
                goto Lb5
            L29:
                java.lang.Object r1 = r9.f298216r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L62
            L31:
                java.lang.Object r1 = r9.f298216r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L53
            L39:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f298216r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                if (r3 != 0) goto L53
                com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Loading r10 = new com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Loading
                r10.<init>()
                r9.f298216r = r1
                r9.f298215q = r8
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L53
                return r0
            L53:
                com.avito.android.tariff_cpt.info.domain.b r10 = r9.f298218t
                uC0.a r10 = r10.f298213a
                r9.f298216r = r1
                r9.f298215q = r7
                java.lang.Object r10 = r10.a(r2, r9)
                if (r10 != r0) goto L62
                return r0
            L62:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r7 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                r8 = 0
                if (r7 == 0) goto L81
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                wC0.s r10 = (wC0.s) r10
                com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Content r3 = new com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Content
                r3.<init>(r10, r2)
                r9.f298216r = r8
                r9.f298215q = r6
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto Lb5
                return r0
            L81:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lb8
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                if (r3 == 0) goto La5
                com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Error$OnScreen r2 = new com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Error$OnScreen
                r2.<init>(r10, r8)
                r9.f298216r = r8
                r9.f298215q = r5
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lb5
                return r0
            La5:
                com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Error$Screen r2 = new com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction$Error$Screen
                r2.<init>(r10, r8)
                r9.f298216r = r8
                r9.f298215q = r4
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lb5
                return r0
            Lb5:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lb8:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_cpt.info.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC48882a interfaceC48882a, @k R0 r02) {
        this.f298213a = interfaceC48882a;
        this.f298214b = r02;
    }

    @Override // com.avito.android.tariff_cpt.info.domain.a
    @k
    public final InterfaceC43160i<CptInfoV2InternalAction> a(@l String str, boolean z12) {
        return C43175k.I(this.f298214b.a(), C43175k.G(new a(z12, this, str, null)));
    }
}
