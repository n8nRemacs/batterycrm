package com.avito.android.favorite_sellers;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.di.InterfaceC29975l;
import com.avito.android.favorite_sellers.adapter.error.ErrorItem;
import com.avito.android.favorite_sellers.adapter.loading.LoadingItem;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.FavoriteSellersLoadingResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.K5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zz.InterfaceC50647a;

/* compiled from: FavoriteSellersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/m;", "Lcom/avito/android/favorite_sellers/l;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30589m implements InterfaceC30588l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.Q f155896a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f155897b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I30.d f155898c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f155899d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.a f155900e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30580d f155901f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30583g f155902g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final L f155903h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f155904i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f155905j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f155906k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final V f155907l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f155908m;

    /* compiled from: FavoriteSellersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$changeNotifications$1", f = "FavoriteSellersInteractor.kt", i = {0, 1, 1}, l = {181, 183, 196}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "needActivate"}, s = {"L$0", "L$0", "I$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155909q;

        /* renamed from: r, reason: collision with root package name */
        public int f155910r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f155911s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SubscribableItem f155912t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f155913u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C30589m f155914v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SubscribableItem subscribableItem, boolean z12, C30589m c30589m, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f155912t = subscribableItem;
            this.f155913u = z12;
            this.f155914v = c30589m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f155912t, this.f155913u, this.f155914v, continuation);
            aVar.f155911s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws com.avito.android.util.ApiException {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f155910r
                com.avito.android.favorite_sellers.m r2 = r11.f155914v
                r3 = 3
                r4 = 2
                com.avito.android.favorite_sellers.SubscribableItem r5 = r11.f155912t
                r6 = 1
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2c
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                kotlin.C42729a0.b(r12)
                goto Lb1
            L1a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L22:
                int r1 = r11.f155909q
                java.lang.Object r4 = r11.f155911s
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.InterfaceC43172j) r4
                kotlin.C42729a0.b(r12)
                goto L6c
            L2c:
                java.lang.Object r1 = r11.f155911s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                r12 = r1
                goto L4f
            L35:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f155911s
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                r5.u3(r6)
                com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$ChangeNotificationProgress r1 = new com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$ChangeNotificationProgress
                r1.<init>(r5, r6)
                r11.f155911s = r12
                r11.f155910r = r6
                java.lang.Object r1 = r12.emit(r1, r11)
                if (r1 != r0) goto L4f
                return r0
            L4f:
                boolean r1 = r11.f155913u
                r1 = r1 ^ r6
                com.avito.android.remote.Q r7 = r2.f155896a
                com.avito.android.analytics.event.favorite.SubscriptionSource r8 = com.avito.android.favorite_sellers.C30596u.f156140a
                java.lang.String r8 = r8.f90042b
                java.lang.String r9 = r5.getF155494c()
                r11.f155911s = r12
                r11.f155909q = r1
                r11.f155910r = r4
                java.lang.Object r4 = r7.a(r8, r9, r1, r11)
                if (r4 != r0) goto L69
                return r0
            L69:
                r10 = r4
                r4 = r12
                r12 = r10
            L6c:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r7 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r7 == 0) goto Lb4
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                kotlin.G0 r12 = (kotlin.G0) r12
                com.avito.android.r0 r12 = r2.f155897b
                java.lang.String r2 = r5.getF155494c()
                r7 = 0
                if (r1 == 0) goto L85
                r8 = r6
                goto L86
            L85:
                r8 = r7
            L86:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
                r9 = 0
                r12.j(r9, r8, r2)
                r5.u3(r7)
                if (r1 == 0) goto L95
                r12 = r6
                goto L96
            L95:
                r12 = r7
            L96:
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
                r5.setNotificationsActivated(r12)
                com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$ChangeNotificationSuccess r12 = new com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$ChangeNotificationSuccess
                if (r1 == 0) goto La2
                goto La3
            La2:
                r6 = r7
            La3:
                r12.<init>(r5, r6)
                r11.f155911s = r9
                r11.f155910r = r3
                java.lang.Object r12 = r4.emit(r12, r11)
                if (r12 != r0) goto Lb1
                return r0
            Lb1:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Lb4:
                boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Lc7
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r0 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r0, r12)
                throw r12
            Lc7:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.C30589m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$changeNotifications$2", f = "FavoriteSellersInteractor.kt", i = {0}, l = {201, 203}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FavoriteSellersInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155915q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f155916r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f155917s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SubscribableItem f155919u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SubscribableItem subscribableItem, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f155919u = subscribableItem;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = C30589m.this.new b(this.f155919u, continuation);
            bVar.f155916r = interfaceC43172j;
            bVar.f155917s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155915q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f155916r;
                Throwable th2 = this.f155917s;
                FavoriteSellersInternalAction favoriteSellersInternalActionJ = C30589m.this.j(new C30591o(th2), th2);
                this.f155916r = interfaceC43172j;
                this.f155915q = 1;
                if (interfaceC43172j.emit(favoriteSellersInternalActionJ, this) == coroutine_suspended) {
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
                interfaceC43172j = this.f155916r;
                C42729a0.b(obj);
            }
            SubscribableItem subscribableItem = this.f155919u;
            subscribableItem.u3(false);
            FavoriteSellersInternalAction.ChangeNotificationProgress changeNotificationProgress = new FavoriteSellersInternalAction.ChangeNotificationProgress(subscribableItem, false);
            this.f155916r = null;
            this.f155915q = 2;
            if (interfaceC43172j.emit(changeNotificationProgress, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$loadFavoriteSellers$1", f = "FavoriteSellersInteractor.kt", i = {0, 1, 2, 3}, l = {91, 94, UpdateStatusCode.DialogButton.CONFIRM, 103, 110, 118, 120}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155920q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f155921r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f155922s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C30589m f155923t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, C30589m c30589m, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f155922s = z12;
            this.f155923t = c30589m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f155922s, this.f155923t, continuation);
            cVar.f155921r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.C30589m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$loadFavoriteSellers$2", f = "FavoriteSellersInteractor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.m$d */
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FavoriteSellersInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155924q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f155925r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f155926s;

        /* compiled from: FavoriteSellersInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorite_sellers.m$d$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, FavoriteSellersInternalAction> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Throwable f155928l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th2) {
                super(1);
                this.f155928l = th2;
            }

            @Override // Y41.l
            public final FavoriteSellersInternalAction invoke(String str) {
                return new FavoriteSellersInternalAction.LoadingError(this.f155928l);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = C30589m.this.new d(continuation);
            dVar.f155925r = interfaceC43172j;
            dVar.f155926s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            FavoriteSellersInternalAction favoriteSellersInternalActionJ;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155924q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f155925r;
                Throwable th2 = this.f155926s;
                if (!(th2 instanceof CancellationException)) {
                    boolean zA2 = K5.a(th2);
                    C30589m c30589m = C30589m.this;
                    if (zA2) {
                        c30589m.f155907l.x(null);
                        favoriteSellersInternalActionJ = new FavoriteSellersInternalAction.ShowEmptyMessage(th2);
                    } else {
                        favoriteSellersInternalActionJ = c30589m.j(new a(th2), th2);
                    }
                    this.f155925r = null;
                    this.f155924q = 1;
                    if (interfaceC43172j.emit(favoriteSellersInternalActionJ, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: FavoriteSellersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$loadFavoriteSellers$3", f = "FavoriteSellersInteractor.kt", i = {0}, l = {139, 145, 152}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155929q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f155930r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Uri f155932t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f155932t = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = C30589m.this.new e(this.f155932t, continuation);
            eVar.f155930r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155929q;
            C30589m c30589m = C30589m.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f155930r;
                com.avito.android.remote.Q q12 = c30589m.f155896a;
                String string = this.f155932t.toString();
                this.f155930r = interfaceC43172j;
                this.f155929q = 1;
                obj = q12.b(string, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f155930r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (!(typedResult instanceof TypedResult.Success)) {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                throw C35936s.a(error.getError(), error.getCause());
            }
            FavoriteSellersLoadingResult favoriteSellersLoadingResult = (FavoriteSellersLoadingResult) ((TypedResult.Success) typedResult).getResult();
            if (favoriteSellersLoadingResult instanceof FavoriteSellersLoadingResult.Ok) {
                FavoriteSellersLoadingResult.Ok ok2 = (FavoriteSellersLoadingResult.Ok) favoriteSellersLoadingResult;
                ArrayList arrayListA = c30589m.f155902g.a(ok2.getResult());
                Uri nextPage = ok2.getResult().getNextPage();
                if (nextPage != null) {
                    arrayListA = C42745f0.i0(new LoadingItem(nextPage), arrayListA);
                }
                FavoriteSellersInternalAction.NextPageLoaded nextPageLoaded = new FavoriteSellersInternalAction.NextPageLoaded(arrayListA);
                this.f155930r = null;
                this.f155929q = 2;
                if (interfaceC43172j.emit(nextPageLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (favoriteSellersLoadingResult instanceof FavoriteSellersLoadingResult.ListExpiredError) {
                InterfaceC43160i<FavoriteSellersInternalAction> interfaceC43160iC = c30589m.c(true);
                this.f155930r = null;
                this.f155929q = 3;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$loadFavoriteSellers$4", f = "FavoriteSellersInteractor.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.m$f */
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FavoriteSellersInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155933q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f155934r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f155935s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Uri f155937u;

        /* compiled from: FavoriteSellersInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "defaultMessage", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorite_sellers.m$f$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, FavoriteSellersInternalAction> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C30589m f155938l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Uri f155939m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Throwable f155940n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30589m c30589m, Uri uri, Throwable th2) {
                super(1);
                this.f155938l = c30589m;
                this.f155939m = uri;
                this.f155940n = th2;
            }

            @Override // Y41.l
            public final FavoriteSellersInternalAction invoke(String str) {
                String strA = str;
                C30589m c30589m = this.f155938l;
                if (c30589m.f155906k.c()) {
                    strA = c30589m.f155903h.a();
                }
                return new FavoriteSellersInternalAction.NextPageLoadingError(new ErrorItem(strA, this.f155939m), strA, this.f155940n);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Uri uri, Continuation<? super f> continuation) {
            super(3, continuation);
            this.f155937u = uri;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = C30589m.this.new f(this.f155937u, continuation);
            fVar.f155934r = interfaceC43172j;
            fVar.f155935s = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155933q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f155934r;
                Throwable th2 = this.f155935s;
                if (!(th2 instanceof CancellationException)) {
                    C30589m c30589m = C30589m.this;
                    FavoriteSellersInternalAction favoriteSellersInternalActionJ = c30589m.j(new a(c30589m, this.f155937u, th2), th2);
                    this.f155934r = null;
                    this.f155933q = 1;
                    if (interfaceC43172j.emit(favoriteSellersInternalActionJ, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: FavoriteSellersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$markSellersAsRead$1", f = "FavoriteSellersInteractor.kt", i = {0}, l = {388, 390}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$g */
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155941q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f155942r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<FavoriteSellersItem> f155944t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f155945u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f155946v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends FavoriteSellersItem> list, int i12, int i13, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f155944t = list;
            this.f155945u = i12;
            this.f155946v = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = C30589m.this.new g(this.f155944t, this.f155945u, this.f155946v, continuation);
            gVar.f155942r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.C30589m.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$markSellersAsViewed$1", f = "FavoriteSellersInteractor.kt", i = {0}, l = {399, Constants.MINIMAL_ERROR_STATUS_CODE}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$h */
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155947q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f155948r;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = C30589m.this.new h(continuation);
            hVar.f155948r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155947q;
            try {
            } catch (Throwable th2) {
                if (!(th2 instanceof CancellationException)) {
                    V2.f318762a.f(th2);
                }
            }
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f155948r;
                com.avito.android.remote.Q q12 = C30589m.this.f155896a;
                this.f155948r = interfaceC43172j;
                this.f155947q = 1;
                if (q12.e(this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f155948r;
                C42729a0.b(obj);
            }
            FavoriteSellersInternalAction.UpdateIsSellersViewed updateIsSellersViewed = new FavoriteSellersInternalAction.UpdateIsSellersViewed(true);
            this.f155948r = null;
            this.f155947q = 2;
            if (interfaceC43172j.emit(updateIsSellersViewed, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$unsubscribe$1", f = "FavoriteSellersInteractor.kt", i = {0, 1}, l = {209, 210, 213}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.favorite_sellers.m$i */
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C30589m f155950q;

        /* renamed from: r, reason: collision with root package name */
        public int f155951r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f155952s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SubscribableItem f155953t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C30589m f155954u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C30589m c30589m, SubscribableItem subscribableItem, Continuation continuation) {
            super(2, continuation);
            this.f155953t = subscribableItem;
            this.f155954u = c30589m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(this.f155954u, this.f155953t, continuation);
            iVar.f155952s = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) throws com.avito.android.util.ApiException {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f155951r
                r2 = 0
                com.avito.android.favorite_sellers.m r3 = r9.f155954u
                r4 = 3
                r5 = 2
                com.avito.android.favorite_sellers.SubscribableItem r6 = r9.f155953t
                r7 = 1
                if (r1 == 0) goto L39
                if (r1 == r7) goto L31
                if (r1 == r5) goto L29
                if (r1 != r4) goto L21
                com.avito.android.favorite_sellers.m r3 = r9.f155950q
                java.lang.Object r0 = r9.f155952s
                r6 = r0
                com.avito.android.favorite_sellers.SubscribableItem r6 = (com.avito.android.favorite_sellers.SubscribableItem) r6
                kotlin.C42729a0.b(r10)
                goto L8c
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                java.lang.Object r1 = r9.f155952s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L69
            L31:
                java.lang.Object r1 = r9.f155952s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L54
            L39:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f155952s
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                r6.V0(r7)
                com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$UnsubscriptionProgress r1 = new com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$UnsubscriptionProgress
                r1.<init>(r6, r7)
                r9.f155952s = r10
                r9.f155951r = r7
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L53
                return r0
            L53:
                r1 = r10
            L54:
                com.avito.android.remote.Q r10 = r3.f155896a
                com.avito.android.analytics.event.favorite.SubscriptionSource r7 = com.avito.android.favorite_sellers.C30596u.f156140a
                java.lang.String r7 = r7.f90042b
                java.lang.String r8 = r6.getF155494c()
                r9.f155952s = r1
                r9.f155951r = r5
                java.lang.Object r10 = r10.i(r7, r8, r2, r9)
                if (r10 != r0) goto L69
                return r0
            L69:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L9d
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                com.avito.android.remote.model.UnsubscribeResult r10 = (com.avito.android.remote.model.UnsubscribeResult) r10
                r6.V0(r2)
                com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$UnsubscriptionSuccess r10 = new com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction$UnsubscriptionSuccess
                r10.<init>(r6)
                r9.f155952s = r6
                r9.f155950q = r3
                r9.f155951r = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L8c
                return r0
            L8c:
                com.avito.android.r0 r10 = r3.f155897b
                java.lang.String r0 = r6.getF155494c()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r2 = 0
                r10.j(r1, r2, r0)
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            L9d:
                boolean r0 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Lb0
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r0 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r0, r10)
                throw r10
            Lb0:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.C30589m.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$unsubscribe$2", f = "FavoriteSellersInteractor.kt", i = {0, 0}, l = {223, 224}, m = "invokeSuspend", n = {"$this$catch", "error"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.favorite_sellers.m$j */
    public static final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FavoriteSellersInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155955q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f155956r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f155957s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SubscribableItem f155958t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C30589m f155959u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C30589m c30589m, SubscribableItem subscribableItem, Continuation continuation) {
            super(3, continuation);
            this.f155958t = subscribableItem;
            this.f155959u = c30589m;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            SubscribableItem subscribableItem = this.f155958t;
            j jVar = new j(this.f155959u, subscribableItem, continuation);
            jVar.f155956r = interfaceC43172j;
            jVar.f155957s = th2;
            return jVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Throwable th2;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155955q;
            SubscribableItem subscribableItem = this.f155958t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f155956r;
                th2 = this.f155957s;
                if (!(th2 instanceof CancellationException)) {
                    FavoriteSellersInternalAction.UnsubscriptionProgress unsubscriptionProgress = new FavoriteSellersInternalAction.UnsubscriptionProgress(subscribableItem, false);
                    this.f155956r = interfaceC43172j2;
                    this.f155957s = th2;
                    this.f155955q = 1;
                    if (interfaceC43172j2.emit(unsubscriptionProgress, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC43172j = interfaceC43172j2;
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                subscribableItem.V0(false);
                return G0.f406611a;
            }
            th2 = this.f155957s;
            interfaceC43172j = this.f155956r;
            C42729a0.b(obj);
            FavoriteSellersInternalAction favoriteSellersInternalActionJ = this.f155959u.j(new C30591o(th2), th2);
            this.f155956r = null;
            this.f155957s = null;
            this.f155955q = 2;
            if (interfaceC43172j.emit(favoriteSellersInternalActionJ, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            subscribableItem.V0(false);
            return G0.f406611a;
        }
    }

    @Inject
    public C30589m(@Y61.k com.avito.android.remote.Q q12, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k I30.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @InterfaceC29975l @Y61.k com.avito.android.common.a aVar2, @Y61.k InterfaceC30580d interfaceC30580d, @Y61.k InterfaceC30583g interfaceC30583g, @Y61.k L l12, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.connection_quality.connectivity.a aVar3, @Y61.k V v12, @Y61.k R0 r02) {
        this.f155896a = q12;
        this.f155897b = interfaceC34162r0;
        this.f155898c = dVar;
        this.f155899d = aVar;
        this.f155900e = aVar2;
        this.f155901f = interfaceC30580d;
        this.f155902g = interfaceC30583g;
        this.f155903h = l12;
        this.f155904i = interfaceC50647a;
        this.f155905j = e12;
        this.f155906k = aVar3;
        this.f155907l = v12;
        this.f155908m = r02;
    }

    public static void k(List list, Boolean bool, Boolean bool2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscribableItem subscribableItem = (SubscribableItem) it.next();
            if (bool != null) {
                subscribableItem.setSubscribed(bool.booleanValue());
            }
            if (bool2 != null) {
                subscribableItem.setNotificationsActivated(bool2);
            }
        }
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final C43152f0 a(@Y61.k List list) {
        return new C43152f0(C43175k.G(new C30592p(list, this, null)), new C30593q(this, null));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final InterfaceC43160i<FavoriteSellersInternalAction> b() {
        return C43175k.G(new h(null));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final InterfaceC43160i<FavoriteSellersInternalAction> c(boolean z12) {
        return C43175k.I(this.f155908m.a(), new C43152f0(C43175k.G(new c(z12, this, null)), new d(null)));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final InterfaceC43160i d(int i12, int i13, @Y61.k List list) {
        return C43175k.G(new g(list, i13, i12, null));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final InterfaceC43160i<FavoriteSellersInternalAction> e(@Y61.k SubscribableItem subscribableItem) {
        if (!this.f155898c.b()) {
            return new C43210w(FavoriteSellersInternalAction.ShowNotificationsDialog.f156023b);
        }
        Boolean f155498g = subscribableItem.getF155498g();
        if (f155498g == null) {
            return C43175k.w();
        }
        return C43175k.I(this.f155908m.a(), new C43152f0(C43175k.G(new a(subscribableItem, f155498g.booleanValue(), this, null)), new b(subscribableItem, null)));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final C43152f0 f(@Y61.k SubscribableItem subscribableItem) {
        return new C43152f0(C43175k.G(new r(this, subscribableItem, null)), new C30594s(this, subscribableItem, null));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final InterfaceC43160i<FavoriteSellersInternalAction> g(@Y61.k Uri uri) {
        return C43175k.I(this.f155908m.a(), new C43152f0(C43175k.G(new e(uri, null)), new f(uri, null)));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final InterfaceC43160i<FavoriteSellersInternalAction> h(@Y61.k SubscribableItem subscribableItem) {
        return C43175k.I(this.f155908m.a(), new C43152f0(C43175k.G(new i(this, subscribableItem, null)), new j(this, subscribableItem, null)));
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30588l
    @Y61.k
    public final List i(@Y61.k String str, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.k List list) {
        k(C43033p.D(C43033p.i(C43033p.k(new C42770s0(list), SubscribableItem.class), new C30590n(str))), bool, bool2);
        return list;
    }

    public final FavoriteSellersInternalAction j(Y41.l lVar, Throwable th2) {
        InterfaceC50647a interfaceC50647a = this.f155904i;
        ApiError apiErrorA = interfaceC50647a.a(th2);
        return apiErrorA instanceof ApiError.ErrorDialog ? new FavoriteSellersInternalAction.ShowErrorDialog(((ApiError.ErrorDialog) interfaceC50647a.a(th2)).getUserDialog()) : (FavoriteSellersInternalAction) lVar.invoke(interfaceC50647a.b(apiErrorA));
    }
}
