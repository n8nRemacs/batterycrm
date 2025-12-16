package com.avito.android.das_date_picker.mvi;

import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DasCalendarBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.b<DasCalendarInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DasCalendarInitParameters f132366a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f132367b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f132368c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f132369d;

    /* compiled from: DasCalendarBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarBootstrap$produce$1", f = "DasCalendarBootstrap.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 35}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DasCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f132370q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f132371r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f132371r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DasCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f132370q;
            e eVar = e.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f132371r;
                if (eVar.f132369d) {
                    return G0.f406611a;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(eVar.f132368c.now());
                DasCalendarInternalAction.Init init = new DasCalendarInternalAction.Init(eVar.f132366a, calendar.getTime());
                this.f132371r = interfaceC43172j;
                this.f132370q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    eVar.f132369d = true;
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f132371r;
                C42729a0.b(obj);
            }
            n nVar = eVar.f132367b;
            DasCalendarInitParameters dasCalendarInitParameters = eVar.f132366a;
            InterfaceC43160i<DasCalendarInternalAction> interfaceC43160iA = nVar.a(dasCalendarInitParameters.f132350b, dasCalendarInitParameters.f132351c, dasCalendarInitParameters.f132352d);
            this.f132371r = null;
            this.f132370q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar.f132369d = true;
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k DasCalendarInitParameters dasCalendarInitParameters, @Y61.k n nVar, @Y61.k com.avito.android.server_time.f fVar) {
        this.f132366a = dasCalendarInitParameters;
        this.f132367b = nVar;
        this.f132368c = fVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DasCalendarInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
