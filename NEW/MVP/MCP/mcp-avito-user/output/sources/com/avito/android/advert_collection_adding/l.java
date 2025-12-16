package com.avito.android.advert_collection_adding;

import com.avito.android.advert_collection_adding.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.V;
import com.avito.android.favorites.W;
import com.avito.android.remote.model.AdvertCollection;
import com.avito.android.remote.model.AdvertCollectionListResult;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertCollectionAddingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/l;", "Lcom/avito/android/advert_collection_adding/k;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<String> f81832a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<ZC.f> f81833b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final W f81834c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final V f81835d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.x f81836e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f81837f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f81838g;

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$addAdvertsToCollection$1", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<G0, Continuation<? super InterfaceC43160i<? extends AdvertCollectionAddingInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<AdvertCollectionAddingInternalAction> f81839q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends AdvertCollectionAddingInternalAction> interfaceC43160i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f81839q = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f81839q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super InterfaceC43160i<? extends AdvertCollectionAddingInternalAction>> continuation) {
            return ((a) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f81839q;
        }
    }

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$addAdvertsToCollection$2", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81840q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81841r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f81841r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81840q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f81841r;
                AdvertCollectionAddingInternalAction.Loading loading = AdvertCollectionAddingInternalAction.Loading.f81887b;
                this.f81840q = 1;
                if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$addAdvertsToCollection$3", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81842q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f81843r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f81844s;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f81843r = interfaceC43172j;
            cVar.f81844s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81842q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f81843r;
                AdvertCollectionAddingInternalAction.ShowError showError = new AdvertCollectionAddingInternalAction.ShowError(com.avito.android.error.z.n(this.f81844s).getF244063c());
                this.f81843r = null;
                this.f81842q = 1;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$addAdvertsToCollection$addAdvertsToCollection$1", f = "AdvertCollectionAddingInteractor.kt", i = {0}, l = {110, 111, 112}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81845q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81846r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f81848t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ DeepLink f81849u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, DeepLink deepLink, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f81848t = str;
            this.f81849u = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = l.this.new d(this.f81848t, this.f81849u, continuation);
            dVar.f81846r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81845q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81846r;
                l lVar = l.this;
                ZC.f fVar = lVar.f81833b.get();
                A4.f318516a.getClass();
                HashMap mapF = A4.f("ids", lVar.f81832a);
                this.f81846r = interfaceC43172j;
                this.f81845q = 1;
                obj = fVar.g(this.f81848t, mapF, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f81846r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionAddingInternalAction.ShowError showError = new AdvertCollectionAddingInternalAction.ShowError(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f81846r = null;
                this.f81845q = 2;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                AdvertCollectionAddingInternalAction.AddedToCollection addedToCollection = new AdvertCollectionAddingInternalAction.AddedToCollection(this.f81849u);
                this.f81846r = null;
                this.f81845q = 3;
                if (interfaceC43172j.emit(addedToCollection, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$createCollection$1", f = "AdvertCollectionAddingInteractor.kt", i = {0, 3, 3}, l = {75, 76, 80, 83, 91}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "createResult"}, s = {"L$0", "L$0", "L$1"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public CreateAdvertCollectionResult.Created f81850q;

        /* renamed from: r, reason: collision with root package name */
        public int f81851r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f81852s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f81854u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f81854u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = l.this.new e(this.f81854u, continuation);
            eVar.f81852s = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_adding.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$createCollection$2", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81855q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81856r;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(2, continuation);
            fVar.f81856r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81855q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f81856r;
                AdvertCollectionAddingInternalAction.Loading loading = AdvertCollectionAddingInternalAction.Loading.f81887b;
                this.f81855q = 1;
                if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$createCollection$3", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81857q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f81858r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f81859s;

        public g() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            g gVar = new g(3, continuation);
            gVar.f81858r = interfaceC43172j;
            gVar.f81859s = th2;
            return gVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81857q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f81858r;
                AdvertCollectionAddingInternalAction.ShowError showError = new AdvertCollectionAddingInternalAction.ShowError(com.avito.android.error.z.n(this.f81859s).getF244063c());
                this.f81858r = null;
                this.f81857q = 1;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$getAdvertCollections$1", f = "AdvertCollectionAddingInteractor.kt", i = {0}, l = {54, 55, 57}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81860q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81861r;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = l.this.new h(continuation);
            hVar.f81861r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81860q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81861r;
                ZC.f fVar = l.this.f81833b.get();
                this.f81861r = interfaceC43172j;
                this.f81860q = 1;
                obj = fVar.b(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f81861r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionAddingInternalAction.CollectionListLoadingError collectionListLoadingError = new AdvertCollectionAddingInternalAction.CollectionListLoadingError(((TypedResult.Error) typedResult).getError());
                this.f81861r = null;
                this.f81860q = 2;
                if (interfaceC43172j.emit(collectionListLoadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                boolean zIsFirstCollectionCreated = ((AdvertCollectionListResult) success.getResult()).isFirstCollectionCreated();
                List<AdvertCollection> list = ((AdvertCollectionListResult) success.getResult()).getList();
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (AdvertCollection advertCollection : list) {
                    arrayList.add(new AdvertCollectionItem(advertCollection.getId(), advertCollection.getName(), advertCollection.getDeepLink(), advertCollection.getPreview(), advertCollection.getSize()));
                }
                AdvertCollectionAddingInternalAction.CollectionListLoaded collectionListLoaded = new AdvertCollectionAddingInternalAction.CollectionListLoaded(arrayList, zIsFirstCollectionCreated);
                this.f81861r = null;
                this.f81860q = 3;
                if (interfaceC43172j.emit(collectionListLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$getAdvertCollections$2", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81863q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f81864r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f81865s;

        public i() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            i iVar = new i(3, continuation);
            iVar.f81864r = interfaceC43172j;
            iVar.f81865s = th2;
            return iVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81863q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f81864r;
                AdvertCollectionAddingInternalAction.CollectionListLoadingError collectionListLoadingError = new AdvertCollectionAddingInternalAction.CollectionListLoadingError(com.avito.android.error.z.n(this.f81865s));
                this.f81864r = null;
                this.f81863q = 1;
                if (interfaceC43172j.emit(collectionListLoadingError, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionAddingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingInteractorImpl$getAdvertCollections$3", f = "AdvertCollectionAddingInteractor.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81866q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81867r;

        public j() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(2, continuation);
            jVar.f81867r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81866q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f81867r;
                AdvertCollectionAddingInternalAction.CollectionListStartLoading collectionListStartLoading = new AdvertCollectionAddingInternalAction.CollectionListStartLoading();
                this.f81866q = 1;
                if (interfaceC43172j.emit(collectionListStartLoading, this) == coroutine_suspended) {
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
    public l(@Y61.k List<String> list, @Y61.k h31.e<ZC.f> eVar, @Y61.k W w12, @Y61.k V v12, @Y61.k com.avito.android.favorite.x xVar, @Y61.k R0 r02, @Y61.l String str) {
        this.f81832a = list;
        this.f81833b = eVar;
        this.f81834c = w12;
        this.f81835d = v12;
        this.f81836e = xVar;
        this.f81837f = r02;
        this.f81838g = str;
    }

    @Override // com.avito.android.advert_collection_adding.k
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionAddingInternalAction> a() {
        return C43175k.I(this.f81837f.a(), new C43137a0(new j(2, null), new C43152f0(C43175k.G(new h(null)), new i(3, null))));
    }

    @Override // com.avito.android.advert_collection_adding.k
    @Y61.k
    public final InterfaceC43160i b(@Y61.k DeepLink deepLink, @Y61.k String str) {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new d(str, deepLink, null));
        return C43175k.I(this.f81837f.a(), new C43152f0(new C43137a0(new b(2, null), C43175k.C(new a(interfaceC43160iG, null), C43175k.V(new C43137a0(new p(this, null), new n(new m(new C43197r1(new o(2, null), C43175k.t(kotlinx.coroutines.rx3.y.a(this.f81835d.a()), 1))))), 1))), new c(3, null)));
    }

    @Override // com.avito.android.advert_collection_adding.k
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionAddingInternalAction> c(@Y61.k String str) {
        return C43175k.I(this.f81837f.a(), new C43152f0(new C43137a0(new f(2, null), C43175k.G(new e(str, null))), new g(3, null)));
    }
}
