package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Fy0.InterfaceC13856a;
import Gy0.InterfaceC13931a;
import Gy0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.category_parameters.CheckinCheckoutParameter;
import com.avito.android.remote.model.category_parameters.ChildrenAgesGroup;
import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsSelect;
import com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.str_calendar.seller.calandar_parameters.C35095f;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LGy0/a;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "LGy0/e;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13931a, StrCalendarParametersInternalAction, Gy0.e> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f287307d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.b f287308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Cy0.b f287309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C35095f f287310c;

    /* compiled from: StrCalendarParametersActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a;", "", "<init>", "()V", "", "DEFAULT_DEBOUNCE_MILLIS", "J", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.mvi.a$a, reason: collision with other inner class name */
    public static final class C8627a {

        /* compiled from: StrCalendarParametersActor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a;", "", "a", "b", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a$a;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.mvi.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC8628a {

            /* compiled from: StrCalendarParametersActor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a$a;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C8629a implements InterfaceC8628a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C8629a f287311a = new C8629a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C8629a);
                }

                public final int hashCode() {
                    return -1551487267;
                }

                @Y61.k
                public final String toString() {
                    return "Debounce";
                }
            }

            /* compiled from: StrCalendarParametersActor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a$b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.mvi.a$a$a$b */
            public static final /* data */ class b implements InterfaceC8628a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f287312a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -462413011;
                }

                @Y61.k
                public final String toString() {
                    return "Default";
                }
            }
        }

        public /* synthetic */ C8627a(C42822w c42822w) {
            this();
        }

        public C8627a() {
        }
    }

    /* compiled from: StrCalendarParametersActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ParameterElement.VariableLengthParameter.Companion.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParameterElement.VariableLengthParameter.Companion.Type type = ParameterElement.VariableLengthParameter.Companion.Type.f117374b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: StrCalendarParametersActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$process$3", f = "StrCalendarParametersActor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287313q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f287314r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13931a f287315s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13931a interfaceC13931a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f287315s = interfaceC13931a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f287315s, continuation);
            cVar.f287314r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287313q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287314r;
                InterfaceC13931a.e eVar = (InterfaceC13931a.e) this.f287315s;
                SelectParameter.Displaying displaying = eVar.f6813a.f117223s;
                String scrollToValue = displaying != null ? displaying.getScrollToValue() : null;
                Iterator<JO.m> it = eVar.f6813a.f117236E.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (L.f(it.next().f8961b, scrollToValue)) {
                        break;
                    }
                    i13++;
                }
                Integer numBoxInt = Boxing.boxInt(i13);
                StrCalendarParametersInternalAction.OpenBottomPicker openBottomPicker = new StrCalendarParametersInternalAction.OpenBottomPicker(eVar.f6813a, numBoxInt.intValue() >= 0 ? numBoxInt : null, eVar.f6814b);
                this.f287313q = 1;
                if (interfaceC43172j.emit(openBottomPicker, this) == coroutine_suspended) {
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

    /* compiled from: StrCalendarParametersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$process$4", f = "StrCalendarParametersActor.kt", i = {0, 0}, l = {100, UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {"$this$flow", "advertId"}, s = {"L$0", "L$1"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f287316q;

        /* renamed from: r, reason: collision with root package name */
        public int f287317r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f287318s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Gy0.e f287319t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f287320u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Gy0.e eVar, a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f287319t = eVar;
            this.f287320u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f287319t, this.f287320u, continuation);
            dVar.f287318s = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287317r;
            Gy0.e eVar = this.f287319t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f287318s;
                str = eVar.f6885l;
                if (str == null) {
                    return G0.f406611a;
                }
                StrCalendarParametersInternalAction.WarningAcceptedChange warningAcceptedChange = new StrCalendarParametersInternalAction.WarningAcceptedChange(false);
                this.f287318s = interfaceC43172j2;
                this.f287316q = str;
                this.f287317r = 1;
                if (interfaceC43172j2.emit(warningAcceptedChange, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                str = this.f287316q;
                interfaceC43172j = (InterfaceC43172j) this.f287318s;
                C42729a0.b(obj);
            }
            C43152f0 c43152f0C = this.f287320u.f287308a.c(str, eVar.f6886m, eVar.f6887n);
            this.f287318s = null;
            this.f287316q = null;
            this.f287317r = 2;
            if (C43175k.u(this, c43152f0C, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrCalendarParametersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$process$5", f = "StrCalendarParametersActor.kt", i = {0}, l = {161, 170}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287321q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f287322r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13931a f287323s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Gy0.e f287324t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f287325u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13931a interfaceC13931a, Gy0.e eVar, a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f287323s = interfaceC13931a;
            this.f287324t = eVar;
            this.f287325u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f287323s, this.f287324t, this.f287325u, continuation);
            eVar.f287322r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287321q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f287322r;
                ((InterfaceC13931a.x) this.f287323s).getClass();
                StrCalendarParametersInternalAction.ChangeRefundSelectedValue changeRefundSelectedValue = new StrCalendarParametersInternalAction.ChangeRefundSelectedValue(String.valueOf(0));
                this.f287322r = interfaceC43172j;
                this.f287321q = 1;
                if (interfaceC43172j.emit(changeRefundSelectedValue, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f287322r;
                C42729a0.b(obj);
            }
            Gy0.e eVar = this.f287324t;
            String str = eVar.f6885l;
            if (str == null) {
                return G0.f406611a;
            }
            InterfaceC43160i<StrCalendarParametersInternalAction> interfaceC43160iE = this.f287325u.f287308a.e(eVar.f6876c, str, eVar.f6886m, eVar.f6887n, Boxing.boxBoolean(false), true, false, eVar.f6892s);
            this.f287322r = null;
            this.f287321q = 2;
            if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new C8627a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.b bVar, @Y61.k Cy0.b bVar2, @Y61.k C35095f c35095f) {
        this.f287308a = bVar;
        this.f287309b = bVar2;
        this.f287310c = c35095f;
    }

    public static Map c(ParameterSlot parameterSlot) {
        List<ParameterSlot> parameters;
        if (parameterSlot instanceof GroupParameter) {
            parameters = ((GroupParameter) parameterSlot).getParameters();
            if (parameters == null) {
                parameters = C42784z0.f406748b;
            }
        } else if (parameterSlot instanceof CheckinCheckoutParameter) {
            parameters = ((CheckinCheckoutParameter) parameterSlot).getParameters();
        } else if (parameterSlot instanceof StrDurationDiscountsParameter) {
            parameters = ((StrDurationDiscountsParameter) parameterSlot).getDiscountSelectParameters();
        } else if (parameterSlot instanceof StrDurationDiscountsSelect) {
            parameters = ((StrDurationDiscountsSelect) parameterSlot).getParameters();
            if (parameters == null) {
                parameters = C42784z0.f406748b;
            }
        } else if (parameterSlot instanceof StrEarlyBookingDiscountParameter) {
            parameters = ((StrEarlyBookingDiscountParameter) parameterSlot).getParameters();
            if (parameters == null) {
                parameters = C42784z0.f406748b;
            }
        } else if (parameterSlot instanceof ChildrenAgesGroup) {
            parameters = ((ChildrenAgesGroup) parameterSlot).getChildrenAgesParameters();
        } else {
            if (!(parameterSlot instanceof ChildrenAgesParameter)) {
                return P0.c();
            }
            parameters = ((ChildrenAgesParameter) parameterSlot).getParameters();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ParameterSlot> list = parameters;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((ParameterSlot) it.next()).getId(), parameterSlot.getId());
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashMap.putAll(c((ParameterSlot) it2.next()));
        }
        return linkedHashMap;
    }

    public static Integer d(String str, Gy0.e eVar) {
        Gy0.c cVar = eVar.f6894u;
        c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
        List list = bVar != null ? bVar.f6847d : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            if (aVar instanceof ParameterElement.o ? L.f(((ParameterElement.o) aVar).getF173935j(), str) : C43066x.h0(aVar.getF250470b(), str, false)) {
                break;
            }
            i12++;
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 >= 0) {
            return numValueOf;
        }
        return null;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new f(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.str_calendar.seller.calandar_parameters.mvi.e.f287341l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<StrCalendarParametersInternalAction> b(@Y61.k InterfaceC13931a interfaceC13931a, @Y61.k Gy0.e eVar) {
        InterfaceC43160i<StrCalendarParametersInternalAction> c43210w;
        Object next;
        if (interfaceC13931a instanceof InterfaceC13931a.r) {
            return new C43210w(new StrCalendarParametersInternalAction.OpenKeyboard(((InterfaceC13931a.r) interfaceC13931a).f6828a));
        }
        if (interfaceC13931a instanceof InterfaceC13931a.f) {
            return new C43210w(new StrCalendarParametersInternalAction.OpenDeeplink(((InterfaceC13931a.f) interfaceC13931a).f6815a));
        }
        if (interfaceC13931a instanceof InterfaceC13931a.n) {
            return new C43210w(new StrCalendarParametersInternalAction.OpenDeeplink(((InterfaceC13931a.n) interfaceC13931a).f6824a));
        }
        if (interfaceC13931a instanceof InterfaceC13931a.q) {
            return new C43210w(new StrCalendarParametersInternalAction.OpenDeeplink(((InterfaceC13931a.q) interfaceC13931a).f6827a));
        }
        if (interfaceC13931a instanceof InterfaceC13931a.k) {
            c43210w = new C43210w(StrCalendarParametersInternalAction.CloseBottomPicker.f287349b);
        } else {
            if (interfaceC13931a instanceof InterfaceC13931a.y) {
                return new C43210w(new StrCalendarParametersInternalAction.ToggleSwitcher(((InterfaceC13931a.y) interfaceC13931a).f6836a));
            }
            if (interfaceC13931a instanceof InterfaceC13931a.j) {
                return new C43210w(new StrCalendarParametersInternalAction.OpenDeeplink(((InterfaceC13931a.j) interfaceC13931a).f6820a));
            }
            if (interfaceC13931a instanceof InterfaceC13931a.s) {
                return new C43210w(new StrCalendarParametersInternalAction.OpenDeeplink(((InterfaceC13931a.s) interfaceC13931a).f6829a));
            }
            if (interfaceC13931a instanceof InterfaceC13931a.A) {
                return new C43210w(new StrCalendarParametersInternalAction.OpenUrl(((InterfaceC13931a.A) interfaceC13931a).f6806a));
            }
            if (interfaceC13931a instanceof InterfaceC13931a.d) {
                return new C43210w(new StrCalendarParametersInternalAction.UpdateRefundGroupTitle(((InterfaceC13931a.d) interfaceC13931a).f6812a));
            }
            Object obj = null;
            if (interfaceC13931a instanceof InterfaceC13931a.B) {
                return C43175k.G(new com.avito.android.str_calendar.seller.calandar_parameters.mvi.c(eVar, this, null));
            }
            if (interfaceC13931a instanceof InterfaceC13931a.C) {
                return C43175k.G(new com.avito.android.str_calendar.seller.calandar_parameters.mvi.d((InterfaceC13931a.C) interfaceC13931a, eVar, this, null));
            }
            if (interfaceC13931a instanceof InterfaceC13931a.l) {
                return C43175k.G(new com.avito.android.str_calendar.seller.calandar_parameters.mvi.b(eVar, (InterfaceC13931a.l) interfaceC13931a, this, null));
            }
            boolean z12 = interfaceC13931a instanceof InterfaceC13931a.m;
            String str = eVar.f6885l;
            if (z12) {
                if (!L.f(((InterfaceC13931a.m) interfaceC13931a).f6823a, "refundDaysPopup")) {
                    return C43175k.w();
                }
                if (str == null || eVar.f6891r) {
                    return C43175k.w();
                }
                this.f287309b.d(str);
                c43210w = new C43210w(StrCalendarParametersInternalAction.CancellationSettingsItemShowTracked.f287345b);
            } else {
                if (interfaceC13931a instanceof InterfaceC13931a.v) {
                    if (!eVar.f6889p) {
                        return C43175k.w();
                    }
                    Set<String> setKeySet = eVar.f6878e.keySet();
                    if (setKeySet.isEmpty()) {
                        setKeySet = null;
                    }
                    if (setKeySet == null) {
                        return C43175k.w();
                    }
                    List<ParameterSlot> list = eVar.f6877d;
                    Map mapC = P0.c();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        mapC = P0.k(mapC, c((ParameterSlot) it.next()));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : setKeySet) {
                        int i12 = 0;
                        String str3 = null;
                        while (str2 != null && i12 <= 10) {
                            i12++;
                            str2 = (String) mapC.get(str2);
                            if (str2 != null) {
                                str3 = str2;
                            }
                        }
                        if (str3 != null) {
                            arrayList.add(str3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        return C43175k.w();
                    }
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ParameterSlot) it2.next()).getId());
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (arrayList.contains((String) next)) {
                            break;
                        }
                    }
                    String str4 = (String) next;
                    if (str4 != null && str4.length() != 0) {
                        obj = next;
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        return C43175k.w();
                    }
                    Integer numD = d(str5, eVar);
                    return numD != null ? new C43210w(new StrCalendarParametersInternalAction.ScrollToPosition(numD.intValue())) : C43175k.w();
                }
                if (interfaceC13931a instanceof InterfaceC13931a.e) {
                    return C43175k.G(new c(interfaceC13931a, null));
                }
                if (interfaceC13931a instanceof InterfaceC13931a.C13933c) {
                    InterfaceC13856a.f6106a.getClass();
                    return new C43210w(new StrCalendarParametersInternalAction.CloseScreen(InterfaceC13856a.b.f6108b, null, false, false));
                }
                if (interfaceC13931a instanceof InterfaceC13931a.w) {
                    return C43175k.G(new d(eVar, this, null));
                }
                if (interfaceC13931a instanceof InterfaceC13931a.C13932b) {
                    return str == null ? C43175k.w() : this.f287308a.e(eVar.f6876c, str, eVar.f6886m, eVar.f6887n, Boolean.valueOf(eVar.f6884k), false, eVar.f6890q, eVar.f6892s);
                }
                if (interfaceC13931a instanceof InterfaceC13931a.g) {
                    c43210w = new C43207v(new StrCalendarParametersInternalAction[]{new StrCalendarParametersInternalAction.SelectCheckmark(((InterfaceC13931a.g) interfaceC13931a).f6816a), StrCalendarParametersInternalAction.CloseBottomPicker.f287349b});
                } else {
                    if (interfaceC13931a instanceof InterfaceC13931a.i) {
                        InterfaceC13931a.i iVar = (InterfaceC13931a.i) interfaceC13931a;
                        return new C43210w(new StrCalendarParametersInternalAction.SelectChips(iVar.f6819b.f117181b, iVar.f6818a.f8961b));
                    }
                    if (interfaceC13931a instanceof InterfaceC13931a.t) {
                        InterfaceC13931a.t tVar = (InterfaceC13931a.t) interfaceC13931a;
                        return new C43210w(new StrCalendarParametersInternalAction.SelectRadioGroup(tVar.f6831b.f117181b, tVar.f6830a.f8961b));
                    }
                    if (interfaceC13931a instanceof InterfaceC13931a.u) {
                        InterfaceC13931a.u uVar = (InterfaceC13931a.u) interfaceC13931a;
                        String str6 = uVar.f6833b;
                        if (str6 == null) {
                            str6 = "";
                        }
                        return new C43210w(new StrCalendarParametersInternalAction.ChangeRdsInput(uVar.f6832a, str6));
                    }
                    if (interfaceC13931a instanceof InterfaceC13931a.x) {
                        return C43175k.G(new e(interfaceC13931a, eVar, this, null));
                    }
                    if (!(interfaceC13931a instanceof InterfaceC13931a.C0386a)) {
                        if (interfaceC13931a instanceof InterfaceC13931a.h) {
                            return new C43210w(new StrCalendarParametersInternalAction.RemoveChildrenAgeParameter(((InterfaceC13931a.h) interfaceC13931a).f6817a));
                        }
                        if (interfaceC13931a instanceof InterfaceC13931a.o) {
                            return new C43210w(new StrCalendarParametersInternalAction.RemoveDurationDiscountSelect(((InterfaceC13931a.o) interfaceC13931a).f6825a));
                        }
                        if (interfaceC13931a instanceof InterfaceC13931a.p) {
                            return new C43210w(new StrCalendarParametersInternalAction.EarlyBookingEnabledChange(((InterfaceC13931a.p) interfaceC13931a).f6826a));
                        }
                        if (!(interfaceC13931a instanceof InterfaceC13931a.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC13931a.z zVar = (InterfaceC13931a.z) interfaceC13931a;
                        return C43175k.G(new g(eVar, zVar.f6837a, this, zVar.f6838b, null));
                    }
                    int iOrdinal = ((InterfaceC13931a.C0386a) interfaceC13931a).f6809a.ordinal();
                    if (iOrdinal == 0) {
                        c43210w = new C43210w(StrCalendarParametersInternalAction.AddChildrenAgeParameter.f287342b);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c43210w = new C43210w(StrCalendarParametersInternalAction.AddDurationDiscountSelect.f287343b);
                    }
                }
            }
        }
        return c43210w;
    }
}
