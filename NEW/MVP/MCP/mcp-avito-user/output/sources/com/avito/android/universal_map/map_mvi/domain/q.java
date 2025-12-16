package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.universal_map.map.di.InterfaceC35299e;
import com.avito.android.universal_map.map.di.InterfaceC35309o;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PointListUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/domain/q;", "Lcom/avito/android/universal_map/map_mvi/domain/p;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f306200a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f306201b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.pins.a f306202c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35318f f306203d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f306204e;

    /* compiled from: PointListUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.PointListUseCaseImpl$invoke$1", f = "PointListUseCase.kt", i = {0, 1, 2, 2, 3, 3, 4, 4, 5, 5}, l = {63, 64, 76, 77, 78, 79, 80, 92}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f306205A;

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f306206q;

        /* renamed from: r, reason: collision with root package name */
        public int f306207r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f306208s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f306210u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f306211v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Float f306212w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306213x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306214y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f306215z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AvitoMapPoint avitoMapPoint, AvitoMapPoint avitoMapPoint2, Float f12, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, boolean z12, boolean z13, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f306210u = avitoMapPoint;
            this.f306211v = avitoMapPoint2;
            this.f306212w = f12;
            this.f306213x = map;
            this.f306214y = map2;
            this.f306215z = z12;
            this.f306205A = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = q.this.new a(this.f306210u, this.f306211v, this.f306212w, this.f306213x, this.f306214y, this.f306215z, this.f306205A, continuation);
            aVar.f306208s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0119 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0188 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map_mvi.domain.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PointListUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.PointListUseCaseImpl$invoke$2", f = "PointListUseCase.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UniversalMapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306216q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f306217r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f306218s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f306220u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f306221v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f306222w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AvitoMapPoint avitoMapPoint, AvitoMapPoint avitoMapPoint2, boolean z12, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f306220u = avitoMapPoint;
            this.f306221v = avitoMapPoint2;
            this.f306222w = z12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            AvitoMapPoint avitoMapPoint = this.f306221v;
            boolean z12 = this.f306222w;
            b bVar = q.this.new b(this.f306220u, avitoMapPoint, z12, continuation);
            bVar.f306217r = interfaceC43172j;
            bVar.f306218s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306216q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f306217r;
                Throwable th2 = this.f306218s;
                q qVar = q.this;
                qVar.f306203d.d(this.f306220u, this.f306221v, this.f306222w);
                UniversalMapInternalAction.PointsInternalAction.PinsError pinsError = new UniversalMapInternalAction.PointsInternalAction.PinsError(qVar.f306204e.a(th2));
                this.f306217r = null;
                this.f306216q = 1;
                if (interfaceC43172j.emit(pinsError, this) == coroutine_suspended) {
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
    public q(@InterfaceC35309o @Y61.k String str, @InterfaceC35299e @Y61.k Map<String, ? extends Object> map, @Y61.k com.avito.android.universal_map.map_mvi.pins.a aVar, @Y61.k InterfaceC35318f interfaceC35318f, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f306200a = str;
        this.f306201b = map;
        this.f306202c = aVar;
        this.f306203d = interfaceC35318f;
        this.f306204e = fVar;
    }

    @Override // com.avito.android.universal_map.map_mvi.domain.p
    @Y61.k
    public final InterfaceC43160i<UniversalMapInternalAction> a(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k AvitoMapPoint avitoMapPoint2, @Y61.l Float f12, @Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Object> map2, boolean z12, boolean z13) {
        return new C43152f0(C43175k.G(new a(avitoMapPoint, avitoMapPoint2, f12, map, map2, z12, z13, null)), new b(avitoMapPoint, avitoMapPoint2, z12, null));
    }
}
