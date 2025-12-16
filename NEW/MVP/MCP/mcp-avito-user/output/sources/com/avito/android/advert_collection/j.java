package com.avito.android.advert_collection;

import android.net.Uri;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.favorites.InterfaceC30603b;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.CollectionLink;
import com.avito.android.remote.model.FavoritesResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35741a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertCollectionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/j;", "Lcom/avito/android/advert_collection/i;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ZC.f f81494a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f81495b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f81496c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f81497d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30603b f81498e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f81499f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.x f81500g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final E7.a f81501h;

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$addCollectionToFavorite$1", f = "AdvertCollectionInteractor.kt", i = {0}, l = {166, 171, 172}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81502q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81503r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f81503r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81502q;
            String str2 = "";
            j jVar = j.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81503r;
                E7.a aVar = jVar.f81501h;
                F7.a aVar2 = new F7.a(Collections.singletonList(jVar.f81495b));
                this.f81503r = interfaceC43172j;
                this.f81502q = 1;
                obj = aVar.c("", aVar2, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f81503r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionInternalAction.ApiErrorReceived apiErrorReceived = new AdvertCollectionInternalAction.ApiErrorReceived(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f81503r = null;
                this.f81502q = 2;
                if (interfaceC43172j.emit(apiErrorReceived, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                Boolean isFavorite = ((F7.b) success.getResult()).getIsFavorite();
                boolean zBooleanValue = isFavorite != null ? isFavorite.booleanValue() : false;
                Map<String, String> mapA = ((F7.b) success.getResult()).a();
                if (mapA != null && (str = mapA.get(jVar.f81495b)) != null) {
                    str2 = str;
                }
                AdvertCollectionInternalAction.UpdateLikeState updateLikeState = new AdvertCollectionInternalAction.UpdateLikeState(zBooleanValue, str2);
                this.f81503r = null;
                this.f81502q = 3;
                if (interfaceC43172j.emit(updateLikeState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$deleteCollection$1", f = "AdvertCollectionInteractor.kt", i = {0, 1, 2}, l = {151, 153, 156, 160}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81505q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81506r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = j.this.new b(continuation);
            bVar.f81506r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f81505q;
            try {
            } catch (Exception unused) {
                AdvertCollectionInternalAction.CollectionDeleteError collectionDeleteError = AdvertCollectionInternalAction.CollectionDeleteError.f81572b;
                this.f81506r = null;
                this.f81505q = 4;
                if (r12.emit(collectionDeleteError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81506r;
                j jVar = j.this;
                ZC.f fVar = jVar.f81494a;
                List<String> listSingletonList = Collections.singletonList(jVar.f81495b);
                String str = FromPageSource.AdvertCollection.f82323c.f82321b;
                this.f81506r = interfaceC43172j;
                this.f81505q = 1;
                obj = fVar.a(listSingletonList, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    if (r12 == 2 || r12 == 3) {
                        C42729a0.b(obj);
                    } else {
                        if (r12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f81506r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionInternalAction.CollectionDeleteError collectionDeleteError2 = AdvertCollectionInternalAction.CollectionDeleteError.f81572b;
                this.f81506r = interfaceC43172j;
                this.f81505q = 2;
                if (interfaceC43172j.emit(collectionDeleteError2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                AdvertCollectionInternalAction.CollectionDeleted collectionDeleted = AdvertCollectionInternalAction.CollectionDeleted.f81573b;
                this.f81506r = interfaceC43172j;
                this.f81505q = 3;
                if (interfaceC43172j.emit(collectionDeleted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$getAdvertList$1", f = "AdvertCollectionInteractor.kt", i = {0, 1, 2, 3}, l = {80, 82, 84, 93, 97}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81508q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81509r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map<String, Integer> f81511t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f81512u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, Integer> map, Map<String, String> map2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f81511t = map;
            this.f81512u = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = j.this.new c(this.f81511t, this.f81512u, continuation);
            cVar.f81509r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:13:0x002e, B:19:0x0041, B:35:0x0089, B:37:0x008f, B:40:0x00a5, B:42:0x00a9, B:43:0x00c3, B:45:0x00c9, B:47:0x00d1, B:48:0x00d5, B:49:0x00dd, B:51:0x00e3, B:53:0x00ed, B:54:0x0102), top: B:68:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:13:0x002e, B:19:0x0041, B:35:0x0089, B:37:0x008f, B:40:0x00a5, B:42:0x00a9, B:43:0x00c3, B:45:0x00c9, B:47:0x00d1, B:48:0x00d5, B:49:0x00dd, B:51:0x00e3, B:53:0x00ed, B:54:0x0102), top: B:68:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0136 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$getAdvertList$2", f = "AdvertCollectionInteractor.kt", i = {0, 1, 2}, l = {105, 107, 121, 125}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81513q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81514r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f81516t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f81516t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = j.this.new d(this.f81516t, continuation);
            dVar.f81514r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f81513q;
            String str = this.f81516t;
            j jVar = j.this;
            try {
            } catch (Exception e12) {
                AdvertCollectionInternalAction.LoadNextPageError loadNextPageError = new AdvertCollectionInternalAction.LoadNextPageError(InterfaceC35741a1.a.a(jVar.f81499f, e12, null, null, 6), Uri.parse(str));
                this.f81514r = null;
                this.f81513q = 4;
                if (r12.emit(loadNextPageError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81514r;
                ZC.f fVar = jVar.f81494a;
                String str2 = jVar.f81497d;
                this.f81514r = interfaceC43172j;
                this.f81513q = 1;
                obj = fVar.f(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    if (r12 == 2 || r12 == 3) {
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    if (r12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f81514r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionInternalAction.LoadNextPageError loadNextPageError2 = new AdvertCollectionInternalAction.LoadNextPageError(InterfaceC35741a1.a.a(jVar.f81499f, ((TypedResult.Error) typedResult).getCause(), null, null, 6), Uri.parse(str));
                this.f81514r = interfaceC43172j;
                this.f81513q = 2;
                if (interfaceC43172j.emit(loadNextPageError2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                ArrayList<FavoriteListItem> arrayListA = jVar.f81498e.a(((FavoritesResult) ((TypedResult.Success) typedResult).getResult()).getItems());
                for (FavoriteListItem favoriteListItem : arrayListA) {
                    if (favoriteListItem instanceof FavoriteAdvertItem) {
                        ((FavoriteAdvertItem) favoriteListItem).f156394F = jVar.f81500g.b(((FavoriteAdvertItem) favoriteListItem).f156404b, ((FavoriteAdvertItem) favoriteListItem).f156394F);
                    }
                }
                AdvertCollectionInternalAction.LoadNextPageAdvertItems loadNextPageAdvertItems = new AdvertCollectionInternalAction.LoadNextPageAdvertItems(arrayListA, ((FavoritesResult) ((TypedResult.Success) typedResult).getResult()).getNextPage());
                this.f81514r = interfaceC43172j;
                this.f81513q = 3;
                if (interfaceC43172j.emit(loadNextPageAdvertItems, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$getCollectionLink$1", f = "AdvertCollectionInteractor.kt", i = {0, 1, 2}, l = {133, 135, 138, 143}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81517q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81518r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f81520t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f81520t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = j.this.new e(this.f81520t, continuation);
            eVar.f81518r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f81517q;
            try {
            } catch (Exception unused) {
                AdvertCollectionInternalAction.LoadCollectionLinkError loadCollectionLinkError = AdvertCollectionInternalAction.LoadCollectionLinkError.f81583b;
                this.f81518r = null;
                this.f81517q = 4;
                if (r12.emit(loadCollectionLinkError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81518r;
                j jVar = j.this;
                ZC.f fVar = jVar.f81494a;
                String str = jVar.f81495b;
                String str2 = jVar.f81496c;
                this.f81518r = interfaceC43172j;
                this.f81517q = 1;
                obj = fVar.h(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    if (r12 == 2 || r12 == 3) {
                        C42729a0.b(obj);
                    } else {
                        if (r12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f81518r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionInternalAction.LoadCollectionLinkError loadCollectionLinkError2 = AdvertCollectionInternalAction.LoadCollectionLinkError.f81583b;
                this.f81518r = interfaceC43172j;
                this.f81517q = 2;
                if (interfaceC43172j.emit(loadCollectionLinkError2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                AdvertCollectionInternalAction.CollectionLinkLoaded collectionLinkLoaded = new AdvertCollectionInternalAction.CollectionLinkLoaded(((CollectionLink) ((TypedResult.Success) typedResult).getResult()).getLink(), this.f81520t);
                this.f81518r = interfaceC43172j;
                this.f81517q = 3;
                if (interfaceC43172j.emit(collectionLinkLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$getWidgets$1", f = "AdvertCollectionInteractor.kt", i = {0, 1, 2, 3}, l = {62, 63, 64, 65, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81521q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81522r;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = j.this.new f(continuation);
            fVar.f81522r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x0029, B:19:0x003a, B:31:0x0071, B:33:0x0077, B:36:0x008d, B:38:0x0091, B:22:0x0042, B:28:0x005e, B:25:0x004e), top: B:46:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x0029, B:19:0x003a, B:31:0x0071, B:33:0x0077, B:36:0x008d, B:38:0x0091, B:22:0x0042, B:28:0x005e, B:25:0x004e), top: B:46:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
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
                int r1 = r9.f81521q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 1
                if (r1 == 0) goto L46
                if (r1 == r7) goto L3e
                if (r1 == r5) goto L36
                if (r1 == r4) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                kotlin.C42729a0.b(r10)
                goto Lbd
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r1 = r9.f81522r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            L29:
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Exception -> L2e
                goto Lbd
            L2e:
                r10 = move-exception
                goto La9
            L31:
                java.lang.Object r1 = r9.f81522r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                goto L29
            L36:
                java.lang.Object r1 = r9.f81522r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Exception -> L2e
                goto L71
            L3e:
                java.lang.Object r1 = r9.f81522r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Exception -> L2e
                goto L5e
            L46:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f81522r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$WidgetsLoading r10 = new com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$WidgetsLoading     // Catch: java.lang.Exception -> L2e
                r10.<init>(r6, r7, r6)     // Catch: java.lang.Exception -> L2e
                r9.f81522r = r1     // Catch: java.lang.Exception -> L2e
                r9.f81521q = r7     // Catch: java.lang.Exception -> L2e
                java.lang.Object r10 = r1.emit(r10, r9)     // Catch: java.lang.Exception -> L2e
                if (r10 != r0) goto L5e
                return r0
            L5e:
                com.avito.android.advert_collection.j r10 = com.avito.android.advert_collection.j.this     // Catch: java.lang.Exception -> L2e
                ZC.f r7 = r10.f81494a     // Catch: java.lang.Exception -> L2e
                java.lang.String r8 = r10.f81495b     // Catch: java.lang.Exception -> L2e
                java.lang.String r10 = r10.f81496c     // Catch: java.lang.Exception -> L2e
                r9.f81522r = r1     // Catch: java.lang.Exception -> L2e
                r9.f81521q = r5     // Catch: java.lang.Exception -> L2e
                java.lang.Object r10 = r7.e(r8, r10, r9)     // Catch: java.lang.Exception -> L2e
                if (r10 != r0) goto L71
                return r0
            L71:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10     // Catch: java.lang.Exception -> L2e
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Error     // Catch: java.lang.Exception -> L2e
                if (r5 == 0) goto L8d
                com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgetsError r3 = new com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgetsError     // Catch: java.lang.Exception -> L2e
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10     // Catch: java.lang.Exception -> L2e
                com.avito.android.remote.error.ApiError r10 = r10.getError()     // Catch: java.lang.Exception -> L2e
                r3.<init>(r10)     // Catch: java.lang.Exception -> L2e
                r9.f81522r = r1     // Catch: java.lang.Exception -> L2e
                r9.f81521q = r4     // Catch: java.lang.Exception -> L2e
                java.lang.Object r10 = r1.emit(r3, r9)     // Catch: java.lang.Exception -> L2e
                if (r10 != r0) goto Lbd
                return r0
            L8d:
                boolean r4 = r10 instanceof com.avito.android.remote.model.TypedResult.Success     // Catch: java.lang.Exception -> L2e
                if (r4 == 0) goto Lbd
                com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgets r4 = new com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgets     // Catch: java.lang.Exception -> L2e
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10     // Catch: java.lang.Exception -> L2e
                java.lang.Object r10 = r10.getResult()     // Catch: java.lang.Exception -> L2e
                com.avito.android.remote.model.FavoriteItemsWidgets r10 = (com.avito.android.remote.model.FavoriteItemsWidgets) r10     // Catch: java.lang.Exception -> L2e
                r4.<init>(r10)     // Catch: java.lang.Exception -> L2e
                r9.f81522r = r1     // Catch: java.lang.Exception -> L2e
                r9.f81521q = r3     // Catch: java.lang.Exception -> L2e
                java.lang.Object r10 = r1.emit(r4, r9)     // Catch: java.lang.Exception -> L2e
                if (r10 != r0) goto Lbd
                return r0
            La9:
                com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgetsError r3 = new com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgetsError
                com.avito.android.remote.error.ApiError r10 = com.avito.android.error.z.n(r10)
                r3.<init>(r10)
                r9.f81522r = r6
                r9.f81521q = r2
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto Lbd
                return r0
            Lbd:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection.j.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$removeCollectionFromFavorite$1", f = "AdvertCollectionInteractor.kt", i = {0}, l = {182, 187, 188}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81524q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81525r;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = j.this.new g(continuation);
            gVar.f81525r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81524q;
            String str2 = "";
            j jVar = j.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81525r;
                E7.a aVar = jVar.f81501h;
                G7.a aVar2 = new G7.a(Collections.singletonList(jVar.f81495b));
                this.f81525r = interfaceC43172j;
                this.f81524q = 1;
                obj = aVar.a("", aVar2, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f81525r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionInternalAction.ApiErrorReceived apiErrorReceived = new AdvertCollectionInternalAction.ApiErrorReceived(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f81525r = null;
                this.f81524q = 2;
                if (interfaceC43172j.emit(apiErrorReceived, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                Boolean isFavorite = ((G7.b) success.getResult()).getIsFavorite();
                boolean zBooleanValue = isFavorite != null ? isFavorite.booleanValue() : false;
                Map<String, String> mapA = ((G7.b) success.getResult()).a();
                if (mapA != null && (str = mapA.get(jVar.f81495b)) != null) {
                    str2 = str;
                }
                AdvertCollectionInternalAction.UpdateLikeState updateLikeState = new AdvertCollectionInternalAction.UpdateLikeState(zBooleanValue, str2);
                this.f81525r = null;
                this.f81524q = 3;
                if (interfaceC43172j.emit(updateLikeState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionInteractorImpl$updateCollectionPublicity$1", f = "AdvertCollectionInteractor.kt", i = {0}, l = {198, 209, 210}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81527q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81528r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f81530t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z12, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f81530t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = j.this.new h(this.f81530t, continuation);
            hVar.f81528r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81527q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f81528r;
                j jVar = j.this;
                E7.a aVar = jVar.f81501h;
                H7.d dVar = new H7.d(null, jVar.f81495b, null, null, Boxing.boxBoolean(this.f81530t), null);
                this.f81528r = interfaceC43172j;
                this.f81527q = 1;
                obj = aVar.b("favCollection", dVar, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f81528r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionInternalAction.ApiErrorReceived apiErrorReceived = new AdvertCollectionInternalAction.ApiErrorReceived(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f81528r = null;
                this.f81527q = 2;
                if (interfaceC43172j.emit(apiErrorReceived, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                InterfaceC43160i interfaceC43160iW = C43175k.w();
                this.f81528r = null;
                this.f81527q = 3;
                if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k ZC.f fVar, @com.avito.android.advert_collection.di.A @Y61.k String str, @com.avito.android.advert_collection.di.D @Y61.k String str2, @Y61.l @com.avito.android.advert_collection.di.C String str3, @Y61.k InterfaceC30603b interfaceC30603b, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.favorite.x xVar, @Y61.k E7.a aVar) {
        this.f81494a = fVar;
        this.f81495b = str;
        this.f81496c = str2;
        this.f81497d = str3;
        this.f81498e = interfaceC30603b;
        this.f81499f = interfaceC35741a1;
        this.f81500g = xVar;
        this.f81501h = aVar;
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> a() {
        return C43175k.G(new f(null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> b(@Y61.k String str) {
        return C43175k.G(new e(str, null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> c(@Y61.k Map<String, Integer> map, @Y61.k Map<String, String> map2) {
        return C43175k.G(new c(map, map2, null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> d() {
        return C43175k.G(new b(null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> e() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> f(boolean z12) {
        return C43175k.G(new h(z12, null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> g() {
        return C43175k.G(new g(null));
    }

    @Override // com.avito.android.advert_collection.i
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> h(@Y61.k String str) {
        return C43175k.G(new d(str, null));
    }
}
