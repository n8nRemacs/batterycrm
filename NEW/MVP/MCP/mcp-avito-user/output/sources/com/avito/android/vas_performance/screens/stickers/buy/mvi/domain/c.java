package com.avito.android.vas_performance.screens.stickers.buy.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Set;
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

/* compiled from: PostStickersContextUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/domain/c;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50482a f320717a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f320718b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f320719c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f320720d;

    /* compiled from: PostStickersContextUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.PostStickersContextUseCase$invoke$1", f = "PostStickersContextUseCase.kt", i = {0, 1, 2, 3}, l = {23, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super StickersBuyInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f320721q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f320722r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f320723s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Set<String> f320724t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f320725u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Set<String> set, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f320723s = i12;
            this.f320724t = set;
            this.f320725u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f320723s, this.f320724t, this.f320725u, continuation);
            aVar.f320722r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StickersBuyInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
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
                int r1 = r9.f320721q
                int r2 = r9.f320723s
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L3f
                if (r1 == r7) goto L37
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L26
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                kotlin.C42729a0.b(r10)
                goto Lc5
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f320722r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto Lb3
            L2f:
                java.lang.Object r1 = r9.f320722r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L77
            L37:
                java.lang.Object r1 = r9.f320722r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L57
            L3f:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f320722r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$ChangeButtonState r10 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$ChangeButtonState
                r10.<init>(r7, r2)
                r9.f320722r = r1
                r9.f320721q = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L57
                return r0
            L57:
                com.avito.android.util.A4 r10 = com.avito.android.util.A4.f318516a
                r10.getClass()
                java.util.Set<java.lang.String> r10 = r9.f320724t
                java.lang.String r7 = "stickerIds"
                java.util.HashMap r10 = com.avito.android.util.A4.g(r7, r10)
                com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.c r7 = r9.f320725u
                zL0.a r8 = r7.f320717a
                r9.f320722r = r1
                r9.f320721q = r6
                java.lang.String r6 = r7.f320719c
                java.lang.String r7 = r7.f320720d
                java.lang.Object r10 = r8.j(r6, r10, r7, r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 == 0) goto L99
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$OpenDeepLink r4 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$OpenDeepLink
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                com.avito.android.remote.model.DeepLinkResponse r10 = (com.avito.android.remote.model.DeepLinkResponse) r10
                com.avito.android.deep_linking.links.DeepLink r10 = r10.getDeepLink()
                r4.<init>(r10)
                r9.f320722r = r1
                r9.f320721q = r5
                java.lang.Object r10 = r1.emit(r4, r9)
                if (r10 != r0) goto Lb3
                return r0
            L99:
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r5 == 0) goto Lb3
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Error r5 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r10 = r10.getError()
                r5.<init>(r10)
                r9.f320722r = r1
                r9.f320721q = r4
                java.lang.Object r10 = r1.emit(r5, r9)
                if (r10 != r0) goto Lb3
                return r0
            Lb3:
                com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$ChangeButtonState r10 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction$ChangeButtonState
                r4 = 0
                r10.<init>(r4, r2)
                r2 = 0
                r9.f320722r = r2
                r9.f320721q = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k R0 r02, @LL0.a @k String str, @LL0.b @k String str2, @k InterfaceC50482a interfaceC50482a) {
        this.f320717a = interfaceC50482a;
        this.f320718b = r02;
        this.f320719c = str;
        this.f320720d = str2;
    }

    @k
    public final InterfaceC43160i<StickersBuyInternalAction> a(int i12, @k Set<String> set) {
        return C43175k.I(this.f320718b.a(), C43175k.G(new a(i12, set, this, null)));
    }
}
