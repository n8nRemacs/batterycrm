package com.avito.android.advert_collection_list;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.error.z;
import com.avito.android.remote.model.AdvertCollection;
import com.avito.android.remote.model.AdvertCollectionListResult;
import com.avito.android.remote.model.CollectionLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertCollectionListInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/g;", "Lcom/avito/android/advert_collection_list/f;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements com.avito.android.advert_collection_list.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<ZC.f> f82134a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final O7.a f82135b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f82136c;

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$deleteCollection$1", f = "AdvertCollectionListInteractor.kt", i = {0}, l = {68, 70, 72}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82137q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82138r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f82140t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f82140t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f82140t, continuation);
            aVar.f82138r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82137q;
            String str = this.f82140t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f82138r;
                ZC.f fVar = g.this.f82134a.get();
                List<String> listSingletonList = Collections.singletonList(str);
                String str2 = FromPageSource.AdvertCollectionList.f82324c.f82321b;
                this.f82138r = interfaceC43172j;
                this.f82137q = 1;
                obj = fVar.a(listSingletonList, str2, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f82138r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionListInternalAction.ShowError showError = new AdvertCollectionListInternalAction.ShowError(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f82138r = null;
                this.f82137q = 2;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                AdvertCollectionListInternalAction.CollectionDeleted collectionDeleted = new AdvertCollectionListInternalAction.CollectionDeleted(str);
                this.f82138r = null;
                this.f82137q = 3;
                if (interfaceC43172j.emit(collectionDeleted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$deleteCollection$2", f = "AdvertCollectionListInteractor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82141q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f82142r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f82143s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f82142r = interfaceC43172j;
            bVar.f82143s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82141q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f82142r;
                AdvertCollectionListInternalAction.ShowError showError = new AdvertCollectionListInternalAction.ShowError(z.n(this.f82143s).getF244063c());
                this.f82142r = null;
                this.f82141q = 1;
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

    /* compiled from: AdvertCollectionListInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$getAdvertCollections$1", f = "AdvertCollectionListInteractor.kt", i = {0}, l = {43, 44, 46}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82144q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82145r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = g.this.new c(continuation);
            cVar.f82145r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objB;
            Boolean canUnpublish;
            Boolean canPublish;
            Boolean canShare;
            Boolean canDelete;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82144q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f82145r;
                ZC.f fVar = g.this.f82134a.get();
                this.f82145r = interfaceC43172j;
                this.f82144q = 1;
                objB = fVar.b(false, this);
                if (objB == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f82145r;
                C42729a0.b(obj);
                objB = obj;
            }
            TypedResult typedResult = (TypedResult) objB;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionListInternalAction.CollectionListLoadingError collectionListLoadingError = new AdvertCollectionListInternalAction.CollectionListLoadingError(((TypedResult.Error) typedResult).getError());
                this.f82145r = null;
                this.f82144q = 2;
                if (interfaceC43172j.emit(collectionListLoadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                List<AdvertCollection> list = ((AdvertCollectionListResult) success.getResult()).getList();
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (AdvertCollection advertCollection : list) {
                    AdvertCollectionItem.f82027k.getClass();
                    String id2 = advertCollection.getId();
                    String name = advertCollection.getName();
                    DeepLink deepLink = advertCollection.getDeepLink();
                    int size = advertCollection.getSize();
                    Image preview = advertCollection.getPreview();
                    String description = advertCollection.getDescription();
                    AdvertCollection.ModerationStatusInfo moderationStatusInfo = advertCollection.getModerationStatusInfo();
                    AdvertCollectionItem.ModerationStatusInfo moderationStatusInfo2 = moderationStatusInfo != null ? new AdvertCollectionItem.ModerationStatusInfo(moderationStatusInfo.getText(), moderationStatusInfo.getColor()) : null;
                    AdvertCollection.AuthorInfo author = advertCollection.getAuthor();
                    AdvertCollectionItem.AuthorInfo authorInfo = author != null ? new AdvertCollectionItem.AuthorInfo(author.getAvatar(), author.getName()) : null;
                    AdvertCollection.Actions actions = advertCollection.getActions();
                    boolean zBooleanValue = (actions == null || (canDelete = actions.getCanDelete()) == null) ? false : canDelete.booleanValue();
                    AdvertCollection.Actions actions2 = advertCollection.getActions();
                    boolean zBooleanValue2 = (actions2 == null || (canShare = actions2.getCanShare()) == null) ? false : canShare.booleanValue();
                    AdvertCollection.Actions actions3 = advertCollection.getActions();
                    DeepLink edit = actions3 != null ? actions3.getEdit() : null;
                    AdvertCollection.Actions actions4 = advertCollection.getActions();
                    boolean zBooleanValue3 = (actions4 == null || (canPublish = actions4.getCanPublish()) == null) ? false : canPublish.booleanValue();
                    AdvertCollection.Actions actions5 = advertCollection.getActions();
                    arrayList.add(new AdvertCollectionItem(id2, name, deepLink, size, preview, description, moderationStatusInfo2, authorInfo, new AdvertCollectionItem.Actions(zBooleanValue, zBooleanValue2, edit, zBooleanValue3, (actions5 == null || (canUnpublish = actions5.getCanUnpublish()) == null) ? false : canUnpublish.booleanValue())));
                }
                DeepLink collectionsCreationDeeplink = ((AdvertCollectionListResult) success.getResult()).getCollectionsCreationDeeplink();
                if (collectionsCreationDeeplink == null || (collectionsCreationDeeplink instanceof NoMatchLink)) {
                    collectionsCreationDeeplink = null;
                }
                AdvertCollectionListInternalAction.CollectionListLoaded collectionListLoaded = new AdvertCollectionListInternalAction.CollectionListLoaded(arrayList, collectionsCreationDeeplink);
                this.f82145r = null;
                this.f82144q = 3;
                if (interfaceC43172j.emit(collectionListLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$getAdvertCollections$2", f = "AdvertCollectionListInteractor.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82147q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f82148r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f82149s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f82148r = interfaceC43172j;
            dVar.f82149s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82147q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f82148r;
                AdvertCollectionListInternalAction.CollectionListLoadingError collectionListLoadingError = new AdvertCollectionListInternalAction.CollectionListLoadingError(z.n(this.f82149s));
                this.f82148r = null;
                this.f82147q = 1;
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

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$getAdvertCollections$3", f = "AdvertCollectionListInteractor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82150q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82151r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f82151r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82150q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f82151r;
                AdvertCollectionListInternalAction.CollectionListStartLoading collectionListStartLoading = new AdvertCollectionListInternalAction.CollectionListStartLoading();
                this.f82150q = 1;
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

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$getCollectionLink$1", f = "AdvertCollectionListInteractor.kt", i = {0}, l = {82, 84, 86}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82152q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82153r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f82155t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f82155t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = g.this.new f(this.f82155t, continuation);
            fVar.f82153r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82152q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f82153r;
                ZC.f fVar = g.this.f82134a.get();
                this.f82153r = interfaceC43172j;
                this.f82152q = 1;
                obj = fVar.h(this.f82155t, null, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f82153r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionListInternalAction.ShowError showError = new AdvertCollectionListInternalAction.ShowError(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f82153r = null;
                this.f82152q = 2;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                AdvertCollectionListInternalAction.CollectionLinkLoaded collectionLinkLoaded = new AdvertCollectionListInternalAction.CollectionLinkLoaded(((CollectionLink) ((TypedResult.Success) typedResult).getResult()).getLink());
                this.f82153r = null;
                this.f82152q = 3;
                if (interfaceC43172j.emit(collectionLinkLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$getCollectionLink$2", f = "AdvertCollectionListInteractor.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert_collection_list.g$g, reason: collision with other inner class name */
    public static final class C2438g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82156q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f82157r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f82158s;

        public C2438g() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C2438g c2438g = new C2438g(3, continuation);
            c2438g.f82157r = interfaceC43172j;
            c2438g.f82158s = th2;
            return c2438g.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82156q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f82157r;
                AdvertCollectionListInternalAction.ShowError showError = new AdvertCollectionListInternalAction.ShowError(z.n(this.f82158s).getF244063c());
                this.f82157r = null;
                this.f82156q = 1;
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

    /* compiled from: AdvertCollectionListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListInteractorImpl$updateCollectionPublicity$1", f = "AdvertCollectionListInteractor.kt", i = {0}, l = {98, 109, 110}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82159q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82160r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f82162t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f82163u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z12, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f82162t = str;
            this.f82163u = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = g.this.new h(this.f82162t, this.f82163u, continuation);
            hVar.f82160r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82159q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f82160r;
                O7.a aVar = g.this.f82135b;
                P7.d dVar = new P7.d(null, this.f82162t, null, null, Boxing.boxBoolean(this.f82163u), null);
                this.f82160r = interfaceC43172j;
                this.f82159q = 1;
                obj = aVar.a("favCollectionList", dVar, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f82160r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                AdvertCollectionListInternalAction.ShowError showError = new AdvertCollectionListInternalAction.ShowError(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f82160r = null;
                this.f82159q = 2;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                InterfaceC43160i interfaceC43160iW = C43175k.w();
                this.f82160r = null;
                this.f82159q = 3;
                if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k h31.e<ZC.f> eVar, @Y61.k O7.a aVar, @Y61.k R0 r02) {
        this.f82134a = eVar;
        this.f82135b = aVar;
        this.f82136c = r02;
    }

    @Override // com.avito.android.advert_collection_list.f
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionListInternalAction> a() {
        return C43175k.I(this.f82136c.a(), new C43137a0(new e(2, null), new C43152f0(C43175k.G(new c(null)), new d(3, null))));
    }

    @Override // com.avito.android.advert_collection_list.f
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionListInternalAction> b(@Y61.k String str) {
        return C43175k.I(this.f82136c.a(), new C43152f0(C43175k.G(new f(str, null)), new C2438g(3, null)));
    }

    @Override // com.avito.android.advert_collection_list.f
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionListInternalAction> c(@Y61.k String str) {
        return C43175k.I(this.f82136c.a(), new C43152f0(C43175k.G(new a(str, null)), new b(3, null)));
    }

    @Override // com.avito.android.advert_collection_list.f
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionListInternalAction> d(@Y61.k String str, boolean z12) {
        return C43175k.G(new h(str, z12, null));
    }
}
