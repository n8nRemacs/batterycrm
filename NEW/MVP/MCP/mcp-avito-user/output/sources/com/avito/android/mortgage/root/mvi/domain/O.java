package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.util.C35755b0;
import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UpsertRealtyObjectInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/O;", "Lcom/avito/android/mortgage/root/mvi/domain/N;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f203022a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f203023b;

    /* compiled from: UpsertRealtyObjectInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpsertRealtyObjectInteractorImpl$upsertDetailsAddress$1", f = "UpsertRealtyObjectInteractor.kt", i = {0, 1}, l = {137, 139, 149, 151}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203024q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203025r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203027t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f203028u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203027t = str;
            this.f203028u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = O.this.new a(this.f203027t, this.f203028u, continuation);
            aVar.f203025r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
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
                int r1 = r9.f203024q
                com.avito.android.mortgage.root.mvi.domain.O r2 = com.avito.android.mortgage.root.mvi.domain.O.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.C42729a0.b(r10)
                goto Lb5
            L25:
                java.lang.Object r1 = r9.f203025r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L69
            L2d:
                java.lang.Object r1 = r9.f203025r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L4d
            L35:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f203025r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted r1 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted
                r1.<init>()
                r9.f203025r = r10
                r9.f203024q = r6
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r10
            L4d:
                h31.e<i00.a> r10 = r2.f203022a
                java.lang.Object r10 = r10.get()
                i00.a r10 = (i00.InterfaceC41203a) r10
                o00.b r6 = new o00.b
                java.lang.String r8 = r9.f203028u
                r6.<init>(r8, r7, r7, r7)
                r9.f203025r = r1
                r9.f203024q = r5
                java.lang.String r5 = r9.f203027t
                java.lang.Object r10 = r10.h(r5, r6, r9)
                if (r10 != r0) goto L69
                return r0
            L69:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L8f
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                o00.a r10 = (o00.C44499a) r10
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted r3 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted
                java.util.List r10 = r10.a()
                java.util.Map r10 = com.avito.android.mortgage.root.mvi.domain.O.f(r2, r10)
                r3.<init>(r10)
                r9.f203025r = r7
                r9.f203024q = r4
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto Lb5
                return r0
            L8f:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lb8
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed r2 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed
                com.avito.android.remote.error.ApiError r10 = com.avito.android.error.z.n(r10)
                r2.<init>(r10)
                r9.f203025r = r7
                r9.f203024q = r3
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
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.O.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UpsertRealtyObjectInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpsertRealtyObjectInteractorImpl$upsertDetailsFirstField$1", f = "UpsertRealtyObjectInteractor.kt", i = {0, 1}, l = {103, 117, 127, 129}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203029q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203030r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ KZ.D f203031s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ O f203032t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f203033u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KZ.D d12, O o12, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f203031s = d12;
            this.f203032t = o12;
            this.f203033u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f203031s, this.f203032t, this.f203033u, continuation);
            bVar.f203030r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.O.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UpsertRealtyObjectInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpsertRealtyObjectInteractorImpl$upsertDetailsOption$1", f = "UpsertRealtyObjectInteractor.kt", i = {0, 1}, l = {81, 83, 93, 95}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203034q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203035r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203037t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ DetailsBlockOption.Type f203038u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, DetailsBlockOption.Type type, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f203037t = str;
            this.f203038u = type;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = O.this.new c(this.f203037t, this.f203038u, continuation);
            cVar.f203035r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f203034q
                com.avito.android.mortgage.root.mvi.domain.O r2 = com.avito.android.mortgage.root.mvi.domain.O.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                kotlin.C42729a0.b(r12)
                goto Lc4
            L25:
                java.lang.Object r1 = r11.f203035r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L78
            L2d:
                java.lang.Object r1 = r11.f203035r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L4d
            L35:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f203035r
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted r1 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted
                r1.<init>()
                r11.f203035r = r12
                r11.f203034q = r6
                java.lang.Object r1 = r12.emit(r1, r11)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r12
            L4d:
                h31.e<i00.a> r12 = r2.f203022a
                java.lang.Object r12 = r12.get()
                i00.a r12 = (i00.InterfaceC41203a) r12
                com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption$Type r6 = com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption.Type.f202759c
                com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption$Type r8 = r11.f203038u
                java.lang.String r9 = ""
                if (r8 != r6) goto L5f
                r6 = r9
                goto L60
            L5f:
                r6 = r7
            L60:
                com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption$Type r10 = com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption.Type.f202758b
                if (r8 != r10) goto L65
                goto L66
            L65:
                r9 = r7
            L66:
                o00.b r8 = new o00.b
                r8.<init>(r9, r7, r7, r6)
                r11.f203035r = r1
                r11.f203034q = r5
                java.lang.String r5 = r11.f203037t
                java.lang.Object r12 = r12.h(r5, r8, r11)
                if (r12 != r0) goto L78
                return r0
            L78:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r5 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L9e
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                o00.a r12 = (o00.C44499a) r12
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted r3 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted
                java.util.List r12 = r12.a()
                java.util.Map r12 = com.avito.android.mortgage.root.mvi.domain.O.f(r2, r12)
                r3.<init>(r12)
                r11.f203035r = r7
                r11.f203034q = r4
                java.lang.Object r12 = r1.emit(r3, r11)
                if (r12 != r0) goto Lc4
                return r0
            L9e:
                boolean r2 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc7
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r2 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r2, r12)
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed r2 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed
                com.avito.android.remote.error.ApiError r12 = com.avito.android.error.z.n(r12)
                r2.<init>(r12)
                r11.f203035r = r7
                r11.f203034q = r3
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto Lc4
                return r0
            Lc4:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Lc7:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.O.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UpsertRealtyObjectInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpsertRealtyObjectInteractorImpl$upsertDetailsSecondField$1", f = "UpsertRealtyObjectInteractor.kt", i = {0, 1}, l = {159, 161, 171, 173}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203039q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203040r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ O f203041s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203042t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ KZ.D f203043u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(KZ.D d12, O o12, String str, Continuation continuation) {
            super(2, continuation);
            this.f203041s = o12;
            this.f203042t = str;
            this.f203043u = d12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f203043u, this.f203041s, this.f203042t, continuation);
            dVar.f203040r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f203039q
                com.avito.android.mortgage.root.mvi.domain.O r2 = r10.f203041s
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.C42729a0.b(r11)
                goto Lce
            L25:
                java.lang.Object r1 = r10.f203040r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L82
            L2d:
                java.lang.Object r1 = r10.f203040r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4d
            L35:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f203040r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted r1 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted
                r1.<init>()
                r10.f203040r = r11
                r10.f203039q = r6
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r11
            L4d:
                h31.e<i00.a> r11 = r2.f203022a
                java.lang.Object r11 = r11.get()
                i00.a r11 = (i00.InterfaceC41203a) r11
                KZ.D r6 = r10.f203043u
                KZ.N r6 = r6.getDetails()
                KZ.P r6 = r6.getCostField()
                java.lang.Long r6 = r6.getValue()
                if (r6 == 0) goto L6a
                long r8 = r6.longValue()
                goto L6c
            L6a:
                r8 = 0
            L6c:
                o00.b r6 = new o00.b
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
                r6.<init>(r7, r8, r7, r7)
                r10.f203040r = r1
                r10.f203039q = r5
                java.lang.String r5 = r10.f203042t
                java.lang.Object r11 = r11.h(r5, r6, r10)
                if (r11 != r0) goto L82
                return r0
            L82:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r5 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto La8
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                o00.a r11 = (o00.C44499a) r11
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted r3 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted
                java.util.List r11 = r11.a()
                java.util.Map r11 = com.avito.android.mortgage.root.mvi.domain.O.f(r2, r11)
                r3.<init>(r11)
                r10.f203040r = r7
                r10.f203039q = r4
                java.lang.Object r11 = r1.emit(r3, r10)
                if (r11 != r0) goto Lce
                return r0
            La8:
                boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Ld1
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r2 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.ApiException r11 = com.avito.android.util.C35936s.a(r2, r11)
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed r2 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed
                com.avito.android.remote.error.ApiError r11 = com.avito.android.error.z.n(r11)
                r2.<init>(r11)
                r10.f203040r = r7
                r10.f203039q = r3
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lce
                return r0
            Lce:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Ld1:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.O.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UpsertRealtyObjectInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpsertRealtyObjectInteractorImpl$upsertIsAvitoItem$1", f = "UpsertRealtyObjectInteractor.kt", i = {0, 1}, l = {58, 60, 70, 72}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203044q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203045r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203047t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f203048u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z12, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f203047t = str;
            this.f203048u = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = O.this.new e(this.f203047t, this.f203048u, continuation);
            eVar.f203045r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f203044q
                com.avito.android.mortgage.root.mvi.domain.O r2 = com.avito.android.mortgage.root.mvi.domain.O.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.C42729a0.b(r11)
                goto Lbf
            L25:
                java.lang.Object r1 = r10.f203045r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L73
            L2d:
                java.lang.Object r1 = r10.f203045r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4d
            L35:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f203045r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted r1 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertStarted
                r1.<init>()
                r10.f203045r = r11
                r10.f203044q = r6
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r11
            L4d:
                h31.e<i00.a> r11 = r2.f203022a
                java.lang.Object r11 = r11.get()
                i00.a r11 = (i00.InterfaceC41203a) r11
                boolean r6 = r10.f203048u
                if (r6 != 0) goto L5c
                java.lang.String r8 = ""
                goto L5d
            L5c:
                r8 = r7
            L5d:
                o00.b r9 = new o00.b
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                r9.<init>(r7, r7, r6, r8)
                r10.f203045r = r1
                r10.f203044q = r5
                java.lang.String r5 = r10.f203047t
                java.lang.Object r11 = r11.h(r5, r9, r10)
                if (r11 != r0) goto L73
                return r0
            L73:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r5 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L99
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                o00.a r11 = (o00.C44499a) r11
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted r3 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertCompleted
                java.util.List r11 = r11.a()
                java.util.Map r11 = com.avito.android.mortgage.root.mvi.domain.O.f(r2, r11)
                r3.<init>(r11)
                r10.f203045r = r7
                r10.f203044q = r4
                java.lang.Object r11 = r1.emit(r3, r10)
                if (r11 != r0) goto Lbf
                return r0
            L99:
                boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc2
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r2 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.ApiException r11 = com.avito.android.util.C35936s.a(r2, r11)
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed r2 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$RealtyObjectUpsertFailed
                com.avito.android.remote.error.ApiError r11 = com.avito.android.error.z.n(r11)
                r2.<init>(r11)
                r10.f203045r = r7
                r10.f203044q = r3
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lbf
                return r0
            Lbf:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Lc2:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.O.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public O(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f203022a = eVar;
        this.f203023b = r02;
    }

    public static final Map f(O o12, List list) {
        o12.getClass();
        if (list == null) {
            return P0.c();
        }
        List list2 = list;
        int iF2 = P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list2) {
            linkedHashMap.put(((o00.c) obj).getFieldName(), obj);
        }
        LinkedHashMap linkedHashMapB = C35755b0.b(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMapB.size()));
        for (Map.Entry entry : linkedHashMapB.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((o00.c) entry.getValue()).getErrMessage());
        }
        return C35755b0.c(linkedHashMap2);
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.N
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str, boolean z12) {
        return C43175k.I(this.f203023b.a(), C43175k.G(new e(str, z12, null)));
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.N
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> b(@Y61.k String str, @Y61.k KZ.D d12) {
        return C43175k.I(this.f203023b.a(), C43175k.G(new b(d12, this, str, null)));
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.N
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> c(@Y61.k String str, @Y61.k DetailsBlockOption.Type type) {
        return C43175k.I(this.f203023b.a(), C43175k.G(new c(str, type, null)));
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.N
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> d(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f203023b.a(), C43175k.G(new a(str, str2, null)));
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.N
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> e(@Y61.k String str, @Y61.k KZ.D d12) {
        return C43175k.I(this.f203023b.a(), C43175k.G(new d(d12, this, str, null)));
    }
}
