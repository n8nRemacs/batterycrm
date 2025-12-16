package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.arch.mvi.a;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.mvi.entity.MapState;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qG0.C47290a;
import rG0.AbstractC47541a;

/* compiled from: MapViewActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/d;", "Lcom/avito/android/arch/mvi/a;", "LrG0/a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<AbstractC47541a.b, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.domain.k f305283a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.domain.f f305284b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalMapParams.MapSettings f305285c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305286d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f305287e;

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$10", f = "MapViewActor.kt", i = {0, 1, 2}, l = {177, 178, 184, 192}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305288q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305289r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC47541a.b f305290s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f305291t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305292u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation continuation, AbstractC47541a.b bVar) {
            super(2, continuation);
            this.f305290s = bVar;
            this.f305291t = dVar;
            this.f305292u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f305291t, this.f305292u, continuation, this.f305290s);
            aVar.f305289r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[RETURN] */
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
                int r1 = r9.f305288q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                rG0.a$b r6 = r9.f305290s
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L33
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                kotlin.C42729a0.b(r10)
                goto La7
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f305289r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L92
            L2b:
                java.lang.Object r1 = r9.f305289r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L78
            L33:
                java.lang.Object r1 = r9.f305289r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L58
            L3b:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f305289r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$PointInfoInternalAction$SelectedPinChanged r10 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$PointInfoInternalAction$SelectedPinChanged
                r7 = r6
                rG0.a$b$j r7 = (rG0.AbstractC47541a.b.j) r7
                com.avito.android.universal_map.map.common.marker.Marker$Pin r7 = r7.f429686a
                r10.<init>(r7)
                r9.f305289r = r1
                r9.f305288q = r5
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L58
                return r0
            L58:
                com.avito.android.universal_map.map.mvi.actor.d r10 = r9.f305291t
                com.avito.android.universal_map.map_mvi.domain.k r10 = r10.f305283a
                r7 = r6
                rG0.a$b$j r7 = (rG0.AbstractC47541a.b.j) r7
                com.avito.android.universal_map.map.common.marker.Marker$Pin r7 = r7.f429686a
                java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f304925e
                com.avito.android.universal_map.map.mvi.entity.e r8 = r9.f305292u
                com.avito.android.universal_map.map.mvi.entity.c r8 = r8.f305596c
                java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f305573b
                kotlinx.coroutines.flow.i r10 = r10.a(r7, r8)
                r9.f305289r = r1
                r9.f305288q = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto L78
                return r0
            L78:
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$MoveCameraToState r10 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$MoveCameraToState
                r4 = r6
                rG0.a$b$j r4 = (rG0.AbstractC47541a.b.j) r4
                com.avito.android.universal_map.map.common.marker.Marker$Pin r4 = r4.f429686a
                com.avito.android.avito_map.AvitoMapPoint r7 = r4.f304924d
                java.lang.Float r4 = r4.f304930j
                r8 = 0
                r10.<init>(r7, r8, r4, r5)
                r9.f305289r = r1
                r9.f305288q = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L92
                return r0
            L92:
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$MarkPinSelected r10 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$MarkPinSelected
                rG0.a$b$j r6 = (rG0.AbstractC47541a.b.j) r6
                com.avito.android.universal_map.map.common.marker.Marker$Pin r3 = r6.f429686a
                r10.<init>(r3)
                r3 = 0
                r9.f305289r = r3
                r9.f305288q = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto La7
                return r0
            La7:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$1", f = "MapViewActor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305293q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305294r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MapState f305295s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapState mapState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f305295s = mapState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f305295s, continuation);
            bVar.f305294r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            AvitoMapCameraPosition avitoMapCameraPosition;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305293q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f305294r;
                C47290a c47290a = this.f305295s.f305453f.f305462e;
                if (c47290a != null && (avitoMapCameraPosition = c47290a.f429134a) != null) {
                    UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState moveCameraToState = new UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState(avitoMapCameraPosition.getMapPoint(), false, Boxing.boxFloat(avitoMapCameraPosition.getZoomLevel()), false);
                    this.f305293q = 1;
                    if (interfaceC43172j.emit(moveCameraToState, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$2", f = "MapViewActor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305296q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305297r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AbstractC47541a.b f305299t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305300u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation continuation, AbstractC47541a.b bVar) {
            super(2, continuation);
            this.f305299t = bVar;
            this.f305300u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            AbstractC47541a.b bVar = this.f305299t;
            c cVar = d.this.new c(this.f305300u, continuation, bVar);
            cVar.f305297r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305296q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f305297r;
                Marker.Pin pin = ((AbstractC47541a.b.h) this.f305299t).f429684a;
                this.f305296q = 1;
                if (d.c(d.this, interfaceC43172j, pin, this.f305300u, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$3", f = "MapViewActor.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.universal_map.map.mvi.actor.d$d, reason: collision with other inner class name */
    public static final class C9371d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305301q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305302r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MapState f305303s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AbstractC47541a.b f305304t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9371d(MapState mapState, AbstractC47541a.b bVar, Continuation<? super C9371d> continuation) {
            super(2, continuation);
            this.f305303s = mapState;
            this.f305304t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C9371d c9371d = new C9371d(this.f305303s, this.f305304t, continuation);
            c9371d.f305302r = obj;
            return c9371d;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9371d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            AvitoMapCameraPosition avitoMapCameraPosition;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305301q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f305302r;
                C47290a c47290a = this.f305303s.f305453f.f305462e;
                UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState moveCameraToState = new UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState(((AbstractC47541a.b.C12362b) this.f305304t).f429677a.f304941d, true, Boxing.boxFloat(((c47290a == null || (avitoMapCameraPosition = c47290a.f429134a) == null) ? 12.0f : avitoMapCameraPosition.getZoomLevel()) + 2.0f), false);
                this.f305301q = 1;
                if (interfaceC43172j.emit(moveCameraToState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$4", f = "MapViewActor.kt", i = {0}, l = {80}, m = "invokeSuspend", n = {"locationSettings"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305305q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305306r;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = d.this.new e(continuation);
            eVar.f305306r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
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
                int r1 = r6.f305305q
                r2 = 0
                com.avito.android.universal_map.map.mvi.actor.d r3 = com.avito.android.universal_map.map.mvi.actor.d.this
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 != r4) goto L16
                java.lang.Object r0 = r6.f305306r
                com.avito.android.universal_map.UniversalMapParams$LocationSettings r0 = (com.avito.android.universal_map.UniversalMapParams.LocationSettings) r0
                kotlin.C42729a0.b(r7)
                goto L43
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f305306r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.universal_map.UniversalMapParams$MapSettings r1 = r3.f305285c
                if (r1 == 0) goto L2c
                com.avito.android.universal_map.UniversalMapParams$LocationSettings r1 = r1.f304751b
                goto L2d
            L2c:
                r1 = r2
            L2d:
                if (r1 == 0) goto L32
                boolean r5 = r1.f304749b
                goto L33
            L32:
                r5 = r4
            L33:
                if (r5 == 0) goto L44
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$RequestLocation r5 = com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction.RequestLocation.f305550b
                r6.f305306r = r1
                r6.f305305q = r4
                java.lang.Object r7 = r7.emit(r5, r6)
                if (r7 != r0) goto L42
                return r0
            L42:
                r0 = r1
            L43:
                r1 = r0
            L44:
                gj.b r7 = r3.f305286d
                if (r1 == 0) goto L4a
                java.util.List<com.avito.android.beduin_models.BeduinAction> r2 = r1.f304750c
            L4a:
                com.avito.android.beduin_shared.model.utils.a.a(r7, r2)
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$5", f = "MapViewActor.kt", i = {0, 0, 1, 1, 2, 2}, l = {95, 105, 115, 116}, m = "invokeSuspend", n = {"$this$flow", "it", "$this$flow", "it", "$this$flow", "markerPin"}, s = {"L$0", "L$3", "L$0", "L$3", "L$0", "L$3"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public d f305308q;

        /* renamed from: r, reason: collision with root package name */
        public com.avito.android.universal_map.map.mvi.entity.e f305309r;

        /* renamed from: s, reason: collision with root package name */
        public Object f305310s;

        /* renamed from: t, reason: collision with root package name */
        public int f305311t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f305312u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305313v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ d f305314w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.universal_map.map.mvi.entity.e eVar, d dVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f305313v = eVar;
            this.f305314w = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f305313v, this.f305314w, continuation);
            fVar.f305312u = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00d4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$6", f = "MapViewActor.kt", i = {0}, l = {122, 128}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305315q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305316r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305317s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f305317s = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f305317s, continuation);
            gVar.f305316r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f305315q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.C42729a0.b(r6)
                goto L53
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f305316r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L42
            L22:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f305316r
                r1 = r6
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.universal_map.map.mvi.entity.e r6 = r5.f305317s
                com.avito.android.universal_map.map.mvi.entity.MapState r6 = r6.f305599f
                com.avito.android.avito_map.AvitoMapBounds r6 = r6.f305451d
                if (r6 == 0) goto L53
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$MoveCameraToBounds r4 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$MoveCameraToBounds
                r4.<init>(r6)
                r5.f305316r = r1
                r5.f305315q = r3
                java.lang.Object r6 = r1.emit(r4, r5)
                if (r6 != r0) goto L42
                return r0
            L42:
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$FocusOnRegionChanged r6 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$FocusOnRegionChanged
                r3 = 0
                r6.<init>(r3)
                r5.f305316r = r3
                r5.f305315q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L53
                return r0
            L53:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$7", f = "MapViewActor.kt", i = {0, 0, 1, 1, 1}, l = {139, 142, 145, 154}, m = "invokeSuspend", n = {"$this$flow", "userLocation", "$this$flow", "userLocation", "specificLocationParams"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public rG0.c f305318q;

        /* renamed from: r, reason: collision with root package name */
        public BeduinShowSpecificLocationAction f305319r;

        /* renamed from: s, reason: collision with root package name */
        public int f305320s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f305321t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AbstractC47541a.b f305322u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305323v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ d f305324w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d dVar, com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation continuation, AbstractC47541a.b bVar) {
            super(2, continuation);
            this.f305322u = bVar;
            this.f305323v = eVar;
            this.f305324w = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f305324w, this.f305323v, continuation, this.f305322u);
            hVar.f305321t = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$8", f = "MapViewActor.kt", i = {0, 0, 1, 1}, l = {165, 166, 167}, m = "invokeSuspend", n = {"$this$flow", "userLocation", "$this$flow", "userLocation"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public rG0.c f305325q;

        /* renamed from: r, reason: collision with root package name */
        public int f305326r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f305327s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MapState f305328t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d f305329u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305330v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ AbstractC47541a.b f305331w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MapState mapState, d dVar, com.avito.android.universal_map.map.mvi.entity.e eVar, AbstractC47541a.b bVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f305328t = mapState;
            this.f305329u = dVar;
            this.f305330v = eVar;
            this.f305331w = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(this.f305328t, this.f305329u, this.f305330v, this.f305331w, continuation);
            iVar.f305327s = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f305326r
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L36
                if (r1 == r5) goto L2b
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.C42729a0.b(r14)
                goto L98
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                rG0.c r1 = r13.f305325q
                java.lang.Object r3 = r13.f305327s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r14)
                r7 = r1
                r6 = r3
                goto L80
            L2b:
                rG0.c r1 = r13.f305325q
                java.lang.Object r5 = r13.f305327s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r14)
                r14 = r5
                goto L6c
            L36:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f305327s
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                rG0.c r1 = new rG0.c
                com.avito.android.universal_map.map.mvi.entity.MapState r6 = r13.f305328t
                com.avito.android.remote.model.Coordinates r7 = r6.f305449b
                double r7 = r7.getLatitude()
                com.avito.android.remote.model.Coordinates r9 = r6.f305449b
                double r9 = r9.getLongitude()
                rG0.c r6 = r6.f305450c
                if (r6 != 0) goto L53
                r12 = r5
                goto L55
            L53:
                r6 = 0
                r12 = r6
            L55:
                r11 = 0
                r6 = r1
                r6.<init>(r7, r9, r11, r12)
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$UserLocationChanged r6 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$UserLocationChanged
                r6.<init>(r1)
                r13.f305327s = r14
                r13.f305325q = r1
                r13.f305326r = r5
                java.lang.Object r5 = r14.emit(r6, r13)
                if (r5 != r0) goto L6c
                return r0
            L6c:
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$SpecificLocationRequestParamsChanged r5 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$SpecificLocationRequestParamsChanged
                r5.<init>(r4)
                r13.f305327s = r14
                r13.f305325q = r1
                r13.f305326r = r3
                java.lang.Object r3 = r14.emit(r5, r13)
                if (r3 != r0) goto L7e
                return r0
            L7e:
                r6 = r14
                r7 = r1
            L80:
                rG0.a$b r14 = r13.f305331w
                rG0.a$b$n r14 = (rG0.AbstractC47541a.b.n) r14
                boolean r9 = r14.f429691a
                r13.f305327s = r4
                r13.f305325q = r4
                r13.f305326r = r2
                com.avito.android.universal_map.map.mvi.actor.d r5 = r13.f305329u
                com.avito.android.universal_map.map.mvi.entity.e r8 = r13.f305330v
                r10 = r13
                java.lang.Object r14 = com.avito.android.universal_map.map.mvi.actor.d.d(r5, r6, r7, r8, r9, r10)
                if (r14 != r0) goto L98
                return r0
            L98:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor$process$9", f = "MapViewActor.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305332q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305333r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MapState f305335t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305336u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MapState mapState, com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f305335t = mapState;
            this.f305336u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = d.this.new j(this.f305335t, this.f305336u, continuation);
            jVar.f305333r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305332q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f305333r;
                rG0.c cVar = this.f305335t.f305450c;
                this.f305332q = 1;
                if (d.d(d.this, interfaceC43172j, cVar, this.f305336u, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.universal_map.map_mvi.domain.k kVar, @Y61.k com.avito.android.universal_map.map_mvi.domain.f fVar, @Y61.l UniversalMapParams.MapSettings mapSettings, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k R0 r02) {
        this.f305283a = kVar;
        this.f305284b = fVar;
        this.f305285c = mapSettings;
        this.f305286d = interfaceC40691b;
        this.f305287e = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.universal_map.map.mvi.actor.d r11, kotlinx.coroutines.flow.InterfaceC43172j r12, com.avito.android.universal_map.map.common.marker.Marker.Pin r13, com.avito.android.universal_map.map.mvi.entity.e r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.c(com.avito.android.universal_map.map.mvi.actor.d, kotlinx.coroutines.flow.j, com.avito.android.universal_map.map.common.marker.Marker$Pin, com.avito.android.universal_map.map.mvi.entity.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.universal_map.map.mvi.actor.d r21, kotlinx.coroutines.flow.InterfaceC43172j r22, rG0.c r23, com.avito.android.universal_map.map.mvi.entity.e r24, boolean r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.d.d(com.avito.android.universal_map.map.mvi.actor.d, kotlinx.coroutines.flow.j, rG0.c, com.avito.android.universal_map.map.mvi.entity.e, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UniversalMapInternalAction> b(@Y61.k AbstractC47541a.b bVar, @Y61.k com.avito.android.universal_map.map.mvi.entity.e eVar) {
        boolean zEquals = bVar.equals(AbstractC47541a.b.e.f429680a);
        MapState mapState = eVar.f305599f;
        if (zEquals) {
            return C43175k.G(new b(mapState, null));
        }
        if (bVar instanceof AbstractC47541a.b.h) {
            return C43175k.G(new c(eVar, null, bVar));
        }
        if (bVar instanceof AbstractC47541a.b.C12362b) {
            return C43175k.G(new C9371d(mapState, bVar, null));
        }
        if (bVar instanceof AbstractC47541a.b.c) {
            return C43175k.I(this.f305287e.b(), C43175k.G(new e(null)));
        }
        if (bVar instanceof AbstractC47541a.b.g) {
            AbstractC47541a.b.g gVar = (AbstractC47541a.b.g) bVar;
            return new C43210w(new UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState(gVar.f429682a, false, gVar.f429683b, false));
        }
        if (bVar instanceof AbstractC47541a.b.i) {
            return C43175k.G(new f(eVar, this, null));
        }
        if (bVar instanceof AbstractC47541a.b.C12361a) {
            return C43175k.G(new g(eVar, null));
        }
        if (bVar instanceof AbstractC47541a.b.m) {
            return C43175k.G(new h(this, eVar, null, bVar));
        }
        if (bVar instanceof AbstractC47541a.b.n) {
            return C43175k.G(new i(mapState, this, eVar, bVar, null));
        }
        if (bVar instanceof AbstractC47541a.b.k) {
            return C43175k.G(new j(mapState, eVar, null));
        }
        if (bVar instanceof AbstractC47541a.b.d) {
            return new C43210w(UniversalMapInternalAction.MapViewInternalAction.MapCleared.f305503b);
        }
        if (bVar instanceof AbstractC47541a.b.j) {
            return C43175k.G(new a(this, eVar, null, bVar));
        }
        if (bVar instanceof AbstractC47541a.b.f ? true : bVar instanceof AbstractC47541a.b.l) {
            return C43175k.w();
        }
        throw new NoWhenBranchMatchedException();
    }
}
