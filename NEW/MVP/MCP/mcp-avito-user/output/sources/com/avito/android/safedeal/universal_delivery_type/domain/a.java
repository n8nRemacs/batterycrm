package com.avito.android.safedeal.universal_delivery_type.domain;

import Sn0.InterfaceC15206a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
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

/* compiled from: UniversalDeliveryTypeUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/domain/a;", "", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final UniversalDeliveryTypeParams f256618a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC15206a f256619b;

    /* compiled from: UniversalDeliveryTypeUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal.universal_delivery_type.domain.UniversalDeliveryTypeUseCase$invoke$1", f = "UniversalDeliveryTypeUseCase.kt", i = {0, 1}, l = {19, 20, 23, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.safedeal.universal_delivery_type.domain.a$a, reason: collision with other inner class name */
    public static final class C7689a extends SuspendLambda implements p<InterfaceC43172j<? super UniversalDeliveryTypeInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f256620q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f256621r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ UniversalDeliveryTypeParams f256623t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7689a(UniversalDeliveryTypeParams universalDeliveryTypeParams, Continuation<? super C7689a> continuation) {
            super(2, continuation);
            this.f256623t = universalDeliveryTypeParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7689a c7689a = a.this.new C7689a(this.f256623t, continuation);
            c7689a.f256621r = obj;
            return c7689a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalDeliveryTypeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7689a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
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
                int r1 = r6.f256620q
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
                goto L9b
            L22:
                java.lang.Object r1 = r6.f256621r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L58
            L2a:
                java.lang.Object r1 = r6.f256621r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L47
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f256621r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction$LoadingStarted r1 = com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction.LoadingStarted.f256672b
                r6.f256621r = r7
                r6.f256620q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r7
            L47:
                com.avito.android.safedeal.universal_delivery_type.domain.a r7 = com.avito.android.safedeal.universal_delivery_type.domain.a.this
                Sn0.a r7 = r7.f256619b
                r6.f256621r = r1
                r6.f256620q = r4
                com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams r4 = r6.f256623t
                java.lang.Object r7 = r7.a(r4, r6)
                if (r7 != r0) goto L58
                return r0
            L58:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                r5 = 0
                if (r4 == 0) goto L75
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction$LoadedError r2 = new com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction$LoadedError
                r2.<init>(r7)
                r6.f256621r = r5
                r6.f256620q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9b
                return r0
            L75:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L9b
                com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction$Loaded r3 = new com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction$Loaded
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r4 = r7.getResult()
                com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent r4 = (com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent) r4
                java.lang.Object r7 = r7.getResult()
                com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent r7 = (com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent) r7
                int r7 = r7.getSelectedTabIndex()
                r3.<init>(r4, r7)
                r6.f256621r = r5
                r6.f256620q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9b
                return r0
            L9b:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal.universal_delivery_type.domain.a.C7689a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k UniversalDeliveryTypeParams universalDeliveryTypeParams, @k InterfaceC15206a interfaceC15206a) {
        this.f256618a = universalDeliveryTypeParams;
        this.f256619b = interfaceC15206a;
    }

    @k
    public final InterfaceC43160i<UniversalDeliveryTypeInternalAction> a(@k UniversalDeliveryTypeParams universalDeliveryTypeParams) {
        return C43175k.G(new C7689a(universalDeliveryTypeParams, null));
    }
}
