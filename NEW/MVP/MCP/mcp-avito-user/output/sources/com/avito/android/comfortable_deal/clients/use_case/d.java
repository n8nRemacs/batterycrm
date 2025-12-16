package com.avito.android.comfortable_deal.clients.use_case;

import Y41.p;
import Y61.l;
import com.avito.android.comfortable_deal.clients.model.ClientsInfo;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import dp.j;
import dp.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kp.C43477c;

/* compiled from: RequestsCountUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/comfortable_deal/clients/model/ClientsInfo;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/comfortable_deal/clients/model/ClientsInfo;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.use_case.RequestsCountUseCase$invoke$2", f = "RequestsCountUseCase.kt", i = {0, 0, 0}, l = {48}, m = "invokeSuspend", n = {"firstPage", "mortgageLink", "counts"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super ClientsInfo>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f120440q;

    /* renamed from: r, reason: collision with root package name */
    public LinkedHashMap f120441r;

    /* renamed from: s, reason: collision with root package name */
    public int f120442s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f120443t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RequestType f120444u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f120445v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C43477c f120446w;

    /* compiled from: RequestsCountUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.use_case.RequestsCountUseCase$invoke$2$1$1", f = "RequestsCountUseCase.kt", i = {}, l = {35, 37}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f120447q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ RequestType f120448r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RequestType f120449s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f120450t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C43477c f120451u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f120452v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ l0.h<List<ClientCardData>> f120453w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ l0.h<DeepLink> f120454x;

        /* compiled from: RequestsCountUseCase.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.use_case.RequestsCountUseCase$invoke$2$1$1$1$1", f = "RequestsCountUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.comfortable_deal.clients.use_case.d$a$a, reason: collision with other inner class name */
        public static final class C3539a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ LinkedHashMap f120455q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ RequestType f120456r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ k<ClientCardData> f120457s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ RequestType f120458t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ l0.h<List<ClientCardData>> f120459u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l0.h<DeepLink> f120460v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ DeepLink f120461w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3539a(LinkedHashMap linkedHashMap, RequestType requestType, k kVar, RequestType requestType2, l0.h hVar, l0.h hVar2, DeepLink deepLink, Continuation continuation) {
                super(2, continuation);
                this.f120455q = linkedHashMap;
                this.f120456r = requestType;
                this.f120457s = kVar;
                this.f120458t = requestType2;
                this.f120459u = hVar;
                this.f120460v = hVar2;
                this.f120461w = deepLink;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                l0.h<DeepLink> hVar = this.f120460v;
                return new C3539a(this.f120455q, this.f120456r, this.f120457s, this.f120458t, this.f120459u, hVar, this.f120461w, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3539a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [T, com.avito.android.deep_linking.links.DeepLink] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                k<ClientCardData> kVar = this.f120457s;
                Integer numBoxInt = Boxing.boxInt(kVar.getPageInfo().getTotalElements());
                if (numBoxInt.intValue() <= 0) {
                    numBoxInt = null;
                }
                LinkedHashMap linkedHashMap = this.f120455q;
                RequestType requestType = this.f120456r;
                linkedHashMap.put(requestType, numBoxInt);
                if (this.f120458t == requestType) {
                    this.f120459u.f406842b = kVar.a();
                    this.f120460v.f406842b = this.f120461w;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RequestType requestType, RequestType requestType2, c cVar, C43477c c43477c, LinkedHashMap linkedHashMap, l0.h hVar, l0.h hVar2, Continuation continuation) {
            super(2, continuation);
            this.f120448r = requestType;
            this.f120449s = requestType2;
            this.f120450t = cVar;
            this.f120451u = c43477c;
            this.f120452v = linkedHashMap;
            this.f120453w = hVar;
            this.f120454x = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            l0.h<List<ClientCardData>> hVar = this.f120453w;
            l0.h<DeepLink> hVar2 = this.f120454x;
            return new a(this.f120448r, this.f120449s, this.f120450t, this.f120451u, this.f120452v, hVar, hVar2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f120447q;
            c cVar = this.f120450t;
            if (i12 == 0) {
                C42729a0.b(obj);
                RequestType requestType = this.f120448r;
                RequestType requestType2 = this.f120449s;
                int i13 = requestType == requestType2 ? 10 : 1;
                C43477c c43477c = this.f120451u;
                String str = c43477c != null ? c43477c.f413193a : null;
                Boolean boolBoxBoolean = c43477c != null ? Boxing.boxBoolean(c43477c.f413194b) : null;
                this.f120447q = 1;
                cVar.getClass();
                int iOrdinal = requestType2.ordinal();
                com.avito.android.comfortable_deal.repository.a aVar = cVar.f120438a;
                if (iOrdinal == 0) {
                    obj = aVar.q(0, C42784z0.f406748b, i13, this);
                } else if (iOrdinal == 1) {
                    obj = aVar.w(0, C42784z0.f406748b, i13, this);
                } else if (iOrdinal == 2) {
                    obj = cVar.f120438a.r(0, i13, str, boolBoxBoolean != null ? boolBoxBoolean.booleanValue() : false, this);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = aVar.i(0, C42784z0.f406748b, i13, this);
                }
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
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                j jVar = (j) ((TypedResult.Success) typedResult).getResult();
                k<T> kVar = jVar.f394071a;
                AbstractC43129d1 abstractC43129d1D = cVar.f120439b.d();
                C3539a c3539a = new C3539a(this.f120452v, this.f120449s, kVar, this.f120448r, this.f120453w, this.f120454x, jVar.f394072b, null);
                this.f120447q = 2;
                if (C43259k.g(abstractC43129d1D, c3539a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RequestType requestType, c cVar, C43477c c43477c, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f120444u = requestType;
        this.f120445v = cVar;
        this.f120446w = c43477c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f120444u, this.f120445v, this.f120446w, continuation);
        dVar.f120443t = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super ClientsInfo> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        l0.h hVar;
        l0.h hVar2;
        LinkedHashMap linkedHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f120442s;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f120443t;
            l0.h hVar3 = new l0.h();
            l0.h hVar4 = new l0.h();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List list = RequestType.f120272f;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = ((AbstractC42738c) list).iterator();
            while (it.hasNext()) {
                Object obj2 = coroutine_suspended;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(C43259k.b(t12, null, new a(this.f120444u, (RequestType) it.next(), this.f120445v, this.f120446w, linkedHashMap2, hVar3, hVar4, null), 3));
                arrayList = arrayList2;
                coroutine_suspended = obj2;
            }
            Object obj3 = coroutine_suspended;
            this.f120443t = hVar3;
            this.f120440q = hVar4;
            this.f120441r = linkedHashMap2;
            this.f120442s = 1;
            if (C43225h.a(arrayList, this) == obj3) {
                return obj3;
            }
            hVar = hVar3;
            hVar2 = hVar4;
            linkedHashMap = linkedHashMap2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = this.f120441r;
            hVar2 = this.f120440q;
            hVar = (l0.h) this.f120443t;
            C42729a0.b(obj);
        }
        return new ClientsInfo((List) hVar.f406842b, (DeepLink) hVar2.f406842b, linkedHashMap);
    }
}
