package com.avito.android.universal_map.map_mvi.pins;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import h31.e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import tG0.InterfaceC48553b;

/* compiled from: UniversalMapPinsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/pins/b;", "Lcom/avito/android/universal_map/map_mvi/pins/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.universal_map.map_mvi.pins.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC48553b> f306229a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f306230b;

    /* compiled from: UniversalMapPinsRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointsRectResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.pins.UniversalMapPinsRepositoryImpl$getPointList$2", f = "UniversalMapPinsRepository.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<UniversalMapPointsRectResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306231q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f306233s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f306234t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306235u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306236v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306237w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f306238x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Float f306239y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AvitoMapPoint avitoMapPoint, AvitoMapPoint avitoMapPoint2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, String str, Float f12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f306233s = avitoMapPoint;
            this.f306234t = avitoMapPoint2;
            this.f306235u = map;
            this.f306236v = map2;
            this.f306237w = map3;
            this.f306238x = str;
            this.f306239y = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f306233s, this.f306234t, this.f306235u, this.f306236v, this.f306237w, this.f306238x, this.f306239y, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<UniversalMapPointsRectResult>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306231q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48553b interfaceC48553b = b.this.f306229a.get();
                AvitoMapPoint avitoMapPoint = this.f306233s;
                Map<String, Double> mapG = P0.g(new Q("topLeft[lat]", Double.valueOf(avitoMapPoint.getLatitude())), new Q("topLeft[lng]", Double.valueOf(avitoMapPoint.getLongitude())));
                AvitoMapPoint avitoMapPoint2 = this.f306234t;
                Map<String, Double> mapG2 = P0.g(new Q("bottomRight[lat]", Double.valueOf(avitoMapPoint2.getLatitude())), new Q("bottomRight[lng]", Double.valueOf(avitoMapPoint2.getLongitude())));
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(this.f306235u, "extraParameters");
                Map<String, Object> mapC = this.f306236v;
                if (mapC == null) {
                    mapC = P0.c();
                }
                Map<String, String> mapH2 = A4.h(mapC, "checkedFilters");
                Map<String, Object> mapC2 = this.f306237w;
                if (mapC2 == null) {
                    mapC2 = P0.c();
                }
                Map<String, String> mapH3 = A4.h(mapC2, "selectedPinParameters");
                this.f306231q = 1;
                obj = interfaceC48553b.c(this.f306238x, mapG, mapG2, mapH, mapH2, mapH3, this.f306239y, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public b(@k R0 r02, @k e eVar) {
        this.f306229a = eVar;
        this.f306230b = r02;
    }

    @Override // com.avito.android.universal_map.map_mvi.pins.a
    @l
    public final Object a(@k String str, @k AvitoMapPoint avitoMapPoint, @k AvitoMapPoint avitoMapPoint2, @l Float f12, @k Map<String, ? extends Object> map, @l Map<String, ? extends Object> map2, @l Map<String, ? extends Object> map3, @k Continuation<? super TypedResult<UniversalMapPointsRectResult>> continuation) {
        return C43259k.g(this.f306230b.a(), new a(avitoMapPoint, avitoMapPoint2, map, map2, map3, str, f12, null), continuation);
    }
}
