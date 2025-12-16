package com.avito.android.vas_performance.screens.stickers.buy.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zL0.InterfaceC50482a;

/* compiled from: GetStickersBuyUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/domain/a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50482a f320706a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f320707b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f320708c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f320709d;

    /* compiled from: GetStickersBuyUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.GetStickersBuyUseCase$invoke$1", f = "GetStickersBuyUseCase.kt", i = {0, 1}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C9937a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f320710q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f320711r;

        public C9937a(Continuation<? super C9937a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9937a c9937a = a.this.new C9937a(continuation);
            c9937a.f320711r = obj;
            return c9937a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9937a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f320710q
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
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L96
            L22:
                java.lang.Object r1 = r6.f320711r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5d
            L2a:
                java.lang.Object r1 = r6.f320711r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f320711r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Loading r1 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Loading
                r1.<init>()
                r6.f320711r = r7
                r6.f320710q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a r7 = com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a.this
                zL0.a r5 = r7.f320706a
                r6.f320711r = r1
                r6.f320710q = r4
                java.lang.String r4 = r7.f320708c
                java.lang.String r7 = r7.f320709d
                java.lang.Object r7 = r5.o(r4, r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7c
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Content r2 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Content
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                FL0.d r7 = (FL0.d) r7
                r2.<init>(r7)
                r6.f320711r = r5
                r6.f320710q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L96
                return r0
            L7c:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L96
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Error r3 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r3.<init>(r7)
                r6.f320711r = r5
                r6.f320710q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a.C9937a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k R0 r02, @LL0.a @k String str, @LL0.b @k String str2, @k InterfaceC50482a interfaceC50482a) {
        this.f320706a = interfaceC50482a;
        this.f320707b = r02;
        this.f320708c = str;
        this.f320709d = str2;
    }

    @k
    public final InterfaceC43160i<StickersBuyInternalAction> a() {
        return C43175k.I(this.f320707b.a(), C43175k.G(new C9937a(null)));
    }
}
