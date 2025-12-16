package com.avito.android.map.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$$inlined$transform$1", f = "MapActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31613b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f185014q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f185015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f185016s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.map.mvi.b$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<MapInternalAction> f185017b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$$inlined$transform$1$1", f = "MapActor.kt", i = {0, 0, 1, 1}, l = {219, 221, 222}, m = "emit", n = {"internalAction", "$this$process_u24lambda_u241", "internalAction", "$this$process_u24lambda_u241"}, s = {"L$0", "L$1", "L$0", "L$1"})
        /* renamed from: com.avito.android.map.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C5433a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f185018q;

            /* renamed from: r, reason: collision with root package name */
            public int f185019r;

            /* renamed from: t, reason: collision with root package name */
            public MapInternalAction f185021t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f185022u;

            public C5433a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f185018q = obj;
                this.f185019r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f185017b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.map.mvi.C31613b.a.C5433a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.map.mvi.b$a$a r0 = (com.avito.android.map.mvi.C31613b.a.C5433a) r0
                int r1 = r0.f185019r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f185019r = r1
                goto L18
            L13:
                com.avito.android.map.mvi.b$a$a r0 = new com.avito.android.map.mvi.b$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f185018q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f185019r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L47
                if (r2 == r5) goto L3f
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.C42729a0.b(r8)
                goto L91
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                kotlinx.coroutines.flow.j r7 = r0.f185022u
                com.avito.android.map.mvi.entity.MapInternalAction r2 = r0.f185021t
                kotlin.C42729a0.b(r8)
                goto L7a
            L3f:
                kotlinx.coroutines.flow.j r7 = r0.f185022u
                com.avito.android.map.mvi.entity.MapInternalAction r2 = r0.f185021t
                kotlin.C42729a0.b(r8)
                goto L5d
            L47:
                kotlin.C42729a0.b(r8)
                com.avito.android.map.mvi.entity.MapInternalAction r7 = (com.avito.android.map.mvi.entity.MapInternalAction) r7
                r0.f185021t = r7
                kotlinx.coroutines.flow.j<com.avito.android.map.mvi.entity.MapInternalAction> r8 = r6.f185017b
                r0.f185022u = r8
                r0.f185019r = r5
                java.lang.Object r2 = r8.emit(r7, r0)
                if (r2 != r1) goto L5b
                return r1
            L5b:
                r2 = r7
                r7 = r8
            L5d:
                boolean r8 = r2 instanceof com.avito.android.map.mvi.entity.MapInternalAction.MarkersLoaded
                if (r8 == 0) goto L91
                r8 = r2
                com.avito.android.map.mvi.entity.MapInternalAction$MarkersLoaded r8 = (com.avito.android.map.mvi.entity.MapInternalAction.MarkersLoaded) r8
                com.google.android.gms.maps.model.LatLngBounds r8 = r8.f185098f
                if (r8 == 0) goto L91
                com.avito.android.map.mvi.entity.MapInternalAction$MapMoved r5 = new com.avito.android.map.mvi.entity.MapInternalAction$MapMoved
                r5.<init>(r8)
                r0.f185021t = r2
                r0.f185022u = r7
                r0.f185019r = r4
                java.lang.Object r8 = r7.emit(r5, r0)
                if (r8 != r1) goto L7a
                return r1
            L7a:
                com.avito.android.map.mvi.entity.MapInternalAction$ReloadInlines r8 = new com.avito.android.map.mvi.entity.MapInternalAction$ReloadInlines
                com.avito.android.map.mvi.entity.MapInternalAction$MarkersLoaded r2 = (com.avito.android.map.mvi.entity.MapInternalAction.MarkersLoaded) r2
                com.google.android.gms.maps.model.LatLngBounds r2 = r2.f185098f
                r8.<init>(r2)
                r2 = 0
                r0.f185021t = r2
                r0.f185022u = r2
                r0.f185019r = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L91
                return r1
            L91:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.C31613b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31613b(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f185016s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31613b c31613b = new C31613b(this.f185016s, continuation);
        c31613b.f185015r = obj;
        return c31613b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31613b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f185014q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f185015r);
            this.f185014q = 1;
            if (this.f185016s.collect(aVar, this) == coroutine_suspended) {
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
