package com.avito.android.gig_apply.domain;

import LG.m;
import LG.n;
import LG.q;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfo;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfoV2;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotV7Response;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotWarningV3;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SupportButtonV4;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.Timer;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
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
import pH.k;

/* compiled from: GigSlotInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/domain/h;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HG.a f159676a;

    /* compiled from: GigSlotInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.domain.GigSlotInteractor$confirmSlot$1", f = "GigSlotInteractor.kt", i = {0}, l = {22, 23}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159677q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159678r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f159680t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159680t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = h.this.new a(this.f159680t, continuation);
            aVar.f159678r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159677q;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f159678r;
                HG.a aVar = hVar.f159676a;
                this.f159678r = interfaceC43172j;
                this.f159677q = 1;
                obj = aVar.d(this.f159680t, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f159678r;
                C42729a0.b(obj);
            }
            hVar.getClass();
            pH.k kVar = ((TypedResult) obj) instanceof TypedResult.Success ? k.c.f428378a : k.a.f428376a;
            this.f159678r = null;
            this.f159677q = 2;
            if (interfaceC43172j.emit(kVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.domain.GigSlotInteractor$requestSlotInfo$1", f = "GigSlotInteractor.kt", i = {0}, l = {17, 18}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159681q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159682r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f159684t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f159684t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = h.this.new b(this.f159684t, continuation);
            bVar.f159682r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objC;
            pH.k dVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159681q;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f159682r;
                HG.a aVar = hVar.f159676a;
                this.f159682r = interfaceC43172j;
                this.f159681q = 1;
                objC = aVar.c(this.f159684t, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f159682r;
                C42729a0.b(obj);
                objC = obj;
            }
            TypedResult typedResult = (TypedResult) objC;
            hVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                SlotV7Response slotV7Response = (SlotV7Response) ((TypedResult.Success) typedResult).getResult();
                n actionButtons = slotV7Response.getActionButtons();
                n confirmButtons = slotV7Response.getConfirmButtons();
                LG.c documents = slotV7Response.getDocuments();
                LG.d duties = slotV7Response.getDuties();
                String gigerEndTime = slotV7Response.getGigerEndTime();
                String gigerStartTime = slotV7Response.getGigerStartTime();
                LG.e header = slotV7Response.getHeader();
                SlotWarningV3 notification = slotV7Response.getNotification();
                String requirements = slotV7Response.getRequirements();
                String route = slotV7Response.getRoute();
                m shiftInfo = slotV7Response.getShiftInfo();
                SlotInfo slotInfo = slotV7Response.getSlotInfo();
                SlotInfoV2 slotInfoV2 = slotV7Response.getSlotInfoV2();
                SupportButtonV4 supportButton = slotV7Response.getSupportButton();
                Timer timer = slotV7Response.getTimer();
                q requisitesButton = slotV7Response.getRequisitesButton();
                LG.f mapView = slotV7Response.getMapView();
                m shiftInfo2 = slotV7Response.getShiftInfo();
                dVar = new k.d(actionButtons, confirmButtons, documents, duties, gigerEndTime, gigerStartTime, header, notification, requirements, route, shiftInfo, slotInfo, slotInfoV2, supportButton, timer, requisitesButton, mapView, shiftInfo2 != null ? shiftInfo2.getCustomerRulesWidget() : null, slotV7Response.getPaymentBanner(), slotV7Response.getPaymentInfo(), slotV7Response.getUxFeedback(), slotV7Response.getRouteDetail());
            } else {
                dVar = k.e.f428401a;
            }
            this.f159682r = null;
            this.f159681q = 2;
            if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k HG.a aVar) {
        this.f159676a = aVar;
    }

    @Y61.k
    public final InterfaceC43160i<pH.k> a(long j12) {
        return C43175k.G(new a(j12, null));
    }

    @Y61.k
    public final InterfaceC43160i<pH.k> b(long j12) {
        return C43175k.G(new b(j12, null));
    }
}
