package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.universal_map.map.di.InterfaceC35299e;
import com.avito.android.universal_map.map.di.InterfaceC35300f;
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
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FiltersUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/domain/b;", "Lcom/avito/android/universal_map/map_mvi/domain/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.universal_map.map_mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f306129a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f306130b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.pin_filters.a f306131c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.point_filters.a f306132d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f306133e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35318f f306134f;

    /* compiled from: FiltersUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.FiltersUseCaseImpl$invoke$1", f = "FiltersUseCase.kt", i = {0, 1}, l = {50, 52, 62, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306135q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f306136r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306138t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306139u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f306138t = map;
            this.f306139u = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f306138t, this.f306139u, continuation);
            aVar.f306136r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map_mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FiltersUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.FiltersUseCaseImpl$invoke$2", f = "FiltersUseCase.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.universal_map.map_mvi.domain.b$b, reason: collision with other inner class name */
    public static final class C9407b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UniversalMapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306140q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f306141r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f306142s;

        public C9407b(Continuation<? super C9407b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C9407b c9407b = b.this.new C9407b(continuation);
            c9407b.f306141r = interfaceC43172j;
            c9407b.f306142s = th2;
            return c9407b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306140q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f306141r;
                Throwable th2 = this.f306142s;
                b bVar = b.this;
                bVar.f306134f.f();
                UniversalMapInternalAction.FiltersInternalAction.FiltersError filtersError = new UniversalMapInternalAction.FiltersInternalAction.FiltersError(bVar.f306133e.a(th2));
                this.f306141r = null;
                this.f306140q = 1;
                if (interfaceC43172j.emit(filtersError, this) == coroutine_suspended) {
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
    public b(@InterfaceC35300f @Y61.l String str, @Y61.l @InterfaceC35299e Map<String, ? extends Object> map, @Y61.k com.avito.android.universal_map.map.pin_filters.a aVar, @Y61.k com.avito.android.universal_map.map_mvi.point_filters.a aVar2, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35318f interfaceC35318f) {
        this.f306129a = str;
        this.f306130b = map;
        this.f306131c = aVar;
        this.f306132d = aVar2;
        this.f306133e = fVar;
        this.f306134f = interfaceC35318f;
    }

    @Override // com.avito.android.universal_map.map_mvi.domain.a
    @Y61.k
    public final InterfaceC43160i<UniversalMapInternalAction> a(@Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Object> map2) {
        return new C43152f0(C43175k.G(new a(map, map2, null)), new C9407b(null));
    }
}
