package com.avito.android.universal_map.map.pin_filters;

import Hq0.C14021c;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import tG0.InterfaceC48553b;
import uG0.C48896b;

/* compiled from: UniversalMapFiltersRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/e;", "Lcom/avito/android/universal_map/map/pin_filters/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.universal_map.map.pin_filters.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48553b> f305702a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f305703b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f305704c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35318f f305705d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f305706e;

    /* compiled from: UniversalMapFiltersRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LuG0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.pin_filters.UniversalMapFiltersRepositoryImpl$getFiltersMvi$2", f = "UniversalMapFiltersRepository.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C48896b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305707q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f305709s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f305710t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f305711u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkedHashMap linkedHashMap, Map map, String str, Continuation continuation) {
            super(2, continuation);
            this.f305709s = linkedHashMap;
            this.f305710t = map;
            this.f305711u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new a(this.f305709s, this.f305710t, this.f305711u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C48896b>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305707q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48553b interfaceC48553b = e.this.f305702a.get();
                A4 a42 = A4.f318516a;
                LinkedHashMap linkedHashMap = this.f305709s;
                a42.getClass();
                Map<String, String> mapH = A4.h(linkedHashMap, "extraParameters");
                Map<String, Object> mapC = this.f305710t;
                if (mapC == null) {
                    mapC = P0.c();
                }
                Map<String, String> mapH2 = A4.h(mapC, "checkedFilters");
                this.f305707q = 1;
                obj = interfaceC48553b.h(this.f305711u, mapH2, mapH, this);
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
    public e(@Y61.k h31.e<InterfaceC48553b> eVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35318f interfaceC35318f, @Y61.k R0 r02) {
        this.f305702a = eVar;
        this.f305703b = fVar;
        this.f305704c = interfaceC35745a5;
        this.f305705d = interfaceC35318f;
        this.f305706e = r02;
    }

    @Override // com.avito.android.universal_map.map.pin_filters.a
    @Y61.k
    public final O a(@Y61.k String str, @Y61.l Map map, @Y61.l Map map2, @Y61.l Map map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 == null) {
            map2 = P0.c();
        }
        linkedHashMap.putAll(map2);
        if (map == null) {
            map = P0.c();
        }
        linkedHashMap.putAll(map);
        return new F(new C14021c(this, linkedHashMap, map3, str)).x0(this.f305704c.a()).d0(b.f305699b).r0(P2.c.f318721a).m0(new c(this)).G(new d(this));
    }

    @Override // com.avito.android.universal_map.map.pin_filters.a
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Object> map2, @Y61.l Map<String, ? extends Object> map3, @Y61.k Continuation<? super TypedResult<C48896b>> continuation) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 == null) {
            map2 = P0.c();
        }
        linkedHashMap.putAll(map2);
        if (map == null) {
            map = P0.c();
        }
        linkedHashMap.putAll(map);
        return C43259k.g(this.f305706e.a(), new a(linkedHashMap, map3, str, null), continuation);
    }
}
