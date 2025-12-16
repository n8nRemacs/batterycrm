package com.avito.android.comfortable_deal.repository;

import Jp.InterfaceC14233a;
import Pp.C14822a;
import Vp.C15704a;
import Vp.C15705b;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse;
import com.avito.android.comfortable_deal.api.model.IsContractSignedResponse;
import com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse;
import com.avito.android.comfortable_deal.generated.api.request_create_api_v_2.Source;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.comfortable_deal.repository.model.Fields;
import com.avito.android.comfortable_deal.repository.model.Sort;
import com.avito.android.comfortable_deal.repository.model.Stage;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import cq.C39396a;
import d20.C39487a;
import dp.C39776e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import org.threeten.bp.s;

/* compiled from: ComfortableDealRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/repository/d;", "Lcom/avito/android/comfortable_deal/repository/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.comfortable_deal.repository.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC39387a> f122532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f122533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14233a f122534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AK0.l f122535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f122536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C39487a f122537f;

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcq/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcq/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$digitalRegistrationRecallRequest$2", f = "ComfortableDealRepository.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super C39396a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122538q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122540s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f122541t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f122542u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f122543v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f122540s = str;
            this.f122541t = str2;
            this.f122542u = str3;
            this.f122543v = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f122540s, this.f122541t, this.f122542u, this.f122543v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C39396a> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            C15704a c15704a;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122538q;
            boolean z12 = true;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14233a interfaceC14233a = d.this.f122534c;
                Long lZ02 = C43066x.z0(this.f122540s);
                if (lZ02 != null) {
                    c15704a = new C15704a(this.f122543v, lZ02.longValue());
                } else {
                    c15704a = null;
                }
                C15704a c15704a2 = c15704a;
                Source source = Source.ComfortableDeal;
                this.f122538q = 1;
                obj = interfaceC14233a.h(c15704a2, this.f122541t, this.f122542u, source, this);
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
            if (typedResult instanceof TypedResult.Error) {
                message = ((TypedResult.Error) typedResult).getError().getF244063c();
            } else {
                if (!(typedResult instanceof TypedResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                message = ((C15705b) ((TypedResult.Success) typedResult).getResult()).getMessage();
                z12 = false;
            }
            return new C39396a(this.f122542u, message, z12);
        }
    }

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$doTransition$2", f = "ComfortableDealRepository.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122544q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122546s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f122547t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, StageTransitionField> f122548u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, Map<String, ? extends StageTransitionField> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f122546s = str;
            this.f122547t = str2;
            this.f122548u = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new b(this.f122546s, this.f122547t, this.f122548u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String string;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122544q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, StageTransitionField> entry : this.f122548u.entrySet()) {
                    String key = entry.getKey();
                    StageTransitionField value = entry.getValue();
                    if (value.X()) {
                        if (value instanceof StageTransitionField.CommentField) {
                            string = ((StageTransitionField.CommentField) value).f122947b;
                        } else if (value instanceof StageTransitionField.DateTimeInputs) {
                            StageTransitionField.DateTimeInputs dateTimeInputs = (StageTransitionField.DateTimeInputs) value;
                            org.threeten.bp.o oVarR = org.threeten.bp.o.r();
                            int i13 = s.f422114e;
                            s sVarE = s.E(org.threeten.bp.f.G(dateTimeInputs.f122948b, dateTimeInputs.f122949c), oVarR, null);
                            org.threeten.bp.format.c cVar = m.f122614a;
                            w81.d.f(cVar, "formatter");
                            string = cVar.a(sVarE).toString();
                        } else if (value instanceof StageTransitionField.RadioGroup) {
                            string = ((StageTransitionField.RadioGroup) value).f122951b;
                        } else {
                            if (!(value instanceof StageTransitionField.Input)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string = ((StageTransitionField.Input) value).f122950b;
                        }
                        if (string != null) {
                            linkedHashMap.put(this.f122547t + '[' + key + ']', string);
                        }
                    }
                }
                this.f122544q = 1;
                obj = interfaceC39387aY.l(this.f122546s, linkedHashMap, this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal/api/model/AgentRoomDealResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getAgentRoomDeal$2", f = "ComfortableDealRepository.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<AgentRoomDealResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122549q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122551s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f122551s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new c(this.f122551s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<AgentRoomDealResponse>> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122549q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122549q = 1;
                obj = interfaceC39387aY.d(this.f122551s, this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal/api/model/AgentRoomDealResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getAgentRoomDealByUUID$2", f = "ComfortableDealRepository.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.repository.d$d, reason: collision with other inner class name */
    public static final class C3629d extends SuspendLambda implements p<T, Continuation<? super TypedResult<AgentRoomDealResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122552q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122554s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3629d(String str, Continuation<? super C3629d> continuation) {
            super(2, continuation);
            this.f122554s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new C3629d(this.f122554s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<AgentRoomDealResponse>> continuation) {
            return ((C3629d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:197:0x04c1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r47) {
            /*
                Method dump skipped, instructions count: 1388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.repository.d.C3629d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ldp/e;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getClientRoomDeal$2", f = "ComfortableDealRepository.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super TypedResult<C39776e>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122555q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C39776e>> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122555q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122555q = 1;
                obj = interfaceC39387aY.a(this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getReportForAgent$2", f = "ComfortableDealRepository.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super TypedResult<G0>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122557q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f122558r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f122559s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d dVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f122558r = str;
            this.f122559s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f122559s, this.f122558r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<G0>> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122557q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Long lZ02 = C43066x.z0(this.f122558r);
                if (lZ02 == null) {
                    return new TypedResult.Error(com.avito.android.remote.error.j.d(3, null), null, 2, null);
                }
                long jLongValue = lZ02.longValue();
                InterfaceC14233a interfaceC14233a = this.f122559s.f122534c;
                this.f122557q = 1;
                obj = interfaceC14233a.j(jLongValue, this);
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
                return new TypedResult.Success(G0.f406611a);
            }
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ldp/o;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getUserType$2", f = "ComfortableDealRepository.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super TypedResult<dp.o>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122560q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122562s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f122562s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new g(this.f122562s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<dp.o>> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122560q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122560q = 1;
                obj = interfaceC39387aY.j(this.f122562s, this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal/api/model/IsContractSignedResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$isContractSigned$2", f = "ComfortableDealRepository.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<T, Continuation<? super TypedResult<IsContractSignedResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122563q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new h(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<IsContractSignedResponse>> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122563q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122563q = 1;
                obj = interfaceC39387aY.c(this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LPp/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$redirectToVdr$2", f = "ComfortableDealRepository.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements p<T, Continuation<? super TypedResult<C14822a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122565q;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new i(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C14822a>> continuation) {
            return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122565q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14233a interfaceC14233a = d.this.f122534c;
                this.f122565q = 1;
                obj = interfaceC14233a.b(null, this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$saveComment$2", f = "ComfortableDealRepository.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122567q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122569s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f122570t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f122569s = str;
            this.f122570t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new j(this.f122569s, this.f122570t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122567q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122567q = 1;
                obj = interfaceC39387aY.n(this.f122569s, this.f122570t, this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$setAgent$2", f = "ComfortableDealRepository.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122571q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122573s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f122574t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f122573s = str;
            this.f122574t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new k(this.f122573s, this.f122574t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122571q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122571q = 1;
                obj = interfaceC39387aY.e(this.f122573s, this.f122574t, this);
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

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$signContract$2", f = "ComfortableDealRepository.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122575q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f122577s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f122577s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new l(this.f122577s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122575q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39387a interfaceC39387aY = d.y(d.this);
                this.f122575q = 1;
                obj = interfaceC39387aY.b(this.f122577s, this);
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

    @Inject
    public d(@Y61.k h31.e<InterfaceC39387a> eVar, @Y61.k R0 r02, @Y61.k InterfaceC14233a interfaceC14233a, @Y61.k AK0.l lVar, @Y61.k com.avito.android.P p12, @Y61.k C39487a c39487a) {
        this.f122532a = eVar;
        this.f122533b = r02;
        this.f122534c = interfaceC14233a;
        this.f122535d = lVar;
        this.f122536e = p12;
        this.f122537f = c39487a;
    }

    public static final LinkedHashMap x(d dVar, int i12, List list, int i13) {
        dVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page[base][size]", String.valueOf(i13));
        linkedHashMap.put("page[base][number]", String.valueOf(i12));
        Fields[] fieldsArr = Fields.f122621b;
        linkedHashMap.put("page[sort][0][field]", "created_at");
        Sort[] sortArr = Sort.f122623b;
        linkedHashMap.put("page[sort][0][direction]", "desc");
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            ((Stage) obj).getClass();
            linkedHashMap.put("spec[stageIn][" + i14 + ']', "meeting");
            i14 = i15;
        }
        return linkedHashMap;
    }

    public static final InterfaceC39387a y(d dVar) {
        return dVar.f122532a.get();
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object a(@Y61.k Continuation<? super TypedResult<C39776e>> continuation) {
        return C43259k.g(this.f122533b.a(), new e(null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.k Continuation<? super TypedResult<Object>> continuation) {
        return C43259k.g(this.f122533b.a(), new l(str, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object c(@Y61.k Continuation<? super TypedResult<IsContractSignedResponse>> continuation) {
        return C43259k.g(this.f122533b.a(), new h(null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object d(@Y61.k String str, @Y61.k Continuation<? super TypedResult<AgentRoomDealResponse>> continuation) {
        return C43259k.g(this.f122533b.a(), new c(str, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object e(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<Object>> continuation) {
        return C43259k.g(this.f122533b.a(), new k(str, str2, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    public final void f(@Y61.k String str) {
        this.f122535d.putBoolean("cd_mortgage_banner_visible_".concat(str), false);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object g(@Y61.k String str, @Y61.k String str2, @Y61.k Map<String, ? extends StageTransitionField> map, @Y61.k Continuation<? super TypedResult<Object>> continuation) {
        return C43259k.g(this.f122533b.a(), new b(str, str2, map, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.comfortable_deal.repository.k
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.comfortable_deal.repository.k r0 = (com.avito.android.comfortable_deal.repository.k) r0
            int r1 = r0.f122607s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122607s = r1
            goto L18
        L13:
            com.avito.android.comfortable_deal.repository.k r0 = new com.avito.android.comfortable_deal.repository.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f122605q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f122607s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r7)
            goto L40
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.C42729a0.b(r7)
            r0.f122607s = r4
            Jp.a r7 = r5.f122534c
            java.lang.Object r7 = r7.a(r6, r3, r0)
            if (r7 != r1) goto L40
            return r1
        L40:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L62
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            Qp.a r6 = (Qp.C14921a) r6
            java.lang.Boolean r6 = r6.getResult()
            if (r6 == 0) goto L58
            boolean r3 = r6.booleanValue()
        L58:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
            r7.<init>(r6)
            goto L66
        L62:
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto L67
        L66:
            return r7
        L67:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.repository.d.h(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object i(int i12, @Y61.k List list, int i13, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.c(this, i12, list, i13, null), suspendLambda);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object j(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Continuation<? super C39396a> continuation) {
        return C43259k.g(this.f122533b.a(), new a(str, str4, str3, str2, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object k(@Y61.k String str, @Y61.k Continuation<? super TypedResult<AgentRoomDealResponse>> continuation) {
        return C43259k.g(this.f122533b.a(), new C3629d(str, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object l(@Y61.k Continuation<? super TypedResult<DealStageApiResponse>> continuation) {
        return this.f122534c.g(continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object m(@Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.e(this, null), suspendLambda);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object n(@Y61.k String str, @Y61.k Continuation<? super TypedResult<G0>> continuation) {
        return C43259k.g(this.f122533b.a(), new f(this, str, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object o(@Y61.k Continuation<? super TypedResult<C14822a>> continuation) {
        return C43259k.g(this.f122533b.a(), new i(null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object p(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<Object>> continuation) {
        return C43259k.g(this.f122533b.a(), new j(str, str2, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object q(int i12, @Y61.k List list, int i13, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.b(this, i12, list, i13, null), suspendLambda);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object r(int i12, int i13, @Y61.l String str, boolean z12, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.i(i12, this, str, i13, z12, null), suspendLambda);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object s(@Y61.l String str, @Y61.k Continuation<? super TypedResult<dp.o>> continuation) {
        return C43259k.g(this.f122533b.a(), new g(str, null), continuation);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object t(@Y61.k String str, @Y61.l CommentsFilter commentsFilter, @Y61.k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.g(this, str, commentsFilter, null), continuationImpl);
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object u(@Y61.k String str, @Y61.k String str2, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.f(this, str, str2, null), suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@Y61.k java.lang.String r22, @Y61.l java.lang.String r23, @Y61.l java.lang.String r24, @Y61.l java.lang.String r25, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.repository.d.v(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.comfortable_deal.repository.a
    @Y61.l
    public final Object w(int i12, @Y61.k List list, int i13, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f122533b.a(), new com.avito.android.comfortable_deal.repository.j(this, i12, list, i13, null), suspendLambda);
    }
}
