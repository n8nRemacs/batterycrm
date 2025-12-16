package com.avito.android.orders.feature.beduin_orders_list.mvi;

import Wi.b;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinOrdersBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWi/b$a;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "<anonymous>", "(LWi/b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.BeduinOrdersBootstrap$refreshScreenFlow$1", f = "BeduinOrdersBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class o extends SuspendLambda implements Y41.p<b.a, Continuation<? super InterfaceC43160i<? extends BeduinOrdersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f210130q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f210131r;

    /* compiled from: BeduinOrdersBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.BeduinOrdersBootstrap$refreshScreenFlow$1$1", f = "BeduinOrdersBootstrap.kt", i = {0, 1, 2, 3}, l = {116, 118, 123, 128, 131}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210132q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f210133r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ p f210134s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b.a f210135t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, b.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f210134s = pVar;
            this.f210135t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f210134s, this.f210135t, continuation);
            aVar.f210133r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BeduinOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:19:0x003f, B:28:0x0074, B:30:0x007a, B:33:0x0090, B:35:0x0094, B:25:0x0063), top: B:45:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:19:0x003f, B:28:0x0074, B:30:0x007a, B:33:0x0090, B:35:0x0094, B:25:0x0063), top: B:45:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, kotlinx.coroutines.flow.j] */
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
                int r1 = r9.f210132q
                r2 = 0
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                com.avito.android.orders.feature.beduin_orders_list.mvi.p r7 = r9.f210134s
                r8 = 1
                if (r1 == 0) goto L4b
                if (r1 == r8) goto L43
                if (r1 == r6) goto L3b
                if (r1 == r5) goto L30
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1f
                kotlin.C42729a0.b(r10)
                goto Lc9
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.f210133r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto Lb8
            L30:
                java.lang.Object r1 = r9.f210133r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L39
                goto Lb8
            L39:
                r10 = move-exception
                goto La2
            L3b:
                java.lang.Object r1 = r9.f210133r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L39
                goto L74
            L43:
                java.lang.Object r1 = r9.f210133r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L63
            L4b:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f210133r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshingScreenStateChanged r10 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshingScreenStateChanged
                r10.<init>(r8)
                r9.f210133r = r1
                r9.f210132q = r8
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L63
                return r0
            L63:
                com.avito.android.orders.feature.beduin_orders_list.data.a r10 = r7.f210139d     // Catch: java.lang.Throwable -> L39
                Wi.b$a r8 = r9.f210135t     // Catch: java.lang.Throwable -> L39
                java.util.LinkedHashMap r8 = r8.f18021a     // Catch: java.lang.Throwable -> L39
                r9.f210133r = r1     // Catch: java.lang.Throwable -> L39
                r9.f210132q = r6     // Catch: java.lang.Throwable -> L39
                java.lang.Object r10 = r10.a(r2, r8, r9)     // Catch: java.lang.Throwable -> L39
                if (r10 != r0) goto L74
                return r0
            L74:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10     // Catch: java.lang.Throwable -> L39
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Error     // Catch: java.lang.Throwable -> L39
                if (r6 == 0) goto L90
                com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshScreenFailed r6 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshScreenFailed     // Catch: java.lang.Throwable -> L39
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10     // Catch: java.lang.Throwable -> L39
                com.avito.android.remote.error.ApiError r10 = r10.getError()     // Catch: java.lang.Throwable -> L39
                r6.<init>(r10)     // Catch: java.lang.Throwable -> L39
                r9.f210133r = r1     // Catch: java.lang.Throwable -> L39
                r9.f210132q = r5     // Catch: java.lang.Throwable -> L39
                java.lang.Object r10 = r1.emit(r6, r9)     // Catch: java.lang.Throwable -> L39
                if (r10 != r0) goto Lb8
                return r0
            L90:
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success     // Catch: java.lang.Throwable -> L39
                if (r5 == 0) goto Lb8
                com.avito.android.orders.feature.beduin_orders_list.f r5 = r7.f210136a     // Catch: java.lang.Throwable -> L39
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10     // Catch: java.lang.Throwable -> L39
                java.lang.Object r10 = r10.getResult()     // Catch: java.lang.Throwable -> L39
                com.avito.android.orders.api.model.BeduinOrdersResponse r10 = (com.avito.android.orders.api.model.BeduinOrdersResponse) r10     // Catch: java.lang.Throwable -> L39
                a50.C19683a.a(r5, r10)     // Catch: java.lang.Throwable -> L39
                goto Lb8
            La2:
                com.avito.android.remote.error.f r5 = r7.f210140e
                com.avito.android.remote.error.ApiError r10 = r5.a(r10)
                com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshScreenFailed r5 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshScreenFailed
                r5.<init>(r10)
                r9.f210133r = r1
                r9.f210132q = r4
                java.lang.Object r10 = r1.emit(r5, r9)
                if (r10 != r0) goto Lb8
                return r0
            Lb8:
                com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshingScreenStateChanged r10 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$RefreshingScreenStateChanged
                r4 = 0
                r10.<init>(r4)
                r9.f210133r = r2
                r9.f210132q = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto Lc9
                return r0
            Lc9:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orders.feature.beduin_orders_list.mvi.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f210131r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f210131r, continuation);
        oVar.f210130q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(b.a aVar, Continuation<? super InterfaceC43160i<? extends BeduinOrdersInternalAction>> continuation) {
        return ((o) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43175k.G(new a(this.f210131r, (b.a) this.f210130q, null));
    }
}
