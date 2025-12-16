package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qG0.C47290a;

/* compiled from: PointsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.PointsActor$loadPins$1", f = "PointsActor.kt", i = {0, 1, 2, 3, 3, 4}, l = {58, 73, UpdateStatusCode.DialogButton.CONFIRM, 106, 107, 115}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "markerPin", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Marker.Pin f305352q;

    /* renamed from: r, reason: collision with root package name */
    public int f305353r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f305354s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C47290a f305355t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f305356u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305357v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f305358w;

    /* compiled from: PointsActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "action", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.PointsActor$loadPins$1$1$loadPointFlow$1", f = "PointsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<UniversalMapInternalAction, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f305359q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305360r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ j f305361s;

        /* compiled from: PointsActor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.PointsActor$loadPins$1$1$loadPointFlow$1$1", f = "PointsActor.kt", i = {0}, l = {89, 93}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        /* renamed from: com.avito.android.universal_map.map.mvi.actor.i$a$a, reason: collision with other inner class name */
        public static final class C9372a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f305362q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f305363r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ UniversalMapInternalAction f305364s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305365t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ j f305366u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9372a(UniversalMapInternalAction universalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e eVar, j jVar, Continuation<? super C9372a> continuation) {
                super(2, continuation);
                this.f305364s = universalMapInternalAction;
                this.f305365t = eVar;
                this.f305366u = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C9372a c9372a = new C9372a(this.f305364s, this.f305365t, this.f305366u, continuation);
                c9372a.f305363r = obj;
                return c9372a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C9372a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                InterfaceC43172j interfaceC43172j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f305362q;
                UniversalMapInternalAction universalMapInternalAction = this.f305364s;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    interfaceC43172j = (InterfaceC43172j) this.f305363r;
                    this.f305363r = interfaceC43172j;
                    this.f305362q = 1;
                    if (interfaceC43172j.emit(universalMapInternalAction, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        com.avito.android.beduin_shared.model.utils.a.a(this.f305366u.f305368b, ((UniversalMapInternalAction.PointsInternalAction.PinsChanged) universalMapInternalAction).f305539d);
                        return G0.f406611a;
                    }
                    interfaceC43172j = (InterfaceC43172j) this.f305363r;
                    C42729a0.b(obj);
                }
                UniversalPreselectMapPoint universalPreselectMapPoint = ((UniversalMapInternalAction.PointsInternalAction.PinsChanged) universalMapInternalAction).f305538c;
                if (universalPreselectMapPoint != null && this.f305365t.f305598e.f305587c) {
                    UniversalMapInternalAction.PointsInternalAction.UsedLegacySavedLocation usedLegacySavedLocation = new UniversalMapInternalAction.PointsInternalAction.UsedLegacySavedLocation(com.avito.android.universal_map.map.common.marker.i.a(universalPreselectMapPoint.getPin(), universalPreselectMapPoint.getZoomLevel()));
                    this.f305363r = null;
                    this.f305362q = 2;
                    if (interfaceC43172j.emit(usedLegacySavedLocation, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                com.avito.android.beduin_shared.model.utils.a.a(this.f305366u.f305368b, ((UniversalMapInternalAction.PointsInternalAction.PinsChanged) universalMapInternalAction).f305539d);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.universal_map.map.mvi.entity.e eVar, j jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f305360r = eVar;
            this.f305361s = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f305360r, this.f305361s, continuation);
            aVar.f305359q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(UniversalMapInternalAction universalMapInternalAction, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>> continuation) {
            return ((a) create(universalMapInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            UniversalMapInternalAction universalMapInternalAction = (UniversalMapInternalAction) this.f305359q;
            return universalMapInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.PinsChanged ? C43175k.G(new C9372a(universalMapInternalAction, this.f305360r, this.f305361s, null)) : new C43210w(universalMapInternalAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C47290a c47290a, j jVar, com.avito.android.universal_map.map.mvi.entity.e eVar, boolean z12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f305355t = c47290a;
        this.f305356u = jVar;
        this.f305357v = eVar;
        this.f305358w = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f305355t, this.f305356u, this.f305357v, this.f305358w, continuation);
        iVar.f305354s = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
