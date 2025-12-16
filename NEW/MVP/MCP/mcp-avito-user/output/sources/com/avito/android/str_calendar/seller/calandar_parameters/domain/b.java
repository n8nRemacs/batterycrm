package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.StrLocationItem;
import com.avito.android.remote.model.StrUxFeedbackInfoResponse;
import com.avito.android.remote.model.StrUxFeedbackItem;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import com.avito.android.str_calendar.seller.calandar_parameters.t;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36020m;
import java.util.Date;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/b;", "", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f286868a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f286869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36020m f286870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f286871d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final t f286872e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.mvi.k f286873f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.children.j f286874g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a f286875h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Cy0.b f286876i;

    /* compiled from: StrCalendarParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/b$a;", "", "<init>", "()V", "", "CITY_KEY", "Ljava/lang/String;", "", "DEFAULT_DEBOUNCE_MILLIS", "J", "TRX_ITEMS_COUNT_KEY", "USER_ID_HASH", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrCalendarParametersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$loadUxfParameters$1", f = "StrCalendarParametersInteractor.kt", i = {0}, l = {170, 172}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.domain.b$b, reason: collision with other inner class name */
    public static final class C8602b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286877q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286878r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f286880t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8602b(String str, Continuation<? super C8602b> continuation) {
            super(2, continuation);
            this.f286880t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C8602b c8602b = b.this.new C8602b(this.f286880t, continuation);
            c8602b.f286878r = obj;
            return c8602b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8602b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            StrLocationItem location;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286877q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f286878r;
                d1 d1Var = b.this.f286868a;
                this.f286878r = interfaceC43172j;
                this.f286877q = 1;
                obj = d1Var.c(this.f286880t, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f286878r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                StrUxFeedbackInfoResponse strUxFeedbackInfoResponse = (StrUxFeedbackInfoResponse) ((TypedResult.Success) typedResult).getResult();
                SK0.f fVar = new SK0.f();
                StrUxFeedbackItem item = strUxFeedbackInfoResponse.getItem();
                String cityName = (item == null || (location = item.getLocation()) == null) ? null : location.getCityName();
                if (cityName == null) {
                    cityName = "";
                }
                fVar.a("city", cityName);
                Integer trxItemsCount = strUxFeedbackInfoResponse.getTrxItemsCount();
                String string = trxItemsCount != null ? trxItemsCount.toString() : null;
                if (string == null) {
                    string = "";
                }
                fVar.a("trxItemsCount", string);
                String userIdHash = strUxFeedbackInfoResponse.getUserIdHash();
                fVar.a(ChannelContext.Item.USER_ID, userIdHash != null ? userIdHash : "");
                StrCalendarParametersInternalAction.InitUxfProperties initUxfProperties = new StrCalendarParametersInternalAction.InitUxfProperties(fVar);
                this.f286878r = null;
                this.f286877q = 2;
                if (interfaceC43172j.emit(initUxfProperties, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<PretendResult> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43210w f286881b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ParametersTree f286882c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f286883d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f286884b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParametersTree f286885c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f286886d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$validateAndSubmitParameters$$inlined$map$1$2", f = "StrCalendarParametersInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.domain.b$c$a$a, reason: collision with other inner class name */
            public static final class C8603a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286887q;

                /* renamed from: r, reason: collision with root package name */
                public int f286888r;

                public C8603a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286887q = obj;
                    this.f286888r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, ParametersTree parametersTree, b bVar) {
                this.f286884b = interfaceC43172j;
                this.f286885c = parametersTree;
                this.f286886d = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.avito.android.str_calendar.seller.calandar_parameters.domain.b.c.a.C8603a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.b$c$a$a r0 = (com.avito.android.str_calendar.seller.calandar_parameters.domain.b.c.a.C8603a) r0
                    int r1 = r0.f286888r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f286888r = r1
                    goto L18
                L13:
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.b$c$a$a r0 = new com.avito.android.str_calendar.seller.calandar_parameters.domain.b$c$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f286887q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f286888r
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C42729a0.b(r10)
                    goto Lb5
                L2a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L32:
                    kotlin.C42729a0.b(r10)
                    com.avito.android.remote.model.PretendResult r9 = (com.avito.android.remote.model.PretendResult) r9
                    com.avito.android.remote.model.category_parameters.ParametersTree r10 = r8.f286885c
                    java.lang.Class<com.avito.android.remote.model.category_parameters.ChildrenAgesGroup> r2 = com.avito.android.remote.model.category_parameters.ChildrenAgesGroup.class
                    com.avito.android.remote.model.category_parameters.base.ParameterSlot r2 = r10.getFirstParameterOfType(r2)
                    com.avito.android.remote.model.category_parameters.ChildrenAgesGroup r2 = (com.avito.android.remote.model.category_parameters.ChildrenAgesGroup) r2
                    r4 = 0
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.b r5 = r8.f286886d
                    if (r2 == 0) goto L4d
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.children.j r6 = r5.f286874g
                    com.avito.android.remote.model.PretendResult r2 = r6.a(r2)
                    goto L4e
                L4d:
                    r2 = r4
                L4e:
                    java.lang.Class<com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter> r6 = com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter.class
                    com.avito.android.remote.model.category_parameters.base.ParameterSlot r6 = r10.getFirstParameterOfType(r6)
                    com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter r6 = (com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter) r6
                    if (r6 == 0) goto L5f
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a r7 = r5.f286875h
                    com.avito.android.remote.model.PretendResult r6 = r7.a(r6)
                    goto L60
                L5f:
                    r6 = r4
                L60:
                    java.lang.Class<com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter> r7 = com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter.class
                    com.avito.android.remote.model.category_parameters.base.ParameterSlot r10 = r10.getFirstParameterOfType(r7)
                    com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter r10 = (com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter) r10
                    if (r10 == 0) goto L70
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a r4 = r5.f286875h
                    com.avito.android.remote.model.PretendResult r4 = r4.b(r10)
                L70:
                    com.avito.android.remote.model.PretendResult[] r10 = new com.avito.android.remote.model.PretendResult[]{r2, r6, r4}
                    java.util.ArrayList r10 = kotlin.collections.C42756l.B(r10)
                    java.util.Iterator r10 = r10.iterator()
                L7c:
                    boolean r2 = r10.hasNext()
                    if (r2 == 0) goto Laa
                    java.lang.Object r2 = r10.next()
                    com.avito.android.remote.model.PretendResult r2 = (com.avito.android.remote.model.PretendResult) r2
                    com.avito.android.remote.model.PretendResult r4 = new com.avito.android.remote.model.PretendResult
                    boolean r5 = r9.getSuccess()
                    if (r5 == 0) goto L98
                    boolean r5 = r2.getSuccess()
                    if (r5 == 0) goto L98
                    r5 = r3
                    goto L99
                L98:
                    r5 = 0
                L99:
                    java.util.Map r9 = r9.getErrors()
                    java.util.Map r2 = r2.getErrors()
                    java.util.LinkedHashMap r9 = kotlin.collections.P0.k(r9, r2)
                    r4.<init>(r5, r9)
                    r9 = r4
                    goto L7c
                Laa:
                    r0.f286888r = r3
                    kotlinx.coroutines.flow.j r10 = r8.f286884b
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto Lb5
                    return r1
                Lb5:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.domain.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(C43210w c43210w, ParametersTree parametersTree, b bVar) {
            this.f286881b = c43210w;
            this.f286882c = parametersTree;
            this.f286883d = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super PretendResult> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f286881b.collect(new a(interfaceC43172j, this.f286882c, this.f286883d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Map<String, ? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f286890b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f286891b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$validateAndSubmitParameters$$inlined$map$2$2", f = "StrCalendarParametersInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.domain.b$d$a$a, reason: collision with other inner class name */
            public static final class C8604a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286892q;

                /* renamed from: r, reason: collision with root package name */
                public int f286893r;

                public C8604a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286892q = obj;
                    this.f286893r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f286891b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.str_calendar.seller.calandar_parameters.domain.b.d.a.C8604a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.b$d$a$a r0 = (com.avito.android.str_calendar.seller.calandar_parameters.domain.b.d.a.C8604a) r0
                    int r1 = r0.f286893r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f286893r = r1
                    goto L18
                L13:
                    com.avito.android.str_calendar.seller.calandar_parameters.domain.b$d$a$a r0 = new com.avito.android.str_calendar.seller.calandar_parameters.domain.b$d$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f286892q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f286893r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L7a
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.remote.model.PretendResult r6 = (com.avito.android.remote.model.PretendResult) r6
                    java.util.Map r6 = r6.getErrors()
                    java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                    int r2 = r6.size()
                    int r2 = kotlin.collections.P0.f(r2)
                    r7.<init>(r2)
                    java.util.Set r6 = r6.entrySet()
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.Iterator r6 = r6.iterator()
                L51:
                    boolean r2 = r6.hasNext()
                    if (r2 == 0) goto L6f
                    java.lang.Object r2 = r6.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    java.lang.Object r4 = r2.getKey()
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.remote.model.PretendErrorValue r2 = (com.avito.android.remote.model.PretendErrorValue) r2
                    java.lang.String r2 = r2.getSingleMessage()
                    r7.put(r4, r2)
                    goto L51
                L6f:
                    r0.f286893r = r3
                    kotlinx.coroutines.flow.j r6 = r5.f286891b
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L7a
                    return r1
                L7a:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.domain.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(c cVar) {
            this.f286890b = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Map<String, ? extends String>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f286890b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$validateAndSubmitParameters$$inlined$transform$1", f = "StrCalendarParametersInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f286895A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ SK0.f f286896B;

        /* renamed from: q, reason: collision with root package name */
        public int f286897q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286898r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f286899s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f286900t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ParametersTree f286901u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f286902v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Date f286903w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Date f286904x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Boolean f286905y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f286906z;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<StrCalendarParametersInternalAction> f286907b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f286908c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ParametersTree f286909d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f286910e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Date f286911f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Date f286912g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Boolean f286913h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ boolean f286914i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f286915j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ SK0.f f286916k;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$validateAndSubmitParameters$$inlined$transform$1$1", f = "StrCalendarParametersInteractor.kt", i = {0, 0, 0}, l = {219, 222}, m = "emit", n = {"this", "errorsMap", "$this$validateAndSubmitParameters_u24lambda_u248"}, s = {"L$0", "L$1", "L$2"})
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.domain.b$e$a$a, reason: collision with other inner class name */
            public static final class C8605a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286917q;

                /* renamed from: r, reason: collision with root package name */
                public int f286918r;

                /* renamed from: t, reason: collision with root package name */
                public a f286920t;

                /* renamed from: u, reason: collision with root package name */
                public Map f286921u;

                /* renamed from: v, reason: collision with root package name */
                public InterfaceC43172j f286922v;

                public C8605a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286917q = obj;
                    this.f286918r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, b bVar, ParametersTree parametersTree, String str, Date date, Date date2, Boolean bool, boolean z12, boolean z13, SK0.f fVar) {
                this.f286908c = bVar;
                this.f286909d = parametersTree;
                this.f286910e = str;
                this.f286911f = date;
                this.f286912g = date2;
                this.f286913h = bool;
                this.f286914i = z12;
                this.f286915j = z13;
                this.f286916k = fVar;
                this.f286907b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r23, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r24) {
                /*
                    Method dump skipped, instructions count: 264
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.domain.b.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC43160i interfaceC43160i, Continuation continuation, b bVar, ParametersTree parametersTree, String str, Date date, Date date2, Boolean bool, boolean z12, boolean z13, SK0.f fVar) {
            super(2, continuation);
            this.f286899s = interfaceC43160i;
            this.f286900t = bVar;
            this.f286901u = parametersTree;
            this.f286902v = str;
            this.f286903w = date;
            this.f286904x = date2;
            this.f286905y = bool;
            this.f286906z = z12;
            this.f286895A = z13;
            this.f286896B = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f286899s, continuation, this.f286900t, this.f286901u, this.f286902v, this.f286903w, this.f286904x, this.f286905y, this.f286906z, this.f286895A, this.f286896B);
            eVar.f286898r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286897q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f286898r, this.f286900t, this.f286901u, this.f286902v, this.f286903w, this.f286904x, this.f286905y, this.f286906z, this.f286895A, this.f286896B);
                this.f286897q = 1;
                if (this.f286899s.collect(aVar, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k d1 d1Var, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC36020m interfaceC36020m, @Y61.k R0 r02, @Y61.k t tVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.mvi.k kVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.children.j jVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a aVar, @Y61.k Cy0.b bVar) {
        this.f286868a = d1Var;
        this.f286869b = fVar;
        this.f286870c = interfaceC36020m;
        this.f286871d = r02;
        this.f286872e = tVar;
        this.f286873f = kVar;
        this.f286874g = jVar;
        this.f286875h = aVar;
        this.f286876i = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.str_calendar.seller.calandar_parameters.domain.b r9, kotlinx.coroutines.flow.InterfaceC43172j r10, com.avito.android.util.P2.a r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.domain.b.a(com.avito.android.str_calendar.seller.calandar_parameters.domain.b, kotlinx.coroutines.flow.j, com.avito.android.util.P2$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.str_calendar.seller.calandar_parameters.domain.b r18, kotlinx.coroutines.flow.InterfaceC43172j r19, java.lang.String r20, java.util.Date r21, java.util.Date r22, boolean r23, boolean r24, boolean r25, SK0.f r26, com.avito.android.remote.model.StrSellerCalendarParametersWarningDialog r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.domain.b.b(com.avito.android.str_calendar.seller.calandar_parameters.domain.b, kotlinx.coroutines.flow.j, java.lang.String, java.util.Date, java.util.Date, boolean, boolean, boolean, SK0.f, com.avito.android.remote.model.StrSellerCalendarParametersWarningDialog, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final C43152f0 c(@Y61.k String str, @Y61.l Date date, @Y61.l Date date2) {
        return new C43152f0(new g(C43175k.n(new C43137a0(new i(2, null), C43175k.I(this.f286871d.a(), new f(C43175k.G(new h(date, date2, this, str, null))))), 150L)), new j(this, null));
    }

    @Y61.k
    public final InterfaceC43160i<StrCalendarParametersInternalAction> d(@Y61.k String str) {
        return C43175k.G(new C8602b(str, null));
    }

    @Y61.k
    public final InterfaceC43160i<StrCalendarParametersInternalAction> e(@Y61.l ParametersTree parametersTree, @Y61.k String str, @Y61.l Date date, @Y61.l Date date2, @Y61.l Boolean bool, boolean z12, boolean z13, @Y61.l SK0.f fVar) {
        if (parametersTree == null) {
            return C43175k.w();
        }
        return new C43152f0(C43175k.G(new e(C43175k.I(this.f286871d.c(), new d(new c(new C43210w(this.f286870c.a(parametersTree)), parametersTree, this))), null, this, parametersTree, str, date, date2, bool, z12, z13, fVar)), new com.avito.android.str_calendar.seller.calandar_parameters.domain.c(this, null));
    }
}
