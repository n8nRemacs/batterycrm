package com.avito.android.campaigns_sale_search.mvi;

import android.content.res.Resources;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import com.yandex.metrica.YandexMetricaDefaultValues;
import em.C40128c;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import um.b;
import um.e;
import vm.InterfaceC49348c;

/* compiled from: CampaignsSaleSearchActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lum/b;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lum/d;", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<um.b, CampaignsSaleSearchInternalAction, um.d> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f114635e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.campaigns_sale_search.network.a f114636a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49348c f114637b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Resources f114638c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CampaignsSaleSearchArguments f114639d;

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/a$a;", "", "<init>", "()V", "", "DEFAULT_THROTTLING_TIMEOUT", "J", "", "MINIMUM_QUERY_LENGTH", "I", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.campaigns_sale_search.mvi.a$a, reason: collision with other inner class name */
    public static final class C3347a {
        public /* synthetic */ C3347a(C42822w c42822w) {
            this();
        }

        public C3347a() {
        }
    }

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$10", f = "CampaignsSaleSearchActor.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114640q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114641r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.b f114642s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(um.b bVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f114642s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f114642s, continuation);
            bVar.f114641r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114640q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114641r;
                CampaignsSaleSearchInternalAction.SearchItemClicked searchItemClicked = new CampaignsSaleSearchInternalAction.SearchItemClicked(((b.o) this.f114642s).f440246a);
                this.f114640q = 1;
                if (interfaceC43172j.emit(searchItemClicked, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$11", f = "CampaignsSaleSearchActor.kt", i = {0}, l = {114, 123}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114643q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114644r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ um.b f114646t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Continuation continuation, um.b bVar) {
            super(2, continuation);
            this.f114646t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = a.this.new c(continuation, this.f114646t);
            cVar.f114644r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114643q;
            um.b bVar = this.f114646t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f114644r;
                CampaignsSaleSearchInternalAction.TrackClickStreamEvent trackClickStreamEvent = new CampaignsSaleSearchInternalAction.TrackClickStreamEvent(new C40128c(a.this.f114639d.f114634c, "sale.items", ((b.i) bVar).f440240a.f114598b));
                this.f114644r = interfaceC43172j;
                this.f114643q = 1;
                if (interfaceC43172j.emit(trackClickStreamEvent, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f114644r;
                C42729a0.b(obj);
            }
            CampaignsSaleSearchInternalAction.ShowOnDeleteAlertDialog showOnDeleteAlertDialog = new CampaignsSaleSearchInternalAction.ShowOnDeleteAlertDialog(((b.i) bVar).f440240a);
            this.f114644r = null;
            this.f114643q = 2;
            if (interfaceC43172j.emit(showOnDeleteAlertDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$12", f = "CampaignsSaleSearchActor.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114647q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114648r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ um.b f114650t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, um.b bVar) {
            super(2, continuation);
            this.f114650t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(continuation, this.f114650t);
            dVar.f114648r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114647q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114648r;
                InterfaceC43160i<CampaignsSaleSearchInternalAction> interfaceC43160iB = a.this.f114636a.b(((b.j) this.f114650t).f440241a.f114598b);
                this.f114647q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$13", f = "CampaignsSaleSearchActor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114651q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114652r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f114652r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114651q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114652r;
                CampaignsSaleSearchInternalAction.DismissBottomsheet dismissBottomsheet = CampaignsSaleSearchInternalAction.DismissBottomsheet.f114713b;
                this.f114651q = 1;
                if (interfaceC43172j.emit(dismissBottomsheet, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$14", f = "CampaignsSaleSearchActor.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114653q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114654r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.b f114655s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(um.b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f114655s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f114655s, continuation);
            fVar.f114654r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114653q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114654r;
                CampaignsSaleSearchInternalAction.InputChanged inputChanged = new CampaignsSaleSearchInternalAction.InputChanged(((b.p) this.f114655s).f440247a);
                this.f114653q = 1;
                if (interfaceC43172j.emit(inputChanged, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$15", f = "CampaignsSaleSearchActor.kt", i = {0, 1}, l = {139, 140, 141}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114656q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114657r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.d f114658s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ um.b f114659t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(um.d dVar, um.b bVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f114658s = dVar;
            this.f114659t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f114658s, this.f114659t, continuation);
            gVar.f114657r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
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
                int r1 = r6.f114656q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r7)
                goto L72
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r1 = r6.f114657r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5b
            L25:
                java.lang.Object r1 = r6.f114657r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L47
            L2d:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f114657r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$SetNavigationState r1 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$SetNavigationState
                um.e$b r5 = um.e.b.f440269a
                r1.<init>(r5)
                r6.f114657r = r7
                r6.f114656q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r7
            L47:
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$SaveLatestQuery r7 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$SaveLatestQuery
                um.d r4 = r6.f114658s
                java.lang.String r4 = r4.f440262b
                r7.<init>(r4)
                r6.f114657r = r1
                r6.f114656q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$FilterSelected r7 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$FilterSelected
                um.b r3 = r6.f114659t
                um.b$n r3 = (um.b.n) r3
                com.avito.android.campaigns_sale_search.mvi.entity.Filter r3 = r3.f440245a
                r7.<init>(r3)
                r3 = 0
                r6.f114657r = r3
                r6.f114656q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L72
                return r0
            L72:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.mvi.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$16", f = "CampaignsSaleSearchActor.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114660q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114661r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ um.b f114663t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Continuation continuation, um.b bVar) {
            super(2, continuation);
            this.f114663t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = a.this.new h(continuation, this.f114663t);
            hVar.f114661r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114660q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114661r;
                CampaignsSaleSearchInternalAction.TrackClickStreamEvent trackClickStreamEvent = new CampaignsSaleSearchInternalAction.TrackClickStreamEvent(new C40128c(a.this.f114639d.f114634c, "sale.discount", String.valueOf(((b.k) this.f114663t).f440242a)));
                this.f114660q = 1;
                if (interfaceC43172j.emit(trackClickStreamEvent, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$1", f = "CampaignsSaleSearchActor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114664q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114665r;

        public i() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(2, continuation);
            iVar.f114665r = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114664q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114665r;
                CampaignsSaleSearchInternalAction.SetNavigationState setNavigationState = new CampaignsSaleSearchInternalAction.SetNavigationState(e.b.f440269a);
                this.f114664q = 1;
                if (interfaceC43172j.emit(setNavigationState, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$2", f = "CampaignsSaleSearchActor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114666q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114667r;

        public j() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(2, continuation);
            jVar.f114667r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114666q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114667r;
                CampaignsSaleSearchInternalAction.SetNavigationState setNavigationState = new CampaignsSaleSearchInternalAction.SetNavigationState(e.a.f440268a);
                this.f114666q = 1;
                if (interfaceC43172j.emit(setNavigationState, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$3", f = "CampaignsSaleSearchActor.kt", i = {0, 1}, l = {56, 57, 58}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114668q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114669r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.d f114670s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(um.d dVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f114670s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = new k(this.f114670s, continuation);
            kVar.f114669r = obj;
            return kVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f114668q
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2e
                if (r1 == r5) goto L26
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                kotlin.C42729a0.b(r8)
                goto L72
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f114669r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5e
            L26:
                java.lang.Object r1 = r7.f114669r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L2e:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f114669r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                um.d r1 = r7.f114670s
                java.lang.String r1 = r1.f440265e
                if (r1 == 0) goto L61
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$InputChanged r6 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$InputChanged
                r6.<init>(r1)
                r7.f114669r = r8
                r7.f114668q = r5
                java.lang.Object r1 = r8.emit(r6, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$SetNavigationState r8 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$SetNavigationState
                um.e$b r5 = um.e.b.f440269a
                r8.<init>(r5)
                r7.f114669r = r1
                r7.f114668q = r4
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                kotlin.G0 r8 = kotlin.G0.f406611a
                goto L63
            L61:
                r1 = r8
                r8 = r2
            L63:
                if (r8 != 0) goto L72
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$NavigateBack r8 = com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction.NavigateBack.f114725b
                r7.f114669r = r2
                r7.f114668q = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L72
                return r0
            L72:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.mvi.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$4", f = "CampaignsSaleSearchActor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114671q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114672r;

        public l() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            l lVar = new l(2, continuation);
            lVar.f114672r = obj;
            return lVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114671q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114672r;
                CampaignsSaleSearchInternalAction.NavigateBack navigateBack = CampaignsSaleSearchInternalAction.NavigateBack.f114725b;
                this.f114671q = 1;
                if (interfaceC43172j.emit(navigateBack, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$5", f = "CampaignsSaleSearchActor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114673q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114674r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.b f114675s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(um.b bVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f114675s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = new m(this.f114675s, continuation);
            mVar.f114674r = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114673q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114674r;
                CampaignsSaleSearchInternalAction.HandleDeeplink handleDeeplink = new CampaignsSaleSearchInternalAction.HandleDeeplink(((b.h) this.f114675s).f440239a);
                this.f114673q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$6", f = "CampaignsSaleSearchActor.kt", i = {0}, l = {70, 79}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114676q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114677r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ um.b f114679t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Continuation continuation, um.b bVar) {
            super(2, continuation);
            this.f114679t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            n nVar = a.this.new n(continuation, this.f114679t);
            nVar.f114677r = obj;
            return nVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114676q;
            um.b bVar = this.f114679t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f114677r;
                CampaignsSaleSearchInternalAction.TrackClickStreamEvent trackClickStreamEvent = new CampaignsSaleSearchInternalAction.TrackClickStreamEvent(new C40128c(a.this.f114639d.f114634c, "sale.items", ((b.a) bVar).f440231a.f114598b));
                this.f114677r = interfaceC43172j;
                this.f114676q = 1;
                if (interfaceC43172j.emit(trackClickStreamEvent, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f114677r;
                C42729a0.b(obj);
            }
            CampaignsSaleSearchInternalAction.OpenAddItemToSaleBottomsheet openAddItemToSaleBottomsheet = new CampaignsSaleSearchInternalAction.OpenAddItemToSaleBottomsheet(((b.a) bVar).f440231a);
            this.f114677r = null;
            this.f114676q = 2;
            if (interfaceC43172j.emit(openAddItemToSaleBottomsheet, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$7", f = "CampaignsSaleSearchActor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114680q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114681r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.b f114682s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(um.b bVar, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f114682s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            o oVar = new o(this.f114682s, continuation);
            oVar.f114681r = obj;
            return oVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114680q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114681r;
                CampaignsSaleSearchInternalAction.DiscountForItemChosen discountForItemChosen = new CampaignsSaleSearchInternalAction.DiscountForItemChosen(((b.l) this.f114682s).f440243a);
                this.f114680q = 1;
                if (interfaceC43172j.emit(discountForItemChosen, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$8", f = "CampaignsSaleSearchActor.kt", i = {0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114683q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114684r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ um.b f114685s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f114686t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(a aVar, Continuation continuation, um.b bVar) {
            super(2, continuation);
            this.f114685s = bVar;
            this.f114686t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            p pVar = new p(this.f114686t, continuation, this.f114685s);
            pVar.f114684r = obj;
            return pVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114683q;
            um.b bVar = this.f114685s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f114684r;
                b.q qVar = (b.q) bVar;
                if (qVar.f440248a.length() > 0) {
                    this.f114686t.f114637b.d(qVar.f440248a);
                }
                CampaignsSaleSearchInternalAction.SetNavigationState setNavigationState = new CampaignsSaleSearchInternalAction.SetNavigationState(e.b.f440269a);
                this.f114684r = interfaceC43172j;
                this.f114683q = 1;
                if (interfaceC43172j.emit(setNavigationState, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f114684r;
                C42729a0.b(obj);
            }
            CampaignsSaleSearchInternalAction.SaveLatestQuery saveLatestQuery = new CampaignsSaleSearchInternalAction.SaveLatestQuery(((b.q) bVar).f440248a);
            this.f114684r = null;
            this.f114683q = 2;
            if (interfaceC43172j.emit(saveLatestQuery, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CampaignsSaleSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$9", f = "CampaignsSaleSearchActor.kt", i = {}, l = {97, 105}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114687q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114688r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ um.b f114690t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ um.d f114691u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(um.b bVar, um.d dVar, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f114690t = bVar;
            this.f114691u = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            q qVar = a.this.new q(this.f114690t, this.f114691u, continuation);
            qVar.f114688r = obj;
            return qVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114687q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114688r;
                a aVar = a.this;
                ArrayList arrayListC = aVar.f114637b.c(((b.t) this.f114690t).f440251a);
                if (arrayListC.isEmpty()) {
                    um.d dVar = this.f114691u;
                    InterfaceC43160i interfaceC43160iA = aVar.f114636a.a(dVar.f440262b, dVar.f440263c);
                    this.f114687q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CampaignsSaleSearchInternalAction.SearchHistoryLoaded searchHistoryLoaded = new CampaignsSaleSearchInternalAction.SearchHistoryLoaded(arrayListC);
                    this.f114687q = 2;
                    if (interfaceC43172j.emit(searchHistoryLoaded, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    static {
        new C3347a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.campaigns_sale_search.network.a aVar, @Y61.k InterfaceC49348c interfaceC49348c, @Y61.k Resources resources, @Y61.k CampaignsSaleSearchArguments campaignsSaleSearchArguments) {
        this.f114636a = aVar;
        this.f114637b = interfaceC49348c;
        this.f114638c = resources;
        this.f114639d = campaignsSaleSearchArguments;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new com.avito.android.campaigns_sale_search.mvi.f(aVar, this, null), c43197r1), C43175k.Y(C43175k.n(new com.avito.android.campaigns_sale_search.mvi.b(c43197r1), 300L), new com.avito.android.campaigns_sale_search.mvi.d(aVar, this, null)), C43175k.Y(new com.avito.android.campaigns_sale_search.mvi.c(c43197r1), new com.avito.android.campaigns_sale_search.mvi.e(aVar, this, null)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CampaignsSaleSearchInternalAction> b(@Y61.k um.b bVar, @Y61.k um.d dVar) {
        return bVar.equals(b.g.f440238a) ? C43175k.G(new i(2, null)) : bVar.equals(b.f.f440237a) ? C43175k.G(new j(2, null)) : bVar.equals(b.e.f440236a) ? C43175k.G(new k(dVar, null)) : bVar.equals(b.c.f440234a) ? C43175k.G(new l(2, null)) : bVar instanceof b.h ? C43175k.G(new m(bVar, null)) : bVar instanceof b.a ? C43175k.G(new n(null, bVar)) : bVar instanceof b.l ? C43175k.G(new o(bVar, null)) : bVar instanceof b.q ? C43175k.G(new p(this, null, bVar)) : bVar instanceof b.t ? C43175k.G(new q(bVar, dVar, null)) : bVar instanceof b.o ? C43175k.G(new b(bVar, null)) : bVar instanceof b.i ? C43175k.G(new c(null, bVar)) : bVar instanceof b.j ? C43175k.G(new d(null, bVar)) : bVar.equals(b.d.f440235a) ? C43175k.G(new e(2, null)) : bVar instanceof b.p ? C43175k.G(new f(bVar, null)) : bVar instanceof b.n ? C43175k.G(new g(dVar, bVar, null)) : bVar instanceof b.k ? C43175k.G(new h(null, bVar)) : new C43207v(new CampaignsSaleSearchInternalAction[0]);
    }
}
