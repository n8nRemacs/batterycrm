package com.avito.android.profile.user_profile;

import Zk0.C19571a;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.remote.profile.generated.api.api_3_internal_banner_rotation_banners_get.InternalBannerPayloadV1;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;
import nF.C44245a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: UserProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1", f = "UserProfileInteractor.kt", i = {0}, l = {81, 84}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226173q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226174r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f226175s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f226176t;

    /* compiled from: UserProfileInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1$1", f = "UserProfileInteractor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6}, l = {171, 173, 180, 181, 182, 175, 187, 193, 193, 195}, m = "invokeSuspend", n = {"profileInfoDeferred", "activeOrdersWidgetItemDeferred", "avitoFinanceDeferred", "avitoFinanceDynamicDeferred", "activeOrdersWidgetItemDeferred", "avitoFinanceDeferred", "avitoFinanceDynamicDeferred", "banners", "avitoFinanceDeferred", "avitoFinanceDynamicDeferred", "result", "avitoFinanceDynamicDeferred", "result", "result", "result", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$4", "L$0", "L$3", "L$2", "L$2", "L$2"})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ k f226177A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<UserProfileInternalAction> f226178B;

        /* renamed from: q, reason: collision with root package name */
        public Object f226179q;

        /* renamed from: r, reason: collision with root package name */
        public Object f226180r;

        /* renamed from: s, reason: collision with root package name */
        public Object f226181s;

        /* renamed from: t, reason: collision with root package name */
        public Object f226182t;

        /* renamed from: u, reason: collision with root package name */
        public Object f226183u;

        /* renamed from: v, reason: collision with root package name */
        public Object f226184v;

        /* renamed from: w, reason: collision with root package name */
        public Object f226185w;

        /* renamed from: x, reason: collision with root package name */
        public Object f226186x;

        /* renamed from: y, reason: collision with root package name */
        public int f226187y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f226188z;

        /* compiled from: UserProfileInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/activeOrders/OrdersNeedActionResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/activeOrders/OrdersNeedActionResponse;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1$1$activeOrdersWidgetItemDeferred$1", f = "UserProfileInteractor.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile.user_profile.m$a$a, reason: collision with other inner class name */
        public static final class C6864a extends SuspendLambda implements Y41.p<T, Continuation<? super OrdersNeedActionResponse>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f226189q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ k f226190r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6864a(k kVar, Continuation<? super C6864a> continuation) {
                super(2, continuation);
                this.f226190r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6864a(this.f226190r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super OrdersNeedActionResponse> continuation) {
                return ((C6864a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                com.avito.android.arch.mvi.utils.c bVar;
                OrdersNeedActionResponse ordersNeedActionResponse;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226189q;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        W wX9 = this.f226190r.f226158c.X9();
                        this.f226189q = 1;
                        obj = C43292o.b(wX9, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    TypedResult typedResult = (TypedResult) obj;
                    if (typedResult instanceof TypedResult.Success) {
                        ordersNeedActionResponse = (OrdersNeedActionResponse) ((TypedResult.Success) typedResult).getResult();
                    } else {
                        if (!(typedResult instanceof TypedResult.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ordersNeedActionResponse = null;
                    }
                    bVar = new c.C2712c(ordersNeedActionResponse);
                } catch (Throwable th2) {
                    Q0.e(getF411447c());
                    bVar = new c.b(th2);
                }
                c.C2712c c2712c = bVar instanceof c.C2712c ? (c.C2712c) bVar : null;
                if (c2712c != null) {
                    return (OrdersNeedActionResponse) c2712c.f92028b;
                }
                return null;
            }
        }

        /* compiled from: UserProfileInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1$1$avitoFinanceDeferred$1", f = "UserProfileInteractor.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super AvitoFinanceResponse>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f226191q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ k f226192r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f226192r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f226192r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super AvitoFinanceResponse> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226191q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    k kVar = this.f226192r;
                    gD.f fVar = kVar.f226163h;
                    fVar.getClass();
                    kotlin.reflect.n<Object>[] nVarArr = gD.f.f396389r;
                    kotlin.reflect.n<Object> nVar = nVarArr[10];
                    if (((Boolean) fVar.f396399k.a().invoke()).booleanValue()) {
                        gD.f fVar2 = kVar.f226163h;
                        fVar2.getClass();
                        kotlin.reflect.n<Object> nVar2 = nVarArr[12];
                        if (!((Boolean) fVar2.f396401m.a().invoke()).booleanValue()) {
                            this.f226191q = 1;
                            obj = kVar.f226162g.E5(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return null;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return (AvitoFinanceResponse) obj;
            }
        }

        /* compiled from: UserProfileInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceDynamicCardItem;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceDynamicCardItem;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1$1$avitoFinanceDynamicDeferred$1", f = "UserProfileInteractor.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super CardItem.AvitoFinanceDynamicCardItem>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public k f226193q;

            /* renamed from: r, reason: collision with root package name */
            public int f226194r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ k f226195s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(k kVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f226195s = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f226195s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super CardItem.AvitoFinanceDynamicCardItem> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:19:0x0058, B:21:0x005e, B:23:0x007e, B:25:0x008c, B:27:0x0090, B:29:0x009a, B:36:0x00ad, B:38:0x00b1, B:43:0x00c1, B:39:0x00ba, B:44:0x00c7, B:45:0x00cc, B:46:0x00cd, B:47:0x00d7, B:30:0x00a1, B:33:0x00a6, B:34:0x00ab, B:13:0x0022, B:15:0x003f), top: B:58:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:19:0x0058, B:21:0x005e, B:23:0x007e, B:25:0x008c, B:27:0x0090, B:29:0x009a, B:36:0x00ad, B:38:0x00b1, B:43:0x00c1, B:39:0x00ba, B:44:0x00c7, B:45:0x00cc, B:46:0x00cd, B:47:0x00d7, B:30:0x00a1, B:33:0x00a6, B:34:0x00ab, B:13:0x0022, B:15:0x003f), top: B:58:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.m.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: UserProfileInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1$1$bannersDeferred$1", f = "UserProfileInteractor.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super List<? extends CardItem>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public k f226196q;

            /* renamed from: r, reason: collision with root package name */
            public int f226197r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ k f226198s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(k kVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f226198s = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f226198s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super List<? extends CardItem>> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                com.avito.android.arch.mvi.utils.c bVar;
                k kVar;
                Object success;
                Zk0.d specificParams;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226197r;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        k kVar2 = this.f226198s;
                        ProfileApi profileApi = kVar2.f226157b.get();
                        this.f226196q = kVar2;
                        this.f226197r = 1;
                        Object objApi3InternalBannerRotationBannersGet = profileApi.api3InternalBannerRotationBannersGet("android", "settings", null, this);
                        if (objApi3InternalBannerRotationBannersGet == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kVar = kVar2;
                        obj = objApi3InternalBannerRotationBannersGet;
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar = this.f226196q;
                        C42729a0.b(obj);
                    }
                    success = (TypedResult) obj;
                    if (success instanceof TypedResult.Success) {
                        List<Zk0.f> list = ((C19571a) ((TypedResult.Success) success).getResult()).a().get("top");
                        if (list == null) {
                            list = C42784z0.f406748b;
                        }
                        List<Zk0.f> list2 = list;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                        for (Zk0.f fVar : list2) {
                            InternalBannerPayloadV1 payload = fVar.getPayload();
                            arrayList.add(((payload == null || (specificParams = payload.getSpecificParams()) == null) ? null : specificParams.getSelfUpdateBannerSpecificParams()) != null ? k.a(kVar, fVar) : kVar.f226159d.a(fVar));
                        }
                        success = new TypedResult.Success(arrayList);
                    } else if (!(success instanceof TypedResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } catch (Throwable th2) {
                    Q0.e(getF411447c());
                    bVar = new c.b(th2);
                }
                if (!(success instanceof TypedResult.Success)) {
                    if (success instanceof TypedResult.Error) {
                        throw C35936s.a(((TypedResult.Error) success).getError(), null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new c.C2712c((List) ((TypedResult.Success) success).getResult());
                if (bVar instanceof c.C2712c) {
                    return (List) ((c.C2712c) bVar).f92028b;
                }
                if (!(bVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                V2.f318762a.f((Throwable) ((c.b) bVar).f92027b);
                return C42784z0.f406748b;
            }
        }

        /* compiled from: UserProfileInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/user_profile/UserProfileResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$1$1$profileInfoDeferred$1", f = "UserProfileInteractor.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<UserProfileResult>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f226199q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ k f226200r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(k kVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f226200r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new e(this.f226200r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<UserProfileResult>> continuation) {
                return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226199q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f226199q = 1;
                    k kVar = this.f226200r;
                    C44245a c44245a = kVar.f226164i;
                    c44245a.getClass();
                    kotlin.reflect.n<Object> nVar = C44245a.f414956i[0];
                    boolean zBooleanValue = ((Boolean) c44245a.f414957b.a().invoke()).booleanValue();
                    h31.e<InterfaceC34401z0> eVar = kVar.f226156a;
                    obj = zBooleanValue ? eVar.get().E(true, this) : eVar.get().s(true, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k kVar, InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f226177A = kVar;
            this.f226178B = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f226177A, this.f226178B, continuation);
            aVar.f226188z = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x017e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0212 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0239 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0268 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0292 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02ba  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02ee A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0302 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0306  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 826
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z12, k kVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f226175s = z12;
        this.f226176t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f226175s, this.f226176t, continuation);
        mVar.f226174r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226173q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f226174r;
            if (!this.f226175s) {
                UserProfileInternalAction.DataLoadingInProgress dataLoadingInProgress = new UserProfileInternalAction.DataLoadingInProgress();
                this.f226174r = interfaceC43172j;
                this.f226173q = 1;
                if (interfaceC43172j.emit(dataLoadingInProgress, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f226174r;
            C42729a0.b(obj);
        }
        a aVar = new a(this.f226176t, interfaceC43172j, null);
        this.f226174r = null;
        this.f226173q = 2;
        if (U.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
