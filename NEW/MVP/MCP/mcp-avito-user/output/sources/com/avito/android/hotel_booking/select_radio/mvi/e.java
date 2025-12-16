package com.avito.android.hotel_booking.select_radio.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.hotel_booking.select_radio.SelectRadioOpenParams;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
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
import kotlinx.coroutines.flow.X;

/* compiled from: SelectRadioBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.b<SelectRadioInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectRadioOpenParams f164029a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f164030b;

    /* compiled from: SelectRadioBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.select_radio.mvi.SelectRadioBootstrap$produce$1", f = "SelectRadioBootstrap.kt", i = {0}, l = {20, 22}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectRadioInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164031q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f164032r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f164032r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectRadioInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164031q;
            e eVar = e.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f164032r;
                if (eVar.f164030b) {
                    return G0.f406611a;
                }
                SelectRadioInternalAction.Init init = new SelectRadioInternalAction.Init(eVar.f164029a.f163994c);
                this.f164032r = interfaceC43172j;
                this.f164031q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f164032r;
                C42729a0.b(obj);
            }
            SelectRadioInternalAction.Content content = new SelectRadioInternalAction.Content(eVar.f164029a.f163995d);
            this.f164032r = null;
            this.f164031q = 2;
            if (interfaceC43172j.emit(content, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectRadioBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.select_radio.mvi.SelectRadioBootstrap$produce$2", f = "SelectRadioBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super SelectRadioInternalAction>, Throwable, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SelectRadioInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return e.this.new b(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f164030b = true;
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k SelectRadioOpenParams selectRadioOpenParams) {
        this.f164029a = selectRadioOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectRadioInternalAction> a() {
        return new X(C43175k.G(new a(null)), new b(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
