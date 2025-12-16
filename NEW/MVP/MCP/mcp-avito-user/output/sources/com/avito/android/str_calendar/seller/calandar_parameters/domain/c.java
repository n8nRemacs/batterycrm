package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$catchWithToast$1", f = "StrCalendarParametersInteractor.kt", i = {0}, l = {245, 251}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286923q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f286924r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f286925s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f286926t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Continuation<? super c> continuation) {
        super(3, continuation);
        this.f286926t = bVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        c cVar = new c(this.f286926t, continuation);
        cVar.f286924r = interfaceC43172j;
        cVar.f286925s = th2;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286923q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f286924r;
            Throwable th2 = this.f286925s;
            V2.f318762a.f(th2);
            b bVar = this.f286926t;
            PrintableText f287466a = bVar.f286872e.getF287466a();
            f.c.a aVar = f.c.f125255c;
            ApiError apiErrorA = bVar.f286869b.a(th2);
            aVar.getClass();
            StrCalendarParametersInternalAction.ShowToast showToast = new StrCalendarParametersInternalAction.ShowToast(f287466a, f.c.a.a(apiErrorA, th2));
            this.f286924r = interfaceC43172j;
            this.f286923q = 1;
            if (interfaceC43172j.emit(showToast, this) == coroutine_suspended) {
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
            interfaceC43172j = this.f286924r;
            C42729a0.b(obj);
        }
        StrCalendarParametersInternalAction.ShowContent showContent = StrCalendarParametersInternalAction.ShowContent.f287380b;
        this.f286924r = null;
        this.f286923q = 2;
        if (interfaceC43172j.emit(showContent, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
