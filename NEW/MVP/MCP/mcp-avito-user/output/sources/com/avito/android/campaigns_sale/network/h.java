package com.avito.android.campaigns_sale.network;

import com.avito.android.Z0;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleGetImagesResult;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import jm.InterfaceC42397a;
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
import lj.InterfaceC43779a;
import om.InterfaceC44818a;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/network/h;", "Lcom/avito/android/campaigns_sale/network/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.campaigns_sale.network.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CampaignsSaleArguments f114334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44818a> f114335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC42397a> f114336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f114337d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f114338e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f114339f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Z0 f114340g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final x f114341h;

    /* compiled from: CampaignsSaleInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$exitSale$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 2, 3}, l = {280, 281, 283, 284, 285, 289}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114342q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114343r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f114343r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f114342q
                r2 = 0
                com.avito.android.campaigns_sale.network.h r3 = com.avito.android.campaigns_sale.network.h.this
                switch(r1) {
                    case 0: goto L3a;
                    case 1: goto L32;
                    case 2: goto L2a;
                    case 3: goto L22;
                    case 4: goto L19;
                    case 5: goto L14;
                    case 6: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L14:
                kotlin.C42729a0.b(r7)
                goto Lc5
            L19:
                java.lang.Object r1 = r6.f114343r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L9c
            L22:
                java.lang.Object r1 = r6.f114343r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L81
            L2a:
                java.lang.Object r1 = r6.f114343r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L6b
            L32:
                java.lang.Object r1 = r6.f114343r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L53
            L3a:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f114343r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$PageLoading r1 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$PageLoading
                r1.<init>()
                r6.f114343r = r7
                r4 = 1
                r6.f114342q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L52
                return r0
            L52:
                r1 = r7
            L53:
                h31.e<om.a> r7 = r3.f114335b
                java.lang.Object r7 = r7.get()
                om.a r7 = (om.InterfaceC44818a) r7
                com.avito.android.campaigns_sale.model.CampaignsSaleArguments r4 = r3.f114334a
                java.lang.String r4 = r4.f114050b
                r6.f114343r = r1
                r5 = 2
                r6.f114342q = r5
                java.lang.Object r7 = r7.g(r4, r6)
                if (r7 != r0) goto L6b
                return r0
            L6b:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto Laa
                kotlinx.coroutines.flow.i r7 = com.avito.android.campaigns_sale.network.h.g(r3)
                r6.f114343r = r1
                r3 = 3
                r6.f114342q = r3
                java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r7, r1)
                if (r7 != r0) goto L81
                return r0
            L81:
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowToast r7 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowToast
                r3 = 0
                java.io.Serializable[] r3 = new java.io.Serializable[r3]
                r4 = 2131952627(0x7f1303f3, float:1.9541702E38)
                com.avito.android.printable_text.PrintableText r3 = com.avito.android.printable_text.b.c(r4, r3)
                r7.<init>(r3)
                r6.f114343r = r1
                r3 = 4
                r6.f114342q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L9c
                return r0
            L9c:
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowExitSaleUxFeedbackPoll r7 = com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction.ShowExitSaleUxFeedbackPoll.f114180b
                r6.f114343r = r2
                r2 = 5
                r6.f114342q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto Lc5
                return r0
            Laa:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lc5
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleApiError r3 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleApiError
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r3.<init>(r7)
                r6.f114343r = r2
                r7 = 6
                r6.f114342q = r7
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$exitSale$2", f = "CampaignsSaleInteractorImpl.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CampaignsSaleInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114345q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f114346r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f114347s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f114346r = interfaceC43172j;
            bVar.f114347s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114345q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f114346r;
                CampaignsSaleInternalAction.HandleInternalError handleInternalError = new CampaignsSaleInternalAction.HandleInternalError(this.f114347s);
                this.f114346r = null;
                this.f114345q = 1;
                if (interfaceC43172j.emit(handleInternalError, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$getImages$1", f = "CampaignsSaleInteractorImpl.kt", i = {0}, l = {431, 434, 438}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114348q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114349r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Long> f114351t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f114352u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Long> list, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f114351t = list;
            this.f114352u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = h.this.new c(this.f114351t, this.f114352u, continuation);
            cVar.f114349r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114348q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f114349r;
                InterfaceC44818a interfaceC44818a = h.this.f114335b.get();
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(this.f114351t, "itemIds");
                this.f114349r = interfaceC43172j;
                this.f114348q = 1;
                obj = interfaceC44818a.h(mapH, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f114349r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                CampaignsSaleInternalAction.ImagesLoaded imagesLoaded = new CampaignsSaleInternalAction.ImagesLoaded(this.f114352u, ((CampaignsSaleGetImagesResult) ((TypedResult.Success) typedResult).getResult()).getImages());
                this.f114349r = null;
                this.f114348q = 2;
                if (interfaceC43172j.emit(imagesLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Error) {
                CampaignsSaleInternalAction.HandleApiError handleApiError = new CampaignsSaleInternalAction.HandleApiError(((TypedResult.Error) typedResult).getError());
                this.f114349r = null;
                this.f114348q = 3;
                if (interfaceC43172j.emit(handleApiError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CampaignsSaleInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$getImages$2", f = "CampaignsSaleInteractorImpl.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CampaignsSaleInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114353q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f114354r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f114355s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f114354r = interfaceC43172j;
            dVar.f114355s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114353q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f114354r;
                CampaignsSaleInternalAction.HandleInternalError handleInternalError = new CampaignsSaleInternalAction.HandleInternalError(this.f114355s);
                this.f114354r = null;
                this.f114353q = 1;
                if (interfaceC43172j.emit(handleInternalError, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$loadPage$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}, l = {51, 53, 59, 68, 74, 75, 84, 86, 87, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91, 95}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "blocksWithId"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f114356q;

        /* renamed from: r, reason: collision with root package name */
        public int f114357r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f114358s;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = h.this.new e(continuation);
            eVar.f114358s = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x012f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0143 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x018d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01c6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01ea A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0201 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0202  */
        /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$loadPage$2", f = "CampaignsSaleInteractorImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CampaignsSaleInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114360q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f114361r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f114362s;

        public f() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = new f(3, continuation);
            fVar.f114361r = interfaceC43172j;
            fVar.f114362s = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114360q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f114361r;
                CampaignsSaleInternalAction.HandleInternalError handleInternalError = new CampaignsSaleInternalAction.HandleInternalError(this.f114362s);
                this.f114361r = null;
                this.f114360q = 1;
                if (interfaceC43172j.emit(handleInternalError, this) == coroutine_suspended) {
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
    public h(@Y61.k CampaignsSaleArguments campaignsSaleArguments, @Y61.k h31.e<InterfaceC44818a> eVar, @Y61.k h31.e<InterfaceC42397a> eVar2, @Y61.k R0 r02, @com.avito.android.campaigns_sale.di.p @Y61.k String str, @Y61.k InterfaceC43779a interfaceC43779a, @Y61.k Z0 z02, @Y61.k x xVar) {
        this.f114334a = campaignsSaleArguments;
        this.f114335b = eVar;
        this.f114336c = eVar2;
        this.f114337d = r02;
        this.f114338e = str;
        this.f114339f = interfaceC43779a;
        this.f114340g = z02;
        this.f114341h = xVar;
    }

    public static final InterfaceC43160i g(h hVar) {
        hVar.getClass();
        return C43175k.I(hVar.f114337d.a(), new C43152f0(C43175k.G(new m(hVar, null)), new n(3, null)));
    }

    @Override // com.avito.android.campaigns_sale.network.a
    @Y61.k
    public final InterfaceC43160i<CampaignsSaleInternalAction> a() {
        return C43175k.I(this.f114337d.a(), new C43152f0(C43175k.G(new e(null)), new f(3, null)));
    }

    @Override // com.avito.android.campaigns_sale.network.a
    @Y61.k
    public final InterfaceC43160i b(@Y61.k ArrayList arrayList, boolean z12, @Y61.l DeepLink deepLink) {
        Z0 z02 = this.f114340g;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[15];
        boolean zBooleanValue = ((Boolean) z02.f67615r.a().invoke()).booleanValue();
        R0 r02 = this.f114337d;
        if (zBooleanValue) {
            return C43175k.I(r02.a(), new C43152f0(C43175k.G(new q(z12, this, arrayList, deepLink, null)), new r(3, null)));
        }
        return C43175k.I(r02.a(), new C43152f0(C43175k.G(new o(z12, this, arrayList, deepLink, null)), new p(3, null)));
    }

    @Override // com.avito.android.campaigns_sale.network.a
    @Y61.k
    public final InterfaceC43160i c(@Y61.k String str, @Y61.k List list) {
        return C43175k.I(this.f114337d.a(), new C43152f0(C43175k.G(new c(list, str, null)), new d(3, null)));
    }

    @Override // com.avito.android.campaigns_sale.network.a
    @Y61.k
    public final InterfaceC43160i d(@Y61.k ArrayList arrayList) {
        Z0 z02 = this.f114340g;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[15];
        return ((Boolean) z02.f67615r.a().invoke()).booleanValue() ? C43175k.G(new com.avito.android.campaigns_sale.network.c(this, arrayList, null)) : C43175k.G(new com.avito.android.campaigns_sale.network.b(this, arrayList, null));
    }

    @Override // com.avito.android.campaigns_sale.network.a
    @Y61.k
    public final InterfaceC43160i e(@Y61.k ArrayList arrayList, @Y61.l DeepLink deepLink) {
        Z0 z02 = this.f114340g;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[15];
        boolean zBooleanValue = ((Boolean) z02.f67615r.a().invoke()).booleanValue();
        R0 r02 = this.f114337d;
        if (zBooleanValue) {
            return C43175k.I(r02.a(), new C43152f0(C43175k.G(new com.avito.android.campaigns_sale.network.f(this, arrayList, deepLink, null)), new g(3, null)));
        }
        return C43175k.I(r02.a(), new C43152f0(C43175k.G(new com.avito.android.campaigns_sale.network.d(this, arrayList, deepLink, null)), new com.avito.android.campaigns_sale.network.e(3, null)));
    }

    @Override // com.avito.android.campaigns_sale.network.a
    @Y61.k
    public final InterfaceC43160i<CampaignsSaleInternalAction> f() {
        return C43175k.I(this.f114337d.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }

    public final InterfaceC43160i<CampaignsSaleInternalAction> h(Boolean bool) {
        Z0 z02 = this.f114340g;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[16];
        boolean zBooleanValue = ((Boolean) z02.f67616s.a().invoke()).booleanValue();
        R0 r02 = this.f114337d;
        if (zBooleanValue) {
            return C43175k.I(r02.a(), new C43152f0(C43175k.G(new k(this, bool, null)), new l(3, null)));
        }
        return C43175k.I(r02.a(), new C43152f0(C43175k.G(new i(this, bool, null)), new j(3, null)));
    }
}
