package com.avito.android.btob_business_trip.screens.common.interactors;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity.B2bBusinessTripInfoInternalAction;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction;
import com.avito.android.util.R0;
import java.util.List;
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
import uk.InterfaceC49068a;

/* compiled from: B2bBusinessTripInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/common/interactors/b;", "Lcom/avito/android/btob_business_trip/screens/common/interactors/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.btob_business_trip.screens.common.interactors.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49068a f107888a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f107889b;

    /* compiled from: B2bBusinessTripInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.btob_business_trip.screens.common.interactors.B2bBusinessTripInteractorImpl$getB2bBusinessTrip$1", f = "B2bBusinessTripInteractor.kt", i = {0, 1}, l = {30, 32, 34, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super B2bBusinessTripInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107890q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f107891r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f107891r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super B2bBusinessTripInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x019f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 468
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.common.interactors.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: B2bBusinessTripInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.btob_business_trip.screens.common.interactors.B2bBusinessTripInteractorImpl$sendChosenItems$1", f = "B2bBusinessTripInteractor.kt", i = {0, 1}, l = {53, 57, 59, 66}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.btob_business_trip.screens.common.interactors.b$b, reason: collision with other inner class name */
    public static final class C3226b extends SuspendLambda implements p<InterfaceC43172j<? super B2bBusinessTripSelectInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107893q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f107894r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<Long> f107895s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f107896t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3226b(List<Long> list, b bVar, Continuation<? super C3226b> continuation) {
            super(2, continuation);
            this.f107895s = list;
            this.f107896t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C3226b c3226b = new C3226b(this.f107895s, this.f107896t, continuation);
            c3226b.f107894r = obj;
            return c3226b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super B2bBusinessTripSelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3226b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
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
                int r1 = r11.f107893q
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
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                kotlin.C42729a0.b(r12)
                goto Ldd
            L22:
                java.lang.Object r1 = r11.f107894r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L5d
            L2a:
                java.lang.Object r1 = r11.f107894r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L47
            L32:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f107894r
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction$Loading r1 = com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction.Loading.f108217b
                r11.f107894r = r12
                r11.f107893q = r5
                java.lang.Object r1 = r12.emit(r1, r11)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r12
            L47:
                vk.d r12 = new vk.d
                java.util.List<java.lang.Long> r5 = r11.f107895s
                r12.<init>(r5)
                com.avito.android.btob_business_trip.screens.common.interactors.b r5 = r11.f107896t
                uk.a r5 = r5.f107888a
                r11.f107894r = r1
                r11.f107893q = r4
                java.lang.Object r12 = r5.b(r12, r11)
                if (r12 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r4 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto Lb3
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                vk.b r12 = (vk.C49340b) r12
                com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction$LoadInfoForSuccessScreen r2 = new com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction$LoadInfoForSuccessScreen
                com.avito.android.btob_business_trip.models.SuccessScreenInfo r4 = new com.avito.android.btob_business_trip.models.SuccessScreenInfo
                com.avito.android.btob_business_trip.models.ActionApi r6 = new com.avito.android.btob_business_trip.models.ActionApi
                vk.a r7 = r12.getAction()
                com.avito.android.deep_linking.links.DeepLink r7 = r7.getDeeplink()
                vk.a r8 = r12.getAction()
                java.lang.String r8 = r8.getText()
                r6.<init>(r7, r8)
                java.lang.String r7 = r12.getHeader()
                com.avito.android.remote.model.UniversalImage r8 = new com.avito.android.remote.model.UniversalImage
                vk.c r9 = r12.getImage()
                com.avito.android.remote.model.Image r9 = r9.getValue()
                vk.c r10 = r12.getImage()
                com.avito.android.remote.model.Image r10 = r10.getValueDark()
                r8.<init>(r9, r10)
                java.lang.String r12 = r12.getSubHeader()
                r4.<init>(r6, r7, r8, r12)
                r2.<init>(r4)
                r11.f107894r = r5
                r11.f107893q = r3
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto Ldd
                return r0
            Lb3:
                boolean r3 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Le0
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r3 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r3, r12)
                com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction$Error r3 = new com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction$Error
                java.lang.String r4 = com.avito.android.error.z.l(r12)
                com.avito.android.remote.error.ApiError r12 = com.avito.android.error.z.n(r12)
                r3.<init>(r12, r4)
                r11.f107894r = r5
                r11.f107893q = r2
                java.lang.Object r12 = r1.emit(r3, r11)
                if (r12 != r0) goto Ldd
                return r0
            Ldd:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Le0:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.common.interactors.b.C3226b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC49068a interfaceC49068a, @k R0 r02) {
        this.f107888a = interfaceC49068a;
        this.f107889b = r02;
    }

    @Override // com.avito.android.btob_business_trip.screens.common.interactors.a
    @k
    public final InterfaceC43160i<B2bBusinessTripSelectInternalAction> a(@k List<Long> list) {
        return C43175k.I(this.f107889b.a(), C43175k.G(new C3226b(list, this, null)));
    }

    @Override // com.avito.android.btob_business_trip.screens.common.interactors.a
    @k
    public final InterfaceC43160i<B2bBusinessTripInfoInternalAction> b() {
        return C43175k.I(this.f107889b.a(), C43175k.G(new a(null)));
    }
}
