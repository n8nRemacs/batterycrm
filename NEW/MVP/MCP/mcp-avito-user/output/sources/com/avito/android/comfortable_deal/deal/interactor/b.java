package com.avito.android.comfortable_deal.deal.interactor;

import Ip.C14141a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.api.model.CalculationInfo;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import com.avito.android.comfortable_deal.api.model.DealIncome;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.deal.model.DealArguments;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.comfortable_deal.deal_income_details.model.DealIncomeDetailsDialogArguments;
import com.avito.android.comfortable_deal.deeplink.CommissionCalculationDetailsDeeplink;
import com.avito.android.comfortable_deal.deeplink.DealIncomeDetailsDeeplink;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import dp.f;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zp.C50605d;

/* compiled from: DealInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/interactor/b;", "Lcom/avito/android/comfortable_deal/deal/interactor/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comfortable_deal.deal.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.repository.a f121088a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.deal.item.completion.analytics.a f121089b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14141a f121090c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DealArguments f121091d;

    /* compiled from: DealInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$loadDealData$1", f = "DealInteractor.kt", i = {0}, l = {61, 62}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121092q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121093r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CommentsFilter f121095t;

        /* compiled from: DealInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$loadDealData$1$1", f = "DealInteractor.kt", i = {0, 1, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, l = {66, 70, 75, 96, UpdateStatusCode.DialogButton.CONFIRM, 106, 109}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$coroutineScope", "responseBuilder", "dealResult", "commentsResponse", "mortgageLinkResponse", "responseBuilder", "dealResult", "mortgageLinkResponse", "responseBuilder", "dealResult", "dealResult"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
        /* renamed from: com.avito.android.comfortable_deal.deal.interactor.b$a$a, reason: collision with other inner class name */
        public static final class C3571a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object f121096q;

            /* renamed from: r, reason: collision with root package name */
            public Object f121097r;

            /* renamed from: s, reason: collision with root package name */
            public Object f121098s;

            /* renamed from: t, reason: collision with root package name */
            public int f121099t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f121100u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ b f121101v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<DealInternalAction> f121102w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ CommentsFilter f121103x;

            /* compiled from: DealInteractor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$loadDealData$1$1$analyticResponse$1", f = "DealInteractor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.deal.interactor.b$a$a$a, reason: collision with other inner class name */
            public static final class C3572a extends SuspendLambda implements p<T, Continuation<? super TypedResult<G0>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f121104q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ b f121105r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f121106s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3572a(b bVar, String str, Continuation<? super C3572a> continuation) {
                    super(2, continuation);
                    this.f121105r = bVar;
                    this.f121106s = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C3572a(this.f121105r, this.f121106s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<G0>> continuation) {
                    return ((C3572a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f121104q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.comfortable_deal.repository.a aVar = this.f121105r.f121088a;
                        this.f121104q = 1;
                        obj = aVar.n(this.f121106s, this);
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

            /* compiled from: DealInteractor.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "Ldp/f;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$loadDealData$1$1$commentsResponse$1", f = "DealInteractor.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.deal.interactor.b$a$a$b, reason: collision with other inner class name */
            public static final class C3573b extends SuspendLambda implements p<T, Continuation<? super TypedResult<List<? extends f>>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f121107q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ b f121108r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f121109s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ CommentsFilter f121110t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3573b(b bVar, String str, CommentsFilter commentsFilter, Continuation<? super C3573b> continuation) {
                    super(2, continuation);
                    this.f121108r = bVar;
                    this.f121109s = str;
                    this.f121110t = commentsFilter;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C3573b(this.f121108r, this.f121109s, this.f121110t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<List<? extends f>>> continuation) {
                    return ((C3573b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f121107q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.comfortable_deal.repository.a aVar = this.f121108r.f121088a;
                        this.f121107q = 1;
                        obj = aVar.t(this.f121109s, this.f121110t, this);
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

            /* compiled from: DealInteractor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/deep_linking/links/DeepLink;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$loadDealData$1$1$mortgageLinkResponse$1", f = "DealInteractor.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.deal.interactor.b$a$a$c */
            public static final class c extends SuspendLambda implements p<T, Continuation<? super DeepLink>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f121111q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ b f121112r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f121113s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f121114t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f121115u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ CurrentStage f121116v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(b bVar, String str, String str2, String str3, CurrentStage currentStage, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f121112r = bVar;
                    this.f121113s = str;
                    this.f121114t = str2;
                    this.f121115u = str3;
                    this.f121116v = currentStage;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new c(this.f121112r, this.f121113s, this.f121114t, this.f121115u, this.f121116v, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super DeepLink> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f121111q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.comfortable_deal.repository.a aVar = this.f121112r.f121088a;
                        CurrentStage currentStage = this.f121116v;
                        String strA = currentStage != null ? C50605d.a(currentStage) : null;
                        this.f121111q = 1;
                        obj = aVar.v(this.f121113s, this.f121114t, this.f121115u, strA, this);
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
            public C3571a(b bVar, InterfaceC43172j<? super DealInternalAction> interfaceC43172j, CommentsFilter commentsFilter, Continuation<? super C3571a> continuation) {
                super(2, continuation);
                this.f121101v = bVar;
                this.f121102w = interfaceC43172j;
                this.f121103x = commentsFilter;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C3571a c3571a = new C3571a(this.f121101v, this.f121102w, this.f121103x, continuation);
                c3571a.f121100u = obj;
                return c3571a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3571a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01bf A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01c0  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01ff A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0200  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0223  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 744
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.interactor.b.a.C3571a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommentsFilter commentsFilter, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f121095t = commentsFilter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f121095t, continuation);
            aVar.f121093r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f121092q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f121093r;
                DealInternalAction.StartLoading startLoading = new DealInternalAction.StartLoading();
                this.f121093r = interfaceC43172j;
                this.f121092q = 1;
                if (interfaceC43172j.emit(startLoading, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f121093r;
                C42729a0.b(obj);
            }
            C3571a c3571a = new C3571a(b.this, interfaceC43172j, this.f121095t, null);
            this.f121093r = null;
            this.f121092q = 2;
            if (U.c(c3571a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$openDeeplink$1", f = "DealInteractor.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.deal.interactor.b$b, reason: collision with other inner class name */
    public static final class C3574b extends SuspendLambda implements p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121117q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121118r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DeepLink f121119s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Ep.c f121120t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f121121u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3574b(DeepLink deepLink, Ep.c cVar, b bVar, Continuation<? super C3574b> continuation) {
            super(2, continuation);
            this.f121119s = deepLink;
            this.f121120t = cVar;
            this.f121121u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C3574b c3574b = new C3574b(this.f121119s, this.f121120t, this.f121121u, continuation);
            c3574b.f121118r = obj;
            return c3574b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3574b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            CalculationInfo calculationInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f121117q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f121118r;
                DeepLink deepLink = this.f121119s;
                boolean z12 = deepLink instanceof CommissionCalculationDetailsDeeplink;
                Bundle bundle = null;
                Ep.c cVar = this.f121120t;
                if (z12) {
                    CalculationInfo calculationInfo2 = cVar.f4330g;
                    if (calculationInfo2 != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("CommissionCalculationDetailsArguments", new CommissionDetailsDialogArguments(calculationInfo2.getTitle(), calculationInfo2.getDescription(), calculationInfo2.getButtonTitle()));
                    }
                } else if (deepLink instanceof DealIncomeDetailsDeeplink) {
                    b bVar = this.f121121u;
                    C14141a c14141a = bVar.f121090c;
                    c14141a.getClass();
                    n<Object> nVar = C14141a.f8546e[2];
                    if (((Boolean) c14141a.f8549d.a().invoke()).booleanValue()) {
                        bVar.f121089b.a(cVar.f4325b, cVar.f4328e, cVar.f4327d, cVar.f4326c);
                    }
                    DealIncome dealIncome = cVar.f4329f;
                    if (dealIncome != null && (calculationInfo = cVar.f4330g) != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("DealIncomeDetailsArguments", new DealIncomeDetailsDialogArguments(dealIncome.getImage().c(), dealIncome.getBackgroundGradient(), dealIncome.getTitle(), dealIncome.getDescription(), dealIncome.getObjectPriceByContract(), dealIncome.getAgentCommission(), dealIncome.getProductCommission(), dealIncome.getProductCommissionRate()));
                        bundle.putParcelable("CommissionCalculationDetailsArguments", new CommissionDetailsDialogArguments(calculationInfo.getTitle(), calculationInfo.getDescription(), calculationInfo.getButtonTitle()));
                    }
                }
                DealInternalAction.OpenDeepLink openDeepLink = new DealInternalAction.OpenDeepLink(deepLink, bundle);
                this.f121117q = 1;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
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

    /* compiled from: DealInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$transitionEndDeal$1", f = "DealInteractor.kt", i = {0, 1, 3}, l = {168, 169, 171, 176, 177, 181}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121122q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121123r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StagesTransitionResultStrategy f121124s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f121125t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CommentsFilter f121126u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ EndDealSavedState f121127v;

        /* compiled from: DealInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[StagesTransitionResultStrategy.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Parcelable.Creator<StagesTransitionResultStrategy> creator = StagesTransitionResultStrategy.CREATOR;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Parcelable.Creator<StagesTransitionResultStrategy> creator2 = StagesTransitionResultStrategy.CREATOR;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StagesTransitionResultStrategy stagesTransitionResultStrategy, b bVar, CommentsFilter commentsFilter, EndDealSavedState endDealSavedState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f121124s = stagesTransitionResultStrategy;
            this.f121125t = bVar;
            this.f121126u = commentsFilter;
            this.f121127v = endDealSavedState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f121124s, this.f121125t, this.f121126u, this.f121127v, continuation);
            cVar.f121123r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
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
                int r1 = r6.f121122q
                com.avito.android.comfortable_deal.deal.interactor.b r2 = r6.f121125t
                r3 = 2
                r4 = 0
                switch(r1) {
                    case 0: goto L33;
                    case 1: goto L2b;
                    case 2: goto L22;
                    case 3: goto L15;
                    case 4: goto L1a;
                    case 5: goto L15;
                    case 6: goto L15;
                    default: goto Ld;
                }
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                kotlin.C42729a0.b(r7)
                goto Lb8
            L1a:
                java.lang.Object r1 = r6.f121123r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L6a
            L22:
                java.lang.Object r1 = r6.f121123r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto La4
            L2b:
                java.lang.Object r1 = r6.f121123r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L90
            L33:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f121123r
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy r7 = r6.f121124s
                int r7 = r7.ordinal()
                r5 = 1
                if (r7 == 0) goto L7f
                if (r7 == r5) goto L5c
                if (r7 == r3) goto L49
                goto Lb8
            L49:
                com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateTransitionData r7 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateTransitionData
                java.util.Map r2 = kotlin.collections.P0.c()
                r7.<init>(r4, r2)
                r2 = 6
                r6.f121122q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto Lb8
                return r0
            L5c:
                com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$ShowSaveEndDealDataDialog r7 = com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction.ShowSaveEndDealDataDialog.f121643b
                r6.f121123r = r1
                r2 = 4
                r6.f121122q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L6a
                return r0
            L6a:
                com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateEndDealData r7 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateEndDealData
                com.avito.android.comfortable_deal.api.model.ActionTransition r2 = com.avito.android.comfortable_deal.api.model.ActionTransition.Sold
                com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState r3 = r6.f121127v
                r7.<init>(r2, r3)
                r6.f121123r = r4
                r2 = 5
                r6.f121122q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto Lb8
                return r0
            L7f:
                com.avito.android.comfortable_deal.repository.model.CommentsFilter r7 = r6.f121126u
                kotlinx.coroutines.flow.i r7 = r2.a(r7)
                r6.f121123r = r1
                r6.f121122q = r5
                java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r7, r1)
                if (r7 != r0) goto L90
                return r0
            L90:
                com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateTransitionData r7 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateTransitionData
                java.util.Map r5 = kotlin.collections.P0.c()
                r7.<init>(r4, r5)
                r6.f121123r = r1
                r6.f121122q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto La4
                return r0
            La4:
                com.avito.android.comfortable_deal.deal.model.DealArguments r7 = r2.f121091d
                boolean r7 = r7 instanceof com.avito.android.comfortable_deal.deal.model.DealArguments.DealProcessIdArguments
                if (r7 == 0) goto Lb8
                com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$ReloadVdrList r7 = com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction.ReloadVdrList.f121635b
                r6.f121123r = r4
                r2 = 3
                r6.f121122q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto Lb8
                return r0
            Lb8:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.interactor.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.interactor.DealInteractorImpl$transitionStage$1", f = "DealInteractor.kt", i = {0, 1, 3}, l = {143, 144, 146, 151, 152, 156}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121128q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121129r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StagesTransitionResultStrategy f121130s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f121131t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ActionTransition f121132u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ CommentsFilter f121133v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Map<String, StageTransitionField> f121134w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ep.c f121135x;

        /* compiled from: DealInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[StagesTransitionResultStrategy.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Parcelable.Creator<StagesTransitionResultStrategy> creator = StagesTransitionResultStrategy.CREATOR;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Parcelable.Creator<StagesTransitionResultStrategy> creator2 = StagesTransitionResultStrategy.CREATOR;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(StagesTransitionResultStrategy stagesTransitionResultStrategy, b bVar, ActionTransition actionTransition, CommentsFilter commentsFilter, Map<String, ? extends StageTransitionField> map, Ep.c cVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f121130s = stagesTransitionResultStrategy;
            this.f121131t = bVar;
            this.f121132u = actionTransition;
            this.f121133v = commentsFilter;
            this.f121134w = map;
            this.f121135x = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = new d(this.f121130s, this.f121131t, this.f121132u, this.f121133v, this.f121134w, this.f121135x, continuation);
            dVar.f121129r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.interactor.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k com.avito.android.comfortable_deal.repository.a aVar, @k com.avito.android.comfortable_deal.deal.item.completion.analytics.a aVar2, @k C14141a c14141a, @k DealArguments dealArguments) {
        this.f121088a = aVar;
        this.f121089b = aVar2;
        this.f121090c = c14141a;
        this.f121091d = dealArguments;
    }

    @Override // com.avito.android.comfortable_deal.deal.interactor.a
    @k
    public final InterfaceC43160i<DealInternalAction> a(@l CommentsFilter commentsFilter) {
        return C43175k.G(new a(commentsFilter, null));
    }

    @Override // com.avito.android.comfortable_deal.deal.interactor.a
    @k
    public final InterfaceC43160i<DealInternalAction> b(@k StagesTransitionResultStrategy stagesTransitionResultStrategy, @l CommentsFilter commentsFilter, @l EndDealSavedState endDealSavedState) {
        return C43175k.G(new c(stagesTransitionResultStrategy, this, commentsFilter, endDealSavedState, null));
    }

    @Override // com.avito.android.comfortable_deal.deal.interactor.a
    @k
    public final InterfaceC43160i<DealInternalAction> c(@k Ep.c cVar, @k StagesTransitionResultStrategy stagesTransitionResultStrategy, @l ActionTransition actionTransition, @l CommentsFilter commentsFilter, @k Map<String, ? extends StageTransitionField> map) {
        return C43175k.G(new d(stagesTransitionResultStrategy, this, actionTransition, commentsFilter, map, cVar, null));
    }

    @Override // com.avito.android.comfortable_deal.deal.interactor.a
    @k
    public final InterfaceC43160i<DealInternalAction> d(@k Ep.c cVar, @k DeepLink deepLink) {
        return C43175k.G(new C3574b(deepLink, cVar, this, null));
    }
}
