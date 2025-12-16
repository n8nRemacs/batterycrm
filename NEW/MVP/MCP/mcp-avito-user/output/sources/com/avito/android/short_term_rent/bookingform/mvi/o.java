package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.interactor.m;
import com.facebook.imageutils.JfifUtil;
import cw0.C39425b;
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

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleSendForm$1", f = "BookingFormActor.kt", i = {0}, l = {224, JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281984q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34968a f281986s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39425b f281987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C34968a c34968a, C39425b c39425b, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f281986s = c34968a;
        this.f281987t = c39425b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f281986s, this.f281987t, continuation);
        oVar.f281985r = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281984q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f281985r;
            BookingFormInternalAction.HideKeyboard hideKeyboard = BookingFormInternalAction.HideKeyboard.f281801b;
            this.f281985r = interfaceC43172j;
            this.f281984q = 1;
            if (interfaceC43172j.emit(hideKeyboard, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f281985r;
            C42729a0.b(obj);
        }
        C34968a c34968a = this.f281986s;
        com.avito.android.short_term_rent.bookingform.mvi.interactor.r rVar = c34968a.f281764c;
        C24186b c24186bA = this.f281987t.f393066b;
        if (c24186bA == null) {
            com.avito.android.short_term_rent.bookingform.mvi.interactor.m.f281918e.getClass();
            c24186bA = m.a.a(c34968a.f281762a);
        }
        InterfaceC43160i<BookingFormInternalAction> interfaceC43160iA = rVar.a(c24186bA);
        this.f281985r = null;
        this.f281984q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
